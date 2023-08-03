package file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

public class fileDAO {
	
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	private int cnt = 0;
	
	// db 연결
	public void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			System.out.print("conn completed. ");
		} 
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("ojdbc6.jar 또는 경로를 확인하세요"); // syse
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("DB연결에 필요한 정보가 맞는지 체크하세요!");
		}
	}
	
	// db 종료
	public void close() {
		try {
			
			
			if (rs!=null) {
				rs.close();
			}
			if (psmt!=null) {
				psmt.close();
			}
			if (conn!=null) {
				conn.close();
			}
			
			System.out.println("close completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int upload(String fileName, String fileRealName) {
		getConnection();
		
		try {
			String sql = "insert into tb_file values(?,?, 0)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, fileName);
			psmt.setString(2, fileRealName);
			
			cnt = psmt.executeUpdate();
			return cnt;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		
		return cnt;
	}
	
	public int hit(String fileRealName) {
		getConnection();
		
		try {
			String sql = "update tb_file set downloadCount = downloadCount + 1"
					+ "where fileRealName = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, fileRealName);
			
			cnt = psmt.executeUpdate();
			return cnt;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		
		return cnt;	
	}
	
	public ArrayList<fileDTO> getList() {
		String SQL = "select * from tb_file";
		ArrayList<fileDTO> list = new ArrayList<fileDTO>();
		
		getConnection();
			
		try {	
			String sql = "select * from tb_file";
			psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				fileDTO file = new fileDTO(rs.getString(1), rs.getString(2), rs.getInt(3));
				list.add(file);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		
		return list;	
		
		
	}
	
	
}
