// 066. String(문자열)을 이용해 도시 이름 비교하기
package kr.co.infopub.chapter.s066;

public class StringMain {

	public static void main(String[] args) {
		String city1 = "Asia";
		String city2 = "Europe";
		String city3 = new String("Asia");
		String city7 = "Asia";
		
		System.out.println(city1);
		System.out.println(city1.length());
		System.out.println(city1 == city2);
		System.out.println(city1.contentEquals(city2));
		System.out.println(city1 == city3);
		System.out.println(city1 == city7);
		System.out.println(city1.equals(city3));
		System.out.println(city1.equals(city7));
		
		String city4 = String.format("%s-%s", city1, city2);
		System.out.println(city4);
		String city5 = city1 + "-" + city2 + 1 + 2;
		System.out.println(city5);
		String city6 = 1 + 2 + city1 + "-" + city2;
		System.out.println(city6);
	}
}
