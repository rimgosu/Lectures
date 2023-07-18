package member_1;

import java.util.Scanner;

public class Main {
	
	static String id;
	static String pw;
	static String nick;
	
	public static void main(String[] args) {
		boolean breaker= false;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1.회원가입 2.로그인 3.회원목록 4.회원정보수정 5.회원탈퇴 6.종료 >>");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				__1__();
				break;
			case 2:
				__login__();
				break;
			case 3:
				__select__();
				break;
			case 4:
				__4__();
				break;
			case 5:
				__5__();
				break;
			case 6:
				breaker = true;
			}
			if (breaker) {
				break;
			}
		}
		
	}
	public static void __1__() {
		MemberDAO dao = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("==============회원가입===================");
		/*`
		 * 아이디, 비밀번호, 닉네임
		 * 
		 * next:
		 * 띄어쓰기 허용x
		 * Hello world -> Hello
		 * 
		 * nextLine:
		 * 띄어쓰기 포함
		 * Hello world! => Hello world!
		 */
		System.out.print("아이디 입력 : ");
		id = sc.next();
		dao.setId(id);
		System.out.print("비밀번호 입력 : ");
		pw = sc.next();
		dao.setPw(pw);
		System.out.print("닉네임 입력 : ");
		nick = sc.next();
		dao.setNick(nick);
		
		dao.__JDBC__(1);

	}
	
	public static void __2__() {
		MemberDAO dao = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		id = sc.next();
		dao.setId(id);
		System.out.print("비밀번호 입력 : ");
		pw = sc.next();
		dao.setPw(pw);
		dao.__JDBC__(2);
	}
	
	public static void __select__() {
		MemberDAO dao = new MemberDAO();
		dao.select();
	}
	
	public static void __3__() {
		MemberDAO dao = new MemberDAO();
		dao.__JDBC__(3);
	}
		
	
	public static void __4__(){
		MemberDAO dao = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호를 바꾸고 싶은 아이디 입력 >> ");
		id = sc.next();
		dao.setId(id);
		System.out.print("새 비밀번호 >>");
		pw = sc.next();
		dao.setPw(pw);
		
		dao.__JDBC__(4);
	}
	
	public static void __login__() {
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		System.out.print("아이디 입력 : ");
		id = sc.next();
		dao.setId(id);
		System.out.print("비밀번호 입력 : ");
		pw = sc.next();
		dao.setPw(pw);
		MemberVO info = dao.login(id,pw);
		if (info != null) {
			System.out.println(info.getNick() + "님 환영합니다!");
		} else {
			System.out.println("로그인 실패");
		}
	}
	
	public static void __5__(){
		MemberDAO dao = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		System.out.print("회원 탈퇴 아이디 >> ");
		id = sc.next();
		dao.setId(id);
		System.out.print("회원 탈퇴 비밀번호 >>");
		pw = sc.next();
		dao.setPw(pw);
		
		dao.__JDBC__(5);
	}
}
