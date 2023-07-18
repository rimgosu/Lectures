package ex03다중if_else;

import java.util.Scanner;

public class ex02학점판별기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		if (score >=90) {
			System.out.println("A학점입니다.");
		} else if (score >=80) {
			System.out.println("B학점입니다");
		} else if (score >=70) {
			System.out.println("C학점입니다");
		} else {
			System.out.println("F학점입니다");
		}
		sc.close();
	}

}
