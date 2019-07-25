/** 
 * Copyright: Copyright (c)2015
 * Company: 江西航天信息有限公司(jxhtxx.com) 
 */
package com.sh.htgl.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sh.htgl.dao.ITabYhDao;
import com.sh.htgl.model.TabYh;
import com.sh.htgl.service.ITabYhService;

/**
 * @author：QYW
 * @since：2019年3月19日上午10:32:54
 * @description:
 * @version: 1.0
 * @copyright: Copyright (c)2015
 * @company: 江西航天信息有限公司(jxhtxx.com)
 */
@Service
public class TabYhServiceImpl implements ITabYhService {
	@Resource
	private ITabYhDao tabYhDao;

	public TabYh findYh(Map<String, Object> map) {
		// TODO Auto-generated method stub
		try {
			return tabYhDao.findYh(map);
		} catch (Exception e) {
			System.err.println("查询用户异常!" + e);
		}
		return null;
	}

}
