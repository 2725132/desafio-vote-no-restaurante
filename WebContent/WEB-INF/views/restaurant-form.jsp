<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>				
    <!-- Bootstrap core CSS -->
    <link href="http://getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="resources/custom.css">	
	<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
	<script src="resources/controls.js"></script>

  <body class="bs-docs-home gouvea" ng-app="app">
      
    <header class="navbar">
        <div class="container">
            <nav class="navbar-header">
            	<img  class="gouveabrand"/>
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
                
                <nav class="navbar-right" >
                    <ul class="nav navbar">
                        <li>
                            <form:form method="post" action="home">
								<button class="btn gouveahome"></button>
							</form:form>
                        </li>
                    </ul>
                </nav>
                
            </nav>
            
        </div>
    </header>
      
    <main class="bs-docs-masthead" ng-view>
        <div class="container-fluid" ng-controller="cntrl">            
            <h1 class="jumbotron">Make new restaurant</h1>
    		<form:form method="post" action="create">
    		
             <div class="">Set your new restaurant's name here</div>
			     <div class="col-sm-6 col-sm-offset-3">
				    <input class="form-control " ng-model="restaurant" type="text" class="input-name" placeholder="type here.." name="name" required="" type="text"/>
                     <button class="form-btn " ng-click="alert()" method="POST" type="submit" action="create">Save</button>
                 </div>
            	 <div class="col-md-12" ng-show="showAlert">
            		<h1>ALERTA, FOI</h1>
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


	

</html>