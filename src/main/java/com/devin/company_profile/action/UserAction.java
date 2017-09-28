package com.devin.company_profile.action;

import com.devin.company_profile.entity.User;
import com.devin.company_profile.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

public class UserAction extends ActionSupport implements ServletRequestAware{

	private IUserService userService;
	private HttpServletRequest request;
	private String result;

	public void setUserService(IUserService userService) {
		this.userService = userService;
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

	public String getUsers(){
		Collection<User> users = this.userService.queryEntry();
		JSONArray json = JSONArray.fromObject(users);
		result = json.toString();
		return "getUsers";
	}


}
