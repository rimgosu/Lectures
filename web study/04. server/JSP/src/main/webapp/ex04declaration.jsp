<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>안녕하세용</h1>
	<%--
		<%! %> (선언문):
			jsp 안에서 필드 또는 메소드를 만들고 싶을 때 사용
		  
	--%>
	<%!
		public String name = "박병관";
	
		public int plus (int num1, int num2) {
			return num1 + num2;
		}
		
	%>
	
	<%
		String name2 = "조준용";
		
		
	%>
	
	<%= plus(30,40) %>
</body>
</html>