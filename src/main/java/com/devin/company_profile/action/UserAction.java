package com.devin.company_profile.action;

import com.devin.company_profile.entity.User;
import com.devin.company_profile.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;

import java.util.Collection;

public class UserAction extends ActionSupport{

	private static final String GET_USERS = "getUsers";
	private IUserService userService;
	private String result;

	public void setUserService(IUserService userService) {
		this.userService = userService;
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
		return GET_USERS;
	}


}
