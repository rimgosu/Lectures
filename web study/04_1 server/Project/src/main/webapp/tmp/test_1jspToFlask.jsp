<%@ page import="java.io.*" %>
<%@ page import="java.net.HttpURLConnection" %>
<%@ page import="java.net.URL" %>
<%@ page import="java.net.URLConnection" %>
<%@ page import="java.nio.file.Files" %>
<%@ page import="java.nio.file.Paths" %>

<%!
    private String sendImage() {
        String boundary = Long.toHexString(System.currentTimeMillis());
        String CRLF = "\r\n";
        URLConnection connection = null;
        String response = null;

        try {
            URL url = new URL("http://localhost:5001/ocr");
            connection = url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

            try (
                OutputStream output = connection.getOutputStream();
                PrintWriter writer = new PrintWriter(new OutputStreamWriter(output, "UTF-8"), true);
            ) {
                String fileName = "/path/to/image.jpg";
                writer.append("--" + boundary).append(CRLF);
                writer.append("Content-Disposition: form-data; name=\"image\"; filename=\"" + fileName + "\"").append(CRLF);
                writer.append("Content-Type: " + URLConnection.guessContentTypeFromName(fileName)).append(CRLF);
                writer.append("Content-Transfer-Encoding: binary").append(CRLF);
                writer.append(CRLF).flush();
                Files.copy(Paths.get(fileName), output);
                output.flush();
                writer.append(CRLF).flush();
                writer.append("--" + boundary + "--").append(CRLF).flush();
            }

            InputStream responseStream = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(responseStream));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            response = stringBuilder.toString();
        } catch (Exception e) {
            response = "Error: " + e.getMessage();
        }

        return response;
    }
%>

<html>
    <body>
        <button onclick="document.getElementById('response').innerText = '<%= sendImage() %>';">Send Image</button>
        <p id="response"></p>
    </body>
</html>