package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgotpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Forgot Password</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\"/>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            #mydiv{\n");
      out.write("               margin:100px 0px 100px 0px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("               ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "homemenu.jsp", out, false);
      out.write("                \n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            \n");
      out.write("            <form  method=\"post\" action=\"forgotpwd.jsp\">\n");
      out.write("            <div class=\"row\" id=\"mydiv\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"panel panel-success\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h1 class=\"panel-title\"> Forgot Password</h1>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"form-group\" >\t\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"uname\" class=\"form-control\"  placeholder=\"Enter User name\"/><br/>\n");
      out.write("                                        <input type=\"email\" name=\"email\" class=\"form-control\"  placeholder=\"Enter Your Email Address\"/><br/>\n");
      out.write("                                        <input type=\"text\" name=\"mob\" class=\"form-control\"  placeholder=\"Enter Mob No\"/><br/>\n");
      out.write("                                        \n");
      out.write("                                        <input type=\"submit\" class=\"btn btn-success\" value=\"Submit\">\n");
      out.write("                            </div> \t\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("           </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("               ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("                \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
