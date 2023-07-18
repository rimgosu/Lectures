package ex02조건문;

import java.util.Scanner;

public class ex02배수판별 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		if (num%3==0) {
			if(num%5==0) {
				System.out.println(
						num+"->"+num+"(은)는 3의 배수이면서 5의 배수입니다"
						);
			}
		}
		
		sc.close();
		
	}
}
