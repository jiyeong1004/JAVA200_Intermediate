// 078. 문자열 1차원 배열 이해하기
package kr.co.infopub.chapter.s078;

public class StringArray {

	public static void main(String[] args) {
		// 동적 배열 생성 후 초기화 - 동적 배열은 다시 초기화할 수 있다. 새로운 문자열 배열을 생성하고 초기화한다.
		String[] myNum = new String[] {"2016-08-17", "2016-09-17", "2016-03-17"};
		// 정적 배열 생성 후 초기화 - 정적 배열은 다시 초기화할 수 없다.
		String[] myNum2 = {"2016-08-17", "2016-09-17", "2016-03-17"};
		System.out.println(myNum2[0]);
		print(myNum);
		// myNum2 = {"2016-08-17", "2016-09-17", "2016-03-17", "2016-04-17"};  // 다시 초기화 불가
		myNum = new String[] {"2016-08-17", "2016-09-17", "2016-03-17", "2016-04-17"};
		String[] tos = new String[myNum.length];
		System.arraycopy(myNum, 0, tos, 0, myNum.length);
		print(tos);
	}
	
	public static void print(String [] tos) {
		for(String ss : tos) {
			System.out.printf(ss + "\t");
		}
		System.out.println();
	}
}
