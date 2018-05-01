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
<!-- Styles -->
<link rel="stylesheet" href="../styles/bootstrap.min.css">
<link rel="stylesheet" href="../styles/style.css">

<!-- scripts -->
<script src="../scripts/jquery.min.js"></script>
<script src="../scripts/bootstrap.min.js"></script>
<script src="../scripts/jquery-ui.js"></script>

<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
      </script>
    <![endif]-->

</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="/HotelSearch/">Hotel Search</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="../Hotel/hotel.html">Hotel Search</a></li>
				<li><a href="../Flight/flight.html">Flight Search</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<div class="row">
			<h1>Results</h1>
			<p>
				offers based on your search <br> &nbsp;
			</p>
		</div>
		<c:forEach items="${offers}" var="hotel">
			<div class="row abovebottom">
				<div class=col-md-2>
					<img src="${hotel.imageUrl}" alt="${hotel.hotelName}" />
				</div>
				<div class="col-md-4">
					<h3>${hotel.hotelName}</h3>
					<h5>${hotel.hotelAddress}</h5>
				</div>
				<div class="col-md-3">
					<h5>Guest Rating: ${hotel.guestRating }/5</h5>
					<br />
					<h5>Hotel starts: ${hotel.starRating }/5</h5>
				</div>
				<div class="col-md-3">
					<h4>Average Price</h4>
					<br />
					<h4>${hotel.offerPrice }</h4>
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