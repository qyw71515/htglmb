/** 
 * Copyright: Copyright (c)2015
 * Company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
package com.sh.htgl.dao;

import java.util.List;
import java.util.Map;

import com.sh.htgl.model.TabGn;


/**    
 * @author��QYW   
 * @since��2019��3��19������10:46:25
 * @description:
 * @version: 1.0  
 * @copyright: Copyright (c)2015
 * @company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
public interface ITabGnDao {


	/**
	 * @return    
	 * @Title: findGn   
	 * @Description: 
	 * @param:       
	 * @return: void      
	 * @throws   
	 */
	List<TabGn> findGn();

	

	/**   
	 * @Title: loadMenuTree   
	 * @Description: 
	 * @param: @param map
	 * @param: @return      
	 * @return: List<TabGn>      
	 * @throws   
	 */
	List<TabGn> loadMenuTree(Map<String, Object> map);

}
