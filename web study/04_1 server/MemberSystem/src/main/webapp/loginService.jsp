<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection, java.sql.DriverManager, java.sql.PreparedStatement, java.sql.ResultSet, java.sql.SQLException" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%--
	id, pw 두 개의 정보를 받아와서 로그인 한 다음
	로그인 성공한 사람의 닉네임 콘솔에 출력
 --%>

<%
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt=0;
	ResultSet rs = null;
	
	// id, pw, nick, email, phone, gender, age
	request.setCharacterEncoding("EUC-KR");
	response.setCharacterEncoding("EUC-KR");
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	
	// jsp는 try문 필요 x - 어차피 service 매서드에서 예외처리 다 해줌
	Class.forName("oracle.jdbc.driver.OracleDriver");

	String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	String db_id = "shopping";
	String db_pw = "12345";
	
    conn = DriverManager.getConnection(db_url, db_id, db_pw);
	String sql = "select * from member where id=? and pw=?";
	psmt = conn.prepareStatement(sql);
	psmt.setString(1, id);
	psmt.setString(2, pw);
	rs = psmt.executeQuery();
	
	String nick=null;
	
	while(rs.next()) {
		nick = rs.getString("nick");
	}
	
	if (nick!=null) {
		nick = URLEncoder.encode(nick, "EUC-KR");
		response.sendRedirect("loginSuccess.jsp?nick="+nick);
	} else {
		response.sendRedirect("login.jsp");
	}

	if (rs!=null) {
		psmt.close();
	}
	if (conn!=null) {
		conn.close();
	}
	
	
%>

</body>
</html>