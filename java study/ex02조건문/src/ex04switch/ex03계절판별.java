package ex04switch;

import java.util.Scanner;

public class ex03계절판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("월 입력: ");
		int inputNumber = sc.nextInt();
		System.out.print(inputNumber + "월은 ");
		switch ( inputNumber / 3 ) {
		case 0:
			System.out.println("겨울입니다!");
			break;
		case 1:
			System.out.println("봄입니다!");
			break;
		case 2:
			System.out.println("여름입니다!");
			break;
		default:
			System.out.println("가을입니다!");
			break;
		}
		sc.close();
	}

}
