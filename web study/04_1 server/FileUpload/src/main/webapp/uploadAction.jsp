<%@page import="java.util.Enumeration"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="file.fileDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
		// String directory = application.getRealPath("/upload/");
		String directory = "C:/JSP/upload/";
		int maxSize = 1024 * 1024 * 100;
		String encoding = "UTF-8";
			
		MultipartRequest multipartRequest
		= new MultipartRequest(request, directory, maxSize, encoding, new DefaultFileRenamePolicy());
		
		Enumeration fileNames = multipartRequest.getFileNames();
		while(fileNames.hasMoreElements()) {
			
			String parameter = (String) fileNames.nextElement();
			String fileName = multipartRequest.getOriginalFileName(parameter);
			String fileRealName = multipartRequest.getFilesystemName(parameter);
			
			if(fileName == null) continue;
			// 보안코딩 적용
			// 해당 확장자가 아니면 파일 지워버림
			// 레이스 컨디션에는 좀 취약함 - 하드 코딩으로 안쪽 폴더가 아닌 아예 다른 경로를 업로드 경로로 지정하면 좀 보안에 ㄱㅊ
			if(!fileName.endsWith(".png") && !fileName.endsWith(".jpg") &&
					!fileName.endsWith(".pdf") && !fileName.endsWith(".xls")) {
				File file = new File(directory + fileRealName);
				file.delete();
				out.write("업로드할 수 없는 확장자입니다.");
			} else {
				new fileDAO().upload(fileName, fileRealName);
				out.write("파일명 : " + fileName + "<br>");
				out.write("실제파일명 : " + fileRealName + "<br>");
			}
			
		}
		
		
		
		
		
		
	
	%>
</body>
</html>