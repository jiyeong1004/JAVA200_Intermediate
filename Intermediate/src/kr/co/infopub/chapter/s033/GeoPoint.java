// 033. ��ü�� �̿��Ͽ� ����, �浵 ǥ���ϱ�
package kr.co.infopub.chapter.s033;

// ����, �浵�� �� �������� ��ü�� ����
public class GeoPoint {

	public static void main(String[] args) {
		// �Ǽ� ����
		double latitude1 = 37.52127220511242;
		double longitude1 = 127.0074462890625;  // ����
		double latitude2 = 35.137879119634185;
		double longitude2 = 129.04541015625;  // �λ�
		
		// (����, �浵) ��ü
		Geo geo1 = new Geo();
		geo1.latitude = latitude1;
		geo1.longitude = longitude1;
		System.out.println(geo1.latitude + "\t" +geo1.longitude);
		
		Geo geo2 = new Geo();
		geo2.latitude = latitude2;
		geo2.longitude = longitude2;
		
		// ��ü ����
		Geo geo = geo1;
		System.out.println(geo.latitude + "\t" + geo.longitude);
	}
}
