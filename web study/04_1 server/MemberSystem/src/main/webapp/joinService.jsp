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
	�Ѿ�� �����͸� �������� jdbc�� ���� ���̺� �� �ֱ� (ȸ������)
	�������� �Ѿ���� ������
	id, pw, nick, email, phone, gender, age
	
	jdbc ����: 
	0. from : C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar
	   to   : ������Ʈ-src-main-webapp-WEB-INF-lib-ojdbc6.jar
	1. ����̹� �����ε�
	2. Ŀ�ؼ� ����
	3. sql�� ����
	4. ��������
 --%>
 
<%-- ȸ������ �� main �������� ���ư��� ����� �ϼ��Ͻÿ� --%>

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