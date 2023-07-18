package ex03Animal;

public class Penguin extends Bird {
	
	/*
	 * super.cry();
	 * 그 전에 있던 매서드를 이용합니다.
	 */
	@Override
	public void move() {
		System.out.println("헤엄친당");
	}
	public void cry() {
		System.out.println("꿱꿱울당");
	}
	
}
