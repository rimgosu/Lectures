<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h1>��ٱ���</h1>
	
	<fieldset>
	
		<legend>��ǰ����Ʈ</legend>
		<!-- 
			��Ű�� ����� ��ǰ���� ����ϴ� ����� �����Ͻÿ�.
			"prodict" => "��ǰ" ��ȯ (replace() Ȱ��)
			[����� ����]
				<ul> 
					<li>��ǰ1</li>
					<li>��ǰ2</li>
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
		 			html += cookies[i].getValue().replace("product", "��ǰ");
		 			html += "</li>";
	 			}
	 			
	 		}
	 	}
	 	html += "</ul>";
	 	
	 	out.print(html);
	 %>
	
	</fieldset>
	
	<p><a href="productList.jsp">��Ӽ����ϱ�</a></p>
	<p><a href="productDeleteAll.jsp">����ǰ����</a></p>
	

</body>
</html>