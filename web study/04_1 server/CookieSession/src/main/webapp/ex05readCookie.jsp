<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>����� ��ǰ</h1>

<%

	Cookie[] cookies = request.getCookies();

	if(cookies != null) {
		for (int i=0; i<cookies.length; i++) {
			// jsessionid�� ������ ��Ű������ ���
			if(!cookies[i].getName().equals("JSESSIONID"))
				out.print(cookies[i].getValue());
			
		}
		
	}

%>

	<%--
		�ǽ����� ) ��ǰ ������ ������ ��, ����� ��Ű������ �����ϰ�
				 ex05readCookie.jsp�� �̵��ϴ� ����� �����غ���!
	 --%>

	<a href="ex05deleteCookie.jsp">��ǰ����</a>

</body>
</html>