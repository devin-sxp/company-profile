package com.devin.company_profile.dao.base.impl;

import com.devin.company_profile.dao.base.IBaseDao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Devin on 2017/9/26.
 */
public abstract class BaseDaoImpl<T>  implements IBaseDao<T> {
    public HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    private Class entityClass; //实体bean的class形式
    private String identifierPropertyName; //持久化类的 标示符的名称

    /**
     * 该init方法是由spring容器来调用的
     * postConstruct表示在调用构造方法之后调用该方法
     */
    @PostConstruct
    public void init(){
        /**
		 * 获取到实体bean的标示符的属性的名称
		 */
        this.identifierPropertyName = this.hibernateTemplate.getSessionFactory().getClassMetadata(entityClass).getIdentifierPropertyName();

    }

    public BaseDaoImpl(){
        //this代表具体的类的对象
        //this.getClass().getGenericSuperclass() = BaseDaoImpl<T>
        /**
         * 如果该类被实例化，则this代表BaseDaoImpl的对象
         *    this.getClass就是该对象的字节码的形式
         *    this.getClass().getGenericSuperclass()代表该对象的父类即Object
         *       所以这行代码得出的是一个Class而不是一个ParameterizedType
         */
        ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
        //得到参数的部分
        this.entityClass = (Class)type.getActualTypeArguments()[0];
        System.out.println(type.getRawType());//rawType=BaseDaoImpl
    }

    @Override
    public void saveEntry(T t) {
        this.hibernateTemplate.save(t);
    }

    @Override
    public void deleteEntry(Serializable id) {
        T t = (T)this.hibernateTemplate.get(this.entityClass, id);
        this.hibernateTemplate.delete(t);
    }

    @Override
    public void updateEntry(T t) {
        this.hibernateTemplate.update(t);
    }

    @Override
    public Collection<T> queryEntry() {
        return (Collection<T>) this.hibernateTemplate.find("from " + this.entityClass.getName());
    }

    /**
     * 根据条件查询1
     * @return
     */
    @Override
    public Collection<T> queryEntryByCondition(Map<String, Object> mapCondition,final String limit,final String offset) {
        final StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("from "+this.entityClass.getName());
        Set<String> set = mapCondition.keySet();
        boolean isStart = false;
        int i = 0;
        for (String key:set){
            i++;
            if(isStart == false){
                stringBuffer.append(" where ");
                isStart = true;
            }
            if(i == set.size()){
                stringBuffer.append(key+mapCondition.get(key));
            }else{
                stringBuffer.append(key+mapCondition.get(key) +" and ");
            }
        }
        stringBuffer.append(" order by create_time desc ");
        if(limit != null && limit != "" && offset != null && offset != "") {
            Collection<T> collections = (Collection<T>) this.hibernateTemplate.execute(new HibernateCallback<Object>() {
                @Override
                public Object doInHibernate(Session session) throws HibernateException {
                    Collection<T> collection = (Collection<T>) session.createQuery(stringBuffer.toString()).setFirstResult(Integer.parseInt(limit)).setMaxResults(Integer.parseInt(offset)).list();
                    return  collection;
                }
            });
            return collections;
        }else{
            return (Collection<T>) this.hibernateTemplate.find(stringBuffer.toString());
        }

    }

    /**
     * 根据条件查询2
     * @param map
     * @return
     */
    public T queryEntryByProperty(final Map<String, Object> map){
        final StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("from "+this.entityClass.getName());
        stringBuffer.append(" where 1=1");
        for (Map.Entry<String, Object> entry:map.entrySet()) {
            stringBuffer.append(" and "+entry.getKey()+"=:"+entry.getKey());

        }

        return this.hibernateTemplate.execute(new HibernateCallback<T>() {
            @Override
            public T doInHibernate(Session session) throws HibernateException {
                Query query =  session.createQuery(stringBuffer.toString());
                for (Map.Entry<String,Object> entry:map.entrySet()){
                    query.setParameter(entry.getKey(),entry.getValue());
                }
                return (T)query.uniqueResult();
            }
        });
    }

    @Override
    public T getEntryById(Serializable id) {
        return (T)this.hibernateTemplate.get(this.entityClass,id);
    }

    @Override
    public Set<T> getEntrysByIds(Serializable[] ids) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("from " + this.entityClass.getName());
        buffer.append("where " + this.identifierPropertyName + "in (");
        for (int i=0; i<ids.length; i++){
            if(i == ids.length - 1){
                buffer.append(ids[i]);
            }else{
                buffer.append(ids[i]+",");
            }
        }
        buffer.append(")");
        return new HashSet<T>((HashSet<T>)this.hibernateTemplate.find(buffer.toString()));
    }

}
