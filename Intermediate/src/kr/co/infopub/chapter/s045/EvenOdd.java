// 045. for를 이용하여 1이 될 때까지 나누고 곱하기
package kr.co.infopub.chapter.s045;

// while로 사용하는 for
public class EvenOdd {
	public static void showOddnEvenf(int n) {
		int temp = n;
		for(; temp != 1 ;) {
			if(temp % 2 == 1) {  // 홀수
				temp = temp * 3 + 1;
			} else {  // 짝수
				temp /= 2;
			}
			System.out.print("[" + temp + "]");
		}
		System.out.println("\n---------------------");
	}
	
	public static void main(String[] args) {
		showOddnEvenf(122);
	}
}
