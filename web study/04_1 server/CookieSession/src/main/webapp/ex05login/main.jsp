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
	String id = (String)session.getAttribute("id");
%>

<%= id %>�� ȯ���մϴ� <a href="../logoutService">�α׾ƿ�</a>

</body>
</html>