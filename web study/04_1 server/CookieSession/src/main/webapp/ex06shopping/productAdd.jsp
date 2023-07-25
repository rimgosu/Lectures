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
	유저가 선택한 상품들을 쿠키에 저장되도록 기능을 구현하시오.
	- 넘겨받은 value 값을 쿠키의 name으로 사용
	* 저장확인은 개발자도구 -> 애플리케이션 -> 쿠키로 확인해볼것ㄴ
 --%>
 
 <%
 
 	String[] product = request.getParameterValues("product");
 	if (product != null) {
 		for (int i=0; i< product.length; i++) {
 	 		Cookie cookie = new Cookie(product[i], product[i]);
 	 		cookie.setMaxAge(600);
 	 		response.addCookie(cookie);
 	 	}
 	}
 	
 	
 	response.sendRedirect("productList.jsp");
 
 %>

</body>
</html>