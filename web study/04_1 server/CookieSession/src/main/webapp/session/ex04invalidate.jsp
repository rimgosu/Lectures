<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%--
	ex1) setSession:
		세션(Session): 사용자의 정보를 유지시켜주는 기술
					  서버PC에 저장
					  다양한 자료형 데이터를 저장 --> Object객체로 변환되어 저장 (업캐스팅)
					  데이터 저장 시, 개수나 용량 제한이 없음(서버 용량에 따라 달라질 수 있음)
					  웹 브라우저에 의존 X
					  
		세션영역에 데이터를 저장하는 방법 : session.setAttribute(name,value)
			name  : 문자열
			value : 기본자료형, 참조형 모두 저장 가능
	ex2) getSession:
		특정 타입에 저장할 경우 자료형을 변환해줘야함. (다운캐스팅)
		String name = session.getAttribute("name"); 		(불가능, X)
		String name = (String)session.getAttribute("name"); (가능,  O)
		
		int age = (int)session.getAttribute("age");         (권장되지 않음, X; 구문에 이상은 없으나, 값이 없을 때 null 처리가 안됨)
		Integer age = (Integer)session.getAttribute("age"); (권장됨,      O; null 처리 가능; Wraper 클래스)
	
		기본데이터 타입을 참조타입으로 변환 -> Wrapper 클래스
		*************************************
		* character : char    -> Character  *
		* decimal   : byte    -> Byte       *
		* 	          short   -> Short      *
		* 	          int     -> Integer    *
		* 	          long    -> Long       *
		* float     : float   -> Float      *
		* 	          double  -> Double     *
		* bool      : boolean -> Boolean    *
		*************************************
	ex3) removeSession: (개별 삭제)
		session.removeAttribute("name");
	===============================================================
	ex4) invalidate: (전체 삭제)
		세션에 모든 데이터를 삭제하는 방법: session.invalidate();
		- 로그아웃 기능을 구현할 때
--%>

<%
	
	session.invalidate();	

%>

</body>
</html>