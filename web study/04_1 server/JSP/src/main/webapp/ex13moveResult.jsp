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

		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		String url = request.getParameter("url");
		if (url.equals("����")) {
			response.sendRedirect("https://www.google.com/");
		} else if (url.equals("���̹�")) {
			response.sendRedirect("https://www.naver.com/");
		} else if (url.equals("����")) {
			response.sendRedirect("https://www.daum.net/");
		} else {
			response.sendRedirect("https://gj-aischool.or.kr/");
		}
		System.out.println(url);
	%>
</body>
</html>