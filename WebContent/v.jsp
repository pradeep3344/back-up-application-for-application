<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%
	Blob image = null;
	System.out.println("in v");
	byte[] imgData = null;
	Statement stmt = null;
	ResultSet rs = null;
	String upload = request.getParameter("upload");
	String id = request.getParameter("id");
	System.out.println("imn: "+id);
	System.out.println("*****************");
	Connection con = null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/backup", "root", "root");
		stmt = con.createStatement();
		rs = stmt.executeQuery("select file from upload where id='"+id+"'");
		if (rs.next()) 
		{
			System.out.println("in if");
			image = rs.getBlob(1);
			imgData = image.getBytes(1, (int) image.length());
			System.out.println("in if");
		} 
		else 
		{
			out.println("Display Blob Example");
			out.println("image not found for given image>");
			return;
		}
		// display the image
		response.setContentType("image/jpg");
		System.out.println("in sssssssssssss");
		OutputStream o = response.getOutputStream();
		System.out.println("in eeeeeeeeeeeeee");
		o.write(imgData);
		o.flush();
		o.close();
	} 
	catch (Exception e) 
	{
		
		
		
		
		out.println("Unable To Display image");
		out.println("Image Display Error=" + e.getMessage());
		return;
	} 
	/* finally 
	{
		try 
		{
			rs.close();
			stmt.close();
			con.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	} */
%>
