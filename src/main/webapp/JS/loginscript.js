document.getElementById('accederbtn').onclick = (function (evnt) {
    // console.log(evnt);
    evnt.preventDefault();

    document.querySelectorAll('.error').forEach(elem => {
        elem.classList.add('esconder');
    });

    let formValid = document.getElementById('loginForm').checkValidity();

    if (formValid) {
        //ENVIAR
        $.ajax({
            method: "POST",
            url: "http://www.mocky.io/v2/5bd9731d2f00005e0006d11d",//caso true
            //url: "http://www.mocky.io/v2/5bd9777d2f0000790006d14c",//caso false
            data: {
                username: document.getElementById('username').value,
                password: document.getElementById('password').value
            }
        }).done(function (data) {
            console.log(data);
            if (data.result) {
                window.location.href = 'menu.html';
            } else {
                //mensaje de error
                document.getElementById('mensaje').classList.remove('esconder');
            }
        });

    } else {
        //mostrar mensaje y no enviar
        // document.getElementById('mensaje').innerHTML="Datos incorrectos";       

        if (!document.getElementById('username').checkValidity()) {
            document.getElementById('errorusername').classList.remove('esconder');
        }

        if (!document.getElementById('password').checkValidity()) {
            document.getElementById('errorpass').classList.remove('esconder');
        }
    }
});