package 일차원배열;

import java.util.Scanner;

public class ex06배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"수","박" };
		System.out.println("==== 수박 게임 Start! ====");
		System.out.print("숫자를 입력해주세요>>");
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		for (int i=0; i<inputNum; i++) {
			if (i%2==0) {
				System.out.print(arr[0]);
			} else
				System.out.print(arr[1]);
		}
	}

}
