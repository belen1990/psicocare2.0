<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <!-- Compiled and minified CSS -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link rel="stylesheet" href="./CSS/csgeneral.css">
    <link rel="stylesheet" href="./CSS/profilestyle.css">
    
</head>
<body>
    <jsp:include page="./header.jsp"></jsp:include>
  
    <div class="row">
        <form id="profile" class="col s12">
          <div class="row">
            <div class="input-field col s6">
              <input  id="first_name" type="text" class="validate">
              <label for="first_name">Name</label>
            </div>
            <div class="input-field col s6">
              <input id="user_name" type="text" class="validate">
              <label for="user_name">Username</label>
            </div>
          </div>
          <div class="row">
            <div class="input-field col s12">
              <input id="password" type="password" class="validate" required>
              <label for="password">Password</label>
            </div>
          </div>
          <div class="row">
            <div class="input-field col s12">
              <input id="email" type="email" class="validate">
              <label for="email">Email</label>
            </div>
          </div>
          <div class="row"> Cambiar password
              <div id="cambiarpassword" class="input-field col s12">
                <input id="passwordcambiar" type="password" class="validate" minlength="4" maxlength="10" pattern="[a-zA-Z0-9]*" required>
                <div id="errorcambiarpassword" class="error hide">La contraseña no es correcta</div>
                <div id="passwordcorrecto" class="hide">Contraseña correcta, introduzca la nueva contraseña</div>
                <label for="passwordcambiar">Contraseña actual</label>
              </div>
              
              <div class="input-field col s12">
                    <input id="passwordnuevo" type="password" class="validate" minlength="4" maxlength="10" pattern="[a-zA-Z0-9]*"required>
                    <div id="errorpasswordnuevo" class="error hide"></div>
                    <label for="passwordnuevo">Nueva contraseña</label>
                  </div>
            </div>
            <button id="save" class="btn waves-effect waves-light" type="submit" name="action">Save changes
                    <i class="material-icons right"></i>
                  </button>
          
        </form>
      </div>
</body>
<!-- Compiled and minified JavaScript -->

<script src="./JS/profilescript.js"></script>
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<script src="./JS/init.js"></script>
</html>