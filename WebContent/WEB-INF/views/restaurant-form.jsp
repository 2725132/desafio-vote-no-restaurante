<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>
    <head>
	<!--Custom CSS-->
	<link rel="stylesheet" href="mainpage.css">
	<link rel="stylesheet" href="custom.css">
	<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Ubuntu" />
	<link async href="http://fonts.googleapis.com/css?family=Advent%20Pro" data-generated="http://enjoycss.com" rel="stylesheet" type="text/css"/>
	<link async href="http://fonts.googleapis.com/css?family=Advent%20Pro" data-generated="http://enjoycss.com" rel="stylesheet" type="text/css"/>
	
		
    <!-- Bootstrap core CSS -->
    <link href="http://getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">
	
	<!-- Custom styles for this template -->
	<link href="http://getbootstrap.com/examples/cover/cover.css" rel="stylesheet">
	</head>
	
	<title>Which's the best?</title>
	<div class="container-fluid">
		<nav class="navbar">
			<a class="navbar-brand">Challenge's System</a>
			<div class="navbar-right">
				<form:form method="post" action="vote">
					<button class="btn form-btn color:light-purple">Home</button>
				</form:form>
			</div>
			
		</nav>
	
		<div class="jumbotron">
			<h2 class="">Insert new restaurant</h2>
		</div>
		<form:form method="post" action="create">
		<div class="ubuntu-h1">Set your new restaurant's name here</div>
		<input type="text" class="input-name" placeholder="type here.." name="name" required="" type="text"/><br></br>
		<button class="form-btn" method="POST" type="submit" action="create">Enjoy</div>
		</form:form>
		<h1 class="ubuntu-h1">${response.name} Successfully added with id ${response.id}</h1>
	</div>
	<div class="footer">
		<p>Made by <a href="www.github.com/2725132">Felipe</a>  ©
		<h1>Under construction...</h1>>
	</div>
		

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
	<link rel="stylesheet" type="text/css" href="css/custom.css">
	
	<script type="text/javascript" script-name="ubuntu" src="http://use.edgefonts.net/ubuntu.js"></script>
	

</html>