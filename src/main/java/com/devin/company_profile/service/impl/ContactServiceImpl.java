package com.devin.company_profile.service.impl;

import com.devin.company_profile.dao.IContactDao;
import com.devin.company_profile.dao.base.IBaseDao;
import com.devin.company_profile.entity.Contact;
import com.devin.company_profile.service.IContactService;
import com.devin.company_profile.service.base.impl.BaseServiceImpl;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by devin on 17-8-3.
 */

@Transactional
public class ContactServiceImpl extends BaseServiceImpl<Contact> implements IContactService {
    private IContactDao contactDao;

    public void setContactDao(IContactDao contactDao) {
        this.contactDao = contactDao;
    }

    @Override
    public IBaseDao<Contact> baseDao() {
        return this.contactDao;
    }
}
