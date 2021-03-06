package vfh.httpInterface.web.httpjson;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vfh.httpInterface.commons.RequestParamUtil;
import vfh.httpInterface.service.buildings.BuildingsService;

@Controller
@RequestMapping("/jsondata/buildings")
@SuppressWarnings(value = { "rawtypes", "unchecked" })
@Scope("prototype")
public class HttpBuildingsController {
	@Autowired
	private BuildingsService buildingsService;

	@RequestMapping("/getBuildingsDetailList")
	@ResponseBody
	public void getBuildingsDetailList(HttpServletRequest request,
			HttpServletResponse response) {

		Map res = new HashMap();
		Map params = RequestParamUtil.requestToMap(request);
		Map m = buildingsService.findDetailList(params);
		if ("000000".equals(m.get("returnCode"))) {
			res.put("data", m.get("data"));
			res.put("statusCode", "0000");
		} else {
			res.put("statusCode", "1111");
		}

		RequestParamUtil.responseWriter(request, response, res);
	}

	@RequestMapping("/getBuildingsDetailList2")
	@ResponseBody
	public void getBuildingsDetailList2(HttpServletRequest request,
			HttpServletResponse response) {

		Map res = new HashMap();
		Map params = RequestParamUtil.requestToMap(request);
		params.put("is_hot", "1");
		Map m = buildingsService.findHotList(params);
		if ("000000".equals(m.get("returnCode"))) {
			res.put("data", m.get("data"));
			// System.out.println("is_hot"+m.get("data").toString());
			res.put("statusCode", "0000");
		} else {
			res.put("statusCode", "1111");
		}

		RequestParamUtil.responseWriter(request, response, res);
	}

	@RequestMapping("/getBuildingsDetailList3")
	@ResponseBody
	public void getBuildingsDetailList3(HttpServletRequest request,
			HttpServletResponse response) {

		Map res = new HashMap();
		Map params = RequestParamUtil.requestToMap(request);
		params.put("is_new", "1");
		Map m = buildingsService.findNewList(params);
		if ("000000".equals(m.get("returnCode"))) {
			res.put("data3", m.get("data"));
			//System.out.println("new" + m.get("data").toString());
			res.put("statusCode", "0000");
		} else {
			res.put("statusCode", "1111");
		}

		RequestParamUtil.responseWriter(request, response, res);
	}
	@RequestMapping("/getBuildingsDetailList_Top")
	@ResponseBody
	public void getBuildingsDetailList_Top(HttpServletRequest request,
			HttpServletResponse response) {

		Map res = new HashMap();
		Map params = RequestParamUtil.requestToMap(request);
		//params.put("is_top", "1");
		//params.put("top_type", "1");
		Map m = buildingsService.findTopList(params);
		if ("000000".equals(m.get("returnCode"))) {
			res.put("data", m.get("data"));
			//System.out.println("new" + m.get("data").toString());
			res.put("statusCode", "0000");
		} else {
			res.put("statusCode", "1111");
		}

		RequestParamUtil.responseWriter(request, response, res);
	}
	@RequestMapping("/getBuildingsDetail")
	@ResponseBody
	public void getBuildingsDetail(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam(required = false) Long buildingsId
			) {

		Map params = RequestParamUtil.requestToMap(request);

		Map res = new HashMap();
		Map m = buildingsService.findBulidingsDetail(buildingsId);
		if ("000000".equals(m.get("returnCode"))) {
			res.put("data", m.get("data"));
			res.put("statusCode", "0000");
		} else {
			res.put("statusCode", "1111");
		}
		res.put("returnMsg", m.get("returnMsg"));

		RequestParamUtil.responseWriter(request, response, res);
	}

	@RequestMapping("/findListByselect")
	@ResponseBody
	public void findListByselect(HttpServletRequest request,
			HttpServletResponse response) {

		Map res = new HashMap();
		Map params = RequestParamUtil.requestToMap(request);

		Map m = buildingsService.findZuobiao(params);
		if ("000000".equals(m.get("returnCode"))) {
			res.put("data", m.get("data"));
			res.put("statusCode", "0000");
		} else {
			res.put("statusCode", "1111");
		}
		res.put("returnMsg", m.get("returnMsg"));
		RequestParamUtil.responseWriter(request, response, res);
	}
}
