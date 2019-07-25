/** 
 * Copyright: Copyright (c)2015
 * Company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
package com.sh.htgl.service;

import java.util.List;
import java.util.Map;

import com.sh.htgl.model.TabKcxx;

/**    
 * @author��QYW   
 * @since��2019��6��27������4:33:23
 * @description:
 * @version: 1.0  
 * @copyright: Copyright (c)2015
 * @company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
public interface ITabKcglService {

	

	/**   
	 * @Title: getCount   
	 * @Description: 
	 * @param: @param map
	 * @param: @return      
	 * @return: Object      
	 * @throws   
	 */
	Object getCount(Map<String, Object> map);

	/**   
	 * @Title: findKcglByPage   
	 * @Description: 
	 * @param: @param map
	 * @param: @return      
	 * @return: List<TabKcxx>      
	 * @throws   
	 */
	List<TabKcxx> findKcglByPage(Map<String, Object> map);

	/**   
	 * @Title: update   
	 * @Description: 
	 * @param: @param map
	 * @param: @return      
	 * @return: boolean      
	 * @throws   
	 */
	boolean update(Map<String, Object> map);

	/**   
	 * @Title: delete   
	 * @Description: 
	 * @param: @param map
	 * @param: @return      
	 * @return: boolean      
	 * @throws   
	 */
	boolean delete(Map<String, Object> map);

	/**   
	 * @Title: insert   
	 * @Description: 
	 * @param: @param map
	 * @param: @return      
	 * @return: boolean      
	 * @throws   
	 */
	boolean insert(Map<String, Object> map);



}
