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
	ex01) setPageContext
		Page Scope: �ϳ��� JSP ������ �� �����ϴ� ����
					���� ���������� �������� Ȱ���ϰų�, ������ ���� EL ǥ������� Ȱ��
		���� : pageContext.setAttribute("nickName", "������");
		��ȸ : pageContext.getAttribute("nickName")
 --%>


<%

	pageContext.setAttribute("nickName", "������");
	
	
%>

<%= pageContext.getAttribute("nickName") %>


</body>
</html>