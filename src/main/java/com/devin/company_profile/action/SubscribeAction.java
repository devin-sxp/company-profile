package com.devin.company_profile.action;

import com.devin.company_profile.entity.Subscribe;
import com.devin.company_profile.service.ISubscribeService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

public class SubscribeAction extends ActionSupport implements ServletRequestAware{

	private static final String SAVE_SUBSCRIBE = "saveSubscribe";

	private ISubscribeService subscribeService;
	private HttpServletRequest request;
	private boolean isSuccess;

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean success) {
		isSuccess = success;
	}

	public void setSubscribeService(ISubscribeService subscribeService) {
		this.subscribeService = subscribeService;
	}

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request = httpServletRequest;

	}

	public String saveSubscribe(){
		String email = request.getParameter("user-email");
		Subscribe subscribe = new Subscribe();
		subscribe.setEmail(email);
		subscribe.setCreateTime(new Date());
		subscribe.setStatus(1);
		try {
			subscribeService.saveEntry(subscribe);
			isSuccess = true;
		}catch (Exception e){
			isSuccess = false;
		}
		return SAVE_SUBSCRIBE;
	}

}
