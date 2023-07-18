package ex01매서드;

public class ex06예제 {
	public static int largerNumber(int a, int b) {
		if (a > b) {
			return a;
		} else if (a== b) {
			return 0;
		} return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2개의 양수를 받아 
		int num1 = 10;
		int num2 = 24;
		int result = largerNumber(num1, num2);
		System.out.println("큰 수 확인: " + result);
	}

}
