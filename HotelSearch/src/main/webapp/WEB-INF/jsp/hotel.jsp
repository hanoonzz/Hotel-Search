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
<link href="assets/css/bootstrap.css" rel="stylesheet">
<style>
body {
	padding-top: 60px; /* 60px to make the container go all the way
      to the bottom of the topbar */
}
</style>
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
      </script>
    <![endif]-->
</head>
<body>

	<div class="container">
		<div>
			<h1>Search for hotels</h1>
		</div>

		<form:form modelAttribute="hotelFilter">
			<div class="row">
				<div class="col-lg-6">
					<div class="form-group">
						<label for="destination"> destination </label>
						<form:input path="destination" name="destination" />
					</div>
				</div>
			</div>
			<br />
			<input type="submit" class="btn" value="Search" />
		</form:form>

		<div class="control-group"></div>
	</div>

	<script src="asset/scripts/jquery-1.8.3.js">
		
	</script>
	<script src="assets/js/bootstrap.js">
		
	</script>
</body>
</html>
