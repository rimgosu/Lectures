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
	<form action="ex09scoreResult.jsp" method="post">
		<fieldset>
			<legend>학점확인프로그램</legend>
			<table>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>자바점수</td>
					<td><input type="text" name="java"></td>
				</tr>
				<tr>
					<td>웹점수</td>
					<td><input type="text" name="web"></td>
				</tr>
				<tr>
					<td>iot점수</td>
					<td><input type="text" name="iot"></td>
				</tr>
				<tr>
					<td>안드로이드점수</td>
					<td><input type="text" name="android"></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="결과확인">
					</td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>