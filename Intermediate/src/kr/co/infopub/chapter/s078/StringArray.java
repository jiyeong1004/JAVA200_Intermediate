// 078. ���ڿ� 1���� �迭 �����ϱ�
package kr.co.infopub.chapter.s078;

public class StringArray {

	public static void main(String[] args) {
		// ���� �迭 ���� �� �ʱ�ȭ - ���� �迭�� �ٽ� �ʱ�ȭ�� �� �ִ�. ���ο� ���ڿ� �迭�� �����ϰ� �ʱ�ȭ�Ѵ�.
		String[] myNum = new String[] {"2016-08-17", "2016-09-17", "2016-03-17"};
		// ���� �迭 ���� �� �ʱ�ȭ - ���� �迭�� �ٽ� �ʱ�ȭ�� �� ����.
		String[] myNum2 = {"2016-08-17", "2016-09-17", "2016-03-17"};
		System.out.println(myNum2[0]);
		print(myNum);
		// myNum2 = {"2016-08-17", "2016-09-17", "2016-03-17", "2016-04-17"};  // �ٽ� �ʱ�ȭ �Ұ�
		myNum = new String[] {"2016-08-17", "2016-09-17", "2016-03-17", "2016-04-17"};
		String[] tos = new String[myNum.length];
		System.arraycopy(myNum, 0, tos, 0, myNum.length);
		print(tos);
	}
	
	public static void print(String [] tos) {
		for(String ss : tos) {
			System.out.printf(ss + "\t");
		}
		System.out.println();
	}
}