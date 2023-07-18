<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setCharacterEncoding("EUC-KR");
		request.setCharacterEncoding("EUC-KR");
		
		String c = request.getParameter("c");
		String r = request.getParameter("r");
	
	%>
	<h1><%= c %>층</h1>
	<h1><%= r %>방</h1>
	
	<table border="1">
		<% for (int i=0; i< Integer.parseInt(c); i++) {%>
			<tr>
			<% for (int j=0; j< Integer.parseInt(r); j++) {%>
				<td><%=j %></td>
				
				
				
			<% }%></tr><% } %>
	</table>
</body>
</html>