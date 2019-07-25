/** 
 * Copyright: Copyright (c)2015
 * Company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
package com.sh.htgl.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**    
 * @author��QYW   
 * @since��2019��3��19������9:40:49
 * @description:
 * @version: 1.0  
 * @copyright: Copyright (c)2015
 * @company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
public class TimeUtils {
	public static String getTime() {
		Calendar c = Calendar.getInstance();    
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMddHHmmss");    
        String time = String.valueOf(f.format(c.getTime()));
        return time;
	}
	public static String wdatePickerFormat(String str) {
		if(str != null) {
			str = str.replace("-", "");
			str = str.replace(":", "");
			str = str.replace(" ", "");
		}
		return str;
	}
public static void main(String[] args) {
	String str = "2019-03-20 17:15:06";
	
	System.err.println(wdatePickerFormat(str));
}	
	
}
