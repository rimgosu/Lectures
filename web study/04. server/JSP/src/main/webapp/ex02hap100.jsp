<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%-- 1부터 100까지의 합을 반복문을 통하여 구한다음 h1태그 안에 표현하시오 --%>
	<%
		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum+= i;
		}
	%>
	<h1>1부터 100까지의 합은 -><%= sum %></h1>
	
</body>
</html>