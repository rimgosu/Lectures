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
	id, pw, nick, email, phone, gender, age
	위의 값을 먼저 다 가져온다음
	id와 pw가 일치하는 계정을 찾아
	입력한 nick, email, phone, gender, age를 수정하시오
	
	수정 성공 시 : main.jsp 이동
	수정 실패 시 : update.jsp 이동
 --%>
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
	String sql = "update member set nick=?, email=?, phone=?, gender=?, age=? where id=? and pw=?";
	psmt = conn.prepareStatement(sql);
	psmt.setString(1, nick);
	psmt.setString(2, email);
	psmt.setString(3, phone);
	psmt.setString(4, gender);
	psmt.setInt(5, iAge);
	psmt.setString(6, id);
	psmt.setString(7, pw);

	cnt = psmt.executeUpdate();
	if (psmt!=null) {
		psmt.close();
	}
	if (conn!=null) {
		conn.close();
	}
	if (cnt != 0) {
	%>
		<script type="text/javascript">
			alert("회원정보 수정 성공");
			location.href="main.jsp";
		</script>
	<%
	} else {
		response.sendRedirect("update.jsp");
	}
	

	
	// response.sendRedirect("main.jsp");j bj+
%>
</body>
</html>