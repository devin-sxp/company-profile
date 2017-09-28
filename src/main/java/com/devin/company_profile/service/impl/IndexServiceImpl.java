package com.devin.company_profile.service.impl;

import com.devin.company_profile.dao.IIndexDao;
import com.devin.company_profile.dao.base.IBaseDao;
import com.devin.company_profile.entity.Index;
import com.devin.company_profile.service.IIndexService;
import com.devin.company_profile.service.base.impl.BaseServiceImpl;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by devin on 17-8-3.
 */

@Transactional
public class IndexServiceImpl extends BaseServiceImpl<Index> implements IIndexService {
    private IIndexDao indexDao;

    public void setIndexDao(IIndexDao indexDao) {
        this.indexDao = indexDao;
    }

    @Override
    public IBaseDao<Index> baseDao() {
        return (IBaseDao<Index>) this.indexDao;
    }
}
