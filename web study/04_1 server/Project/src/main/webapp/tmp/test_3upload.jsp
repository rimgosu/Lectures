<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="org.apache.commons.fileupload.*" %>
<%@ page import="org.apache.commons.fileupload.disk.*" %>
<%@ page import="org.apache.commons.fileupload.servlet.*" %>
<%@ page import="org.apache.commons.io.*" %>
<%@ page import="java.io.*" %>

<%
   FileItemFactory factory = new DiskFileItemFactory();
   ServletFileUpload upload = new ServletFileUpload(factory);

   List<FileItem> items = null;

   try {
      items = upload.parseRequest(request);
   } catch (FileUploadException e) {
      e.printStackTrace();
   }

   for(FileItem item : items) {
      if(!item.isFormField()) {
         String fileName = new File(item.getName()).getName();
         String filePath = getServletContext().getRealPath("/") + File.separator + fileName;
         File storeFile = new File(filePath);

         try {
            item.write(storeFile);
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   }
%>
