<%@ page import="java.sql.*" %>
<%@ page import="javax.naming.*" %>
<%@ page import="javax.sql.*" %>

<html>
<body>
    <form method="post" action="login.jsp">
        ID: <input type="text" name="id" /><br/>
        Password: <input type="password" name="password" /><br/>
        <input type="submit" value="Login" />
    </form>

    <% 
    String id = request.getParameter("id");
    String password = request.getParameter("password");
    if(id != null && password != null){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

            PreparedStatement ps = con.prepareStatement("select * from users where id=? and password=?");
            ps.setString(1, id);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                out.println("Welcome, " + id);
            } else {
                out.println("Invalid login. Please try again.");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    %>
</body>
</html>
