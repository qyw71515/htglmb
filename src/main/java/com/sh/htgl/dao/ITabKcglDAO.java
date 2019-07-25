/** 
 * Copyright: Copyright (c)2015
 * Company: 江西航天信息有限公司(jxhtxx.com) 
 */
package com.sh.htgl.dao;

import java.util.List;
import java.util.Map;

import com.sh.htgl.model.TabKcxx;

/**    
 * @author：QYW   
 * @since：2019年6月27日下午5:08:09
 * @description:
 * @version: 1.0  
 * @copyright: Copyright (c)2015
 * @company: 江西航天信息有限公司(jxhtxx.com) 
 */
public interface ITabKcglDAO {

	/**   
	 * @Title: insert   
	 * @Description: 
	 * @param: @param map      
	 * @return: void      
	 * @throws   
	 */
	void insert(Map<String, Object> map);

	/**   
	 * @Title: delete   
	 * @Description: 
	 * @param: @param map      
	 * @return: void      
	 * @throws   
	 */
	void delete(Map<String, Object> map);

	/**   
	 * @Title: update   
	 * @Description: 
	 * @param: @param map      
	 * @return: void      
	 * @throws   
	 */
	void update(Map<String, Object> map);

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
	 * @Title: getCount   
	 * @Description: 
	 * @param: @param map
	 * @param: @return      
	 * @return: int      
	 * @throws   
	 */
	int getCount(Map<String, Object> map);

}
