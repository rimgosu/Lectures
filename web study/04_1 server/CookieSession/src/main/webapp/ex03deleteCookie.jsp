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
		4. 쿠키 정보를 가져오는 방법: Cookies = request.getCookies();
			4_1) 쿠키 이름 : cookies[i].getName()
			4_2) 쿠키 값  : cookies[i].getValue() 
		=====================================================
		5. 쿠키 삭제하는 방법: cookie.setMaxAge(0);
		
	--%>
	
	<h1>쿠키삭제완료</h1>
	<%
	
		Cookie cookie = new Cookie("name", "");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	
	%>
</body>
</html>