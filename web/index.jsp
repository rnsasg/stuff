
<html>
    <head>
        <title>Home Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body{
                
            }
        </style>
    </head>
    <body >
        <div class="container-fluid">
            
            <div class="row">
               <jsp:include page="homemenu.jsp"/>
                
            </div>
            
            <div class="row">
                <jsp:include page="carousel.jsp"/>
            </div>
            <br>
            <div class="row">
                
                <div class="col-sm-4">
                    <jsp:include page="login.jsp"/>
                </div>
                <div class="col-sm-8">
                    <jsp:include page="signup.jsp"/>
                </div>
                
            </div>
            <div class="row">
                <jsp:include page="footer.jsp"/>
            </div>
        </div>
    </body>
</html>
