package com.devin.company_profile.service.impl;

import com.devin.company_profile.dao.IUserDao;
import com.devin.company_profile.dao.base.IBaseDao;
import com.devin.company_profile.entity.User;
import com.devin.company_profile.service.IUserService;
import com.devin.company_profile.service.base.impl.BaseServiceImpl;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by devin on 17-8-3.
 */

@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
    private IUserDao userDao;

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public IBaseDao<User> baseDao() {
        return (IBaseDao<User>) this.userDao;
    }
}
