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
			<legend>����Ȯ�����α׷�</legend>
			<table>
				<tr>
					<td>�̸�</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>�ڹ�����</td>
					<td><input type="text" name="java"></td>
				</tr>
				<tr>
					<td>������</td>
					<td><input type="text" name="web"></td>
				</tr>
				<tr>
					<td>iot����</td>
					<td><input type="text" name="iot"></td>
				</tr>
				<tr>
					<td>�ȵ���̵�����</td>
					<td><input type="text" name="android"></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="���Ȯ��">
					</td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>