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
	���� ���� ���� �� �����´���
	id�� pw�� ��ġ�ϴ� ������ ã��
	�Է��� nick, email, phone, gender, age�� �����Ͻÿ�
	
	���� ���� �� : main.jsp �̵�
	���� ���� �� : update.jsp �̵�
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
	
	
	// jsp�� try�� �ʿ� x - ������ service �ż��忡�� ����ó�� �� ����
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
			alert("ȸ������ ���� ����");
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