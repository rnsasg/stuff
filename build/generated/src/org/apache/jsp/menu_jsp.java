package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import cart.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

    
    String requester=(String)session.getAttribute("UNM");
    Class.forName("oracle.jdbc.driver.OracleDriver");  
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","narayan","sah");
    Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
    ResultSet rs=st.executeQuery("Select * from cart where requester='"+requester+"' and status='yes'");
    int row=0;
    while(rs.next())
        row++;
    rs.close();
    con.close();

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\"/>\n");
      out.write("        <style>  \n");
      out.write("        \n");
      out.write("                .carousel-inner > .item > img,  \n");
      out.write("                .carousel-inner > .item > a > img {  \n");
      out.write("                    width: 80%;  \n");
      out.write("                    margin: auto;  \n");
      out.write("                }   \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <nav class=\"navbar navbar-static-top navbar-light navbar-default\">\n");
      out.write("             \n");
      out.write("              <a class=\"navbar-brand\" href=\"#\"><span class=\"glyphicon glyphicon-home\"></span>&nbsp;Nitk Stuff</a>\n");
      out.write("                \n");
      out.write("              <ul class=\"nav navbar-nav\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                  <a class=\"nav-link\" href=\"./home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                  \n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    \n");
      out.write("                  <a class=\"nav-link dropdown-toggle\" drop-toggle=\"dropdown\" role=\"button\"  href=\"#\" aria-haspopup=\"true\" aria-expended=\"false\">Category</a>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"supportedContentDropdown\">\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                    </div>\n");
      out.write("                </li> \n");
      out.write("                  \n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"./bookentry.jsp\">Donate</a>\n");
      out.write("                </li>\n");
      out.write("                  \n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"#\">About</a>\n");
      out.write("                </li>\n");
      out.write("                  \n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"#\">Contact</a>\n");
      out.write("                </li>\n");
      out.write("                 <form class=\"form-inline navbar-form  navbar-right\">\n");
      out.write("                     \n");
      out.write("                        <div class=\"input-group \">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Search Item\" aria-describedby=\"basic\">\n");
      out.write("                            <span class=\"input-group-addon\" id=\"basic\"><span class=\"glyphicon glyphicon-search\"></span></span>\n");
      out.write("                        </div>\n");
      out.write("                      &nbsp; \n");
      out.write("                      <a class=\"btn btn-primary\" type=\"button\" href=\"cart.jsp\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-shopping-cart\">&nbsp;</span>Cart&nbsp;<span class=\"badge\">");
      out.print(row);
      out.write("  </span>\n");
      out.write("                        </a>\n");
      out.write("                         &nbsp;\n");
      out.write("                        <a href=\"./logout.jsp\" class=\"btn btn-lg btn-info\"><span class=\"glyphicon glyphicon-user\">Logout</span></a>\n");
      out.write("                     \n");
      out.write("                  </form>\n");
      out.write("             </ul>\n");
      out.write("                \n");
      out.write("         </nav>\n");
      out.write("       <script src=\"js/jquery.min.js\"></script> \n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("     <script src=\"js/jquery-1.10.2.min.js\"></script>\n");
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
