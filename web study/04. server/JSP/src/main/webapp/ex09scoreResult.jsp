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
		<legend>����Ȯ�����α׷�</legend>
		<table>
		<tr>
			<td>�̸�</td>
			<td><%=name %></td>
		</tr>
		<tr>
			<td>JAVA����</td>
			<td><%=java %></td>
		</tr>
		<tr>
			<td>WEB����</td>
			<td><%=web %></td>
		</tr>
		<tr>
			<td>IOT����</td>
			<td><%=iot %></td>
		</tr>
		<tr>
			<td>ANDROID����</td>
			<td><%=android %></td>
		</tr>
		<tr>
			<td>���</td>
			<td><%=avg %></td>
		</tr>
		<tr>
			<td>����</td>
			<td><strong><%=grade %></strong></td>
		</tr>
	</table>
	</fieldset>
	
</body>
</html>