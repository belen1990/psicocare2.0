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
        
        <nav id="navid"  >
                    <div  style="position: relative; display: inline-block;" class="brand-logo">PsicoCare   <img  src="./IMG/logo photoshopeado2.png" alt="Logo" id="logo"></div> 
                 
        
        </nav>
  
    </header>
    
    <section>
        <h1><u>Question 2 out of 5. </u></h1>

        <br>
        <ul>
            
            <form id="loginform" method="POST">
                <li>2. How do you feel about the next statement?<br></li>
                <label for="question2" style=><br>
                    <p style="text-align:center;font-size:20px;">I feel confident about my ability to handle my
                        personal
                        problems</p>
                </label>

        </ul>


        <table style="align-content: center; margin:auto;">

            <tr>
                <td style="text-align:center;"><input id="q21" name="question" value=1 type="radio"></td>
                <td style="text-align:center;"><input id="q22" name="question" value=2 type="radio"></td>
                <td style="text-align:center;"><input id="q23" name="question" value=3 type="radio"></td>
                <td style="text-align:center;"><input id="q24" name="question" value=4 type="radio"></td>
                <td style="text-align:center;"><input id="q25" name="question" value=5 type="radio"></td>


            </tr>
            </form>
            <tr>

                <td>Mostly agree&nbsp;</td>
                <td>&nbsp;Partly agree&nbsp;</td>
                <td>&nbsp;Neutral&nbsp;</td>
                <td>&nbsp;Partly disagree&nbsp;</td>
                <td>&nbsp;Mostly disagree&nbsp;</td>
            </tr>

        </table>
        <br><br>


        </div>

    </section>

    <footer>
       
        <table style="align-content: center; margin:auto;">

            <tr>
                <td><a id="res3" href="test1.jsp"><img class="vuelta" src="IMG/arrow.png"></a></td>
                <td><label id="res2" for="total">
                        <p>&nbsp;&nbsp;Total progress 2 out of 5</p>
                </td>
                <td>
                    <div id="test5" class="progress-example; text-align:left;">

                        <progress id="total" name="total" max="5" value="2">
                            2 of 5
                        </progress> </div>
                </td>
                <td> <a id="res1" href="test3.jsp"><img class="ida" src="IMG/arrow.png"> </a></td>
            </tr>
        </table>

    </footer>

</body>
<script src="JS/jquery-3.3.1.min.js"></script>
<script src="./JS/tests_resp.js"></script>

</html>