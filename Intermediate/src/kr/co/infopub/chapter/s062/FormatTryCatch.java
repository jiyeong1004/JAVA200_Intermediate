// 062. ������ �Է¹��� �� �߻��� �� �ִ� ���� ó���ϱ�
package kr.co.infopub.chapter.s062;

public class FormatTryCatch {

	public static void main(String[] args) {
		String sNum = "123";
		String nNum = "h";
		
		try {
			int a = Integer.parseInt(sNum);
			System.out.println(a);
		} catch(NumberFormatException ee) {
			System.out.println("int���� Ȯ���� ��!!!!");
			System.err.println(ee.getMessage());
		} catch(Exception ee) {
			System.out.println("�� �� �� �־�");
		} finally {
			System.out.println("�� ����Ǿ�߸� ��!!!!");
		}
	}
}
