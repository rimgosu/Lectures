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
		4. ��Ű ������ �������� ���: Cookies = request.getCookies();
			4_1) ��Ű �̸� : cookies[i].getName()
			4_2) ��Ű ��  : cookies[i].getValue() 
		=====================================================
		5. ��Ű �����ϴ� ���: cookie.setMaxAge(0);
		
	--%>
	
	<h1>��Ű�����Ϸ�</h1>
	<%
	
		Cookie cookie = new Cookie("name", "");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	
	%>
</body>
</html>