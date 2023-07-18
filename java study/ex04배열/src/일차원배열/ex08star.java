package 일차원배열;

import java.util.Scanner;

public class ex08star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<arr.length; i++) {
			System.out.print(i + "번째 별의 개수 입력 >>");
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " : ");
			for (int j=0; j<arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
