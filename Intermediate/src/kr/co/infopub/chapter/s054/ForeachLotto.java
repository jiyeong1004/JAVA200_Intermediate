// 054. ���� for(foreach)�� �迭 ����ϱ�
package kr.co.infopub.chapter.s054;

/*
 * ���� for�� �迭�̳� ����Ʈ�� index�� ���� �������� �ʾƵ� �ǹǷ� ����� �� �ſ� �����ϴ�.
 * �迭�� ���� �������� �ʰ� ��� ���ַ� ���ȴ�.
 * :(in) �ڿ��� �迭�̳� ����Ʈ�� ���
 * :(in) �տ��� Ÿ���� ���
 */

// ���� for�� �迭
public class ForeachLotto {

	public static void main(String[] args) {
		int [] mm = {1, 6, 16, 22, 23, 33};
		
		for(int m : mm) {
			System.out.printf(m + "\t");
		}
		System.out.println();
		
		/*
		int [] mm = {1, 6, 16, 22, 23, 33};
		
		for(int i = 0; i < mm.length; i++) {
			int m = mm[i];
			System.out.printf(m + "\t");
		}
		System.out.println();
		*/
	}
}