package com.nickdieda.htmlpro.data.samples

import com.nickdieda.htmlpro.data.model.WebProject

object SampleData {
    private val birdgn="""
        <!DOCTYPE html>
        <html lang="en">
        <head>
          <meta charset="UTF-8" />
          <meta name="viewport" content="width=device-width, initial-scale=1" />
          <title>Space Atlas: Solar System (HTML First)</title>

          <style>
            body{
              margin:0;
              font-family: Arial, sans-serif;
              background:grey;
              
              color:#e9ecff;
            }
            header{
              padding:18px 16px;
              background: rgba(0,0,0,.35);
              border-bottom: 1px solid rgba(255,255,255,.08);
              position: sticky;
              top: 0;
              backdrop-filter: blur(8px);
            }
            header h1{ margin:0; font-size:20px; letter-spacing:.6px; }
            header p{ margin:6px 0 10px; font-size:13px; color:#b9c1ff; max-width:900px; }
            nav{
              display:flex;
              flex-wrap:wrap;
              gap:8px;
            }
            nav a{
              text-decoration:none;
              color:#e9ecff;
              border:1px solid rgba(255,255,255,.16);
              padding:6px 10px;
              border-radius:999px;
              font-size:13px;
              background: rgba(255,255,255,.06);
            }
            nav a:hover{ background: rgba(255,255,255,.12); }

            main{
              max-width:1200px;
              margin:auto;
              padding:16px;
              display:grid;
              grid-template-columns: 1.2fr .9fr;
              gap:16px;
            }
            @media (max-width:950px){ main{ grid-template-columns:1fr; } }

            .card{
              background: rgba(255,255,255,.06);
              border: 1px solid rgba(255,255,255,.10);
              border-radius:18px;
              padding:14px;
              box-shadow: 0 12px 35px rgba(0,0,0,.35);
            }
            h2, h3{ margin:0; }
            .muted{ color:#b9c1ff; font-size:13px; }

            figure{
              margin:12px 0 0;
              border: 1px solid rgba(255,255,255,.10);
              border-radius:16px;
              overflow:hidden;
              background: rgba(255,255,255,.05);
            }
            figcaption{
              padding:10px 12px;
              font-size:12px;
              color:#cfd5ff;
              border-top: 1px solid rgba(255,255,255,.10);
            }

            .legend{
              display:flex;
              flex-wrap:wrap;
              gap:8px;
              padding:12px;
            }
            .tag{
              display:inline-block;
              padding:4px 10px;
              border-radius:999px;
              font-size:12px;
              border:1px solid rgba(255,255,255,.14);
              background: rgba(0,0,0,.25);
              color:#e9ecff;
            }

            .sky{
              position:relative;
              padding:14px;
              min-height:190px;
              background:
                radial-gradient(circle at 15% 30%, rgba(255,255,255,.15) 0 2px, transparent 3px),
                radial-gradient(circle at 35% 70%, rgba(255,255,255,.10) 0 1px, transparent 2px),
                radial-gradient(circle at 70% 25%, rgba(255,255,255,.12) 0 1px, transparent 2px),
                radial-gradient(circle at 85% 55%, rgba(255,255,255,.12) 0 2px, transparent 3px),
                radial-gradient(circle at 55% 45%, rgba(255,255,255,.08) 0 1px, transparent 2px),
                linear-gradient(180deg, rgba(255,255,255,.03), rgba(0,0,0,.20));
            }
            .orbits{
              display:flex;
              gap:10px;
              align-items:center;
              flex-wrap:wrap;
              margin-top:10px;
            }
            .planet{
              width:32px;
              height:32px;
              border-radius:999px;
              border:1px solid rgba(255,255,255,.18);
              box-shadow: 0 10px 20px rgba(0,0,0,.35);
              display:inline-block;
            }
            .sun{
              width:44px;height:44px;border-radius:999px;
              border:1px solid rgba(255,255,255,.18);
              box-shadow: 0 0 24px rgba(255,220,120,.35);
              background: radial-gradient(circle at 30% 30%, #fff3c4, #ffb000 60%, #b85b00 100%);
            }
            .p-mercury{ background: radial-gradient(circle at 30% 30%, #d7d7d7, #6b6b6b 70%, #2e2e2e 100%); }
            .p-venus{ background: radial-gradient(circle at 30% 30%, #ffe1b0, #d39b35 70%, #6b3f00 100%); }
            .p-earth{ background: radial-gradient(circle at 30% 30%, #b9f3ff, #1d6cff 60%, #07235c 100%); }
            .p-mars{ background: radial-gradient(circle at 30% 30%, #ffd0c0, #d4522a 70%, #5b1b0a 100%); }
            .p-jupiter{ background: radial-gradient(circle at 30% 30%, #fff0d6, #c8a26b 60%, #5e3b18 100%); }
            .p-saturn{ background: radial-gradient(circle at 30% 30%, #fff7da, #d1b77a 60%, #6e5530 100%); position:relative; }
            .p-uranus{ background: radial-gradient(circle at 30% 30%, #e3fbff, #55d2ff 65%, #0b4a63 100%); }
            .p-neptune{ background: radial-gradient(circle at 30% 30%, #c9d9ff, #3a63ff 60%, #0a155a 100%); }

            .ring{
              position:absolute;
              left:50%;
              top:50%;
              width:56px;
              height:18px;
              border-radius:999px;
              transform: translate(-50%,-50%) rotate(-14deg);
              border:1px solid rgba(255,255,255,.22);
              background: rgba(255,255,255,.08);
            }

            details{
              margin-top:12px;
              border:1px solid rgba(255,255,255,.12);
              border-radius:16px;
              background: rgba(0,0,0,.20);
              padding:10px 12px;
            }
            summary{
              cursor:pointer;
              font-weight:bold;
              color:#e9ecff;
            }

            table{
              width:100%;
              border-collapse:collapse;
              margin-top:12px;
              border:1px solid rgba(255,255,255,.12);
              border-radius:16px;
              overflow:hidden;
              background: rgba(0,0,0,.18);
            }
            th, td{
              padding:10px;
              font-size:13px;
              border-bottom:1px solid rgba(255,255,255,.10);
              text-align:left;
            }
            th{
              background: rgba(255,255,255,.06);
              color:#f0f2ff;
            }
            tr:last-child td{ border-bottom:none; }

            .two{
              display:grid;
              grid-template-columns: 1fr 1fr;
              gap:10px;
              margin-top:10px;
            }
            @media (max-width:650px){ .two{ grid-template-columns:1fr; } }

            form{
              display:grid;
              gap:10px;
              margin-top:12px;
            }
            label{ font-size:13px; font-weight:bold; color:#f0f2ff; }
            input, select, textarea{
              width:100%;
              padding:10px;
              border-radius:14px;
              border:1px solid rgba(255,255,255,.18);
              background: rgba(255,255,255,.06);
              color:#e9ecff;
              outline:none;
              font-size:14px;
            }
            textarea{ resize: vertical; }
            input:focus, select:focus, textarea:focus{
              border-color: rgba(140,170,255,.8);
              box-shadow: 0 0 0 3px rgba(140,170,255,.18);
            }
            button{
              border:none;
              border-radius:14px;
              padding:10px 12px;
              background: linear-gradient(90deg, #4b7bff, #7a5cff);
              color:#fff;
              font-weight:bold;
              cursor:pointer;
            }
            button:hover{ filter: brightness(1.05); }
            button:active{ transform: scale(.99); }

            .pill{
              display:inline-block;
              padding:4px 10px;
              border-radius:999px;
              font-size:12px;
              border:1px solid rgba(255,255,255,.14);
              background: rgba(255,255,255,.06);
              color:#e9ecff;
              margin-right:6px;
              margin-top:6px;
            }
            .log{
              list-style:none;
              padding:0;
              margin:12px 0 0;
              border:1px solid rgba(255,255,255,.12);
              border-radius:16px;
              background: rgba(0,0,0,.18);
              max-height:260px;
              overflow:auto;
            }
            .log li{
              padding:10px 12px;
              border-bottom:1px solid rgba(255,255,255,.10);
              font-size:13px;
            }
            .log li:last-child{ border-bottom:none; }

            footer{
              text-align:center;
              padding:18px;
              font-size:12px;
              color:#b9c1ff;
              border-top: 1px solid rgba(255,255,255,.08);
              background: rgba(0,0,0,.25);
            }
          </style>
        </head>

        <body>
        <header>
          <h1>Space Atlas: Solar System (HTML First)</h1>
          <p>
            This project focuses on HTML structure: semantic tags, figure/figcaption, details/summary,
            table, form, lists, time. JavaScript is tiny and only updates a log.
          </p>

          <nav>
            <a href="#atlas">Atlas</a>
            <a href="#compare">Compare</a>
            <a href="#missions">Missions</a>
            <a href="#quiz">Mini Quiz</a>
          </nav>
        </header>

        <main>
          <section class="card" id="atlas">
            <h2>Solar System Atlas</h2>
            <p class="muted" style="margin:6px 0 0;">
              Tap the planet names in the table to jump to their details. Most of the “wow” is HTML + CSS layout.
            </p>

            <figure>
              <div class="sky">
                <div class="legend">
                  <span class="tag">figure</span>
                  <span class="tag">details</span>
                  <span class="tag">table</span>
                  <span class="tag">form</span>
                  <span class="tag">time</span>
                  <span class="tag">nav</span>
                </div>

                <div class="orbits" aria-label="Planets row">
                  <span class="sun" title="Sun"></span>
                  <span class="planet p-mercury" title="Mercury"></span>
                  <span class="planet p-venus" title="Venus"></span>
                  <span class="planet p-earth" title="Earth"></span>
                  <span class="planet p-mars" title="Mars"></span>
                  <span class="planet p-jupiter" title="Jupiter"></span>
                  <span class="planet p-saturn" title="Saturn"><span class="ring" aria-hidden="true"></span></span>
                  <span class="planet p-uranus" title="Uranus"></span>
                  <span class="planet p-neptune" title="Neptune"></span>
                </div>

                <p class="muted" style="margin:12px 0 0;">
                  Tip: This row is not “real scale”. It is a clean HTML demo using spans + CSS.
                </p>
              </div>

              <figcaption>
                The “planet strip” uses only HTML elements (spans) and CSS gradients.
                In real sites, this helps create lightweight visuals without images.
              </figcaption>
            </figure>

            <details open>
              <summary>Why people prefer semantic HTML for content like this</summary>
              <p class="muted" style="margin:10px 0 0;">
                Semantic HTML makes your page easier for screen readers, search engines, and other developers.
                Using <b>section</b>, <b>article</b>, <b>figure</b>, <b>nav</b>, and <b>table</b> gives meaning to content.
                It also makes your code organized and easy to expand later.
              </p>
            </details>

            <h3 style="margin-top:14px;">Planet Quick Index (Table)</h3>
            <p class="muted" style="margin:6px 0 0;">
              Tables are great for structured comparison. Click a planet to jump to its card.
            </p>

            <table aria-label="Planet quick index">
              <thead>
                <tr>
                  <th>Planet</th>
                  <th>Type</th>
                  <th>Known for</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td><a href="#earth" style="color:#e9ecff;">Earth</a></td>
                  <td>Rocky</td>
                  <td>Liquid water, life</td>
                </tr>
                <tr>
                  <td><a href="#mars" style="color:#e9ecff;">Mars</a></td>
                  <td>Rocky</td>
                  <td>Red surface, rovers</td>
                </tr>
                <tr>
                  <td><a href="#jupiter" style="color:#e9ecff;">Jupiter</a></td>
                  <td>Gas giant</td>
                  <td>Great Red Spot</td>
                </tr>
                <tr>
                  <td><a href="#saturn" style="color:#e9ecff;">Saturn</a></td>
                  <td>Gas giant</td>
                  <td>Rings</td>
                </tr>
                <tr>
                  <td><a href="#neptune" style="color:#e9ecff;">Neptune</a></td>
                  <td>Ice giant</td>
                  <td>Strong winds</td>
                </tr>
              </tbody>
            </table>

            <div class="two">
              <article class="card" id="earth" style="background: rgba(255,255,255,.05);">
                <h3>Earth</h3>
                <p class="muted" style="margin:6px 0 0;">
                  Earth is our home planet. It has breathable atmosphere and stable liquid water.
                </p>
                <div>
                  <span class="pill">HTML idea: use article for a self-contained topic</span>
                  <span class="pill">Use time for dates</span>
                </div>
                <details>
                  <summary>Mini fact list</summary>
                  <ul style="margin:10px 0 0;">
                    <li>Has oceans and continents</li>
                    <li>Atmosphere protects life</li>
                    <li>One moon</li>
                  </ul>
                </details>
              </article>

              <article class="card" id="mars" style="background: rgba(255,255,255,.05);">
                <h3>Mars</h3>
                <p class="muted" style="margin:6px 0 0;">
                  Mars is called the red planet because of iron-rich dust. It is a top target for exploration.
                </p>
                <details>
                  <summary>Mini fact list</summary>
                  <ul style="margin:10px 0 0;">
                    <li>Cold deserts and large volcanoes</li>
                    <li>Evidence of ancient water</li>
                    <li>Two small moons</li>
                  </ul>
                </details>
              </article>

              <article class="card" id="jupiter" style="background: rgba(255,255,255,.05);">
                <h3>Jupiter</h3>
                <p class="muted" style="margin:6px 0 0;">
                  Jupiter is the largest planet. It has many moons and a huge storm called the Great Red Spot.
                </p>
                <details>
                  <summary>Mini fact list</summary>
                  <ul style="margin:10px 0 0;">
                    <li>Gas giant</li>
                    <li>Strong magnetic field</li>
                    <li>Many moons</li>
                  </ul>
                </details>
              </article>

              <article class="card" id="saturn" style="background: rgba(255,255,255,.05);">
                <h3>Saturn</h3>
                <p class="muted" style="margin:6px 0 0;">
                  Saturn is famous for bright rings made of ice and rock. It is also a gas giant.
                </p>
                <details>
                  <summary>Mini fact list</summary>
                  <ul style="margin:10px 0 0;">
                    <li>Huge ring system</li>
                    <li>Many moons (including Titan)</li>
                    <li>Low density compared to Earth</li>
                  </ul>
                </details>
              </article>

              <article class="card" id="neptune" style="background: rgba(255,255,255,.05); grid-column:1 / -1;">
                <h3>Neptune</h3>
                <p class="muted" style="margin:6px 0 0;">
                  Neptune is an ice giant with strong winds. Its deep blue color is one of its most famous features.
                </p>
                <details>
                  <summary>Mini fact list</summary>
                  <ul style="margin:10px 0 0;">
                    <li>Very cold, far from the Sun</li>
                    <li>Powerful storms</li>
                    <li>Thin rings</li>
                  </ul>
                </details>
              </article>
            </div>
          </section>

          <aside class="card" id="compare">
            <h2>Compare Planets (HTML Form)</h2>
            <p class="muted" style="margin:6px 0 0;">
              This is mostly HTML: label, select, fieldset, legend, output area. JS only writes a sentence.
            </p>

            <form id="compareForm">
              <fieldset style="border:1px solid rgba(255,255,255,.12); border-radius:16px; padding:12px;">
                <legend style="padding:0 8px; color:#f0f2ff; font-weight:bold;">Choose two planets</legend>

                <div style="display:grid; gap:10px; margin-top:8px;">
                  <div>
                    <label for="p1">Planet 1</label>
                    <select id="p1" name="p1">
                      <option>Mercury</option>
                      <option>Venus</option>
                      <option selected>Earth</option>
                      <option>Mars</option>
                      <option>Jupiter</option>
                      <option>Saturn</option>
                      <option>Uranus</option>
                      <option>Neptune</option>
                    </select>
                  </div>

                  <div>
                    <label for="p2">Planet 2</label>
                    <select id="p2" name="p2">
                      <option>Mercury</option>
                      <option>Venus</option>
                      <option>Earth</option>
                      <option selected>Mars</option>
                      <option>Jupiter</option>
                      <option>Saturn</option>
                      <option>Uranus</option>
                      <option>Neptune</option>
                    </select>
                  </div>

                  <div>
                    <label for="focus">Focus</label>
                    <select id="focus" name="focus">
                      <option selected>Temperature</option>
                      <option>Atmosphere</option>
                      <option>Moons</option>
                      <option>Rings</option>
                      <option>Exploration</option>
                    </select>
                  </div>

                  <button type="submit">Generate Comparison Note</button>
                  <button type="reset" style="background: linear-gradient(90deg, #56607a, #3f465a);">Clear</button>
                </div>
              </fieldset>

              <p class="muted" style="margin:10px 0 0;">
                Output:
              </p>
              <output id="compareOut" style="display:block; margin-top:8px; padding:10px 12px; border-radius:16px; border:1px solid rgba(255,255,255,.12); background: rgba(0,0,0,.18);">
                Pick planets and press the button.
              </output>
            </form>

            <section class="card" id="missions" style="margin-top:14px; background: rgba(255,255,255,.05);">
              <h2>Missions Log (HTML List + time)</h2>
              <p class="muted" style="margin:6px 0 0;">
                This list uses <b>time</b> to mark dates. Add your own entry using the mini form below.
              </p>

              <ul class="log" id="missionList" aria-live="polite">
                <li><time datetime="2026-02-24">Feb 24, 2026</time> — Star chart updated for learners</li>
                <li><time datetime="2026-02-10">Feb 10, 2026</time> — Added planet comparison table</li>
                <li><time datetime="2026-01-28">Jan 28, 2026</time> — New semantic layout using section/article</li>
              </ul>

              <form id="missionForm" style="margin-top:12px;">
                <label for="missionText">Add a new mission note</label>
                <input id="missionText" placeholder="e.g. Observed Jupiter at night" required />
                <button type="submit">Add Note</button>
              </form>
            </section>

            <section class="card" id="quiz" style="margin-top:14px; background: rgba(255,255,255,.05);">
              <h2>Mini Quiz (details)</h2>
              <p class="muted" style="margin:6px 0 0;">
                No JS needed. Use <b>details</b> for a clean quiz reveal.
              </p>

              <details>
                <summary>Question 1: Which planet is famous for rings?</summary>
                <p class="muted" style="margin:10px 0 0;">Saturn is the most famous for bright rings.</p>
              </details>

              <details>
                <summary>Question 2: Which planet is called the red planet?</summary>
                <p class="muted" style="margin:10px 0 0;">Mars is known as the red planet.</p>
              </details>

              <details>
                <summary>Question 3: What tag helps create expandable sections?</summary>
                <p class="muted" style="margin:10px 0 0;">Use &lt;details&gt; and &lt;summary&gt;.</p>
              </details>
            </section>
          </aside>
        </main>

        <footer>
          Space Atlas is mostly HTML structure. Small JS is used only for writing notes and comparisons.
        </footer>

        <script>
          const compareForm = document.getElementById("compareForm");
          const compareOut = document.getElementById("compareOut");

          compareForm.addEventListener("submit", function(e){
            e.preventDefault();
            const p1 = document.getElementById("p1").value;
            const p2 = document.getElementById("p2").value;
            const focus = document.getElementById("focus").value;

            compareOut.textContent =
              "Comparison Note: " + p1 + " vs " + p2 +
              ". Focus: " + focus +
              ". Tip: Use a table for structured facts, and articles for planet sections.";
          });

          const missionForm = document.getElementById("missionForm");
          const missionList = document.getElementById("missionList");
          const missionText = document.getElementById("missionText");

          missionForm.addEventListener("submit", function(e){
            e.preventDefault();
            const text = missionText.value.trim();
            if(!text) return;

            const now = new Date();
            const yyyy = now.getFullYear();
            const mm = String(now.getMonth()+1).padStart(2, "0");
            const dd = String(now.getDate()).padStart(2, "0");
            const human = now.toLocaleDateString(undefined, { year:"numeric", month:"short", day:"2-digit" });

            const li = document.createElement("li");
            li.innerHTML = '<time datetime="'+yyyy+'-'+mm+'-'+dd+'">'+human+'</time> — ' + text;

            missionList.prepend(li);
            missionForm.reset();
          });
        </script>
        </body>
        </html>
    """.trimIndent()


    private val smartTask="""
        <!DOCTYPE html>
        <html>
        <head>
        <meta charset="UTF-8">
        <title>Smart Task Planner</title>

        <style>
        body{
          font-family:Arial;
          background:#f3f4f6;
          padding:20px;
        }

        .container{
          max-width:420px;
          margin:auto;
          background:white;
          padding:16px;
          border-radius:14px;
          box-shadow:0 6px 20px rgba(0,0,0,.15);
        }

        h2{
          text-align:center;
        }

        input{
          width:100%;
          padding:10px;
          border-radius:8px;
          border:1px solid #ccc;
          margin-bottom:10px;
        }

        button{
          width:100%;
          padding:10px;
          border:none;
          background:#2563eb;
          color:white;
          border-radius:8px;
        }

        .task{
          display:flex;
          justify-content:space-between;
          align-items:center;
          padding:8px;
          background:#eef2ff;
          margin-top:8px;
          border-radius:6px;
        }

        .done{
          text-decoration:line-through;
          color:gray;
        }

        .small{
          font-size:12px;
          color:#555;
          margin-top:8px;
          text-align:center;
        }
        </style>
        </head>

        <body>

        <div class="container">

        <h2 style="color:#2563eb">Daily Planner</h2>

        <input id="taskInput" placeholder="Enter task">

        <button onclick="addTask()">Add Task</button>

        <div id="tasks"></div>

        <p class="small">Completed: <span id="count">0</span></p>

        </div>

        <script>

        let completed = 0;

        function addTask(){

          let input = document.getElementById("taskInput");
          let text = input.value;

          if(text==""){
            alert("Enter a task");
            return;
          }

          let div = document.createElement("div");
          div.className="task";

          let span = document.createElement("span");
          span.innerText = text;

          let btn = document.createElement("button");
          btn.innerText="Done";
          btn.style.background="#16a34a";
          btn.style.width="70px";

          btn.onclick=function(){
            span.classList.add("done");
            btn.disabled=true;
            completed++;
            document.getElementById("count").innerText=completed;
          }

          div.appendChild(span);
          div.appendChild(btn);

          document.getElementById("tasks").appendChild(div);

          input.value="";
        }

        </script>

        </body>
        </html>
    """.trimIndent()

    private val Voice="""
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>Peak Horizon | Alpine Tourism</title>
            <style>
                /* INTERNAL CSS */
                :root { --accent: #3498db; --text: #2c3e50; }
                
                body {
                    margin: 0;
                    font-family: 'Helvetica Neue', Arial, sans-serif;
                    color: var(--text);
                    background: #f9f9f9;
                    overflow-x: hidden;
                }

                header {
                    height: 60vh;
                    background: url('https://images.unsplash.com/photo-1464822759023-fed622ff2c3b?auto=format&fit=crop&w=1500&q=80') center/cover;
                    display: flex;
                    align-items: center;
                    justify-content: center;
                    color: white;
                    text-shadow: 0 4px 10px rgba(0,0,0,0.5);
                }

                /* Horizontal Scroll Section */
                .scroller {
                    display: flex;
                    overflow-x: auto;
                    padding: 40px;
                    gap: 20px;
                    scroll-behavior: smooth;
                }

                /* Semantic Article Card */
                article {
                    flex: 0 0 300px;
                    background: white;
                    border-radius: 15px;
                    overflow: hidden;
                    box-shadow: 0 10px 20px rgba(0,0,0,0.05);
                    transition: transform 0.3s;
                }

                article:hover { transform: translateY(-10px); }

                figure { margin: 0; position: relative; }
                
                img { width: 100%; height: 200px; object-fit: cover; }

                figcaption {
                    position: absolute;
                    bottom: 10px; left: 10px;
                    background: rgba(0,0,0,0.7);
                    color: white;
                    padding: 5px 10px;
                    font-size: 0.8rem;
                    border-radius: 5px;
                }

                .content { padding: 20px; }

                .btn-book {
                    display: block;
                    text-align: center;
                    background: var(--accent);
                    color: white;
                    padding: 10px;
                    text-decoration: none;
                    border-radius: 5px;
                    margin-top: 15px;
                }
            </style>
        </head>
        <body>

            <header>
                <h1 style="font-size: 4rem; margin: 0;">EXPLORE THE ALPS</h1>
            </header>

            <main>
                <section style="padding: 40px 40px 0;">
                    <h2>Top Destinations</h2>
                    <p>Curated experiences for the modern traveler.</p>
                </section>

                <section class="scroller">
                    
                    <article>
                        <figure>
                            <img src="https://images.unsplash.com/photo-1506744038136-46273834b3fb?auto=format&fit=crop&w=500&q=60" alt="Valley Lake">
                            <figcaption>Switzerland</figcaption>
                        </figure>
                        <div class="content">
                            <h3>Crystal Valley</h3>
                            <p>Experience the serenity of glacial lakes and fresh air.</p>
                            <a href="#" class="btn-book" style="background-color: #27ae60;">Check Availability</a>
                        </div>
                    </article>

                    <article>
                        <figure>
                            <img src="https://images.unsplash.com/photo-1531315630201-bb15bbeb166a?auto=format&fit=crop&w=500&q=60" alt="Mountain Peak">
                            <figcaption>France</figcaption>
                        </figure>
                        <div class="content">
                            <h3>The Summit Lodge</h3>
                            <p>Luxury stay at 3,000 meters above sea level.</p>
                            <a href="#" class="btn-book" style="background-color: #e67e22;">Book Now</a>
                        </div>
                    </article>

                    <article>
                        <figure>
                            <img src="https://images.unsplash.com/photo-1501785888041-af3ef285b470?auto=format&fit=crop&w=500&q=60" alt="Village">
                            <figcaption>Austria</figcaption>
                        </figure>
                        <div class="content">
                            <h3>Old Town Echo</h3>
                            <p>Walk through history in the heart of the mountains.</p>
                            <a href="#" class="btn-book">Explore More</a>
                        </div>
                    </article>
                       <article>
                        <figure>
                            <img src="https://images.unsplash.com/photo-1506744038136-46273834b3fb?auto=format&fit=crop&w=500&q=60" alt="Valley Lake">
                            <figcaption>Switzerland</figcaption>
                        </figure>
                        <div class="content">
                            <h3>Crystal Valley</h3>
                            <p>Experience the serenity of glacial lakes and fresh air.</p>
                            <a href="#" class="btn-book" style="background-color: #27ae60;">Check Availability</a>
                        </div>
                    </article>

                </section>
            </main>

            <footer style="text-align: center; padding: 50px; color: #999; font-size: 0.8rem;">
                &copy; 2026 Peak Horizon Travel. All rights reserved.
            </footer>

            <script>
                const scroller = document.querySelector('.scroller');
                
                // Auto-scroll slightly when the page loads to show the user it's scrollable
                window.addEventListener('load', () => {
                    setTimeout(() => {
                        scroller.scrollLeft = 100;
                        setTimeout(() => { scroller.scrollLeft = 0; }, 500);
                    }, 1000);
                });

                // Simple alert for buttons
                document.querySelectorAll('.btn-book').forEach(btn => {
                    btn.addEventListener('click', (e) => {
                        e.preventDefault();
                        alert("Redirecting to the secure booking portal...");
                    });
                });
            </script>
        </body>
        </html>
    """.trimIndent()

    private val gameBerry="""
        <!DOCTYPE html>
        <html lang="en">
        <head>
          <meta charset="UTF-8" />
          <meta name="viewport" content="width=device-width, initial-scale=1"/>
          <title>Nature Field Journal</title>

          <style>
            body{
              margin:0;
              font-family: Arial, sans-serif;
              background: #e8f7ef;
              

              color:#102a1a;
            }
            header{
              padding:18px 16px;
              background: #0f2a1b;
              color:#eaf7f0;
            }
            header h1{ margin:0; font-size:20px; letter-spacing:.5px; }
            header p{ margin:6px 0 0; color:#cfe7da; font-size:13px; }

            main{
              max-width:1100px;
              margin:auto;
              padding:16px;
              display:grid;
              grid-template-columns: 1.25fr .9fr;
              gap:16px;
            }
            @media (max-width:900px){ main{ grid-template-columns:1fr; } }

            .card{
              background:#ffffff;
              border:1px solid #d9e7df;
              border-radius:16px;
              padding:14px;
              box-shadow: 0 10px 30px rgba(0,0,0,.07);
            }

            nav{
              margin-top:10px;
              display:flex;
              gap:8px;
              flex-wrap:wrap;
            }
            nav a{
              text-decoration:none;
              color:#eaf7f0;
              border:1px solid rgba(234,247,240,.35);
              padding:6px 10px;
              border-radius:999px;
              font-size:13px;
            }
            nav a:hover{ background: rgba(234,247,240,.12); }

            figure{
              margin:0;
              border:1px solid #d9e7df;
              border-radius:14px;
              overflow:hidden;
              background:#f2fbf6;
            }
            .banner{
              padding:14px;
              background: linear-gradient(90deg, #c8f2d6, #e7fbf0);
              border-bottom:1px solid #d9e7df;
            }
            figcaption{
              padding:10px 12px;
              font-size:12px;
              color:#335a44;
            }

            .grid{
              display:grid;
              grid-template-columns: 1fr 1fr;
              gap:10px;
              margin-top:10px;
            }
            @media (max-width:650px){ .grid{ grid-template-columns:1fr; } }

            .tag{
              display:inline-block;
              padding:3px 8px;
              border-radius:999px;
              font-size:12px;
              border:1px solid #cfe7da;
              background:#f2fbf6;
              color:#1b3f2a;
              margin-right:6px;
              margin-top:6px;
            }

            details{
              border:1px solid #d9e7df;
              border-radius:14px;
              padding:10px 12px;
              background:#fbfdfc;
              margin-top:10px;
            }
            summary{
              cursor:pointer;
              font-weight:bold;
              color:#0f2a1b;
            }

            table{
              width:100%;
              border-collapse:collapse;
              margin-top:10px;
              overflow:hidden;
              border-radius:14px;
              border:1px solid #d9e7df;
            }
            th, td{
              text-align:left;
              padding:10px;
              border-bottom:1px solid #e6f0ea;
              font-size:13px;
            }
            th{
              background:#f2fbf6;
              color:#1b3f2a;
              font-weight:bold;
            }
            tr:last-child td{ border-bottom:none; }

            form{
              display:grid;
              gap:10px;
              margin-top:10px;
            }
            label{ font-size:13px; color:#1b3f2a; font-weight:bold; }
            input, select, textarea{
              width:100%;
              padding:10px;
              border-radius:12px;
              border:1px solid #cfe7da;
              outline:none;
              font-size:14px;
              background:#ffffff;
            }
            input:focus, select:focus, textarea:focus{
              border-color:#2f7a52;
              box-shadow: 0 0 0 3px rgba(47,122,82,.12);
            }

            .row{
              display:flex;
              gap:10px;
              flex-wrap:wrap;
              align-items:center;
            }
            button{
              border:none;
              border-radius:12px;
              padding:10px 12px;
              background:#2f7a52;
              color:#fff;
              font-weight:bold;
              cursor:pointer;
            }
            button:hover{ filter: brightness(1.05); }
            button:active{ transform: scale(.99); }

            .muted{ color:#335a44; font-size:13px; }

            .log{
              list-style:none;
              padding:0;
              margin:10px 0 0;
              border-radius:14px;
              border:1px solid #d9e7df;
              background:#fbfdfc;
              max-height:260px;
              overflow:auto;
            }
            .log li{
              padding:10px 12px;
              border-bottom:1px solid #e6f0ea;
              font-size:13px;
            }
            .log li:last-child{ border-bottom:none; }

            footer{
              text-align:center;
              padding:18px;
              font-size:12px;
              color:#335a44;
            }

            .badge{
              display:inline-block;
              padding:4px 10px;
              border-radius:999px;
              border:1px solid #cfe7da;
              background:#f2fbf6;
              font-size:12px;
              color:#1b3f2a;
            }
          </style>
        </head>

        <body>
        <header>
          <h1>Nature Field Journal</h1>
          <p>HTML-focused page: semantic tags, figure, details, table, form, lists, time, meter.</p>
          <nav>
            <a href="#guide">Field Guide</a>
            <a href="#notes">Notes Form</a>
            <a href="#log">Log</a>
          </nav>
        </header>

        <main>
          <section class="card" id="guide">
            <h2 style="margin:0;">Field Guide</h2>
            <p class="muted" style="margin:6px 0 0;">
              This page teaches HTML structure by looking like a real “nature journal”.
            </p>

            <figure style="margin-top:10px;">
              <div class="banner">
                <b>Observation Scene</b>
                <div class="muted" style="margin-top:6px;">
                  A calm river, wind in the leaves, and a bird call in the distance.
                </div>
                <div>
                  <span class="tag">figure</span>
                  <span class="tag">figcaption</span>
                  <span class="tag">section</span>
                  <span class="tag">article</span>
                  <span class="tag">details</span>
                  <span class="tag">table</span>
                  <span class="tag">form</span>
                </div>
              </div>
              <figcaption>
                Tip: Use <b>figure</b> when you want content + a caption (photo, diagram, note).
              </figcaption>
            </figure>

            <article style="margin-top:12px;">
              <h3 style="margin:0;">Today’s Habitat Snapshot</h3>
              <p class="muted" style="margin:6px 0 0;">
                Use <b>&lt;time&gt;</b> to show dates/times clearly for the browser and SEO.
                Example: <time datetime="2026-02-24">Feb 24, 2026</time>
              </p>

              <div class="grid">
                <div class="card" style="padding:12px;">
                  <b>Weather Notes</b>
                  <p class="muted" style="margin:6px 0 10px;">
                    This uses <b>meter</b> to represent a value in a range.
                  </p>
                  <label for="humidity">Humidity</label>
                  <meter id="humidity" min="0" max="100" low="25" high="75" optimum="55" value="60" style="width:100%;height:22px;"></meter>

                  <div class="row" style="margin-top:10px;">
                    <button type="button" onclick="shiftHumidity(-10)">Drier</button>
                    <button type="button" style="background:#1f6f8a;" onclick="shiftHumidity(10)">More Humid</button>
                    <span class="badge" id="humidityLabel">60%</span>
                  </div>
                </div>

                <div class="card" style="padding:12px;">
                  <b>Quick Species Checklist</b>
                  <p class="muted" style="margin:6px 0 0;">This is a simple HTML list.</p>
                  <ul style="margin:10px 0 0;">
                    <li>Birds: Weaver, Kingfisher, Eagle</li>
                    <li>Plants: Fern, Acacia, Papyrus</li>
                    <li>Insects: Butterfly, Dragonfly</li>
                  </ul>
                </div>
              </div>

              <details>
                <summary>Why use semantic HTML like section/article?</summary>
                <p class="muted" style="margin:10px 0 0;">
                  Semantic tags make your page easier to read and easier for browsers, screen readers,
                  and search engines to understand. It also makes your code cleaner than using only divs.
                </p>
              </details>

              <h3 style="margin:14px 0 0;">Mini Field Table</h3>
              <p class="muted" style="margin:6px 0 0;">
                Tables are perfect for structured data like sightings.
              </p>

              <table aria-label="Field sightings table">
                <thead>
                  <tr>
                    <th>Species</th>
                    <th>Habitat</th>
                    <th>Seen</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>Kingfisher</td>
                    <td>River edge</td>
                    <td><time datetime="2026-02-24T07:20">07:20</time></td>
                  </tr>
                  <tr>
                    <td>Dragonfly</td>
                    <td>Wetland</td>
                    <td><time datetime="2026-02-24T08:05">08:05</time></td>
                  </tr>
                  <tr>
                    <td>Acacia Tree</td>
                    <td>Dry ridge</td>
                    <td><time datetime="2026-02-24T09:10">09:10</time></td>
                  </tr>
                </tbody>
              </table>
            </article>
          </section>

          <aside class="card" id="notes">
            <h2 style="margin:0;">Field Notes Form</h2>
            <p class="muted" style="margin:6px 0 0;">
              This uses real form tags: label, input, select, textarea, and buttons.
            </p>

            <form id="noteForm">
              <div>
                <label for="observer">Observer Name</label>
                <input id="observer" name="observer" placeholder="e.g. Nick" required />
              </div>

              <div>
                <label for="species">What did you see?</label>
                <input id="species" name="species" placeholder="e.g. Weaver bird" required />
              </div>

              <div class="row">
                <div style="flex:1;min-width:180px;">
                  <label for="habitat">Habitat</label>
                  <select id="habitat" name="habitat">
                    <option>River</option>
                    <option>Forest</option>
                    <option>Grassland</option>
                    <option>Wetland</option>
                    <option>Mountain</option>
                  </select>
                </div>

                <div style="flex:1;min-width:180px;">
                  <label for="mood">Sound of nature</label>
                  <select id="mood" name="mood">
                    <option>Quiet</option>
                    <option>Windy</option>
                    <option>Bird songs</option>
                    <option>River flow</option>
                    <option>Insect chorus</option>
                  </select>
                </div>
              </div>

              <div>
                <label for="notesText">Short notes</label>
                <textarea id="notesText" name="notesText" rows="4" placeholder="Describe color, movement, direction, etc."></textarea>
              </div>

              <div class="row">
                <button type="submit">Save Note</button>
                <button type="reset" style="background:#64748b;">Clear</button>
              </div>

              <p class="muted" style="margin:0;">
                Small JS will add your note to the log below without reloading the page.
              </p>
            </form>

            <section id="log" style="margin-top:14px;">
              <h3 style="margin:0;">Observation Log</h3>
              <ul class="log" id="logList" aria-live="polite">
                <li>Journal ready. Add your first nature note.</li>
              </ul>
            </section>
          </aside>
        </main>

        <footer>
          Nature Field Journal: built mostly with HTML structure + tiny JavaScript
        </footer>

        <script>
          const form = document.getElementById("noteForm");
          const logList = document.getElementById("logList");
          const humidityMeter = document.getElementById("humidity");
          const humidityLabel = document.getElementById("humidityLabel");

          function addLogLine(text){
            const li = document.createElement("li");
            li.textContent = text;
            logList.prepend(li);
          }

          form.addEventListener("submit", function(e){
            e.preventDefault();

            const observer = document.getElementById("observer").value.trim();
            const species = document.getElementById("species").value.trim();
            const habitat = document.getElementById("habitat").value;
            const mood = document.getElementById("mood").value;
            const notes = document.getElementById("notesText").value.trim();

            const timeNow = new Date();
            const hh = String(timeNow.getHours()).padStart(2, "0");
            const mm = String(timeNow.getMinutes()).padStart(2, "0");

            let line = `${'$'}{hh}:${'$'}{mm} - ${'$'}{observer} saw ${'$'}{species} in ${'$'}{habitat} (${'$'}{mood}).`;
            if(notes) line += ` Notes: ${'$'}{notes}`;

            addLogLine(line);
            form.reset();
          });

          function shiftHumidity(delta){
            let v = Number(humidityMeter.value) + delta;
            v = Math.max(0, Math.min(100, v));
            humidityMeter.value = v;
            humidityLabel.textContent = v + "%";
            addLogLine("Humidity changed to " + v + "%.");
          }

          // expose for inline onclick usage
          window.shiftHumidity = shiftHumidity;
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
            <title>Heavenly Audio UI</title>
            <style>
                /* INTERNAL CSS */
                body {
                    margin: 0;
                    height: 100vh;
                    background: radial-gradient(circle at center, #1b2735 0%, #090a0f 100%);
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    overflow: hidden;
                    font-family: 'Quicksand', sans-serif;
                    color: white;
                      padding-top:250px;
                }

                /* Animated Star Background */
                .stars {
                    position: absolute;
                    width: 2px;
                    height: 2px;
                    background: white;
                    border-radius: 50%;
                    box-shadow: 400px 200px #FFF, 800px 400px #FFF, 1200px 600px #FFF; /* Multi-star trick */
                    animation: fly 50s linear infinite;
                }

                @keyframes fly {
                    from { transform: translateY(0px); }
                    to { transform: translateY(-1000px); }
                }

                /* The Heavenly Player Card */
                .player-card {
                    background: rgba(255, 255, 255, 0.05);
                    backdrop-filter: blur(20px);
                    border: 1px solid rgba(255, 255, 255, 0.1);
                    border-radius: 50px;
                    padding: 40px;
                    text-align: center;
                    box-shadow: 0 0 50px rgba(135, 206, 235, 0.2);
                    z-index: 10;
                }

                /* The Rotating Disk */
                .disk {
                    width: 150px;
                    height: 150px;
                    border-radius: 50%;
                    background: linear-gradient(45deg, #87ceeb, #f0f8ff);
                    margin: 0 auto 30px;
                    border: 10px solid rgba(255, 255, 255, 0.1);
                    box-shadow: 0 0 30px rgba(135, 206, 235, 0.5);
                    display: flex;
                    align-items: center;
                    justify-content: center;
                }

                .disk-inner {
                    width: 40px;
                    height: 40px;
                    background: #090a0f;
                    border-radius: 50%;
                }

                button {
                    background: white;
                    border: none;
                    padding: 15px 30px;
                    border-radius: 25px;
                    font-weight: bold;
                    cursor: pointer;
                    transition: 0.3s;
                    margin-top: 20px;
                }

                button:hover {
                    transform: scale(1.1);
                    box-shadow: 0 0 20px white;
                }
            </style>
        </head>
        <body>

            <div class="stars" style="top: 0;"></div>
            <div class="stars" style="top: 500px; opacity: 0.5;"></div>

            <div class="player-card">
                <div id="vinyl" class="disk" style="transform: rotate(0deg);">
                    <div class="disk-inner"></div>
                </div>

                <h2 style="margin: 0; letter-spacing: 2px;">ETHERAL DRIFT</h2>
                <p style="opacity: 0.6; font-size: 0.9rem;">Cosmic Symphony No. 9</p>

                <button id="playBtn">SYNC REALITY</button>
            </div>

            <script>
                let rotation = 0;
                let isPlaying = false;
                let animationFrame;
                const disk = document.getElementById('vinyl');
                const btn = document.getElementById('playBtn');

                function rotateDisk() {
                    if (!isPlaying) return;
                    rotation += 1; // Increase degrees
                    
                    // Apply INLINE CSS via JavaScript for smooth movement
                    disk.style.transform = `rotate(${'$'}{rotation}deg)`;
                    
                    animationFrame = requestAnimationFrame(rotateDisk);
                }

                btn.onclick = () => {
                    isPlaying = !isPlaying;
                    btn.innerText = isPlaying ? "CEASE DRIFT" : "SYNC REALITY";
                    
                    if (isPlaying) {
                        rotateDisk();
                    } else {
                        cancelAnimationFrame(animationFrame);
                    }
                };
            </script>
        </body>
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
                background:gray;
                    color: #e5e5e5;
                    overflow: hidden;
                }

                .container {
                    text-align: center;
                   padding: 12px;
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

private val game="""
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <title>Cyber-Runner Mobile</title>
        <style>
            :root {
                --neon: #00ff41;
                --bg: #050505;
                --danger: #ff3e3e;
            }

            body {
                margin: 0;
                background: var(--bg);
                color: var(--neon);
                font-family: 'Courier New', Courier, monospace;
                display: flex;
                flex-direction: column;
                align-items: center;
                justify-content: center;
                height: 100vh;
                overflow: hidden;
                touch-action: manipulation; /* Prevents double-tap zoom delay */
                padding-top:200px;
            }

            /* Scanline Effect */
            body::before {
                content: " ";
                position: absolute;
                top: 0; left: 0; bottom: 0; right: 0;
                background: linear-gradient(rgba(18, 16, 16, 0) 50%, rgba(0, 0, 0, 0.25) 50%), 
                            linear-gradient(90deg, rgba(255, 0, 0, 0.06), rgba(0, 255, 0, 0.02), rgba(0, 0, 255, 0.06));
                background-size: 100% 4px, 3px 100%;
                z-index: 100;
                pointer-events: none;
            }

            #game-container {
                position: relative;
                width: 95vw;
                max-width: 600px;
            }

            canvas {
                width: 100%; /* Responsive Width */
                background: #111;
                border: 1px solid #333;
                box-shadow: 0 0 15px rgba(0, 255, 65, 0.1);
            }

            .stats {
                display: flex;
                justify-content: space-between;
                width: 100%;
                padding: 10px 0;
                font-size: 0.9rem;
                text-transform: uppercase;
            }

            #overlay {
                position: absolute;
                top: 0; left: 0; right: 0; bottom: 0;
                background: rgba(0,0,0,0.9);
                display: none; /* Controlled via JS */
                flex-direction: column;
                align-items: center;
                justify-content: center;
                z-index: 10;
            }

            button {
                background: transparent;
                color: var(--neon);
                border: 1px solid var(--neon);
                padding: 15px 30px;
                font-family: inherit;
                cursor: pointer;
                margin-top: 15px;
            }

            button:active { background: var(--neon); color: black; }
        </style>
    </head>
    <body>

        <div id="game-container">
            <div class="stats">
                <span>Status: Online</span>
                <span>Score: <span id="score">0</span></span>
            </div>

            <canvas id="gameCanvas" width="600" height="200"></canvas>

            <div id="overlay">
                <h2 style="color: var(--danger); margin: 0;">KERNEL_PANIC</h2>
                <p>Collision Detected.</p>
                <button onclick="resetGame()">HOT_REBOOT</button>
            </div>
        </div>

        <p style="font-size: 0.7rem; opacity: 0.5; margin-top: 20px;">[ TAP SCREEN TO JUMP ]</p>

        <script>
            const canvas = document.getElementById('gameCanvas');
            const ctx = canvas.getContext('2d');
            const scoreEl = document.getElementById('score');
            const overlay = document.getElementById('overlay');

            // Game State
            let state = {
                score: 0,
                active: true,
                speed: 5,
                lastTime: 0
            };

            const dino = {
                x: 50, y: 150,
                w: 30, h: 30,
                dy: 0,
                jumpForce: 12,
                gravity: 0.6,
                grounded: true
            };

            let obstacles = [];

            function spawnObstacle() {
                obstacles.push({
                    x: canvas.width,
                    y: 160,
                    w: 20,
                    h: 20
                });
            }

            function update(time = 0) {
                const deltaTime = time - state.lastTime;
                state.lastTime = time;

                if (state.active) {
                    // Physics
                    if (!dino.grounded) {
                        dino.dy += dino.gravity;
                        dino.y += dino.dy;
                    }

                    if (dino.y > 150) {
                        dino.y = 150;
                        dino.dy = 0;
                        dino.grounded = true;
                    }

                    // Obstacle Logic
                    if (obstacles.length === 0 || obstacles[obstacles.length-1].x < 400) {
                        if (Math.random() < 0.02) spawnObstacle();
                    }

                    obstacles.forEach((obs, index) => {
                        obs.x -= state.speed;

                        // Collision (AABB)
                        if (dino.x < obs.x + obs.w &&
                            dino.x + dino.w > obs.x &&
                            dino.y < obs.y + obs.h &&
                            dino.y + dino.h > obs.y) {
                            state.active = false;
                            overlay.style.display = 'flex';
                        }

                        if (obs.x + obs.w < 0) {
                            obstacles.splice(index, 1);
                            state.score++;
                            scoreEl.innerText = state.score;
                            state.speed += 0.1;
                        }
                    });

                    draw();
                }
                requestAnimationFrame(update);
            }

            function draw() {
                ctx.clearRect(0, 0, canvas.width, canvas.height);

                // Ground line
                ctx.strokeStyle = '#333';
                ctx.beginPath();
                ctx.moveTo(0, 180);
                ctx.lineTo(canvas.width, 180);
                ctx.stroke();

                // Dino
                ctx.fillStyle = '#00ff41';
                ctx.fillRect(dino.x, dino.y, dino.w, dino.h);

                // Obstacles
                ctx.fillStyle = '#ff3e3e';
                obstacles.forEach(obs => {
                    ctx.fillRect(obs.x, obs.y, obs.w, obs.h);
                });
            }

            function jump() {
                if (dino.grounded && state.active) {
                    dino.dy = -dino.jumpForce;
                    dino.grounded = false;
                }
            }

            function resetGame() {
                state.active = true;
                state.score = 0;
                state.speed = 5;
                scoreEl.innerText = 0;
                obstacles = [];
                dino.y = 150;
                overlay.style.display = 'none';
            }

            // INPUT HANDLERS
            window.addEventListener('keydown', (e) => { if(e.code === 'Space') jump(); });
            // Touchstart is critical for mobile web views
            window.addEventListener('touchstart', (e) => { 
                if (state.active) {
                    jump(); 
                    e.preventDefault(); // Prevents flickering/zoom on some webviews
                }
            }, { passive: false });

            update();
        </script>
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



    private val passwordGenCode ="""
        <!DOCTYPE html>
        <html lang="en">
        <head>
          <meta charset="UTF-8" />
          <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
          <title>Arcana Spellbook</title>

          <style>
            body{
              margin:0;
              font-family: Arial, sans-serif;
              background:#1f2937;
          
              color:#e5e7eb;
            }

            header{
              padding:18px;
              position:sticky;
              top:0;
              background: rgba(11,16,32,.75);
              backdrop-filter: blur(10px);
              border-bottom:1px solid rgba(255,255,255,.08);
              z-index:10;
            }

            header h1{ margin:0; font-size:20px; letter-spacing:.5px; }
            header p{ margin:6px 0 0; color:#cbd5e1; font-size:13px; }

            main{
              max-width:1100px;
              margin:auto;
              padding:16px;
              display:grid;
              grid-template-columns: 1.2fr .9fr;
              gap:16px;
            }
            @media(max-width:900px){ main{ grid-template-columns:1fr; } }

            .card{
              background: rgba(255,255,255,.06);
              border: 1px solid rgba(255,255,255,.10);
              border-radius:18px;
              padding:14px;
              box-shadow: 0 18px 40px rgba(0,0,0,.25);
            }

            nav{
              margin-top:10px;
              display:flex;
              gap:10px;
              flex-wrap:wrap;
            }
            nav a{
              text-decoration:none;
              color:#e5e7eb;
              border:1px solid rgba(255,255,255,.18);
              padding:6px 10px;
              border-radius:999px;
              font-size:13px;
            }
            nav a:hover{ background: rgba(255,255,255,.10); }

            .hero{
              display:flex;
              gap:12px;
              align-items:flex-start;
            }
            .seal{
              width:46px;
              height:46px;
              border-radius:14px;
              display:grid;
              place-items:center;
              border:1px solid rgba(255,255,255,.18);
              background: rgba(99,102,241,.16);
              font-weight:bold;
            }
            .hero h2{ margin:0; font-size:18px; }
            .hero .muted{ margin:6px 0 0; color:#cbd5e1; font-size:13px; }

            .grid{
              display:grid;
              grid-template-columns: repeat(2, 1fr);
              gap:10px;
              margin-top:12px;
            }
            @media(max-width:600px){ .grid{ grid-template-columns:1fr; } }

            button{
              border:none;
              border-radius:14px;
              padding:10px 12px;
              background:#6366f1;
              color:white;
              font-weight:bold;
              cursor:pointer;
            }
            button:hover{ filter: brightness(1.08); }
            button:active{ transform: scale(.98); }

            .spell{
              border-radius:16px;
              border:1px solid rgba(255,255,255,.12);
              background: rgba(0,0,0,.18);
              padding:12px;
              display:flex;
              justify-content:space-between;
              gap:10px;
              align-items:flex-start;
            }
            .spell h3{ margin:0; font-size:15px; }
            .spell p{ margin:6px 0 0; font-size:12px; color:#cbd5e1; }
            .cost{
              font-weight:bold;
              white-space:nowrap;
              color:#a7f3d0;
            }

            figure{
              margin:0;
              border-radius:16px;
              overflow:hidden;
              border:1px solid rgba(255,255,255,.12);
              background: rgba(0,0,0,.18);
            }
            figcaption{
              padding:10px;
              font-size:12px;
              color:#cbd5e1;
              border-top:1px solid rgba(255,255,255,.12);
            }

            details{
              margin-top:10px;
              border:1px solid rgba(255,255,255,.12);
              border-radius:16px;
              padding:10px;
              background: rgba(0,0,0,.18);
            }
            summary{
              cursor:pointer;
              font-weight:bold;
            }

            .row{
              display:flex;
              gap:10px;
              align-items:center;
              flex-wrap:wrap;
              margin-top:10px;
            }

            .log{
              list-style:none;
              padding:0;
              margin:10px 0 0;
              max-height:230px;
              overflow:auto;
              border-radius:16px;
              border:1px solid rgba(255,255,255,.12);
              background: rgba(0,0,0,.18);
            }
            .log li{
              padding:10px;
              border-bottom:1px solid rgba(255,255,255,.10);
              font-size:13px;
              color:#e5e7eb;
            }
            .log li:last-child{ border-bottom:none; }

            .tag{
              display:inline-block;
              padding:3px 8px;
              border-radius:999px;
              font-size:12px;
              border:1px solid rgba(255,255,255,.18);
              color:#e5e7eb;
            }

            dialog{
              border:none;
              border-radius:18px;
              padding:14px;
              max-width:520px;
              width:92%;
              background: #0b1020;
              color:#e5e7eb;
              box-shadow: 0 25px 80px rgba(0,0,0,.55);
              border:1px solid rgba(255,255,255,.12);
            }
            dialog::backdrop{ background: rgba(0,0,0,.6); }

            .closeRow{
              display:flex;
              justify-content:space-between;
              align-items:center;
              gap:10px;
            }

            footer{
              text-align:center;
              padding:18px;
              color:#cbd5e1;
              font-size:12px;
            }
          </style>
        </head>

        <body>
        <header>
          <h1>Arcana Spellbook</h1>
          <p>HTML-heavy magical page: uses figure, details, meter, progress, dialog, lists, sections, nav.</p>
          <nav>
            <a href="#spells">Spells</a>
            <a href="#rituals">Rituals</a>
            <a href="#log">Casting Log</a>
          </nav>
        </header>

        <main>
          <section class="card">
            <div class="hero">
              <div class="seal">A</div>
              <div>
                <h2>Welcome, Apprentice</h2>
                <p class="muted">
                  Choose a spell below. Your magic energy will change as you cast spells.
                  This feels “alive” but still teaches real HTML structure.
                </p>
              </div>
            </div>

            <figure style="margin-top:12px;">
              <div style="padding:14px;">
                <b>Spellbook Tip</b>
                <p class="muted" style="margin:6px 0 0;">
                  Open DevTools console and inspect elements to learn how each HTML tag is structured.
                </p>
                <p style="margin:10px 0 0;">
                  <span class="tag">section</span>
                  <span class="tag">figure</span>
                  <span class="tag">details</span>
                  <span class="tag">meter</span>
                  <span class="tag">progress</span>
                  <span class="tag">dialog</span>
                </p>
              </div>
              <figcaption>Figure + Figcaption: great for screenshots, images, charts, or “notes” with captions.</figcaption>
            </figure>

            <div class="row">
              <div style="flex:1;min-width:240px;">
                <b>Magic Energy (meter)</b>
                <div class="muted">Goes up/down when you cast spells.</div>
                <meter id="energyMeter" min="0" max="100" low="20" high="80" optimum="90" value="65" style="width:100%;height:22px;"></meter>
              </div>

              <div style="flex:1;min-width:240px;">
                <b>Study Progress (progress)</b>
                <div class="muted">Increases when you open rituals.</div>
                <progress id="studyProgress" value="30" max="100" style="width:100%;height:22px;"></progress>
              </div>
            </div>

            <details id="rituals" style="margin-top:12px;">
              <summary>Rituals (HTML details/summary)</summary>
              <p class="muted" style="margin:10px 0 0;">
                This section is collapsed/expanded using pure HTML. No JavaScript needed.
              </p>

              <ol style="margin-top:10px;">
                <li>Read the spell description carefully.</li>
                <li>Cast the spell and watch the log update.</li>
                <li>Try “Reset” and cast again.</li>
              </ol>

              <button style="margin-top:10px;background:#22c55e;" onclick="increaseStudy()">I studied rituals</button>
            </details>

            <div class="row" style="margin-top:12px;">
              <button onclick="openAbout()">Open Spellbook Info</button>
              <button style="background:#ef4444;" onclick="resetBook()">Reset</button>
            </div>
          </section>

          <aside class="card" id="spells">
            <h2 style="margin:0 0 10px;">Spells</h2>
            <p class="muted" style="margin:0 0 10px;">Pick a spell. Each one costs energy.</p>

            <div class="grid">
              <div class="spell">
                <div>
                  <h3>Glow Rune</h3>
                  <p>Makes a message glow like magic ink.</p>
                  <button onclick="cast('Glow Rune', 10, 'The page whispers: “Light obeys you.”')">Cast</button>
                </div>
                <div class="cost">-10</div>
              </div>

              <div class="spell">
                <div>
                  <h3>Storm Ping</h3>
                  <p>Summons a powerful alert from the clouds.</p>
                  <button onclick="cast('Storm Ping', 18, 'Thunder says: “Hello, coder!”', true)">Cast</button>
                </div>
                <div class="cost">-18</div>
              </div>

              <div class="spell">
                <div>
                  <h3>Fortune Flip</h3>
                  <p>Generates a random “fortune” line.</p>
                  <button onclick="fortune()">Cast</button>
                </div>
                <div class="cost">-12</div>
              </div>

              <div class="spell">
                <div>
                  <h3>Energy Blessing</h3>
                  <p>Refills your energy a little.</p>
                  <button onclick="bless()">Cast</button>
                </div>
                <div class="cost">+15</div>
              </div>
            </div>

            <section id="log" style="margin-top:14px;">
              <h2 style="margin:0;">Casting Log</h2>
              <p class="muted" style="margin:6px 0 0;">Shows newest action at the top.</p>
              <ul class="log" id="logList" aria-live="polite">
                <li>Spellbook ready. Cast your first spell.</li>
              </ul>
            </section>
          </aside>
        </main>

        <dialog id="aboutDialog">
          <div class="closeRow">
            <b>Spellbook Info</b>
            <button style="background:#334155;" onclick="closeAbout()">Close</button>
          </div>
          <p class="muted" style="margin:10px 0 0;">
            This mini project is HTML-focused: you learn layout tags, semantic sections, and useful UI tags.
          </p>
          <ul style="margin-top:10px;">
            <li><b>meter</b> shows a value in a range (energy).</li>
            <li><b>progress</b> shows progress completion.</li>
            <li><b>details/summary</b> gives expand/collapse without JS.</li>
            <li><b>dialog</b> creates a real modal popup.</li>
          </ul>
        </dialog>

        <footer>
          Arcana Spellbook: built to practice real HTML tags + small JavaScript
        </footer>

        <script>
          let energy = 65;
          let study = 30;

          function setEnergy(v){
            energy = Math.max(0, Math.min(100, v));
            document.getElementById("energyMeter").value = energy;
          }

          function log(msg){
            const li = document.createElement("li");
            li.textContent = msg;
            const list = document.getElementById("logList");
            list.prepend(li);
          }

          function cast(name, cost, message, alsoAlert=false){
            if(energy - cost < 0){
              log("Not enough energy to cast " + name + ". Try Energy Blessing.");
              return;
            }
            setEnergy(energy - cost);

            log("Cast: " + name + " | Energy now: " + energy);
            log(message);

            if(alsoAlert){
              alert("Storm Ping cast! Check the casting log.");
            }
          }

          function fortune(){
            const fortunes = [
              "A clean HTML structure makes your site easier to grow.",
              "Today you will master forms, lists, and semantic tags.",
              "Small JavaScript + strong HTML makes powerful pages.",
              "Your next project will look professional and load fast."
            ];
            const pick = fortunes[Math.floor(Math.random() * fortunes.length)];
            cast("Fortune Flip", 12, "Fortune: " + pick);
          }

          function bless(){
            setEnergy(energy + 15);
            log("Energy Blessing! Energy now: " + energy);
          }

          function resetBook(){
            setEnergy(65);
            study = 30;
            document.getElementById("studyProgress").value = study;
            document.getElementById("logList").innerHTML = "<li>Spellbook reset. Cast again.</li>";
          }

          function increaseStudy(){
            study = Math.min(100, study + 20);
            document.getElementById("studyProgress").value = study;
            log("Ritual study increased. Progress: " + study + "%");
          }

          function openAbout(){
            document.getElementById("aboutDialog").showModal();
          }

          function closeAbout(){
            document.getElementById("aboutDialog").close();
          }
        </script>
        </body>
        </html>
    """.trimIndent()
    private val tipCalcCode = """
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>Magical Glass UI</title>
            <style>
                /* INTERNAL CSS */
                :root {
                    --glass-bg: rgba(255, 255, 255, 0.1);
                    --glass-border: rgba(255, 255, 255, 0.2);
                }

                body {
                    background: linear-gradient(45deg, #0f0c29, #302b63, #24243e);
                    height: 100vh;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    margin: 0;
                    padding-top:180px;
                   
                    overflow: hidden;
                    font-family: 'Segoe UI', sans-serif;
                }

                /* The floating background circles */
                .blob { 
                 margin-top:100px;
                    position: absolute;
                    width: 300px;
                    height: 300px;
                    background: linear-gradient(#ff00cc, #3333ff);
                    border-radius: 50%;
                    filter: blur(50px);
                    z-index: -1;
                    animation: move 10s infinite alternate;
                }

                .card {
                   margin-top:100px;
                    width: 400px;
                    height: 240px;
                    background: var(--glass-bg);
                    backdrop-filter: blur(15px); /* This is the magic "Glass" line */
                    -webkit-backdrop-filter: blur(15px);
                    border: 1px solid var(--glass-border);
                    border-radius: 20px;
                    padding: 30px;
                    color: white;
                    box-shadow: 0 25px 45px rgba(0,0,0,0.2);
                    transition: 0.5s;
                    position: relative;
                }

                .card:hover {
                    transform: translateY(-10px);
                    background: rgba(255, 255, 255, 0.15);
                }

                .chip {
                    width: 50px;
                    height: 40px;
                    background: rgba(255, 255, 255, 0.3);
                    border-radius: 8px;
                    margin-bottom: 20px;
                }

                .number { font-size: 1.5rem; letter-spacing: 4px; }

                @keyframes move {
                    from { transform: translate(-100px, -100px); }
                    to { transform: translate(100px, 100px); }
                }
            </style>
        </head>
        <body>
 
            <div class="blob"></div>

            <div class="card" id="myCard">
                <div class="chip"></div>
                <div class="number">**** **** **** <span id="secret">4321</span></div>
                <br>
                <div style="display: flex; justify-content: space-between;">
                    <div>
                        <small>Card Holder</small>
                        <div style="font-weight: bold; text-transform: uppercase;">Nick Dieda</div>
                    </div>
                    <div>
                        <small>Expires</small>
                        <div style="font-weight: bold;">12/28</div>
                    </div>
                </div>

                <div id="flare" style="position: absolute; width: 100px; height: 100px; background: white; filter: blur(40px); opacity: 0; border-radius: 50%; pointer-events: none;"></div>
            </div>

            <script>
                const card = document.getElementById('myCard');
                const flare = document.getElementById('flare');
                const secret = document.getElementById('secret');

                card.addEventListener('mousemove', (e) => {
                    // Get local coordinates inside the card
                    let rect = card.getBoundingClientRect();
                    let x = e.clientX - rect.left;
                    let y = e.clientY - rect.top;

                    // Use INLINE CSS to move the flare effect
                    flare.style.opacity = "0.2";
                    flare.style.left = (x - 50) + "px";
                    flare.style.top = (y - 50) + "px";
                });

                card.addEventListener('mouseleave', () => {
                    flare.style.opacity = "0";
                });

                // Magical Reveal
                card.onclick = () => {
                    secret.innerText = secret.innerText === "****" ? "4321" : "****";
                    alert("🔒 Secure Data Toggled!");
                };
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
        <html lang="en">
        <head>
          <meta charset="UTF-8" />
          <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
          <title>TastyBite Menu</title>

          <style>
            body{
              font-family: Arial, sans-serif;
              margin:0;
              background:#f6f7fb;
              color:#111827;
            }
            header{
              padding:18px;
              background:#111827;
              color:#fff;
              position:sticky;
              top:0;
              z-index:10;
            }
            header h1{ margin:0; font-size:20px; }
            nav{
              margin-top:10px;
              display:flex;
              gap:10px;
              flex-wrap:wrap;
            }
            nav a{
              color:#fff;
              text-decoration:none;
              padding:6px 10px;
              border:1px solid rgba(255,255,255,.25);
              border-radius:999px;
              font-size:13px;
            }
            nav a:hover{ background:rgba(255,255,255,.12); }

            main{
              max-width:1000px;
              margin:auto;
              padding:16px;
              display:grid;
              grid-template-columns: 1.4fr .9fr;
              gap:16px;
            }
            @media(max-width:900px){
              main{ grid-template-columns:1fr; }
              header{ position:relative; }
            }

            .card{
              background:#fff;
              border-radius:16px;
              padding:14px;
              box-shadow:0 10px 25px rgba(0,0,0,.08);
            }

            .hero{
              display:flex;
              gap:12px;
              align-items:center;
            }
            .hero .badge{
              background:#e0e7ff;
              color:#1e40af;
              padding:6px 10px;
              border-radius:999px;
              font-weight:bold;
              font-size:12px;
              white-space:nowrap;
            }
            .hero p{ margin:6px 0 0; color:#4b5563; }

            section h2{
              margin:0 0 10px;
              font-size:18px;
            }
            .grid{
              display:grid;
              grid-template-columns: repeat(2, 1fr);
              gap:10px;
            }
            @media(max-width:600px){
              .grid{ grid-template-columns:1fr; }
            }

            figure{
              margin:0;
              border:1px solid #e5e7eb;
              border-radius:14px;
              overflow:hidden;
              background:#fff;
            }
            figcaption{
              padding:10px;
              font-size:13px;
              color:#4b5563;
              border-top:1px solid #e5e7eb;
            }

            .item{
              border:1px solid #e5e7eb;
              border-radius:14px;
              padding:12px;
              display:flex;
              justify-content:space-between;
              gap:10px;
              align-items:flex-start;
              background:#fff;
            }
            .item h3{
              margin:0;
              font-size:15px;
            }
            .item p{
              margin:6px 0 0;
              font-size:12px;
              color:#6b7280;
            }
            .price{
              font-weight:bold;
              white-space:nowrap;
            }
            button{
              margin-top:10px;
              padding:8px 10px;
              border:none;
              border-radius:12px;
              background:#111827;
              color:white;
              font-weight:bold;
              cursor:pointer;
            }
            button:active{ transform:scale(.98); }
            .smallBtn{
              background:#2563eb;
            }

            details{
              border:1px solid #e5e7eb;
              border-radius:14px;
              padding:10px;
              background:#fff;
            }
            summary{
              cursor:pointer;
              font-weight:bold;
            }

            .orderList{
              margin:10px 0 0;
              padding:0;
              list-style:none;
            }
            .orderList li{
              display:flex;
              justify-content:space-between;
              gap:10px;
              padding:8px 0;
              border-bottom:1px dashed #e5e7eb;
              font-size:13px;
            }
            .muted{ color:#6b7280; font-size:12px; }
            .total{
              display:flex;
              justify-content:space-between;
              font-weight:bold;
              margin-top:10px;
              padding-top:10px;
              border-top:1px solid #e5e7eb;
            }

            form label{
              display:block;
              font-size:12px;
              color:#374151;
              font-weight:bold;
              margin-top:10px;
            }
            input, textarea, select{
              width:100%;
              padding:10px;
              margin-top:6px;
              border-radius:12px;
              border:1px solid #cbd5e1;
              outline:none;
              font-family:inherit;
            }
            input:focus, textarea:focus, select:focus{ border-color:#2563eb; }

            table{
              width:100%;
              border-collapse:collapse;
              margin-top:10px;
              font-size:12px;
            }
            th, td{
              border-bottom:1px solid #e5e7eb;
              padding:8px;
              text-align:left;
            }
            footer{
              text-align:center;
              padding:18px;
              color:#6b7280;
            }
          </style>
        </head>

        <body>
        <header>
          <h1>TastyBite Restaurant</h1>
          <nav>
            <a href="#menu">Menu</a>
            <a href="#specials">Specials</a>
            <a href="#about">About</a>
            <a href="#order">Order</a>
          </nav>
        </header>

        <main>
          <div>
            <div class="card hero" style="border:1px solid #e5e7eb;">
              <div class="badge">HTML Practice Page</div>
              <div>
                <b>Learn real page structure</b>
                <p>This page uses header, nav, section, figure, details, form, table, and footer.</p>
              </div>
            </div>

            <section id="menu" class="card" style="margin-top:12px;">
              <h2>Menu</h2>

              <figure>
                <div style="padding:14px;">
                  <b>Chef’s note</b>
                  <p class="muted" style="margin:6px 0 0;">
                    This is a demo site. Items are not real, but the HTML structure is.
                  </p>
                </div>
                <figcaption>Figure + Figcaption example (good for images, charts, and captions).</figcaption>
              </figure>

              <div class="grid" style="margin-top:12px;">
                <div class="item">
                  <div>
                    <h3>Chicken Wrap</h3>
                    <p>Grilled chicken, fresh salad, soft tortilla.</p>
                    <button class="smallBtn" onclick="addItem('Chicken Wrap', 250)">Add to order</button>
                  </div>
                  <div class="price">Ksh 250</div>
                </div>

                <div class="item">
                  <div>
                    <h3>Beef Burger</h3>
                    <p>Beef patty, cheese, onions, sauce.</p>
                    <button class="smallBtn" onclick="addItem('Beef Burger', 350)">Add to order</button>
                  </div>
                  <div class="price">Ksh 350</div>
                </div>

                <div class="item">
                  <div>
                    <h3>Veggie Bowl</h3>
                    <p>Rice, beans, veggies, light dressing.</p>
                    <button class="smallBtn" onclick="addItem('Veggie Bowl', 220)">Add to order</button>
                  </div>
                  <div class="price">Ksh 220</div>
                </div>

                <div class="item">
                  <div>
                    <h3>Fruit Smoothie</h3>
                    <p>Mango + banana + yogurt blend.</p>
                    <button class="smallBtn" onclick="addItem('Fruit Smoothie', 180)">Add to order</button>
                  </div>
                  <div class="price">Ksh 180</div>
                </div>
              </div>
            </section>

            <section id="specials" class="card" style="margin-top:12px;">
              <h2>Specials (Details/Summary)</h2>

              <details open>
                <summary>Today’s Combo Deal</summary>
                <p class="muted" style="margin:8px 0 0;">
                  Combo: Beef Burger + Smoothie (save Ksh 50).
                </p>
                <button onclick="addItem('Combo Deal', 480)">Add Combo</button>
              </details>

              <details style="margin-top:10px;">
                <summary>Student Discount</summary>
                <p class="muted" style="margin:8px 0 0;">
                  If you are a student, you can apply 10% discount when placing your order.
                </p>
              </details>
            </section>

            <section id="about" class="card" style="margin-top:12px;">
              <h2>About</h2>
              <ul>
                <li>Uses semantic HTML tags for structure.</li>
                <li>Buttons call a JavaScript function (small JS).</li>
                <li>Form collects data and shows a receipt preview.</li>
              </ul>
            </section>
          </div>

          <aside class="card" id="order">
            <h2>Your Order</h2>
            <p class="muted">Click “Add to order” to build your list.</p>

            <ul class="orderList" id="orderList">
              <li class="muted" style="justify-content:center;">No items yet</li>
            </ul>

            <div class="total">
              <span>Total</span>
              <span id="total">Ksh 0</span>
            </div>

            <button class="danger" style="background:#dc2626;margin-top:12px;" onclick="clearOrder()">Clear Order</button>

            <hr style="border:none;border-top:1px solid #e5e7eb;margin:14px 0;">

            <h2>Checkout Form</h2>
            <form onsubmit="placeOrder(event)">
              <label>Full Name</label>
              <input id="name" required placeholder="Example: Nick Eagle">

              <label>Pickup Place</label>
              <select id="pickup">
                <option>Front Desk</option>
                <option>Table 1</option>
                <option>Table 2</option>
                <option>Take Away</option>
              </select>

              <label>Student Discount</label>
              <select id="discount">
                <option value="0">No</option>
                <option value="10">Yes (10%)</option>
              </select>

              <label>Notes</label>
              <textarea id="notes" rows="3" placeholder="No onions, extra sauce..."></textarea>

              <button type="submit" style="background:#16a34a;">Place Order</button>
            </form>

            <h2 style="margin-top:16px;">Receipt Preview</h2>
            <table>
              <thead>
                <tr>
                  <th>Item</th>
                  <th>Price</th>
                </tr>
              </thead>
              <tbody id="receiptBody">
                <tr><td class="muted" colspan="2">No receipt yet</td></tr>
              </tbody>
            </table>

            <p class="muted" id="receiptNote" style="margin-top:10px;"></p>
          </aside>
        </main>

        <footer>
          Built for HTML learning: semantic tags, form, table, lists, and small JS
        </footer>

        <script>
          const order = [];
          let total = 0;

          function renderOrder(){
            const list = document.getElementById("orderList");
            const receipt = document.getElementById("receiptBody");

            list.innerHTML = "";
            receipt.innerHTML = "";

            if(order.length === 0){
              list.innerHTML = '<li class="muted" style="justify-content:center;">No items yet</li>';
              receipt.innerHTML = '<tr><td class="muted" colspan="2">No receipt yet</td></tr>';
              document.getElementById("total").innerText = "Ksh 0";
              return;
            }

            order.forEach((it) => {
              const li = document.createElement("li");
              li.innerHTML = `<span>${'$'}{it.name}</span><span>Ksh ${'$'}{it.price}</span>`;
              list.appendChild(li);

              const tr = document.createElement("tr");
              tr.innerHTML = `<td>${'$'}{it.name}</td><td>Ksh ${'$'}{it.price}</td>`;
              receipt.appendChild(tr);
            });

            document.getElementById("total").innerText = "Ksh " + total;
          }

          function addItem(name, price){
            order.push({name, price});
            total += price;
            renderOrder();
          }

          function clearOrder(){
            order.length = 0;
            total = 0;
            document.getElementById("receiptNote").innerText = "";
            renderOrder();
          }

          function placeOrder(e){
            e.preventDefault();

            if(order.length === 0){
              alert("Add at least one item first.");
              return;
            }

            const name = document.getElementById("name").value.trim();
            const pickup = document.getElementById("pickup").value;
            const discount = Number(document.getElementById("discount").value);
            const notes = document.getElementById("notes").value.trim();

            let finalTotal = total;
            if(discount > 0){
              finalTotal = Math.round(total * (1 - discount/100));
            }

            const extra = notes ? ("Notes: " + notes) : "No special notes.";
            document.getElementById("receiptNote").innerText =
              "Customer: " + name + " | Pickup: " + pickup +
              " | Discount: " + discount + "% | Final Total: Ksh " + finalTotal +
              " | " + extra;

            alert("Order placed! Check the receipt preview.");
          }

          renderOrder();
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
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>TermiTree Explorer</title>
            <style>
                /* INTERNAL CSS: Setting the Terminal Environment */
                body {
                    background-color: #121212;
                    color: #e0e0e0;
                    font-family: 'DejaVu Sans Mono', monospace;
                    padding: 40px;
                }

                .window {
                    border: 1px solid #444;
                    border-top: 25px solid #333; /* Fakes a window title bar */
                    border-radius: 5px;
                    padding: 15px;
                    max-width: 500px;
                    background: #1e1e1e;
                    box-shadow: 10px 10px 0px #000;
                }

                summary {
                    cursor: pointer;
                    padding: 5px;
                    color: #569cd6; /* Folder color */
                    list-style: none;
                }

                summary:hover { background: #2a2a2a; }

                /* Customizing the "Tree" lines */
                details { margin-left: 20px; border-left: 1px dashed #444; }
                
                .file {
                    margin-left: 25px;
                    padding: 2px;
                    display: block;
                    text-decoration: none;
                }

                .file::before { content: "📄 "; font-size: 0.8rem; }
                summary::before { content: "📁 "; }
                details[open] > summary::before { content: "📂 "; }

                #status-bar {
                    margin-top: 20px;
                    font-size: 0.85rem;
                    color: #888;
                    border-top: 1px solid #333;
                    padding-top: 10px;
                }
            </style>
        </head>
        <body>

            <div class="window">
                <strong>[nick@linuxpro /home/project]$ tree</strong>
                <br><br>

                <details open>
                    <summary>src</summary>
                    
                    <details>
                        <summary>components</summary>
                        <span class="file" style="color: #ce9178;">Header.html</span>
                        <span class="file" style="color: #ce9178;">Footer.html</span>
                    </details>

                    <span class="file" style="color: #4fc1ff;">main.js</span>
                    <span class="file" style="color: #dcdcaa;">index.html</span>
                </details>

                <details>
                    <summary>scripts</summary>
                    <span class="file" style="color: #4ec9b0; font-weight: bold;">deploy.sh</span>
                    <span class="file" style="color: #4ec9b0; font-weight: bold;">backup.py</span>
                </details>

                <details>
                    <summary>config</summary>
                    <span class="file" style="color: #d7ba7d;">settings.conf</span>
                    <span class="file" style="color: #d7ba7d;">.gitignore</span>
                </details>

                <div id="status-bar">
                    Total Directories: <span id="dir-count">4</span> | 
                    Files: <span id="file-count">7</span>
                </div>
            </div>

            <script>
                const folders = document.querySelectorAll('details').length;
                const files = document.querySelectorAll('.file').length;
                
                // Update the HTML content via JS
                document.getElementById('dir-count').innerText = folders;
                document.getElementById('file-count').innerText = files;

                // Interactive "click" console log
                document.querySelectorAll('.file').forEach(file => {
                    file.onclick = () => {
                        alert("Opening " + file.innerText + " in vim...");
                    };
                });
            </script>
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
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>CyberTop | Linux System Monitor</title>
            <style>
                body {
                    background-color: #0d0d0d;
                    color: #00ff41; /* Classic Matrix/Terminal green */
                    font-family: 'Courier New', Courier, monospace;
                    display: flex;
                    flex-direction: column;
                    align-items: center;
                    justify-content: center;
                    height: 100vh;
                    margin: 0;
                    padding-top:250px;
                }

                .terminal-box {
                    border: 2px solid #333;
                    padding: 20px;
                      
                    background: #1a1a1a;
                    box-shadow: 0 0 20px rgba(0, 255, 65, 0.2);
                    width: 80%;
                      margin: 12px;
                }

                h2 { border-bottom: 1px solid #333; padding-bottom: 10px; }

                .stat-row { margin: 20px 0; }

                .progress-bg {
                    background-color: #333;
                    height: 12px;
                    width: 100%;
                    border-radius: 6px;
                    overflow: hidden;
                    margin-top: 5px;
                }

                .progress-fill {
                    height: 100%;
                    background-color: #00ff41;
                    transition: width 0.5s ease-in-out;
                }

                #log {
                    font-size: 0.8rem;
                    color: #888;
                    height: 50px;
                    overflow: hidden;
                }
            </style>
        </head>
        <body>

            <div class="terminal-box">
                <h2>[root@system ~]# status</h2>
                
                <div class="stat-row">
                    <label>CPU Usage: <span id="cpu-val">0</span>%</label>
                    <div class="progress-bg">
                        <div id="cpu-bar" class="progress-fill" style="width: 0%;"></div>
                    </div>
                </div>

                <div class="stat-row">
                    <label>RAM Usage: <span id="ram-val">0</span>%</label>
                    <div class="progress-bg">
                        <div id="ram-bar" class="progress-fill" style="width: 0%; background-color: #008f11;"></div>
                    </div>
                </div>

                <div id="log">> Initializing kernel modules...<br>> System active.</div>
            </div>

            <script>
                function updateStats() {
                    // Generate random numbers to simulate system activity
                    const cpu = Math.floor(Math.random() * 100);
                    const ram = Math.floor(Math.random() * 40) + 30; // RAM stays more stable

                    // Update Text
                    document.getElementById('cpu-val').innerText = cpu;
                    document.getElementById('ram-val').innerText = ram;

                    // Update Inline Styles for the bars
                    document.getElementById('cpu-bar').style.width = cpu + "%";
                    document.getElementById('ram-bar').style.width = ram + "%";

                    // Add a little color logic via JS
                    if(cpu > 80) {
                        document.getElementById('cpu-bar').style.backgroundColor = "#ff3e3e";
                    } else {
                        document.getElementById('cpu-bar').style.backgroundColor = "#00ff41";
                    }
                }

                // Run every 1.5 seconds
                setInterval(updateStats, 1500);
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
    <title>Smart Expense Tracker</title>

    <style>
    body{
      font-family:Arial;
      background:#0f172a;
      padding:20px;
    }

    .app{
      max-width:420px;
      margin:auto;
      background:white;
      padding:16px;
      border-radius:16px;
      box-shadow:0 10px 30px rgba(0,0,0,.3);
    }

    h2{
      text-align:center;
      color:#2563eb;
    }

    input{
      width:100%;
      padding:10px;
      margin-top:8px;
      border-radius:8px;
      border:1px solid #ccc;
    }

    button{
      margin-top:10px;
      width:100%;
      padding:10px;
      border:none;
      background:#2563eb;
      color:white;
      border-radius:8px;
    }

    .item{
      display:flex;
      justify-content:space-between;
      align-items:center;
      background:#eef2ff;
      padding:8px;
      margin-top:8px;
      border-radius:6px;
    }

    .total{
      text-align:center;
      font-size:20px;
      margin-top:12px;
      font-weight:bold;
    }

    .small{
      text-align:center;
      color:#555;
      font-size:12px;
    }
    </style>

    </head>

    <body>

    <div class="app">

    <h2>Expense Tracker</h2>

    <input id="title" placeholder="Expense name">

    <input id="amount" type="number" placeholder="Amount">

    <button onclick="addExpense()">Add Expense</button>

    <div id="list"></div>

    <div class="total">
    Total: Ksh <span id="total">0</span>
    </div>

    <p class="small">Track daily spending</p>

    </div>

    <script>

    let total = 0;

    function addExpense(){

      let title = document.getElementById("title").value;
      let amount = Number(document.getElementById("amount").value);

      if(title=="" || amount<=0){
        alert("Fill both fields");
        return;
      }

      let row = document.createElement("div");
      row.className="item";

      let name = document.createElement("span");
      name.innerText = title;

      let price = document.createElement("span");
      price.innerText = "Ksh " + amount;

      let del = document.createElement("button");
      del.innerText="X";
      del.style.width="40px";
      del.style.background="#dc2626";

      del.onclick=function(){
        total -= amount;
        document.getElementById("total").innerText = total;
        row.remove();
      }

      row.appendChild(name);
      row.appendChild(price);
      row.appendChild(del);

      document.getElementById("list").appendChild(row);

      total += amount;
      document.getElementById("total").innerText = total;

      document.getElementById("title").value="";
      document.getElementById("amount").value="";
    }

    </script>

    </body>
    </html>
""".trimIndent()

    fun getAllProjects(): List<WebProject> = listOf(
        WebProject(8, "TermiTree", "mimics a Linux file system hierarchy", "🌳", gal),
        WebProject(31, "Horizon Travel ", "Peak Horizon Travel Brochure", "🧭", Voice),
        WebProject(6, "Glass", "The Interactive Glass Credit Card", "💳", tipCalcCode),
        WebProject(21, "Heavenly", "The Celestial Audio Interface", "🎧", askher),
        WebProject(32, "Runner", "Cyber-Runner", "🏃", game),
        WebProject(3, "Solar", "Solar System", "🪐", birdgn),
        WebProject(13, "Night Goodnight", "Good night message", "🌌", nightgn),
        WebProject(15, "Restaurant Menu", "One-Page Restaurant Menu + Order Form", "🍽️", quizgen),
        WebProject(4, "Expense Tracker", "Add expenses (name + amount)", "💰", product),
        WebProject(5, "Spellbook", "Magic Spellbook Page", "📜", passwordGenCode),
        WebProject(18, "CyberTop", "simulates CPU, RAM, and Disk usage", "🖥️", notes),
        WebProject(10, "Simple Form", "A simple form", "📝", form),
        WebProject(14, "Santa", "Santa dancing", "🎅", santa),
        WebProject(16, "Counter App", "Counter App", "🔢", counterApp),
        WebProject(11, "Goodnight", "Good night message", "🌙", goodnight),
//        WebProject(12, "Digital Clock", "Neon glow clock", "⏰", clockdigital),
//        WebProject(19, "Student List", "Student List using map()", "🎓", studentlist),
//        WebProject(20, "Product Filter", "Product filter using filter()", "🛍️", product),
        WebProject(1, "Nature love", "Nature Field Journal Page", "🌿", gameBerry),
        WebProject(7, "Todo List", "To do list web", "📋", smartTask),
        WebProject(2, "Calculator", "Full math interface", "🧮", calculatorCode),
        WebProject(9, "Color Generator", "Theme and color generator", "🎨", colors),

    )



}