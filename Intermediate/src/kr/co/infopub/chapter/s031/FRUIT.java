package kr.co.infopub.chapter.s031;

/*
 * enum 을 int로 변환하거나 대입할 수 없다.
 * int a = FRUIT.APPLE; 형식은 예외가 발생한다.
 * 꼭 변환해서 사용하고 싶다면 순서를 나타내는 ordinal()을 이용한다.
 * 메서드가 없는 기본 enum은 연산에 적합하지 않으며 if, switch와 같은 분기문에 사용한다.
 */
public enum FRUIT {
	APPLE, BALALA, MANGO
}
