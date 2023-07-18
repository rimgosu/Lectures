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
		include : html 코드를 진짜 가져오는것
		iframe  : 가져와서 보여주는 것
	 --%>
	<%@ include file="ex07menubar.jsp" %>
	<iframe src="ex07menubar.jsp"></iframe>
</body>
</html>