package com.devin.company_profile.service.base.impl;

import com.devin.company_profile.dao.base.IBaseDao;
import com.devin.company_profile.service.base.IBaseService;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by Devin on 2017/9/26.
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T>{

    public abstract IBaseDao<T> baseDao();

    @Transactional
    public void saveEntry(T t) {
        this.baseDao().saveEntry(t);
    }

    @Transactional
    public void deleteEntry(Serializable id) {
        this.baseDao().deleteEntry(id);
    }

    @Transactional
    public void updateEntry(T t) {
        this.baseDao().updateEntry(t);
    }

    @Transactional(readOnly = true)
    public Collection<T> queryEntry() {
        return this.baseDao().queryEntry();
    }

    @Override
    public Collection<T> queryEntryByCondition(Map<String, Object> mapCondition, String limit, String offset) {
        return this.baseDao().queryEntryByCondition(mapCondition,limit,offset);
    }

    @Transactional(readOnly = true)
    public T getEntryById(Serializable id) {
        return this.baseDao().getEntryById(id);
    }

    @Transactional(readOnly = true)
    public Set<T> getEnrtysByIds(Serializable[] ids) {
        return baseDao().getEntrysByIds(ids);
    }
}
