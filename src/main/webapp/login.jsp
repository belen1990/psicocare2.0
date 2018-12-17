<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link rel="stylesheet" href="CSS/loginstyle.css">
    <link rel="stylesheet" href="CSS/header.css">
</head>
<body>
        <header>
                <nav>
                    <div class="nav-wrapper blue lighten-3">
                        <a class="brand-logo left">
                            <div class="brandname">PsicoCare</div><img src="./IMG/logo photoshopeado2.png" alt="Logo" id="logo">
                        </a>
                    </div>
                </nav>
        
</header>
        
    <div id="center">
        <h1>Accede</h1>
            <section>
                    <div id="mensaje" class="error esconder">Usuario y contraseña no válidos</div>
        
                    <form id="loginForm" action="" method="POST" novalidate="">
                        <div>
                            <input type="text" placeholder="username" minlength="3" id="username" name="username" required="">
                            <div id="errorusername" class="error esconder">Completa el username con el formato correcto</div>
                        </div>
                        <div>
                            <input type="password" placeholder="password" pattern="[a-zA-Z0-9]*" id="password" name="password" required="">
                            <div id="errorpass" class="error esconder">Completa el password con el formato correcto</div>
                        </div>
                        <div><button id="accederbtn">Acceder</button></div>
                    </form>
                </section>
    </div>
    
</body>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<script src="JS/jquery-2.1.1.min.js"></script>
<script src="JS/loginscript.js"></script>
</html>