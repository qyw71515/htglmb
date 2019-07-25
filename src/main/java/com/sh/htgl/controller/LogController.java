/** 
 * Copyright: Copyright (c)2015
 * Company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
package com.sh.htgl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sh.htgl.model.TabLog;
import com.sh.htgl.model.TabYh;
import com.sh.htgl.service.ITabLogService;
import com.sh.htgl.util.TimeUtils;

/**    
 * @author��QYW   
 * @since��2019��3��20������11:44:34
 * @description:
 * @version: 1.0  
 * @copyright: Copyright (c)2015
 * @company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
@Controller
@RequestMapping(value = "/log")
public class LogController {
	@Resource
	private ITabLogService tabLogService;
	
	
	@RequestMapping(value = "/list")
	public String list(Model model,HttpServletRequest request){
		return "log/list";
	}
	
	@RequestMapping(value = "/query")
	public String query(Model model,HttpServletRequest request){
		return "log/query";
	}
	
	@RequestMapping(value = "/listData")
	@ResponseBody
	public Map<String, Object> listData(HttpServletRequest request){
		Map<String, Object> map = new HashMap<String, Object>();
		TabYh yh = (TabYh) request.getSession().getAttribute("yh");
		int page = Integer.parseInt(request.getParameter("page"));//��ǰҳ
		int rows = Integer.parseInt(request.getParameter("rows"));//ÿҳ��¼��
		String order = request.getParameter("order");
		String sort = request.getParameter("sort");
		String rzsje = request.getParameter("rzsje");
		String rzsjs = request.getParameter("rzsjs");
		rzsje = TimeUtils.wdatePickerFormat(rzsje);
		rzsjs = TimeUtils.wdatePickerFormat(rzsjs);
		map.put("startRow", (page-1)*rows);
		map.put("endRow", page*rows);
		map.put("rows", rows);
		map.put("order", order);
		map.put("sort", sort);
		map.put("qyidMh", yh.getQyid());
		map.put("rzsje", rzsje);
		map.put("rzsjs", rzsjs);
		List<TabLog> list = tabLogService.findLogByPage(map);
		Map<String,Object> m = new HashMap<String, Object>();
		m.put("total", tabLogService.getCount(map));
		m.put("rows", list);
		return m;
	}
}
