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
		사용자 pc에 저장 (key, value 구조로 만든 후 파일로 저장)
		
		1. 쿠키 생성하는 방법: (Cookie 자동완성, javax.~)
		2. 생성된 쿠키를 사용자에게 응답: response.addCookie(cookie);
		3. 쿠키의 유지기간 설정하는 방법: cookie.setMaxAge(60); - 60초 유지
	--%>
	
	<%
		Cookie cookie = new Cookie("name","justin");
		Cookie cookie2 = new Cookie("name2","justin2");
		Cookie cookie3 = new Cookie("name3","justin3");
		cookie.setMaxAge(60);
		cookie.setMaxAge(60);
		cookie.setMaxAge(60);
		response.addCookie(cookie);
		response.addCookie(cookie2);
		response.addCookie(cookie3);
	%>
	<h1>쿠키생성완료</h1>
	
	
</body>
</html>