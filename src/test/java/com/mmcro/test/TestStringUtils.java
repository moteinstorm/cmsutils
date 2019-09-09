package com.mmcro.test;

import org.junit.Test;

import com.mmcro.zhuzhiguang.StringUtils;

/**
 * 
 * @author zhuzg
 *
 */
public class TestStringUtils {
	
	@Test
	public void testTel() {
		String tel1="13583679291";
		String tel2="14583679291";
		boolean b1 = StringUtils.isTelephone(tel1);
		boolean b2 = StringUtils.isTelephone(tel2);
		
		System.out.println(" b1 is : " + b1);
		System.out.println(" b2 is : " + b2);
		
	}
	
	
	@Test
	public void testEmail() {
		
		String e1="zhuzg@sohu.com";
		String e2="zhang@zhang@zhang.tttt";
		boolean b1 = StringUtils.isEmail(e1);
		boolean b2 = StringUtils.isEmail(e2);
		
		System.out.println(" b1 is : " + b1);
		System.out.println(" b2 is : " + b2);
		
		
		
	}
	
	@Test 
	public void TestSubStr() {
		String string = StringUtils.getPlaceholderValue("http://news.cnstock.com/news,yw-201908-4413224.htm","-[0-9]{7}\\.htm$");
		System.out.println("string :" + string);
		
	}
	
	@Test
	public void TestCnStr() {
		System.out.println("�����ַ��ǣ�" + StringUtils.getRandonCnStr(6));		
	}
	
	@Test
	public void testisNumber() {
		System.out.println(" 234 :" + StringUtils.isNumber("234"));
		System.out.println(" 2.34 :" + StringUtils.isNumber("2.34"));
		System.out.println(" . :" + StringUtils.isNumber("."));
		System.out.println(" avc :" + StringUtils.isNumber("abc"));
		
		
	}
	
	@Test
	public void testHastext() {
		
		System.out.println(" 1:" + StringUtils.hasText("   "));
		System.out.println(" 2:" + StringUtils.hasText("  f  f "));
		System.out.println(" 3:" + StringUtils.hasText("  			 "));
		
	}
	
	@Test
	public void test(){
		String news[] = {
				   "���֣������϶��й������ʲ��ݡ�����վ��ס��|http://news.cnstock.com/news,yw-201908-4413224.htm|8|2019-08-08 07:37:32",
				   "���߳��з������ʽ����ϵ� �����������䲨����ɳ�̬|http://news.cnstock.com/news,yw-201908-4413229.htm|5|",
				   "�ʲ���ծ������������� �����������������չת��|http://news.cnstock.com/news,yw-201908-4413222.htm||2019-08-08 07:36:50",
				   "̩�����߻�̩����������20��Ԫ|http://news.cnstock.com/news,jg-201908-4413369.htm|7|2019-08-08 09:25:53",
				   "�������У��й�7����㴢��Ϊ3.1037������Ԫ|http://news.cnstock.com/news,bwkx-201908-4412982.htm|10|2019-08-07 16:43:13",
				   "�ٶ�ս��Ͷ������ ���ֵ���С����|http://news.cnstock.com/news,bwkx-201908-4413414.htm||2019-08-08 10:57:59",
				   "MSCI��8ֻ���ɽ���������MSCI�й�ָ��|http://news.cnstock.com/news,bwkx-201908-4413216.htm|9|2019-08-08 07:28:58",
				   "ȫ������ָ����ͷ���롰�й�ʱ�䡱|http://stock.cnstock.com/stock/smk_gszbs/201908/4413244.htm|10|2019-08-08 07:47:08",
				   "8��8�ջ����������½�����ʾ|http://news.cnstock.com/news,bwkx-201908-4413227.htm||2019-08-08 07:39:05",
				   "��Ϊ��������2025ʮ������|http://news.cnstock.com/news,bwkx-201908-4413402.htm|8|2019-08-06 10:19:49",
				   "���׵ڶ����Ⱦ�����188��Ԫ ����ҵ��ë����ת��|http://news.cnstock.com/news,bwkx-201908-4413415.htm||2019-08-08 10:58:39",
				   "��ŷ���У�֣�ݣ���ͨ����˹����·|http://news.cnstock.com/news,bwkx-201908-4413425.htm|7|2019-08-08 11:15:24",
				   "�ҹ���ȨͶ���г���ģͻ��10����Ԫ|http://news.cnstock.com/news,yw-201908-4412690.htm|9|2019-08-07 07:59:11",
				   "�ٸ���Ƭ���۽��߶����� A�ɹ�˾��ǰ����|http://news.cnstock.com/news,yw-201908-4412640.htm|2|2019-08-07 07:42:29",
				   "�й��������й����������������й���Ϊ�����ʲ��ݹ���������|http://news.cnstock.com/news,yw-201908-4412630.htm|10"
				 };
		
		
	}
	
	@Test
	public void testHtml() {
		String str = "kthsdfkjfs \\n  ��Ƭ���۽��߶����� \\n A��Ƭ���� \\n ���߶����� A��Ƭ��\\n�۽��߶����� A��Ƭ���۽��߶����� A��Ƭ���۽��߶����� A";
		String html = StringUtils.toHtml(str);
		System.out.println("html is " + html);
		
	}
	
	
		
}

class news{
	/*
	Integer id;
	title
	url
	score
	created*/
	
}