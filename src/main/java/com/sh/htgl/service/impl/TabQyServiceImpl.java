/** 
 * Copyright: Copyright (c)2015
 * Company: 江西航天信息有限公司(jxhtxx.com) 
 */
package com.sh.htgl.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sh.htgl.dao.ITabQyDao;
import com.sh.htgl.model.TabQy;
import com.sh.htgl.service.ITabQyService;

/**
 * @author：QYW
 * @since：2019年3月19日上午10:32:38
 * @description:
 * @version: 1.0
 * @copyright: Copyright (c)2015
 * @company: 江西航天信息有限公司(jxhtxx.com)
 */
@Service
public class TabQyServiceImpl implements ITabQyService {
	@Resource
	private ITabQyDao tabQyDao;

	public TabQy findQy(Map<String, Object> qymap) {
		// TODO Auto-generated method stub
		try {
			return tabQyDao.findQy(qymap);
		} catch (Exception e) {
			System.err.println("查询企业异常!" + e);
		}
		return null;
	}

}
