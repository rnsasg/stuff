<%@page import="model.Mail"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="java.util.Random"%>
<%@page import="narayan.GmailMail"%>

<% 
    String user=(String)request.getParameter("user");
    
    String msg=(String)request.getParameter("msg");
    String email=(String)request.getParameter("email");
    
    System.out.println("-----set password---");
    System.out.println(user);
    System.out.println(msg);
    System.out.println(email);
    System.out.println("-------------------");
    
    Random randomno = new Random(); 
    int num=randomno.nextInt(10000); 
    String otp="this is the OTP for your password reset :"+num;
    
%>

<%
    
    /*final String pwd="Rou&h@n$@h";
    final String from="roushannarayansah@gmail.com";
    String mail[]=new String[1];
    mail[0]=email;
            
			//String confirmationmail="Thanks for Registering as a member of Music Hub."+"\n"+"Your Email is: "+email+"\n"+"Your Password is: "+password;
		
			if(Mail.sendMail(from,pwd, "smtp.gmail.com", "465", "true","true", true,"javax.net.ssl.SSLSocketFactory","false", mail,"OTP for reset password",otp))
			{ 
				System.out.println("inside if-mail sent");
                                //response.sendRedirect("index.jsp?msg=Message Send");
			}
			 else{
				
				// response.sendRedirect("index.jsp?msg=inside else-could not send mail");
				
			}*/
%>
<%
  GmailMail gm=new GmailMail();
  String output=gm.msgSend(email,"OTP for Reset Your password",otp);  
  System.out.println(output);
%>





<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
        
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/bootstrap-theme.min.css"/>
        
        <style>
            #mydiv{
               margin:100px 0px 100px 0px;
            }
        </style>
    </head>
    <body>
        
        
        <div class="container-fluid">
               <jsp:include page="homemenu.jsp"/>                
        </div>
        <div class="container-fluid">
            
            <form  method="post" action="resetpassword">
            <div class="row" id="mydiv">
                <div class="col-sm-3">
                    
                </div>
                <div class="col-sm-6">
                    <div class="panel panel-success">
                        <div class="panel-heading">
                            <h1 class="panel-title"> Reset Password</h1>
                        </div>
                        <div class="panel-body">
                            <div class="form-group" >	
					<input type="text" name="set" class="form-control"  placeholder="Enter Password"/><br/>
                                        <input type="email" name="confirm" class="form-control"  placeholder="Reenter Password"/><br/>
                                        <input type="text" name="otp" class="form-control"  placeholder="Enter OTP"/><br/>
                                        <input type="hidden" name="user" value="out.println(user)">                                        
                                        <input type="submit" class="btn btn-success" value="Submit">
                                       
                            </div> 	
                        </div>
                    </div>
                </div>
                <div class="col-sm-3">
                    
                </div>
            </div>
                
           </form>
        </div>
        <div class="container-fluid">
               <jsp:include page="footer.jsp"/>                
        </div>
    </body>
    
</html>