// 064. Object �����ϰ� ����ϱ�
package kr.co.infopub.chapter.s064;

public class UsingObject {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1.hashCode());  // native 10����
		System.out.println(Integer.toHexString(obj1.hashCode()));  // 16����
		System.out.println(obj1 == obj2);  // ��ü�� �����ϴ�.
		System.out.println(obj1.equals(obj2));  // ��ü�� �����ϴ�.
		System.out.println(obj1);
		System.out.println(obj2.toString());  // Class@hashCode()
		
		System.out.println(obj1.getClass().getName());  // Ŭ���� �̸�
		String str = obj1.getClass().getName() + "@" + Integer.toHexString(obj1.hashCode());  // 16����
		System.out.println(str);  // Ŭ���� �̸�@16���� �ؽ��ڵ�
		
		Object objstr = new String("Good");  // ������
		System.out.println(objstr.toString());
		System.out.println(objstr instanceof Object);
		System.out.println(objstr instanceof String);
		
		String hello = "hello";
		System.out.println(hello.getClass());  // Ŭ���� �̸�
	}
}
