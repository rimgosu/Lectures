<%@page import="com.model.MessageDTO"%>
<%@page import="com.model.MessageDAO"%>
<%@page import="com.model.MemberDTO"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Forty by HTML5 UP</title>
		<meta charset="utf-8" />
		<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
	</head>
	<body>

	<%
	MemberDTO info = (MemberDTO)session.getAttribute("info");
	%>

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header" class="alt">
						<a href="index.html" class="logo"><strong>Forty</strong> <span>by HTML5 UP</span></a>
						<nav>
							<% if (info != null) { %>
								<a href="update.jsp">������������</a>
								<a href="logoutService">�α׾ƿ�</a>
							<% } else { %>
								<a href="#menu">�α���</a>
							<% } %>
							<!-- �α��� �� Logout.jsp�� �̵��� �� �ִ�'�α׾ƿ�'��ũ�� '������������'��ũ�� ����Ͻÿ�. -->
						</nav>
					</header>

				<!-- Menu -->
					<nav id="menu">	
						<ul class="links">
							<li><h5>�α���</h5></li>
								<form action="LoginService" method="post">
									<li><input type="text"  placeholder="Email�� �Է��ϼ���" name="email"></li>
									<li><input type="password"  placeholder="PW�� �Է��ϼ���" name="pw"></li>
									<li><input type="submit" value="LogIn" class="button fit"></li>
								</form>
						</ul>
						<ul class="actions vertical">
							<li><h5>ȸ������</h5></li>
								<form action="JoinService" method="post">
									<li><input type="text"  placeholder="Email�� �Է��ϼ���" name="email"></li>
									<li><input type="password"  placeholder="PW�� �Է��ϼ���" name="pw"></li>
									<li><input type="text"  placeholder="��ȭ��ȣ�� �Է��ϼ���" name="phone"></li>
									<li><input type="text"  placeholder="���ּҸ� �Է��ϼ���" name="addr"></li>
									<li><input type="submit" value="JoinUs" class="button fit"></li>
								</form>
						</ul>
					</nav>			
				<!-- Banner -->
					<section id="banner" class="major">
						<div class="inner">
							<header class="major">
									<% if (info != null) { %>
										<h1><%= info.getEmail() %>�� ȯ���մϴ�!</h1>
									<% } else { %>
										<h1>�α����� �������ּ���.</h1>
									<% } %>
							</header>
							<div class="content">
								<p>�Ʒ��� ���ݱ��� ��� �� ������Դϴ�.<br></p>
								<ul class="actions">
									<li><a href="#one" class="button next scrolly">Ȯ���ϱ�</a></li>
								</ul>
							</div>
						</div>
					</section>

				<!-- Main -->
					<div id="main">

						<!-- One -->
							<section id="one" class="tiles">
								<article>
									<span class="image">
										<img src="images/pic01.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">HTML</a></h3>
										<p>Ȩ�������� ����� ���� ���</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic02.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">CSS</a></h3>
										<p>HTML�� ���������ִ� ���</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic03.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">Servlet/JSP</a></h3>
										<p>Java�� �⺻���� �� �� ���α׷��� ���/��ũ��Ʈ ���</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic04.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">JavaScript</a></h3>
										<p>HTML�� �⺻���� ������ ������ �� �ִ� ���</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic05.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">MVC</a></h3>
										<p>�� ������Ʈ �� ���� ���� ����ϴ� ����������</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic06.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">Web Project</a></h3>
										<p>�������� ����������Ʈ�� �� ����� Ȱ���ϼ���!</p>
									</header>
								</article>
							</section>
					<!-- Two -->
							<section id="two">
								<div class="inner">
									<header class="major">
										<h2>������ �� �޼��� Ȯ���ϱ�</h2>
									</header>
									<p></p>
									<ul class="actions">
										<% 
											String html = "";
											if(info != null) {
												MessageDAO dao = new MessageDAO();
												ArrayList<MessageDTO> list = dao.select(info.getEmail());
												html += "<table><tr><th>num</th><th>send_name</th><th>receive_email</th><th>content</th><th>send_date</th><th>����</th></tr>";
												for (int i=0; i< list.size(); i++) {
													html += "<tr>";
													html += "<td>" + (i+1) + "</td>"; 
													html += "<td>" + list.get(i).getSend_name() + "</td>"; 
													html += "<td>" + list.get(i).getReceive_email() + "</td>"; 
													html += "<td>" + list.get(i).getContent() + "</td>"; 
													html += "<td>" + list.get(i).getSend_date() + "</td>"; 
													html += "<td>" + "<a href=\"MsgDelete?num=" + list.get(i).getNum() + "\">����</a></td>";
													html += "</tr>";
												}
												html+= "</table>";
												out.print(html);
											
											} else {
												out.print("<li>�α����� �ϼ���.</li>");
											}
										%>
										
										<li><a href="MsgAllDelete" class="button next scrolly">��ü�����ϱ�</a></li>
									</ul>
								</div>
							</section>

					</div>

				<!-- Contact -->
					<section id="contact">
						<div class="inner">
							<section>
								<form action="msgSendService">
								<div class="field half first">
										<label for="name">Name</label>
										<input type="text"  id="name" placeholder="������ ��� �̸�" name="name"/>
									</div>
									<div class="field half">
										<label for="email">Email</label>
										<input type="text"  id="email" placeholder="���� ��� �̸���" name="email"/>
									</div>

									<div class="field">
										<label for="message">Message</label>
										<textarea  id="message" rows="6" name="message"></textarea>
									</div>
									<ul class="actions">
										<li><input type="submit" value="Send Message" class="special" /></li>
										<li><input type="reset" value="Clear" /></li>
									</ul>
								</form>
							</section>
							
							<section class="split">
								<section>
									<div class="contact-method">
										<span class="icon alt fa-envelope"></span>
										<h3>Email</h3>
										
										<% if(info != null) { %>
											<a href="#"><%= info.getEmail() %></a> 
								
										<% }else { %>
											<a href="#">�α��� �� ����� �̸����� ���</a>
										
										<% } %>
										
										<!-- �α��� �� ������� �̸����� ����Ͻÿ� -->
									</div>
								</section>
								<section>
									<div class="contact-method">
										<span class="icon alt fa-phone"></span>
										<h3>Phone</h3>
										
										<% if(info != null) { %>
											<a href="#"><%= info.getPhone() %></a> 
								
										<% }else { %>
											<span>�α��� �� ����� ��ȭ��ȣ�� ���</span>
										
										<% } %>
										<!-- �α��� �� ������� ��ȭ��ȣ�� ����Ͻÿ� -->
									</div>
								</section>
								<section>
									<div class="contact-method">
										<span class="icon alt fa-home"></span>
										<h3>Address</h3>
										
										<% if(info != null) { %>
											<a href="#"><%= info.getAddr() %></a> 
								
										<% }else { %>
											<span>�α��� �� ����� ���ּҸ� ���</span>
										
										<% } %>
										<!-- �α��� �� ������� ���ּҸ� ����Ͻÿ� -->
									</div>
								</section>
							</section>					
						</div>
					</section>

				<!-- Footer -->
					<footer id="footer">
						<div class="inner">
							<ul class="icons">
								<li><a href="#" class="icon alt fa-twitter"><span class="label">Twitter</span></a></li>
								<li><a href="#" class="icon alt fa-facebook"><span class="label">Facebook</span></a></li>
								<li><a href="#" class="icon alt fa-instagram"><span class="label">Instagram</span></a></li>
								<li><a href="#" class="icon alt fa-github"><span class="label">GitHub</span></a></li>
								<li><a href="#" class="icon alt fa-linkedin"><span class="label">LinkedIn</span></a></li>
							</ul>
							<ul class="copyright">
								<li>&copy; Untitled</li><li>Design: <a href="https://html5up.net">HTML5 UP</a></li>
							</ul>
						</div>
					</footer>

			</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="assets/js/main.js"></script>

	</body>
</html>

