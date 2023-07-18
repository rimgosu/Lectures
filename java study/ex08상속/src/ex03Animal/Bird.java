package ex03Animal;

public class Bird extends Animal {
	/*
	 * 조류는 동물이 가진 기능들을 다 가질 수 있다!
	 */
	public void egg() {
		System.out.println("알을 낳음");
	}
	/*
	 * 오버라이딩: move를 물려받긴 할 건데
	 * 안에 있는 로직을 다르게 구현하고 싶다!
	 * Alt+Shift+S
	 */
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("날아다닌당");
	}
	
	
}
