/** 
 * Copyright: Copyright (c)2015
 * Company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
package com.sh.htgl.dao;

import java.util.Map;

import com.sh.htgl.model.TabYh;

/**    
 * @author��QYW   
 * @since��2019��3��19������10:45:53
 * @description:
 * @version: 1.0  
 * @copyright: Copyright (c)2015
 * @company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
public interface ITabYhDao {

	/**   
	 * @Title: findYh   
	 * @Description: 
	 * @param: @param map
	 * @param: @return      
	 * @return: TabYh      
	 * @throws   
	 */
	TabYh findYh(Map<String, Object> map);

}
