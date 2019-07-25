/** 
 * Copyright: Copyright (c)2015
 * Company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
package com.sh.htgl.service;

import java.util.List;
import java.util.Map;

import com.sh.htgl.model.TabLog;

/**    
 * @author��QYW   
 * @since��2019��3��19������9:46:41
 * @description:
 * @version: 1.0  
 * @copyright: Copyright (c)2015
 * @company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
public interface ITabLogService {

	/**   
	 * @Title: insertLog   
	 * @Description: 
	 * @param: @param logmap      
	 * @return: void      
	 * @throws   
	 */
	void insertLog(Map<String, Object> logmap);

	/**   
	 * @Title: findLogByPage   
	 * @Description: 
	 * @param: @param map
	 * @param: @return      
	 * @return: List<TabLog>      
	 * @throws   
	 */
	List<TabLog> findLogByPage(Map<String, Object> map);

	/**   
	 * @Title: getCount   
	 * @Description: 
	 * @param: @param map
	 * @param: @return      
	 * @return: Object      
	 * @throws   
	 */
	int getCount(Map<String, Object> map);

}
