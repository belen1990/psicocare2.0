<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<!-- <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css"> -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">

<!-- Website CSS style -->
<!-- <link rel="stylesheet" type="text/css" href="assets/css/main.css"> -->

<!-- Website Font style -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css"> -->

<!-- Google Fonts -->
<link href='https://fonts.googleapis.com/css?family=Passion+One'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Oxygen'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="./CSS/csgeneral.css">
<link rel="stylesheet" href="./CSS/registerstyle.css">

<title>Welcome</title>
</head>

<body>
	<div class="container">
		<div class="row main">
			<div class="panel-heading">
				<div class="panel-title text-center">
					<div id="titulo">
						<h1>Welcome to PsicoCare</h1>
						<!-- En caso de excepcion, mostrar error -->
						<div id=errorsubida>${errorsubida}</div>

						<hr />
					</div>
				</div>
				<div class="main-login main-center">
					<div id="mensaje" class="error hide">Completa el registro</div>
					<form id='loginform' class="form-horizontal" method="POST">
						<div id="tunombre" class="form-group">
							<label for="name" class="cols-sm-2 control-label">Your
								Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <input autofocus type="text"
										class="form-control" name="name" id="name"
										placeholder="Enter your Name" minlength="3" required />
									<div id="errorname" class="error hide">Introduce un
										nombre más largo</div>
								</div>
							</div>
						</div>

						<div id="tuemail" class="form-group">
							<label for="email" class="cols-sm-2 control-label">Your
								Email</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="fa fa-envelope fa" aria-hidden="true"></i></span> <input
										type="text" class="form-control" name="email" id="email"
										placeholder="Enter your Email" required />
									<div id="erroremail" class=" error hide">Introduce un
										email correcto</div>
								</div>
							</div>
						</div>

						<div id="tuusuario" class="form-group">
							<label for="username" class="cols-sm-2 control-label">Username</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="fa fa-users fa" aria-hidden="true"></i></span> <input
										type="text" class="form-control" name="username" id="username"
										placeholder="Enter your Username" required minlength="3" />
									<div id="errorusuario" class=" error hide">introduce un
										nombre de usuario correcto</div>
								</div>
							</div>
						</div>

						<div id="tupassword" class="form-group">
							<label for="password" class="cols-sm-2 control-label">Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
										type="password" class="form-control" name="password"
										id="password" placeholder="Enter your Password" minlength="4"
										maxlength="10" pattern="[a-zA-Z0-9]*" required />
									<div id="errorpassword" class=" error hide">Introduce un
										password correcto. El formato de password no es válido</div>
								</div>
							</div>
						</div>

						<div id="tuconfirmacion" class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">Confirm
								Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
										type="password" class="form-control" name="confirm"
										id="confirm" placeholder="Confirm your Password"
										pattern="[a-zA-Z0-9]*" required />
									<div id="passwordnomatch" class="error hide">el password
										no coincide</div>
								</div>
							</div>
						</div>
						<div id="boton" class="form-group ">
							<button type="submit" id="register"
								class="btn btn-primary btn-lg btn-block login-button btn-outline-primary">Register</button>
						</div>
						<div id="login" class="login-register">
							<a href="login.html">Login</a>
						</div>
					</form>
				</div>
			</div>
		</div>
</body>
<script type="text/javascript" src="assets/js/bootstrap.js"></script>
<script src="./JS/jquery-3.3.1.min.js"></script>
<script src="./JS/scriptwelcome.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

</html>