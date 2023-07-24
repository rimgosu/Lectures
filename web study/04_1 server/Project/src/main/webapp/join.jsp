<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������</title>
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
        <h2>ȸ������</h2>
        <form action="joinService.jsp" method="post">
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>��й�ȣ</td>
                    <td><input type="password" name="pw"></td>
                </tr>
                <tr>
                    <td>�г���</td>
                    <td><input type="text" name="nick"></td>
                </tr>
                <tr>
                    <td>EMAIL</td>
                    <td><input type="email" name="email"></td>
                </tr>
                <tr>
                    <td>��ȭ��ȣ</td>
                    <td><input type="tel" name="phone"></td>
                </tr>
                <tr>
                    <td>����</td>
                    <td>
                        ����<input value="����" type="radio" name="gender">
                        ����<input value="����" type="radio" name="gender">
                    </td>
                </tr>
                <tr>
                    <td>����</td>
                    <td><input type="number" name="age"></td>
                </tr>
                <tr>
                    <td colspan="2" class="center-align">
                        <input type="submit" value="ȸ������">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
