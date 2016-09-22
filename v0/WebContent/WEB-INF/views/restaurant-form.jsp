<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>				
	<head>
		<jsp:include page="head.jsp"></jsp:include>
	</head>
	
  	<body class="bs-docs-home gouvea">
      
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
      
    <main class="bs-docs-masthead">
        <div class="container-fluid">            
            <h1 class="jumbotron">Make new restaurant</h1>
    		<form:form method="post" action="create">
            	<br></br> 
             	<div class="">Set your new restaurant's name here</div>
			     <div class="col-sm-6 col-sm-offset-3">
				    <input class="form-control " ng-model="restaurant" type="text" class="input-name" placeholder="type here.." name="name" required="" type="text"/>
                     <button class="form-btn" ng-click="alert()" method="POST" type="submit" action="create">Save</button>
                 </div>
                   
		      </form:form>
            </div>
            

    </main>
    <jsp:include page="footer.jsp"></jsp:include>



	

</html>