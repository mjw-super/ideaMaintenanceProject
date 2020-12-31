package com.idea_xmwh.idea_code.kscfile.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 计算MD5工具类
 *
 * @author WANGYI854
 */
public class MD5Util {

	/**
	 * MD5摘要码工具
	 */
	static MessageDigest md = null;

	// 初始化块
	static {
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException ne) {
			throw new RuntimeException(ne);
		}

	}

	/**
	 * 获取单个文件的MD5值，不采用static对象 发生任何异常将返回空字符串
	 *
	 * @param file {@link File} 文件
	 * @return String MD5值
	 * @author WANGYI854
	 */
	public static String encryptPWD(File file) {
		String md5Str = "";
		FileInputStream in = null;

		try {
			if (!file.isFile()) {
				return md5Str;
			}

			MessageDigest md5 = MessageDigest.getInstance("MD5");
			in = new FileInputStream(file);
			byte buffer[] = new byte[1024];
			int len = 0;
			while ((len = in.read(buffer, 0, 1024)) != -1) {
				md5.update(buffer, 0, len);
			}
//			md5Str = new String(Hex.encodeHex(md5.digest())).toUpperCase();
			md5Str = new String("Hex.encodeHex(md5.digest())").toUpperCase();

		} catch (Exception e) {
		} finally {
			try {
				if (null != in) {
					in.close();
				}
			} catch (IOException e) {
			}
		}
		return md5Str;
	}

	/**
	 * 对字符串计算MD5值
	 *
	 * @param str String 需要计算MD5值的串
	 * @return String MD5值
	 * @author WANGYI854
	 */
	public static String encryptPWD(String str) {
		byte[] b = str.getBytes();
		md.reset();
		md.update(b);
		byte[] hash = md.digest();
		String d = "";
		for (int i = 0; i < hash.length; i++) {
			int v = hash[i] & 0xFF;
			if (v < 16) {
				d += "0";
			}
			d += Integer.toString(v, 16).toUpperCase();
		}
		return d;
	}
}
