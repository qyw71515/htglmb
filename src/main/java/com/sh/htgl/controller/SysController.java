/** 
 * Copyright: Copyright (c)2015
 * Company: 江西航天信息有限公司(jxhtxx.com) 
 */
package com.sh.htgl.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sh.htgl.model.TabQy;
import com.sh.htgl.model.TabYh;
import com.sh.htgl.pojo.Menu;
import com.sh.htgl.service.ITabGnService;
import com.sh.htgl.service.ITabLogService;
import com.sh.htgl.service.ITabQyService;
import com.sh.htgl.service.ITabYhService;
import com.sh.htgl.util.IPUtils;
import com.sh.htgl.util.MD5Utils;
import com.sh.htgl.util.StringUtils;
import com.sh.htgl.util.TimeUtils;



/**    
 * @author：QYW   
 * @since：2019年3月18日下午4:54:45
 * @description:
 * @version: 1.0  
 * @copyright: Copyright (c)2015
 * @company: 江西航天信息有限公司(jxhtxx.com) 
 */
@Controller
public class SysController {
	@Resource
	private ITabYhService tabYhService;
	@Resource
	private ITabGnService tabGnService;
	@Resource
	private ITabQyService tabQyService;
	@Resource
	private ITabLogService tabLogService;

	@ResponseBody
	@RequestMapping(value="/login")
	public String login(String yhid,String mima,HttpServletRequest request){
		String RetCode = "0";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("yhm", yhid.toUpperCase());
		map.put("mima", MD5Utils.MD5Encode(mima, "UTF-8"));
				
		
		TabYh tabYh = tabYhService.findYh(map);
		if(tabYh != null){
			RetCode="1";
			request.getSession().setAttribute("yh", tabYh);
			
			
			/*
			 * 		企业
			 * */
			Map<String, Object> qymap = new HashMap<String, Object>();
			qymap.put("qyid", tabYh.getQyid());
			TabQy tabQy = tabQyService.findQy(qymap);
			request.getSession().setAttribute("qy", tabQy);
			
			
			/*
			 * 		登入日志
			 * */
			Map<String,Object> logmap = new HashMap<String,Object>();
			logmap.put("rzid", StringUtils.getUUID());
			logmap.put("rzsj", TimeUtils.getTime());
			logmap.put("rzxx", "企业为 "+tabYh.getQymc()+"，用户名为"+tabYh.getXming()+" 登录");
			logmap.put("ipdz", IPUtils.getUserIpAdress());
			logmap.put("qyid", tabYh.getQyid());
			logmap.put("yhid", tabYh.getYhid());
			logmap.put("by1", "login");
			tabLogService.insertLog(logmap);
			
			
			/*
			 * 		加载功能树
			 * */
			map.clear();
			map.put("yhlx", tabYh.getYhlx());
			List<Menu> menu = tabGnService.loadMenuTree(map);
			request.getSession().setAttribute("gn", menu);
			
		}
		return RetCode;
	}
	
	
	@SuppressWarnings("unchecked")
	@ResponseBody
	@RequestMapping(value="/initMenu")
	public Map<String, List<Menu>> initMenu(HttpServletRequest request){
		
		Map<String,List<Menu>> retMap = new HashMap<String,List<Menu>>();
		List<Menu> menu = new ArrayList<Menu>();
		menu = (List<Menu>) request.getSession().getAttribute("gn");
		retMap.put("menus", menu);
		
		return retMap;
	}
}
