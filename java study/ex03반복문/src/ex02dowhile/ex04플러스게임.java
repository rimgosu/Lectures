package ex02dowhile;

import java.util.Random;
import java.util.Scanner;

public class ex04플러스게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Random rd = new Random();
		String _yn;
		int cnt = 0;
		int life = 3;

		System.out.println("====Plus Game====");
		int num1 = rd.nextInt(10) + 1;
		int num2 = rd.nextInt(10) + 1;
		while (true) {
			System.out.print(num1 + "+" + num2 + "=");
			int inputNum = sc.nextInt();
			int answer = num1 + num2;
			if (inputNum == answer) {
				System.out.println("Success!!!");
				num1 = rd.nextInt(10) + 1;
				num2 = rd.nextInt(10) + 1;
				cnt++;
			} else {
				System.out.println("Fail....");
				life--;
				System.out.println("남은 목숨:" + life);
			}
			if (life == 0) {
				System.out.println("성공 갯수: " +cnt);
				System.out.println("게임 종료");
				break;
			}
			System.out.print("계속 하시겠습니까 >>");
			_yn = sc2.next();
			if (_yn.equals("y") || _yn.equals("Y")) {
			} else {
				break;
			}
		}
		

	}

}
