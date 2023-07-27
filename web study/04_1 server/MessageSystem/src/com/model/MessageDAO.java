package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageDAO {

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
	

	// 회원가입
	public int join(MessageDTO member) {
		
		getConnection();
		
		try {
			String sql = "insert into msgmember values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getEmail());
			psmt.setString(2, member.getPw());
			psmt.setString(3, member.getPhone());
			psmt.setString(4, member.getAddr());
			
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

	public MessageDTO login(MessageDTO dto) {
		// TODO Auto-generated method stub

		getConnection();
		MessageDTO info = null;
		
		
		try {
			String sql = "select * from msgmember where email=? and pw=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getEmail());
			psmt.setString(2, dto.getPw());
			
			rs = psmt.executeQuery();
			if(rs.next()) {
				info = new MessageDTO(rs.getString("email"), rs.getString("pw"), rs.getString("phone"), rs.getString("addr"));
				
			}
			return info;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		
		return null;
	}
	
	
}
