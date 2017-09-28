package com.devin.company_profile.dao.base;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by Devin on 2017/9/26.
 */
public interface IBaseDao<T> {
    public void saveEntry(T t);
    public void deleteEntry(Serializable id);
    public void updateEntry(T t);
    public Collection<T> queryEntry();
    public Collection<T> queryEntryByCondition(Map<String,Object> mapCondition,String limit,String offset);
    public T getEntryById(Serializable id);
    public Set<T> getEntrysByIds(Serializable[] ids);

}
