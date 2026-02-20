package com.nickdieda.htmlpro.data.samples

import com.nickdieda.htmlpro.data.model.WebProject

object SampleData {
    private val birdgn="""
        <!DOCTYPE html>
        <html lang="en">
        <head>
          <meta charset="UTF-8">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <title>Interactive Forest Dawn</title>
          <style>
            body {
              margin: 0;
            
              font-family: sans-serif;
              background: linear-gradient(to bottom, #001f3f, #ffa07a);
              display: flex;
              justify-content: center;
              align-items: center;
              flex-direction: column;
              color: white;
              text-align: center;
            }

            .scene {
              position: relative;
              width: 100vw;
              height: 80vh;
              overflow: hidden;
            }

            .sun {
              position: absolute;
              bottom: -100px;
              left: 50%;
              width: 150px;
              height: 150px;
              background: radial-gradient(circle, #ffdd00, transparent);
              border-radius: 50%;
              transform: translateX(-50%);
              animation: rise 20s infinite linear;
            }

            @keyframes rise {
              0% { bottom: -100px; }
              50% { bottom: 70%; }
              100% { bottom: -100px; }
            }

            .mist {
              position: absolute;
              bottom: 0;
              width: 200%;
              height: 40%;
              background: linear-gradient(to top, rgba(255, 255, 255, 0.2), transparent);
              animation: drift 30s infinite linear;
            }

            .mist:nth-child(2) {
              animation-delay: 5s;
            }

            @keyframes drift {
              0% { transform: translateX(-50%); }
              100% { transform: translateX(0); }
            }

            .firefly {
              position: absolute;
              width: 5px;
              height: 5px;
              background: radial-gradient(circle, yellow, transparent);
              border-radius: 50%;
              animation: flicker 2s infinite ease-in-out;
            }

            @keyframes flicker {
              0%, 100% { opacity: 0.5; transform: scale(1); }
              50% { opacity: 1; transform: scale(1.5); }
            }

            .bird {
              position: absolute;
              width: 40px;
              height: 40px;
              background: url('bird.png') no-repeat center/contain;
              animation: float 4s infinite ease-in-out;
            }

            @keyframes float {
              0%, 100% { transform: translateY(0); }
              50% { transform: translateY(-10px); }
            }

            .bird:hover {
              cursor: pointer;
              animation: chirp 0.5s;
            }

            @keyframes chirp {
              0%, 100% { transform: rotate(0); }
              50% { transform: rotate(10deg); }
            }

            .message {
              font-size: 1.5rem;
              margin-top: 10px;
            }

            #no{
                margin-left: auto;
                margin-right: auto;
                display: block;
            }


            h1, h2 {
                    text-align: center;
                    color: #2c3e50;
                }
               
                pre {
                    background: #f4f4f4;
                    border-left: 5px solid #2c3e50;
                    padding: 10px;
                    overflow-x: auto;
                    font-family: "Courier New", Courier, monospace;
                    font-size: 14px;
                }
                .section {
                    margin-bottom: 20px;
                }
                .code {
                    color: #e74c3c;
                }
                #nyt{
                    display: block;
                }
                #notes {
                    display: none;
                    max-width: 800px;
                    margin: 0 auto;
                    padding: 20px;
                    background: #ffffff;
                    border-radius: 10px;
                    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                }
                #qz{
                    color: black;
                }
          </style>
        </head>
        <body>
          <div id="nyt">
            <div class="scene">
                <div class="sun"></div>
                <div class="mist"></div>
                <div class="mist"></div>
              </div>
          </div>
         
          <div class="message">
            "As the night settles, let your dreams take your somewhere peaceful and where you enjoy, always keep in mind that am always thinking about you even now, and i wish you all the best kamami."
          </div>

          <button id="no" onclick="show()">Wait</button>
          <div id="notes">

            <h1>JavaScript Notes</h1>

            <div class="section">
                <h2>1. Conditional Statements</h2>
                
                <h3>if Statement</h3>
                <p>Used to execute a block of code if a specified condition is <strong>true</strong>.</p>
                <pre><code class="code">if (condition) {
        // code to execute if condition is true
        }</code></pre>

                <h3>if...else Statement</h3>
                <p>Executes one block of code if the condition is <strong>true</strong>, otherwise executes another block.</p>
                <pre><code class="code">if (condition) {
        // code to execute if condition is true
        } else {
        // code to execute if condition is false
        }</code></pre>

                <h3>switch Statement</h3>
                <p>Executes different blocks of code based on the value of an expression.</p>
                <pre><code class="code">switch (expression) {
        case value1:
            // code to execute if expression === value1
            break;
        case value2:
            // code to execute if expression === value2
            break;
        default:
            // code to execute if no cases match
        }</code></pre>
            </div>

            <div class="section">
                <h2>2. Loops</h2>

                <h3>for Loop</h3>
                <p>Repeats a block of code a specific number of times.</p>
                <pre><code class="code">for (initialization; condition; increment) {
        // code to execute
        }</code></pre>

                <h3>while Loop</h3>
                <p>Executes a block of code as long as a specified condition is <strong>true</strong>.</p>
                <pre><code class="code">while (condition) {
        // code to execute
        }</code></pre>

                <h3>do...while Loop</h3>
                <p>Executes a block of code at least once, and then repeats as long as the condition is <strong>true</strong>.</p>
                <pre><code class="code">do {
        // code to execute
        } while (condition);</code></pre>
            </div>
          <pre>
            <p id="qz">Go through this kesho tutazipitia araka tukifind time place utakuwa umeget ,but use the knowledge of c develop for me:- 1 a right angle triange using stars use for loop 2.display first 40 fibona... use while 3.Using loop of your choise in each demonstrate break and continue .All the answers to be displayed in one html file</p>
          </pre>
        </div>

          <script>
            let state=false;
            const nyt=document.getElementById('nyt');
            const notes=document.getElementById('notes');
        function show(){
        if(state){
        nyt.style.display='block';
        notes.style.display='none';

        }else{
            nyt.style.display='none';
            notes.style.display='block'; 
        }

        state=!state;

        }

            const scene = document.querySelector('.scene');

            function generateFireflies(count) {
              for (let i = 0; i < count; i++) {
                const firefly = document.createElement('div');
                firefly.className = 'firefly';
                firefly.style.left = `${Math.random() * 100}vw`;
                firefly.style.top = `${Math.random() * 100}vh`;
                firefly.style.animationDelay = `${Math.random() * 2}s`;
                scene.appendChild(firefly);
              }
            }

            function addBirds(count) {
              for (let i = 0; i < count; i++) {
                const bird = document.createElement('div');
                bird.className = 'bird';
                bird.style.left = `${Math.random() * 80}vw`;
                bird.style.top = `${Math.random() * 40 + 20}vh`;
                bird.addEventListener('click', () => {
                  const chirp = new Audio('chirp.mp3');
                  chirp.play();
                });
                scene.appendChild(bird);
              }
            }

            generateFireflies(50);
            addBirds(8);
          </script>
        </body>
        </html>

    """.trimIndent()


    private val universemsg="""
        <!DOCTYPE html>
        <html lang="en">
        <head>
          <meta charset="UTF-8">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <title>Dreamscape: Goodnight Symphony</title>
          <style>
            body {
              margin: 0;
              overflow: hidden;
              font-family: sans-serif;
              background:#000033; 
              perspective: 1000px;
            }

            .galaxy {
              position: relative;
              width: 100vw;
              height: 80vh;
              transform-style: preserve-3d;
              animation: rotate 60s infinite linear;
            }

            @keyframes rotate {
              from {
                transform: rotateY(0deg);
              }
              to {
                transform: rotateY(360deg);
              }
            }

            .star {
              position: absolute;
              width: 10px;
              height: 10px;
              background:white; 
              border-radius: 50%;
              animation: pulse 3s infinite ease-in-out;
            }

            @keyframes pulse {
              0%, 100% {
                transform: scale(1);
                opacity: 1;
              }
              50% {
                transform: scale(1.5);
                opacity: 0.6;
              }
            }

            .comet {
              position: absolute;
              width: 5px;
              height: 5px;
              background:white; 
              border-radius: 50%;
              animation: shoot 5s infinite ease-in-out;
            }

            @keyframes shoot {
              0% {
                opacity: 0;
                transform: translate3d(-100px, -100px, -200px) scale(0.5);
              }
              50% {
                opacity: 1;
                transform: translate3d(50vw, 50vh, 200px) scale(1);
              }
              100% {
                opacity: 0;
                transform: translate3d(100vw, 100vh, 400px) scale(0.1);
              }
            }

            .hoverable {
              position: absolute;
              color: white;
              font-size: 2rem;
              font-weight: bold;
              cursor: pointer;
              animation: float 4s infinite ease-in-out;
              transition: transform 0.5s;
            }

            @keyframes float {
              0%, 100% {
                transform: translateY(0);
              }
              50% {
                transform: translateY(-10px);
              }
            }

            .hoverable:hover {
              transform: scale(1.5) rotateZ(360deg);
              color: #ffcc00;
              text-shadow: 0 0 20px #ffcc00;
            }

            .goodnight {
              position: fixed;
              bottom: 10%;
              left: 50%;
              transform: translateX(-50%);
              font-size: 2rem;
              color: white;
              text-shadow: 0 0 10px white;
              animation: glow 3s infinite alternate;
            }

            @keyframes glow {
              from {
                opacity: 0.7;
                text-shadow: 0 0 20px #ffcc00;
              }
              to {
                opacity: 1;
                text-shadow: 0 0 50px #ffcc00;
              }
            }

            .marquee {
              position: fixed;
              bottom: 0;
              width: 100%;
              background: rgba(0, 0, 0, 0.8);
              color: white;
              padding: 10px 0;
              font-size: 1.2rem;
              text-align: center;
              overflow: hidden;
            }

            .marquee span {
              display: inline-block;
              white-space: nowrap;
              animation: scroll 15s linear infinite;
            }

            @keyframes scroll {
              from {
                transform: translateX(100%);
              }
              to {
                transform: translateX(-100%);
              }
            }
          </style>
        </head>
        <body>
          <div class="galaxy" id="galaxy"></div>
          <div class="goodnight">Goodnight! Sweet dreams under the infinite stars.</div>
          <div class="marquee">
            <span>Keep dreaming, keep exploring, and let the stars guide your journey. | Believe in your dreams, for they light up the night!</span>
          </div>

          <script>
            const galaxy = document.getElementById("galaxy");

            // Generate Stars
            function generateStars(count) {
              for (let i = 0; i < count; i++) {
                const star = document.createElement("div");
                star.className = "star";
                star.style.left = `${Math.random() * 100}vw`;
                star.style.top = `${Math.random() * 100}vh`;
                star.style.transform = `translateZ(${Math.random() * 500}px)`;
                galaxy.appendChild(star);
              }
            }

            // Generate Comets
            function generateComets(count) {
              for (let i = 0; i < count; i++) {
                const comet = document.createElement("div");
                comet.className = "comet";
                comet.style.left = `${Math.random() * 100}vw`;
                comet.style.top = `${Math.random() * 100}vh`;
                comet.style.animationDelay = `${Math.random() * 8}s`;
                galaxy.appendChild(comet);
              }
            }

            // Add Hoverable Messages
            function addHoverables() {
              const messages = [
                "Dream of infinite possibilities.",
                "The stars are always watching.",
                "Goodnight, explorer of galaxies.",
                "Rest well, tomorrow holds wonders."
              ];
              messages.forEach((msg, i) => {
                const hoverable = document.createElement("div");
                hoverable.className = "hoverable";
                hoverable.style.left = `${'$'}{(i + 1) * 20}vw`;
                hoverable.style.top = `${'$'}{Math.random() * 80}vh`;
                hoverable.textContent = msg;
                galaxy.appendChild(hoverable);
              });
            }

            // Initialize the Galaxy Scene
            generateStars(200);
            generateComets(20);
            addHoverables();
          </script>
        </body>
        </html>

    """.trimIndent()



    private val Voice="""
        <!DOCTYPE html>
        <html>
        <head>
        <style>
        body {
            font-family: 'Segoe UI', 
             Tahoma, Geneva, Verdana, 
              sans-serif;
            background-color: #f7f7f7;
            margin: 0;
            padding: 0;clock
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: #fff;
            border-radius: 20px;
            box-shadow: 0 8px 24px 
              rgba(0, 0, 0, 0.2);
            padding: 40px;
            max-width: 400px;
            width: 100%;
            text-align: center;
            transition: 
                transform 0.3s ease;
        }

        .container:hover {
            transform: translateY(-5px);
        }

        input[type="text"] {
            width: calc(100% - 40px);
            padding: 14px;
            margin-bottom: 20px;
            border: none;
            border-bottom: 2px 
               solid #007bff;
            border-radius: 5px;
            font-size: 16px;
            background-color: #f7f7f7;
            transition: 
               border-color 0.3s ease;
        }

        input[type="text"]:focus {
            border-color: #0056b3;
        }

        button {
            padding: 14px 40px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: 
               background-color 0.3s ease;
        }

        button:hover {
            background-color: #0056b3;
        }

        p {
            margin-top: 20px;
            font-size: 18px;
            color: #555;
        }
        </style>
        </head>
        <body>

        <div class="container">
            <input type="text" id="text"
              placeholder="text to speak"/>
          <button id="spk" onclick="say()">
                Speak</button>
            <p id="pa">Welcome</p>
        </div>

        <script type="text/javascript">
        function say() {
            var text = document.
        getElementById("text").value.trim(); 
            if (text === "") {
            alert("Please enter text to speak.");
                return;
            }

            var speech = new SpeechSynthesisUtterance();
            speech.text = text;
            window.speechSynthesis.speak(speech);
            document.getElementById("text").value = ""; 
            document.getElementById("text").focus(); 
            speech.onend = function(event) {
                document.getElementById("pa").innerHTML = 
                 "Spoken: " + text; ken
            };
        }
        </script>

        </body>
        </html>



    """.trimIndent()

    private val gameBerry="""
        <!DOCTYPE html>
        <html>
          <head>
            <title>My Guessing Game</title>
            <style>
              #message {
                font-family: 'Brush Script MT', cursive;
                background:brown; 
                color: gold;
                font-size: 2em;
                display: none;
                text-align: center;
                padding: 20px;
                border-radius: 10px;
              }
              body {
                font-family: 'Papyrus', fantasy;
              background:blue; 
                text-align: center;
                padding: 20px;
              }
              input {
                background-color: hsl(240, 100%, 90%);
                width: 50%;
                padding: 10px;
                font-size: 1em;
                border: 1px solid #ccc;
                border-radius: 5px;
              }
              h1 {
                color: purple;
              }
              p, label {
                color: pink;
                font-size: 1.5em;
              }
              button {
                background-color: hsl(0, 100%, 90%);
                border: none;
                border-radius: 10px;
                padding: 10px 20px;
                color: blue;
                font-size: 1.3em;
                cursor: pointer;
              }
              button:hover {
                background-color: hsl(0, 80%, 80%);
              }
            </style>
          </head>
          <body id="body">
            <div id="game">
              <h1>Guess a Number - Game</h1>
              <p>Guess a number between 1 and 10</p>
              <label for="guessfield">Enter your number:</label>
              <input type="number" id="guessfield" placeholder="1 to 10" min="1" max="10">
              <br><br>
              <button id="submitbutton">Submit</button>
            </div>
            <div id="message"></div>
            <script>
              const answer = Math.floor(Math.random() * 10 + 1);
             // console.log(answer); // For debugging purposes
              let guesses = 0;

              const body = document.getElementById("body");
              const game = document.getElementById("game");
              const message = document.getElementById("message");

              document.getElementById("submitbutton").addEventListener("click", function () {
                let guess = document.getElementById("guessfield").value;
                if (guess < 1 || guess > 10) {
                  alert("Please enter a number between 1 and 10.");
                  return;
                }
                guesses++;
                if (guess == answer) {
                  body.style.background = "linear-gradient(to right, blue,)";
                  message.style.display = "block";
                  game.style.display = "none";
                  message.innerHTML = `The answer is ${'$'}{guess}. You attempted ${'$'}{guesses} times. <br><button onclick="location.reload()">Play Again</button>`;
                }
                if(guess!=answer){
                  game.innerHTML="that's not correct,try again!"
                  game.style.background="linear-gradient(hsl(0,230%,80%),blue)";
                  game.style.color="red"
                  game.style.fontFamily=" 'Courier New', monospace";
                  game.style.fontSize="2em";
                  game.style.fontWeight="bold"
                  body.style.backgroundColor="tomato"
                }
                
              });
            </script>
          </body>
        </html>
    """.trimIndent()

    private  val form="""
        <!DOCTYPE html>
        <html>
          <head>
            <style>
              table,td{
                border:2px solid black;
                border-collapse:collapse;
              }
            </style>
            
          </head>
          <body>
            <table>
              <tr><td>Name:</td><td><input type="text" maxlength="8"></td></tr>
              <tr><td>Adress:</td><td><input type="number"></td></tr>
              <tr><td>Email:</td><td><input type="email"></td></tr>
              <tr><td>Zip code</td><td><input type="number" max="8888"min="100"></td></tr>
              <tr><td rowspan="2">Gender</td><td><input type="radio">Male</td>
              </tr>
              <tr><td><input type="radio">Female</td></tr>
              <tr><td rowspan="2">Subsption</td><td><input type="checkbox">Newsletter</td></tr>
              <tr><td><input type="checkbox">Magazine</td></tr>
              <tr><td>County</td><td><select size="2">Kakamega<br>Nairobi<br>Mombasa</select></td></tr>
              <tr><td colspan="2"><textarea placeholder="your comment" autocomplete="on"wrap="soft" autocorrect="on"autocapitalize="on"></textarea></td></tr>
              
            </table>
            
            
            
          </body>
        </html>
    """.trimIndent()

    private val askher="""
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <style>
            #no{
            position: absolute; 
            left: 80px;
            top: 50px;
            margin: 4px;}
        #yes{
          
            margin: 4px;

        }

            </style>
        </head>
        <body>

            <p>Do you want to be my girlfriend?
            </p>
            <button id="yes" onclick="yes()">Yes</button> 
            <button id="no">No</button>






           
        </body>
        <script>





            function yes(){
                document.getElementById("yes").style.backgroundColor='lightblue'
                alert('I would be glad to be');
            }

        var nobtn= document.getElementById("no");
        var width=innerWidth;
        var height=innerHeight;

        nobtn.addEventListener("mouseover",function(){
        this.style.backgroundColor='red'; 

        var leftposition=Math.floor(Math.random()*(width-0))+0;
        var topposition=Math.floor(Math.random()*(height-0))+0;

        this.style.left=leftposition+"px";
        this.style.top=topposition+"px";

        });



        </script>
        </html>
    """.trimIndent()
    private val nightgn="""
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Usiku mwema mpendwa</title>
            <style>
                /* General Styles */
                body {
                    margin: 0;
                    font-family: 'Arial', sans-serif;
                    background: radial-gradient(circle at center, #1e295c, #000);
                    color: #e5e5e5;
                    overflow: hidden;
                }

                .container {
                    text-align: center;
                    padding: 50px;
                }

                header {
                    background: linear-gradient(135deg, #ff7eb3, #ff758c);
                    padding: 30px;
                    border-bottom: 5px solid #bf3d5e;
                    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.5);
                }

                .title {
                    font-size: 3.5em;
                    color: #fff;
                    text-shadow: 2px 2px 8px rgba(0, 0, 0, 0.7);
                    margin: 0;
                }

                /* Visuals */
                .sky {
                    position: relative;
                    width: 100%;
                    height: 400px;
                    background: linear-gradient(to bottom, #00264d, #000);
                    overflow: hidden;
                }

                .stars {
                    position: absolute;
                    width: 2px;
                    height: 2px;
                    background: #fff;
                    border-radius: 50%;
                    animation: twinkle 3s infinite ease-in-out;
                }

                .stars:nth-child(odd) {
                    animation-delay: 0.5s;
                }

                .moon {
                    position: absolute;
                    top: 50px;
                    left: 50%;
                    transform: translateX(-50%);
                    width: 120px;
                    height: 120px;
                    background: radial-gradient(circle, #fff 70%, #e6e6e6);
                    border-radius: 50%;
                    box-shadow: 0 0 15px #fff;
                }

                .cloud {
                    position: absolute;
                    width: 150px;
                    height: 50px;
                    background: #e6e6e6;
                    border-radius: 50%;
                    opacity: 0.7;
                    animation: floatClouds 10s infinite linear;
                }

                .cloud:after {
                    content: '';
                    position: absolute;
                    width: 100px;
                    height: 40px;
                    background: #e6e6e6;
                    border-radius: 50%;
                    top: -20px;
                    left: 20px;
                }

                .messages {
                    margin-top: 30px;
                    font-size: 1.5em;
                    color: #f5c2e7;
                    animation: fadeIn 2s ease-in-out;
                }

                footer {
                    background: #202040;
                    color: #e5e5e5;
                    padding: 20px 0;
                    text-align: center;
                    border-top: 3px solid #bf3d5e;
                }

                footer a {
                    color: #ff758c;
                    text-decoration: none;
                }

                footer a:hover {
                    text-decoration: underline;
                }

                @keyframes twinkle {
                    0%, 100% {
                        opacity: 0.5;
                    }
                    50% {
                        opacity: 1;
                    }
                }

                @keyframes fadeIn {
                    from {
                        opacity: 0;
                    }
                    to {
                        opacity: 1;
                    }
                }

                @keyframes floatClouds {
                    from {
                        transform: translateX(-150px);
                    }
                    to {
                        transform: translateX(100%);
                    }
                }

                .marquee {
                    font-size: 1.5em;
                    color: #fff;
                    background: #ff758c;
                    padding: 10px;
                    margin-top: 20px;
                    overflow: hidden;
                    white-space: nowrap;
                    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.5);
                }

                .marquee span {
                    display: inline-block;
                    padding-left: 100%;
                    animation: scrollText 10s linear infinite;
                }

                @keyframes scrollText {
                    from {
                        transform: translateX(0);
                    }
                    to {
                        transform: translateX(-100%);
                    }
                }
            </style>
        </head>
        <body>
            <div class="container">
                <header>
                    <h1 class="title">Usiku Mwema mpendwa </h1>
                </header>
                <div class="sky">
                    <div class="moon"></div>
                    <div class="cloud" style="top: 100px; left: -50px;"></div>
                    <div class="cloud" style="top: 150px; left: 30%; animation-delay: 2s;"></div>
                    <div class="cloud" style="top: 50px; right: -70px; animation-delay: 4s;"></div>
                    <div class="stars" style="top: 20%; left: 25%;"></div>
                    <div class="stars" style="top: 40%; left: 55%;"></div>
                    <div class="stars" style="top: 70%; left: 10%;"></div>
                    <div class="stars" style="top: 80%; left: 80%;"></div>
                </div>
                
                <div class="marquee">
                    <span>Kutoka kwangu ,nakutakia usiku wa pono, usiku uliojaa na furaha na utulivu ,🌌 na baraka ,pokea busu ya shingo kutoka kwangu na mbili za mapacha zako.</span>
                </div>
            </div>
          
        </body>
        </html>

    """.trimIndent()


    private  val santa="""
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Dancing Santa with Romantic Messages</title>
            <style>
                body {
                    margin: 0;
                        padding-top: 150px;
                    background: linear-gradient(to bottom, #ff1e56, #ffac41, #008000);
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    height: 100vh;
                    overflow: hidden;
                    font-family: 'Georgia', serif;
                    color: white;
                }

                #santa {
             
                    position: relative;
                    width: 120px;
                    height: 240px;
                    animation: dance 1s infinite alternate ease-in-out;
                }

                /* Santa's Head */
                .head {
                    width: 60px;
                    height: 60px;
                    background: #fdd5b1;
                    border-radius: 50%;
                    position: absolute;
                    top: 0;
                    left: 30px;
                    border: 2px solid #000;
                }

                .hat {
                    width: 70px;
                    height: 40px;
                    background: red;
                    position: absolute;
                    top: -20px;
                    left: 25px;
                    border-radius: 50% 50% 0 0;
                }

                .hat-ball {
                    width: 20px;
                    height: 20px;
                    background: white;
                    position: absolute;
                    top: -30px;
                    left: 55px;
                    border-radius: 50%;
                }

                /* Santa's Body */
                .body {
                    width: 100px;
                    height: 140px;
                    background: red;
                    border-radius: 10px;
                    position: absolute;
                    top: 60px;
                    left: 10px;
                    border: 4px solid white;
                }

                .belt {
                    width: 100px;
                    height: 20px;
                    background: black;
                    position: absolute;
                    top: 90px;
                    left: 0;
                }

                .belt-buckle {
                    width: 30px;
                    height: 20px;
                    background: gold;
                    position: absolute;
                    top: 90px;
                    left: 35px;
                    border: 2px solid #000;
                }

                /* Santa's Legs */
                .legs {
                    position: absolute;
                    width: 20px;
                    height: 80px;
                    background: red;
                    top: 200px;
                    left: 25px;
                    animation: legsDance 0.5s infinite alternate;
                }

                .legs:nth-child(2) {
                    left: 75px;
                }

                .shoes {
                    width: 30px;
                    height: 20px;
                    background: black;
                    position: absolute;
                    bottom: -10px;
                    left: -5px;
                    border-radius: 5px;
                }

                /* Animations */
                @keyframes dance {
                    from {
                        transform: rotate(-10deg);
                    }
                    to {
                        transform: rotate(10deg);
                    }
                }

                @keyframes legsDance {
                    from {
                        transform: translateY(0);
                    }
                    to {
                        transform: translateY(-10px);
                    }
                }

                /* Messages */
                #messages {
                    position: absolute;
                    width: 100%;
                    height: 100%;
                    pointer-events: none;
                }

                .message {
                    position: absolute;
                    background: rgba(255, 255, 255, 0.9);
                    color: #ff1e56;
                    padding: 15px 20px;
                    border-radius: 10px;
                    font-size: 20px;
                    font-weight: bold;
                    font-family: 'Courier New', monospace;
                    box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.3);
                    animation: fadeOut 5s forwards;
                }

                @keyframes fadeOut {
                    0% {
                        opacity: 1;
                        transform: scale(1);
                    }
                    100% {
                        opacity: 0;
                        transform: scale(0.5);
                    }
                }
            </style>
        </head>
        <body>
            <div id="santa">
                <div class="head"></div>
                <div class="hat"></div>
                <div class="hat-ball"></div>
                <div class="body"></div>
                <div class="belt"></div>
                <div class="belt-buckle"></div>
                <div class="legs"></div>
                <div class="legs"></div>
                <div class="shoes"></div>
            </div>
            <div id="messages"></div>
            <script>
                // Array of romantic, passionate, and festive messages
                const messages = [
                    "Good night,love. Dream of all the moment we did put smile  💖 in each others face",
                    "This Christmas Eve, all I wish for is you in my arms. 🎄❤️ hugging you like on that table where i do find it hard to let you go",
                    "Sleep tight, my queen. Think of me giving you good pleasure like that after mosquito bite the one you told me about 🌙🔥",
                    "May your dreams tonight be as sweet as your kisses. 😘✨",
                    "Goodnight, my angel. You’re the reason for my smiles. 💘",
                    "Merry Christmas Eve. You light up my world like the Christmas star. 🌟🎅",
                    "I wish I could whisper goodnight in your ear. For now, feel my heart with you. 💓",
                    "Passionate dreams await you, dia. Sleep beautifully tonight with some nasty dreams💋🔥",
                    "Christmas is magical because of you. Sweet dreams, this one will be amazing as you will be in my mind while i celebrate. 🎄💖",
                    "You’re my dream come true. Tonight, I dream of us. Goodnight, my cinderella. 🌙💕"
                ];

                function showMessages() {
                    const messageContainer = document.getElementById("messages");
                    
                    // Randomly select a message
                    const messageText = messages[Math.floor(Math.random() * messages.length)];
                    
                    // Create a new message element
                    const message = document.createElement("div");
                    message.className = "message";
                    message.innerText = messageText;
                    
                    // Random positions
                    const x = Math.random() * (window.innerWidth - 250); // Ensure message doesn't overflow
                    const y = Math.random() * (window.innerHeight - 50);
                    
                    message.style.left = `${'$'}{x}px`;
                    message.style.top = `${'$'}{y}px`;
                    
                    messageContainer.appendChild(message);
                    
                    // Remove the message after animation
                    setTimeout(() => {
                        messageContainer.removeChild(message);
                    }, 5000);
                }

                // Display messages every 2 seconds
                setInterval(showMessages, 2000);
            </script>
        </body>
        </html>

    """.trimIndent()

    private val  goodnight="""
        <!DOCTYPE html>
        <html>
        <head>
        <style>
        body {
            font-family: sans-serif;
            background-color: #f7f7f7;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 500px;
        }

        .container {
            background-color: #fff;
            border-radius: 20px;
            box-shadow: 0 8px 24px 
              rgba(0, 0, 0, 0.2);
            padding: 40px;
            max-width: 400px;
            width: 100%;
            text-align: center;
            transition:  0.3s ease;
        }

        .container:hover {
            transform: translateY(-5px);
        }

        input[type="text"] {
            width: calc(100% - 40px);
            padding: 14px;
            margin-bottom: 20px;
            border: none;
            border-bottom: 2px  solid #007bff;
            border-radius: 5px;
            font-size: 16px;
            background-color: #f7f7f7;
            transition:   border-color 0.3s ease;
        }

        input[type="text"]:focus {
            border-color: #0056b3;
        }

        button {
            padding: 14px 40px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: 
               background-color 0.3s ease;
        }

        button:hover {
            background-color: #0056b3;
        }

        p {
            margin-top: 20px;
            font-size: 18px;
            color: #555;
        }
        </style>
        </head>
        <body>

        <div class="container">
            <input type="text" id="text"
              placeholder="text to speak"/>
          <button id="spk" onclick="say()">Speak</button>
          <button id="spk" onclick="urgdnt()">Goodnight</button>
            <p id="pa">Goodnight Berry</p>
        </div>

        <script type="text/javascript">

        function say() {
            var text = document.
        getElementById("text").value.trim(); 
            if (text === "") {
            alert("Please enter text to speak.");
                return;
            }

            var speech = new SpeechSynthesisUtterance();
            speech.text = text;
            window.speechSynthesis.speak(speech);
            document.getElementById("text").value = ""; 
            document.getElementById("text").focus(); 
            speech.onend = function(event) {
                document.getElementById("pa").innerHTML = 
                 "Spoken: " + text; ken
            };
        }

        function urgdnt() {
            var text = "To my favourite Berry.I know tonight was supposed to be our night (where I’d steal all the blankets), but I guess I’ll have to wait a little longer. 😉 Still, you’re totally in my head, stealing my focus instead of my pillow. Not fair, right? 😏 So here’s the deal: dream about me tonight—flirty dreams only. I’ll be doing the same about you. Good night, beautiful. Sweet dreams, and don’t blame me if you wake up missing me even more. ";

            var speech = new SpeechSynthesisUtterance();
            speech.text = text;
            window.speechSynthesis.speak(speech);
            document.getElementById("text").value = ""; 
            document.getElementById("text").focus(); 
            speech.onend = function(event) {
                document.getElementById("pa").innerHTML = 
                 "Spoken: " + text; ken
            };
        }



        </script>

        </body>
        </html>
    """.trimIndent()

    private val calculatorCode = """
        <!DOCTYPE html>
        <html lang="en">
        <head>
        <meta charset="UTF-8">
        <style>
          * { box-sizing: border-box; font-family: Arial, sans-serif; }
          body { margin: 0; min-height: 100vh; background: gray; color: white; display: flex; flex-direction: column; }
          header { text-align: center; padding: 30px; }
          main { flex: 1; display: flex; justify-content: center; align-items: center; }
          .card { background: #1e1e2f; padding: 20px; border-radius: 15px; width: 320px; box-shadow: 0 10px 25px rgba(0,0,0,0.4); }
          #display { width: 100%; height: 50px; font-size: 22px; text-align: right; padding: 10px; border-radius: 8px; border: none; margin-bottom: 15px; background: #eee; }
          .buttons { display: grid; grid-template-columns: repeat(4, 1fr); gap: 10px; }
          button { height: 50px; font-size: 18px; border: none; border-radius: 10px; background: #2d2d44; color: white; cursor: pointer; transition: 0.2s; }
          button:hover { background: #3f3f66; }
          .equal { grid-row: span 2; background: #ff9800; }
          .zero { grid-column: span 2; }
        </style>
        </head>
        <body>
  
        <main>
          <div class="card">
            <input type="text" id="display" disabled>
            <div class="buttons">
              <button onclick="clearDisplay()">C</button>
              <button onclick="append('/')">÷</button>
              <button onclick="append('*')">×</button>
              <button onclick="append('-')">−</button>
              <button onclick="append('7')">7</button><button onclick="append('8')">8</button><button onclick="append('9')">9</button><button onclick="append('+')">+</button>
              <button onclick="append('4')">4</button><button onclick="append('5')">5</button><button onclick="append('6')">6</button>
              <button onclick="calculate()" class="equal">=</button>
              <button onclick="append('1')">1</button><button onclick="append('2')">2</button><button onclick="append('3')">3</button>
              <button onclick="append('0')" class="zero">0</button><button onclick="append('.')">.</button>
            </div>
          </div>
        </main>
        <script>
          const display = document.getElementById("display");
          function append(v) { display.value += v; }
          function clearDisplay() { display.value = ""; }
          function calculate() { try { display.value = eval(display.value); } catch { display.value = "Error"; } }
        </script>
        </body>
        </html>
    """.trimIndent()

    private val clockCode = """
        <!DOCTYPE html>
        <html>
        <head>
            <style>
                body { background: #000;  padding-top: 150px;color: #0f0; display: flex; justify-content: center; align-items: center; height: 100vh; font-family: 'Courier New'; margin:0;}
                #clock { font-size: 60px; text-shadow: 0 0 20px #0f0; }
            </style>
        </head>
        <body>
            <div id="clock">00:00:00</div>
            <script>
                setInterval(() => {
                    document.getElementById('clock').innerText = new Date().toLocaleTimeString();
                }, 1000);
            </script>
        </body>
        </html>
    """.trimIndent()

    private val passwordGenCode = """
        <!DOCTYPE html>
        <html>
        <head>
            <style>
                body { font-family: sans-serif; background: #f4f4f9; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }
                .box { background: white; padding: 2rem; margin-top:10rem; border-radius: 12px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); text-align: center; }
                input { width: 100%; padding: 10px; margin: 10px 0; font-size: 1.2rem; border: 1px solid #ddd; border-radius: 5px; text-align: center; }
                button { background: #6200ee; color: white; border: none; padding: 10px 20px; border-radius: 5px; cursor: pointer; }
            </style>
        </head>
        <body>
            <div class="box">
                <h3>KeyGen</h3>
                <input type="text" id="pass" readonly placeholder="Click Generate">
                <button onclick="gen()">Generate Password</button>
            </div>
            <script>
                function gen() {
                    let chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
                    let pass = "";
                    for(let i=0; i<12; i++) pass += chars.charAt(Math.floor(Math.random() * chars.length));
                    document.getElementById('pass').value = pass;
                }
            </script>
        </body>
        </html>
    """.trimIndent()

    private val tipCalcCode = """
        <!DOCTYPE html>
        <html>
        <head>
            <style>
                body { background: #eee; font-family: Arial; padding: 20px; text-align: center; }
                .card { background: #fff; max-width: 300px; margin: auto; padding: 20px; border-radius: 10px; }
                input { width: 80%; padding: 8px; margin: 10px 0; }
                #res { font-weight: bold; color: green; font-size: 1.2em; }
            </style>
        </head>
        <body>
            <div class="card">
                <h3>Tip Calculator</h3>
                <input type="number" id="bill" placeholder="Bill Amount">
                <input type="number" id="perc" placeholder="Tip % (e.g. 15)">
                <button onclick="calc()">Calculate</button>
                <p id="res"></p>
            </div>
            <script>
                function calc() {
                    let b = parseFloat(document.getElementById('bill').value);
                    let p = parseFloat(document.getElementById('perc').value);
                    if(b && p) {
                        let total = b + (b * (p/100));
                        document.getElementById('res').innerText = "Total: $" + total.toFixed(2);
                    }
                }
            </script>
        </body>
        </html>
    """.trimIndent()



    private val todolist = """
        <!DOCTYPE html>
        <html>
        <head>
        <meta charset="UTF-8">
        <title>To-Do App</title>

        <style>
          body {
            font-family: Arial;
            background: #1e293b;
            color: white;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
          }

           margin-top:300px;.app {
           margin-top:300px;
            background: #020617;
            padding: 20px;
            border-radius: 12px;
            width: 300px;
          }

          input {
            width: 100%;
            padding: 10px;
            border-radius: 6px;
            border: none;
          }

          button {
            width: 100%;
            margin-top: 10px;
            padding: 10px;
            border: none;
            background: #38bdf8;
            cursor: pointer;
          }

          ul {
            list-style: none;
            padding: 0;
            margin-top: 15px;
          }

          li {
            background: #1e293b;
            padding: 8px;
            margin-bottom: 5px;
            display: flex;
            justify-content: space-between;
          }
        </style>
        </head>

        <body>

        <div class="app">
          <h2>📝 To-Do List</h2>
          <input id="task" placeholder="Enter task">
          <button onclick="add()">Add</button>
          <ul id="list"></ul>
        </div>

        <script>
          function add() {
            const task = document.getElementById("task").value;
            if (!task) return;

            const li = document.createElement("li");
            li.innerHTML = `$\{task} <span onclick="this.parentElement.remove()">❌</span>`;
            document.getElementById("list").appendChild(li);
            document.getElementById("task").value = "";
          }
        </script>

        </body>
        </html>

    """.trimIndent()


    private  val clockdigital="""
        <!DOCTYPE html>
        <html>
        <head>
        <meta charset="UTF-8">
        <title>Digital Clock</title>

        <style>
          body {
            margin: 0;
            height: 100vh;
            background: linear-gradient(135deg, #0f172a, #020617);
            color: white;
            display: flex;
            justify-content: center;
            align-items: center;
            font-family: Arial;
          }

          .clock {
            text-align: center;
          }

          h1 {
            font-size: 60px;
          }
        </style>
        </head>

        <body>

        <div class="clock">
          <h2 id="greet"></h2>
          <h1 id="time"></h1>
        </div>

        <script>
          function update() {
            const now = new Date();
            document.getElementById("time").innerText =
              now.toLocaleTimeString();

            const h = now.getHours();
            let g = "Good Evening 🌙";
            if (h < 12) g = "Good Morning ☀️";
            else if (h < 18) g = "Good Afternoon 🌤️";

            document.getElementById("greet").innerText = g;
          }

          setInterval(update, 1000);
          update();
        </script>

        </body>
        </html>

    """.trimIndent()


    private  val colors="""
        <!DOCTYPE html>
        <html>
        <head>
        <meta charset="UTF-8">
        <title>Color Generator</title>

        <style>
          body {
            margin: 0;
            height: 100vh;
            font-family: Arial;
            display: flex;
            justify-content: center;
            align-items: center;
            transition: 0.3s;
          }

          .box {
           margin-top:300px;
            background: rgba(0,0,0,0.6);
            color: white;
            padding: 20px;
            border-radius: 12px;
            text-align: center;
          }

          button {
            margin-top: 10px;
            padding: 10px;
            border: none;
            cursor: pointer;
          }
        </style>
        </head>

        <body>

        <div class="box">
          <h2>🎨 Color Generator</h2>
          <p id="code">#ffffff</p>
          <button onclick="gen()">Generate</button>
        </div>

        <script>
          function gen() {
            const c = "#" + Math.floor(Math.random()*16777215).toString(16);
            document.body.style.background = c;
            document.getElementById("code").innerText = c;
          }
        </script>

        </body>
        </html>

    """.trimIndent()


    private  val quizgen="""
        <!DOCTYPE html>
        <html>
        <head>
        <meta charset="UTF-8">
        <title>Quiz App</title>
        <style>
        body{
          background:#0f172a;
          color:white;
          display:flex;
          justify-content:center;
          align-items:center;
          height:100vh;
          font-family:Arial;
        }
        .box{
          margin-top:300px;
          background:#020617;
          padding:20px;
          width:300px;
          border-radius:10px;
        }
        button{
          width:100%;
          margin-top:10px;
          padding:10px;
        }
        </style>
        </head>
        <body>

        <div class="box">
          <h3 id="q"></h3>
          <div id="opts"></div>
        </div>

        <script>
        const quiz = [
         {q:"HTML stands for?", a:["Hyper Text Markup Language","High Text ML","Hyperlinks"], c:0},
         {q:"JS is used for?", a:["Styling","Logic","Database"], c:1}
        ];
        let i=0;

        function load(){
          q.innerText = quiz[i].q;
          opts.innerHTML="";
          quiz[i].a.forEach((o,j)=>{
            opts.innerHTML+=`<button onclick="check($\{j})">$\{o}</button>`;
          });
        }
        function check(j){
          alert(j==quiz[i].c ? "Correct 🎉" : "Wrong ❌");
          i = (i+1)%quiz.length;
          load();
        }
        load();
        </script>
        </body>
        </html>

    """.trimIndent()

    private  val checkpass="""
        <!DOCTYPE html>
        <html>
        <head>
        <meta charset="UTF-8">
        <title>Password Checker</title>
        <style>
        body{
          background:#111827;
          
          color:white;
          height:100vh;
          display:flex;
          justify-content:center;
          align-items:center;
          font-family:Arial;
        }
        .card{
          background:#020617;
          padding:20px;
           margin-top:200px;
          border-radius:10px;
          width:280px;
        }
        input{width:100%;padding:10px;}
        </style>
        </head>
        <body>

        <div class="card">
          <h3>Password Strength</h3>
          <input id="p" oninput="check()" placeholder="Enter password">
          <p id="r"></p>
        </div>

        <script>
        function check(){
          const v = p.value;
          let msg = "Weak ❌";
          if(v.length > 8 && /\d/.test(v) && /[A-Z]/.test(v))
            msg = "Strong 💪";
          r.innerText = msg;
        }
        </script>
        </body>
        </html>

    """.trimIndent()

    private val gal="""
        <!DOCTYPE html>
        <html>
        <head>
        <meta charset="UTF-8">
        <title>Gallery</title>
        <style>
        body{
          margin:0;
          background:#020617;
          display:flex;
          justify-content:center;
          align-items:center;
          height:100vh;
        }
        img{
         margin-top:300px;
          width:100px;
          margin:10px;
          cursor:pointer;
          border-radius:8px;
        }
        #big{width:300px;}
        </style>
        </head>
        <body>

        <div>
          <img id="big" src="https://picsum.photos/300">
          <div>
            <img src="https://picsum.photos/100?1" onclick="big.src=this.src">
            <img src="https://picsum.photos/100?2" onclick="big.src=this.src">
            <img src="https://picsum.photos/100?3" onclick="big.src=this.src">
          </div>
        </div>

        </body>
        </html>

    """.trimIndent()

    private  val counterApp="""
        <!DOCTYPE html>
        <html>
        <head>
        <meta charset="UTF-8">
        <title>Counter</title>
        <style>
        body{
          background:#0f172a;
          color:white;
          height:100vh;
          display:flex;
          justify-content:center;
          align-items:center;
          font-family:Arial;
        }
        .box{text-align:center;
         margin-top:300px;
        }
        button{margin:5px;padding:10px;}
        </style>
        </head>
        <body>

        <div class="box">
          <h1 id="n">0</h1>
          <button onclick="n.innerText++">+</button>
          <button onclick="n.innerText--">−</button>
        </div>

        </body>
        </html>

    """.trimIndent()

    private val notes="""
        <!DOCTYPE html>
        <html>
        <head>
        <meta charset="UTF-8">
        <title>Notes</title>
        <style>
        body{
          background:#111827;
          color:white;
          height:100vh;
          display:flex;
          justify-content:center;
          align-items:center;
          font-family:Arial;
        }
        .box{
        margin-top:300px;
          background:#020617;
          padding:20px;
          border-radius:10px;
          width:300px;
        }
        textarea{width:100%;height:80px;}
        </style>
        </head>
        <body>

        <div class="box">
          <h3>📝 Notes</h3>
          <textarea id="t"></textarea>
          <button onclick="save()">Save</button>
          <div id="out"></div>
        </div>

        <script>
        function save(){
          out.innerHTML += `<p>$\{t.value}</p>`;
          t.value="";
        }
        </script>

        </body>
        </html>

    """.trimIndent()

    private  val studentlist="""
        <!DOCTYPE html>
        <html>
        <head>
        <meta charset="UTF-8">
        <title>Map Example</title>

        <style>
        body{
          background:#0f172a;
          color:white;
          height:100vh;
          display:flex;
          justify-content:center;
          align-items:center;
          font-family:Arial;
        }
        .box{
          margin-top:300px;
          background:#020617;
          padding:20px;
          border-radius:10px;
          width:300px;
        }
        li{margin:5px 0;}
        </style>
        </head>

        <body>

        <div class="box">
          <h3>📚 Students (map)</h3>
          <ul id="list"></ul>
        </div>

        <script>
        const students = [
          {name:"Alice", score:80},
          {name:"Brian", score:45},
          {name:"Cathy", score:70}
        ];

        const results = students.map(s => 
          `$\{s.name} → $\{s.score} marks`
        );

        const ul = document.getElementById("list");
        results.forEach(r => {
          const li = document.createElement("li");
          li.innerText = r;
          ul.appendChild(li);
        });
        </script>

        </body>
        </html>

    """.trimIndent()

private val product="""
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>Filter Example</title>

    <style>
    body{
      background:#111827;
      color:white;
      height:100vh;
      display:flex;
      justify-content:center;
      align-items:center;
      font-family:Arial;
    }
    .box{
      background:#020617;
      padding:20px;
      border-radius:10px;
      width:300px;
    }
    button{
      width:100%;
      margin-bottom:10px;
      padding:10px;
    }
    li{margin:5px 0;}
    </style>
    </head>

    <body>

    <div class="box">
      <h3>🛒 Products (filter)</h3>
      <button onclick="show()">Show items ≤ 500</button>
      <ul id="items"></ul>
    </div>

    <script>
    const products = [
      {name:"Phone", price:1200},
      {name:"Headset", price:300},
      {name:"Mouse", price:400},
      {name:"Laptop", price:3000}
    ];

    function show(){
      const cheap = products.filter(p => p.price <= 500);
      items.innerHTML = "";

      cheap.forEach(p => {
        items.innerHTML += `<li>$ {p.name} - $ {p.price}</li>`;
      });
    }
    </script>

    </body>
    </html>

""".trimIndent()

    fun getAllProjects(): List<WebProject> = listOf(
        WebProject(14, "Santa", "Santa dancing", "🎅", santa),
        WebProject(2, "Calculator", "Full math interface", "🧮", calculatorCode),
        WebProject(8, "Ask Her", "Ask if your partner loves you", "💘", askher),
        WebProject(3, "Check Password", "Strong password checker", "🔒", checkpass),
        WebProject(13, "Night Goodnight", "Good night message", "🌃", nightgn),
        WebProject(15, "Quiz", "Quiz app with questions", "❓", quizgen),
        WebProject(4, "Berry's Game", "Guess number game", "🎲", gameBerry),
        WebProject(5, "KeyGen", "Random string generator", "🔑", passwordGenCode),
        WebProject(6, "Tip Calc", "Dining math utility", "💵", tipCalcCode),
        WebProject(18, "Notes", "Notes app", "📝", notes),
        WebProject(10, "Simple Form", "A simple form", "📄", form),
        WebProject(11, "Goodnight", "Good night message", "🌙", goodnight),
        WebProject(12, "Digital Clock", "Neon glow clock", "⏰", clockCode),
        WebProject(19, "Student List", "Student List using map()", "👨‍🎓", studentlist),
        WebProject(20, "Product Filter", "Product filter using filter()", "🛒", product),
        WebProject(1, "Universal love", "Universal love goodnight message", "💌", universemsg),
        WebProject(7, "Todo List", "To do list web", "✅", todolist),
//        WebProject(21, "Digital Clock", "Friendly digital clock", "🕒", clockdigital),
        WebProject(9, "Color Generator", "Theme and color generator", "🎨", colors),
        WebProject(16, "Counter App", "Counter App", "🔢", counterApp),
        WebProject(17, "Gallery slider", "Image Gallery (Click to View)", "🖼️", gal),
    )


}