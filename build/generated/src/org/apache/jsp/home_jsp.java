package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;
import java.lang.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\"> \n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-theme.min.css\">   \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","narayan","sah");
        Statement st1=con.createStatement();
        ResultSet rs1=st1.executeQuery("select * from book where rownum<=4 order by date_of_add desc");
        Statement st2=con.createStatement();
        ResultSet rs2=st2.executeQuery("select * from laptop where rownum<=4 order by date_of_add desc");
        Statement st3=con.createStatement();
        ResultSet rs3=st3.executeQuery("select * from notes where rownum<=4 order by date_of_add desc");
        Statement st4=con.createStatement();
        ResultSet rs4=st4.executeQuery("select * from project where rownum<=4 order by date_of_add desc");
        
    
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("               ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("               \n");
      out.write("    </div>\n");
      out.write("    <form method=\"get\" action=\"./productview.jsp\">\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("        \n");
      out.write("        <div class=\"panel panel-info\">\n");
      out.write("\t\t<div class=\"panel-header\">\n");
      out.write("                    <a class=\"panel-title\" href=\"book.jsp\">Book Details</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"panel-body\">\n");
      out.write("    ");

        
        while(rs1.next())
        {   
            
            String p="F://Final/Stuff/web/File_upload/book/";
            int pic=rs1.getInt(1);
            String p2=String.valueOf(pic);
            String p3=new String(p+p2+".jpg");
            System.out.println(p3);
    
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        \n");
      out.write("                        ");

                            Blob b=rs1.getBlob(7);  
                            byte barr[]=b.getBytes(1,(int)b.length());              
                            FileOutputStream fout=new FileOutputStream(p3);  
                            fout.write(barr);              
                            fout.close();
                        
      out.write("\n");
      out.write("\t\t\t<img src=\"File_upload\\book\\");
      out.print(p2);
      out.write(".jpg\" alt=\"");
      out.print(rs1.getString(2));
      out.write("\" href=\"book.jsp\">\n");
      out.write("                            <div class=\"caption\">\n");
      out.write("\t\t\t\t<center> <a href=\"./productview.jsp?table=book&id=");
      out.print(rs1.getInt(1));
      out.write("\" >");
      out.print( rs1.getString(2));
      out.write("</a></center>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("            \n");
      out.write("    \n");
      out.write("       ");
            
               }
        rs1.close();
       
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\t</div>\n");
      out.write("          \n");
      out.write("                        \n");
      out.write("        \n");
      out.write("         \n");
      out.write("         \n");
      out.write("          <div class=\"panel panel-info\">\n");
      out.write("\t\t\t<div class=\"panel-header\">\n");
      out.write("\t\t\t\t <a class=\"panel-title\" href=\"laptop.jsp\">Laptop Details</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"panel-body\">\n");
      out.write("    ");

        
        while(rs2.next())
        {   
            
            String p="F://Final/Stuff/web/File_upload/laptop/";
            int pic=rs2.getInt(1);
            String p2=String.valueOf(pic);
            String p3=new String(p+p2+".jpg");
            System.out.println(p3);
    
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        \n");
      out.write("                        ");

                            Blob b=rs2.getBlob(8);  
                            byte barr[]=b.getBytes(1,(int)b.length());              
                            FileOutputStream fout=new FileOutputStream(p3);  
                            fout.write(barr);              
                            fout.close();
                        
      out.write("\n");
      out.write("\t\t\t<img src=\"File_upload\\book\\");
      out.print(p2);
      out.write(".jpg\" alt=\"");
      out.print(rs2.getString(2));
      out.write("\" href=\"\">\n");
      out.write("                            <div class=\"caption\">\n");
      out.write("\t\t\t\t<center> <a href=\"./productview.jsp?table=laptop&id=");
      out.print(rs2.getInt(1));
      out.write("\" >");
      out.print( rs2.getString(2));
      out.write("</a></center>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("            \n");
      out.write("    \n");
      out.write("       ");
            
               }
      
       
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\t</div>\n");
      out.write("                        \n");
      out.write(" \n");
      out.write("         \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <div class=\"panel panel-info\">\n");
      out.write("\t\t\t<div class=\"panel-header\">\n");
      out.write("\t\t\t\t <a class=\"panel-title\" href=\"notes.jsp\">Note Details</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"panel-body\">\n");
      out.write("    ");

        
        while(rs3.next())
        {   
            
            String p="F://Final/Stuff/web/File_upload/note/";
            int pic=rs3.getInt(1);
            String p2=String.valueOf(pic);
            String p3=new String(p+p2+".jpg");
            System.out.println(p3);
    
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        \n");
      out.write("                        ");

                            Blob b=rs3.getBlob(10);  
                            byte barr[]=b.getBytes(1,(int)b.length());              
                            FileOutputStream fout=new FileOutputStream(p3);  
                            fout.write(barr);              
                            fout.close();
                        
      out.write("\n");
      out.write("\t\t\t<img src=\"File_upload\\note\\");
      out.print(p2);
      out.write(".jpg\" alt=\"");
      out.print(rs3.getString(2));
      out.write("\" href=\"\">\n");
      out.write("                            <div class=\"caption\">\n");
      out.write("\t\t\t\t<center> <a href=\"./productview.jsp?table=notes&id=");
      out.print(rs3.getInt(1));
      out.write("\" >");
      out.print( rs3.getString(2));
      out.write("</a></center>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("            \n");
      out.write("    \n");
      out.write("       ");
            
               } rs3.close();
         
       
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\t</div>\n");
      out.write("                        \n");
      out.write("         \n");
      out.write("         \n");
      out.write("          <div class=\"panel panel-info\">\n");
      out.write("\t\t\t<div class=\"panel-header\">\n");
      out.write("\t\t\t\t <a class=\"panel-title\" href=\"project.jsp\">Project Details</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"panel-body\">\n");
      out.write("    ");

        
        while(rs4.next())
        {   
            
            String p="F://Final/Stuff/web/File_upload/project/";
            int pic=rs4.getInt(1);
            String p2=String.valueOf(pic);
            String p3=new String(p+p2+".jpg");
            System.out.println(p3);
    
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        \n");
      out.write("                        ");

                            Blob b=rs4.getBlob(11);  
                            byte barr[]=b.getBytes(1,(int)b.length());              
                            FileOutputStream fout=new FileOutputStream(p3);  
                            fout.write(barr);              
                            fout.close();
                        
      out.write("\n");
      out.write("\t\t\t<img src=\"File_upload\\book\\");
      out.print(p2);
      out.write(".jpg\" alt=\"");
      out.print(rs4.getString(2));
      out.write("\" href=\"\">\n");
      out.write("                            <div class=\"caption\">\n");
      out.write("\t\t\t\t<center> <a href=\"./productview.jsp?table=project&id=");
      out.print(rs4.getInt(1));
      out.write("\" >");
      out.print( rs4.getString(2));
      out.write("</a></center>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("            \n");
      out.write("    \n");
      out.write("       ");
            
               }
               rs4.close();
               con.close();
       
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("    </form>\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("                \n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
