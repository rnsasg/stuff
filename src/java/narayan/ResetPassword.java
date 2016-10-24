
package narayan;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ResetPassword extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String user=(String)request.getParameter("user");
        String otp=(String)request.getParameter("otp");
        String pwd=(String)request.getParameter("set");
        String cpwd=(String)request.getParameter("confirm");
        String msg="";
        
        if(pwd.equals(cpwd))
        {
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","narayan","sah");
                PreparedStatement pst=con.prepareStatement("update users set password=? where roll_no=?");
                pst.setString(1,pwd);
                pst.setString(2,user);
                pst.execute();
                response.sendRedirect("./index.html");
            }
            catch(Exception ex)
            {
                response.sendRedirect("./index.html");
            }
        }
        else
        {
            msg="Password and Confirm Password is not same";
            response.sendRedirect("./setpassword.jsp?user="+user+"&msg="+msg);
        }
        
        
        
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
