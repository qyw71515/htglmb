/** 
 * Copyright: Copyright (c)2015
 * Company: 江西航天信息有限公司(jxhtxx.com) 
 */
package com.sh.htgl.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sh.htgl.dao.ITabKcglDAO;
import com.sh.htgl.model.TabKcxx;
import com.sh.htgl.service.ITabKcglService;

/**    
 * @author：QYW   
 * @since：2019年6月27日下午4:36:33
 * @description:
 * @version: 1.0  
 * @copyright: Copyright (c)2015
 * @company: 江西航天信息有限公司(jxhtxx.com) 
 */
@Service
public class TabKcglServiceImpl implements ITabKcglService{

	@Resource
	private ITabKcglDAO tabKcglDAO;

	public Object getCount(Map<String, Object> map) {
		try {
			int count = tabKcglDAO.getCount(map);
			return count;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public List<TabKcxx> findKcglByPage(Map<String, Object> map) {
		try {
			return tabKcglDAO.findKcglByPage(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean update(Map<String, Object> map) {
		try {
			tabKcglDAO.update(map);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean delete(Map<String, Object> map) {
		try {
			tabKcglDAO.delete(map);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean insert(Map<String, Object> map) {
		try {
			tabKcglDAO.insert(map);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
