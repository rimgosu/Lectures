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



<%
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt=0;
	
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
	String sql = "delete from member where id=? and pw=?";
	psmt = conn.prepareStatement(sql);
	psmt.setString(1, id);
	psmt.setString(2, pw);

	cnt = psmt.executeUpdate();
	
	if (cnt != 0) {
		id = URLEncoder.encode(id, "EUC-KR");
%>
	<script type="text/javascript">
	alert("회원탈퇴 성공");
	location.href="main.jsp"
	</script>		
<%
	} else {
		response.sendRedirect("delete.jsp");
	}
	
	
	if (psmt!=null) {
		psmt.close();
	}
	if (conn!=null) {
		conn.close();
	}
	
	
%>

</body>
</html>