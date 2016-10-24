
package narayan;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;



public class LoginServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        
            
        String uname=(String)request.getParameter("uname");
        String pwd=(String)request.getParameter("pwd");
        String role=(String)request.getParameter("role");
        
        
       try{   
           ResultSet rs; 
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","narayan","sah");
            System.out.println(role);
            if(role.equals("users"))
            {
                  PreparedStatement pst=con.prepareStatement("select * from users where roll_no=? and password=?");
                  pst.setString(1,uname);
                  pst.setString(2,pwd);
                  rs = pst.executeQuery();
                  if(rs.next()){
                                    String user=rs.getString(2);
                                    String urole=rs.getString(7);
                                    HttpSession session = request.getSession();
                                    session.setAttribute("UNM", uname);
                                    session.setAttribute("ROLE", role);
                                    rs.close();
                                    pst.close();
                                    con.close();
                                    response.sendRedirect("home.jsp");
                               }
                  else
                  {
                      con.close();
                      response.sendRedirect("index.jsp");
                  }

            } 
            else
            {
                 PreparedStatement pst=con.prepareStatement("select * from admin where username=? and password=?");
                 pst.setString(1,uname);
                 pst.setString(2,pwd);
                 rs = pst.executeQuery();
                  if(rs.next()){
                                    String user=rs.getString(2);
                                    String urole=rs.getString(3);
                                    HttpSession session = request.getSession();
                                    session.setAttribute("UNM", uname);
                                    session.setAttribute("ROLE", role);
                                    rs.close();
                                    pst.close();
                                    con.close();
                                    response.sendRedirect("home.jsp");
                               }
                  else
                  {
                      con.close();
                      response.sendRedirect("index.jsp");
                  }

            }
            }catch(Exception e){
               e.printStackTrace();
               System.out.println("Failed");
               response.sendRedirect("index.jsp");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
