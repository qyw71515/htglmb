/** 
 * Copyright: Copyright (c)2015
 * Company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
package com.sh.htgl.dao;

import java.util.Map;

import com.sh.htgl.model.TabQy;

/**    
 * @author��QYW   
 * @since��2019��3��19������10:45:14
 * @description:
 * @version: 1.0  
 * @copyright: Copyright (c)2015
 * @company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
public interface ITabQyDao {

	/**   
	 * @Title: findQy   
	 * @Description: 
	 * @param: @param qymap
	 * @param: @return      
	 * @return: TabQy      
	 * @throws   
	 */
	TabQy findQy(Map<String, Object> qymap);

}
