<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test</title>
<link rel="stylesheet" href="CSS/teststyle.css">

</head>
<body>
  <header>
    <nav class="nav-wrapper blue lighten-3">
      <div style="position: relative; display: inline-block;"
        class="brand-logo">
        PsicoCare <img src="./IMG/logo photoshopeado2.png" alt="Logo"
          id="logo">
      </div>
    </nav>
  </header>
  <c:if test="${paso==1}">
    <section name="test1">
      <h1>
        <u>Starting Questionary</u>
      </h1>
      <br>
      <ul style="list-style-type: none;">
        <!-- meter contenido dinámico -->
        <!-- TEST1 -->
        <li style="font-size: 28px; text-align: center">1. How do you
          feel about your future?<br>
        </li>
      </ul>
      <form action="" method="POST">
        <input type="hidden" id="paso" name="paso" value="1" />
        <tr>
          <td><input class="inputsubmitbtn" id="q1" name="respuestainput"
            type="radio" value="1"></td>
          <td><span> I am not particulary discouraged about my
              future.</span></td>
        </tr>
        <tr>
          <td><input class="inputsubmitbtn" id="q1" name="respuestainput"
            type="radio" value="2"></td>
          <td>I feel discouraged about the future.</td>
        </tr>
        <tr>
          <td><input class="inputsubmitbtn" id="q1" name="respuestainput"
            type="radio" value="3"></td>
          <td>I feel I have nothing to look forward to.</td>
        </tr>
        <tr>
          <td><input class="inputsubmitbtn" id="q1" name="respuestainput"
            type="radio" value="4"></td>
          <td>I feel the future is hopeless.</td>
        </tr>
      
    </section>
    <footer style="align-content: center; margin: auto;">
      
      <div></div>
      <div></div>
      <div></div>
      <label id="res2" for="total"> Total progress 1 out of 5 </label>
      <div id="test5" class="progress-example; text-align:left;">
        <progress id="total" name="total" max="5" value="1"> 1 of
          5 </progress>
      </div>
      <input type="submit" value="Enviar">
     <!-- <input type="image" src="{IMG/arrow.png}" />-->
    
    </footer>
    </form>
    <a href="./test?paso=2" id="res1"><img class="ida" 
        src="IMG/arrow.png"> </a>
    
  </c:if>
  <!-- FIN TEST1 -->
  <!-- TEST2 -->
  <c:if test="${paso==2}">
    <section name="test2">
      <h1>
        <u>Question 2 out of 5. </u>
      </h1>
      <br>
      <ul>
        <form id="loginform" method="POST">
        <input type="hidden" id="paso" name="paso" value="2" />
          <li>2. How do you feel about the next statement?<br></li> <label
            for="question2" style=><br>
            <p style="text-align: center; font-size: 20px;">I feel
              confident about my ability to handle my personal problems</p> </label>
      </ul>
      <table style="align-content: center; margin: auto;">
        <tr>
          <td style="text-align: center;"><input id="q21"
            name="respuestainput" value=1 type="radio"></td>
          <td style="text-align: center;"><input id="q22"
            name="respuestainput" value=2 type="radio"></td>
          <td style="text-align: center;"><input id="q23"
            name="respuestainput" value=3 type="radio"></td>
          <td style="text-align: center;"><input id="q24"
            name="respuestainput" value=4 type="radio"></td>
          <td style="text-align: center;"><input id="q25"
            name="respuestainput" value=5 type="radio"></td>
        </tr>
        
        <tr>
          <td>Mostly agree&nbsp;</td>
          <td>&nbsp;Partly agree&nbsp;</td>
          <td>&nbsp;Neutral&nbsp;</td>
          <td>&nbsp;Partly disagree&nbsp;</td>
          <td>&nbsp;Mostly disagree&nbsp;</td>
        </tr>
      </table>
      <br> <br>
      </div>
    </section>
    <footer>
      <table style="align-content: center; margin: auto;">
        <tr>
          <td><a id="res3" href="./test?paso=1"><img class="vuelta"
              src="IMG/arrow.png"></a></td>
          <td><label id="res2" for="total">
              <p>&nbsp;&nbsp;Total progress 2 out of 5</p></td>
          <td>
            <div id="test5" class="progress-example; text-align:left;">
              <progress id="total" name="total" max="5" value="2"> 2
                of 5 </progress>
            </div>
             <input type="submit" value="Enviar">
          </td>
          <td>
        </tr>
      </table>
     
    </footer>
    </form>
    <a id="res1" href="./test?paso=3"><img class="ida"
              src="IMG/arrow.png"> </a></td>
  </c:if>
  <!-- FIN TEST2 -->
  <!-- TEST3 -->
  <c:if test="${paso==3}">
    <section name="test3">
      <h1>
        <u>Question 3 out of 5 </u>
      </h1>
      <br>
      <ul>
        <li>3. How do you feel about the next statement?<br></li>
      </ul>
      <label for="question3">
        <p
        style="text-align: center; font-size: 20px; text-justify: inter-cluster;">
          It is difficult for me to be in a social situation in which people
          might judge me. <br>Answers ranges from 1 as completely
          disagree to 5 as completely agreeing
        </p>
      </label>
      <table style="align-content: center; margin: auto;">
        <form id="loginform" method="POST">
        <input type="hidden" id="paso" name="paso" value="3" />
          <tr>
            <td><input id="q31" name="respuestainput" value="1" type="radio"></td>
            <td>1</td>
          </tr>
          <tr>
            <td><input id="q32" name="respuestainput" value="2" type="radio"></td>
            <td>2</td>
          </tr>
          <tr>
            <td><input id="q33" name="respuestainput" value="3" type="radio"></td>
            <td>3</td>
          </tr>
          <tr>
            <td><input id="q34" name="respuestainput" value="4" type="radio"></td>
            <td>4</td>
          </tr>
          <tr>
            <td><input id="q35" name="respuestainput" value="5" type="radio"></td>
            <td>5</td>
          </tr>
        
      </table>
    </section>
    
    <footer>
   
    <table style="align-content: center; margin:auto;">
      <tr>
        <td><a id="res3" href="./test?paso=2"><img class="vuelta" src="IMG/arrow.png"></a></td>
        <td><label id="res2" for="total">
            <p>&nbsp;&nbsp;Total progress 3 out of 5</p>
        </td>
        <td>
          <div id="test5" class="progress-example; text-align:left;">
            <progress id="total" name="total" max="5" value="3">
              3 of 5
            </progress> </div>
             <input type="submit" value="Enviar">
        </td>
        <td> </td>
         
      </tr>
    </table>
   
  </footer>
  </form>
  <a  id="res1" href="./test?paso=4"><img class="ida" src="IMG/arrow.png"> </a>
  </c:if>
  <!-- FIN TEST3 -->
  <!-- TEST4 -->
  <c:if test="${paso==4}">
    <section name="test4">
      <h1>
        <u>Question 4 out of 5.</u>
      </h1>
      <br>
      <ul>
        <li>4. How do you feel about the next statement?<br></li>
      </ul>
      <form method="POST" id="loginform">
      <input type="hidden" id="paso" name="paso" value="4" />
        <label for="question">
          <p style="text-align: center; font-size: 20px;">
            I am angry because things happen outside my control.<br>
          </p>
        </label>
        <div id="centrodiv" style="margin-left: 38%;">
          <input style="display: inline-block;" class="botoninput"
            type="button" id="5" name="respuestainput" value="Very often"
            onclick="botofuncion(this.id)"> <input class="botoninput"
            type="button" id="4" name="respuestainput" value="Fairly often"
            onclick="botofuncion(this.id)"> <input class="botoninput"
            type="button" id="3" name="respuestainput" value="Sometimes"
            onclick="botofuncion(this.id)"> <input class="botoninput"
            type="button" id="2" name="respuestainput" value="Almost never"
            onclick="botofuncion(this.id)"> <input class="botoninput"
            type="button" id="1" name="respuestainput" value="Never"
            onclick="botofuncion(this.id)">
        </div>
      
      </div>
      <br> <br> <br> <br>
      </div>
    </section>
    <footer>
   
    <table style="align-content: center; margin:auto;">
      <tr>
        <td><a href="./test?paso=3"><img class="vuelta" src="IMG/arrow.png"></a></td>
        <td><label id="res2" for="total">
            <p>&nbsp;&nbsp;Total progress 4 out of 5</p>
        </td>
        <td>
          <div id="test5" class="progress-example; text-align:left;">
            <progress id="total" name="total" max="5" value="4">
              4 of 5
            </progress> </div>
             <input type="submit" value="Enviar">
            
        </td>
        <td> </td>
        
      </tr>
    </table>
   
  </footer>
  </form>
  <a id="res1" href="./test?paso=5"><img class="ida" src="IMG/arrow.png"> </a>
  </c:if>
  <!-- FIN TEST4 -->
  <!-- TEST5 -->
  <c:if test="${paso==5}">
  
    <section name="test5">
      <h1 id="conflicth1">
        <u>Question 5 out of 5.</u>
      </h1>
      <br>
      <ul>
        <li>5. How do you feel about the next statement?<br></li>
        <p style="text-align: center;"></p>
      </ul>
      <label for="question5">
        <p style="text-align: center; font-size: 20px; color: black">
          In the last two weeks I have been worrying too much about different
          things.<br> Answers ranges from 1 as completely disagree to 5
          as the complete agreeing.<br> <br>
        </p>
      </label>
      <form method="POST" id="loginform">
       <input type="hidden" id="paso" name="paso" value="5" />
        <table
          style="align-content: center; margin: auto; font-size: 19px; align-items: center; width: 500px;">
          <tr>
            <td>
              <p style="margin: auto;" class="range-field">
                <input name="respuestainput"  type="range" id="test5" min="0"
                  max="5" />
              </p>
             
              </p>
            </td>
          </tr>
          <table
            style="align-content: center; margin: auto; font-size: 19px; align-items: center; width: 500px;">
            <tr>
              <td>
                <p style="margin: auto;" class="range-field">
                  <input name="respuestainput" type="range" id="test5" min="0" max="5" />
                </p>
                
                </p>
              </td>
            </tr>
          </table>
          </section>
          
          <!-- FIN TEST5 -->
          <footer>
        </table>
        <tr>
          <td><a id="res3" href="./test?paso=4"><img class="vuelta"
              src="IMG/arrow.png"></a></td>
          <td><label for="total"></label>
            <p id=res2 style="font-family: gotham; color: black;">&nbsp;&nbsp;Total
              progress 5 out of 5</p></td>
          <td>
            <div class="progress-example; text-align:left;">
              <progress id="total" name="total" max="5" value="5"> 2
                of 5 </progress>
            </div>
            <input type="submit" value="Enviar">
          </td>
          <td></td>
               
        </tr>
        </table>
    
        </footer>
        </form>
        <a id="res1" class="hidden" href="resultados.jsp"><img
              src="IMG/submit.png"> </a>
        </c:if>
</body>

<script src="JS/jquery-3.3.1.min.js"></script>

<script src="./JS/tests_resp.js"></script>

</html>