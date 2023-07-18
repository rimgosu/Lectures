<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
table {
	margin: auto;
	text-align: center;
}
</style>
</head>
<body>
	<%
		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		String name = request.getParameter("name");
		String java = request.getParameter("java");
		String web = request.getParameter("web");
		String iot = request.getParameter("iot");
		String android = request.getParameter("android");
		
		int sum = Integer.parseInt(java) + Integer.parseInt(web) + Integer.parseInt(iot) + Integer.parseInt(android);
		double avg = sum/4;
		String grade;
		if (avg >=95) {
			grade = "A+";
		} else if (avg >= 85) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B+";
		} else if (avg >= 70 ) {
			grade = "C";
		} else {
			grade = "F";
		}
		
		System.out.println(avg);
		
	%>
	<fieldset>
		<legend>학점확인프로그램</legend>
		<table>
		<tr>
			<td>이름</td>
			<td><%=name %></td>
		</tr>
		<tr>
			<td>JAVA점수</td>
			<td><%=java %></td>
		</tr>
		<tr>
			<td>WEB점수</td>
			<td><%=web %></td>
		</tr>
		<tr>
			<td>IOT점수</td>
			<td><%=iot %></td>
		</tr>
		<tr>
			<td>ANDROID점수</td>
			<td><%=android %></td>
		</tr>
		<tr>
			<td>평균</td>
			<td><%=avg %></td>
		</tr>
		<tr>
			<td>학점</td>
			<td><strong><%=grade %></strong></td>
		</tr>
	</table>
	</fieldset>
	
</body>
</html>