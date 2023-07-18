//package ex02dowhile;
//
//import java.util.Scanner;
//
//public class ex03로그인프로그램 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		final String id = "hello";
//		final String pw = "1234";
//		Scanner sc = new Scanner(System.in);
//		do {
//			String _id;
//			String _pw;
//			System.out.println("아이디를 입력해 주세요");
//			_id = sc.nextLine();
//			System.out.println("비밀번호를 입력해 주세요");
//			_pw = sc.next();
//			System.out.println(_id + _pw);
//			if(pw.equals(_pw) && id.equals(_id)) {
//				System.out.println("로그인 성공!");
//				break;
//			} else {
//				System.out.println("아이디와 비밀번호가 잘못되었습니다.");
//			}
//		} while(true);
//	}
//
//}



package ex02dowhile;

import java.util.Scanner;

public class ex03로그인프로그램 {

    public static void main(String[] args) {
        final String id = "hello";
        final String pw = "1234";
        Scanner sc = new Scanner(System.in);
        do {
            String _id;
            String _pw;
            System.out.println("아이디를 입력해 주세요");
            _id = sc.nextLine();
            System.out.println("비밀번호를 입력해 주세요");
            _pw = sc.nextLine();
            if (pw.equals(_pw) && id.equals(_id)) {
                System.out.println("로그인 성공!");
                break;
            } else {
                System.out.println("아이디와 비밀번호가 잘못되었습니다.");
            }
        } while (true);

        sc.close(); // Scanner 객체 닫기
    }
}
