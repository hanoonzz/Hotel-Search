<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Le styles -->
<link href="styles/bootstrap.css" rel="stylesheet">
<style>
body {
	padding-top: 60px; /* 60px to make the container go all the way
      to the bottom of the topbar */
}
</style>
<link href="styles/bootstrap-responsive.css" rel="stylesheet">
<link href="styles/jquery-ui/jquery-ui.css" rel="stylesheet">

<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
      </script>
    <![endif]-->
<!-- Le fav and touch icons -->
<!--     <link rel="shortcut icon" href="assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png"> -->
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body>
	<div class="navbar navbar-fixed-top navbar-inverse">
		<div class="navbar-inner">
			<div class="container">
				<a class="brand" href="#"> Hotel Search </a>
				<ul class="nav">
				</ul>
			</div>
		</div>
	</div>
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

	<script src="scripts/jquery-1.8.3.js">
		
	</script>
	<script src="scripts/bootstrap.js">
		
	</script>
	<script src="scripts/jquery-ui.js"></script>
	<script type="text/javascript">
		$(function() {
			$(".date-picker").datepicker();
		});
	</script>
</body>
</html>
