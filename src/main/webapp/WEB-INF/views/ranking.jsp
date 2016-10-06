<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<jsp:include page="head.jsp"></jsp:include>
</head>
<body class="mainscreen">
	<form class="ranking">
		<h1 class="title">Ranking of restaurants</h1> <br>
				<div class="firstPlace"></div><h2 class="row">${restaurants[0].name}       ${restaurants[0].voteCount}</h2> <br><br> 
				<div class="secondPlace"></div><h3 class="row">${restaurants[1].name}       ${restaurants[1].voteCount}</h3> <br><br> 
				<div class="thirdPlace"></div><h3 class="row">${restaurants[2].name}       ${restaurants[2].voteCount}</h3> <br><br> 
				<h3 class="row">${restaurants[3].name}       ${restaurants[3].voteCount}</h3> <br><br> 
				<h3 class="row">${restaurants[4].name}       ${restaurants[4].voteCount}</h3> <br><br> 
	</form>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>