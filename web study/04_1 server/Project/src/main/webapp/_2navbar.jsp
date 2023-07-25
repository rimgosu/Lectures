<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
	    * {
	        margin: 0;
	        padding: 0;
	        box-sizing: border-box;
	    }
	    .content {
		    
	        padding-top: 70px; /* Adjust this value based on the height of your logo */
	        padding-bottom: 70px; /* Adjust this value based on the height of your navbar */
	        overflow-y: auto; /* Enable vertical scrolling */
	        position: absolute; /* Make the content fill the entire screen */
	        top: 0;
	        bottom: 0;
	        left: 0;
	        right: 0;
	        width: 500px;
	        margin: auto; /* Center the content */
	        box-shadow: 0px 4px 8px 0px rgba(0,0,0,0.2); /* Add shadow */
	    }
	    .navbar {
	        display: flex;
	        justify-content: center;
	        flex-wrap: nowrap;
	        overflow: auto;
	        background-color: #333;
	        position: fixed;
	        bottom: 0;
	        left: 0;
	        right: 0;
	        width: 500px;
	        margin: auto;
	        z-index: 100; /* Bring navbar to front */
	    }
	
	    .navbar a, .logo-link {
	        flex: 0 0 auto;
	        display: block;
	        color: #f2f2f2;
	        text-align: center;
	        padding: 14px 16px;
	        text-decoration: none;
	        font-size: 17px;
	    }
	
	    .navbar a:hover, .logo-link:hover {
	        background: #ddd;
	        color: black;
	    }

	    .logo {
	        display: block;
	        max-width: 100%;
	        background-color: black;
	        height: auto;
	        position: fixed; /* Fix the position of the logo */
	        top: 0;
	        left: 0;
	        right: 0;
	        width: 500px;
	        margin: auto;
	        padding-top: 20px;
	        padding-bottom: 20px;
	        z-index: 100; /* Bring logo to front */
	    }
	    
	    .content::-webkit-scrollbar {
		    display: none;
		}
		
		.map {
			width: 90%;
		}
		
		
	</style>
</head>
<body>
	<a class="logo-link" href="_2home.jsp">
		<div class="logo">Our Fit</div>
    </a>
    <div class="content">
    	<div class="map">
    		<jsp:include page="_2map.jsp" />
    	</div>
    	
    	
	    <!-- Your content goes here -->
	    <h1>하이</h1>
	    <br>
	    <h1>하이</h1>
	    <br>
	    <h1>하이</h1>
	    <br>
	    <h1>하이</h1>
	    <br>
	    <h1>하이</h1>
	    <br>
	    <h1>하이</h1>
	    <br>
	    <h1>하이</h1>
	    <br>
	    <h1>하이</h1>
	    <br>
	    <h1>하이</h1>
	    <br>
	    <h1>하이</h1>
	    <br>
	    <h1>하이</h1>
	    <br>
	    <h1>하이</h1>
	    <br>
	    <h1>하이</h1>
	    <br>
	    <h1>하이</h1>
	    <br>
	    <!-- ... -->
	</div>
	<div class="navbar">
	    <a href="_2home.jsp">0. 홈</a>
	    <a href="_2myinfo.jsp">1. 내 정보 보기</a>
	    <a href="_2map.jsp">2. 지도보기</a>
	    <a href="_2community.jsp">3. 커뮤니티</a>
	    <a href="_2imagerecognition.jsp">4. 이미지 인식</a>
	</div>
</body>
</html>
