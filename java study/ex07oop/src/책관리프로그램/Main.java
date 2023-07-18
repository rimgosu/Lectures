package 책관리프로그램;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 객체 배열
		 * vo --> value object
		 * ex) 사람 : 이름 String, 나이 int, 성별 char
		 *     이걸 다 담을 vo가 필요하다
		 * 자료형[] 레퍼런스변수명 = new 자료형[배열의크기];
		 * BookData[] bookList = new BookData[5];
		 */
		BookData[] bookList = new BookData[5];
		bookList[0] = new BookData("Java", 21000, "홍길동");
		bookList[1] = new BookData("C++", 29000, "박문수");
		bookList[2] = new BookData("Database", 31000, "김장독");
		bookList[3] = new BookData("Android", 18000, "이순신");
		bookList[4] = new BookData("Web", 26000, "김철수");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int inputNum = sc.nextInt();
		System.out.println("구매 가능한 책 목록");
		for (int i=0; i<bookList.length; i++) {
			if (bookList[i].getPrice() <=inputNum) {
				bookList[i].showInformation();
			}
		}
		
		
	}

}
