<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입</title>
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

    input[type="submit"] {
        width: 100%; /* Set the button width to 100% */
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

    .center-align {
        text-align: center;
    }
</style>
</head>
<body>
    <div id="wrap">
        <h2>회원가입</h2>
        <form action="joinService.jsp" method="post">
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td><input type="password" name="pw"></td>
                </tr>
                <tr>
                    <td>닉네임</td>
                    <td><input type="text" name="nick"></td>
                </tr>
                <tr>
                    <td>EMAIL</td>
                    <td><input type="email" name="email"></td>
                </tr>
                <tr>
                    <td>전화번호</td>
                    <td><input type="tel" name="phone"></td>
                </tr>
                <tr>
                    <td>성별</td>
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
                    <td colspan="2" class="center-align">
                        <input type="submit" value="회원가입">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
