package com.devin.company_profile.service.impl;

import com.devin.company_profile.dao.IWorkDao;
import com.devin.company_profile.dao.base.IBaseDao;
import com.devin.company_profile.entity.Work;
import com.devin.company_profile.service.IWorkService;
import com.devin.company_profile.service.base.impl.BaseServiceImpl;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by devin on 17-8-3.
 */

@Transactional
public class WorkServiceImpl extends BaseServiceImpl<Work> implements IWorkService {
    private IWorkDao workDao;

    public void setWorkDao(IWorkDao workDao) {
        this.workDao = workDao;
    }

    @Override
    public IBaseDao<Work> baseDao() {
        return (IBaseDao<Work>) this.workDao;
    }
}
