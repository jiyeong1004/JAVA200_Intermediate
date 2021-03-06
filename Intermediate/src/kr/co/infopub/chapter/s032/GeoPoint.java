// 032. 1, 2차원 배열로 위도, 경도 표현하기
package kr.co.infopub.chapter.s032;

/*
 * 배열은 참조 타입이다.
 * 배열은 new로 생성하는 동적 할당 배열과, new를 사용하지 않는 정적 할당 배열이 있다.
 * 이번 예제에서는 정적 할당 배열을 사용한다.
 * 정적 할당 배열은 두 번째 대입을 할 수 없다.
 * 
	double [] latlng1 = {37.5, 127.0};  // 선언 초기화
	// latlng1 = {36.4, 128.4};  // 두 번째 대입 불가능
 */

// 1차원 배열, 2차원 배열
public class GeoPoint {

	public static void main(String[] args) {
		// 실수 변수
		double latitude1 = 37.52127220511242;
		double longitude1 = 127.0074462890625;  // 서울
		double latitude2 = 35.137879119634185;
		double longitude2 = 129.04541015625;  // 부산
		System.out.println(latitude1 + "\t" + longitude1);
		
		// 실수 1차원 배열
		double [] latlng1 = {latitude1, longitude1};
		double [] latlng2 = {latitude2, longitude2};
		System.out.println(latlng1[0] + "\t" + latlng1[1]);
		
		// 실수 2차원 배열
		double [][] latlng = {{latitude1, longitude1},
							  {latitude2, longitude2}};
		System.out.println(latlng[0][0] + "\t" + latlng[0][1]);
	}
}
