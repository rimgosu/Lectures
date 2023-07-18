package ex02dowhile;

import java.util.Scanner;

public class ex02합계와평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = -1;
		double avg;
		int num;
		double temp;
		do {
			System.out.println("숫자를 입력하세요");
			num = sc.nextInt();
			sum += num;
			i++;
		} while (num <100);
		
		
		switch(i) {
		case 0:
			System.out.println("최소 하나 이상의 값");
			break;
		default:
			sum -= num;
			avg = (double)sum/i;
			temp = (int) (avg * 100);
			avg = temp/100;
			System.out.println("합계: " + sum);
			System.out.println("평균: " + avg);
		}
		
		
		
		sc.close();
	}

}
