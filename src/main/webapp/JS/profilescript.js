console.log(window.localStorage.getItem('datosUsuario'));

let perfilusuario = window.localStorage.getItem('datosUsuario');

let usuario = JSON.parse(perfilusuario);

//console.log(usuario);//simplemente para verificar que los datos se han parseado bien.


document.getElementById('first_name').value = usuario.yourname;
document.getElementById('user_name').value = usuario.username;
document.getElementById('password').value = usuario.password;
document.getElementById('email').value = usuario.email;

//Si queremos cambiar la contraseña, tenemos que corroborar que el usuario conoce la contraseña actual, de manera que si la introduce de forma válida tiene que poder cambiar y al mismo tiempo cambiar la casilla de password.

document.getElementById('save').onclick = (function (event) {

    event.preventDefault();
    document.querySelectorAll('.error').forEach(elem => {
        elem.classList.add('hide');
    });
    let valida = document.getElementById('profile').checkValidity();
    //Comprobamos que la contraseña que introducimos es igual a la que tenemos guardada
    if (usuario.password == document.getElementById('passwordcambiar').value && valida) {

        if (document.getElementById('passwordcambiar').value !== document.getElementById('passwordnuevo').value) {
            // si el nuevo password que introduce el usuario no coincide con el anterior, lo almacena y se lo pasa al password que habíamos guardado en el registro en el localstorage.
            usuario.password = document.getElementById('passwordnuevo').value;
            localStorage.setItem('datosUsuario', JSON.stringify(usuario));
            window.location.reload();

            //recargamos la página al enviar los datos.
        } else {
            //Si es correcto nos indica que el password es correcto.
            document.getElementById('passwordcorrecto').classList.remove('hide');
        }

    } else {
        document.getElementById('errorcambiarpassword').classList.remove('hide'); //Sies incorrecto nos muestra el mensaje de error.
    }



});







