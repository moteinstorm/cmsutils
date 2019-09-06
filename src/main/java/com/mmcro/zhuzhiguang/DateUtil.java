package com.mmcro.zhuzhiguang;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author zhuzg
 *
 */
public class DateUtil {
	
	/**
	 * 
	 * @param birthday
	 * @return
	 */
	public int getAge(Date birthday) {
		
		Calendar instance = Calendar.getInstance();
		instance.setTime(birthday);
		
		//�õ���������
		int birthYear = instance.get(Calendar.YEAR);
		int birthMonth = instance.get(Calendar.MONTH);
		int birthDate = instance.get(Calendar.DAY_OF_MONTH);
		
		//��ȡ��ǰ��������
		instance.setTime(new Date());
		int currentYear = instance.get(Calendar.YEAR);
		int currentMonth = instance.get(Calendar.MONTH);
		int currentDate = instance.get(Calendar.DAY_OF_MONTH);
		
		int age = currentYear-birthYear;
		if(currentMonth<birthMonth) {
			age--;
		}else if(currentMonth==birthMonth && currentDate<birthDate){
			age --;
		}
		
		return age;
		
	}
	
	
}
