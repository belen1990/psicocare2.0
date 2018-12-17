<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="./CSS/resultadostyle.css">
    <title>Resultados</title>
</head>

<body>

    <header>

        <h1 style="font: size 8vw;">Results</h1>

    </header>

    <Section>

        <div id="anxiety">
         <h2>Anxiety</h2><!-- Los progress id son para que radargraph.js coja los valores a representar -->
            <progress id="progressbaranxiety" min="0" max="100"  value="${anxiety}"></progress>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Aliquam magni voluptatem vel sapiente neque expedita, magnam quod, labore earum odio consequuntur? Asperiores pariatur quam iure eum dignissimos eveniet dicta temporibus!Lorem ipsum dolor sit amet consectetur adipisicing elit. Aliquam magni voluptatem vel sapiente neque expedita, magnam quod, labore earum odio consequuntur? Asperiores pariatur quam iure eum dignissimos eveniet dicta temporibus!Lorem ipsum dolor sit amet consectetur adipisicing elit. Aliquam magni voluptatem vel sapiente neque expedita, magnam quod, labore earum odio consequuntur? Asperiores pariatur quam iure eum dignissimos eveniet dicta temporibus!</p>
           
        </div>

        <div id="depression">
            <h2>Depression</h2>
            <progress id="progressbardepression" min="0" max="100"  value="${depression}"></progress>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Aliquam magni voluptatem vel sapiente neque expedita, magnam quod, labore earum odio consequuntur? Asperiores pariatur quam iure eum dignissimos eveniet dicta temporibus!Lorem ipsum dolor sit amet consectetur adipisicing elit. Aliquam magni voluptatem vel sapiente neque expedita, magnam quod, labore earum odio consequuntur? Asperiores pariatur quam iure eum dignissimos eveniet dicta temporibus!Lorem ipsum dolor sit amet consectetur adipisicing elit. Aliquam magni voluptatem vel sapiente neque expedita, magnam quod, labore earum odio consequuntur? Asperiores pariatur quam iure eum dignissimos eveniet dicta temporibus!</p>
            
        </div>

        <div id="stress">
            <h2>Stress</h2>
            <progress id="progressbarstress" min="0" max="100"  value="${stress}"></progress>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Aliquam magni voluptatem vel sapiente neque expedita, magnam quod, labore earum odio consequuntur? Asperiores pariatur quam iure eum dignissimos eveniet dicta temporibus!</p>
            
        </div>

        <div id="socialanxiety"><!--colores de las graficas foto-->
            <h2>Social Anxiety</h2>
            <progress id="progressbarsocialanxiety" min="0" max="100"  value="${socialanxiety}"></progress>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Aliquam magni voluptatem vel sapiente neque expedita, magnam quod, labore earum odio consequuntur? Asperiores pariatur quam iure eum dignissimos eveniet dicta temporibus!</p>
           
        </div>

    </Section>
     <!--  grafico dinamico de https://codepen.io/Synvox/pen/iHbxE,https://codepen.io/anon/pen/vQvYdm-->
    
<table style="margin-left:300px;"><tr><td><div id="chart"></div></td></tr></table>


    <footer>
        <!--      <img class="responsive-img" src="IMG/diagramaresultados.png">-->


            <div id="registerdecorado">      
            <p style="font-size: 20px;">Register with us to save your results and use our activities.</p>
            <form  method="POST" action="Register">
                <input style="margin-left:300px;"  type="submit" value="Register" />
                <p> </p>
            </div>
            </form>
    </footer>

</body>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

<script src="./JS/radargraph.js"></script>
</html>