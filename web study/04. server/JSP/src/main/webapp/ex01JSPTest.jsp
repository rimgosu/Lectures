<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- jsp �ּ� --%>
<h1>������ �ݿ���</h1>

<% 
	int num = 10;
	String name = "ȣ�ξƺ�";
	int age = 20;
	
	int size = 20;
	String color = "yellow";
%>
<%=name%>
<hr size="<%= size %>" color="<%= color %>">
</body>
</html>