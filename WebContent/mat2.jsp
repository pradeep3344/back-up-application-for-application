<%@ page import="java.sql.*, javax.sql.*,  java.util.HashSet, java.util.ArrayList, java.util.Iterator, java.io.*"%>
<html>
<head>

<script language="JavaScript">

</script>
</head>
<%String id=request.getParameter("id"); %>
<%@page import="java.sql.*"%>
<% Blob b = null;
String buff=null;
try
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backup","root","root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from upload where id='"+id+"'");
	while(rs.next())
	{
		b=rs.getBlob("file");
		buff=rs.getString(2);
	}
	}
catch(Exception e)
{
	out.println(e);
}
	%>
<body>		
<%

		
		if(b != null)
		{
			String fileName = buff;
			byte[] ba = b.getBytes(1, (int)b.length());
			response.setContentType("text");
			response.setHeader("Content-Disposition","attachment; fileName=\""+fileName+"\"");
			OutputStream os = response.getOutputStream();
			os.write(ba);
			os.close();
			ba = null;
			//session.removeAttribute("document1");
		}
		else
		{
			//response.sendRedirect("cost_recharge2.jsp");
			System.out.println("null");
		}
%>

</body>
</html>