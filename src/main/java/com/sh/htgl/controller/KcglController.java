/** 
 * Copyright: Copyright (c)2015
 * Company: 江西航天信息有限公司(jxhtxx.com) 
 */
package com.sh.htgl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.sh.htgl.model.TabKcxx;

import com.sh.htgl.service.ITabKcglService;


import net.sf.json.JSONObject;

/**    
 * @author：QYW   
 * @since：2019年6月27日下午4:31:23
 * @description:
 * @version: 1.0  
 * @copyright: Copyright (c)2015
 * @company: 江西航天信息有限公司(jxhtxx.com) 
 */
@Controller
@RequestMapping(value = "/kcgl")
public class KcglController {
	@Resource
	private ITabKcglService tabKcglService;
	
	
	@RequestMapping(value = "/list")
	public String list(Model model,HttpServletRequest request){
		return "kcgl/list";
	}
	
	@RequestMapping(value = "/query")
	public String query(Model model,HttpServletRequest request){
		return "kcgl/query";
	}
	
	@RequestMapping(value = "/listData")
	@ResponseBody
	public Map<String, Object> listData(HttpServletRequest request){
		Map<String, Object> map = new HashMap<String, Object>();
		int page = Integer.parseInt(request.getParameter("page"));//当前页
		int rows = Integer.parseInt(request.getParameter("rows"));//每页记录数
		String order = request.getParameter("order");
		String sort = request.getParameter("sort");
		String id = request.getParameter("id");
		String kclx = request.getParameter("kclx");
		
		map.put("startRow", (page-1)*rows);
		map.put("endRow", page*rows);
		map.put("rows", rows);
		map.put("order", order);
		map.put("sort", sort);
		map.put("id", id);
		map.put("kclx", kclx);
		List<TabKcxx> list = tabKcglService.findKcglByPage(map);
		Map<String,Object> m = new HashMap<String, Object>();
		m.put("total", tabKcglService.getCount(map));
		m.put("rows", list);
		return m;
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String edit(HttpServletRequest request, HttpServletResponse res, Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		String id = request.getParameter("id");
		map.put("id", id);
		map.put("sort", "id");
		map.put("order", "desc");
		map.put("endRow", 100);
		map.put("startRow", 0);
		map.put("rows", 100);
		System.err.println("map-->" + map);
		List<TabKcxx> lists = tabKcglService.findKcglByPage(map);
		if (lists != null && lists.size() > 0) {
			model.addAttribute("kcxx", lists.get(0));
		}
		System.err.println("lists.get(0)-->" + lists.get(0));
		return "kcgl/edit";
	}

	@RequestMapping(value = "/editSave", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	@ResponseBody
	public String editSave(HttpServletRequest request, HttpServletResponse res) throws Exception {
		JSONObject json = new JSONObject();
		try {
			String id = request.getParameter("id");
			String kcmc = request.getParameter("kcmc");
			String kcxs = request.getParameter("kcxs");
			String kclx = request.getParameter("kclx");
			String xfen = request.getParameter("xfen");
			String kkxq = request.getParameter("kkxq");
			String syxs = request.getParameter("syxs");
			String sfsyjx = request.getParameter("sfsyjx");
			String sfsjlkc = request.getParameter("sfsjlkc");
			String kkxy = request.getParameter("kkxy");
			
			Map<String, Object> map = new HashMap<String, Object>();
			
			map.put("id",id);
			map.put("sort", "id");
			map.put("order", "desc");
			map.put("endRow", 100);
			map.put("startRow", 0);
			
			map.put("kcmc", kcmc);
			map.put("kcxs", kcxs);
			map.put("kclx", kclx);
			map.put("xfen", xfen);
			map.put("kkxq", kkxq);
			map.put("syxs", syxs);
			map.put("sfsyjx", sfsyjx);
			map.put("sfsjlkc", sfsjlkc);
			map.put("kkxy", kkxy);

			if (tabKcglService.update(map)) {
				json.put("retCode", "1");
				json.put("retMsg", "数据保存成功!");
				
			} 
			

		} catch (Exception e) {
			json.put("retCode", "-1");
			json.put("retMsg","发生异常:" + e.getLocalizedMessage());
			
		}
		
		return json.toString();
	}

	@RequestMapping(value = "/del", method = RequestMethod.GET)
	public String delete(HttpServletRequest request, HttpServletResponse res, Model model) {
		JSONObject json = new JSONObject();
		String id = request.getParameter("id");

		System.err.println("id-->" + id);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);

		if (tabKcglService.delete(map)) {
			json.put("retCode", "1");
			json.put("retMsg", "删除成功!");
		} else {
			json.put("retCode", "0");
			json.put("retMsg", "删除失败!");
		}
		model.addAttribute("result", json.toString());
		return "kcgl/delete";
	}

	

	@RequestMapping(value = "/add")
	public String add() throws Exception {
		return "kcgl/add";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	@ResponseBody
	public String save(HttpServletRequest request, HttpServletResponse res) throws Exception {
		JSONObject json = new JSONObject();
		try {

			String kcmc = request.getParameter("kcmc");
			String kcxs = request.getParameter("kcxs");
			String kclx = request.getParameter("kclx");
			String xfen = request.getParameter("xfen");
			String kkxq = request.getParameter("kkxq");
			String syxs = request.getParameter("syxs");
			String sfsyjx = request.getParameter("sfsyjx");
			String sfsjlkc = request.getParameter("sfsjlkc");
			String kkxy = request.getParameter("kkxy");
			
			Map<String, Object> map = new HashMap<String, Object>();
			
			map.put("sort", "id");
			map.put("order", "desc");
			map.put("endRow", 100);
			map.put("startRow", 0);
			
			map.put("kcmc", kcmc);
			map.put("kcxs", kcxs);
			map.put("kclx", kclx);
			map.put("xfen", xfen);
			map.put("kkxq", kkxq);
			map.put("syxs", syxs);
			map.put("sfsyjx", sfsyjx);
			map.put("sfsjlkc", sfsjlkc);
			map.put("kkxy", kkxy);

			System.err.println("map-->" + map);

			if (tabKcglService.insert(map)) {
				json.put("retCode", "1");
				json.put("retMsg", "添加成功!");
			} else {
				json.put("retCode", "0");
				json.put("retMsg", "添加失败!");
			}

		} catch (Exception e) {
			json.put("retCode", "-1");
			json.put("retMsg", "发生异常:" + e.getLocalizedMessage());
			
		}
		return json.toString();
	}

}
