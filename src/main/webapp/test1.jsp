
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
        <h1><u>Starting Questionary</u></h1>
        

        <br>
        <ul style="list-style-type:  none;">
            

            <li style="font-size:28px; text-align:center">1. How do you feel about your future?<br></li>

        </ul>


        <table style="align-content: center; margin:auto;">
            <form id="loginform" method="POST">
                <tr>
                    <td><input class="inputsubmitbtn" id="q1" name="question" type="radio" value="1"></td>
                    <td><span> I am not particulary discouraged about my future.</span></td>
                </tr>

                <tr>
                    <td><input class="inputsubmitbtn" id="q1" name="question" type="radio" value="2"></td>
                    <td>I feel discouraged about the future.</td>
                </tr>
                <tr>
                    <td><input class="inputsubmitbtn" id="q1" name="question" type="radio" value="3"></td>
                    <td>I feel I have nothing to look forward to.</td>
                </tr>
                <tr>
                    <td><input class="inputsubmitbtn" id="q1" name="question" type="radio" value="4"></td>
                    <td>I feel the future is hopeless.</td>
                </tr>


        </table>
        </form>

    </section>


    <footer style="align-content: center; margin:auto;">
        <!--Progress Bar   examples of progress bars https://materializecss.com/preloader.html style="border:5px solid black; align-content: center;width: 400px;-->
        <div> </div>
        <div> </div>
        <div> </div>
        <label id="res2" for="total"> Total progress 1 out of 5 </label>
        <div id="test5" class="progress-example; text-align:left;">

            <progress id="total" name="total" max="5" value="1">
                1 of 5
            </progress>
        </div>
        <a href="test2.jsp" id="res1"><img class="ida" src="IMG/arrow.png"> </a>
    </footer>

</body>
<script src="JS/jquery-3.3.1.min.js"></script>
<script src="./JS/tests_resp.js"></script>

</html>