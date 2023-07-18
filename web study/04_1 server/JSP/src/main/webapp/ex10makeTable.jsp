<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
	*{
	margin: center;
	text-align: center;
	
	}
</style>

</head>
<body>

	<form action="ex10makeTableResult.jsp" method="post">
		<h2>몇 개의 층을 만드실 건가요</h2>
		층 <input type="number" name="c">
		<hr>
		<h2>몇 개의 방을 만드실 건가요</h2>
		방 <input type="number" name="r">
		<br>
		<input type="submit">
	</form>

</body>
</html>