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
		Page Scope: 하나의 JSP 페이지 내 저장하는 영역
					현재 페이지에서 지역변수 활용하거나, 저장한 값을 EL 표기법으로 활용
		생성 : pageContext.setAttribute("nickName", "스코프");
		조회 : pageContext.getAttribute("nickName")
	=================================================================
	ex02) getPageContext
		PageScope => 다른 페이지에서 접근 불가능!
		
 --%>
	<h1>PageScope에 저장된 정보는 다른 페이지에서 접근이 불가능하다.</h1>
	<%= pageContext.getAttribute("nickName") %>

</body>
</html>