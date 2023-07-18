package 인터페이스;

/**
 * 인터페이스를 통해 완성해보자!
 * 
 * implements:
 * 인터페이스를 사용하는 키워드
 * 
 * 추상클래스보다 훨씬 강조하는 형태
 * 인터페이스는 반드시 추상메서드, 상수만 포함 가능
 * + 다중 상속 가능:
 * 기능 확장을 용이하게 만들기 위해
 */
public class Pikca implements PokeMon{

	@Override
	public void atk() {
		// TODO Auto-generated method stub
		System.out.println("펀치");
	}
	@Override
	public void specialAtk() {
		// TODO Auto-generated method stub
		System.out.println("백만볼트");
	}
}
