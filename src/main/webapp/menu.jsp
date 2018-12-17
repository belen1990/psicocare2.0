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
<link rel="stylesheet" href="./CSS/menu.css">

<title>MENU</title>
</head>

<body>
	<div>
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
		</header>
		<div>
			<!-- Aqui va el navbar-->
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
		</div>
		<div id="bodypad">
			<!-- aqui va el main page -->
			<div>
				<!--Aqui va el small test -->
				<h1 id="cabecera">MAIN MENU</h1>
				<h2>How are you feeling today?</h2>
				<form method="post">
					<div class="input-field col s12">
						<select name="aid">
							<option value="" disabled selected>${myActivity.value}</option>
							<option value="4" >stressed</option>
							<option value="3" >anxious</option>
							<option value="2" >depressed</option>
							<option value="1">lonely</option>
						</select> <label></label>
						<button>FILTRAR</button>
						
					</div>
				</form>
			</div>

			<div>
				<!--Aqui va el how about -->
				<h2>How about ${myActivity.value}</h2>
				<p value="parrafo" name="">
					<!-- AQUI HAY QUE PONERLE BORDE CON CSS-->
					${myActivity.about}
				</p>

			</div>


			<div>
				<!--Aqui va la Atc. Recomendada -->
				<h2>Recommended activity</h2>
				<section class="container">
					<div class="row">
						<div id="boton1" class="grid-example col s6 m6">
							<a class="waves-effect waves-light btn-large"
								href="./activityGeneral?aid=${myActivity.aid}"><span class="flow-text">
								</span>${myActivity.statement}</a>
						</div>
					</div>

				</section>
			</div>
		</div>
	</div>

</body>
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<script src="./JS/init.js"></script>

</html>