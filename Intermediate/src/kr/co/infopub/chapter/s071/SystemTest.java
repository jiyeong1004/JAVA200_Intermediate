// 071. System���� ���� �ҿ� �ð� ���ϱ�
package kr.co.infopub.chapter.s071;

import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

public class SystemTest {

	public static void main(String[] args) {
		long ltime = System.currentTimeMillis();
		System.out.println((ltime));  // 1970.1.1����
		
		for(int i = 0; i < 100000; i++) {
			System.out.print("");
		}
		long ltime2 = System.currentTimeMillis();  // milli 1 / 1000��
		System.out.println((ltime2 - ltime));
		System.out.println(ltime2 / 1000 / 60 / 60 / 24 / 365 + "��");
		Properties pro = System.getProperties();
		
		// ���ϴ� System property
		System.out.println(pro.getProperty("java.vm.version"));
		System.out.println(pro.getProperty("file.separator"));
		
		System.out.println(new Date(System.currentTimeMillis()));  // ����
		
		// -----------------java.util.*����----------------- //
		// ��� System property
		Enumeration<Object> en = pro.keys();
		int i = 0;
		
		while(en.hasMoreElements()) {
			String keys = (String)en.nextElement();
			System.out.println((++i + " ") + keys + " : " + pro.getProperty(keys));
		}
	}  // main
}