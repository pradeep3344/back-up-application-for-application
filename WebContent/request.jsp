<%@page import="java.util.Random"%>
<%@page import="java.sql.*" %>
<%String id=request.getParameter("id"); 
String uname=request.getParameter("uname");
System.out.println(uname);
int delete=1;
%>
<%
Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backup","root","root");
	PreparedStatement ps=con.prepareStatement("update upload set delete1=? where id=? ");
	ps.setInt(1, delete);
/* 	ps.setString(2,uname);
 */	ps.setString(2,id);

	ps.executeUpdate();
response.sendRedirect("backup1.jsp?Request send Successful");

%>
