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
		�����̷�Ʈ ���:
			Server ��û�� Client���� �̵��� URL ����������
			Client�� �޾ƿ� URL�� ���� �ٽ� �����ϴ� ���
			ex) �α��� �������ڸ��� �ٷ� Ȩ���� ���ư��� ����
	 --%>
	 
	 <%-- ���� ������ ��û �� ���̹� �������� �̵��ϰ� �ϴ� ���� --%>
	 
	 <%
	 	response.sendRedirect("https://www.naver.com"); // �ﰢ ���̹��� �̵�
	 %>
</body>
</html>