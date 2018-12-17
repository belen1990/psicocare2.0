/*document.getElementById( 'dropdown1' ).dropdown();  Algo pasa con esta mierda que interfiere con scripts y no funciona*/


let i = [false, false, false, false];
function cleartext(number) {



    if (number == 1 & i[0] == false) { document.getElementById('cuentame1').value = ""; i[0] = true; }

    if (number == 2 & i[1] == false) { document.getElementById('cuentame2').value = ""; i[1] = true; }

    if (number == 3 & i[2] == false) { document.getElementById('cuentame3').value = ""; i[2] = true; }

    if (number == 4 & i[3] == false) { document.getElementById('cuentame4').value = ""; i[3] = true; }









};




document.getElementById('submitboton').onclick = (function (evnt) {

    let formValid = document.getElementById('textform');
    textarray = [];
    for (let index = 0; index < formValid.length - 1; index++) {
        textarray[index] = formValid[index].value;



    }

    if ((textarray[0] !== ("") && i[0] == true) && (textarray[1] !== ("") && i[1] == true) && (textarray[2] !== ("") && i[2] == true) && (textarray[3] !== ("") && i[3] == true)   ) {
        //ENVIAR
        $.ajax({
            method: "POST",
            url: "http://www.mocky.io/v2/5bd9731d2f00005e0006d11d",

            //url: "http:www.mocky.io/v2/5be0156b3200006100649400", //url false//
        }).done(function () {
            console.log(textarray)
            console.log("Request sent");

            //if (data.result) {
            //  window.location.href = 'test2.html';
            //} else {
            //mensaje de error
            //  document.getElementById('mensaje').classList.remove('esconder');
            //}
        });

    }

    else { }


});


