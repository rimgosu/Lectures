<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
	div, h2, fieldset, input {
		margin: auto;
		text-align: center;
		margin-top: 10px;
	}
</style>

</head>
<body>
	<div>
		<h2>랜덤당첨게임</h2>
		
		<fieldset>
			<legend>랜덤당첨 작성</legend>
			
			<%
			
				response.setCharacterEncoding("EUC-KR");
				request.setCharacterEncoding("EUC-KR");
				String[] items = request.getParameterValues("item[]");
				String subject = request.getParameter("subject");
				Random rd = new Random();
				int randNum = rd.nextInt(items.length);
				
				out.print(subject + "<br>");
				out.print(items[randNum]);
			
			%>
		</fieldset>
	
	</div>
</body>
</html>