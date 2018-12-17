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
<!-- Compiled and minified CSS -->
<link rel="stylesheet" href="CSS/teststyle.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

</head>

<body>
	<header>
		<nav class="nav-wrapper blue lighten-3">
			<div style="position: relative; display: inline-block;"
				class="brand-logo">
				PsicoCare <img src="./IMG/logo photoshopeado2.png" alt="Logo"
					id="logo">
			</div>


			<!--Le falta el efecto sombra y quizas reposicionar logo-->


		</nav>


	</header>
	<section>
		<h1 id="conflicth1">
			<u>Question 5 out of 5.</u>
		</h1>
		<!--Increase font size,place center, colorfull design-->

		<br>
		<ul>
			<!--Unordered HTML List - Choose List Item Marker
                  
                      The CSS list-style-type property is used to define the style of the list item marker:
                      Value 	Description
                      disc 	Sets the list item marker to a bullet (default)
                      circle 	Sets the list item marker to a circle
                      square 	Sets the list item marker to a square
                      none 	The list items will not be marked  (https://www.w3schools.com/HTML/html_lists.asp)-->
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

			<table
				style="align-content: center; margin: auto; font-size: 19px; align-items: center; width: 500px;">
				<tr>
					<td>

						<p style="margin: auto;" class="range-field">
							<input name="question" class="" type="range" id="test5" min="0"
								max="5" />
						</p>
						</form>
						</p>
					</td>
				</tr>

				<table
					style="align-content: center; margin: auto; font-size: 19px; align-items: center; width: 500px;">
					<tr>
						<td>

							<p style="margin: auto;" class="range-field">
								<input name="question" type="range" id="test5" min="0" max="5" />
							</p>
							</form>
							</p>
						</td>
					</tr>

</section>
				</table>

				<tr>
					<td><a id="res3" href="test4.jsp"><img class="vuelta"
							src="IMG/arrow.png"></a></td>
					<td><label for="total"></label>
						<p id=res2 style="font-family: gotham; color: black;">&nbsp;&nbsp;Total
							progress 5 out of 5</p></td>
					<td>
						<div class="progress-example; text-align:left;">

							<progress id="total" name="total" max="5" value="5"> 2
								of 5 </progress>
						</div>
					</td>
					<td><a id="res1" href="resultados.jsp"><img
							src="IMG/submit.png"> </a></td>
				</tr>
			</table>
</body>

<script src="JS/jquery-3.3.1.min.js"></script>
<script src="JS/tests_resp.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</html>