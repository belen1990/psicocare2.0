<%@ page language="java" contentType="text/html; charset=UTF"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Configuration</title>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href=".\config.css">
    <link rel="stylesheet" href="./CSS/csgeneral.css">
</head>

<body>

        <jsp:include page="./header.jsp"></jsp:include>

    <h1>Configuration</h1>
  <br>

    <section class="container">

        <div class="row">
            <div class="col s12 m5" id="alertas">
                <h2>Alerts</h1>
            </div>

            <div class="col s12 m7">
                <!-- Alertas-->
                <form>
                    <div>
                        Notifications
                        <!-- Switch -->
                        <div class="switch">
                            <label>
                                Off
                                <input type="checkbox">
                                <span class="lever"></span>
                                On
                            </label>
                        </div>
                    </div>
                <br>
                    <div>
                        Alert Frequency
                        <!-- HTML5 Range-->
                            <p class="range-field">
                                <input type="range" id="test5" min="0" max="30" />
                            </p>
                    </div>


                    <div>
                        Sound
                        <!--Select-->
                        <div class="input-field col s12">
                            <select>
                                <option value="" disabled selected>Choose your option</option>
                                <option value="1">Sound Off</option>
                                <option value="2">Music A</option>
                                <option value="3">Music B</option>
                            </select>
                        </div>
                    </div>


                    <div>
                        Vibration
                        <!-- Switch -->
                        <div class="switch">
                            <label>
                                Off
                                <input type="checkbox">
                                <span class="lever"></span>
                                On
                            </label>
                        </div>
                    </div>
                <br>

                    <div>
                        Volume
                        <!-- HTML5 Range-->
                            <p class="range-field">
                                <input type="range" id="test5" min="0" max="100" />
                            </p>
                        
                    </div>
                </form>
            </div>
        </div>

        <!--AQUI TERMINA ALERTAS-->

        <br>
        <div class="row">
            <!--AQUI EMPIEZA TEMAS-->
      
            <div class="col s12 m5" id="tema">
                <h2>Theme</h2>
            </div>
            <div class="col s12 m7">
                <form>
                    <p>
                        <label>
                            <input name="group1" type="radio" />
                            <span>Default Theme</span>
                        </label>
                    </p>
                    <p>
                        <label>
                            <input name="group1" type="radio" />
                            <span>Ocean blue Theme</span>
                        </label>
                    </p>
                    <p>
                        <label>
                            <input name="group1" type="radio" />
                            <span>Green moss Theme</span>
                        </label>
                    </p>
                    <p>
                        <label>
                            <input name="group1" type="radio" />
                            <span>Orange Dawn Theme</span>
                        </label>
                    </p>
                    <p>
                        <label>
                            <input name="group1" type="radio" />
                            <span>Dark night Theme</span>
                        </label>
                    </p>
                </form>
            </div>
        </div>
<br>
        <!--AQUI TERMINA TEMAS-->
        <div class="row">
        <!--AQUI EMPIEZA PIN-->
            <div class="col s12 m5">
                <h2>Access Pin</h2>
            </div>
            <div class="col s12 m7" id="pin">

                <!-- Switch -->
                <div class="switch">
                    <label>
                        Off
                        <input type="checkbox">
                        <span class="lever"></span>
                        On
                    </label>
                </div>


            </div>
        </div>

    </section>
</body>
<!-- Compiled and minified JavaScript -->
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<script src="./config.js"></script>
<script src="./JS/init.js"></script>

</html>