<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>
    <head>
		<jsp:include page="head.jsp"></jsp:include>
	</head>
	
	<title>Register!</title>
	<body class="mainscreen">
	
	<div class="container-fluid">		
	
		<div class="row">
				<div class="col-sm-4">
					<h1 class="logo">${restaurantOne.name}</h1>
					<h2 class="logo">${restaurantOne.voteCount}</p>
				</div>
			
				<div class="col-sm-4">
					<h1 class="logo">${restaurantTwo.name}</h1>
					<h2 class="logo">${restaurantTwo.voteCount}</p>
				</div>
			
				<div class="col-sm-4">
					<h1 class="logo">${restaurantThree.name}</h1>
					<h2 class="logo">${restaurantThree.voteCount}</p>
				</div>
		</div>

		<form class="form-group col-sm-4 col-sm-offset-4 centered" action="insertCustomer" method="post">
					
					<h2>First name</h2>
					<input class="form-control" name="firstName" required="">
					
					<h2>Last Name</h2>
					<input  class="form-control" name="lastName" required="">
					
					<h2>Email</h2>
					<input class="form-control" name="email" required="">
					<br><br>
					<button class="btn form col-sm-4 col-sm-offset-4 centered">Send!</button>
				
			</form>
	</div>
		
		
	</body>

	

</html>