package 도서관리프로그램;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO {
	
	/**
	 * DB에 접근해서 도서등록에 필요한 데이터들을 저장
	 */
	public int insert(BookVO vo) {
		Connection conn = null;
		PreparedStatement psmt = null;
		int row = 0;
		
		/**
		 * 1) 드라이버 동적로딩
		 */
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/**
			 * 준비물 3가지 : 주소, 아이디, 비밀번호
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
			
			/**
			 * 2)SQL문 준비
			 */
			String sql = "INSERT INTO BOOK VALUES(?,?,?,?)";
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getName());
			psmt.setInt(3, vo.getPrice());
			psmt.setString(4, vo.getNum());
			
		    row = psmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		} finally {
			try {
				if(psmt != null)
					psmt.close();
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/**
		 * 데이터베이스 저장 성공여부 결과값 처리는
		 * Controller로 보내주기
		 */
		return row;
	
	}

	public ArrayList<BookVO> select() {
		Connection conn = null;
		PreparedStatement psmt = null;
		int cnt = 0;
		ResultSet rs = null;
		ArrayList<BookVO> bookList = new ArrayList<BookVO>();
		
		/**
		 * 1) 드라이버 동적로딩
		 */
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/**
			 * 준비물 3가지 : 주소, 아이디, 비밀번호
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
			
			/**
			 * 2)SQL문 준비
			 */
			String sql = "SELECT * FROM BOOK";
			
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			
			System.out.println("title\tname\tprice\tnum");
			while(rs.next()) {
				String title = rs.getString(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				String num = rs.getString(4);
				
				BookVO vo = new BookVO(title, name, price, num);
				bookList.add(vo);
			}
			cnt = psmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if(psmt != null)
					psmt.close();
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/**
		 * 데이터베이스 저장 성공여부 결과값 처리는
		 * Controller로 보내주기
		 */
		return bookList;
	
	}


	public int search(BookVO vo) {
		Connection conn = null;
		PreparedStatement psmt = null;
		int cnt = 0;
		ResultSet rs = null;
		
		/**
		 * 1) 드라이버 동적로딩
		 */
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/**
			 * 준비물 3가지 : 주소, 아이디, 비밀번호
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
			
			/**
			 * 2)SQL문 준비
			 */
			String sql = "SELECT * FROM BOOK WHERE TITLE LIKE (?) OR NAME LIKE (?) OR PRICE LIKE (?) OR NUM LIKE (?)";
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "%" + vo.getTitle() +"%");
			psmt.setString(2, "%" + vo.getName() +"%");
			psmt.setInt(3, vo.getPrice());
			psmt.setString(4, "%" +vo.getNum()+"%");
			
			rs = psmt.executeQuery();
			
			System.out.println("title\tname\tprice\tnum");
			while(rs.next()) {
				String title = rs.getString(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				String num = rs.getString(4);
				
				System.out.print(title);
				System.out.print("\t");
				System.out.print(name);
				System.out.print("\t");
				System.out.print(price);
				System.out.print("\t");
				System.out.print(num);
				System.out.println();
			}
			cnt = psmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if(psmt != null)
					psmt.close();
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/**
		 * 데이터베이스 저장 성공여부 결과값 처리는
		 * Controller로 보내주기
		 */
		return cnt;
	
	}


}


