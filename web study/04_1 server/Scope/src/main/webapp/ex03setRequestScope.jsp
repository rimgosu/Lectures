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
	ex02) getPageContext
		
		   ***********************************
		   * PageScope => �ٸ� ���������� ���� �Ұ���!
		   ***********************************
	   
	ex03) setRequestScope
		���� : request.setAttribute("nickName", "������");
		��ȸ : request.getAttribute("nickName")
	=================================================================
	ex04) getRequestScope
	
		*******************************************************************************************
		* 1) response.sendRedirect: ���� ������ �̵� / ��,�ܺ� ���� 
		* 2) RequestDispatcher dispatcher = request.getRequestDispatcher("ex04getRequestScope.jsp")	
		*    dispatcher.forward(request, response);
		*    : �ܼ��̵�, �����ͺ��̽��� ��ȭ�� �ִ� �̵�    / ���θ� ����
		*******************************************************************************************
		   
		   ***************************************************************
		   * RequestScope => �ٸ� ���������� ���� �Ұ���! / ������ ������� ���� �����
		   ***************************************************************
		
 --%>
<%
	
	request.setAttribute("nickName", "������");
	RequestDispatcher dispatcher = request.getRequestDispatcher("ex04getRequestScope.jsp");
	dispatcher.forward(request, response);
%>
	<h1>Request����</h1>
	<%= request.getAttribute("nickName") %>

</body>
</html>