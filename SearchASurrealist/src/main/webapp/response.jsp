<%-- 
    Document   : response
    Created on : Oct 4, 2015, 1:56:08 PM
    Author     : Kelsey 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Result</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/custom.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
         <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand"  href="${pageContext.request.contextPath}>Home</a>
                       </div>
                       <div id="navbar" class="collapse navbar-collapse">
                       <ul class="nav navbar-nav">
                            <li class="active"><a  href="${pageContext.request.contextPath}">Home</a></li>
                            <li><a href="AboutTheGroupServlet">More About the Group</a></li>
                            <li><a href="SurrealistServlet">Search a Surrealist</a></li>
                        </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav>
        <h1 font-family="awesome">${param.artist}</h1>
        
        <div class="containter">
            <div class="row">
                <div class="col-md-8">
                    <p class="center"> ${info}</p>
                </div> 
                <div class="col-md-4">
                    <img src=${imageURL} height="300">
                </div>
                <div class="col-md-8">
                    <img src=${art} width="700">
                </div>
            </div>
        </div>

    </body>
</html>
