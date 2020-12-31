package com.idea_xmwh.idea_code.kscfile.utils;

/**
 * The type Uuid.
 *
 * @author 施健伟  测试使用UUID.
 */
public class UUID {

	/**
	 * 产生唯一UUID.
	 *
	 * @return String. string
	 */
	public static String genUuid(){
		String uuid =  java.util.UUID.randomUUID().toString();
		return uuid.replaceAll("-", "");
	}
	
}
