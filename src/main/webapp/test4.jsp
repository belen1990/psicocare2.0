<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Test</title>
    <link rel="stylesheet" href="CSS/teststyle.css">

</head>

<body>
    <header>
        <nav class="nav-wrapper blue lighten-3">
            <div style="position: relative; display: inline-block;" class="brand-logo">PsicoCare <img src="./IMG/logo photoshopeado2.png"
                    alt="Logo" id="logo"></div>

        </nav>

    </header>
    <section>
        <h1><u>Question 4 out of 5.</u></h1>
       

        <br>
        <ul>
          
            <li>4. How do you feel about the next statement?<br></li>

        </ul>
        <form method="POST" id="loginform" >
            <label for="question">
                <p style="text-align:center;font-size:20px;">I am angry because things happen outside my control.<br></p>
            </label>

            <div id="centrodiv" style="margin-left:38%;" > 
                    <input style=" display: inline-block;" class="botoninput" type="button" id="5" name="question"  value="Very often"  onclick="botofuncion(this.id)">
                  
                    <input class="botoninput" type="button" id="4" name="question"  value="Fairly often" onclick="botofuncion(this.id)">
                    
                    <input class="botoninput" type="button" id="3" name="question"  value="Sometimes" onclick="botofuncion(this.id)">
                    
                    <input class="botoninput" type="button" id="2" name="question"  value="Almost never" onclick="botofuncion(this.id)">


                    <input class="botoninput" type="button" id="1" name="question"  value="Never" onclick="botofuncion(this.id)">
                </div>

        </form>
        </div>
        <br><br><br><br>

        </div>
    </section>

    <footer>
      
        <table style="align-content: center; margin:auto;">

            <tr>
                <td><a href="test3.jsp"><img class="vuelta" src="IMG/arrow.png"></a></td>
                <td><label id="res2" for="total">
                        <p>&nbsp;&nbsp;Total progress 4 out of 5</p>
                </td>
                <td>
                    <div id="test5" class="progress-example; text-align:left;">

                        <progress id="total" name="total" max="5" value="4">
                            4 of 5
                        </progress> </div>
                </td>
                <td> <a  id="res1" href="test5.jsp"><img class="ida" src="IMG/arrow.png"> </a></td>
            </tr>
        </table>

    </footer>


</body>
<!-- Compiled and minified JavaScript -->
<script src=" https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"> </script>
<script src="JS/jquery-3.3.1.min.js"></script>

<script src="./JS/tests_resp.js"></script>

</html>
