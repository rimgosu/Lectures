package ex01변수;

public class EX05형변환 {
	public static void main(String[] args) {
		byte num1 = 100;
		int num2 = num1;        // 됨
		// byte num3 = num2;    // 안됨
		byte num3 = (byte)num2; // 됨
		byte num31 = (byte)300; // 44
		
		double num4 = 100.511;
		// int num5 = num4;     // 오류
		int num5 = (int)num4;   // 100
		
		float num6 = 3.14f;
		// int num7 = num6;     // 오류
		int num7 = (int)num6;   // 3
		
		int num8 = 100;
		float num9 = num8;      // 100.0
		
		System.out.println(num9);
	}
}
