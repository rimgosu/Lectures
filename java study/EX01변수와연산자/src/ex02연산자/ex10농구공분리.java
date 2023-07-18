package ex02연산자;

import java.util.Scanner;

public class ex10농구공분리 {
	public static void main(String[] args) {
		System.out.print("농구공의 개수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		boolean temp = inputNum%5 ==0 ? true : false;
		int result = temp ? inputNum/5 : inputNum/5 +1 ;
		
		
		System.out.print("필요한 상자의 수: " + result);
		sc.close();
		
	}
}
