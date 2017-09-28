package com.devin.company_profile.action;

import com.devin.company_profile.entity.Index;
import com.devin.company_profile.service.IIndexService;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONObject;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

public class IndexAction extends ActionSupport implements ServletRequestAware{

	private IIndexService indexService;
	private HttpServletRequest request;
	private String result;

	public void setIndexService(IIndexService indexService){
		this.indexService = indexService;
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

	public String showIndex(){
//		Collection<Index> indexs = this.indexService.queryEntry();
//		ActionContext.getContext().put("indexs",indexs);
		return "showIndex";
	}

	public String getIndexById(){
		String id = request.getParameter("id");
		Index index = indexService.getEntryById(Long.parseLong(id));
		JSONObject json = JSONObject.fromObject(index);
		result = json.toString();
		return "getIndexById";
	}

	public String saveIndex(){
		Index index = new Index();
		index.setIndexTitle("baby ...");
		index.setIndexDescription("在描述信息");
		index.setStatus(1);
		indexService.saveEntry(index);
		return "index";
	}

}
