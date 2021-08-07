// 063. 수학 연산에서 발생하는 예외 처리하기
package kr.co.infopub.chapter.s063;

public class FinallyTryCatch {

	public static void main(String[] args) {
		try {
			// Divide by zero.
			int x = 5;
			int y = 20 / (5 - x);  // 여기에서 예외를 던진다.
			System.out.println(y);
		} catch(ArithmeticException e) {  // run time
			System.out.println("==> 0으로 나눴나 확인해 봐!!!");
			// e.printStackTrace();
		} finally {
			System.out.println("난 수행되어야만 해!!!");
		}
	}
}
