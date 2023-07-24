<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
    html, body {
        height: 100%;
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: Arial, sans-serif;
    }

    body {
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        background-color: lightgrey;
    }

    #wrap {
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        gap: 20px;
        flex: 1;
    }

    .fit-logo {
        width: 300px;
        animation: float 2s ease-in-out infinite;
    }

    @keyframes float {
        0% { transform: translatey(0px); }
        50% { transform: translatey(-10px); }
        100% { transform: translatey(0px); }
    }

    .button-container {
        display: flex;
        gap: 20px;
        width: 100%;
    }

    .menu {
        background-color: green;
        color: white;
        padding: 15px 20px;
        border-radius: 5px;
        text-decoration: none;
        transition: background-color 0.3s ease;
        flex: 1;
        text-align: center;
    }

    .menu:hover {
        background-color: darkgreen;
    }

    footer {
        width: 100%;
        text-align: center;
        padding: 10px 0;
        background-color: #ccc;
    }
</style>
</head>
<body>
    <div id="wrap">
        <img class="fit-logo" src="https://i1.wp.com/news.fitnyc.edu/wp-content/uploads/2020/02/FITLogoCurrent1.png?w=556&h=525&ssl=1">
        <div class="button-container">
        	<a href="login.jsp" class="menu">로그인</a>
            <a href="join.jsp" class="menu">회원가입</a>
        </div>
    </div>
    <footer>
        인공지능사관학교 피트니스 크루
    </footer>
</body>
</html>
