<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%--
		����� pc�� ���� (key, value ������ ���� �� ���Ϸ� ����)
		
		1. ��Ű �����ϴ� ���: (Cookie �ڵ��ϼ�, javax.~)
		2. ������ ��Ű�� ����ڿ��� ����: response.addCookie(cookie);
		3. ��Ű�� �����Ⱓ �����ϴ� ���: cookie.setMaxAge(60); - 60�� ����
	--%>
	
	<%
		Cookie cookie = new Cookie("name","justin");
		Cookie cookie2 = new Cookie("name2","justin2");
		Cookie cookie3 = new Cookie("name3","justin3");
		cookie.setMaxAge(60);
		cookie.setMaxAge(60);
		cookie.setMaxAge(60);
		response.addCookie(cookie);
		response.addCookie(cookie2);
		response.addCookie(cookie3);
	%>
	<h1>��Ű�����Ϸ�</h1>
	
	
</body>
</html>