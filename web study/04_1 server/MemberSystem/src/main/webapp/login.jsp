<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">

	#wrap, h2, table {
		margin: auto;
		text-align: center;
		margin-top: 10px;
	}

</style>

</head>
<body>
	<div id="wrap">
	
		<h2>�α���������</h2>
		<form action="loginService.jsp" method="post">
			<table>
				<tr>
					<td>ID</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>PW</td>
					<td><input type="password" name="pw"></td>
				<tr>
					<td colspan="2">
						<input type="submit" value="�α���">
						<input type="reset">
					</td>
				</tr>
			</table>
		</form>
		
	</div>
</body>
</html>