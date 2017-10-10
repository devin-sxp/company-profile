package com.devin.company_profile.action;

import com.devin.company_profile.entity.Work;
import com.devin.company_profile.service.IWorkService;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WorkAction extends ActionSupport implements ServletRequestAware{

	private static final String GET_WORKS = "getWorks";

	private IWorkService workService;
	private HttpServletRequest request;
	private String resultWork;

	public void setWorkService(IWorkService workService) {
		this.workService = workService;
	}

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request = httpServletRequest;

	}

	public void setResultWork(String resultWork) {
		this.resultWork = resultWork;
	}

	public String getResultWork() {
		return resultWork;
	}

	public String getWorks(){
		String type = request.getParameter("workType");
		String workstationType = request.getParameter("workstationType");
		String limit = request.getParameter("limit");
		String offset = request.getParameter("offset");
		Map<String, Object> mapCondition = new HashMap<>();
		mapCondition.put("type=","'"+type+"'");
		Collection<Work> works = this.workService.queryEntryByCondition(mapCondition,limit,offset);
		mapCondition.put("type=","'"+workstationType+"'");
		Collection<Work> workstations = this.workService.queryEntryByCondition(mapCondition,limit,offset);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("works",works);
		map.put("workstations",workstations);
		JSONArray json = JSONArray.fromObject(map);
		resultWork = json.toString();
		return GET_WORKS;
	}

}
