// 070. StringBuilder�� ���ڿ� ����, ����, �߰��ϱ�
package kr.co.infopub.chapter.s070;

public class StringBuilderMain {

	public static void main(String[] args) {
		// synchronized ���� StringBuffer
		StringBuilder sbu = new StringBuilder();
		sbu.append("I")
		   .append(" go")
		   .append(" to school.");
		System.out.println(sbu);
		
		sbu.replace(7, 11, "");
		System.out.println(sbu);
		
		sbu.reverse();
		System.out.println(sbu);
		
		sbu.deleteCharAt(3);
		System.out.println(sbu);
		
		sbu.delete(1, 3);
		System.out.println(sbu);
		
		String ss = sbu.substring(0);
		System.out.println(ss);
		System.out.println(sbu);
		
		String st = sbu.substring(0, 4);
		System.out.println(st);
		System.out.println(sbu);
	}
}
