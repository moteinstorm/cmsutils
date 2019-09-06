package com.mmcro.zhuzhiguang;

/**
 * 
 * @author zhuzg
 *
 */
public class FileUtil {
	//3.5.2获取文件扩展名
	/**
	 * 
	 * @param fileName
	 * @return
	 */
	public static String getSuffix(String fileName) {
		int dotIndex = fileName.lastIndexOf('.');
		//没有扩展名
		if(dotIndex<0) {
			return "";
		}
		//最后一位是 .
		if(dotIndex>=fileName.length()) {
			return "";
		}
		//
		return fileName.substring(dotIndex+1);
	}
}
