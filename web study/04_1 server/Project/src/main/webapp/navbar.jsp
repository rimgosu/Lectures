<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }
    .navbar {
        display: flex;
        justify-content: center;
        flex-wrap: nowrap;
        overflow: auto;
        background-color: #333;
        position: fixed;
        bottom: 0;
        width: 100%;
    }

    .navbar a {
        flex: 0 0 auto;
        display: block;
        color: #f2f2f2;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
        font-size: 17px;
    }

    .navbar a:hover {
        background: #ddd;
        color: black;
    }
</style>
<div class="navbar">
  <a href="myinfo.jsp">1. 내 정보 보기</a>
  <a href="map.jsp">2. 지도보기</a>
  <a href="community.jsp">3. 커뮤니티</a>
  <a href="imagerecognition.jsp">4. 이미지 인식</a>
</div>
