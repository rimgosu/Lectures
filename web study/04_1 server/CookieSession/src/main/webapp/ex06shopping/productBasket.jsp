<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h1>장바구니</h1>
	
	<fieldset>
	
		<legend>상품리스트</legend>
		<!-- 
			쿠키에 저장된 상품들을 출력하는 기능을 구현하시오.
			"prodict" => "상품" 변환 (replace() 활용)
			[결과물 예시]
				<ul> 
					<li>상품1</li>
					<li>상품2</li>
				</ul>
		 -->
	 <%
	 	String html = "";
	 	html += "<ul>";
	 	Cookie[] cookies = request.getCookies();
	 
	 	if(cookies != null) {
	 		for (int i=0 ; i<cookies.length ; i++) {
	 			if (!cookies[i].getName().equals("JSESSIONID")) {
	 				html += "<li>";
		 			html += cookies[i].getValue().replace("product", "상품");
		 			html += "</li>";
	 			}
	 			
	 		}
	 	}
	 	html += "</ul>";
	 	
	 	out.print(html);
	 %>
	
	</fieldset>
	
	<p><a href="productList.jsp">계속쇼핑하기</a></p>
	<p><a href="productDeleteAll.jsp">모든상품삭제</a></p>
	

</body>
</html>