package com.mmcro.zhuzhiguang;

/**
 * 
 * @author zhuzg
 *
 */
public class FileUtil {
	//3.5.2��ȡ�ļ���չ��
	/**
	 * 
	 * @param fileName
	 * @return
	 */
	public static String getSuffix(String fileName) {
		int dotIndex = fileName.lastIndexOf('.');
		//û����չ��
		if(dotIndex<0) {
			return "";
		}
		//���һλ�� .
		if(dotIndex>=fileName.length()) {
			return "";
		}
		//
		return fileName.substring(dotIndex+1);
	}
}
