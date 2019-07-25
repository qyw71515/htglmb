/** 
 * Copyright: Copyright (c)2015
 * Company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
package com.sh.htgl.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sh.htgl.dao.ITabYhDao;
import com.sh.htgl.model.TabYh;
import com.sh.htgl.service.ITabYhService;

/**
 * @author��QYW
 * @since��2019��3��19������10:32:54
 * @description:
 * @version: 1.0
 * @copyright: Copyright (c)2015
 * @company: ����������Ϣ���޹�˾(jxhtxx.com)
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
			System.err.println("��ѯ�û��쳣!" + e);
		}
		return null;
	}

}
