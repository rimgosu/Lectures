package boksoup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void __1__() {
		Scanner sc = new Scanner(System.in);
		System.out.print("회원 id 입력");
		String id = sc.next();
		System.out.print("회원 pw 입력");
		String pw = sc.next();
		System.out.print("회원 닉네임 입력");
		String nick = sc.next();
		
	}
	
	public static void __JDBC__() {
		/*************
		 * try와 finally 둘 다 변수를 사용하기 위해 전역변수를 만들어줌
		 */
		int cnt=0;
		Connection conn = null;
		PreparedStatement psmt = null;
		
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
			
			/*
			 * C. SQL 문장 삽입
			 * PreparedStatement psmt = conn.prepareStatement(sql);
			 */
			String sql = "select * from member";
			psmt = conn.prepareStatement(sql);
			/*
			 * executeUpdate(); sql 문장을 실행하는 메소드
			 * 실행한 문장의 개수를 int 형태로 반환
			 */
			ResultSet rs = psmt.executeQuery();
		
			while (rs.next()) {
			    String memberId = rs.getString("id");
			    String memberName = rs.getString("pw");
			    String memberEmail = rs.getString("nick");

			    System.out.println("Member ID: " + memberId);
			    System.out.println("Member Name: " + memberName);
			    System.out.println("Member Email: " + memberEmail);
			    System.out.println("---------------------------");
			}
			rs.close(); 
			
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
				psmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (cnt > 0 ) {
			System.out.println("회원가입 성공!");
		} else {
			System.out.println("회원가입 실패...");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		__JDBC__();
	}

}
