package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    
    String requester=(String)session.getAttribute("UNM");
    Class.forName("oracle.jdbc.driver.OracleDriver");  
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","narayan","sah");
    Statement st=con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_SENSITIVE);
    ResultSet rs=st.executeQuery("Select * from cart where requester='"+requester+"' and status='yes'");
   /* PreparedStatement pst=con.prepareStatement("Select * from cart where requester=? and status='yes'");
    pst.setString(1,requester);
    ResultSet rs=pst.executeQuery();*/

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>\n");
      out.write("            \n");
      out.write("        </title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("             <form action=\"\" method=\"post\">\n");
      out.write("                 \n");
      out.write("                 <div class=\"panel panel-primary\">\n");
      out.write("                     <div class=\"panel-heading\">\n");
      out.write("                         <center> <h1 class=\"panel-title\"> Cart Information </h1></center>\n");
      out.write("                             \n");
      out.write("                         \n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"panel-body\">\n");
      out.write("                         <table class=\"table table-bordered\">\n");
      out.write("                                 <tr>\n");
      out.write("                                     <th width=\"40%\">Picture</th>\n");
      out.write("                                     <th width=\"20%\">Cat Name</th>\n");
      out.write("                                     <th width=\"20%\">Item Name</th>\n");
      out.write("                                     <th width=\"20%\">Action</th>\n");
      out.write("                                 </tr>\n");
      out.write("                                ");
 while(rs.next()) { 
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><img src=\"File_upload\\");
      out.print(rs.getString(3));
      out.write('\\');
      out.print(rs.getString(2));
      out.write(".jpg\" width=\"100\" height=\"100\"/></td>\n");
      out.write("                                       <td>");
      out.print( rs.getString(3));
      out.write("</td>\n");
      out.write("                                       <td>");
      out.print( rs.getString(4));
      out.write("</td>\n");
      out.write("                                       <td><a href=\"removecart.jsp?request_id=");
      out.print(rs.getString(1));
      out.write("\">Remove</a></td>\n");
      out.write("                                      <td align=\"center\"></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
  }                     
                                
      out.write(" \n");
      out.write("                         \n");
      out.write("                         </table>\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"panel-footer\">\n");
      out.write("                         <a role=\"button\" href=\"home.jsp\" class=\"btn btn-lg btn-default\">Contiune Shopping</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                          <input type=\"button\" value=\"Clear\" class=\"btn btn-lg btn-default\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                         <input type=\"submit\" value=\"Checkout\" class=\"btn btn-lg btn-danger\">\n");
      out.write("                     </div>\n");
      out.write("                 </div>            \n");
      out.write("             </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
