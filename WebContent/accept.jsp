<%@page import="java.util.Random"%>
<%@page import="java.sql.*" %>
<%String id=request.getParameter("id"); 
int backup=1;
%>
<%
Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backup","root","root");
	PreparedStatement ps=con.prepareStatement("update upload set backup=? where id=? ");
	ps.setInt(1, backup);
	ps.setString(2,id);
	ps.executeUpdate();
response.sendRedirect("request1.jsp?Accepted Successful");

%>
