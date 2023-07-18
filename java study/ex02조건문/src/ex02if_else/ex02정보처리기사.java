package ex02if_else;

import java.util.Scanner;

public class ex02정보처리기사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB : ");
		int num1 = sc.nextInt();
		System.out.print("전자계산기 구조 : ");
		int num2 = sc.nextInt();
		System.out.print("OS : ");
		int num3 = sc.nextInt();
		System.out.print("데이터통신 : ");
		int num4 = sc.nextInt();
		System.out.print("소프트웨어공학 : ");
		int num5 = sc.nextInt();
		
		int _five = 0;
		int _sixty;
		
		_sixty = num1+num2+num3+num4+num5;
		
		if (num1>=8) { _five++;}
		if (num2>=8) { _five++;}
		if (num3>=8) { _five++;}
		if (num4>=8) { _five++;}
		if (num5>=8) { _five++;}
		
		if (_five ==5 && _sixty >=60) {
			System.out.println("합격입니다!");
		} else {
			System.out.println("불합격입니다!");
		}
		
		sc.close();
	}

}
