package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class notesentry_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("               ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("                \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <div class=\"container\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("                <ul class=\"nav nav-tabs\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link active\" href=\"./bookentry.jsp\">Book</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link\" href=\"./laptopentry.jsp\">Laptop</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link\" href=\"./projectentry.jsp\">Project</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link disabled\" href=\"./notesentry.jsp\">Notes</a>\n");
      out.write("                    </li>\n");
      out.write("               </ul>   \n");
      out.write("                \n");
      out.write("            </div>    \n");
      out.write("           <div class=\"row\">\n");
      out.write("           <form method=\"post\" action=\"noteentry\" enctype=\"multipart/form-data\"> \n");
      out.write("               \n");
      out.write("           <div class=\"panel panel-default\">\n");
      out.write("\t\t<div class=\"panel-heading\">\n");
      out.write("                    <center> <h3 class=\"panel-title\">Notes Info</h3></center>\n");
      out.write("\t\t</div>\n");
      out.write("               \n");
      out.write("\t\t<div class=\"panel-body\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6 col-sm-push-3\" >\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<span class=\"input-group-addon\" id=\"basic-addon1\">Notes Title</span>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"nname\" placeholder=\"Notes Title\" aria-describedby=\"basic-addon1\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<span class=\"input-group-addon\" id=\"basic-addon1\">Subject Name</span>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"sname\" placeholder=\"Subject Name\" aria-describedby=\"basic-addon1\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<span class=\"input-group-addon\" id=\"basic-addon1\">Semester</span>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"sem\" placeholder=\"Semester\" aria-describedby=\"basic-addon1\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<span class=\"input-group-addon\" id=\"basic-addon1\">Faculty Name</span>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"fname\" placeholder=\"Faculty\" aria-describedby=\"basic-addon1\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<span class=\"input-group-addon\" id=\"basic-addon1\">Description</span>\n");
      out.write("\t\t\t\t\t\t<textarea class=\"form-control\" name=\"bdesc\" rows=\"5\" id=\"comment\"aria-describedby=\"basic-addon1\"></textarea>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t \n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\t\n");
      out.write("\t\t<br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-6 col-sm-push-3 \">\n");
      out.write("                                    <center><input type=\"file\" class=\"filestyle\" data-buttonText=\"Find file\" data-buttonName=\"btn-primary\" name=\"pic\"></center>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t</div><br>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6 col-sm-push-4\">\n");
      out.write("                        <center>\n");
      out.write("\n");
      out.write("                                <input type=\"submit\" value=\"submit\" class=\"btn btn-primary btn-lg\"/>&nbsp &nbsp &nbsp &nbsp &nbsp&nbsp&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp\n");
      out.write("                                <input type=\"button\" value=\"clear\" class=\"btn btn-info btn-lg\"/>\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("           \n");
      out.write("       </form>\n");
      out.write("            \n");
      out.write("   </div>          \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("               \n");
      out.write("          <div class=\"container-fluid\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("         </div>     \n");
      out.write("               \n");
      out.write("    </body>\n");
      out.write("   <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.min.js\"></script>    \n");
      out.write("<script src=\"js/bootstrap.min.js\"></script> \n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap-filestyle.js\"> </script>\n");
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
