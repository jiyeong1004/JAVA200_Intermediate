// 051. &(��Ʈ) �����ڸ� �̿��Ͽ� 2���� ���ڿ��� �ٲٱ�
package kr.co.infopub.chapter.s051;

// & ������
public class BitNShiftMain {
	public static int BITMASK = 1;
	// 10������ 2���� ���ڿ�(��Ʈ��)�� ��ȯ
	public static String shifts(int a) {
		int BITMASK = 1;
		String s = "";
		for(int i = 0; i <= 31; i++) {
			s = (a & BITMASK) + s;
			a >>= 1;  // a /= 2;
		}
		return s;
	}
	
	public static void main(String[] args) {
		int intNums1 = 123;
		int intNums2 = -123;
		
		System.out.printf("%d : %s%n", intNums1, shifts(intNums1));
		System.out.printf("%d : %s%n", intNums2, shifts(intNums2));
	}
}
