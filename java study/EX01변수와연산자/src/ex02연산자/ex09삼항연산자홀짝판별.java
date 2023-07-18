package ex02연산자;

import java.util.Scanner;

public class ex09삼항연산자홀짝판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("정수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num%2;
		String result = temp ==0 ? "짝수입니다":"홀수입니다";
		System.out.println(num+"는(은) " + result);
		sc.close();
	}

}
