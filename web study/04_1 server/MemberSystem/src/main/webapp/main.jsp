<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
	#wrap {
		width: 70%;
		height: 500px;
		margin: auto;
	}
	.menu{
		border: 2px solid gray;
		margin: auto;
		text-align: center;
		width: 18%;
		height: 200px;
		float: left;
		font-size: 30px;
		line-height: 200px;
	}
	.menu:hover {
		background-color: gray;
	}
	
</style>

</head>
<body>
	<div id="wrap">
		<a href="join.jsp"><div class="menu">ȸ������</div></a>
		<a href="login.jsp"><div class="menu">�α���</div></a>
		<a href="update.jsp"><div class="menu">ȸ����������</div></a>
		<div class="menu">ȸ����Ϻ���</div>
		<a href="delete.jsp"><div class="menu">ȸ��Ż��</div></a>
		
	</div>
</body>
</html>