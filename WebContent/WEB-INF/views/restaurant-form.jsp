<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>
    <head>
	<!--Custom CSS-->
	
	<link async href="http://fonts.googleapis.com/css?family=Advent%20Pro" data-generated="http://enjoycss.com" rel="stylesheet" type="text/css"/>
	<link async href="http://fonts.googleapis.com/css?family=Advent%20Pro" data-generated="http://enjoycss.com" rel="stylesheet" type="text/css"/>
			
    <!-- Bootstrap core CSS -->
    <link href="http://getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">
    
	
	<link rel="stylesheet" href="mainpage.css">
	<link rel="stylesheet" href="custom.css">
	
	</head>
  <body class="bs-docs-home gouvea">
      
    <header class="navbar">
        <div class="container">
            <nav class="navbar-header">
            	<img  class="gouvea-brand"/>
                <a href="#" class="navbar-brand">Challenge</a>
            </nav>
            <nav class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li>
                        <a class="gouvea-link" href="#">About</a>
                    </li>
                    <li>
                        <a class="gouvea-link" href="#">Home</a>
                    </li>
                    <li>
                        <a class="gouvea-link" href="#">Halpa</a>
                    </li>
                </ul>
                
                <nav class="navbar-right">
                    <ul class="nav navbar">
                        <li>
                            <form:form method="post" action="vote">
								<button class="gouvea-home"></button>
							</form:form>
                        </li>
                    </ul>
                </nav>
                
            </nav>
            
        </div>
    </header>
      
    <main class="bs-docs-masthead">
        <div class="container-fluid">            
            <h1 class="jumbotron">Make your choice</h1>
    		<form:form method="post" action="create">
             <div class="">Set your new restaurant's name here</div>
			     <div class="col-sm-6 col-sm-offset-3">
				    <input class="form-control " type="text" class="input-name" placeholder="type here.." name="name" required="" type="text"/>
                     <button class="form-btn " method="POST" type="submit" action="create">Save</button>
                 </div>
		      </form:form>
            </div>
    </main>
      
    <footer class="bs-docs-footer">
        <div class="container">
            <ul class="bs-docs-footer-links">
                <li>
                    <a href="www.facebook.com/felipe.gouvea.7">Facebook</a>
                </li>
                <li>
                    <a href="github.com/2725132">Github</a>
                </li>
            </ul>
        </div>    
    </footer>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
	<link rel="stylesheet" type="text/css" href="css/custom.css">
	
	<script type="text/javascript" script-name="ubuntu" src="http://use.edgefonts.net/ubuntu.js"></script>
	

</html>