<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인</title>
<style>
    html, body {
        height: 100%;
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: Arial, sans-serif;
        display: flex;
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
        background-color: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
    }

    h2 {
        margin: 0;
    }

    table {
        margin: 20px 0;
    }

    td {
        padding: 10px;
    }

    input[type="submit"], input[type="reset"] {
        width: 100%; /* Added this line to fill the button */
        background-color: green;
        color: white;
        border: none;
        padding: 10px 20px;
        border-radius: 5px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    input[type="submit"]:hover, input[type="reset"]:hover {
        background-color: darkgreen;
    }
    
    .button-row {
        text-align: center;
    }
    
    .a-join {
    	display: inline; /* This line makes sure the "join" link stays on the same line as the text */
    }

    .registration {
        display: flex;
        justify-content: center;
        align-items: center;
    }
    
</style>
</head>
<body>
    <div id="wrap">
        <h2>아이디로 로그인</h2>
        <form action="loginService.jsp" method="post">
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td><input type="password" name="pw"></td>
                </tr>
                <tr class="button-row">
                    <td colspan="2">
                        <input type="submit" value="로그인">
                    </td>
                </tr>
            </table>
        </form>
        <div class="registration"> <!-- Added this div to align text and link in a row -->
            <p>아이디가 없으신가요?</p><a class="a-join" href="join.jsp">회원가입</a>
        </div>
    </div>
</body>
</html>
