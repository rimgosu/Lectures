package Person;

public class Main {

	public static void main(String[] args) {
		/* Class가 실행되는 공간
		 * 설계도를 사용해서 Object(객체)를 만드는 공간 
		 * Person() => 괄호를 생성자라고 함
		 */
		
		
		Person p1 = new Person();
		p1.name = "변지협";
		p1.gender = "남";
		p1.age = 31;
		p1.height = 188;
		
		System.out.println(p1.name);
		System.out.println(p1.gender);
		System.out.println(p1.age);
		System.out.println(p1.height);
		
		p1.breathe();
		p1.sleep();
		p1.eat();
		
		Person p2 = new Person();
		p2.name = "편승훈";
		p2.gender = "남";
		p2.age = 31;
		p2.height = 181;
		p2.local = "광주";
		
		System.out.println(p2.name);
		System.out.println(p2.gender);
		System.out.println(p2.age);
		System.out.println(p2.height);
		System.out.println(p2.local);
		
		System.out.println(p1);
		
		
		Person p3 = new Person("조자연", 20, "여자", 164, "광주");
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.gender);
		System.out.println(p3.height);
		System.out.println(p3.local);
	}

}
