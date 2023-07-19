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
	넘어온 데이터를 기준으로 jdbc를 통해 테이블에 값 넣기 (회원가입)
	이쪽으로 넘어오는 데이터
	id, pw, nick, email, phone, gender, age
	
	jdbc 순서: 
	0. from : C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar
	   to   : 프로젝트-src-main-webapp-WEB-INF-lib-ojdbc6.jar
	1. 드라이버 동적로딩
	2. 커넥션 연결
	3. sql문 실행
	4. 연결종료
 --%>
 
<%-- 회원가입 후 main 페이지로 돌아가는 기능을 완성하시오 --%>

<%
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt=0;
	
	// id, pw, nick, email, phone, gender, age
	request.setCharacterEncoding("EUC-KR");
	response.setCharacterEncoding("EUC-KR");
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String nick = request.getParameter("nick");
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");
	String gender = request.getParameter("gender");
	String age = request.getParameter("age");
	int iAge = Integer.parseInt(age);
	
	
	// jsp는 try문 필요 x - 어차피 service 매서드에서 예외처리 다 해줌
	Class.forName("oracle.jdbc.driver.OracleDriver");

	String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	String db_id = "shopping";
	String db_pw = "12345";
	
    conn = DriverManager.getConnection(db_url, db_id, db_pw);
	String sql = "insert into member values(?,?,?,?,?,?,?)";
	psmt = conn.prepareStatement(sql);
	psmt.setString(1, id);
	psmt.setString(2, pw);
	psmt.setString(3, nick);
	psmt.setString(4, email);
	psmt.setString(5, phone);
	psmt.setString(6, gender);
	psmt.setInt(7, iAge);

	cnt = psmt.executeUpdate();
	
	if (psmt!=null) {
		psmt.close();
	}
	if (conn!=null) {
		conn.close();
	}
	
	response.sendRedirect("main.jsp");
%>

</body>
</html>