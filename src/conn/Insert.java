package conn;
import java.sql.*;
import java.io.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
public class Insert {
	public static void main(String[] args) {
	}
	public static int oreg(String a,String b,String c,String d,String e,String f) {
		int a1 = 0;
		System.out.println("--==1=="+a);	
		System.out.println("--==2=="+b);	
		System.out.println("--==3=="+c);	
		System.out.println("--==4=="+d);	
		System.out.println("--=5==="+e);	
		System.out.println("--=5==="+e);	

		//String sql ="select * from reg where username=? and pass=?";
		String sql1 ="insert into reg(username,password,email,phone,add1,date)  values(?,?,?,?,?,?)";
		try{
		/*	Connection con = Dbconn.config();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, a);
			ps.setString(2, b);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
			a1=0;
			}
			else{*/
				Connection con1 = Dbconn.config();
				PreparedStatement ps1 = con1.prepareStatement(sql1);
				ps1.setString(1, a);
				ps1.setString(2, b);
				ps1.setString(3, c);
				ps1.setString(4, d);
				ps1.setString(5, e);
				ps1.setString(6, f);
			 a1=ps1.executeUpdate();
		
				System.out.println("--===="+a1);	
		}catch(Exception e1){
			e1.printStackTrace();		
		}
		return a1;
	}
public static String ulogin(String a, String b){
	System.out.println("--==1=="+a);	
	System.out.println("--==2=="+b);
	String b1="";
	String sql ="select * from reg where username=? and password=?";
	try{
		Connection con = Dbconn.config();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, a);
		ps.setString(2, b);
		ResultSet rs1 = ps.executeQuery();
		if(rs1.next()){
			b1=rs1.getString(7);
			}
		else{
			b1=null;
		}
	}catch(Exception e){
		e.printStackTrace();		
	}
	return b1;
}
public static int upload(String a,String b,String c,String d,String e) throws FileNotFoundException {
	int a1 = 0;
	System.out.println("--==1=="+b);	
	System.out.println("--==2=="+c);
	System.out.println("--==2=="+d);	
	System.out.println("--==2=="+e);	

	File f1 = new File("C:\\Users\\Ramesh\\Desktop\\"+a);
	FileInputStream fis1=new FileInputStream(f1);
		
		 FileInputStream fis11=new FileInputStream(f1);
		 FileInputStream fis3=new FileInputStream(f1);
		 

	String sql1 ="insert into upload(file,title,description,date,role)values(?,?,?,?,?)";
	try{
		
			Connection con1 = Dbconn.config();
			PreparedStatement ps1 = con1.prepareStatement(sql1);
			ps1.setBinaryStream(1, (InputStream) fis11, (int) (f1.length()));
			ps1.setString(2, b);
			ps1.setString(3, c);
			ps1.setString(4,d);
			ps1.setString(5,e);
		 a1=ps1.executeUpdate();
				System.out.println("--===="+a1);	
	}catch(Exception e1){
		e1.printStackTrace();		
	}
	return a1;
}
public static int upload1(String a,String b,String c,String d,String e) throws FileNotFoundException {
	int a1 = 0;
	System.out.println("--==1=="+b);	
	System.out.println("--==2=="+c);
	System.out.println("--==2=="+d);	
	System.out.println("--==2=="+e);	
	File f1 = new File("C:\\Users\\Ramesh\\Desktop\\"+a);
	FileInputStream fis1=new FileInputStream(f1);
		
		 FileInputStream fis11=new FileInputStream(f1); 
		 

	String sql1 ="insert into upload(file,title,description,date,role)values(?,?,?,?,?)";
	try{
		
			Connection con1 = Dbconn.config();
			PreparedStatement ps1 = con1.prepareStatement(sql1);
			ps1.setBinaryStream(1, (InputStream) fis11, (int) (f1.length()));
			ps1.setString(2, b);
			ps1.setString(3, c);
			ps1.setString(4,d);
			ps1.setString(5,e);
		 a1=ps1.executeUpdate();
				System.out.println("--===="+a1);	
	}catch(Exception e1){
		e1.printStackTrace();		
	}
	return a1;
}
public static int upload2(String a,String b,String c,String d,String e) throws FileNotFoundException {
	int a1 = 0;
	System.out.println("--==1=="+b);	
	System.out.println("--==2=="+c);
	System.out.println("--==2=="+d);	
	System.out.println("--==2=="+e);	
	File f1 = new File("C:\\Users\\Ramesh\\Desktop\\"+a);
	FileInputStream fis1=new FileInputStream(f1);
		
		 FileInputStream fis11=new FileInputStream(f1); 
		 

	String sql1 ="insert into upload(file,title,description,date,role)values(?,?,?,?,?)";
	try{
		
			Connection con1 = Dbconn.config();
			PreparedStatement ps1 = con1.prepareStatement(sql1);
			ps1.setBinaryStream(1, (InputStream) fis11, (int) (f1.length()));
			ps1.setString(2, b);
			ps1.setString(3, c);
			ps1.setString(4,d);
			ps1.setString(5,e);
		 a1=ps1.executeUpdate();
				System.out.println("--===="+a1);	
	}catch(Exception e1){
		e1.printStackTrace();		
	}
	return a1;
}
/*public static int oreg1(String a,String b,String c,String d,String e,String f) {
	int a1 = 0;
	System.out.println("--==1=="+a);	
	System.out.println("--==2=="+b);	
	System.out.println("--==3=="+c);	
	System.out.println("--==4=="+d);	
	System.out.println("--=5==="+e);
	System.out.println("--=6==="+f);	

	String sql ="select * from reg1 where uname=? and pass=?";
	String sql1 ="insert into reg1(uname,pass,phone,email,adhar,date)  values(?,?,?,?,?,?)";
	try{
		Connection con = Dbconn.config();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, a);
		ps.setString(2, b);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
		a1=0;
		}	
		else{
			Connection con1 = Dbconn.config();
			PreparedStatement ps1 = con1.prepareStatement(sql1);
			ps1.setString(1, a);
			ps1.setString(2, b);
			ps1.setString(3, c);
			ps1.setString(4, d);
			ps1.setString(5, e);
			ps1.setString(6, f);
		 a1=ps1.executeUpdate();
		}
			System.out.println("--===="+a1);	
	}catch(Exception e1){
		e1.printStackTrace();		
	}
	return a1;
}
public static String ulogin1(String a, String b){
	System.out.println("--==1=="+a);	
	System.out.println("--==2=="+b);
	String b1="";
	String sql ="select * from reg1 where uname=? and pass=?";
	try{
		Connection con = Dbconn.config();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, a);
		ps.setString(2, b);
		ResultSet rs1 = ps.executeQuery();
		if(rs1.next()){
			b1=rs1.getString(7);
			}
		else{
			b1=null;
		}
	}catch(Exception e){
		e.printStackTrace();		
	}
	return b1;
}
public static int schemes(String a,String b,String c,String d,String e) throws FileNotFoundException {
	int a1 = 0;


	String sql1 ="insert into scheme(name, description,age,year,web)values(?,?,?,?,?)";
	try{
		
			Connection con1 = Dbconn.config();
			PreparedStatement ps1 = con1.prepareStatement(sql1);
			ps1.setString(1, a);
			ps1.setString(2, b);
			ps1.setString(3, c);
			ps1.setString(4, d);
			ps1.setString(5, e);

		 a1=ps1.executeUpdate();
				System.out.println("--===="+a1);	
	}catch(Exception e1){
		e1.printStackTrace();		
	}
	return a1;
}
public static int funds(String a,String b,String c,String d,String e,String f) throws FileNotFoundException {
	int a1 = 0;


	String sql1 ="insert into funds(name,mobile,email,address,amount,post)values(?,?,?,?,?,?)";
	try{
		
			Connection con1 = Dbconn.config();
			PreparedStatement ps1 = con1.prepareStatement(sql1);
			ps1.setString(1, a);
			ps1.setString(2, b);
			ps1.setString(3, c);
			ps1.setString(4, d);
			ps1.setString(5, e);
			ps1.setString(6, f);

		 a1=ps1.executeUpdate();
				System.out.println("--===="+a1);	
	}catch(Exception e1){
		e1.printStackTrace();		
	}
	return a1;
}
public static int problem(String a,String b,String c,String d,String e) throws FileNotFoundException {
	int a1 = 0;


	String sql1 ="insert into problem(pname,des,address,date,time)values(?,?,?,?,?)";
	try{
		
			Connection con1 = Dbconn.config();
			PreparedStatement ps1 = con1.prepareStatement(sql1);
			ps1.setString(1, a);
			ps1.setString(2, b);
			ps1.setString(3, c);
			ps1.setString(4, d);
			ps1.setString(5, e);

		 a1=ps1.executeUpdate();
				System.out.println("--===="+a1);	
	}catch(Exception e1){
		e1.printStackTrace();		
	}
	return a1;
}
public static int event(String a,String b,String c,String d,String e) throws FileNotFoundException {
	int a1 = 0;


	String sql1 ="insert into event(ename,venue,date,time,contact)values(?,?,?,?,?)";
	try{
		
			Connection con1 = Dbconn.config();
			PreparedStatement ps1 = con1.prepareStatement(sql1);
			ps1.setString(1, a);
			ps1.setString(2, b);
			ps1.setString(3, c);
			ps1.setString(4, d);
			ps1.setString(5, e);

		 a1=ps1.executeUpdate();
				System.out.println("--===="+a1);	
	}catch(Exception e1){
		e1.printStackTrace();		
	}
	return a1;
}
public static int emer(String a,String b,String c,String d) throws FileNotFoundException {
	int a1 = 0;
	System.out.println("--==1=="+a);	
	System.out.println("--==2=="+b);	
	File f1 = new File("C:\\Users\\Ramesh\\Desktop\\"+c);
	FileInputStream fis1=new FileInputStream(f1);

	String sql1 ="insert into emer(ename,eid,image,contact)values(?,?,?,?)";
	try{
		
			Connection con1 = Dbconn.config();
			PreparedStatement ps1 = con1.prepareStatement(sql1);
			ps1.setString(1, a);
			ps1.setString(2, b);
			ps1.setBinaryStream(3, (InputStream) fis1, (int) (f1.length()));
			ps1.setString(4, d);
		 a1=ps1.executeUpdate();
				System.out.println("--===="+a1);	
	}catch(Exception e1){
		e1.printStackTrace();		
	}
	return a1;
}
public static int cer(String a,String b,String c,String d,String e) throws FileNotFoundException {
	int a1 = 0;
	System.out.println("--==1=="+a);	
	System.out.println("--==2=="+b);	
	File f1 = new File("C:\\Users\\Ramesh\\Desktop\\"+d);
		
		 * File f2 = new File("C:\\Users\\Ramesh\\Desktop\\"+b); File f3 = new
		 * File("C:\\Users\\Ramesh\\Desktop\\"+c);
		 

	FileInputStream fis1=new FileInputStream(f1);
		
		 * FileInputStream fis2=new FileInputStream(f2); FileInputStream fis3=new
		 * FileInputStream(f3);
		 

	String sql1 ="insert into cer(name,fname,vname,upload,uname,imagename)values(?,?,?,?,?,?)";
	try{
		
			Connection con1 = Dbconn.config();
			PreparedStatement ps1 = con1.prepareStatement(sql1);
			ps1.setString(1, a);
			ps1.setString(2, b);
			ps1.setString(3, c);
			ps1.setBinaryStream(4, (InputStream) fis1, (int) (f1.length()));
			ps1.setString(5, e);
			ps1.setString(6, f1.getName());


			
			 * ps1.setBinaryStream(2, (InputStream) fis2, (int) (f2.length()));
			 * ps1.setBinaryStream(3, (InputStream) fis3, (int) (f3.length()));
			 

		 a1=ps1.executeUpdate();
				System.out.println("--===="+a1);	
	}catch(Exception e1){
		e1.printStackTrace();		
	}
	return a1;
}
public static int cer1(String a,String b,String c,String d,String e) throws FileNotFoundException {
	int a1 = 0;
	System.out.println("--==1=="+a);	
	System.out.println("--==2=="+b);	
	File f1 = new File("C:\\Users\\Ramesh\\Desktop\\"+d);
		
		 * File f2 = new File("C:\\Users\\Ramesh\\Desktop\\"+b); File f3 = new
		 * File("C:\\Users\\Ramesh\\Desktop\\"+c);
		 

	FileInputStream fis1=new FileInputStream(f1);
		
		 * FileInputStream fis2=new FileInputStream(f2); FileInputStream fis3=new
		 * FileInputStream(f3);
		 

	String sql1 ="insert into cer1(name,fname,vname,upload,uname,imagename)values(?,?,?,?,?,?)";
	try{
		
			Connection con1 = Dbconn.config();
			PreparedStatement ps1 = con1.prepareStatement(sql1);
			ps1.setString(1, a);
			ps1.setString(2, b);
			ps1.setString(3, c);
			ps1.setBinaryStream(4, (InputStream) fis1, (int) (f1.length()));
			ps1.setString(5, e);
			ps1.setString(6, f1.getName());

			
			 * ps1.setBinaryStream(2, (InputStream) fis2, (int) (f2.length()));
			 * ps1.setBinaryStream(3, (InputStream) fis3, (int) (f3.length()));
			 

		 a1=ps1.executeUpdate();
				System.out.println("--===="+a1);	
	}catch(Exception e1){
		e1.printStackTrace();		
	}
	return a1;
}
public static int cer2(String a,String b,String c,String d,String e) throws FileNotFoundException {
	int a1 = 0;
	System.out.println("--==1=="+a);	
	System.out.println("--==2=="+b);	
	File f1 = new File("C:\\Users\\Ramesh\\Desktop\\"+d);
		
		 * File f2 = new File("C:\\Users\\Ramesh\\Desktop\\"+b); File f3 = new
		 * File("C:\\Users\\Ramesh\\Desktop\\"+c);
		 

	FileInputStream fis1=new FileInputStream(f1);
		
		 * FileInputStream fis2=new FileInputStream(f2); FileInputStream fis3=new
		 * FileInputStream(f3);
		 

	String sql1 ="insert into cer2(name,fname,vname,upload,uname,imagename)values(?,?,?,?,?,?)";
	try{
		
			Connection con1 = Dbconn.config();
			PreparedStatement ps1 = con1.prepareStatement(sql1);
			ps1.setString(1, a);
			ps1.setString(2, b);
			ps1.setString(3, c);
			ps1.setBinaryStream(4, (InputStream) fis1, (int) (f1.length()));
			ps1.setString(5, e);
			ps1.setString(6, f1.getName());

			
			 * ps1.setBinaryStream(2, (InputStream) fis2, (int) (f2.length()));
			 * ps1.setBinaryStream(3, (InputStream) fis3, (int) (f3.length()));
			 

		 a1=ps1.executeUpdate();
				System.out.println("--===="+a1);	
	}catch(Exception e1){
		e1.printStackTrace();		
	}
	return a1;
}
public static int cer3(String a,String b,String c,String d,String e) throws FileNotFoundException {
	int a1 = 0;
	System.out.println("--==1=="+a);	
	System.out.println("--==2=="+b);	
	File f1 = new File("C:\\Users\\Ramesh\\Desktop\\"+d);
		
		 * File f2 = new File("C:\\Users\\Ramesh\\Desktop\\"+b); File f3 = new
		 * File("C:\\Users\\Ramesh\\Desktop\\"+c);
		 

	FileInputStream fis1=new FileInputStream(f1);
		
		 * FileInputStream fis2=new FileInputStream(f2); FileInputStream fis3=new
		 * FileInputStream(f3);
		 

	String sql1 ="insert into cer3(name,fname,vname,upload,uname,imagename)values(?,?,?,?,?,?)";
	try{
		
			Connection con1 = Dbconn.config();
			PreparedStatement ps1 = con1.prepareStatement(sql1);
			ps1.setString(1, a);
			ps1.setString(2, b);
			ps1.setString(3, c);
			ps1.setBinaryStream(4, (InputStream) fis1, (int) (f1.length()));
			ps1.setString(5, e);
			ps1.setString(6, f1.getName());

			
			 * ps1.setBinaryStream(2, (InputStream) fis2, (int) (f2.length()));
			 * ps1.setBinaryStream(3, (InputStream) fis3, (int) (f3.length()));
			 

		 a1=ps1.executeUpdate();
				System.out.println("--===="+a1);	
	}catch(Exception e1){
		e1.printStackTrace();		
	}
	return a1;
}
public static int gf(String a,String b) throws FileNotFoundException {
	int a1 = 0;
	System.out.println("--==1=="+a);	
	System.out.println("--==2=="+b);	
	String sql1 ="insert into gf(uname,des)values(?,?)";
	try{
		
			Connection con1 = Dbconn.config();
			PreparedStatement ps1 = con1.prepareStatement(sql1);
			ps1.setString(1, a);
			ps1.setString(2, b);
		 a1=ps1.executeUpdate();
				System.out.println("--===="+a1);	
	}catch(Exception e1){
		e1.printStackTrace();		
	}
	return a1;*/
}
