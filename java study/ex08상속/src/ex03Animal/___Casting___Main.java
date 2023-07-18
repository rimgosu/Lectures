package ex03Animal;

public class ___Casting___Main {
	public static void main(String[] args) {
		Animal a = new Animal();
		Bird b = new Bird();
		Penguin p = new Penguin();
		p.move();
		p.cry();
		
		/*
		 * 캐스팅(Casting)
		 * - 기본 데이터 타입에 대한 형변환
		 * - 객체의 타입에 대한 형변환 -> 객체의 타입을 바꾸는
		 * 단, 반드시 상속의 개념이 있어야 한다!!
		 * 
		 * 1) Up Casting 
		 * 묵시적(자동) 형변환 -> 업캐스팅 개념
		 * : 자식 클래스가 부모 클래스의 타입으로 변형 되는 것
		 * Bird b1 ----> Animal b1
		 * ---> 조류는 동물이다. (o)
		 * 
		 * a2는 Animal 자료형 = Bird자료형을 대입
		*/
		/**
		 * 부모 변수 = new 자식(); = 업캐스팅
		 */
		Animal a2 = new Bird();
		/*
		 * Bird만 가지고 있던 고유한 기능 사용 불가
		 * a2.egg(); (x)
		 * a2.cry(); (o)
		 * a2.move(); (o) -- 날아다닌당
		 * Animal로부터 물려받아 오버라이딩한 메서드로 사용됨
		 */
		a2.cry();
		a2.move();
		
		/*
		 * 2) 명시적(각제) 형변환 -> 다운캐스팅 개념
		 * : 부모 클래스가 자식 클래스로 타입이 변형되는 것
		 * + (업캐스팅이 한번이라도 되었던 변수만 다운 캐스팅 가능)
		 * 업캐스팅 되었던 a2만 다운캐스팅 가능
		 */
		Bird b2 = (Bird) a2;
		b2.cry();
		b2.move();
	}
}
