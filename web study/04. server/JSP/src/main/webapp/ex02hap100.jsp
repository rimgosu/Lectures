<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%-- 1���� 100������ ���� �ݺ����� ���Ͽ� ���Ѵ��� h1�±� �ȿ� ǥ���Ͻÿ� --%>
	<%
		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum+= i;
		}
	%>
	<h1>1���� 100������ ���� -><%= sum %></h1>
	
</body>
</html>