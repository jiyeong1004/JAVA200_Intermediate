// 073. ���� ���� �޼��� ����ϱ�
package kr.co.infopub.chapter.s073;

public class MathTestMain {

	public static void main(String[] args) {
		// constant
		System.out.println("Math.E " + Math.E);
		System.out.println("Math.PI " + Math.PI);
		
		// method
		System.out.println("Math.abs(-5) ���밪 : " + Math.abs(-5));
		System.out.println("Math.ceil(4.34) �ø� : " + Math.ceil(4.34));
		System.out.println("Math.round(4.34) �ݿø� : " + Math.round(4.5));
		System.out.println("Math.floor(4.34) ���� : " + Math.floor(4.34));
		System.out.println("Math.rint(4.34) �ݿø� : " + Math.rint(4.34));
		System.out.println("Math.max(45, 78) " + Math.max(45, 78));
		System.out.println("Math.min(45, 78) " + Math.min(45, 78));
		System.out.println("Math.pow(2, 4) " + Math.pow(2, 4));
		System.out.println("Math.log(30) " + Math.log(30));
		System.out.println("Math.exp(3) " + Math.exp(3));
		System.out.println("Math.sqrt(10) " + Math.sqrt(10));
		
		// Random
		double dRan = Math.random();  // 0 <== dRan < 1 �Ǽ�
		System.out.println("Math.random() => " + dRan);
	}
}
