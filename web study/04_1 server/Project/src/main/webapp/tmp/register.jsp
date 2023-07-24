<%@ page import="java.sql.*" %>
<%@ page import="javax.naming.*" %>
<%@ page import="javax.sql.*" %>

<html>
<body>
    <form method="post" action="register.jsp">
        ID: <input type="text" name="id" /><br/>
        Password: <input type="password" name="password" /><br/>
        <input type="submit" value="Register" />
    </form>

    <% 
    String id = request.getParameter("id");
    String password = request.getParameter("password");
    if(id != null && password != null){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

            PreparedStatement ps = con.prepareStatement("insert into users values(?,?)");
            ps.setString(1, id);
            ps.setString(2, password);

            int i = ps.executeUpdate();
            if(i > 0){
                out.println("You are successfully registered...");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    %>
</body>
</html>
