<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>
    <head>

		

	</head>
	
	<title>Which's the best?</title>
	<div class="container-fluid mainscreen">
		<div class="jumbotron">
			<h1 class="">Which's the best restaurant?</h1>
		</div>
		
		<div class="row">
			<form:form method="post" action="computeVote">
				<div class="col-sm-4">
					<h1>${restaurant1.name}</h1>
					<button class="yellow-btn text" name="button" value="${restaurant1.id}" >Vote</button>
				</div>
			
				<div class="col-sm-4">
					<h1>${restaurant2.name}</h1>
				<button class="red-btn" name="button" value="${restaurant2.id}"  >Vote</button>
				</div>
			
				<div class="col-sm-4">
					<h1>${restaurant3.name}</h1>
					<button class="green-btn" name="button" value="${restaurant3.id}" >Vote</button>
				</div>
			</form:form>
		</div>
		
		<div class="footer">
			<p>Made by <a href="www.github.com/2725132">Felipe</a>  ©
		</div>
	</div>
		
		
	</body>
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

	<!--Custom CSS-->
	<link rel="stylesheet" href="resources/custom.css">	
	
	<!-- Bootstrap core CSS -->
    <link href="http://getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">
	
	<!-- Custom styles for this template -->
	<link href="http://getbootstrap.com/examples/cover/cover.css" rel="stylesheet">
	
	<script src="resources/control.js"></script>
	

</html>