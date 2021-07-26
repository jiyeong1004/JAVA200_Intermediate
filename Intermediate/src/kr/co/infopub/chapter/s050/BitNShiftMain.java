// 050. shift �����ڸ� �̿��Ͽ� 2���� ���ڿ��� �ٲٱ�
package kr.co.infopub.chapter.s050;

// >> shift ? ���׿�����
public class BitNShiftMain {
	// 10���� ������ 2���� ���ڿ�(������)�� ��ȯ
	public static String shifts(int a) {
		String s = "";
		for(int i = 0; i <= 31; i++) {
			int aa = a % 2;
			s = (aa > 0) ? aa + s : (-aa) + s;
			a >>= 1;  // a /= 2;
		}
		return s;
	}
	
	public static void main(String[] args) {
		int intNums1 = 123;
		int intNums2 = -123;
		
		System.out.printf("%d : %s\n", intNums1, shifts(intNums1));
		System.out.printf("%d : %s\n", intNums2, shifts(intNums2));
	}
}
