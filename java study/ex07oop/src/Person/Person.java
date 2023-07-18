package Person;

public class Person {
	/* 사람에 대한 설계도 : Class 
	 * 1. Field
	 * : 객체가 가질 수 있는 속성, 데이터, 변수
	 */
	String name;
	String gender;
	String local;
	int age;
	int height;
	
	/*
	 * 2. Method
	 * : 객체가 할 수 있는 공통적인 행위, 행동, 기능
	 */
	public void breathe() {
		System.out.println("나는 숨을 쉬는 중");
	}
	public void sleep() {
		System.out.println("쿨쿨 잠을 자는 중");
	}
	public void eat() {
		System.out.println("우걱우걱 밥을 먹는 중");
	}
	
	/*
	 * 3. 생성자
	 * public Person(){} (기본 생성자)
	 * : 1) 생성자도 매서드임
	 *   2) 생성자의 이름(매서드 명) = 클래스의 이름
	 *   3) 기본생성자는 생략 가능
	 *   4) 새로운 생성자 만들면 생략되어있던 기본생성자는 사용x
	 *   	기본 생성자도 사용하고 싶으면 눈에 보이게 코드로 작성
	 */
	public Person() {}
	public Person(
			String name,
			int age,
			String gender,
			int height,
			String local
			) {
		/*
		 *  Person()을 오버로딩
		 *  this: 현재 클래스를 지칭하는 키워드
		 */
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.height=height;
		this.local=local;
	}
}
