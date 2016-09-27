<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<jsp:include page="head.jsp"></jsp:include>
</head>
<body class="mainscreen">
	<form class="ranking col-sm-4 col-sm-offset-4 centered">
		<h1 class="title">Ranking of restaurants</h1>
		<c:forEach items="restaurants" var="restaurant">
			<tr>
				<td> <c:out value="${restaurant.name}"/>	<c:out value="${restaurant.voteCount}"/>		
			</tr>
		</c:forEach>
	</form>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>