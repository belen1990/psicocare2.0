<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet" href="CSS/actividad4style.css">
<link rel="stylesheet" href="CSS/countdown.css">
<link rel="stylesheet" href="CSS/csgeneral.css">

<title>activity4</title>
</head>

<body>
	<header>
		<nav>
			<div class="nav-wrapper blue lighten-3">
				<a href="./menu.html" class="brand-logo left">
					<div class="brandname">PsicoCare</div>
					<img src="./IMG/logo photoshopeado2.png" alt="Logo" id="logo">
				</a>
				<ul id="menuderecha" class="right hide-on-med-and-down">
					<li><a href="./menu.html">Home</a></li>
					<li><a href="./profile.html">Main Profile</a></li>
					<li><a href="./progress.html">Progress</a></li>
					<li><a href="./homeactividades.html">Activities</a></li>
				</ul>

			</div>
		</nav>

		<ul id="slide-out" class="sidenav">
			<li>
				<div class="user-view">
					<div class="background">
						<img src="./IMG/backgroun menu.jpg">
					</div>
					<a href="#user"><img class="circle" src="./IMG/gato.png"></a>
					<a href="#name"><span class="white-text name">Klara</span></a> <a
						href="#email"><span class="white-text email">ansiedadatope@gmail.com</span></a>
				</div>
			</li>
			<li><a href="./menu.html">MENU </a></li>
			<li>
				<div class="divider"></div>
			</li>
			<li><a class="waves-effect" href="./profile.html">PROFILE</a></li>
			<li><a class="waves-effect" href="./progress.html">PROGRESS</a></li>
			<li><a class="waves-effect" href="./homeactividades.html">ACTIVITIES</a></li>
			<li><a class="waves-effect" href="./config.html">OPTIONS</a></li>
			<li><a class="waves-effect" href="./Aboutus.html">ABOUT</a></li>
			<li><a class="waves-effect" href="./login.html">LOG OUT</a></li>
		</ul>
		<a href="#" data-target="slide-out" class="sidenav-trigger"><i
			class="material-icons">menu</i></a>
	</header>

	<div>
		<p id="bodypad">Take 3 minutes to think about the social
			situations you have experienced today and how they made you feel. If
			the were successfull, think what did you do to make them work and
			congratulate yourself! If they made you feel stressed or insecure,
			reflect on what the problem was and how can you change it on further
			interactions.</p>

		<h1>Countdown Clock</h1>
		<div id="clockdiv" class="center">
			<div>
				<span class="minutes"></span>
				<div class="smalltext">Minutes</div>
			</div>
			<div>
				<span class="seconds"></span>
				<div class="smalltext">Seconds</div>
			</div>
		</div>

	</div>
	</div>

	<footer>
		<a class="miboton" href="./activity3.jsp">Back</a> <a
			class="miboton" href="./menu.html">Next</a>
	</footer>

</body>
<script src="JS/jquery-2.1.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<script src="JS/init.js"></script>
<script src="JS/countdown.js"></script>
</html>