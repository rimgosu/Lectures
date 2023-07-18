package ex03for;

import java.util.Scanner;

public class ex08약수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int inputNum = sc.nextInt();
		System.out.print(inputNum + "의 약수 : ");
		for (int i=1; i <=inputNum; i++ ) {
			if (inputNum % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
