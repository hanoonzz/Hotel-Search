<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<title>Hotels</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Styles -->
<link rel="stylesheet" href="../styles/bootstrap.min.css">
<link rel="stylesheet" href="../styles/style.css">

<!-- scripts -->
<script src="../scripts/jquery.min.js"></script>
<script src="../scripts/bootstrap.min.js"></script>
<script src="../scripts/jquery-ui.js"></script>
<script src="../scripts/app.js"></script>

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
		<div>
			<h1>Hotel Search</h1>
			<p>
				find the best hotel offers in the universe <br> &nbsp;
			</p>
		</div>

		<form:form modelAttribute="hotelFilter">
			<form:errors path="*" cssClass="errorblock" element="div" />

			<label for="destination"> Destination </label>

			<form:input name="destination" path="destination"
				cssClass="form-control" />


			<label for="startDate"> Check-in </label>
			<form:input path="startDate" cssClass="date-picker form-control" />
			<label for="endDate"> Check-out </label>
			<form:input path="endDate" cssClass="date-picker form-control" />
			<label for="endDate"> Min Star Rating </label>
			<form:input path="minStarRating" cssClass="form-control" />
			<label for="maxStarRating"> Max Star Rating </label>
			<form:input path="maxStarRating" cssClass="form-control" />
			<label for="minGuestRating"> Min Guest Rating </label>
			<form:input path="minGuestRating" cssClass="form-control" />
			<label for="maxGuestRating"> Max Guest Rating </label>
			<form:input path="maxGuestRating" cssClass="form-control" />

			<br />
			<input type="submit" class="btn" value="Search" />

		</form:form>

		<div class="control-group"></div>

	</div>


</body>
</html>
