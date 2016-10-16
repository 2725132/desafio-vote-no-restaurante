<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>
    <head>
		<jsp:include page="head.jsp"></jsp:include>
	</head>
	
	<title>Which's the best?</title>
	<body class="mainscreen">
	<div class="container">
		<div class="jumbotron">
			<h1 class="logo">Which's the best restaurant?</h1>
		</div>
		
		<div class="row">
			<form method="post" action="computeVote">
				<div class="col-sm-4">
					<h2 class="logo">${restaurantOne.name}</h2>
					<button class="yellow-btn text" name="restaurantId" value="${restaurantOne.id}" >Vote</button>
				</div>
			
				<div class="col-sm-4">
					<h2 class="logo">${restaurantTwo.name}</h2>
					<button class="red-btn" name="restaurantId" value="${restaurantTwo.id}"  >Vote</button>
				</div>
			
				<div class="col-sm-4">
					<h2 class="logo">${restaurantThree.name}</h2>
					<button class="green-btn" name="restaurantId" value="${restaurantThree.id}" >Vote</button>
				</div>
			</form>
		</div>
		<jsp:include page="footer.jsp"></jsp:include>
		
	</div>
	</body>
</html>