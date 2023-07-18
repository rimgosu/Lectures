package ex01상속;

/*
 * 클래스명 앞에 final = 이 클래스는 최종수정 X
 * 상속 불가능함
 * public final class Animal {
 */

public class Animal {
	String name;
	/*
	 * private void swimming() {
	 * 상속 불가능함
	 */
	public void swimming() {
		System.out.println("어푸어푸");
	}
}
