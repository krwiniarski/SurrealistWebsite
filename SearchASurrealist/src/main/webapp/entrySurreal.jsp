<%-- 
    Document   : entrySurreal
    Created on : Oct 4, 2015, 1:45:05 PM
    Author     : Kelsey 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/custom.css" rel="stylesheet" type="text/css"/>
        <title>Surrealism</title>
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

                        </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav>
        <div class="jumbotron">
            <h1>Search A Surrealist</h1>
            <p>Enter The name of a Surrealist to learn more about them</p>
        </div>
        <div align="center">  
            <form  action="SurrealistServlet" method ="POST">

                <label>
                    Enter a Surrealist to search for: 
                    <input placeholder="Search for an artist..." type="text" name="artist">
                </label>

                <input class="btn btn-primary btn-lg" type="submit" value="Search" />
            </form>
        </div>
    </body>
</html>
