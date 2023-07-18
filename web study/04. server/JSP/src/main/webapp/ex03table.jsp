<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="1px solid black">
	<tr>
		<%
			String td = "";
			for (int i= 1; i <= 10; i++) {
				td += "<td>" + i + "</td>";
			}
		%>
		<%= td %>
			
	</tr>
</table>
</body>
</html>