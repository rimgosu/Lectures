<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h1>��ǰ ����Ʈ</h1>
	
	<form action="productAdd.jsp" method="post">
	
		<table border="1">
			
			<tr>
			
				<th>����</th>
				<th>��ǰ��</th>
				<th>���</th>
			
			</tr>
			
			<tr>
				<td><input type="checkbox" name="product" value="product1"></td>
				<td>��ǰ1</td>
				<td><input type="submit" value="��ٱ��ϴ��"></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="product" value="product2"></td>
				<td>��ǰ2</td>
				<td><input type="submit" value="��ٱ��ϴ��"></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="product" value="product3"></td>
				<td>��ǰ3</td>
				<td><input type="submit" value="��ٱ��ϴ��"></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="product" value="product4"></td>
				<td>��ǰ4</td>
				<td><input type="submit" value="��ٱ��ϴ��"></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="product" value="product5"></td>
				<td>��ǰ5</td>
				<td><input type="submit" value="��ٱ��ϴ��"></td>
			</tr>
		</table>
		
		<p>
			<input type="submit" value="������ ��ǰ ���">
		</p>
		<p>
			<a href="productBasket.jsp">��ٱ��ϴ��</a>
		</p>
		
		
	</form>

</body>
</html>