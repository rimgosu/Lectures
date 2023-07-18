package ex03for;

import java.util.Scanner;

public class ex03배수출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int inputNum = sc.nextInt();
		for (int i=1; i<=10; i++) {
			int result = i * inputNum;
			System.out.print(result + " ");
		}
	}

}
