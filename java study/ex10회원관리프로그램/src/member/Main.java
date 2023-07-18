/******************************
 * JDBC 순서:
 * 1. 드라이버 설치 (동적 로딩)
 * 2. 커넥션 열기
 * 3. SQL 문장 실행
 * 4. 종료 (연결 끊기)
 ******************************/
package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	/*****************************************
	 * 0. 드라이버 파일을 프로젝트 안에 넣어주기!
	 * : project - build path - external jar - 오라클 jdbc 폴더
	 * A. 드라이버 설치 (동적 로딩)
	 * B. 커넥션 열기 
	 * C. SQL문 실행
	 * D. 연결 끊기
	 *****************************************/
	
	/*********************************
	 * A.
	 * 예외 상황 발생:
	 * 오타 있으면 파일 못찾음.
	 * -> 마우스 대고 try - catch
	 * - 동적 로딩:
	 * 	 프로그램 실행 중에 필요한 모듈이나 라이브러리를
	 * 	 동적으로 로드하는 방식.
	 *********************************/
	/***********************************************************
	 * B.
	 * 커넥션 열기:
	 * - DB가 존재하는 URL, 아이디, 비밀번호
	 * 
	 * 다운그레이드:
	 * - project - properties - (검색) java compiler - version 1.8
	 ***********************************************************/
	/***********************************************************
	 * C.
	 * SQL문 실행:
	 * 1. SQL 문장이 이상 없는지 검토 받아야함 => psmt 객체
	 * psmt:
	 * 	sql문을 완성하고 실행할 수 있는 객체임
	 ***********************************************************/
	/*************************************
	 * D.
	 * finally:
	 * try문 다 실행 되거나 catch로 넘어간다고 하더라도
	 * 무조건 실행시키고 싶을 때 사용.
	 * 
	 * 연결 끊기:
	 * - 연결을 끊을 때는 역순으로 끊어준다.
	 *************************************/
	
	static String id;
	static String pw;
	static String nick;
	
	static String _id;
	static String _pw;
	static String _nick;
	
	public static void __JDBC__(int menuNum) {
		/*************
		 * try와 finally 둘 다 변수를 사용하기 위해 전역변수를 만들어줌
		 */

		int cnt=0;
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		boolean checkIdpw = false;
		
		try {
			/*
			 * A. 오라클 드라이버
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			/*
			 * B. 연결
			 * Connection conn = DriverManager.getConnection(db_url, db_id, db_pw);
			 */
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			if ( conn != null) {
				System.out.println("DB연결 성공!");
			} else {
				System.out.println("DB연결 실패...");
			}
			
			switch(menuNum) {
			case 1:
				/*
				 * C. SQL 문장 삽입
				 * PreparedStatement psmt = conn.prepareStatement(sql);
				 */
				String sql = "INSERT INTO MEMBER VALUES(?,?,?)";
				psmt = conn.prepareStatement(sql);
				// (?,?,?) => 각각 채워넣기
				psmt.setString(1, id);
				psmt.setString(2, pw);
				psmt.setString(3, nick);
				/*
				 * executeUpdate(); Update, Delete, Insert
				 * 실행한 문장의 개수를 int 형태로 반환
				 * executeQuery(); Select
				 */
				cnt = psmt.executeUpdate();
				break;
			case 2:
				String sql_4 = "SELECT * FROM MEMBER WHERE ID = (?) AND PW = (?)";
				psmt = conn.prepareStatement(sql_4);
				psmt.setString(1, id);
				psmt.setString(2, pw);
				rs = psmt.executeQuery();
				
				while(rs.next()) {
					_id = rs.getString("ID");
					_pw = rs.getString("PW");
					_nick = rs.getString("NICK");	
				}
				try {
					if (_id.equals(id) && _pw.equals(pw)) {
						checkIdpw = true;
						System.out.println(_nick + "님 로그인 성공하셨습니다!");
					}
				} catch (Exception e) {
					  // do nothing
				}

				
				break;
			case 3:
				String sql_3 = "SELECT * FROM MEMBER";
				psmt = conn.prepareStatement(sql_3);
				
				rs = psmt.executeQuery();
				
				System.out.println("id\t\t\tpw\t\t\tnick");
				while(rs.next()) {
					_id = rs.getString(1);
					_pw = rs.getString(2);
					_nick = rs.getString(3);
					
					System.out.print(String.format("%-" + 16 + "s", _id));
					System.out.print("\t");
					System.out.print(String.format("%-" + 16 + "s", _pw));
					System.out.print("\t");
					System.out.print(String.format("%-" + 16+ "s", _nick));
					System.out.println();
				}
				break;
			case 4:
				String sql_1 = "UPDATE MEMBER SET PW = (?) WHERE ID = (?)";
				psmt = conn.prepareStatement(sql_1);
				
				psmt.setString(1, pw);
				psmt.setString(2, id);
				
				cnt = psmt.executeUpdate();
				break;
			case 5:
				String sql_2 = "DELETE FROM MEMBER WHERE ID = (?) AND PW = (?)";
				psmt = conn.prepareStatement(sql_2);
				
				psmt.setString(1, id);
				psmt.setString(2, pw);
				
				cnt = psmt.executeUpdate();
				break;
			default:
				break;
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			/************************
			 * sqlException:
			 * add catch 클릭!
			 * id, pw 다르면 null을 반환.
			 ************************/
			e.printStackTrace();
		} finally {
			/*
			 * D. 연결 끊기
			 */
			try {
				/**
				 * 반드시 자원은 사용한 순서 역순으로 반납해야 한다.
				 */
				if(rs != null)
					rs.close();
				if(psmt != null)
					psmt.close();
				if(conn != null)
					conn.close();
				
				
			} catch (SQLException e) {
				System.out.println("자원 반납 오류");
				e.printStackTrace();
			}
		}
		String[] arr = {"회원가입", "로그인", "회원목록조회", "정보수정", "회원탈퇴"};
		
		if (cnt > 0 ||  rs != null) {
			if (!checkIdpw) {
				System.out.println("로그인 실패...");
			} else {
				System.out.println(arr[menuNum-1] + " 성공!");
			}
			
		} else {
			System.out.println(arr[menuNum-1] + " 실패...");
		}
	}
	public static void __1__() {
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
		System.out.print("비밀번호 입력 : ");
		pw = sc.next();
		System.out.print("닉네임 입력 : ");
		nick = sc.next();
		
		__JDBC__(1);

	}
	public static void __2__() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		id = sc.next();
		System.out.print("비밀번호 입력 : ");
		pw = sc.next();
		__JDBC__(2);
	}
	
	public static void __3__() {
		__JDBC__(3);
	}
		
	
	public static void __4__(){
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호를 바꾸고 싶은 아이디 입력 >> ");
		id = sc.next();
		System.out.print("새 비밀번호 >>");
		pw = sc.next();
		
		__JDBC__(4);
		
	}
	
	public static void __5__(){
		Scanner sc = new Scanner(System.in);
		System.out.print("회원 탈퇴 아이디 >> ");
		id = sc.next();
		System.out.print("회원 탈퇴 비밀번호 >>");
		pw = sc.next();
		
		__JDBC__(5);
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean breaker = false;
		/**
		 * CRUD:
		 * Create / Remove / Update / Delete
		 * 
		 * 1. 회원가입:	insert
		 * 2. 로그인:		select
		 * 3. 회원목록:	select
		 * 4. 회원정보수정:	update
		 * 5. 회원탈퇴:	delete
		 */
		
		while(true) {
			System.out.print("1.회원가입 2.로그인 3.회원목록 4.회원정보수정 5.회원탈퇴 6.종료 >>");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				__1__();
				break;
			case 2:
				__2__();
				break;
			case 3:
				__3__();
				break;
			case 4:
				__4__();
				break;
			case 5:
				__5__();
				break;
			case 6:
				breaker = true;
				System.out.println("프로그램 종료.");
				break;
			default:
				System.out.println("정확한 숫자를 입력해주세요!");
			}
			if (breaker) {
				break;
			}
		}
		
		
	}

}
