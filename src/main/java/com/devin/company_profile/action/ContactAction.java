package com.devin.company_profile.action;

import com.devin.company_profile.entity.Contact;
import com.devin.company_profile.service.IContactService;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

public class ContactAction extends ActionSupport implements ServletRequestAware{

	private IContactService contactService;
	private HttpServletRequest request;
	private String result;

	public void setContactService(IContactService contactService) {
		this.contactService = contactService;
	}

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request = httpServletRequest;

	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getContacts(){
		Collection<Contact> works = this.contactService.queryEntry();
		JSONArray json = JSONArray.fromObject(works);
		result = json.toString();
		return "getContacts";
	}


}
