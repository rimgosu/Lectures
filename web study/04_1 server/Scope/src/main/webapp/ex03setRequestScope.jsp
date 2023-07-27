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
	ex02) getPageContext
		
		   ***********************************
		   * PageScope => 다른 페이지에서 접근 불가능!
		   ***********************************
	   
	ex03) setRequestScope
		생성 : request.setAttribute("nickName", "스코프");
		조회 : request.getAttribute("nickName")
	=================================================================
	ex04) getRequestScope
	
		*******************************************************************************************
		* 1) response.sendRedirect: 실제 서버가 이동 / 내,외부 가능 
		* 2) RequestDispatcher dispatcher = request.getRequestDispatcher("ex04getRequestScope.jsp")	
		*    dispatcher.forward(request, response);
		*    : 단순이동, 데이터베이스에 변화를 주는 이동    / 내부만 가능
		*******************************************************************************************
		   
		   ***************************************************************
		   * RequestScope => 다른 페이지에서 접근 불가능! / 포워드 방식으로 정보 줘야함
		   ***************************************************************
		
 --%>
<%
	
	request.setAttribute("nickName", "스코프");
	RequestDispatcher dispatcher = request.getRequestDispatcher("ex04getRequestScope.jsp");
	dispatcher.forward(request, response);
%>
	<h1>Request영역</h1>
	<%= request.getAttribute("nickName") %>

</body>
</html>