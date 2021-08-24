// 080. �ڽ�, ��ڽ����� �⺻ Ÿ���� ���� Ÿ������ ��ȯ�ϱ�
package kr.co.infopub.chapter.s080;

import java.util.ArrayList;

// Boxing / Unboxing
public class EasyBoxingMain {

	public static void main(String[] args) {
		int intNm1 = 123;
		long longNum1 = 345L;
		double doubleNum = 123.123;
		Integer intWrap1 = intNm1;  // new Integer(intNm1);
		Long longWrap1 = longNum1;  // new Long(longNum1);
		Double doubleWrap1 = doubleNum;  // new Double(doubleNum);
		double dd = doubleWrap1;
		// �⺻ Ÿ�� <--> Wrapper�� ĳ���� ���� ���
		Integer intWrap2 = intNm1;  // Boxing
		intNm1 = intWrap2;  // UnBoxing
		System.out.println(intNm1);
		
		ArrayList<Integer> ilists = new ArrayList<>();
		ilists.add(new Integer(3));
		ilists.add(5);
		int a = ilists.get(0);  // <Integer>
		System.out.println(a);
		
		int b = Integer.parseInt("123");
		System.out.println(b);
	}
}
