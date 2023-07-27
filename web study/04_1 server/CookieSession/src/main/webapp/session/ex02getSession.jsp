<%@page import="java.util.ArrayList"%>
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
	ex1) setSession:
		����(Session): ������� ������ ���������ִ� ���
					  ����PC�� ����
					  �پ��� �ڷ��� �����͸� ���� --> Object��ü�� ��ȯ�Ǿ� ���� (��ĳ����)
					  
		���ǿ����� �����͸� �����ϴ� ��� : session.setAttribute(name,value)
			name  : ���ڿ�
			value : �⺻�ڷ���, ������ ��� ���� ����
	===============================================================
	ex2) getSession:
		Ư�� Ÿ�Կ� ������ ��� �ڷ����� ��ȯ�������. (�ٿ�ĳ����)
		String name = session.getAttribute("name"); 		(�Ұ���, X)
		String name = (String)session.getAttribute("name"); (����,  O)
		
		int age = (int)session.getAttribute("age");         (������� ����, X; ������ �̻��� ������, ���� ���� �� null ó���� �ȵ�)
		Integer age = (Integer)session.getAttribute("age"); (�����,      O; null ó�� ����; Wraper Ŭ����)
	
		�⺻������ Ÿ���� ����Ÿ������ ��ȯ -> Wrapper Ŭ����
		*************************************
		* character : char    -> Character  *
		* decimal   : byte    -> Byte       *
		* 	          short   -> Short      *
		* 	          int     -> Integer    *
		* 	          long    -> Long       *
		* float     : float   -> Float      *
		* 	          double  -> Double     *
		* bool      : boolean -> Boolean    *
		*************************************
--%>
<%
	String name = (String)session.getAttribute("name");
	int age = (int)session.getAttribute("age");
	Integer age1 = (Integer)session.getAttribute("age3");

	ArrayList<String> list = (ArrayList<String>)session.getAttribute("list");
	
%>

	<h1>���ǿ� ����� ������ Ȯ��</h1>
	<%= name %>
	<%= age1 %>
	<%= session.getAttribute("age1")%>
	<%= list.get(0) %>
	<%= list.get(1) %>

</body>
</html>