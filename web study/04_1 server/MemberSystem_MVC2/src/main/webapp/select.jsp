<%@page import="java.util.ArrayList"%>
<%@page import="com.model.MemberDTO"%>
<%@page import="com.model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	MemberDAO dao = new MemberDAO();
	
	ArrayList<MemberDTO> list = dao.select();
	
	System.out.println("����ȸ�� �� : "+ list.size());
	
	String html = "";
	html += "<table border=\"1\">";
	html += "<tr>";
	html += "<th>��ȣ</th><th>���̵�</th><th>�г���</th><th>�̸���</th><th>��ȭ��ȣ</th><th>����</th><th>����</th>";
	html += "</tr>";
	for (int i=0; i< list.size(); i++) {
		html += "<tr>";
		html += "<td>" + (i+1) + "</td>";
		html += "<td>" + list.get(i).getId()+ "</td>";
		html += "<td>" + list.get(i).getNick() + "</td>";
		html += "<td>" + list.get(i).getEmail() + "</td>";
		html += "<td>" + list.get(i).getPhone() + "</td>";
		html += "<td>" + list.get(i).getGender() + "</td>";
		html += "<td>" + list.get(i).getAge()+ "</td>";
		html += "</tr>";
		
	}
	
	html += "</table>";
	
	out.print(html);

%>
</body>
</html>