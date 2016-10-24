<%@page import="java.io.*"%>
<%@page import="java.sql.*"%>
<%@page import="java.lang.*"%>
<jsp:useBean id="cart" scope="session" class="bean.ShoppingCart"></jsp:useBean>
<%
    String table=request.getParameter("table");
    int id=Integer.parseInt(request.getParameter("id"));
    
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","narayan","sah");
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from "+table+" where id='"+id+"'");
    ResultSetMetaData rsmd=rs.getMetaData();
    int count=rsmd.getColumnCount();
    rs.next();
    
%>

<html>
    <head>
        <title></title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"> 
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">   
    </head>
    <body>
        
        <div class="container-fluid">
               <jsp:include page="menu.jsp"/>                
        </div>
        <form method="get" action="">
            <div class="container">
            
            
            
            <div class="panel panel-default">
                <div class="panel-heading">
                    <center><h1> <%=rs.getString(5)%></h1></center>
                </div>
                <table class="table table-bordered table-hover table-striped">
                    <tr>
                        <td>
                             <table class="table table-bordered table-hover table-striped">
                                <tr>
                                    <td>
                             <%
                                           
                             String p="F://Final/Stuff/web/File_upload/"+table+"/";
                             int pic=rs.getInt(1);
                             String p2=String.valueOf(pic);
                             String p3=new String(p+p2+".jpg");
                             System.out.println(p3);              
                                      
                             Blob b=rs.getBlob(7);  
                            byte barr[]=b.getBytes(1,(int)b.length());              
                            FileOutputStream fout=new FileOutputStream(p3);  
                            fout.write(barr);              
                            fout.close();
                           
                            %>
                            <img src="File_upload\<%= table %>\<%=p2%>.jpg" alt="<%=rs.getString(5)%>"/>          
                                        
                                        
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        
                                        <p><a href="./addtocart.jsp?table=<%=table%>&id=<%= rs.getInt(1)%>" class="btn btn-primary btn-lg" role="button">Add to cart </a>
                                             
                                             &nbsp;  &nbsp;  &nbsp;  &nbsp;
                                         <a href="#" class="btn btn-default btn-lg" role="button">Buy now </a></p>
                                        
                                    </td>
                                </tr>
                            </table >
                        </td>
                        
                        
                        <td>
                             <table class="table table-bordered table-hover table-striped">
                                <%for(int j=5;j<=count;j++){
                                    if(j==7)
                                        continue;
                                %>
                                <tr>
                                    <td><%= rsmd.getColumnLabel(j)    %></td>
                                    <td>
                                       <%=rs.getString(j)%>
                                    </td>
                                </tr>
                                <%}%>
                            </table>
                        <td>
                    </tr>
                </table>
            </div>
                            
                
            </div>
            
        </form>
      <div class="container-fluid">
               <jsp:include page="footer.jsp"/> 
      </div>        
    </body>
</html>