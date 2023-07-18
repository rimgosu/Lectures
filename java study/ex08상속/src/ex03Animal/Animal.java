package ex03Animal;

public class Animal {
	/*
	 * 동물 설계도
	 * 1) 필드
	 */
	String name;
	String gender;
	
	/*
	 * 2) 매서드
	 */
	public void breath() {
		System.out.println("숨쉰다");
	}
	public void move() {
		System.out.println("네 발로 걸어다닌다");
	}
	public void cry() {
		System.out.println("운다");
	}
}
