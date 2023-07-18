package 도서관리프로그램;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean breaker = false;
		String title = "defaultTitle";
		String name = "defaultName";
		int price = 0;
		String num = "defaultNum";
		
		while(true) {
			System.out.print("[1]도서등록 [2]도서조회 [3]도서검색 [4]종료 >> ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.print("책 제목 : ");
				title = sc.next();
				System.out.print("책 저자 : ");
				name = sc.next();
				System.out.print("책 가격 : ");
				price = sc.nextInt();
				System.out.print("책 번호 : ");
				num = sc.next();
				
				BookVO vo = new BookVO(title, name, price, num);
				Controller con = new Controller();
				con.insert(vo);
				
				break;
			case 2:
				Controller con_1 = new Controller();
				con_1.select();
				break;
			case 3:
				System.out.print("[1]책제목으로 검색 [2]저자로 검색 [3]가격으로 검색 [4]책번호로 검색: ");
				int inputNum = sc.nextInt();
				switch(inputNum) {
				case 1:
					System.out.print("책 제목 : ");
					title = sc.next();
					break;
				case 2:
					System.out.print("책 저자 : ");
					name = sc.next();
					break;
				case 3:
					System.out.print("책 가격 : ");
					price = sc.nextInt();
					break;
				case 4:
					System.out.print("책 번호 : ");
					num = sc.next();
					break;
				}
				
				BookVO _vo = new BookVO(title, name, price, num);
				Controller con_2 = new Controller();
				con_2.search(_vo);
				break;
			case 4:
				breaker = true;
				break;
			default:
				System.out.println("다시 입력해주세요");
			}
			if (breaker)
				break;
		}
	}
}
