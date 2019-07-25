/** 
 * Copyright: Copyright (c)2015
 * Company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
package com.sh.htgl.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sh.htgl.dao.ITabLogDao;
import com.sh.htgl.model.TabLog;
import com.sh.htgl.service.ITabLogService;

/**
 * @author��QYW
 * @since��2019��3��19������10:32:18
 * @description:
 * @version: 1.0
 * @copyright: Copyright (c)2015
 * @company: ����������Ϣ���޹�˾(jxhtxx.com)
 */
@Service
public class TabLogServiceImpl implements ITabLogService {
	@Resource
	private ITabLogDao tabLogDao;

	public void insertLog(Map<String, Object> logmap) {
		// TODO Auto-generated method stub
		try {
			tabLogDao.insertLog(logmap);
		} catch (Exception e) {
			System.err.println("������־�쳣!" + e);
		}
	}

	public List<TabLog> findLogByPage(Map<String, Object> map) {
		// TODO Auto-generated method stub
		try {
			return tabLogDao.findLogByPage(map);
		} catch (Exception e) {
			System.err.println("��ѯ��־�쳣!" + e);
		}
		return null;
	}

	public int getCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		try {
			return tabLogDao.getCount(map);
		} catch (Exception e) {
			System.err.println("��ѯ��־�����쳣!" + e);
		}
		return 0;
	}

}
