// 064. Object 이해하고 사용하기
package kr.co.infopub.chapter.s064;

public class UsingObject {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1.hashCode());  // native 10진수
		System.out.println(Integer.toHexString(obj1.hashCode()));  // 16진수
		System.out.println(obj1 == obj2);  // 객체는 고유하다.
		System.out.println(obj1.equals(obj2));  // 객체는 고유하다.
		System.out.println(obj1);
		System.out.println(obj2.toString());  // Class@hashCode()
		
		System.out.println(obj1.getClass().getName());  // 클래스 이름
		String str = obj1.getClass().getName() + "@" + Integer.toHexString(obj1.hashCode());  // 16진수
		System.out.println(str);  // 클래스 이름@16진수 해시코드
		
		Object objstr = new String("Good");  // 다형성
		System.out.println(objstr.toString());
		System.out.println(objstr instanceof Object);
		System.out.println(objstr instanceof String);
		
		String hello = "hello";
		System.out.println(hello.getClass());  // 클래스 이름
	}
}
