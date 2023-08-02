package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	private int cnt = 0;
	
	
	
	// db 연결
	public void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@project-db-stu3.smhrd.com:1524:xe";
			String db_id = "Insa4_Spring_hacksim_5";
			String db_pw = "aishcool5";
			
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
	public int join(MemberDTO member) {
		
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

	public MemberDTO login(MemberDTO dto) {
		// TODO Auto-generated method stub

		getConnection();
		MemberDTO info = null;
		
		
		try {
			String sql = "select * from msgmember where email=? and pw=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getEmail());
			psmt.setString(2, dto.getPw());
			
			rs = psmt.executeQuery();
			if(rs.next()) {
				info = new MemberDTO(rs.getString("email"), rs.getString("pw"), rs.getString("phone"), rs.getString("addr"));
				
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

	public int update(MemberDTO dto) {
		// TODO Auto-generated method stub
		getConnection();
		
		try {
			String sql = "update msgmember set pw=?, phone=?, addr=? where email=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getPw());
			psmt.setString(2, dto.getPhone());
			psmt.setString(3, dto.getAddr());
			psmt.setString(4, dto.getEmail());
			
			cnt = psmt.executeUpdate();
			return cnt;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		
		return 0;
	}
	
	
}
