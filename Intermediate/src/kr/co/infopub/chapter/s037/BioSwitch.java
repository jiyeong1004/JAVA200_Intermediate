// 037. ������� ���� ��ü, ����, ������ ����ϱ�
package kr.co.infopub.chapter.s037;

// ���, switch case
public class BioSwitch {
	// ���
	public static final int PHYSICAL = 23;
	public static final int EMOTIONAL = 28;
	public static final int INTELLECTUAL = 33;
	
	// �޼��� ����
	public static String textInfor(int index, double value) {
		String result = "";
		switch(index) {
		case PHYSICAL : result = "��ü ���� : "; break;
		case EMOTIONAL : result = "���� ���� : "; break;
		case INTELLECTUAL : result = "���� ���� : "; break;
		default : result = "�̰��� : "; break;
		}
		return result + (value * 100);
	}

	public static void main(String[] args) {
		int index = PHYSICAL;
		double value = 0.86;
		String st = textInfor(index, value);
		System.out.println(st);
	}
}