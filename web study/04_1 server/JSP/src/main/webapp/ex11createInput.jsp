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
			<form action="ex11Result.jsp" method="post">
				
				주제 : <input type="text" name="subject">
				<br>
				<% String num = request.getParameter("num");%>
					
					<%for (int i=1; i<= Integer.parseInt(num); i++) { %>
						아이템<%=i %> : <input type="text" name= "item[]" >
						<br>
						
					
					<%}
				%>
				
				<br>
				<input type="submit" value="시작">
			</form>
		</fieldset>
	
	</div>
</body>
</html>