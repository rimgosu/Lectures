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
	������ ������ ��ǰ���� ��Ű�� ����ǵ��� ����� �����Ͻÿ�.
	- �Ѱܹ��� value ���� ��Ű�� name���� ���
	* ����Ȯ���� �����ڵ��� -> ���ø����̼� -> ��Ű�� Ȯ���غ��ͤ�
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