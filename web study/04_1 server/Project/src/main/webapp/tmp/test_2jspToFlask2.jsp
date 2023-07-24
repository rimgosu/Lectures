<%@ page import="java.io.*,java.net.*" %>
<%
    File file = new File(application.getRealPath("/") + "testimg.jpg");
    URL url = new URL("http://localhost:5001/upload");
    HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
    httpCon.setDoOutput(true);
    httpCon.setRequestMethod("POST");
    OutputStream out = httpCon.getOutputStream();
    FileInputStream fis = new FileInputStream(file);
    byte[] buffer = new byte[1024];
    int len;
    while ((len = fis.read(buffer)) != -1) {
        out.write(buffer, 0, len);
    }
    out.close();
    fis.close();
%>
<input type="button" value="Upload Image" onClick="location.reload();">
