// 035. ���׿����ڸ� �̿��Ͽ� ¦, Ȧ�� �Ǻ��ϱ�
package kr.co.infopub.chapter.s035;

/*
 * D = A ? B : C
 * B, C, D�� Ÿ���� �����ؾ� �ϰ�, ���� ����� D�� �����Ѵ�.
 */

// ����(?:)������
public class EvenOddTriCondition {

	public static void main(String[] args) {
		int temp = 99;
		temp = (temp %2 == 1) ? temp * 3 + 1 : temp / 2;
		System.out.printf("��� �� = %d\n", temp);
	}
}
