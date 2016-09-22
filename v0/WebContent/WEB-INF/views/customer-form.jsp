<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>
    <head>
		<jsp:include page="head.jsp"></jsp:include>
	</head>
	
	<title>Which's the best?</title>
	<div class="mainscreen">		
		<div class="row">
				<div class="col-sm-4">
					<h1 class="cover-heading">${restaurantOne.name}</h1>
					<p class="lead">${restaurantOne.voteCount}</p>
				</div>
			
				<div class="col-sm-4">
					<h1>${restaurantTwo.name}</h1>
					<p class="lead">${restaurantTwo.voteCount}</p>
				</div>
			
				<div class="col-sm-4">
					<h1>${restaurantThree.name}</h1>
					<p class="lead">${restaurantThree.voteCount}</p>
				</div>
		</div>
			<form action="insertCustomer" method="post">
				<div class="form-group col-sm-4 col-sm-offset-4 centered">
					<label for="firstnameInput">First name</label>
					<input class="form-control" name="firstName"></label>
					
					<label for="lastNameInput">Last name</label>
					<input  class="form-control" name="lastName"></label>
					
					<label for="emailInput">Email</label>
					<input class="form-control" name="email"></label>
					<br>
					<button  class="btn btn-default">Send!</button>
					<br><br>
				
				</div>
			</form>
	</div>
		
		
	</body>

	

</html>