package ex04switch;

import java.util.Scanner;

public class ex02switch홀짝판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int inputNumber = sc.nextInt();
		int temp = inputNumber % 2;
		
		switch (temp) {
		case 0:
			System.out.println("짝수입니다!");
			break;
		default:
			System.out.println("홀수입니다!");
			}
		sc.close();
	}

}
