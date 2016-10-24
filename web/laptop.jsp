<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"> 
<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">   
</head>
<body>
    <%@page import="java.io.*"%>
    <%@page import="java.sql.*"%>
    <%@page import="java.lang.*"%>
    <%
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","narayan","sah");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from laptop");
        
    %>
    
    <div class="container-fluid">
               <jsp:include page="menu.jsp"/>               
    </div>
    <form method="get" action="./productview.jsp">
    <div class="container">
        
       
        
        
     <div class="panel panel-info">
			<div class="panel-header">
				 <a class="panel-title" href="">Laptop Details</a>
			</div>
			<div class="panel-body">
    <%
        
        while(rs.next())
        {   
            
            String p="F://Final/Stuff/web/File_upload/laptop/";
            int pic=rs.getInt(1);
            String p2=String.valueOf(pic);
            String p3=new String(p+p2+".jpg");
            System.out.println(p3);
    %>
                
                <div class="col-md-3">
                    <div class="thumbnail">
                        
                        <%
                            Blob b=rs.getBlob(8);  
                            byte barr[]=b.getBytes(1,(int)b.length());              
                            FileOutputStream fout=new FileOutputStream(p3);  
                            fout.write(barr);              
                            fout.close();
                        %>
			<img src="File_upload\book\<%=p2%>.jpg" alt="<%=rs.getString(2)%>" href="">
                            <div class="caption">
				<center> <a href="./productview.jsp?table=laptop&id=<%=rs.getInt(1)%>" ><%= rs.getString(2)%></a></center>
                            </div>
                    </div>
		</div>
            
    
       <%            
               }
         rs.close();
         con.close();
       %>
                        </div>
	</div>
                        
                        
       
    </div>
    </form>
    <div class="container-fluid">
            <jsp:include page="footer.jsp"/>                
    </div>
</body>
</html>