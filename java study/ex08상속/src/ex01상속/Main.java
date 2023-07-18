package ex01상속;

public class Main {

	public static void main(String[] args) {
		/*
		 * 상속 -> 부모클래스의 코드를 자식 클래스에서 물려받아 사용하는 것
		 * 예외
		 * : 메소드나 필드 앞에 private라고 되어있으면 물려받지 못한다
		 * 
		 * 프로그래밍에서는 상속을 단순히 물려받는거에 그치는게 아니라
		 * 물려받은 후 자식클래스에 특성에 맞게 확장시키는 개념으로 생각한다
		 * 
		 * 자바의 상속을 할 때는 extends라는 키워드를 사용한다
		 * 
		 * 부모클래스를 super class라고 부르며
		 * 자식클래스를 sub class라고 부른다
		 * 
		 * 상속의 특징
		 * 1. 동시에 두 개 이상의 상속을 받을 수 없다
		 * 2. 상속을 여러번 해주는 것은 상관없다.
		 * 3. 모든 클래스는 최상위 부모로 object 클래스를 가지게 된다.
		 */
		Animal a = new Animal();
		a.swimming();
		Cat b = new Cat();
		b.swimming();
	}

}
