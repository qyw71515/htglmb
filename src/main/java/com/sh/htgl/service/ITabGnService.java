/** 
 * Copyright: Copyright (c)2015
 * Company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
package com.sh.htgl.service;

import java.util.List;
import java.util.Map;

import com.sh.htgl.pojo.Menu;


/**    
 * @author��QYW   
 * @since��2019��3��19������10:26:32
 * @description:
 * @version: 1.0  
 * @copyright: Copyright (c)2015
 * @company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
public interface ITabGnService {

	/**   
	 * @Title: loadMenuTree   
	 * @Description: 
	 * @param: @param map
	 * @param: @return      
	 * @return: List<Menu>      
	 * @throws   
	 */
	List<Menu> loadMenuTree(Map<String, Object> map);


}
