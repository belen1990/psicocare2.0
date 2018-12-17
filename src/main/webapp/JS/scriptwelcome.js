document.getElementById('register').onclick = (function(event){  //Creamos un evento para que al hacer click en el botón de registrarse se pueda detectar si el registro por parte del usuario está incompleto o contiene errores

    event.preventDefault();
    document.querySelectorAll('.error').forEach(elem => {
        elem.classList.add('hide');
    });
    
let formValid = document.getElementById('loginform').checkValidity();
let passEqs = (document.getElementById('password').value == document.getElementById('confirm').value); // Validamos el formulario y declaramos una variable para comprobar que el password y el password de confirmación son iguales.

if (formValid && passEqs) {
    let datosUsuario= { //Creamos el objeto datosUsuario para recoger agrupar la información del usuario.
        yourname:document.getElementById('name').value,
        email:document.getElementById('email').value,
        username: document.getElementById('username').value,
        password: document.getElementById('password').value,
        confirmpassword:document.getElementById('confirm').value
    };

    //Enviamos el formulario
    $.ajax({
        method: "POST",
        url: "http://www.mocky.io/v2/5be016cd320000110064940c",     
        data: datosUsuario
    }).done(function (data) {
        console.log(data);
        if (data.result) {
            localStorage.setItem('datosUsuario',JSON.stringify(datosUsuario)); //almacenamos los datos introducidos por el usuario en el localStorage
            document.getElementById("loginform").submit();//POST FORM

   //   window.location.href = 'menu.html'; //Una vez registrados nos redirige al menú principal.
        } else {
            document.getElementById('passwordnomatch').classList.remove('hide'); //mensaje de error
        }
        window.localStorage.setItem(data); //almacenar los datos
    });

} else { // si los datos introducidos son incorrectos,y no se valida el formulario, aparecen los errores correspondientes.

    if (!document.getElementById('name').checkValidity()) {
        document.getElementById('errorname').classList.remove('hide');
    }
    if (!document.getElementById('email').checkValidity()) {
        document.getElementById('erroremail').classList.remove('hide');
    }

    if (!document.getElementById('username').checkValidity()) {
        document.getElementById('errorusuario').classList.remove('hide');
    }
    if (!document.getElementById('password').checkValidity()) {
        document.getElementById('errorpassword').classList.remove('hide');
    }

    if(!passEqs){ // si los passwords son diferentes, aparece el error correspondiente

        document.getElementById('passwordnomatch').classList.remove('hide');

    }

}


});
