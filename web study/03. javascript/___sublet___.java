/**
 * 설치 세팅:
 *      Apache Tomcat - homepage: https://tomcat.apache.org/
 *      9.0 zip version : https://tomcat.apache.org/download-90.cgi
 *      eclips 실행 - File - Switch Workspace - 폴더선택 - apache-tomcat-9.0.78 붙여넣기
 *      eclips - Server 탭 - 서버 만들기(복습 TODO - 포트번호 : 8081 ; 8080는 DB가 쓰고있다)
 * 
 * 폴더 세팅:
 *      프로젝트 만들기 : new - Dynamic Web Project - JSP/SERVLET 프로젝트 생성
 *      Servlet:
 *        Servlet - Java Resources - src/main/java - com(패키지 생성) - suvlet파일 생성
 *        자동으로 src - main - java - com에 suvlet 복제본 생김
 *        Servlet - src - main - webapp: images, html 파일 경로
 *        Servlet 파일 생성: 
 *            Inherited abstract method (o)
 *            service (o) : get, post 둘 다 처리가능
 *            Cunstructors from superclass (x)
 *            doGet / doPost (x)
 *      JSP:
 *         JSP - src - main - webapp - new jsp file - .jsp 파일로 생성
 * 
 * 한글패치:
 *      Server - Server.xml - 63번째 줄
 *      FROM : <Connector connectionTimeout="20000" maxParameterCount="1000" port="8081" protocol="HTTP/1.1" redirectPort="8443"/>
 *      TO   : <Connector URIEncoding="EUC-KR" connectionTimeout="20000" maxParameterCount="1000" port="8081" protocol="HTTP/1.1" redirectPort="8443"/>
 *      response.setCharacterEncoding("euc-kr"); : 응답 객체에 인코딩 적용
 *      req.setCharacterEncoding("euc-kr");      : req 객체에 인코딩 적용
 * 
 * request, response:
 *      String ip = request.getRemoteAddr();     : 페이지를 요청한 client의 ip 획득
 *      response                                 : 응답 객체 ; Web Page Text 및 Tag를 사용하기 위해서는 out객체 필요
 *      PrintWriter out = response.getWriter();
 *          response.getWriter().println("<div>응답</div>");
 *          out.print("<html>"); out.print("<body>"); [    쓰고싶은 내용    ] out.print("</body>"); out.print("</html>");
 *      * ipconfig - ipv4 주소 => localhost에 붙여 넣으면 연결된 네트워크끼리 주소 공유 가능
 * 
 * Mapping:
 *      @WebServlet("/Ex02")                     : 도메인 주소
 * 
 * Input:
 *      [ex03input.html -> Ex03Input.java ]
 *      [key(name)      -> value          ] (파라미터 형식)
 *      action          : 어디로 보낼 지
 *      name            : 어떠한 데이터를 보낼 지
 *      submit          : 값을 보내는 시점 
 * 
 * Get, Post: 
 *      get (오토바이) vs post (트럭); 데이터 전송
 *      Get        : url로 정보 보냄. 1024byte이내의 정보만 전송
 *  				 <form action="" method ="get">
 * 					 http://localhost:8081/Servlet/Ex06GetPost?get=1&get=2		
 *      <fieldset> : form태그에서 정보들을 그룹화하는 태그
 *      <legend>   : 범례 (제목 지어주는 것)
 * 
 *      Post       : packet의 body부분에 정보 담아서 전송
 *                   패킷 바디 안에 form 양식에 담겨 전달
 *                   많은 양의 데이터를 전송가능, get 방식에 비해 보안에 강력함
 * 
 * 체크박스& 라디오버튼:
 *      값 하나 받기 : String marriage  = request.getParameter("marriage");
 *      여러값 받기  : String[] hobbies = request.getParameterValues("hobby");
 * 
 * jsp vs sublet:
 *      jsp         : 자바코드 기반
 *      sublet      : html 기반
 *      C:\Users\aischool\Desktop\web study\04. server\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\JSP\org\apache\jsp
 *          - jsp 변환된 파일 열람할 수 있음.
 * 
 * .jsp:
 *      <%-- --%>   : 주석  
 *      <% %>       : 스크립트릿 ; 이 안에 쓰는 것들은 자바 코드가 된다.
 *      <%= %>      : 표현식    ; 변수 쓰기 
 *          쪼개기 가능 ;  <%for (int i=1; i<=10; i++) {%>
 *                          <td><%= i %></td>
 *		    	          <%};%>
 *      <%! %>      : 선언식    ; 전역변수 선언, 함수 선언
 *      <%@ page %> : 지시자    ; 1) page 지시자 : 맨 위, jsp 페이지의 전체적인 환경 설정
 *                               1_1) import    : <%@ java.util.Random %>
 *                               2)   error     : <%@ page errorPage="ex06error.jsp" %> (에러 발생시 에러페이지 이동)
 *                                                from <meta charset="EUC-KR">
 *                                                to   <meta http-equiv="refresh" content="5; url=https://www.naver.com" charset="EUC-KR">
 *                                                (5초 뒤 네이버로 이동)
 *                               3)   include   : ex) 네비게이션 바와 같이 어떤 페이지를 탐색하던 반복적으로 나오는 html문구는
 *                                                    따로 html 파일을 생성후 거기서만 작성한다.
 *                                                <%@ include file="ex07menubar.jsp" %>
 *                                                include : html 코드를 진짜 가져오는것
 *                                                iframe  : 가져와서 보여주는 것 <iframe src="ex07menubar.jsp"></iframe>
 *
 * 내장 객체:
 *      out             : ex) <% for(int i=1; i<=10; i++) {
 *                              out.print("<td>" + i + "</td>");
 *                            } %> (스크립트릿 쪼갤 필요 없어서 간편하다.)
 *      jsp 파일간 연결 : ex) <form action="ex09result.jsp">
 *                              <input type="text" name="text">
 *                              <input type="submit">
 *                           </form>
 *                       ex09result.jsp) String text = request.getParameter("text");
 *                       text로 데이터 받아올 수 있다.
 * 리다이렉트 방식:
 *      Server 요청한 Client에게 이동할 URL 전달함으로
 *      Client는 받아온 URL을 통해 다시 접근하는 방식
 *      ex) 로그인 성공하자마자 바로 홈으로 돌아가는 원리
 *          response.sendRedirect("https://www.naver.com"); 
 * 
 * 자바스크립트의 리다이렉트 :
 *          location.href="main.jsp";
 *          **주의: response.sendRedirect()문구가 밑에 있어도 response.sendRedirect()가 먼저 발동함. **
 */