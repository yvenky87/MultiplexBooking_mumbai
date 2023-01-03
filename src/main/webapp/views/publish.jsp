<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  	<title>Login 10</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<link rel="stylesheet" href="css/style.css">

	</head>
	<body class="img js-fullheight" style="background-image: url(images/bg.jpg);">
	
	<div class="row justify-content-center">
		<form action="publish" class="signin-form">
		      		<div class="form-group">
		      			<input type="text" class="form-control" placeholder="title" required name="title">
		      		</div>
	            <div class="form-group">
	              <input type="text" class="form-control" required name="description" placeholder="Description">
	            </div>
	            <div class="form-group">
		      			<input type="text" class="form-control" placeholder="language" required name="language">
		      		</div>
		      		<div class="form-group">
		      			<input type="text" class="form-control" placeholder="DD-MM-YYYY" required name="releaseDate">
		      		</div>
		      		<div class="form-group">
		      			<input type="text" class="form-control" placeholder="duration" required name="duration">
		      		</div>
		      		<div class="form-group">
		      			<input type="text" class="form-control" placeholder="genre" required name="genre">
		      		</div>
		      		<div class="form-group">
		      			<input type="text" class="form-control" placeholder="country" required name="country">
		      		</div>
	            <div class="form-group">
	            	<button type="submit" class="form-control btn btn-primary submit px-3">Publish</button>
	            </div>
	     </form>
	</div>
	<script src="js/jquery.min.js"></script>
  <script src="js/popper.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/main.js"></script>

	</body>
</html>