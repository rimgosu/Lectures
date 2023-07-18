package 일차원배열;

import java.util.Scanner;

public class ex04입력배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번 숫자 :
		// 2번 숫자 :
		// ..
		// 6번 숫자 :
		// 1) 입력하는 도구 가져오기
		// 2
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		for (int i=0; i<6; i++) {
			System.out.print((i+1) +"번 숫자: ");
			int inputNum = sc.nextInt();
			arr[i] = inputNum;
		}
		System.out.print("arr: ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
