// 030. ��� �޼��带 �̿��Ͽ� ��ü ���� ���ϱ�
package kr.co.infopub.chapter.s030;

// non static �޼���(���)
public class BioCalendar {
	// ���, ������� ������ �� ����.
	public static final int PHYSICAL = 23;  // static ���� ���� ���� ���
	// ��� �޼���(non static) ����
	public double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}
	
	public static void main(String[] args) {
		int days = 1200;
		BioCalendar bio = new BioCalendar();  // ��ü�� ����
		// ��� �޼��� ȣ��
		double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("���� ��ü ���� %1$.2f�Դϴ�.\n", phyval);
	}
}
