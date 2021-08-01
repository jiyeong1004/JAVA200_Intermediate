// 057. foreach와 Lambda 형식을 이용하여 List 출력하기
package kr.co.infopub.chapter.s057;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachLambdaLotto {

	public static void main(String[] args) {
		List<Integer> mmlists = Arrays.asList(1, 6, 16, 22, 23, 33);
		mmlists.forEach(
				m -> {System.out.printf(m + "\t");}
		);
		System.out.println();
		Consumer<Integer> consume = (Integer m) -> {System.out.printf(m + "\t");};
		mmlists.forEach(consume);
	}
}
