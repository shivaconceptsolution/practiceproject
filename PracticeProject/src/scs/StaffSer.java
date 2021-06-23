package scs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class StaffSer
 */
@WebServlet("/StaffSer")
public class StaffSer extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm","root","");
			Statement st = conn.createStatement();
			int res = st.executeUpdate("insert into staff(staffid,password,fullname,role) values('"+request.getParameter("txtsid")+"','"+request.getParameter("txtpass")+"','"+request.getParameter("txtfname")+"','"+request.getParameter("txtrole")+"')");
			if(res!=0)
			{
				out.print("Data Submitted Successfully");
			}
		}
		
		catch(Exception ex)
		{
			out.print(ex.getMessage());
		}
	}

}
