package com.devin.company_profile.action;

import com.devin.company_profile.entity.Contact;
import com.devin.company_profile.service.IContactService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Collection;

public class ContactAction extends ActionSupport {

	//页面常量
	private static final String GET_CONTACTS = "getContacts";

	private IContactService contactService;

	public void setContactService(IContactService contactService) {
		this.contactService = contactService;
	}


	public String getContacts(){
		Collection<Contact> contacts = this.contactService.queryEntry();
		ActionContext.getContext().getValueStack().push(contacts);

		return GET_CONTACTS;
	}


}
