// 053. for�� if�� �̿��Ͽ� Ȧ���� �� ���ϱ�
package kr.co.infopub.chapter.s053;

public class ForCondition {

	public static void main(String[] args) {
		int s = 0;
		
		for(int i = 1; i <= 100; i++) {
			s += i;
		}
		System.out.println("1 ~ 100�� �� : " + s);
		
		s = 0;  // 0���� �ʱ�ȭ
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				s += i;
			}
		}
		System.out.println("1 ~ 100 ������ Ȧ���� �� : " + s);
	}
}
