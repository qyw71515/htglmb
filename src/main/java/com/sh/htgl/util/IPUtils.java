/** 
 * Copyright: Copyright (c)2015
 * Company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
package com.sh.htgl.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**    
 * @author��QYW   
 * @since��2019��3��19������9:42:56
 * @description:
 * @version: 1.0  
 * @copyright: Copyright (c)2015
 * @company: ����������Ϣ���޹�˾(jxhtxx.com) 
 */
public class IPUtils {
public static String getUserIpAdress() {
	InetAddress address;
	String ipdz = "";
	try {
		address = InetAddress.getLocalHost();
		ipdz = address.getHostAddress();
	} catch (UnknownHostException e) {
		e.printStackTrace();
	}
	return ipdz;
}
}
