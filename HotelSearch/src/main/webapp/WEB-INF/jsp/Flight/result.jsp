<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Le styles -->
<!-- <link href="styles/bootstrap.css" rel="stylesheet"> -->
<style>
body {
	padding-top: 60px; /* 60px to make the container go all the way
      to the bottom of the topbar */
}
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="styles/jquery-ui/jquery-ui.css" rel="stylesheet">
<link href="styles/bootstrap-responsive.css" rel="stylesheet">


<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
      </script>
    <![endif]-->

<style>
.abovebottom {
	border-top-style: double;
	border-bottom-style: double;
	padding-top: 5px;
	padding-bottom: 5px;
	border-top-color: #7cbfcf;
	border-bottom-color: #7cbfcf;
	border-top-width: 8px;
	border-bottom-width: 8px;
}
</style>
</head>
<body>
	<div class="navbar navbar-fixed-top navbar-inverse">
		<div class="navbar-inner">
			<div class="container">
				<a class="brand" href="/HotelSearch/"> Hotel Search </a>
				<ul class="nav">
				</ul>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<h1>Results</h1>
			<p>
				offers based on your search <br> &nbsp;
			</p>
		</div>
		<c:forEach items="${offers}" var="flight">
			<div class="row abovebottom">

				<div class="col-md-6">
					<h3>${flight.carrierName}</h3>
					<h4>${flight.destiationAirport}</h4>
					<h5>${flight.originCity}->${flight.destiationCity}</h5>
					<h5>${flight.destiationCity}->${flight.originCity}</h5>

				</div>
				<div class="col-md-3">
					<h5>Departure Date: ${flight.departureDate}</h5>
					<br />
					<h5>Return Date: ${flight.returnDate}</h5>
				</div>
				<div class="col-md-3">
					<br />
					<h4>${flight.offerPrice }</h4>
				</div>
			</div>
		</c:forEach>
	</div>
	<!-- 	<script src="scripts/jquery-1.8.3.js">
		
	</script>
	<script src="scripts/bootstrap.js">
		
	</script> -->
</body>
</html>