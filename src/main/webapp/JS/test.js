console.log("Esto es el script");



document.getElementById('res1').onclick = (function (evnt) {
let questionnumber = document.getElementById("total").value;

    // console.log(evnt);
   // evnt.preventDefault();

   // document.querySelectorAll('.error').forEach(elem => {
     //   elem.classList.add('esconder');
    //});

    let formValid = document.getElementById('loginform');
   

    var radios = document.getElementsByName('question');

    for (var i = 0, length = radios.length; i < length; i++)
    {
     if (radios[i].checked)
     {
      // do whatever you want with the checked radio
      answer = (radios[i].value);
    
      // only one radio can be logically checked, don't check the rest
      break;
     }
    }


    console.log(answer);
    
    var questionid =  "question"+questionnumber; 
console.log(questionid); 

let formValid = document.getElementById('loginform');


    if (formValid) {
        //ENVIAR
        $.ajax({
            method: "POST",
            url: "http://www.mocky.io/v2/5bd9731d2f00005e0006d11d",
           
            //url: "http:www.mocky.io/v2/5be0156b3200006100649400", //url false//
            data: questionid,
        }).done(function () {
            console.log("La respuesta de "+ questionid+ " es "+answer);

            //if (data.result) {
              //  window.location.href = 'test2.html';
            //} else {
                //mensaje de error
              //  document.getElementById('mensaje').classList.remove('esconder');
            //}
        });

    } 


});