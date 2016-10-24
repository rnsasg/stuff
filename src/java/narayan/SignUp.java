package narayan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import com.oreilly.servlet.MultipartRequest;  
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Date;
import java.text.SimpleDateFormat;



public class SignUp extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        int block=Integer.parseInt(request.getParameter("block"));
        int roomno=Integer.parseInt(request.getParameter("roomno"));
        String mobno=request.getParameter("mobno");
        String rollno=request.getParameter("rollno");
        String password=request.getParameter("password");
        String gender=request.getParameter("gender");
        
       try{   
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","narayan","sah");
            PreparedStatement pst=con.prepareStatement("insert into users values(?,?,?,?,?,?,?,?,?)");
            pst.setString(1,name);
            pst.setString(2,rollno);
            pst.setString(3,email);
            pst.setString(4,mobno);
            pst.setInt(5,block);
            pst.setInt(6,roomno);
            pst.setString(7,password);
            pst.setString(8,gender);
            
            long millis=System.currentTimeMillis();  
            java.sql.Date date=new java.sql.Date(millis);           
            
            pst.setDate(9,date);
            int i=pst.executeUpdate();  
            System.out.println(i+" records affected");  
            response.sendRedirect("./index.jsp");
            con.close();
            pst.close();
               
          }catch(Exception e){
             e.printStackTrace();
             System.out.println("Failed");
          }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
