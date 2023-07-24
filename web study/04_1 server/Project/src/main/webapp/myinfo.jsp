<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>My Info</title>
<style>
    .info-container {
        margin: 20px;
        padding: 20px;
        border: 1px solid #333;
    }

    .info-container h2 {
        margin-bottom: 20px;
    }
</style>
</head>
<body>

<jsp:include page="navbar.jsp" />

<div class="info-container">
    <h2>My Information</h2>
    <p>Name: John Doe</p>
    <p>Email: john.doe@example.com</p>
</div>

</body>
</html>
