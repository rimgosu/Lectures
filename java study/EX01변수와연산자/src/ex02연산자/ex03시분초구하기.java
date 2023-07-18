package ex02연산자;

import java.util.Scanner;

public class ex03시분초구하기 {
	//3자리 숫자를 입력받아 십의자리 이하의 값을 다 버리기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 >> ");
		int num = sc.nextInt();
		
		num = num/100;
		num = num*100;
		
		System.out.println("결과확인 >> " + num);
		sc.close();
	}

}
