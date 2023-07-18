package as_student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void viewTitle() {
		System.out.println("=======================학점 관리 프로그램===============================");
	}
	public static void viewControll() {
		System.out.print("[1]성적입력 [2]전체조회 [3]학생검색 [4]프로그램 종료 >> ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean breaker = false;
		Controller c = new Controller();
		ArrayList<Student> stu = new ArrayList<>();
		
		
		viewTitle();
		while (true) {
			viewControll();
			int inputNum = sc.nextInt();
			switch (inputNum) {
			case 1:
				c.__1__(stu);
				break;
			case 2:
				c.__2__(stu);
				break;
			case 3:
				c.__3__(stu);
				break;
			case 4:
				breaker =true;
				break;
			}
			if (breaker) {
				break;
			}
		}
		
		
		
	}

}
