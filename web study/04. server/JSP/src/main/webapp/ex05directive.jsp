<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	오늘은 너무너무 행복한 월요일입니다 ^^;
	<br>
	오늘 당신의 행운의 숫자는?
	<br>
	<%
		Random rd = new Random();
		int lucky = rd.nextInt(10)+1;
	%>
	<strong><%= lucky %></strong>입니다.
</body>
</html>