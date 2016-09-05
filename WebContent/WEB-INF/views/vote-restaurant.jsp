<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>
    <head>
	<!--Custom CSS-->
	<link rel="stylesheet" href="mainpage.css">
	<link rel="stylesheet" href="custom.css">
	<link async href="http://fonts.googleapis.com/css?family=Advent%20Pro" data-generated="http://enjoycss.com" rel="stylesheet" type="text/css"/>
	<link async href="http://fonts.googleapis.com/css?family=Advent%20Pro" data-generated="http://enjoycss.com" rel="stylesheet" type="text/css"/>
	
		
    <!-- Bootstrap core CSS -->
    <link href="http://getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">
	
	<!-- Custom styles for this template -->
	<link href="http://getbootstrap.com/examples/cover/cover.css" rel="stylesheet">
	</head>
	
	<title>Which's the best?</title>
	<div class="container-fluid">
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
				<button class="red-btn" name="button" value="${restaurant2.id}" type="text" >Vote</button>
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
	<body>
		<h2>${response}</h2>
		<h1 class="ubuntu-h1">Under construction...</h1>>
	</body>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
	<link rel="stylesheet" type="text/css" href="css/custom.css">
	

</html>