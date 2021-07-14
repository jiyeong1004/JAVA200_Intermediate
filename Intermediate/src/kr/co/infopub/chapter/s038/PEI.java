package kr.co.infopub.chapter.s038;

// ��� ���� Ŭ���� - enum
public enum PEI {
	PHYSICAL(23), EMOTIONAL(28), INTELLECTUAL(33);
	private final int peiValue;
	PEI(int pie){
		this.peiValue = pie;
	}
	public int getPei() {
		return peiValue;
	}
}
enum FRUIT {
	APPLE, BANANA, MANGO
}
