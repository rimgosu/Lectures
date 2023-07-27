<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>저장된 상품</h1>

<%

	Cookie[] cookies = request.getCookies();

	if(cookies != null) {
		for (int i=0; i<cookies.length; i++) {
			// jsessionid를 제외한 쿠키정보만 출력
			if(!cookies[i].getName().equals("JSESSIONID"))
				out.print(cookies[i].getValue());
			
		}
		
	}

%>

	<%--
		실습문제 ) 상품 삭제를 눌렀을 때, 저장된 쿠키정보를 삭제하고
				 ex05readCookie.jsp로 이동하는 기능을 구현해보기!
	 --%>

	<a href="ex05deleteCookie.jsp">상품삭제</a>

</body>
</html>