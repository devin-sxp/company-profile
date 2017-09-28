package com.devin.company_profile.service.impl;

import com.devin.company_profile.dao.ISubscribeDao;
import com.devin.company_profile.dao.base.IBaseDao;
import com.devin.company_profile.entity.Subscribe;
import com.devin.company_profile.service.ISubscribeService;
import com.devin.company_profile.service.base.impl.BaseServiceImpl;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by devin on 17-8-3.
 */

@Transactional
public class SubscribeServiceImpl extends BaseServiceImpl<Subscribe> implements ISubscribeService {
    private ISubscribeDao subscribeDao;

    public void setSubscribeDao(ISubscribeDao subscribeDao) {
        this.subscribeDao = subscribeDao;
    }

    @Override
    public IBaseDao<Subscribe> baseDao() {
        return this.subscribeDao;
    }
}
