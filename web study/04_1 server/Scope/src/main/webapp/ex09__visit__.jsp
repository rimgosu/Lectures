<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h1>���� �湮�� ��</h1>
		
	<%-- //session = �ٸ� ����ڳ��� ���� �ȵ�, �ٸ� �������� ���� ���� �ȵ�
	
		Integer visit = (Integer)session.getAttribute("visit");
	
		if (visit == null) {
			session.setAttribute("visit", 0);
			visit = 0;
		} else {
			visit += 1;
			session.setAttribute("visit", visit);
		}
		
	--%>
	
	<% //application = ������, �ٸ� ������ �� ���� ���� ��
	
		Integer visit = (Integer)application.getAttribute("visit");
	
		if (visit == null) {
			application.setAttribute("visit", 0);
			visit = 0;
		} else {
			visit += 1;
			application.setAttribute("visit", visit);
		}
		
	--%>

	<h1><%= visit %>��</h1>



</body>
</html>