/** 
 * Copyright: Copyright (c)2015
 * Company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
package com.sh.htgl.pojo;

import java.util.List;


/**    
 * @author��QYW   
 * @since��2019��3��20������11:23:02
 * @description:
 * @version: 1.0  
 * @copyright: Copyright (c)2015
 * @company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
public class Menu {
	private String menuid;
	private String icon;
	private String menuname;
	private String url;
	private List<Menu> child;
	@Override
	public String toString() {
		return "Menu [menuid=" + menuid + ", icon=" + icon + ", menuname=" + menuname + ", url=" + url + ", child="
				+ child + "]";
	}
	public String getMenuid() {
		return menuid;
	}
	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<Menu> getChild() {
		return child;
	}
	public void setChild(List<Menu> child) {
		this.child = child;
	}
	
}
