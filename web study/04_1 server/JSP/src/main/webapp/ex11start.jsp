<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	div, h2, fieldset, input {
		margin: auto;
		text-align: center;
		margin-top: 10px;
	}
</style>
</head>
<body>
   <div>
      <h2>������÷����</h2>
      <fieldset>
         <legend>���������Է�</legend>
         <form action="ex11createInput.jsp" method="post">
            <input type="number" name="num">
            <br>
            <input type="submit">
         </form>
      </fieldset>
   </div>
</body>
</html>