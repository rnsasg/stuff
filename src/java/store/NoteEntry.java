/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.Iterator;
import java.util.List;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class NoteEntry extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        String nname = null;
        String sname=null;
        String sem=null;
        String fname=null;
        String desc=null;
        String owner=null;
        Date date = null;
        FileItem flItem = null;
        PreparedStatement pst = null;
        Connection con = null;
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
      
        
        HttpSession session=request.getSession();
        owner=(String)session.getAttribute("UNM");
        
        long millis=System.currentTimeMillis();  
        date=new java.sql.Date(millis);
        
        try {
                long maxFileSize = (2 * 1024 * 1024);
                int maxMemSize = (2 * 1024 * 1024);
//              final String path = "f:/Final/Stuff/web/img";

                boolean isMultiPart = ServletFileUpload.isMultipartContent(request);
                if (isMultiPart) {
                    
                    FileItemFactory factory = new DiskFileItemFactory();
                    ServletFileUpload upload = new ServletFileUpload(factory);
                    List items = upload.parseRequest(request);
                    Iterator<FileItem> iter = items.iterator();
                    
                    while (iter.hasNext()) {
                            FileItem fileItem = iter.next();
                            if (fileItem.isFormField())
                            {
                                
                                if(fileItem.getFieldName().equals("nname"))
                                {
                                    nname = fileItem.getString();
                                }
                                if(fileItem.getFieldName().equals("sname"))
                                {
                                    sname=fileItem.getString();
                                }
                                if(fileItem.getFieldName().equals("fname"))
                                {
                                    fname=fileItem.getString();
                                }
                                if(fileItem.getFieldName().equals("sem"))
                                {
                                    sem=fileItem.getString();
                                }
                                if(fileItem.getFieldName().equals("bdesc"))
                                {
                                    desc=fileItem.getString();
                                }
                       
                            }
                            else {
                                flItem = fileItem;
                            }
                    }
                    
                System.out.println(nname);
                System.out.println(sname);
                System.out.println(fname);
                System.out.println(sem);
                System.out.println(desc);
                
                
                Class.forName("oracle.jdbc.driver.OracleDriver");  
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","narayan","sah");
                Statement st=con.createStatement();
                pst=con.prepareStatement("insert into notes values(?,?,?,?,?,?,?,?,?,?)");
                ResultSet rs=st.executeQuery("select * from notes");
                
                int count=0;
                while(rs.next())
                    count++;
                rs.close();
                
                    pst.setInt(1,count);                   
                    pst.setDate(2,date);
                    pst.setString(3,"true");
                    pst.setString(4,owner);
                    pst.setString(5,nname);
                    pst.setString(6,desc);
                    pst.setBinaryStream(7, flItem.getInputStream(), (int) flItem.getSize());
                    pst.setString(8,sname);
                    pst.setString(9,sem);
                    pst.setString(10,fname); 
                    
                int rows = pst.executeUpdate();
                con.commit();
                System.out.println(rows);
                if (rows > 0) {
                    response.sendRedirect("notesentry.jsp");
                } 
                
            }
        } catch (Exception ex) {
             System.out.println(ex.getMessage());
            response.sendRedirect("notesentry.jsp");
            
        } finally {
            
            try {
                con.close();
                pst.close();
                out.close();
                
            } catch (Exception ex) {
                
                System.out.println(ex.getMessage());
            }
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
