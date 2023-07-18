package member_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	/*
	 * DB에 연결하고 사용하는 것을 담담하는 클래스
	 */
	String id;
	String pw;
	String nick;
	
	String _id;
	String _pw;
	String _nick;
	
	public void set_id(String _id) {
		this._id = _id;
	}
	public void set_pw(String _pw) {
		this._pw = _pw;
	}
	public void set_nick(String _nick) {
		this._nick = _nick;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public void select() {
		Connection conn = null;
	    PreparedStatement psmt = null;
	    ResultSet rs = null;
	    
		try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");

	         String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	         String db_id = "shopping";
	         String db_pw = "12345";

	         conn = DriverManager.getConnection(db_url, db_id, db_pw);

	         String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";

	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, id);
	         psmt.setString(2, pw);

	         rs = psmt.executeQuery();
	         // rs.next()
	         // ResultSet에서 커서를 한칸 내림과 동시에 아래에 값이 있다면 true를 반환
	         // 값이 없다면 false를 반환한다
	         if (rs.next()) {
	            // 로그인 성공
	            String login_id = rs.getString("ID");
	            String login_pw = rs.getString("PW");
	            String login_nick = rs.getString("NICK");
	            
	            info = new MemberVO(login_id, login_pw, login_nick);
	         }

	      } catch (ClassNotFoundException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } finally {

	         try {
	            if (rs != null) {
	               rs.close();
	            }
	            if (psmt != null) {
	               psmt.close();
	            }
	            if (conn != null) {
	               conn.close();
	            }

	         } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }
	}
	
	
   public MemberVO login(String id, String pw) {
	      // TODO Auto-generated method stub
      MemberVO info = null;
      
      Connection conn = null;
      PreparedStatement psmt = null;
      ResultSet rs = null;

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");

         String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
         String db_id = "shopping";
         String db_pw = "12345";

         conn = DriverManager.getConnection(db_url, db_id, db_pw);

         String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";

         psmt = conn.prepareStatement(sql);
         psmt.setString(1, id);
         psmt.setString(2, pw);

         rs = psmt.executeQuery();
         // rs.next()
         // ResultSet에서 커서를 한칸 내림과 동시에 아래에 값이 있다면 true를 반환
         // 값이 없다면 false를 반환한다
         if (rs.next()) {
            // 로그인 성공
            String login_id = rs.getString("ID");
            String login_pw = rs.getString("PW");
            String login_nick = rs.getString("NICK");
            
            info = new MemberVO(login_id, login_pw, login_nick);
         }

      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {

         try {
            if (rs != null) {
               rs.close();
            }
            if (psmt != null) {
               psmt.close();
            }
            if (conn != null) {
               conn.close();
            }

         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      
      return info;
   }

		
	
	public void __JDBC__(int menuNum) {
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
				System.out.println("==============================================================");
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
				System.out.println("==============================================================");
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
		
		if (menuNum == 1 || menuNum==4 || menuNum == 5) {
			if (cnt > 0) {
				System.out.println(arr[menuNum-1] + " 성공!");
			} else {
				System.out.println(arr[menuNum-1] + " 실패...");
			}
		} else {
			if (rs != null) {
				if (!checkIdpw && menuNum == 2) {
					// true = 로그인 성공
					// false = 로그인 실패
					System.out.println("로그인 실패...");
				} else {
					System.out.println(arr[menuNum-1] + " 성공!");
				}
			} else {
				System.out.println(arr[menuNum-1] + " 실패...");
			}
		}
		
		
	}
}
