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
		세션(Session): 사용자의 정보를 유지시켜주는 기술
					  서버PC에 저장
					  다양한 자료형 데이터를 저장 --> Object객체로 변환되어 저장 (업캐스팅)
					  
		세션영역에 데이터를 저장하는 방법 : session.setAttribute(name,value)
			name  : 문자열
			value : 기본자료형, 참조형 모두 저장 가능
	===============================================================
	ex2) getSession:
		특정 타입에 저장할 경우 자료형을 변환해줘야함. (다운캐스팅)
		String name = session.getAttribute("name"); 		(불가능, X)
		String name = (String)session.getAttribute("name"); (가능,  O)
		
		int age = (int)session.getAttribute("age");         (권장되지 않음, X; 구문에 이상은 없으나, 값이 없을 때 null 처리가 안됨)
		Integer age = (Integer)session.getAttribute("age"); (권장됨,      O; null 처리 가능; Wraper 클래스)
	
		기본데이터 타입을 참조타입으로 변환 -> Wrapper 클래스
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

	<h1>세션에 저장된 데이터 확인</h1>
	<%= name %>
	<%= age1 %>
	<%= session.getAttribute("age1")%>
	<%= list.get(0) %>
	<%= list.get(1) %>

</body>
</html>