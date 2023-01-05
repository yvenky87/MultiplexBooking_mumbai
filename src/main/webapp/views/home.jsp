<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  	<title>Login 10</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<link rel="stylesheet" href="css/style.css">
	<style>
         table, th, td {
            border: 1px solid black;
         }
      </style>
      
      <script type="text/javascript">
      	function bookTickets(movieId){
      		alert(movieId);
      		var theForm = document.getElementById("thisForm");
    	   	theForm.action.value = "BookTicketServlet";
    	    theForm.movieId.value = movieId;
    	    theForm.submit();
    	  }
      </script>
	</head>
	<body class="img js-fullheight" >
	<form action="BookTicketServlet" id="thisForm">
	<input type="hidden" name="action">
  	<input type="hidden" name="movieId">
		<table>
			<tr>
				<th>Title</th>
				<th>Description</th>
				<th>Language</th>
				<th>Country</th>
				<th>Duration</th>
				<th>Release Date</th>
				<th>Genere</th>
			</tr>
			<c:forEach var="movie" items="${movies}">
				<tr>
					<td>${movie.title}</td>
					<td>${movie.description}</td>
					<td>${movie.language}</td>
					<td>${movie.country}</td>
					<td>${movie.duration}</td>
					<td>${movie.releaseDate}</td>
					<td>${movie.genere}</td>
					<td><input type="hidden" value="${movie.movieId}" name="bookTicket" />
					<input type="button" value="Book" onclick="return bookTickets(${movie.movieId})"> 
				</tr>
			</c:forEach>
		</table>
	</form>
	<script src="js/jquery.min.js"></script>
  <script src="js/popper.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/main.js"></script>

	</body>
</html>