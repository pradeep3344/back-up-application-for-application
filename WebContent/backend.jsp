<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="conn.Insert"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		if (request.getParameter("table").equals("reg")) {
			String s1 = request.getParameter("username");
			String s2 = request.getParameter("password");
			String s3 = request.getParameter("email");
			String s4 = request.getParameter("phone");
			String s5 = request.getParameter("add");
			String s6 = request.getParameter("date");

			int a = Insert.oreg(s1, s2, s3, s4, s5, s6);

			if (a > 0) {
				response.sendRedirect("org.jsp?msg=registration completed successfully");
			} else {
				response.sendRedirect("reg.jsp?msg=owner details already exist");
			}
		}
		if (request.getParameter("table").equals("user")) {
			String name = request.getParameter("username");
			session.setAttribute("uname", name);
			String password = request.getParameter("password");
			System.out.println("--=====1--===" + name);
			System.out.println("--=====1--===" + password);
			String b = Insert.ulogin(name, password);
			session.setAttribute("id", b);

			if (b != null) {
				response.sendRedirect("ohome.jsp?msg= Organization home Page ");
			} else {
				response.sendRedirect("org.jsp?msg=invalid credentials");
			}
		}
		if (request.getParameter("table").equals("admin")) {
			String name = request.getParameter("username");
			session.setAttribute("uname", name);
			String password = request.getParameter("password");
			System.out.println("--=====1--===" + name);
			System.out.println("--=====1--===" + password);

			if (name.equals("authority") && password.equals("authority")) {
				response.sendRedirect("ahome.jsp?msg= admin home Page ");
			} else {
				response.sendRedirect("authority.jsp?msg=invalid credentials");
			}
			
		}
		if (request.getParameter("table").equals("upload")) {
			System.out.println("==================");
			String s1 = request.getParameter("file");
			String s2 = request.getParameter("title");
			String s3 = request.getParameter("description");
			String s4 = request.getParameter("date");
			String s5 = request.getParameter("role");
			session.setAttribute("role", s5);
			System.out.println(s5);
			String uname=session.getAttribute("uname").toString();

			int a = Insert.upload(s1, s2, s3,s4,s5);

			if (a > 0) {
				response.sendRedirect("upload.jsp?msg=Added  successfully");
			} else {
				response.sendRedirect("upload.jsp?msg=details are already exist");
			}
		}
		if (request.getParameter("table").equals("upload1")) {
			System.out.println("==================");
			String s1 = request.getParameter("file");
			String s2 = request.getParameter("title");
			String s3 = request.getParameter("description");
			String s4 = request.getParameter("date");
			String s5 = request.getParameter("role");
			String uname=session.getAttribute("uname").toString();

			int a = Insert.upload1(s1, s2, s3,s4,s5);

			if (a > 0) {
				response.sendRedirect("upload1.jsp?msg=Added  successfully");
			} else {
				response.sendRedirect("upload1.jsp?msg=details are already exist");
			}
		}
		if (request.getParameter("table").equals("upload2")) {
			System.out.println("==================");
			String s1 = request.getParameter("file");
			String s2 = request.getParameter("title");
			String s3 = request.getParameter("description");
			String s4 = request.getParameter("date");	
			String s5 = request.getParameter("role");
			String s7=session.getAttribute("uname").toString();

			
/* 			String uname=session.getAttribute("uname").toString();
 */
			int a = Insert.upload2(s1, s2, s3,s4,s5);

			if (a > 0) {
				response.sendRedirect("upload2.jsp?msg=Added  successfully");
			} else {
				response.sendRedirect("upload2.jsp?msg=details are already exist");
			}
		}
		
	%>

</body>
</html>