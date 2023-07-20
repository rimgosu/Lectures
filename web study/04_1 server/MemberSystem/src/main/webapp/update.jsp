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
	
		<h2>회원정보수정페이지</h2>
		<form action="updateService.jsp" method="post">
			<table>
				<tr>
					<td>ID</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>PW</td>
					<td><input type="password" name="pw"></td>
				</tr>
				<tr>
					<td>NICK</td>
					<td><input type="text" name="nick"></td>
				</tr>
				<tr>
					<td>EMAIL</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>PHONE</td>
					<td><input type="tel" name="phone"></td>
				</tr>
				<tr>
					<td>GENDER</td>
					<td>
						남자<input value="남자" type="radio" name="gender">
						여자<input value="여자" type="radio" name="gender">
					</td>
				</tr>
				<tr>
					<td>나이</td>
					<td><input type="number" name="age"></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="회원정보수정">
						<input type="reset">
					</td>
				</tr>
			</table>
		</form>
		
	</div>
</body>
</html>