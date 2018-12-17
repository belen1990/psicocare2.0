<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

        <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <meta http-equiv="X-UA-Compatible" content="ie=edge">
                <title>Test 3</title>
                <link rel="stylesheet" href="CSS/teststyle.css">
            
            </head>
            
            <body>
                <header>
                    <nav  class="nav-wrapper blue lighten-3">
                                <div  style="position: relative; display: inline-block;" class="brand-logo">PsicoCare   <img  src="./IMG/logo photoshopeado2.png" alt="Logo" id="logo"></div> 
                             
                        
                            <!--Le falta el efecto sombra y quizas reposicionar logo-->
            
                    
                    </nav>
            
                  
                </header>
    <section>
        <h1><u>Question 3 out of 5 </u></h1>
       

        <br>
        <ul>

            <li>3. How do you feel about the next statement?<br></li>

        </ul>

        <label for="question3">
            <p style="text-align:center;font-size:20px;text-justify: inter-cluster;">It is difficult for me to be in a
                social situation in which people might judge me. <br>Answers ranges from 1 as completely disagree to 5
                as  completely agreeing</p>
        </label>

            <table  style="align-content: center; margin:auto;">
                 <form  id="loginform" method="POST" >    

                    <tr>
                        <td><input id="q31" name="question" value="1" type="radio"></td>
                        <td>1</td>
                    </tr>

                    <tr>
                        <td><input id="q32" name="question" value="2" type="radio"></td>
                        <td>2</td>
                    </tr>
                    <tr>
                        <td><input id="q33" name="question" value="3" type="radio"></td>
                        <td>3</td>
                    </tr>
                    <tr>
                        <td><input id="q34" name="question" value="4" type="radio"></td>
                        <td>4</td>
                    </tr>
                    <tr>
                            <td><input id="q35" name="question" value="5" type="radio"></td>
                            <td>5</td>
                        </tr>

                    </form>
                </table>

    </section>

    <footer>
     
        <table style="align-content: center; margin:auto;">

            <tr>
                <td><a id="res3"href="test2.jsp"><img class="vuelta" src="IMG/arrow.png"></a></td>
                <td><label id="res2" for="total">
                        <p>&nbsp;&nbsp;Total progress 3 out of 5</p>
                </td>
                <td>
                    <div id="test5" class="progress-example; text-align:left;">

                        <progress id="total" name="total" max="5" value="3">
                            3 of 5
                        </progress> </div>
                </td>
                <td> <a   id="res1" href="test4.jsp"><img class="ida" src="IMG/arrow.png"> </a></td>
            </tr>
        </table>
    </footer>
</body>
<script src="JS/jquery-3.3.1.min.js"></script>
<script src="./JS/tests_resp.js"></script>
</html>