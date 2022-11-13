<%@page import="java.util.Random"%>
<%@page import="java.sql.*" %>
<%String id=request.getParameter("id"); 
int delete=1;
%>
<%
Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backup","root","root");
	PreparedStatement ps=con.prepareStatement("update upload set deletes=? where id=? ");
	ps.setInt(1, delete);
	ps.setString(2,id);
	ps.executeUpdate();
response.sendRedirect("vieww3.jsp?deleted Successful");

%>
