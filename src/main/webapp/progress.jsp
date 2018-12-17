<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<link rel="stylesheet" href="./CSS/csgeneral.css">



<title>header</title>
</head>

<body>
<jsp:include page="./header.jsp"></jsp:include>


	<title>Progress</title>



	<div id="bodypad">
		<h1>PROGRESS</h1>

		<canvas id="myChart" width="900" height="400"></canvas>

		<h2>ANXIETY</h2>
		<h3>Definition</h3>
		<article>Lorem ipsum dolor sit, amet consectetur adipisicing
			elit. Dolores distinctio commodi sint, dolor nostrum consectetur a
			quaerat, maiores corporis delectus numquam ducimus recusandae quasi
			velit debitis fuga minima eum omnis.</article>
		<h3>Symptoms</h3>
		<article>Lorem ipsum, dolor sit amet consectetur adipisicing
			elit. Recusandae quo ut error a quia voluptates quasi minus quibusdam
			reprehenderit ex voluptate beatae saepe, molestiae quos laboriosam at
			esse placeat vitae.</article>
		<h3>Recommendations</h3>
		<article>Lorem ipsum dolor sit, amet consectetur adipisicing
			elit. Sapiente odit assumenda quo asperiores cum. Dolorem, amet nihil
			inventore, ea consequatur reprehenderit sit repudiandae non qui omnis
			eius a! Exercitationem, reprehenderit.</article>
		<h3>Activities completed</h3>
		<article>Lorem ipsum dolor sit amet consectetur adipisicing
			elit. Itaque magni laudantium adipisci, ipsam excepturi autem aperiam
			quos at soluta! Impedit ipsum asperiores aliquid culpa maiores dolore
			hic at ipsam aperiam.</article>
	</div>

</body>
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js"></script>
<script src="./JS/init.js"></script>
<script src="./JS/progress.js"></script>
<script src="./JS/tests_resp.js"></script>
</html>