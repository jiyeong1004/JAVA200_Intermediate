// 047. while�� ������ �̿��Ͽ� ���� �ٸ� �� ���� �����
package kr.co.infopub.chapter.s047;

public class BioRandom {

	public static void main(String[] args) {
		int range = 10;
		int start = 1;
		int a = 0, b = 0, c = 0;
		
		while(a == b || b == c || c == a) {
			a = (int)(range * Math.random() + start);
			b = (int)(range * Math.random() + start);
			c = (int)(range * Math.random() + start);
		}
		System.out.printf("%d\t%d\t%d", a, b, c);
	}
}
