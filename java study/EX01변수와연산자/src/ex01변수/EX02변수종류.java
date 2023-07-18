package ex01변수;

public class EX02변수종류 {
	public static void main(String[] args) {
		int myAge = 31;
		int yourAge = 32;

		////////////////
		int copy;
		copy = myAge;
		myAge = yourAge;
		yourAge = copy;

		////////////////
		//자동정렬 : ctrl +shift + f

		System.out.println("나의 나이 : " + myAge);
		System.out.println("짝궁의 나이 : " + yourAge);
	}
}
