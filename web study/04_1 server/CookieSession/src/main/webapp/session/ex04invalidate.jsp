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
		����(Session): ������� ������ ���������ִ� ���
					  ����PC�� ����
					  �پ��� �ڷ��� �����͸� ���� --> Object��ü�� ��ȯ�Ǿ� ���� (��ĳ����)
					  ������ ���� ��, ������ �뷮 ������ ����(���� �뷮�� ���� �޶��� �� ����)
					  �� �������� ���� X
					  
		���ǿ����� �����͸� �����ϴ� ��� : session.setAttribute(name,value)
			name  : ���ڿ�
			value : �⺻�ڷ���, ������ ��� ���� ����
	ex2) getSession:
		Ư�� Ÿ�Կ� ������ ��� �ڷ����� ��ȯ�������. (�ٿ�ĳ����)
		String name = session.getAttribute("name"); 		(�Ұ���, X)
		String name = (String)session.getAttribute("name"); (����,  O)
		
		int age = (int)session.getAttribute("age");         (������� ����, X; ������ �̻��� ������, ���� ���� �� null ó���� �ȵ�)
		Integer age = (Integer)session.getAttribute("age"); (�����,      O; null ó�� ����; Wraper Ŭ����)
	
		�⺻������ Ÿ���� ����Ÿ������ ��ȯ -> Wrapper Ŭ����
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
	ex3) removeSession: (���� ����)
		session.removeAttribute("name");
	===============================================================
	ex4) invalidate: (��ü ����)
		���ǿ� ��� �����͸� �����ϴ� ���: session.invalidate();
		- �α׾ƿ� ����� ������ ��
--%>

<%
	
	session.invalidate();	

%>

</body>
</html>