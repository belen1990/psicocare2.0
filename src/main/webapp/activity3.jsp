<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link rel="stylesheet" href="./header.css">
    <link rel="stylesheet" href="CSS/actividad3style.css">
    <link rel="stylesheet" href="./CSS/csgeneral.css">
    <title>activity3</title>
</head>
<body>
       <!--HEADER-->
       <header>
        <nav>
            <div class="nav-wrapper blue lighten-3">
                <a href="./menu.html" class="brand-logo left">
                    <div class="brandname">PsicoCare</div><img src="./IMG/logo photoshopeado2.png" alt="Logo" id="logo">
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
                    <a href="#name"><span class="white-text name">Klara</span></a>
                    <a href="#email"><span class="white-text email">ansiedadatope@gmail.com</span></a>
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
        <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
    </header>

<div>
    <p> The following video shows a series of tips that you can apply on your daily rutine in order to manage your stress and anxiety levels. </p>
        <div class="video-container">
        <video class="responsive-video" controls>
                <iframe width="300" height="300" src="videorelax.mp4" frameborder="0" allowfullscreen></iframe>
                <source src="./videorelax.mp4" type="video/mp4">
                Video is not supported by your browser
             </video>
            </div>

</div>

<footer>
        <a class="miboton" href="./activity2.jsp">Back</a>
        <a class="miboton" href="./activity4.jsp">Next</a>   
    
</footer>
    
</body>
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<script src="./JS/init.js"></script>
</html>