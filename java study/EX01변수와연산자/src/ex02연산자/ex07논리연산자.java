package ex02연산자;

public class ex07논리연산자 {

	public static void main(String[] args) {
		// not, and, or
		System.out.println(!true);
		System.out.println(!false);
		
		int num1 = 10;
		int num2 = 5;
		int num3 = 3;
		int num4 = 7;
		System.out.println(num1 > num2 && num3 > num4);
		System.out.println(num1 > num2 && num3 < num4);
		
		System.out.println(num1 < num2 || num3 > num4);
		System.out.println(num1 > num2 || num3 < num4);
		
	}

}
