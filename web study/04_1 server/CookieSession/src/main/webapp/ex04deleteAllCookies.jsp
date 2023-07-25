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
		5. ��Ű �����ϴ� ���: cookie.setMaxAge(0);
		=====================================================
		6. ��� ��Ű �����ϴ� ���: for�� ������ ���� �������ָ� ��.		
		
	--%>
	
	<h1>��� ��Ű ����</h1>
	<%
		
		Cookie[] cookies = request.getCookies();
	
		if(cookies != null) {
			
			for (int i=0; i<cookies.length; i++) {
				cookies[i].setMaxAge(0);
				response.addCookie(cookies[i]);
			}
			
		}
		
	%>
</body>
</html>