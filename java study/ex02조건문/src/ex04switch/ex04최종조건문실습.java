package ex04switch;

import java.util.Scanner;

public class ex04최종조건문실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자판기 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int myMoney = sc.nextInt();
		System.out.println("메뉴를 고르세요");
		System.out.println("1. 콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원) >>");
		int menu = sc.nextInt();
		
		int janMoney;
		
		switch (menu) {
		case 1:
			janMoney = myMoney - 800;
			break;
		case 2:
			janMoney = myMoney - 500;
			break;
		default:
			janMoney = myMoney - 1500;
			break;
		}
		if (janMoney >=0) {
			System.out.println("잔돈 " + janMoney);	
		} else {
			janMoney = myMoney;
			System.out.println("돈이 부족해요ㅠㅠ");
			System.out.println("잔돈: " + janMoney);
		}
		
		int _1000 = janMoney / 1000;
		int _500 = ( janMoney % 1000 ) / 500;
		int _100 = ( janMoney % 500) / 100;
		char _gae = '개';
		
		System.out.println("천원: "+ _1000+_gae 
				         + ", 오백원: " + _500+_gae 
				         + ", 백원: " + _100+_gae);
		
		
		sc.close();
	}

}
