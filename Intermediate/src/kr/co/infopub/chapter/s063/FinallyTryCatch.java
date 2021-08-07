// 063. ���� ���꿡�� �߻��ϴ� ���� ó���ϱ�
package kr.co.infopub.chapter.s063;

public class FinallyTryCatch {

	public static void main(String[] args) {
		try {
			// Divide by zero.
			int x = 5;
			int y = 20 / (5 - x);  // ���⿡�� ���ܸ� ������.
			System.out.println(y);
		} catch(ArithmeticException e) {  // run time
			System.out.println("==> 0���� ������ Ȯ���� ��!!!");
			// e.printStackTrace();
		} finally {
			System.out.println("�� ����Ǿ�߸� ��!!!");
		}
	}
}
