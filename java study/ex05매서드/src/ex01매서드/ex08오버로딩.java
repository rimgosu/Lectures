package ex01매서드;

public class ex08오버로딩 {
	public static void sum(int num1, int num2) {
		System.err.println(num1+num2);
	}
	public static void sum(int num1, int num2, int num3) {
		System.err.println(num1+num2+num3);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자를 두개를 더해주는 기능 sum2
		// 숫자 세개를 더해주는 기능 sum3
		sum(2,3);
		sum(2,3,4);
	}

}
