// 034. if 조건문을 이용하여 짝, 홀수 판별하기
package kr.co.infopub.chapter.s034;

// if condition
public class EvenOddIfCondition {

	public static void main(String[] args) {
		int temp = 99;
		if(temp % 2 == 1) {  // 홀수
			temp = temp * 3 + 1;
		} else {
			temp = temp / 2;
		}
		System.out.printf("계산 후 = %d\n", temp);
	}
}
