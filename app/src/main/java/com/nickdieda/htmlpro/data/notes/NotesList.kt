package com.nickdieda.htmlpro.data.notes

import com.nickdieda.htmlpro.data.model.Headline
import com.nickdieda.htmlpro.data.model.NoteModule
import com.nickdieda.htmlpro.data.model.QuizQuestion
import com.nickdieda.htmlpro.data.model.Subtopic

val HtmlNotes = mutableListOf(
    NoteModule(
        topic = "HTML5 Basics",
        topicId=0,
        subtopics = listOf(

            Subtopic(
                sutopicId=1,
                subTopicName = "HTML Intro",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML5",
                        majorHeadileExplanation = "Explain breifly" ,
                        headline = "Importance of HTML",
                        explaination = "Explain",
                       tip = "give tip"
                    ),
                    Headline(
                        headline = "Why Use This App?",
                        explaination = "explain how this app is easy to use ,notes,Try it Out code examples,tips, quiz and certificate ,offline compiler, samples projects ,save to storage and all that",
                        codeExample = "give runnable html example with html structure",
                        afterCodeEplainations = "Explain",
                        ),

                            Headline(
                                headline = "Give other(s) Headline",
                                explaination = "explain ",
                                codeExample = "",
                                afterCodeEplainations = "Explain",

                ),
                questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                    QuizQuestion(
                        "Question",
                        listOf(
                           "options"
                        ),
                        number of correct ans
                    )


                )
                )

            ) ,
            Subtopic(
                sutopicId=2,
                subTopicName = "HTML Compiler",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Where to code HTML files",
                        majorHeadileExplanation = "Explain with examples",
                        headline = "Saving HTML file",
                        explaination = "Explain how , extension and say that this app allows saving to",
                        codeExample ="give code example that user can save ",
                        tip = "give",
                        afterCodeEplainations = "explain how the user can save the html on this app by clicking the menu at the top and click save as or save or open saved "
                    ),
                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "",
                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )

            ),


                // --- SUBTOPIC 2: WRITING & INTEGRATING JS ---
                Subtopic(
                    sutopicId = 2,
                    subTopicName = "JS Writing Code",
                    headlines = listOf(
                        Headline(
                            headline = "The <script> Tag",
                            explaination = "JavaScript is executed by the browser's engine. To run it, code is either embedded directly into HTML or linked as an external script using the <script> tag. This tag tells the browser to pause HTML parsing and execute the logic inside.",
                            codeExample = "<script>\n  console.log('Writing JS directly in HTML!');\n</script>",
                            afterCodeEplainations = "Browsers read files from top to bottom, executing scripts as they are encountered."
                        ),
                        Headline(
                            headline = "Internal JS & Placement",
                            explaination = "Internal JS lives inside your HTML file. If placed in the <head>, it loads early but can slow down visual rendering. If placed at the bottom of the <body>, the page structure loads first, which is a common performance optimization.",
                            codeExample = "<body>\n  <h1 id='title'>Hello</h1>\n  <script>\n    // This runs after the <h1> is created\n    console.log('Body script executed');\n  </script>\n</body>",
                            tip = "Placing scripts in the head might cause errors if the script tries to access HTML elements that haven't been created yet."
                        ),
                        Headline(
                            headline = "External JS (.js Files)",
                            explaination = "For production, code is kept in separate .js files. This promotes 'Separation of Concerns' and allows browsers to cache the file, similar to how Linux shared libraries (.so files) save memory by being reused.",
                            codeExample = "// In HTML: <script src='script.js'></script>\n\n// In script.js:\nfunction init() {\n  console.log('External app started');\n}",
                            afterCodeEplainations = "The 'src' attribute acts like a file path, pointing the browser to the logic's location."
                        ),
                        Headline(
                            headline = "The Render Process & Parser Blocking",
                            explaination = "When a browser hits a script tag without special attributes, it stops building the page to download and run it. This is 'parser blocking'—think of it like a sequential bash script where command B must wait for A.",
                            codeExample = "<script src='heavy-library.js'></script>",
                            afterCodeEplainations = "Large scripts can make a site feel 'frozen' during this download phase."
                        ),
                        Headline(
                            headline = "Modern Loading: Async & Defer",
                            explaination = "Modern JS uses 'async' and 'defer' to prevent blocking. 'Defer' downloads the script in the background and executes it only after the HTML is fully parsed. This is currently the industry standard.",
                            codeExample = "<script src='app.js' defer></script>",
                            tip = "Always use 'defer' for external scripts in the <head> to get the best performance and avoid null errors."
                        ),
                        Headline(
                            headline = "Modern Module System",
                            explaination = "Today we use 'type=module' to organize code into pieces that can import/export functionality. Modules automatically use 'strict mode' to prevent common coding errors.",
                            codeExample = "<script type='module' src='main.js'></script>"
                        )
                    ),
                    questions = listOf(
                        QuizQuestion("Which tag is used for JavaScript?", listOf("<js>", "<script>", "<javascript>", "<code_js>"), 1),
                        QuizQuestion("What is the best location for scripts for performance?", listOf("In the <head>", "Before the <html> tag", "At the bottom of the <body>", "Inside a <div>"), 2),
                        QuizQuestion("Which attribute links an external JS file?", listOf("href", "link", "src", "path"), 2),
                        QuizQuestion("What does the 'defer' attribute do?", listOf("Stops the script", "Hides the script", "Downloads in background and runs after parsing", "Deletes the script"), 2),
                        QuizQuestion("Why is External JS better for performance?", listOf("It is smaller", "It can be cached by the browser", "It runs faster", "It uses less RAM"), 1)
                    )
                ),

                // --- SUBTOPIC 3: DISPLAYING OUTPUT & DEBUGGING ---
                Subtopic(
                    sutopicId = 3,
                    subTopicName = "JS Displaying Output",
                    headlines = listOf(
                        Headline(
                            headline = "Data Visualization Streams",
                            explaination = "JavaScript output means showing results to the user or developer. It can be displayed in the console, dialog boxes, or directly inside HTML elements.",
                            codeExample = "// Different output streams\nconsole.log('For developers');\nalert('For urgent alerts');\ndocument.getElementById('msg').innerHTML = 'For users';"
                        ),
                        Headline(
                            headline = "Using the Console",
                            explaination = "The console is the primary tool for debugging. Beyond log(), you can use console.table() to visualize arrays of data clearly in the browser's DevTools (F12).",
                            codeExample = """
                            const servers = [
                                { name: "Nginx", status: "Active" },
                                { name: "Apache", status: "Down" }
                            ];
                            console.table(servers);
                        """.trimIndent(),
                            afterCodeEplainations = "The output is not visible to website users, making it safe for sensitive debugging info."
                        ),
                        Headline(
                            headline = "Writing to HTML Components",
                            explaination = "JavaScript can change content by selecting an element's ID. You use 'innerHTML' for HTML content or 'textContent' for plain text. Use <br> for line breaks within innerHTML.",
                            codeExample = """
                            <p id="status"></p>
                            <script>
                                document.getElementById("status").innerHTML = "System:<br>Online";
                            </script>
                        """.trimIndent(),
                            tip = "Careful: innerHTML can be a security risk (XSS). Use textContent if you don't need to render HTML tags."
                        ),
                        Headline(
                            headline = "Using Dialog Boxes",
                            explaination = "Dialog boxes like alert(), confirm(), and prompt() are popups. Note that they are 'blocking' operations; they freeze the browser's main thread until the user interacts.",
                            codeExample = "alert('Welcome to the JavaScript Compiler!');"
                        ),
                        Headline(
                            headline = "The Window Object",
                            explaination = "In the browser, 'window' is the global object. This means 'window.alert()' and 'alert()' are identical. It represents the browser window itself.",
                            codeExample = "window.console.log('Global window access');"
                        ),
                        Headline(
                            headline = "Dangerous Output: document.write()",
                            explaination = "JavaScript can write directly to the document stream. However, if document.write() is used after the page has finished loading, it will overwrite the entire HTML document.",
                            codeExample = "function wipe() {\n  document.write('The rest of the page is now gone.');\n}",
                            tip = "Avoid using document.write() in real applications. It is strictly for quick testing."
                        )
                    ),
                    questions = listOf(
                        QuizQuestion("Which method is best for debugging?", listOf("alert()", "console.log()", "document.write()", "window.print()"), 1),
                        QuizQuestion("How do you change the content of an HTML element?", listOf(".innerHTML", ".changeText", ".value", ".setContent"), 0),
                        QuizQuestion("What is a risk of using innerHTML with user input?", listOf("Slow loading", "Security (XSS)", "Color changes", "Syntax errors"), 1),
                        QuizQuestion("What happens if document.write() runs after the page loads?", listOf("Adds text at top", "Does nothing", "Wipes the entire page", "Opens a new tab"), 2),
                        QuizQuestion("Which command prints a table of data?", listOf("console.grid()", "console.table()", "console.view()", "console.list()"), 1)
                    )
                )
                ,




Subtopic(
                sutopicId=4,
                subTopicName = "JS Statements",
                headlines = listOf(

                    Headline(
                        headline = "JS Statements",
                        explaination = "JavaScript statements are instructions that tell the browser what to do. "
                                + "Each statement is executed in the order it is written.",
                        codeExample = """
                let x = 10;
                let y = 20;
                let sum = x + y;
            """.trimIndent(),
                        afterCodeEplainations = "Each line is a separate statement. "
                                + "JavaScript reads and runs them one by one."
                    ),

                    Headline(
                        explaination = "JavaScript statements usually end with a semicolon. "
                                + "The semicolon separates one statement from another.",
                        codeExample = """
                let name = "John";
                let age = 25;
            """.trimIndent()
                    ),

                    Headline(
                        explaination = "JavaScript allows multiple statements in one line, "
                                + "but writing one statement per line makes the code easier to read.",
                        codeExample = """
                let a = 5; let b = 10; let c = a + b;
            """.trimIndent(),
                        tip = "For better readability, always write one statement per line."
                    ),

                    Headline(
                        headline = "Grouping JS Statements",
                        explaination = "JavaScript statements can be grouped together using curly braces {}. "
                                + "Grouped statements are treated as a block of code.",
                        codeExample = """
                if (x > 5) {
                    console.log("x is greater than 5");
                    console.log("This is a block of statements");
                }
            """.trimIndent()
                    ),

                    Headline(
                        headline = "JS Keywords",
                        explaination = "JavaScript keywords are reserved words that have special meanings. "
                                + "They are used to define actions, variables, and control the program flow.",
                        codeExample = """
                let number = 10;

                if (number > 5) {
                    console.log("Number is greater than 5");
                }
            """.trimIndent(),
                        afterCodeEplainations = "`let` and `if` are JavaScript keywords and cannot be used as variable names."
                    )

                ),
    questions = listOf(
        QuizQuestion("What is a JavaScript statement?", listOf("A style rule", "An instruction to the browser", "A type of variable", "A comment"), 1),
        QuizQuestion("Which character is usually used to separate JS statements?", listOf("Colon (:)", "Comma (,)", "Semicolon (;)", "Full stop (.)"), 2),
        QuizQuestion("Is it possible to write multiple statements on one line?", listOf("No, it causes an error", "Yes, but it's not recommended", "Only inside a function", "Only if they are empty"), 1),
        QuizQuestion("What are curly braces {} used for in statements?", listOf("To create a comment", "To group statements into a block", "To multiply numbers", "To end the program"), 1),
        QuizQuestion("In what order are JavaScript statements executed?", listOf("Randomly", "Bottom to top", "In the order they are written", "Alphabetically"), 2)
    )
            ),

            Subtopic(
                sutopicId=5,
                subTopicName = "JS Syntax",questions = listOf(
                    QuizQuestion("Which keyword is used for a variable that should NOT change?", listOf("let", "var", "const", "change"), 2),
                    QuizQuestion("Is JavaScript case-sensitive?", listOf("Yes", "No", "Only for numbers", "Only in Linux"), 0),
                    QuizQuestion("Which is a correct way to declare a variable in modern JS?", listOf("variable x = 5;", "let x = 5;", "set x = 5;", "int x = 5;"), 1),
                    QuizQuestion("If you have 'let Name' and 'let name', how many variables exist?", listOf("One", "Two", "None (error)", "It depends on the browser"), 1),
                    QuizQuestion("What is the naming style 'userName' called?", listOf("snake_case", "PascalCase", "camelCase", "Flatcase"), 2)
                ),
                headlines = listOf(

                    Headline(
                        headline = "JS Syntax?",
                        explaination = "JavaScript syntax refers to the rules that define how JavaScript code is written "
                                + "and structured. Following correct syntax helps the browser understand and execute the code."
                    ),

                    Headline(
                        headline = "Variable Declaration",
                        explaination = "Variable declaration means creating a variable to store data. "
                                + "JavaScript allows variables to be declared using let, const, or var.",
                        codeExample = """
                let name = "John";
                const age = 30;
                var city = "Paris";
            """.trimIndent(),
                        afterCodeEplainations = "`let` is used for values that can change, "
                                + "`const` is used for fixed values, and `var` is an older way to declare variables."
                    ),

                    Headline(
                        headline = "Case Sensitivity",
                        explaination = "JavaScript is case-sensitive, which means uppercase and lowercase letters "
                                + "are treated as different.",
                        codeExample = """
                let userName = "Alice";
                let username = "Bob";
            """.trimIndent(),
                        tip = "Always use consistent naming styles like camelCase to avoid errors."
                    )

                )
            ),





            Subtopic(
                sutopicId=6,
                questions = listOf(
                    QuizQuestion("How do you start a single-line comment in JS?", listOf("/*", "//", "", "/* and */", "[[ and ]]"), 2),
                    QuizQuestion("What happens to comments during program execution?", listOf("They are displayed in console", "They are ignored by the browser", "They make the code run faster", "They cause an error"), 1),
                    QuizQuestion("Why would you use a comment to 'disable' code?", listOf("To make the file smaller", "To test logic without deleting it", "To encrypt the code", "To change the variable type"), 1),
                    QuizQuestion("Can a single-line comment be placed at the end of a statement?", listOf("Yes", "No", "Only inside a block", "Only with const"), 0)
                ),
                subTopicName = "JS Comments",
                headlines = listOf(

                    Headline(
                        headline = "JS Comments",
                        explaination = "JavaScript comments are used to describe the code and make it easier to understand. "
                                + "Comments are ignored by the browser and do not affect program execution."
                    ),

                    Headline(
                        headline = "Single-Line Comments",
                        explaination = "Single-line comments are used to comment only one line of code.",
                        codeExample = """
                // This is a single-line comment
                let x = 10; // This comment explains the variable
            """.trimIndent(),
                        afterCodeEplainations = "Anything written after // is treated as a comment and is not executed."
                    ),

                    Headline(
                        explaination = "Single-line comments are often used for short explanations or notes in the code.",
                        codeExample = ""
                    ),

                    Headline(
                        explaination = "Comments can also be used to explain complex logic or important steps in a program.",
                        tip = "Write clear and meaningful comments, but avoid commenting obvious code.",
                        codeExample = """
                // Calculate total price
                let total = price + tax;
            """.trimIndent()
                    ),

                    Headline(
                        headline = "Multi-Line Comments",
                        explaination = "Multi-line comments are used to comment multiple lines at once.",
                        codeExample = """
                /*
                  This is a multi-line comment
                  It can span multiple lines
                */
            """.trimIndent()
                    ),

                    Headline(
                        headline = "Disabling Code Using Comments",
                        explaination = "Comments can be used to temporarily disable code without deleting it.",
                        codeExample = """
                // console.log("This line will not run");

                /*
                alert("This code is disabled");
                */
            """.trimIndent()
                    )

                )
            ),


                    Subtopic(
                    sutopicId = 7,
                        questions = listOf(
                            QuizQuestion("What is the result of 'let x;' if you log x?", listOf("0", "null", "undefined", "Error"), 2),
                            QuizQuestion("Which operator is used to assign a value to a variable?", listOf("==", "===", "=", ":="), 2),
                            QuizQuestion("What happens if you try to change a 'const' variable?", listOf("It changes successfully", "It resets to zero", "It causes a runtime error", "It creates a new variable"), 2),
                            QuizQuestion("Which is a valid variable name?", listOf("1stUser", "user-name", "_totalAmount", "let"), 2),
                            QuizQuestion("When should you use 'let' instead of 'const'?", listOf("When the value will stay the same", "When the value needs to be updated later", "Only for strings", "Only for numbers"), 1)
                        ),
            subTopicName = "JS Variables",
            headlines = listOf(

                Headline(
                    headline = "JS Variables",
                    explaination = "Variables are used to store data values in JavaScript. "
                            + "A variable can hold different types of data such as numbers or text.",
                    codeExample = "let name;",
                    afterCodeEplainations = "This declares a variable named name without assigning a value."
                ),

                Headline(
                    explaination = "The assignment operator (=) is used to assign a value to a variable.",
                    codeExample = """
                let age = 25;
                let city = "New York";
            """.trimIndent()
                ),

                Headline(
                    explaination = "Variables can store different types of data and their values can be used later in the program.",
                    codeExample = ""
                ),

                Headline(
                    headline = "Undefined Variable",
                    explaination = "A variable that is declared but not assigned a value is called an undefined variable.",
                    codeExample = """
                let x;
                console.log(x);
            """.trimIndent()
                ),

                Headline(
                    headline = "Changing Value",
                    explaination = "The value of a variable can be changed after it is declared.",
                    codeExample = """
                let score = 10;
                score = 20;
            """.trimIndent()
                ),

                Headline(
                    headline = "Constant Variables",
                    explaination = "Constant variables are declared using const and their values cannot be changed.",
                    codeExample = """
                const pi = 3.14;
            """.trimIndent(),
                    afterCodeEplainations = "Trying to change a const variable will cause an error."
                ),

                Headline(
                    explaination = "Use let for values that change and const for values that should stay the same.",
                    tip = "Always prefer const unless you know the value will change.",
                    codeExample = """
                let count = 1;
                const maxLimit = 100;
            """.trimIndent()
                ),

                Headline(
                    headline = "Naming Variables",
                    explaination = "Variable names should be meaningful and describe the data they store."
                ),

                Headline(
                    headline = "Rules for Naming Variables",
                    explaination = "Variable names must start with a letter, underscore (_), or dollar sign ($) "
                            + "and cannot contain spaces.",
                    tip = "Use camelCase for variable names, like userName or totalPrice."
                )

            ),
                    ),



                Subtopic(
                sutopicId = 8,
                    questions = listOf(
                        QuizQuestion("What keyword is used to create a function?", listOf("method", "function", "def", "routine"), 1),
                        QuizQuestion("How do you 'call' a function named 'myFunc'?", listOf("call myFunc", "myFunc[]", "myFunc()", "run(myFunc)"), 2),
                        QuizQuestion("What does the 'return' statement do?", listOf("Restarts the function", "Exits the function and sends back a value", "Repeats the code", "Deletes the variable"), 1),
                        QuizQuestion("A variable declared inside a function is:", listOf("Global", "Local (Function Scope)", "Shared", "Permanent"), 1),
                        QuizQuestion("What happens if you define a function but never call it?", listOf("The code runs once", "The browser crashes", "The code inside never executes", "It runs automatically"), 2)
                    ),
        subTopicName = "JS Functions",

        headlines = listOf(

            Headline(
                headline = "JS Functions",
                explaination = "Functions are blocks of code designed to perform a specific task. "
                        + "They help organize code and avoid repetition."
            ),

            Headline(
                headline = "Function Definition",
                explaination = "A function definition creates a function using the function keyword, "
                        + "a name, and parentheses.",
                tip = "Choose clear and meaningful function names.",
                codeExample = """
                function greet() {
                    console.log("Hello!");
                }
            """.trimIndent(),
                afterCodeEplainations = "This defines a function named greet, but it will not run until called."
            ),

            Headline(
                explaination = "Functions can contain one or more statements inside their body.",
                codeExample = ""
            ),

            Headline(
                explaination = "Functions can be reused many times in a program.",
                codeExample = ""
            ),

            Headline(
                headline = "Calling a Function",
                explaination = "Calling a function means executing the code inside the function.",
                codeExample = """
                greet();
            """.trimIndent(),
                afterCodeEplainations = "This line runs the greet function."
            ),

            Headline(
                explaination = "A function can be called multiple times whenever needed.",
                codeExample = ""
            ),

            Headline(
                headline = "The return Statement",
                explaination = "The return statement sends a value back from the function.",
                codeExample = """
                function add(a, b) {
                    return a + b;
                }
            """.trimIndent(),
                afterCodeEplainations = "The function returns the result of a + b."
            ),

            Headline(
                explaination = "Returned values can be stored in variables.",
                codeExample = """
                let result = add(5, 3);
            """.trimIndent()
            ),

            Headline(
                explaination = "Once return is executed, the function stops running.",
                codeExample = ""
            ),

            Headline(
                explaination = "Not all functions need to return a value.",
                tip = "Use return only when you need a result from the function.",
                codeExample = ""
            ),

            Headline(
                headline = "Function Scope",
                explaination = "Variables declared inside a function can only be used within that function.",
                codeExample = """
                function test() {
                    let x = 10;
                    console.log(x);
                }
            """.trimIndent()
            ),

            Headline(
                headline = "Global Vaiables",
                explaination = "Global variables are declared outside functions and can be accessed anywhere in the code.",
                codeExample = """
                let message = "Hello";

                function showMessage() {
                    console.log(message);
                }
            """.trimIndent()
            ),

            Headline(
                headline = "Why Use Functions",
                explaination = "Functions make code reusable, organized, and easier to maintain.",
                tip = "Break large programs into smaller functions.",
                codeExample = """
                function calculateTotal(price, tax) {
                    return price + tax;
                }
            """.trimIndent(),
                afterCodeEplainations = "This function can be reused whenever total calculation is needed."
            )

        )
    ),




            Subtopic(
                sutopicId = 9,
                questions = listOf(
                    QuizQuestion("Which event fires when a user clicks an HTML element?", listOf("onhover", "onclick", "onpress", "onchange"), 1),
                    QuizQuestion("What is the modern method to attach an event handler?", listOf("on()", "attachEvent()", "addEventListener()", "setEvent()"), 2),
                    QuizQuestion("How do you prevent a form from refreshing the page on submit?", listOf("e.stop()", "e.preventDefault()", "e.halt()", "e.ignore()"), 1),
                    QuizQuestion("Which event fires as soon as the HTML is loaded but before images load?", listOf("onload", "DOMReady", "DOMContentLoaded", "onfinish"), 2),
                    QuizQuestion("What is the difference between 'focus' and 'blur'?", listOf("There is no difference", "Focus is entering a field, blur is leaving it", "Focus is for buttons, blur is for text", "Blur happens only on scroll"), 1),
                    QuizQuestion("Which event tracks every single keystroke in an input?", listOf("change", "submit", "input", "blur"), 2),
                    QuizQuestion("What does 'window.scrollY' tell you during a scroll event?", listOf("The width of the page", "The vertical distance scrolled in pixels", "The speed of scrolling", "The number of elements on screen"), 1)
                ),
                subTopicName = "JS Events",
                headlines = listOf(
                    Headline(
                        headline = "JS Events",
                        explaination = "JavaScript events are actions that happen in the browser, such as clicking a button, typing on the keyboard, or loading a page.",
                        codeExample = """
                <button onclick="showAlert()">Click Me</button>
                <script>
                    function showAlert() {
                        alert("Button clicked!");
                    }
                </script>
            """.trimIndent(),
                        afterCodeEplainations = "The function runs when the button is clicked."
                    ),

                    Headline(
                        headline = "Inline Event Handlers",
                        explaination = "Inline event handlers are written directly inside HTML elements using attributes like onclick or onmouseover.",
                        codeExample = """
                <button onclick="alert('Hello!')">Click</button>
            """.trimIndent(),
                        afterCodeEplainations = "Inline events are easy to use but not recommended for large applications as they mix logic with structure."
                    ),

                    Headline(
                        headline = "The addEventListener() Method",
                        explaination = "addEventListener() is the modern way to attach event handlers. It allows multiple listeners for a single event.",
                        codeExample = """
                <button id="btn">Click Me</button>
                <script>
                    document.getElementById("btn")
                        .addEventListener("click", () => {
                            alert("Modern click handler!");
                        });
                </script>
            """.trimIndent(),
                        afterCodeEplainations = "This method keeps JavaScript separate from HTML and is easier to maintain."
                    ),

                    Headline(
                        headline = "The DOMContentLoaded Event",
                        explaination = "This event fires when the HTML document has been completely loaded and parsed, without waiting for images or stylesheets.",
                        codeExample = """
                <script>
                    document.addEventListener("DOMContentLoaded", () => {
                        console.log("DOM is ready, you can now manipulate elements!");
                    });
                </script>
            """.trimIndent()
                    ),

                    Headline(
                        headline = "The input Event",
                        explaination = "Unlike 'change', the 'input' event fires immediately every time the value of an element changes.",
                        codeExample = """
                <input type="text" id="myInput">
                <p id="output"></p>
                <script>
                    document.getElementById("myInput").addEventListener("input", (e) => {
                        document.getElementById("output").innerText = e.target.value;
                    });
                </script>
            """.trimIndent()
                    ),

                    Headline(
                        headline = "Mouse Events: mousedown & mouseup",
                        explaination = "These track the exact moments a mouse button is pressed down and then released.",
                        codeExample = """
                <button id="holdBtn">Hold Me</button>
                <script>
                    const btn = document.getElementById("holdBtn");
                    btn.addEventListener("mousedown", () => btn.innerText = "Pressed!");
                    btn.addEventListener("mouseup", () => btn.innerText = "Released!");
                </script>
            """.trimIndent()
                    ),

                    Headline(
                        headline = "The keydown Event",
                        explaination = "The keydown event occurs the moment a key is pressed. It is more reliable than keypress for non-character keys.",
                        codeExample = """
                <script>
                    window.addEventListener("keydown", (event) => {
                        console.log("Key pressed: " + event.key);
                    });
                </script>
            """.trimIndent()
                    ),

                    Headline(
                        headline = "The submit Event",
                        explaination = "This event occurs when a form is submitted. It is usually used to validate data or prevent the page from refreshing.",
                        codeExample = """
                <form id="myForm">
                    <input type="text" required>
                    <button type="submit">Send</button>
                </form>
                <script>
                    document.getElementById("myForm").addEventListener("submit", (e) => {
                        e.preventDefault(); // Stops the page from refreshing
                        alert("Form submitted safely!");
                    });
                </script>
            """.trimIndent()
                    ),

                    Headline(
                        headline = "The focus and blur Events",
                        explaination = "Focus happens when you enter an input field; blur happens when you leave it.",
                        codeExample = """
                <input type="text" id="fld" placeholder="Focus me">
                <script>
                    const fld = document.getElementById("fld");
                    fld.onfocus = () => fld.style.border = "2px solid blue";
                    fld.onblur = () => fld.style.border = "1px solid gray";
                </script>
            """.trimIndent()
                    ),

                    Headline(
                        headline = "The scroll Event",
                        explaination = "The scroll event fires when the document view or an element has been scrolled.",
                        codeExample = """
                <script>
                    window.onscroll = () => {
                        console.log("You are scrolling at: " + window.scrollY + "px");
                    };
                </script>
            """.trimIndent(),
                        tip = "Use 'throttling' or 'debouncing' with scroll events to maintain browser performance."
                    ),

                    Headline(
                        headline = "The contextmenu Event",
                        explaination = "This event fires when the user attempts to open a context menu (usually by right-clicking).",
                        codeExample = """
                <div style="background: lightgray; height: 50px;">Right-click here</div>
                <script>
                    document.addEventListener("contextmenu", (e) => {
                        e.preventDefault();
                        alert("Right-click is disabled!");
                    });
                </script>
            """.trimIndent()
                    )
                )
            )









            ),
            Subtopic(
                    sutopicId=3,
            subTopicName = "Elements",
            headlines = listOf(
                Headline(
                    majorHeadline = "HTML Elements",
                    majorHeadileExplanation = "Explain breifly" ,
                    codeExample = "give a runnable involving html element ",
                    afterCodeEplainations = "Explain it opening and closing",

                    tip = "give tip"
                ),
                Headline(
                    headline = "Nested Elements",
                    explaination = "",
                    codeExample = "give runnable html example with nested elements",
                    afterCodeEplainations = "Explain giving example of other html element commonly used and thier names ",
                ),
                Headline(
                    headline = "Single or empty elements",
                    explaination = "explain ",
                    codeExample = "",
                    afterCodeEplainations = "Explain giving example of other html element commonly used and thier names "
                    ),

                Headline(
                    headline = "Give other(s) Headline",
                    explaination = "explain ",
                    codeExample = "",
                    afterCodeEplainations = "Explain",

                    ),
                questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                    QuizQuestion(
                        "Question",
                        listOf(
                            "options"
                        ),
                        number of correct ans
                    )


                )
            )

        ),
            Subtopic(
            sutopicId=4,
            subTopicName = "HTML Attributes",
            headlines = listOf(
                Headline(
                    majorHeadline = "HTML Attributes",
                    majorHeadileExplanation = "Explain ",
                    headline = "Information About Attributes",
                    explaination = "Explain how , explain most important information about attributes well and what things attribut have ",
                    codeExample ="give a runnable code example with attributes you can use comment to explain inside the code",
                    tip = "give",
                    afterCodeEplainations = ""
                ),
                Headline(
                    headline = "href attribute",
                    explaination = "explain ",
                    codeExample = "",
                    afterCodeEplainations = "Explain",

                    ),
                Headline(
                    explaination = "explain ",
                    codeExample = "",

                ),
                Headline(
                    headline = "link",
                    explaination = "explain ",
                    codeExample = "",
                    afterCodeEplainations = "Explain",

                    ),
                Headline(
                    headline = "style attribute",
                    explaination = "explain ",
                    codeExample = "",
                    afterCodeEplainations = "Explain",

                    ),
                Headline(
                    explaination = "explain ",
                    codeExample = "",

                    ),
                Headline(
                    headline = "title",
                    explaination = "explain ",
                    codeExample = "",
                    afterCodeEplainations = "Explain",

                    ),
                Headline(
                    headline = "id attribute",
                    explaination = "explain ",
                    codeExample = "",
                    afterCodeEplainations = "Explain",

                    ),
                Headline(
                    explaination = "explain ",
                    codeExample = "",

                    ),
                Headline(
                    headline = "class ",
                    explaination = "explain ",
                    codeExample = "",
                    afterCodeEplainations = "Explain",

                    ),
                Headline(
                    headline = " lang",
                    explaination = "explain ",
                    codeExample = "",
                    afterCodeEplainations = "Explain",

                    ), //add more Headlines with diffent commonly used attributes
                questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                    QuizQuestion(
                        "Question",
                        listOf(
                            "options"
                        ),
                        number of correct ans
                    )


                )

            ),


            // --- SUBTOPIC 2: WRITING & INTEGRATING JS ---
            Subtopic(
                sutopicId = 2,
                subTopicName = "JS Writing Code",
                headlines = listOf(
                    Headline(
                        headline = "The <script> Tag",
                        explaination = "JavaScript is executed by the browser's engine. To run it, code is either embedded directly into HTML or linked as an external script using the <script> tag. This tag tells the browser to pause HTML parsing and execute the logic inside.",
                        codeExample = "<script>\n  console.log('Writing JS directly in HTML!');\n</script>",
                        afterCodeEplainations = "Browsers read files from top to bottom, executing scripts as they are encountered."
                    ),
                    Headline(
                        headline = "Internal JS & Placement",
                        explaination = "Internal JS lives inside your HTML file. If placed in the <head>, it loads early but can slow down visual rendering. If placed at the bottom of the <body>, the page structure loads first, which is a common performance optimization.",
                        codeExample = "<body>\n  <h1 id='title'>Hello</h1>\n  <script>\n    // This runs after the <h1> is created\n    console.log('Body script executed');\n  </script>\n</body>",
                        tip = "Placing scripts in the head might cause errors if the script tries to access HTML elements that haven't been created yet."
                    ),
                    Headline(
                        headline = "External JS (.js Files)",
                        explaination = "For production, code is kept in separate .js files. This promotes 'Separation of Concerns' and allows browsers to cache the file, similar to how Linux shared libraries (.so files) save memory by being reused.",
                        codeExample = "// In HTML: <script src='script.js'></script>\n\n// In script.js:\nfunction init() {\n  console.log('External app started');\n}",
                        afterCodeEplainations = "The 'src' attribute acts like a file path, pointing the browser to the logic's location."
                    ),
                    Headline(
                        headline = "The Render Process & Parser Blocking",
                        explaination = "When a browser hits a script tag without special attributes, it stops building the page to download and run it. This is 'parser blocking'—think of it like a sequential bash script where command B must wait for A.",
                        codeExample = "<script src='heavy-library.js'></script>",
                        afterCodeEplainations = "Large scripts can make a site feel 'frozen' during this download phase."
                    ),
                    Headline(
                        headline = "Modern Loading: Async & Defer",
                        explaination = "Modern JS uses 'async' and 'defer' to prevent blocking. 'Defer' downloads the script in the background and executes it only after the HTML is fully parsed. This is currently the industry standard.",
                        codeExample = "<script src='app.js' defer></script>",
                        tip = "Always use 'defer' for external scripts in the <head> to get the best performance and avoid null errors."
                    ),
                    Headline(
                        headline = "Modern Module System",
                        explaination = "Today we use 'type=module' to organize code into pieces that can import/export functionality. Modules automatically use 'strict mode' to prevent common coding errors.",
                        codeExample = "<script type='module' src='main.js'></script>"
                    )
                ),
                questions = listOf(
                    QuizQuestion("Which tag is used for JavaScript?", listOf("<js>", "<script>", "<javascript>", "<code_js>"), 1),
                    QuizQuestion("What is the best location for scripts for performance?", listOf("In the <head>", "Before the <html> tag", "At the bottom of the <body>", "Inside a <div>"), 2),
                    QuizQuestion("Which attribute links an external JS file?", listOf("href", "link", "src", "path"), 2),
                    QuizQuestion("What does the 'defer' attribute do?", listOf("Stops the script", "Hides the script", "Downloads in background and runs after parsing", "Deletes the script"), 2),
                    QuizQuestion("Why is External JS better for performance?", listOf("It is smaller", "It can be cached by the browser", "It runs faster", "It uses less RAM"), 1)
                )
            ),

            // --- SUBTOPIC 3: DISPLAYING OUTPUT & DEBUGGING ---
            Subtopic(
                sutopicId = 3,
                subTopicName = "JS Displaying Output",
                headlines = listOf(
                    Headline(
                        headline = "Data Visualization Streams",
                        explaination = "JavaScript output means showing results to the user or developer. It can be displayed in the console, dialog boxes, or directly inside HTML elements.",
                        codeExample = "// Different output streams\nconsole.log('For developers');\nalert('For urgent alerts');\ndocument.getElementById('msg').innerHTML = 'For users';"
                    ),
                    Headline(
                        headline = "Using the Console",
                        explaination = "The console is the primary tool for debugging. Beyond log(), you can use console.table() to visualize arrays of data clearly in the browser's DevTools (F12).",
                        codeExample = """
                            const servers = [
                                { name: "Nginx", status: "Active" },
                                { name: "Apache", status: "Down" }
                            ];
                            console.table(servers);
                        """.trimIndent(),
                        afterCodeEplainations = "The output is not visible to website users, making it safe for sensitive debugging info."
                    ),
                    Headline(
                        headline = "Writing to HTML Components",
                        explaination = "JavaScript can change content by selecting an element's ID. You use 'innerHTML' for HTML content or 'textContent' for plain text. Use <br> for line breaks within innerHTML.",
                        codeExample = """
                            <p id="status"></p>
                            <script>
                                document.getElementById("status").innerHTML = "System:<br>Online";
                            </script>
                        """.trimIndent(),
                        tip = "Careful: innerHTML can be a security risk (XSS). Use textContent if you don't need to render HTML tags."
                    ),
                    Headline(
                        headline = "Using Dialog Boxes",
                        explaination = "Dialog boxes like alert(), confirm(), and prompt() are popups. Note that they are 'blocking' operations; they freeze the browser's main thread until the user interacts.",
                        codeExample = "alert('Welcome to the JavaScript Compiler!');"
                    ),
                    Headline(
                        headline = "The Window Object",
                        explaination = "In the browser, 'window' is the global object. This means 'window.alert()' and 'alert()' are identical. It represents the browser window itself.",
                        codeExample = "window.console.log('Global window access');"
                    ),
                    Headline(
                        headline = "Dangerous Output: document.write()",
                        explaination = "JavaScript can write directly to the document stream. However, if document.write() is used after the page has finished loading, it will overwrite the entire HTML document.",
                        codeExample = "function wipe() {\n  document.write('The rest of the page is now gone.');\n}",
                        tip = "Avoid using document.write() in real applications. It is strictly for quick testing."
                    )
                ),
                questions = listOf(
                    QuizQuestion("Which method is best for debugging?", listOf("alert()", "console.log()", "document.write()", "window.print()"), 1),
                    QuizQuestion("How do you change the content of an HTML element?", listOf(".innerHTML", ".changeText", ".value", ".setContent"), 0),
                    QuizQuestion("What is a risk of using innerHTML with user input?", listOf("Slow loading", "Security (XSS)", "Color changes", "Syntax errors"), 1),
                    QuizQuestion("What happens if document.write() runs after the page loads?", listOf("Adds text at top", "Does nothing", "Wipes the entire page", "Opens a new tab"), 2),
                    QuizQuestion("Which command prints a table of data?", listOf("console.grid()", "console.table()", "console.view()", "console.list()"), 1)
                )
            )
            ,




            Subtopic(
                sutopicId=4,
                subTopicName = "JS Statements",
                headlines = listOf(

                    Headline(
                        headline = "JS Statements",
                        explaination = "JavaScript statements are instructions that tell the browser what to do. "
                                + "Each statement is executed in the order it is written.",
                        codeExample = """
                let x = 10;
                let y = 20;
                let sum = x + y;
            """.trimIndent(),
                        afterCodeEplainations = "Each line is a separate statement. "
                                + "JavaScript reads and runs them one by one."
                    ),

                    Headline(
                        explaination = "JavaScript statements usually end with a semicolon. "
                                + "The semicolon separates one statement from another.",
                        codeExample = """
                let name = "John";
                let age = 25;
            """.trimIndent()
                    ),

                    Headline(
                        explaination = "JavaScript allows multiple statements in one line, "
                                + "but writing one statement per line makes the code easier to read.",
                        codeExample = """
                let a = 5; let b = 10; let c = a + b;
            """.trimIndent(),
                        tip = "For better readability, always write one statement per line."
                    ),

                    Headline(
                        headline = "Grouping JS Statements",
                        explaination = "JavaScript statements can be grouped together using curly braces {}. "
                                + "Grouped statements are treated as a block of code.",
                        codeExample = """
                if (x > 5) {
                    console.log("x is greater than 5");
                    console.log("This is a block of statements");
                }
            """.trimIndent()
                    ),

                    Headline(
                        headline = "JS Keywords",
                        explaination = "JavaScript keywords are reserved words that have special meanings. "
                                + "They are used to define actions, variables, and control the program flow.",
                        codeExample = """
                let number = 10;

                if (number > 5) {
                    console.log("Number is greater than 5");
                }
            """.trimIndent(),
                        afterCodeEplainations = "`let` and `if` are JavaScript keywords and cannot be used as variable names."
                    )

                ),
                questions = listOf(
                    QuizQuestion("What is a JavaScript statement?", listOf("A style rule", "An instruction to the browser", "A type of variable", "A comment"), 1),
                    QuizQuestion("Which character is usually used to separate JS statements?", listOf("Colon (:)", "Comma (,)", "Semicolon (;)", "Full stop (.)"), 2),
                    QuizQuestion("Is it possible to write multiple statements on one line?", listOf("No, it causes an error", "Yes, but it's not recommended", "Only inside a function", "Only if they are empty"), 1),
                    QuizQuestion("What are curly braces {} used for in statements?", listOf("To create a comment", "To group statements into a block", "To multiply numbers", "To end the program"), 1),
                    QuizQuestion("In what order are JavaScript statements executed?", listOf("Randomly", "Bottom to top", "In the order they are written", "Alphabetically"), 2)
                )
            ),

            Subtopic(
                sutopicId=5,
                subTopicName = "JS Syntax",questions = listOf(
                    QuizQuestion("Which keyword is used for a variable that should NOT change?", listOf("let", "var", "const", "change"), 2),
                    QuizQuestion("Is JavaScript case-sensitive?", listOf("Yes", "No", "Only for numbers", "Only in Linux"), 0),
                    QuizQuestion("Which is a correct way to declare a variable in modern JS?", listOf("variable x = 5;", "let x = 5;", "set x = 5;", "int x = 5;"), 1),
                    QuizQuestion("If you have 'let Name' and 'let name', how many variables exist?", listOf("One", "Two", "None (error)", "It depends on the browser"), 1),
                    QuizQuestion("What is the naming style 'userName' called?", listOf("snake_case", "PascalCase", "camelCase", "Flatcase"), 2)
                ),
                headlines = listOf(

                    Headline(
                        headline = "JS Syntax?",
                        explaination = "JavaScript syntax refers to the rules that define how JavaScript code is written "
                                + "and structured. Following correct syntax helps the browser understand and execute the code."
                    ),

                    Headline(
                        headline = "Variable Declaration",
                        explaination = "Variable declaration means creating a variable to store data. "
                                + "JavaScript allows variables to be declared using let, const, or var.",
                        codeExample = """
                let name = "John";
                const age = 30;
                var city = "Paris";
            """.trimIndent(),
                        afterCodeEplainations = "`let` is used for values that can change, "
                                + "`const` is used for fixed values, and `var` is an older way to declare variables."
                    ),

                    Headline(
                        headline = "Case Sensitivity",
                        explaination = "JavaScript is case-sensitive, which means uppercase and lowercase letters "
                                + "are treated as different.",
                        codeExample = """
                let userName = "Alice";
                let username = "Bob";
            """.trimIndent(),
                        tip = "Always use consistent naming styles like camelCase to avoid errors."
                    )

                )
            ),





            Subtopic(
                sutopicId=6,
                questions = listOf(
                    QuizQuestion("How do you start a single-line comment in JS?", listOf("/*", "//", "", "/* and */", "[[ and ]]"), 2),
                    QuizQuestion("What happens to comments during program execution?", listOf("They are displayed in console", "They are ignored by the browser", "They make the code run faster", "They cause an error"), 1),
                    QuizQuestion("Why would you use a comment to 'disable' code?", listOf("To make the file smaller", "To test logic without deleting it", "To encrypt the code", "To change the variable type"), 1),
                    QuizQuestion("Can a single-line comment be placed at the end of a statement?", listOf("Yes", "No", "Only inside a block", "Only with const"), 0)
                ),
                subTopicName = "JS Comments",
                headlines = listOf(

                    Headline(
                        headline = "JS Comments",
                        explaination = "JavaScript comments are used to describe the code and make it easier to understand. "
                                + "Comments are ignored by the browser and do not affect program execution."
                    ),

                    Headline(
                        headline = "Single-Line Comments",
                        explaination = "Single-line comments are used to comment only one line of code.",
                        codeExample = """
                // This is a single-line comment
                let x = 10; // This comment explains the variable
            """.trimIndent(),
                        afterCodeEplainations = "Anything written after // is treated as a comment and is not executed."
                    ),

                    Headline(
                        explaination = "Single-line comments are often used for short explanations or notes in the code.",
                        codeExample = ""
                    ),

                    Headline(
                        explaination = "Comments can also be used to explain complex logic or important steps in a program.",
                        tip = "Write clear and meaningful comments, but avoid commenting obvious code.",
                        codeExample = """
                // Calculate total price
                let total = price + tax;
            """.trimIndent()
                    ),

                    Headline(
                        headline = "Multi-Line Comments",
                        explaination = "Multi-line comments are used to comment multiple lines at once.",
                        codeExample = """
                /*
                  This is a multi-line comment
                  It can span multiple lines
                */
            """.trimIndent()
                    ),

                    Headline(
                        headline = "Disabling Code Using Comments",
                        explaination = "Comments can be used to temporarily disable code without deleting it.",
                        codeExample = """
                // console.log("This line will not run");

                /*
                alert("This code is disabled");
                */
            """.trimIndent()
                    )

                )
            ),


            Subtopic(
                sutopicId = 7,
                questions = listOf(
                    QuizQuestion("What is the result of 'let x;' if you log x?", listOf("0", "null", "undefined", "Error"), 2),
                    QuizQuestion("Which operator is used to assign a value to a variable?", listOf("==", "===", "=", ":="), 2),
                    QuizQuestion("What happens if you try to change a 'const' variable?", listOf("It changes successfully", "It resets to zero", "It causes a runtime error", "It creates a new variable"), 2),
                    QuizQuestion("Which is a valid variable name?", listOf("1stUser", "user-name", "_totalAmount", "let"), 2),
                    QuizQuestion("When should you use 'let' instead of 'const'?", listOf("When the value will stay the same", "When the value needs to be updated later", "Only for strings", "Only for numbers"), 1)
                ),
                subTopicName = "JS Variables",
                headlines = listOf(

                    Headline(
                        headline = "JS Variables",
                        explaination = "Variables are used to store data values in JavaScript. "
                                + "A variable can hold different types of data such as numbers or text.",
                        codeExample = "let name;",
                        afterCodeEplainations = "This declares a variable named name without assigning a value."
                    ),

                    Headline(
                        explaination = "The assignment operator (=) is used to assign a value to a variable.",
                        codeExample = """
                let age = 25;
                let city = "New York";
            """.trimIndent()
                    ),

                    Headline(
                        explaination = "Variables can store different types of data and their values can be used later in the program.",
                        codeExample = ""
                    ),

                    Headline(
                        headline = "Undefined Variable",
                        explaination = "A variable that is declared but not assigned a value is called an undefined variable.",
                        codeExample = """
                let x;
                console.log(x);
            """.trimIndent()
                    ),

                    Headline(
                        headline = "Changing Value",
                        explaination = "The value of a variable can be changed after it is declared.",
                        codeExample = """
                let score = 10;
                score = 20;
            """.trimIndent()
                    ),

                    Headline(
                        headline = "Constant Variables",
                        explaination = "Constant variables are declared using const and their values cannot be changed.",
                        codeExample = """
                const pi = 3.14;
            """.trimIndent(),
                        afterCodeEplainations = "Trying to change a const variable will cause an error."
                    ),

                    Headline(
                        explaination = "Use let for values that change and const for values that should stay the same.",
                        tip = "Always prefer const unless you know the value will change.",
                        codeExample = """
                let count = 1;
                const maxLimit = 100;
            """.trimIndent()
                    ),

                    Headline(
                        headline = "Naming Variables",
                        explaination = "Variable names should be meaningful and describe the data they store."
                    ),

                    Headline(
                        headline = "Rules for Naming Variables",
                        explaination = "Variable names must start with a letter, underscore (_), or dollar sign ($) "
                                + "and cannot contain spaces.",
                        tip = "Use camelCase for variable names, like userName or totalPrice."
                    )

                ),
            ),



            Subtopic(
                sutopicId = 8,
                questions = listOf(
                    QuizQuestion("What keyword is used to create a function?", listOf("method", "function", "def", "routine"), 1),
                    QuizQuestion("How do you 'call' a function named 'myFunc'?", listOf("call myFunc", "myFunc[]", "myFunc()", "run(myFunc)"), 2),
                    QuizQuestion("What does the 'return' statement do?", listOf("Restarts the function", "Exits the function and sends back a value", "Repeats the code", "Deletes the variable"), 1),
                    QuizQuestion("A variable declared inside a function is:", listOf("Global", "Local (Function Scope)", "Shared", "Permanent"), 1),
                    QuizQuestion("What happens if you define a function but never call it?", listOf("The code runs once", "The browser crashes", "The code inside never executes", "It runs automatically"), 2)
                ),
                subTopicName = "JS Functions",

                headlines = listOf(

                    Headline(
                        headline = "JS Functions",
                        explaination = "Functions are blocks of code designed to perform a specific task. "
                                + "They help organize code and avoid repetition."
                    ),

                    Headline(
                        headline = "Function Definition",
                        explaination = "A function definition creates a function using the function keyword, "
                                + "a name, and parentheses.",
                        tip = "Choose clear and meaningful function names.",
                        codeExample = """
                function greet() {
                    console.log("Hello!");
                }
            """.trimIndent(),
                        afterCodeEplainations = "This defines a function named greet, but it will not run until called."
                    ),

                    Headline(
                        explaination = "Functions can contain one or more statements inside their body.",
                        codeExample = ""
                    ),

                    Headline(
                        explaination = "Functions can be reused many times in a program.",
                        codeExample = ""
                    ),

                    Headline(
                        headline = "Calling a Function",
                        explaination = "Calling a function means executing the code inside the function.",
                        codeExample = """
                greet();
            """.trimIndent(),
                        afterCodeEplainations = "This line runs the greet function."
                    ),

                    Headline(
                        explaination = "A function can be called multiple times whenever needed.",
                        codeExample = ""
                    ),

                    Headline(
                        headline = "The return Statement",
                        explaination = "The return statement sends a value back from the function.",
                        codeExample = """
                function add(a, b) {
                    return a + b;
                }
            """.trimIndent(),
                        afterCodeEplainations = "The function returns the result of a + b."
                    ),

                    Headline(
                        explaination = "Returned values can be stored in variables.",
                        codeExample = """
                let result = add(5, 3);
            """.trimIndent()
                    ),

                    Headline(
                        explaination = "Once return is executed, the function stops running.",
                        codeExample = ""
                    ),

                    Headline(
                        explaination = "Not all functions need to return a value.",
                        tip = "Use return only when you need a result from the function.",
                        codeExample = ""
                    ),

                    Headline(
                        headline = "Function Scope",
                        explaination = "Variables declared inside a function can only be used within that function.",
                        codeExample = """
                function test() {
                    let x = 10;
                    console.log(x);
                }
            """.trimIndent()
                    ),

                    Headline(
                        headline = "Global Vaiables",
                        explaination = "Global variables are declared outside functions and can be accessed anywhere in the code.",
                        codeExample = """
                let message = "Hello";

                function showMessage() {
                    console.log(message);
                }
            """.trimIndent()
                    ),

                    Headline(
                        headline = "Why Use Functions",
                        explaination = "Functions make code reusable, organized, and easier to maintain.",
                        tip = "Break large programs into smaller functions.",
                        codeExample = """
                function calculateTotal(price, tax) {
                    return price + tax;
                }
            """.trimIndent(),
                        afterCodeEplainations = "This function can be reused whenever total calculation is needed."
                    )

                )
            ),




            Subtopic(
                sutopicId = 9,
                questions = listOf(
                    QuizQuestion("Which event fires when a user clicks an HTML element?", listOf("onhover", "onclick", "onpress", "onchange"), 1),
                    QuizQuestion("What is the modern method to attach an event handler?", listOf("on()", "attachEvent()", "addEventListener()", "setEvent()"), 2),
                    QuizQuestion("How do you prevent a form from refreshing the page on submit?", listOf("e.stop()", "e.preventDefault()", "e.halt()", "e.ignore()"), 1),
                    QuizQuestion("Which event fires as soon as the HTML is loaded but before images load?", listOf("onload", "DOMReady", "DOMContentLoaded", "onfinish"), 2),
                    QuizQuestion("What is the difference between 'focus' and 'blur'?", listOf("There is no difference", "Focus is entering a field, blur is leaving it", "Focus is for buttons, blur is for text", "Blur happens only on scroll"), 1),
                    QuizQuestion("Which event tracks every single keystroke in an input?", listOf("change", "submit", "input", "blur"), 2),
                    QuizQuestion("What does 'window.scrollY' tell you during a scroll event?", listOf("The width of the page", "The vertical distance scrolled in pixels", "The speed of scrolling", "The number of elements on screen"), 1)
                ),
                subTopicName = "JS Events",
                headlines = listOf(
                    Headline(
                        headline = "JS Events",
                        explaination = "JavaScript events are actions that happen in the browser, such as clicking a button, typing on the keyboard, or loading a page.",
                        codeExample = """
                <button onclick="showAlert()">Click Me</button>
                <script>
                    function showAlert() {
                        alert("Button clicked!");
                    }
                </script>
            """.trimIndent(),
                        afterCodeEplainations = "The function runs when the button is clicked."
                    ),

                    Headline(
                        headline = "Inline Event Handlers",
                        explaination = "Inline event handlers are written directly inside HTML elements using attributes like onclick or onmouseover.",
                        codeExample = """
                <button onclick="alert('Hello!')">Click</button>
            """.trimIndent(),
                        afterCodeEplainations = "Inline events are easy to use but not recommended for large applications as they mix logic with structure."
                    ),

                    Headline(
                        headline = "The addEventListener() Method",
                        explaination = "addEventListener() is the modern way to attach event handlers. It allows multiple listeners for a single event.",
                        codeExample = """
                <button id="btn">Click Me</button>
                <script>
                    document.getElementById("btn")
                        .addEventListener("click", () => {
                            alert("Modern click handler!");
                        });
                </script>
            """.trimIndent(),
                        afterCodeEplainations = "This method keeps JavaScript separate from HTML and is easier to maintain."
                    ),

                    Headline(
                        headline = "The DOMContentLoaded Event",
                        explaination = "This event fires when the HTML document has been completely loaded and parsed, without waiting for images or stylesheets.",
                        codeExample = """
                <script>
                    document.addEventListener("DOMContentLoaded", () => {
                        console.log("DOM is ready, you can now manipulate elements!");
                    });
                </script>
            """.trimIndent()
                    ),

                    Headline(
                        headline = "The input Event",
                        explaination = "Unlike 'change', the 'input' event fires immediately every time the value of an element changes.",
                        codeExample = """
                <input type="text" id="myInput">
                <p id="output"></p>
                <script>
                    document.getElementById("myInput").addEventListener("input", (e) => {
                        document.getElementById("output").innerText = e.target.value;
                    });
                </script>
            """.trimIndent()
                    ),

                    Headline(
                        headline = "Mouse Events: mousedown & mouseup",
                        explaination = "These track the exact moments a mouse button is pressed down and then released.",
                        codeExample = """
                <button id="holdBtn">Hold Me</button>
                <script>
                    const btn = document.getElementById("holdBtn");
                    btn.addEventListener("mousedown", () => btn.innerText = "Pressed!");
                    btn.addEventListener("mouseup", () => btn.innerText = "Released!");
                </script>
            """.trimIndent()
                    ),

                    Headline(
                        headline = "The keydown Event",
                        explaination = "The keydown event occurs the moment a key is pressed. It is more reliable than keypress for non-character keys.",
                        codeExample = """
                <script>
                    window.addEventListener("keydown", (event) => {
                        console.log("Key pressed: " + event.key);
                    });
                </script>
            """.trimIndent()
                    ),

                    Headline(
                        headline = "The submit Event",
                        explaination = "This event occurs when a form is submitted. It is usually used to validate data or prevent the page from refreshing.",
                        codeExample = """
                <form id="myForm">
                    <input type="text" required>
                    <button type="submit">Send</button>
                </form>
                <script>
                    document.getElementById("myForm").addEventListener("submit", (e) => {
                        e.preventDefault(); // Stops the page from refreshing
                        alert("Form submitted safely!");
                    });
                </script>
            """.trimIndent()
                    ),

                    Headline(
                        headline = "The focus and blur Events",
                        explaination = "Focus happens when you enter an input field; blur happens when you leave it.",
                        codeExample = """
                <input type="text" id="fld" placeholder="Focus me">
                <script>
                    const fld = document.getElementById("fld");
                    fld.onfocus = () => fld.style.border = "2px solid blue";
                    fld.onblur = () => fld.style.border = "1px solid gray";
                </script>
            """.trimIndent()
                    ),

                    Headline(
                        headline = "The scroll Event",
                        explaination = "The scroll event fires when the document view or an element has been scrolled.",
                        codeExample = """
                <script>
                    window.onscroll = () => {
                        console.log("You are scrolling at: " + window.scrollY + "px");
                    };
                </script>
            """.trimIndent(),
                        tip = "Use 'throttling' or 'debouncing' with scroll events to maintain browser performance."
                    ),

                    Headline(
                        headline = "The contextmenu Event",
                        explaination = "This event fires when the user attempts to open a context menu (usually by right-clicking).",
                        codeExample = """
                <div style="background: lightgray; height: 50px;">Right-click here</div>
                <script>
                    document.addEventListener("contextmenu", (e) => {
                        e.preventDefault();
                        alert("Right-click is disabled!");
                    });
                </script>
            """.trimIndent()
                    )
                )
            )









        ),

            Subtopic(
                sutopicId=5,
                subTopicName = "Comments",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML Comments",
                        majorHeadileExplanation = "Explain breifly" ,
                        headline = "Importance of Comments",
                        explaination = "Explain",
                        tip = "give tip"
                    ),
                    Headline(
                        headline = "Comment in Html",
                        explaination = "explain showing how ,and what is in comment",
                        codeExample = " example ",
                        afterCodeEplainations = "Explain",
                    ),
                    Headline(
                        explaination = "explain ",
                        codeExample = "give amazing runnable html example",
                        afterCodeEplainations = ""

                        ),

                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "amazing",
                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ) ,
            Subtopic(
                sutopicId=6,
                subTopicName = "Styling in HTML",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Styling in HTML",
                        majorHeadileExplanation = "Explain ",

                        tip = "give",
                        afterCodeEplainations = "explain how the user can save the html on this app by clicking the menu at the top and click save as or save or open saved "
                    ),
                    Headline(
                        headline = "Internal Style Sheet /Internal styling",
                        explaination = "Explain how , extension and say that this app allows saving to",
                        codeExample ="give code example that user can run ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        explaination = "explain ",
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        headline = "Inline Styling",
                        explaination = "explain ",
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "textcolor",
                        codeExample = "give  amazing runnable html examples",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        explaination = "bg ",
                        codeExample = "give  amazing runnable html example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        explaination = "size ",
                        codeExample = "give  amazing runnable html example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        explaination = "font ",
                        codeExample = "give  amazing runnable html examples",
                        afterCodeEplainations = ""

                    ),  Headline(
                        explaination = "aligning ",
                        codeExample = "give  amazing runnable html example",
                        afterCodeEplainations = ""

                    ),//give more headlines involing commonly used styles
                    questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )

                ),
            ),
            Subtopic(
                sutopicId=7,
                subTopicName = "Colors in HTML",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Colors in HTML",
                        majorHeadileExplanation = "Explain showing all ways how colors are in html and treated and defined with examples and good structure" ,
                        codeExample = "give a runnable involving html colors more than one ",


                        tip = "give tip"
                    ),
                    Headline(
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        headline = "Examples",
                        explaination = "List well commonly used colors and how they are used ,hex,rgb",
                        codeExample = "give runnable html example ",
                    ),


                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "",
                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ),
            Subtopic(
                sutopicId=8,
                subTopicName = "HTML Responsive",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML Responsive",
                        majorHeadileExplanation = "Explain  and show what to put in the head",
                           codeExample ="give a runnable code example with attributes you can use comment to explain inside the code",
                        tip = "give",
                        afterCodeEplainations = ""
                    ),
                    Headline(
                        headline = "with viewport",
                        explaination = "explain ",
                        codeExample = "good example",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "without viewport",
                        explaination = "explain ",
                        codeExample = "good example",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        explaination = "explain ",
                        codeExample = "",

                        ),

                    questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )

                ),


                // --- SUBTOPIC 2: WRITING & INTEGRATING JS ---
                Subtopic(
                    sutopicId = 2,
                    subTopicName = "JS Writing Code",
                    headlines = listOf(
                        Headline(
                            headline = "The <script> Tag",
                            explaination = "JavaScript is executed by the browser's engine. To run it, code is either embedded directly into HTML or linked as an external script using the <script> tag. This tag tells the browser to pause HTML parsing and execute the logic inside.",
                            codeExample = "<script>\n  console.log('Writing JS directly in HTML!');\n</script>",
                            afterCodeEplainations = "Browsers read files from top to bottom, executing scripts as they are encountered."
                        ),
                        Headline(
                            headline = "Internal JS & Placement",
                            explaination = "Internal JS lives inside your HTML file. If placed in the <head>, it loads early but can slow down visual rendering. If placed at the bottom of the <body>, the page structure loads first, which is a common performance optimization.",
                            codeExample = "<body>\n  <h1 id='title'>Hello</h1>\n  <script>\n    // This runs after the <h1> is created\n    console.log('Body script executed');\n  </script>\n</body>",
                            tip = "Placing scripts in the head might cause errors if the script tries to access HTML elements that haven't been created yet."
                        ),
                        Headline(
                            headline = "External JS (.js Files)",
                            explaination = "For production, code is kept in separate .js files. This promotes 'Separation of Concerns' and allows browsers to cache the file, similar to how Linux shared libraries (.so files) save memory by being reused.",
                            codeExample = "// In HTML: <script src='script.js'></script>\n\n// In script.js:\nfunction init() {\n  console.log('External app started');\n}",
                            afterCodeEplainations = "The 'src' attribute acts like a file path, pointing the browser to the logic's location."
                        ),
                        Headline(
                            headline = "The Render Process & Parser Blocking",
                            explaination = "When a browser hits a script tag without special attributes, it stops building the page to download and run it. This is 'parser blocking'—think of it like a sequential bash script where command B must wait for A.",
                            codeExample = "<script src='heavy-library.js'></script>",
                            afterCodeEplainations = "Large scripts can make a site feel 'frozen' during this download phase."
                        ),
                        Headline(
                            headline = "Modern Loading: Async & Defer",
                            explaination = "Modern JS uses 'async' and 'defer' to prevent blocking. 'Defer' downloads the script in the background and executes it only after the HTML is fully parsed. This is currently the industry standard.",
                            codeExample = "<script src='app.js' defer></script>",
                            tip = "Always use 'defer' for external scripts in the <head> to get the best performance and avoid null errors."
                        ),
                        Headline(
                            headline = "Modern Module System",
                            explaination = "Today we use 'type=module' to organize code into pieces that can import/export functionality. Modules automatically use 'strict mode' to prevent common coding errors.",
                            codeExample = "<script type='module' src='main.js'></script>"
                        )
                    ),
                    questions = listOf(
                        QuizQuestion("Which tag is used for JavaScript?", listOf("<js>", "<script>", "<javascript>", "<code_js>"), 1),
                        QuizQuestion("What is the best location for scripts for performance?", listOf("In the <head>", "Before the <html> tag", "At the bottom of the <body>", "Inside a <div>"), 2),
                        QuizQuestion("Which attribute links an external JS file?", listOf("href", "link", "src", "path"), 2),
                        QuizQuestion("What does the 'defer' attribute do?", listOf("Stops the script", "Hides the script", "Downloads in background and runs after parsing", "Deletes the script"), 2),
                        QuizQuestion("Why is External JS better for performance?", listOf("It is smaller", "It can be cached by the browser", "It runs faster", "It uses less RAM"), 1)
                    )
                ),

                // --- SUBTOPIC 3: DISPLAYING OUTPUT & DEBUGGING ---
                Subtopic(
                    sutopicId = 3,
                    subTopicName = "JS Displaying Output",
                    headlines = listOf(
                        Headline(
                            headline = "Data Visualization Streams",
                            explaination = "JavaScript output means showing results to the user or developer. It can be displayed in the console, dialog boxes, or directly inside HTML elements.",
                            codeExample = "// Different output streams\nconsole.log('For developers');\nalert('For urgent alerts');\ndocument.getElementById('msg').innerHTML = 'For users';"
                        ),
                        Headline(
                            headline = "Using the Console",
                            explaination = "The console is the primary tool for debugging. Beyond log(), you can use console.table() to visualize arrays of data clearly in the browser's DevTools (F12).",
                            codeExample = """
                            const servers = [
                                { name: "Nginx", status: "Active" },
                                { name: "Apache", status: "Down" }
                            ];
                            console.table(servers);
                        """.trimIndent(),
                            afterCodeEplainations = "The output is not visible to website users, making it safe for sensitive debugging info."
                        ),
                        Headline(
                            headline = "Writing to HTML Components",
                            explaination = "JavaScript can change content by selecting an element's ID. You use 'innerHTML' for HTML content or 'textContent' for plain text. Use <br> for line breaks within innerHTML.",
                            codeExample = """
                            <p id="status"></p>
                            <script>
                                document.getElementById("status").innerHTML = "System:<br>Online";
                            </script>
                        """.trimIndent(),
                            tip = "Careful: innerHTML can be a security risk (XSS). Use textContent if you don't need to render HTML tags."
                        ),
                        Headline(
                            headline = "Using Dialog Boxes",
                            explaination = "Dialog boxes like alert(), confirm(), and prompt() are popups. Note that they are 'blocking' operations; they freeze the browser's main thread until the user interacts.",
                            codeExample = "alert('Welcome to the JavaScript Compiler!');"
                        ),
                        Headline(
                            headline = "The Window Object",
                            explaination = "In the browser, 'window' is the global object. This means 'window.alert()' and 'alert()' are identical. It represents the browser window itself.",
                            codeExample = "window.console.log('Global window access');"
                        ),
                        Headline(
                            headline = "Dangerous Output: document.write()",
                            explaination = "JavaScript can write directly to the document stream. However, if document.write() is used after the page has finished loading, it will overwrite the entire HTML document.",
                            codeExample = "function wipe() {\n  document.write('The rest of the page is now gone.');\n}",
                            tip = "Avoid using document.write() in real applications. It is strictly for quick testing."
                        )
                    ),
                    questions = listOf(
                        QuizQuestion("Which method is best for debugging?", listOf("alert()", "console.log()", "document.write()", "window.print()"), 1),
                        QuizQuestion("How do you change the content of an HTML element?", listOf(".innerHTML", ".changeText", ".value", ".setContent"), 0),
                        QuizQuestion("What is a risk of using innerHTML with user input?", listOf("Slow loading", "Security (XSS)", "Color changes", "Syntax errors"), 1),
                        QuizQuestion("What happens if document.write() runs after the page loads?", listOf("Adds text at top", "Does nothing", "Wipes the entire page", "Opens a new tab"), 2),
                        QuizQuestion("Which command prints a table of data?", listOf("console.grid()", "console.table()", "console.view()", "console.list()"), 1)
                    )
                )
                ,




                Subtopic(
                    sutopicId=4,
                    subTopicName = "JS Statements",
                    headlines = listOf(

                        Headline(
                            headline = "JS Statements",
                            explaination = "JavaScript statements are instructions that tell the browser what to do. "
                                    + "Each statement is executed in the order it is written.",
                            codeExample = """
                let x = 10;
                let y = 20;
                let sum = x + y;
            """.trimIndent(),
                            afterCodeEplainations = "Each line is a separate statement. "
                                    + "JavaScript reads and runs them one by one."
                        ),

                        Headline(
                            explaination = "JavaScript statements usually end with a semicolon. "
                                    + "The semicolon separates one statement from another.",
                            codeExample = """
                let name = "John";
                let age = 25;
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "JavaScript allows multiple statements in one line, "
                                    + "but writing one statement per line makes the code easier to read.",
                            codeExample = """
                let a = 5; let b = 10; let c = a + b;
            """.trimIndent(),
                            tip = "For better readability, always write one statement per line."
                        ),

                        Headline(
                            headline = "Grouping JS Statements",
                            explaination = "JavaScript statements can be grouped together using curly braces {}. "
                                    + "Grouped statements are treated as a block of code.",
                            codeExample = """
                if (x > 5) {
                    console.log("x is greater than 5");
                    console.log("This is a block of statements");
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "JS Keywords",
                            explaination = "JavaScript keywords are reserved words that have special meanings. "
                                    + "They are used to define actions, variables, and control the program flow.",
                            codeExample = """
                let number = 10;

                if (number > 5) {
                    console.log("Number is greater than 5");
                }
            """.trimIndent(),
                            afterCodeEplainations = "`let` and `if` are JavaScript keywords and cannot be used as variable names."
                        )

                    ),
                    questions = listOf(
                        QuizQuestion("What is a JavaScript statement?", listOf("A style rule", "An instruction to the browser", "A type of variable", "A comment"), 1),
                        QuizQuestion("Which character is usually used to separate JS statements?", listOf("Colon (:)", "Comma (,)", "Semicolon (;)", "Full stop (.)"), 2),
                        QuizQuestion("Is it possible to write multiple statements on one line?", listOf("No, it causes an error", "Yes, but it's not recommended", "Only inside a function", "Only if they are empty"), 1),
                        QuizQuestion("What are curly braces {} used for in statements?", listOf("To create a comment", "To group statements into a block", "To multiply numbers", "To end the program"), 1),
                        QuizQuestion("In what order are JavaScript statements executed?", listOf("Randomly", "Bottom to top", "In the order they are written", "Alphabetically"), 2)
                    )
                ),

                Subtopic(
                    sutopicId=5,
                    subTopicName = "JS Syntax",questions = listOf(
                        QuizQuestion("Which keyword is used for a variable that should NOT change?", listOf("let", "var", "const", "change"), 2),
                        QuizQuestion("Is JavaScript case-sensitive?", listOf("Yes", "No", "Only for numbers", "Only in Linux"), 0),
                        QuizQuestion("Which is a correct way to declare a variable in modern JS?", listOf("variable x = 5;", "let x = 5;", "set x = 5;", "int x = 5;"), 1),
                        QuizQuestion("If you have 'let Name' and 'let name', how many variables exist?", listOf("One", "Two", "None (error)", "It depends on the browser"), 1),
                        QuizQuestion("What is the naming style 'userName' called?", listOf("snake_case", "PascalCase", "camelCase", "Flatcase"), 2)
                    ),
                    headlines = listOf(

                        Headline(
                            headline = "JS Syntax?",
                            explaination = "JavaScript syntax refers to the rules that define how JavaScript code is written "
                                    + "and structured. Following correct syntax helps the browser understand and execute the code."
                        ),

                        Headline(
                            headline = "Variable Declaration",
                            explaination = "Variable declaration means creating a variable to store data. "
                                    + "JavaScript allows variables to be declared using let, const, or var.",
                            codeExample = """
                let name = "John";
                const age = 30;
                var city = "Paris";
            """.trimIndent(),
                            afterCodeEplainations = "`let` is used for values that can change, "
                                    + "`const` is used for fixed values, and `var` is an older way to declare variables."
                        ),

                        Headline(
                            headline = "Case Sensitivity",
                            explaination = "JavaScript is case-sensitive, which means uppercase and lowercase letters "
                                    + "are treated as different.",
                            codeExample = """
                let userName = "Alice";
                let username = "Bob";
            """.trimIndent(),
                            tip = "Always use consistent naming styles like camelCase to avoid errors."
                        )

                    )
                ),





                Subtopic(
                    sutopicId=6,
                    questions = listOf(
                        QuizQuestion("How do you start a single-line comment in JS?", listOf("/*", "//", "", "/* and */", "[[ and ]]"), 2),
                        QuizQuestion("What happens to comments during program execution?", listOf("They are displayed in console", "They are ignored by the browser", "They make the code run faster", "They cause an error"), 1),
                        QuizQuestion("Why would you use a comment to 'disable' code?", listOf("To make the file smaller", "To test logic without deleting it", "To encrypt the code", "To change the variable type"), 1),
                        QuizQuestion("Can a single-line comment be placed at the end of a statement?", listOf("Yes", "No", "Only inside a block", "Only with const"), 0)
                    ),
                    subTopicName = "JS Comments",
                    headlines = listOf(

                        Headline(
                            headline = "JS Comments",
                            explaination = "JavaScript comments are used to describe the code and make it easier to understand. "
                                    + "Comments are ignored by the browser and do not affect program execution."
                        ),

                        Headline(
                            headline = "Single-Line Comments",
                            explaination = "Single-line comments are used to comment only one line of code.",
                            codeExample = """
                // This is a single-line comment
                let x = 10; // This comment explains the variable
            """.trimIndent(),
                            afterCodeEplainations = "Anything written after // is treated as a comment and is not executed."
                        ),

                        Headline(
                            explaination = "Single-line comments are often used for short explanations or notes in the code.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Comments can also be used to explain complex logic or important steps in a program.",
                            tip = "Write clear and meaningful comments, but avoid commenting obvious code.",
                            codeExample = """
                // Calculate total price
                let total = price + tax;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Multi-Line Comments",
                            explaination = "Multi-line comments are used to comment multiple lines at once.",
                            codeExample = """
                /*
                  This is a multi-line comment
                  It can span multiple lines
                */
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Disabling Code Using Comments",
                            explaination = "Comments can be used to temporarily disable code without deleting it.",
                            codeExample = """
                // console.log("This line will not run");

                /*
                alert("This code is disabled");
                */
            """.trimIndent()
                        )

                    )
                ),


                Subtopic(
                    sutopicId = 7,
                    questions = listOf(
                        QuizQuestion("What is the result of 'let x;' if you log x?", listOf("0", "null", "undefined", "Error"), 2),
                        QuizQuestion("Which operator is used to assign a value to a variable?", listOf("==", "===", "=", ":="), 2),
                        QuizQuestion("What happens if you try to change a 'const' variable?", listOf("It changes successfully", "It resets to zero", "It causes a runtime error", "It creates a new variable"), 2),
                        QuizQuestion("Which is a valid variable name?", listOf("1stUser", "user-name", "_totalAmount", "let"), 2),
                        QuizQuestion("When should you use 'let' instead of 'const'?", listOf("When the value will stay the same", "When the value needs to be updated later", "Only for strings", "Only for numbers"), 1)
                    ),
                    subTopicName = "JS Variables",
                    headlines = listOf(

                        Headline(
                            headline = "JS Variables",
                            explaination = "Variables are used to store data values in JavaScript. "
                                    + "A variable can hold different types of data such as numbers or text.",
                            codeExample = "let name;",
                            afterCodeEplainations = "This declares a variable named name without assigning a value."
                        ),

                        Headline(
                            explaination = "The assignment operator (=) is used to assign a value to a variable.",
                            codeExample = """
                let age = 25;
                let city = "New York";
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "Variables can store different types of data and their values can be used later in the program.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Undefined Variable",
                            explaination = "A variable that is declared but not assigned a value is called an undefined variable.",
                            codeExample = """
                let x;
                console.log(x);
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Changing Value",
                            explaination = "The value of a variable can be changed after it is declared.",
                            codeExample = """
                let score = 10;
                score = 20;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Constant Variables",
                            explaination = "Constant variables are declared using const and their values cannot be changed.",
                            codeExample = """
                const pi = 3.14;
            """.trimIndent(),
                            afterCodeEplainations = "Trying to change a const variable will cause an error."
                        ),

                        Headline(
                            explaination = "Use let for values that change and const for values that should stay the same.",
                            tip = "Always prefer const unless you know the value will change.",
                            codeExample = """
                let count = 1;
                const maxLimit = 100;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Naming Variables",
                            explaination = "Variable names should be meaningful and describe the data they store."
                        ),

                        Headline(
                            headline = "Rules for Naming Variables",
                            explaination = "Variable names must start with a letter, underscore (_), or dollar sign ($) "
                                    + "and cannot contain spaces.",
                            tip = "Use camelCase for variable names, like userName or totalPrice."
                        )

                    ),
                ),



                Subtopic(
                    sutopicId = 8,
                    questions = listOf(
                        QuizQuestion("What keyword is used to create a function?", listOf("method", "function", "def", "routine"), 1),
                        QuizQuestion("How do you 'call' a function named 'myFunc'?", listOf("call myFunc", "myFunc[]", "myFunc()", "run(myFunc)"), 2),
                        QuizQuestion("What does the 'return' statement do?", listOf("Restarts the function", "Exits the function and sends back a value", "Repeats the code", "Deletes the variable"), 1),
                        QuizQuestion("A variable declared inside a function is:", listOf("Global", "Local (Function Scope)", "Shared", "Permanent"), 1),
                        QuizQuestion("What happens if you define a function but never call it?", listOf("The code runs once", "The browser crashes", "The code inside never executes", "It runs automatically"), 2)
                    ),
                    subTopicName = "JS Functions",

                    headlines = listOf(

                        Headline(
                            headline = "JS Functions",
                            explaination = "Functions are blocks of code designed to perform a specific task. "
                                    + "They help organize code and avoid repetition."
                        ),

                        Headline(
                            headline = "Function Definition",
                            explaination = "A function definition creates a function using the function keyword, "
                                    + "a name, and parentheses.",
                            tip = "Choose clear and meaningful function names.",
                            codeExample = """
                function greet() {
                    console.log("Hello!");
                }
            """.trimIndent(),
                            afterCodeEplainations = "This defines a function named greet, but it will not run until called."
                        ),

                        Headline(
                            explaination = "Functions can contain one or more statements inside their body.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Functions can be reused many times in a program.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Calling a Function",
                            explaination = "Calling a function means executing the code inside the function.",
                            codeExample = """
                greet();
            """.trimIndent(),
                            afterCodeEplainations = "This line runs the greet function."
                        ),

                        Headline(
                            explaination = "A function can be called multiple times whenever needed.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "The return Statement",
                            explaination = "The return statement sends a value back from the function.",
                            codeExample = """
                function add(a, b) {
                    return a + b;
                }
            """.trimIndent(),
                            afterCodeEplainations = "The function returns the result of a + b."
                        ),

                        Headline(
                            explaination = "Returned values can be stored in variables.",
                            codeExample = """
                let result = add(5, 3);
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "Once return is executed, the function stops running.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Not all functions need to return a value.",
                            tip = "Use return only when you need a result from the function.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Function Scope",
                            explaination = "Variables declared inside a function can only be used within that function.",
                            codeExample = """
                function test() {
                    let x = 10;
                    console.log(x);
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Global Vaiables",
                            explaination = "Global variables are declared outside functions and can be accessed anywhere in the code.",
                            codeExample = """
                let message = "Hello";

                function showMessage() {
                    console.log(message);
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Why Use Functions",
                            explaination = "Functions make code reusable, organized, and easier to maintain.",
                            tip = "Break large programs into smaller functions.",
                            codeExample = """
                function calculateTotal(price, tax) {
                    return price + tax;
                }
            """.trimIndent(),
                            afterCodeEplainations = "This function can be reused whenever total calculation is needed."
                        )

                    )
                ),




                Subtopic(
                    sutopicId = 9,
                    questions = listOf(
                        QuizQuestion("Which event fires when a user clicks an HTML element?", listOf("onhover", "onclick", "onpress", "onchange"), 1),
                        QuizQuestion("What is the modern method to attach an event handler?", listOf("on()", "attachEvent()", "addEventListener()", "setEvent()"), 2),
                        QuizQuestion("How do you prevent a form from refreshing the page on submit?", listOf("e.stop()", "e.preventDefault()", "e.halt()", "e.ignore()"), 1),
                        QuizQuestion("Which event fires as soon as the HTML is loaded but before images load?", listOf("onload", "DOMReady", "DOMContentLoaded", "onfinish"), 2),
                        QuizQuestion("What is the difference between 'focus' and 'blur'?", listOf("There is no difference", "Focus is entering a field, blur is leaving it", "Focus is for buttons, blur is for text", "Blur happens only on scroll"), 1),
                        QuizQuestion("Which event tracks every single keystroke in an input?", listOf("change", "submit", "input", "blur"), 2),
                        QuizQuestion("What does 'window.scrollY' tell you during a scroll event?", listOf("The width of the page", "The vertical distance scrolled in pixels", "The speed of scrolling", "The number of elements on screen"), 1)
                    ),
                    subTopicName = "JS Events",
                    headlines = listOf(
                        Headline(
                            headline = "JS Events",
                            explaination = "JavaScript events are actions that happen in the browser, such as clicking a button, typing on the keyboard, or loading a page.",
                            codeExample = """
                <button onclick="showAlert()">Click Me</button>
                <script>
                    function showAlert() {
                        alert("Button clicked!");
                    }
                </script>
            """.trimIndent(),
                            afterCodeEplainations = "The function runs when the button is clicked."
                        ),

                        Headline(
                            headline = "Inline Event Handlers",
                            explaination = "Inline event handlers are written directly inside HTML elements using attributes like onclick or onmouseover.",
                            codeExample = """
                <button onclick="alert('Hello!')">Click</button>
            """.trimIndent(),
                            afterCodeEplainations = "Inline events are easy to use but not recommended for large applications as they mix logic with structure."
                        ),

                        Headline(
                            headline = "The addEventListener() Method",
                            explaination = "addEventListener() is the modern way to attach event handlers. It allows multiple listeners for a single event.",
                            codeExample = """
                <button id="btn">Click Me</button>
                <script>
                    document.getElementById("btn")
                        .addEventListener("click", () => {
                            alert("Modern click handler!");
                        });
                </script>
            """.trimIndent(),
                            afterCodeEplainations = "This method keeps JavaScript separate from HTML and is easier to maintain."
                        ),

                        Headline(
                            headline = "The DOMContentLoaded Event",
                            explaination = "This event fires when the HTML document has been completely loaded and parsed, without waiting for images or stylesheets.",
                            codeExample = """
                <script>
                    document.addEventListener("DOMContentLoaded", () => {
                        console.log("DOM is ready, you can now manipulate elements!");
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The input Event",
                            explaination = "Unlike 'change', the 'input' event fires immediately every time the value of an element changes.",
                            codeExample = """
                <input type="text" id="myInput">
                <p id="output"></p>
                <script>
                    document.getElementById("myInput").addEventListener("input", (e) => {
                        document.getElementById("output").innerText = e.target.value;
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Mouse Events: mousedown & mouseup",
                            explaination = "These track the exact moments a mouse button is pressed down and then released.",
                            codeExample = """
                <button id="holdBtn">Hold Me</button>
                <script>
                    const btn = document.getElementById("holdBtn");
                    btn.addEventListener("mousedown", () => btn.innerText = "Pressed!");
                    btn.addEventListener("mouseup", () => btn.innerText = "Released!");
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The keydown Event",
                            explaination = "The keydown event occurs the moment a key is pressed. It is more reliable than keypress for non-character keys.",
                            codeExample = """
                <script>
                    window.addEventListener("keydown", (event) => {
                        console.log("Key pressed: " + event.key);
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The submit Event",
                            explaination = "This event occurs when a form is submitted. It is usually used to validate data or prevent the page from refreshing.",
                            codeExample = """
                <form id="myForm">
                    <input type="text" required>
                    <button type="submit">Send</button>
                </form>
                <script>
                    document.getElementById("myForm").addEventListener("submit", (e) => {
                        e.preventDefault(); // Stops the page from refreshing
                        alert("Form submitted safely!");
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The focus and blur Events",
                            explaination = "Focus happens when you enter an input field; blur happens when you leave it.",
                            codeExample = """
                <input type="text" id="fld" placeholder="Focus me">
                <script>
                    const fld = document.getElementById("fld");
                    fld.onfocus = () => fld.style.border = "2px solid blue";
                    fld.onblur = () => fld.style.border = "1px solid gray";
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The scroll Event",
                            explaination = "The scroll event fires when the document view or an element has been scrolled.",
                            codeExample = """
                <script>
                    window.onscroll = () => {
                        console.log("You are scrolling at: " + window.scrollY + "px");
                    };
                </script>
            """.trimIndent(),
                            tip = "Use 'throttling' or 'debouncing' with scroll events to maintain browser performance."
                        ),

                        Headline(
                            headline = "The contextmenu Event",
                            explaination = "This event fires when the user attempts to open a context menu (usually by right-clicking).",
                            codeExample = """
                <div style="background: lightgray; height: 50px;">Right-click here</div>
                <script>
                    document.addEventListener("contextmenu", (e) => {
                        e.preventDefault();
                        alert("Right-click is disabled!");
                    });
                </script>
            """.trimIndent()
                        )
                    )
                )









            ),

            Subtopic(
                sutopicId=9,
                subTopicName = "HTML Centered",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML Centered",
                        majorHeadileExplanation = "Explain breifly" ,
                        headline = "Text center",
                        explaination = "Explain",
                        codeExample = " example ",
                        tip = "give tip"
                    ),
                    Headline(
                        headline = "div",
                        codeExample = " example ",
                        afterCodeEplainations = "Explain",
                    ),
                    Headline(
                        explaination = "image ",
                        codeExample = "give amazing runnable html example",
                        afterCodeEplainations = ""

                    ),

                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "amazing",
                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ) ,
            Subtopic(
                sutopicId=10,
                subTopicName = "Header and Footer",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Header and Footer",
                        majorHeadileExplanation = "Explain ",

                        tip = "give",
                                 ),
                    Headline(
                        headline = "Header ",
                        explaination = "Explain",
                        codeExample ="give code example that user can run that has header",


                        ),
                    Headline(
                        headline = "Header and Nav ",
                        explaination = "Explain",
                        codeExample ="give code example that user can run that has header and nav",


                        ),
                    Headline(
                        headline = "Header nav and body ",
                        explaination = "Explain",
                        codeExample ="give code example that user can run that has header and body",


                        ),

                    Headline(
                        headline = "Footer",
                        explaination = "explain ",
                        codeExample = "give amazing runnable html  example",


                        ),

                  Headline(
                        explaination = "Full html website having all ",
                        codeExample = "give  amazing runnable html example",
                        afterCodeEplainations = ""

                    ),//give more headlines involing commonly used styles
                    questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )

                ),
            ),
            Subtopic(
                sutopicId=11,
                subTopicName = "Headings in Html",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Headings in HTML",
                        majorHeadileExplanation = "Explain" ,
                        codeExample = "give a runnable involving all html headers displaying Nick Dieda",
                        afterCodeEplainations = "",
                        tip = "give tip"
                    ),
                    Headline(
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        headline = "Styling Heading",
                        explaination = "explain and do inline styiling ",
                        codeExample = "give runnable html example ",
                    ),
                    Headline(
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),



                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "",
                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ),
            Subtopic(
                sutopicId=12,
                subTopicName = "HTML Paragraphs",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML Paragraphs",
                        majorHeadileExplanation = "explain showing tag used",
                            tip = "give",
                        codeExample = "give example",
                        afterCodeEplainations = ""
                    ),
                    Headline(
                        explaination = "explain ",

                        codeExample ="give a runnable code examples you can use comment to explain inside the code",


                        ),
                    Headline(
                        headline = "Styling Paragraph",
                        explaination = "explain use inline ",
                        codeExample = "good example",


                        ),
                    Headline(
                        headline = "aligning ",
                        codeExample = "give amazing runnable html involving all text alignment example",


                    ),
                    Headline(
                        headline = "colors ",
                        codeExample = "give amazing runnable html involving all text color example",

                        ),
                    Headline(
                        headline = "Others Commonly used ",
                        codeExample = "give amazing runnable html involving commonly used to style paragraph example",


                        ),





                    questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )

                ),


                // --- SUBTOPIC 2: WRITING & INTEGRATING JS ---
                Subtopic(
                    sutopicId = 2,
                    subTopicName = "JS Writing Code",
                    headlines = listOf(
                        Headline(
                            headline = "The <script> Tag",
                            explaination = "JavaScript is executed by the browser's engine. To run it, code is either embedded directly into HTML or linked as an external script using the <script> tag. This tag tells the browser to pause HTML parsing and execute the logic inside.",
                            codeExample = "<script>\n  console.log('Writing JS directly in HTML!');\n</script>",
                            afterCodeEplainations = "Browsers read files from top to bottom, executing scripts as they are encountered."
                        ),
                        Headline(
                            headline = "Internal JS & Placement",
                            explaination = "Internal JS lives inside your HTML file. If placed in the <head>, it loads early but can slow down visual rendering. If placed at the bottom of the <body>, the page structure loads first, which is a common performance optimization.",
                            codeExample = "<body>\n  <h1 id='title'>Hello</h1>\n  <script>\n    // This runs after the <h1> is created\n    console.log('Body script executed');\n  </script>\n</body>",
                            tip = "Placing scripts in the head might cause errors if the script tries to access HTML elements that haven't been created yet."
                        ),
                        Headline(
                            headline = "External JS (.js Files)",
                            explaination = "For production, code is kept in separate .js files. This promotes 'Separation of Concerns' and allows browsers to cache the file, similar to how Linux shared libraries (.so files) save memory by being reused.",
                            codeExample = "// In HTML: <script src='script.js'></script>\n\n// In script.js:\nfunction init() {\n  console.log('External app started');\n}",
                            afterCodeEplainations = "The 'src' attribute acts like a file path, pointing the browser to the logic's location."
                        ),
                        Headline(
                            headline = "The Render Process & Parser Blocking",
                            explaination = "When a browser hits a script tag without special attributes, it stops building the page to download and run it. This is 'parser blocking'—think of it like a sequential bash script where command B must wait for A.",
                            codeExample = "<script src='heavy-library.js'></script>",
                            afterCodeEplainations = "Large scripts can make a site feel 'frozen' during this download phase."
                        ),
                        Headline(
                            headline = "Modern Loading: Async & Defer",
                            explaination = "Modern JS uses 'async' and 'defer' to prevent blocking. 'Defer' downloads the script in the background and executes it only after the HTML is fully parsed. This is currently the industry standard.",
                            codeExample = "<script src='app.js' defer></script>",
                            tip = "Always use 'defer' for external scripts in the <head> to get the best performance and avoid null errors."
                        ),
                        Headline(
                            headline = "Modern Module System",
                            explaination = "Today we use 'type=module' to organize code into pieces that can import/export functionality. Modules automatically use 'strict mode' to prevent common coding errors.",
                            codeExample = "<script type='module' src='main.js'></script>"
                        )
                    ),
                    questions = listOf(
                        QuizQuestion("Which tag is used for JavaScript?", listOf("<js>", "<script>", "<javascript>", "<code_js>"), 1),
                        QuizQuestion("What is the best location for scripts for performance?", listOf("In the <head>", "Before the <html> tag", "At the bottom of the <body>", "Inside a <div>"), 2),
                        QuizQuestion("Which attribute links an external JS file?", listOf("href", "link", "src", "path"), 2),
                        QuizQuestion("What does the 'defer' attribute do?", listOf("Stops the script", "Hides the script", "Downloads in background and runs after parsing", "Deletes the script"), 2),
                        QuizQuestion("Why is External JS better for performance?", listOf("It is smaller", "It can be cached by the browser", "It runs faster", "It uses less RAM"), 1)
                    )
                ),

                // --- SUBTOPIC 3: DISPLAYING OUTPUT & DEBUGGING ---
                Subtopic(
                    sutopicId = 3,
                    subTopicName = "JS Displaying Output",
                    headlines = listOf(
                        Headline(
                            headline = "Data Visualization Streams",
                            explaination = "JavaScript output means showing results to the user or developer. It can be displayed in the console, dialog boxes, or directly inside HTML elements.",
                            codeExample = "// Different output streams\nconsole.log('For developers');\nalert('For urgent alerts');\ndocument.getElementById('msg').innerHTML = 'For users';"
                        ),
                        Headline(
                            headline = "Using the Console",
                            explaination = "The console is the primary tool for debugging. Beyond log(), you can use console.table() to visualize arrays of data clearly in the browser's DevTools (F12).",
                            codeExample = """
                            const servers = [
                                { name: "Nginx", status: "Active" },
                                { name: "Apache", status: "Down" }
                            ];
                            console.table(servers);
                        """.trimIndent(),
                            afterCodeEplainations = "The output is not visible to website users, making it safe for sensitive debugging info."
                        ),
                        Headline(
                            headline = "Writing to HTML Components",
                            explaination = "JavaScript can change content by selecting an element's ID. You use 'innerHTML' for HTML content or 'textContent' for plain text. Use <br> for line breaks within innerHTML.",
                            codeExample = """
                            <p id="status"></p>
                            <script>
                                document.getElementById("status").innerHTML = "System:<br>Online";
                            </script>
                        """.trimIndent(),
                            tip = "Careful: innerHTML can be a security risk (XSS). Use textContent if you don't need to render HTML tags."
                        ),
                        Headline(
                            headline = "Using Dialog Boxes",
                            explaination = "Dialog boxes like alert(), confirm(), and prompt() are popups. Note that they are 'blocking' operations; they freeze the browser's main thread until the user interacts.",
                            codeExample = "alert('Welcome to the JavaScript Compiler!');"
                        ),
                        Headline(
                            headline = "The Window Object",
                            explaination = "In the browser, 'window' is the global object. This means 'window.alert()' and 'alert()' are identical. It represents the browser window itself.",
                            codeExample = "window.console.log('Global window access');"
                        ),
                        Headline(
                            headline = "Dangerous Output: document.write()",
                            explaination = "JavaScript can write directly to the document stream. However, if document.write() is used after the page has finished loading, it will overwrite the entire HTML document.",
                            codeExample = "function wipe() {\n  document.write('The rest of the page is now gone.');\n}",
                            tip = "Avoid using document.write() in real applications. It is strictly for quick testing."
                        )
                    ),
                    questions = listOf(
                        QuizQuestion("Which method is best for debugging?", listOf("alert()", "console.log()", "document.write()", "window.print()"), 1),
                        QuizQuestion("How do you change the content of an HTML element?", listOf(".innerHTML", ".changeText", ".value", ".setContent"), 0),
                        QuizQuestion("What is a risk of using innerHTML with user input?", listOf("Slow loading", "Security (XSS)", "Color changes", "Syntax errors"), 1),
                        QuizQuestion("What happens if document.write() runs after the page loads?", listOf("Adds text at top", "Does nothing", "Wipes the entire page", "Opens a new tab"), 2),
                        QuizQuestion("Which command prints a table of data?", listOf("console.grid()", "console.table()", "console.view()", "console.list()"), 1)
                    )
                )
                ,




                Subtopic(
                    sutopicId=4,
                    subTopicName = "JS Statements",
                    headlines = listOf(

                        Headline(
                            headline = "JS Statements",
                            explaination = "JavaScript statements are instructions that tell the browser what to do. "
                                    + "Each statement is executed in the order it is written.",
                            codeExample = """
                let x = 10;
                let y = 20;
                let sum = x + y;
            """.trimIndent(),
                            afterCodeEplainations = "Each line is a separate statement. "
                                    + "JavaScript reads and runs them one by one."
                        ),

                        Headline(
                            explaination = "JavaScript statements usually end with a semicolon. "
                                    + "The semicolon separates one statement from another.",
                            codeExample = """
                let name = "John";
                let age = 25;
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "JavaScript allows multiple statements in one line, "
                                    + "but writing one statement per line makes the code easier to read.",
                            codeExample = """
                let a = 5; let b = 10; let c = a + b;
            """.trimIndent(),
                            tip = "For better readability, always write one statement per line."
                        ),

                        Headline(
                            headline = "Grouping JS Statements",
                            explaination = "JavaScript statements can be grouped together using curly braces {}. "
                                    + "Grouped statements are treated as a block of code.",
                            codeExample = """
                if (x > 5) {
                    console.log("x is greater than 5");
                    console.log("This is a block of statements");
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "JS Keywords",
                            explaination = "JavaScript keywords are reserved words that have special meanings. "
                                    + "They are used to define actions, variables, and control the program flow.",
                            codeExample = """
                let number = 10;

                if (number > 5) {
                    console.log("Number is greater than 5");
                }
            """.trimIndent(),
                            afterCodeEplainations = "`let` and `if` are JavaScript keywords and cannot be used as variable names."
                        )

                    ),
                    questions = listOf(
                        QuizQuestion("What is a JavaScript statement?", listOf("A style rule", "An instruction to the browser", "A type of variable", "A comment"), 1),
                        QuizQuestion("Which character is usually used to separate JS statements?", listOf("Colon (:)", "Comma (,)", "Semicolon (;)", "Full stop (.)"), 2),
                        QuizQuestion("Is it possible to write multiple statements on one line?", listOf("No, it causes an error", "Yes, but it's not recommended", "Only inside a function", "Only if they are empty"), 1),
                        QuizQuestion("What are curly braces {} used for in statements?", listOf("To create a comment", "To group statements into a block", "To multiply numbers", "To end the program"), 1),
                        QuizQuestion("In what order are JavaScript statements executed?", listOf("Randomly", "Bottom to top", "In the order they are written", "Alphabetically"), 2)
                    )
                ),

                Subtopic(
                    sutopicId=5,
                    subTopicName = "JS Syntax",questions = listOf(
                        QuizQuestion("Which keyword is used for a variable that should NOT change?", listOf("let", "var", "const", "change"), 2),
                        QuizQuestion("Is JavaScript case-sensitive?", listOf("Yes", "No", "Only for numbers", "Only in Linux"), 0),
                        QuizQuestion("Which is a correct way to declare a variable in modern JS?", listOf("variable x = 5;", "let x = 5;", "set x = 5;", "int x = 5;"), 1),
                        QuizQuestion("If you have 'let Name' and 'let name', how many variables exist?", listOf("One", "Two", "None (error)", "It depends on the browser"), 1),
                        QuizQuestion("What is the naming style 'userName' called?", listOf("snake_case", "PascalCase", "camelCase", "Flatcase"), 2)
                    ),
                    headlines = listOf(

                        Headline(
                            headline = "JS Syntax?",
                            explaination = "JavaScript syntax refers to the rules that define how JavaScript code is written "
                                    + "and structured. Following correct syntax helps the browser understand and execute the code."
                        ),

                        Headline(
                            headline = "Variable Declaration",
                            explaination = "Variable declaration means creating a variable to store data. "
                                    + "JavaScript allows variables to be declared using let, const, or var.",
                            codeExample = """
                let name = "John";
                const age = 30;
                var city = "Paris";
            """.trimIndent(),
                            afterCodeEplainations = "`let` is used for values that can change, "
                                    + "`const` is used for fixed values, and `var` is an older way to declare variables."
                        ),

                        Headline(
                            headline = "Case Sensitivity",
                            explaination = "JavaScript is case-sensitive, which means uppercase and lowercase letters "
                                    + "are treated as different.",
                            codeExample = """
                let userName = "Alice";
                let username = "Bob";
            """.trimIndent(),
                            tip = "Always use consistent naming styles like camelCase to avoid errors."
                        )

                    )
                ),





                Subtopic(
                    sutopicId=6,
                    questions = listOf(
                        QuizQuestion("How do you start a single-line comment in JS?", listOf("/*", "//", "", "/* and */", "[[ and ]]"), 2),
                        QuizQuestion("What happens to comments during program execution?", listOf("They are displayed in console", "They are ignored by the browser", "They make the code run faster", "They cause an error"), 1),
                        QuizQuestion("Why would you use a comment to 'disable' code?", listOf("To make the file smaller", "To test logic without deleting it", "To encrypt the code", "To change the variable type"), 1),
                        QuizQuestion("Can a single-line comment be placed at the end of a statement?", listOf("Yes", "No", "Only inside a block", "Only with const"), 0)
                    ),
                    subTopicName = "JS Comments",
                    headlines = listOf(

                        Headline(
                            headline = "JS Comments",
                            explaination = "JavaScript comments are used to describe the code and make it easier to understand. "
                                    + "Comments are ignored by the browser and do not affect program execution."
                        ),

                        Headline(
                            headline = "Single-Line Comments",
                            explaination = "Single-line comments are used to comment only one line of code.",
                            codeExample = """
                // This is a single-line comment
                let x = 10; // This comment explains the variable
            """.trimIndent(),
                            afterCodeEplainations = "Anything written after // is treated as a comment and is not executed."
                        ),

                        Headline(
                            explaination = "Single-line comments are often used for short explanations or notes in the code.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Comments can also be used to explain complex logic or important steps in a program.",
                            tip = "Write clear and meaningful comments, but avoid commenting obvious code.",
                            codeExample = """
                // Calculate total price
                let total = price + tax;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Multi-Line Comments",
                            explaination = "Multi-line comments are used to comment multiple lines at once.",
                            codeExample = """
                /*
                  This is a multi-line comment
                  It can span multiple lines
                */
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Disabling Code Using Comments",
                            explaination = "Comments can be used to temporarily disable code without deleting it.",
                            codeExample = """
                // console.log("This line will not run");

                /*
                alert("This code is disabled");
                */
            """.trimIndent()
                        )

                    )
                ),


                Subtopic(
                    sutopicId = 7,
                    questions = listOf(
                        QuizQuestion("What is the result of 'let x;' if you log x?", listOf("0", "null", "undefined", "Error"), 2),
                        QuizQuestion("Which operator is used to assign a value to a variable?", listOf("==", "===", "=", ":="), 2),
                        QuizQuestion("What happens if you try to change a 'const' variable?", listOf("It changes successfully", "It resets to zero", "It causes a runtime error", "It creates a new variable"), 2),
                        QuizQuestion("Which is a valid variable name?", listOf("1stUser", "user-name", "_totalAmount", "let"), 2),
                        QuizQuestion("When should you use 'let' instead of 'const'?", listOf("When the value will stay the same", "When the value needs to be updated later", "Only for strings", "Only for numbers"), 1)
                    ),
                    subTopicName = "JS Variables",
                    headlines = listOf(

                        Headline(
                            headline = "JS Variables",
                            explaination = "Variables are used to store data values in JavaScript. "
                                    + "A variable can hold different types of data such as numbers or text.",
                            codeExample = "let name;",
                            afterCodeEplainations = "This declares a variable named name without assigning a value."
                        ),

                        Headline(
                            explaination = "The assignment operator (=) is used to assign a value to a variable.",
                            codeExample = """
                let age = 25;
                let city = "New York";
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "Variables can store different types of data and their values can be used later in the program.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Undefined Variable",
                            explaination = "A variable that is declared but not assigned a value is called an undefined variable.",
                            codeExample = """
                let x;
                console.log(x);
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Changing Value",
                            explaination = "The value of a variable can be changed after it is declared.",
                            codeExample = """
                let score = 10;
                score = 20;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Constant Variables",
                            explaination = "Constant variables are declared using const and their values cannot be changed.",
                            codeExample = """
                const pi = 3.14;
            """.trimIndent(),
                            afterCodeEplainations = "Trying to change a const variable will cause an error."
                        ),

                        Headline(
                            explaination = "Use let for values that change and const for values that should stay the same.",
                            tip = "Always prefer const unless you know the value will change.",
                            codeExample = """
                let count = 1;
                const maxLimit = 100;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Naming Variables",
                            explaination = "Variable names should be meaningful and describe the data they store."
                        ),

                        Headline(
                            headline = "Rules for Naming Variables",
                            explaination = "Variable names must start with a letter, underscore (_), or dollar sign ($) "
                                    + "and cannot contain spaces.",
                            tip = "Use camelCase for variable names, like userName or totalPrice."
                        )

                    ),
                ),



                Subtopic(
                    sutopicId = 8,
                    questions = listOf(
                        QuizQuestion("What keyword is used to create a function?", listOf("method", "function", "def", "routine"), 1),
                        QuizQuestion("How do you 'call' a function named 'myFunc'?", listOf("call myFunc", "myFunc[]", "myFunc()", "run(myFunc)"), 2),
                        QuizQuestion("What does the 'return' statement do?", listOf("Restarts the function", "Exits the function and sends back a value", "Repeats the code", "Deletes the variable"), 1),
                        QuizQuestion("A variable declared inside a function is:", listOf("Global", "Local (Function Scope)", "Shared", "Permanent"), 1),
                        QuizQuestion("What happens if you define a function but never call it?", listOf("The code runs once", "The browser crashes", "The code inside never executes", "It runs automatically"), 2)
                    ),
                    subTopicName = "JS Functions",

                    headlines = listOf(

                        Headline(
                            headline = "JS Functions",
                            explaination = "Functions are blocks of code designed to perform a specific task. "
                                    + "They help organize code and avoid repetition."
                        ),

                        Headline(
                            headline = "Function Definition",
                            explaination = "A function definition creates a function using the function keyword, "
                                    + "a name, and parentheses.",
                            tip = "Choose clear and meaningful function names.",
                            codeExample = """
                function greet() {
                    console.log("Hello!");
                }
            """.trimIndent(),
                            afterCodeEplainations = "This defines a function named greet, but it will not run until called."
                        ),

                        Headline(
                            explaination = "Functions can contain one or more statements inside their body.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Functions can be reused many times in a program.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Calling a Function",
                            explaination = "Calling a function means executing the code inside the function.",
                            codeExample = """
                greet();
            """.trimIndent(),
                            afterCodeEplainations = "This line runs the greet function."
                        ),

                        Headline(
                            explaination = "A function can be called multiple times whenever needed.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "The return Statement",
                            explaination = "The return statement sends a value back from the function.",
                            codeExample = """
                function add(a, b) {
                    return a + b;
                }
            """.trimIndent(),
                            afterCodeEplainations = "The function returns the result of a + b."
                        ),

                        Headline(
                            explaination = "Returned values can be stored in variables.",
                            codeExample = """
                let result = add(5, 3);
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "Once return is executed, the function stops running.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Not all functions need to return a value.",
                            tip = "Use return only when you need a result from the function.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Function Scope",
                            explaination = "Variables declared inside a function can only be used within that function.",
                            codeExample = """
                function test() {
                    let x = 10;
                    console.log(x);
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Global Vaiables",
                            explaination = "Global variables are declared outside functions and can be accessed anywhere in the code.",
                            codeExample = """
                let message = "Hello";

                function showMessage() {
                    console.log(message);
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Why Use Functions",
                            explaination = "Functions make code reusable, organized, and easier to maintain.",
                            tip = "Break large programs into smaller functions.",
                            codeExample = """
                function calculateTotal(price, tax) {
                    return price + tax;
                }
            """.trimIndent(),
                            afterCodeEplainations = "This function can be reused whenever total calculation is needed."
                        )

                    )
                ),




                Subtopic(
                    sutopicId = 9,
                    questions = listOf(
                        QuizQuestion("Which event fires when a user clicks an HTML element?", listOf("onhover", "onclick", "onpress", "onchange"), 1),
                        QuizQuestion("What is the modern method to attach an event handler?", listOf("on()", "attachEvent()", "addEventListener()", "setEvent()"), 2),
                        QuizQuestion("How do you prevent a form from refreshing the page on submit?", listOf("e.stop()", "e.preventDefault()", "e.halt()", "e.ignore()"), 1),
                        QuizQuestion("Which event fires as soon as the HTML is loaded but before images load?", listOf("onload", "DOMReady", "DOMContentLoaded", "onfinish"), 2),
                        QuizQuestion("What is the difference between 'focus' and 'blur'?", listOf("There is no difference", "Focus is entering a field, blur is leaving it", "Focus is for buttons, blur is for text", "Blur happens only on scroll"), 1),
                        QuizQuestion("Which event tracks every single keystroke in an input?", listOf("change", "submit", "input", "blur"), 2),
                        QuizQuestion("What does 'window.scrollY' tell you during a scroll event?", listOf("The width of the page", "The vertical distance scrolled in pixels", "The speed of scrolling", "The number of elements on screen"), 1)
                    ),
                    subTopicName = "JS Events",
                    headlines = listOf(
                        Headline(
                            headline = "JS Events",
                            explaination = "JavaScript events are actions that happen in the browser, such as clicking a button, typing on the keyboard, or loading a page.",
                            codeExample = """
                <button onclick="showAlert()">Click Me</button>
                <script>
                    function showAlert() {
                        alert("Button clicked!");
                    }
                </script>
            """.trimIndent(),
                            afterCodeEplainations = "The function runs when the button is clicked."
                        ),

                        Headline(
                            headline = "Inline Event Handlers",
                            explaination = "Inline event handlers are written directly inside HTML elements using attributes like onclick or onmouseover.",
                            codeExample = """
                <button onclick="alert('Hello!')">Click</button>
            """.trimIndent(),
                            afterCodeEplainations = "Inline events are easy to use but not recommended for large applications as they mix logic with structure."
                        ),

                        Headline(
                            headline = "The addEventListener() Method",
                            explaination = "addEventListener() is the modern way to attach event handlers. It allows multiple listeners for a single event.",
                            codeExample = """
                <button id="btn">Click Me</button>
                <script>
                    document.getElementById("btn")
                        .addEventListener("click", () => {
                            alert("Modern click handler!");
                        });
                </script>
            """.trimIndent(),
                            afterCodeEplainations = "This method keeps JavaScript separate from HTML and is easier to maintain."
                        ),

                        Headline(
                            headline = "The DOMContentLoaded Event",
                            explaination = "This event fires when the HTML document has been completely loaded and parsed, without waiting for images or stylesheets.",
                            codeExample = """
                <script>
                    document.addEventListener("DOMContentLoaded", () => {
                        console.log("DOM is ready, you can now manipulate elements!");
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The input Event",
                            explaination = "Unlike 'change', the 'input' event fires immediately every time the value of an element changes.",
                            codeExample = """
                <input type="text" id="myInput">
                <p id="output"></p>
                <script>
                    document.getElementById("myInput").addEventListener("input", (e) => {
                        document.getElementById("output").innerText = e.target.value;
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Mouse Events: mousedown & mouseup",
                            explaination = "These track the exact moments a mouse button is pressed down and then released.",
                            codeExample = """
                <button id="holdBtn">Hold Me</button>
                <script>
                    const btn = document.getElementById("holdBtn");
                    btn.addEventListener("mousedown", () => btn.innerText = "Pressed!");
                    btn.addEventListener("mouseup", () => btn.innerText = "Released!");
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The keydown Event",
                            explaination = "The keydown event occurs the moment a key is pressed. It is more reliable than keypress for non-character keys.",
                            codeExample = """
                <script>
                    window.addEventListener("keydown", (event) => {
                        console.log("Key pressed: " + event.key);
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The submit Event",
                            explaination = "This event occurs when a form is submitted. It is usually used to validate data or prevent the page from refreshing.",
                            codeExample = """
                <form id="myForm">
                    <input type="text" required>
                    <button type="submit">Send</button>
                </form>
                <script>
                    document.getElementById("myForm").addEventListener("submit", (e) => {
                        e.preventDefault(); // Stops the page from refreshing
                        alert("Form submitted safely!");
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The focus and blur Events",
                            explaination = "Focus happens when you enter an input field; blur happens when you leave it.",
                            codeExample = """
                <input type="text" id="fld" placeholder="Focus me">
                <script>
                    const fld = document.getElementById("fld");
                    fld.onfocus = () => fld.style.border = "2px solid blue";
                    fld.onblur = () => fld.style.border = "1px solid gray";
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The scroll Event",
                            explaination = "The scroll event fires when the document view or an element has been scrolled.",
                            codeExample = """
                <script>
                    window.onscroll = () => {
                        console.log("You are scrolling at: " + window.scrollY + "px");
                    };
                </script>
            """.trimIndent(),
                            tip = "Use 'throttling' or 'debouncing' with scroll events to maintain browser performance."
                        ),

                        Headline(
                            headline = "The contextmenu Event",
                            explaination = "This event fires when the user attempts to open a context menu (usually by right-clicking).",
                            codeExample = """
                <div style="background: lightgray; height: 50px;">Right-click here</div>
                <script>
                    document.addEventListener("contextmenu", (e) => {
                        e.preventDefault();
                        alert("Right-click is disabled!");
                    });
                </script>
            """.trimIndent()
                        )
                    )
                )









            ),


            Subtopic(
                sutopicId=13,
                subTopicName = "HTML Links",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML Links",
                        majorHeadileExplanation = "Explain breifly" ,
                        headline = "Uses of Links in Html",
                        explaination = "Explain bulleting",
                        tip = "give tip"
                    ),
                    Headline(
                        headline = "Link Structure",
                        explaination = "explain showing how ,with bulleting ",
                        codeExample = " example ",

                    ),
                    Headline(
                        headline = "Internal Linking ",
                        explaination = "",
                        codeExample = "give amazing runnable html example",

                    ),
                    Headline(
                        headline = "External Linking ",
                        explaination = "",
                        codeExample = "give amazing runnable html example use https://nickdieda.web.app",


                    ),
                    Headline(
                        headline = "inPage Linking ",
                        explaination = "",
                        codeExample = "give amazing runnable html example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        headline = "Open link in new tap example",
                        explaination = "",
                        codeExample = "give amazing runnable html example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "amazing",
                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ) ,
            Subtopic(
                sutopicId=14,
                subTopicName = "Line Break",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Line Break",
                        majorHeadileExplanation = "Explain showing tag used ",

                        tip = "give",
                             ),
                    Headline(
                        headline = "without break",
                        codeExample ="give a runnable code examples you can use comment to explain inside the code",

                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "with break",
                        codeExample ="give a runnable code examples you can use comment to explain inside the code",

                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )

                ),
            ),
            Subtopic(
                sutopicId=15,
                subTopicName = "Horizontal Rule/Line",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Horizontal Rule/Line",
                        majorHeadileExplanation = "Explain showing tag used" ,
                        codeExample = "give a runnable involving ",
                        tip = "give tip"
                    ),
                    Headline(
                        headline = "Styling the line ",
                        explaination = "List well commonly used colors and how they are used ,hex,rgb",
                        codeExample = "give runnable html example ",
                    ),
                    Headline(
                        headline = "heights and width ",
                        codeExample = "give amazing runnable html involving all text alignment example",


                        ),
                    Headline(
                        headline = "colors ",
                        codeExample = "give amazing runnable html involving all text color example",

                        ),
                    Headline(
                        headline = "Others Commonly used ",
                        codeExample = "give amazing runnable html involving commonly used to style horizontal rule example",


                        ),


                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "",
                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ),
            Subtopic(
                sutopicId=16,
                subTopicName = "Text Formating",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML Text Formating",
                        majorHeadileExplanation = "Explain  ",
                             tip = "give",

                    ),
                    Headline(
                        headline = "Elements for Formatting Text",
                        explaination = "explain and llist all the elemts and there tags and uses in bulleting ",
                        codeExample = "good example involving all",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "another example",

                        codeExample = "good example",


                        ),

                    questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )

                ),


                // --- SUBTOPIC 2: WRITING & INTEGRATING JS ---
                Subtopic(
                    sutopicId = 2,
                    subTopicName = "JS Writing Code",
                    headlines = listOf(
                        Headline(
                            headline = "The <script> Tag",
                            explaination = "JavaScript is executed by the browser's engine. To run it, code is either embedded directly into HTML or linked as an external script using the <script> tag. This tag tells the browser to pause HTML parsing and execute the logic inside.",
                            codeExample = "<script>\n  console.log('Writing JS directly in HTML!');\n</script>",
                            afterCodeEplainations = "Browsers read files from top to bottom, executing scripts as they are encountered."
                        ),
                        Headline(
                            headline = "Internal JS & Placement",
                            explaination = "Internal JS lives inside your HTML file. If placed in the <head>, it loads early but can slow down visual rendering. If placed at the bottom of the <body>, the page structure loads first, which is a common performance optimization.",
                            codeExample = "<body>\n  <h1 id='title'>Hello</h1>\n  <script>\n    // This runs after the <h1> is created\n    console.log('Body script executed');\n  </script>\n</body>",
                            tip = "Placing scripts in the head might cause errors if the script tries to access HTML elements that haven't been created yet."
                        ),
                        Headline(
                            headline = "External JS (.js Files)",
                            explaination = "For production, code is kept in separate .js files. This promotes 'Separation of Concerns' and allows browsers to cache the file, similar to how Linux shared libraries (.so files) save memory by being reused.",
                            codeExample = "// In HTML: <script src='script.js'></script>\n\n// In script.js:\nfunction init() {\n  console.log('External app started');\n}",
                            afterCodeEplainations = "The 'src' attribute acts like a file path, pointing the browser to the logic's location."
                        ),
                        Headline(
                            headline = "The Render Process & Parser Blocking",
                            explaination = "When a browser hits a script tag without special attributes, it stops building the page to download and run it. This is 'parser blocking'—think of it like a sequential bash script where command B must wait for A.",
                            codeExample = "<script src='heavy-library.js'></script>",
                            afterCodeEplainations = "Large scripts can make a site feel 'frozen' during this download phase."
                        ),
                        Headline(
                            headline = "Modern Loading: Async & Defer",
                            explaination = "Modern JS uses 'async' and 'defer' to prevent blocking. 'Defer' downloads the script in the background and executes it only after the HTML is fully parsed. This is currently the industry standard.",
                            codeExample = "<script src='app.js' defer></script>",
                            tip = "Always use 'defer' for external scripts in the <head> to get the best performance and avoid null errors."
                        ),
                        Headline(
                            headline = "Modern Module System",
                            explaination = "Today we use 'type=module' to organize code into pieces that can import/export functionality. Modules automatically use 'strict mode' to prevent common coding errors.",
                            codeExample = "<script type='module' src='main.js'></script>"
                        )
                    ),
                    questions = listOf(
                        QuizQuestion("Which tag is used for JavaScript?", listOf("<js>", "<script>", "<javascript>", "<code_js>"), 1),
                        QuizQuestion("What is the best location for scripts for performance?", listOf("In the <head>", "Before the <html> tag", "At the bottom of the <body>", "Inside a <div>"), 2),
                        QuizQuestion("Which attribute links an external JS file?", listOf("href", "link", "src", "path"), 2),
                        QuizQuestion("What does the 'defer' attribute do?", listOf("Stops the script", "Hides the script", "Downloads in background and runs after parsing", "Deletes the script"), 2),
                        QuizQuestion("Why is External JS better for performance?", listOf("It is smaller", "It can be cached by the browser", "It runs faster", "It uses less RAM"), 1)
                    )
                ),

                // --- SUBTOPIC 3: DISPLAYING OUTPUT & DEBUGGING ---
                Subtopic(
                    sutopicId = 3,
                    subTopicName = "JS Displaying Output",
                    headlines = listOf(
                        Headline(
                            headline = "Data Visualization Streams",
                            explaination = "JavaScript output means showing results to the user or developer. It can be displayed in the console, dialog boxes, or directly inside HTML elements.",
                            codeExample = "// Different output streams\nconsole.log('For developers');\nalert('For urgent alerts');\ndocument.getElementById('msg').innerHTML = 'For users';"
                        ),
                        Headline(
                            headline = "Using the Console",
                            explaination = "The console is the primary tool for debugging. Beyond log(), you can use console.table() to visualize arrays of data clearly in the browser's DevTools (F12).",
                            codeExample = """
                            const servers = [
                                { name: "Nginx", status: "Active" },
                                { name: "Apache", status: "Down" }
                            ];
                            console.table(servers);
                        """.trimIndent(),
                            afterCodeEplainations = "The output is not visible to website users, making it safe for sensitive debugging info."
                        ),
                        Headline(
                            headline = "Writing to HTML Components",
                            explaination = "JavaScript can change content by selecting an element's ID. You use 'innerHTML' for HTML content or 'textContent' for plain text. Use <br> for line breaks within innerHTML.",
                            codeExample = """
                            <p id="status"></p>
                            <script>
                                document.getElementById("status").innerHTML = "System:<br>Online";
                            </script>
                        """.trimIndent(),
                            tip = "Careful: innerHTML can be a security risk (XSS). Use textContent if you don't need to render HTML tags."
                        ),
                        Headline(
                            headline = "Using Dialog Boxes",
                            explaination = "Dialog boxes like alert(), confirm(), and prompt() are popups. Note that they are 'blocking' operations; they freeze the browser's main thread until the user interacts.",
                            codeExample = "alert('Welcome to the JavaScript Compiler!');"
                        ),
                        Headline(
                            headline = "The Window Object",
                            explaination = "In the browser, 'window' is the global object. This means 'window.alert()' and 'alert()' are identical. It represents the browser window itself.",
                            codeExample = "window.console.log('Global window access');"
                        ),
                        Headline(
                            headline = "Dangerous Output: document.write()",
                            explaination = "JavaScript can write directly to the document stream. However, if document.write() is used after the page has finished loading, it will overwrite the entire HTML document.",
                            codeExample = "function wipe() {\n  document.write('The rest of the page is now gone.');\n}",
                            tip = "Avoid using document.write() in real applications. It is strictly for quick testing."
                        )
                    ),
                    questions = listOf(
                        QuizQuestion("Which method is best for debugging?", listOf("alert()", "console.log()", "document.write()", "window.print()"), 1),
                        QuizQuestion("How do you change the content of an HTML element?", listOf(".innerHTML", ".changeText", ".value", ".setContent"), 0),
                        QuizQuestion("What is a risk of using innerHTML with user input?", listOf("Slow loading", "Security (XSS)", "Color changes", "Syntax errors"), 1),
                        QuizQuestion("What happens if document.write() runs after the page loads?", listOf("Adds text at top", "Does nothing", "Wipes the entire page", "Opens a new tab"), 2),
                        QuizQuestion("Which command prints a table of data?", listOf("console.grid()", "console.table()", "console.view()", "console.list()"), 1)
                    )
                )
                ,




                Subtopic(
                    sutopicId=4,
                    subTopicName = "JS Statements",
                    headlines = listOf(

                        Headline(
                            headline = "JS Statements",
                            explaination = "JavaScript statements are instructions that tell the browser what to do. "
                                    + "Each statement is executed in the order it is written.",
                            codeExample = """
                let x = 10;
                let y = 20;
                let sum = x + y;
            """.trimIndent(),
                            afterCodeEplainations = "Each line is a separate statement. "
                                    + "JavaScript reads and runs them one by one."
                        ),

                        Headline(
                            explaination = "JavaScript statements usually end with a semicolon. "
                                    + "The semicolon separates one statement from another.",
                            codeExample = """
                let name = "John";
                let age = 25;
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "JavaScript allows multiple statements in one line, "
                                    + "but writing one statement per line makes the code easier to read.",
                            codeExample = """
                let a = 5; let b = 10; let c = a + b;
            """.trimIndent(),
                            tip = "For better readability, always write one statement per line."
                        ),

                        Headline(
                            headline = "Grouping JS Statements",
                            explaination = "JavaScript statements can be grouped together using curly braces {}. "
                                    + "Grouped statements are treated as a block of code.",
                            codeExample = """
                if (x > 5) {
                    console.log("x is greater than 5");
                    console.log("This is a block of statements");
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "JS Keywords",
                            explaination = "JavaScript keywords are reserved words that have special meanings. "
                                    + "They are used to define actions, variables, and control the program flow.",
                            codeExample = """
                let number = 10;

                if (number > 5) {
                    console.log("Number is greater than 5");
                }
            """.trimIndent(),
                            afterCodeEplainations = "`let` and `if` are JavaScript keywords and cannot be used as variable names."
                        )

                    ),
                    questions = listOf(
                        QuizQuestion("What is a JavaScript statement?", listOf("A style rule", "An instruction to the browser", "A type of variable", "A comment"), 1),
                        QuizQuestion("Which character is usually used to separate JS statements?", listOf("Colon (:)", "Comma (,)", "Semicolon (;)", "Full stop (.)"), 2),
                        QuizQuestion("Is it possible to write multiple statements on one line?", listOf("No, it causes an error", "Yes, but it's not recommended", "Only inside a function", "Only if they are empty"), 1),
                        QuizQuestion("What are curly braces {} used for in statements?", listOf("To create a comment", "To group statements into a block", "To multiply numbers", "To end the program"), 1),
                        QuizQuestion("In what order are JavaScript statements executed?", listOf("Randomly", "Bottom to top", "In the order they are written", "Alphabetically"), 2)
                    )
                ),

                Subtopic(
                    sutopicId=5,
                    subTopicName = "JS Syntax",questions = listOf(
                        QuizQuestion("Which keyword is used for a variable that should NOT change?", listOf("let", "var", "const", "change"), 2),
                        QuizQuestion("Is JavaScript case-sensitive?", listOf("Yes", "No", "Only for numbers", "Only in Linux"), 0),
                        QuizQuestion("Which is a correct way to declare a variable in modern JS?", listOf("variable x = 5;", "let x = 5;", "set x = 5;", "int x = 5;"), 1),
                        QuizQuestion("If you have 'let Name' and 'let name', how many variables exist?", listOf("One", "Two", "None (error)", "It depends on the browser"), 1),
                        QuizQuestion("What is the naming style 'userName' called?", listOf("snake_case", "PascalCase", "camelCase", "Flatcase"), 2)
                    ),
                    headlines = listOf(

                        Headline(
                            headline = "JS Syntax?",
                            explaination = "JavaScript syntax refers to the rules that define how JavaScript code is written "
                                    + "and structured. Following correct syntax helps the browser understand and execute the code."
                        ),

                        Headline(
                            headline = "Variable Declaration",
                            explaination = "Variable declaration means creating a variable to store data. "
                                    + "JavaScript allows variables to be declared using let, const, or var.",
                            codeExample = """
                let name = "John";
                const age = 30;
                var city = "Paris";
            """.trimIndent(),
                            afterCodeEplainations = "`let` is used for values that can change, "
                                    + "`const` is used for fixed values, and `var` is an older way to declare variables."
                        ),

                        Headline(
                            headline = "Case Sensitivity",
                            explaination = "JavaScript is case-sensitive, which means uppercase and lowercase letters "
                                    + "are treated as different.",
                            codeExample = """
                let userName = "Alice";
                let username = "Bob";
            """.trimIndent(),
                            tip = "Always use consistent naming styles like camelCase to avoid errors."
                        )

                    )
                ),





                Subtopic(
                    sutopicId=6,
                    questions = listOf(
                        QuizQuestion("How do you start a single-line comment in JS?", listOf("/*", "//", "", "/* and */", "[[ and ]]"), 2),
                        QuizQuestion("What happens to comments during program execution?", listOf("They are displayed in console", "They are ignored by the browser", "They make the code run faster", "They cause an error"), 1),
                        QuizQuestion("Why would you use a comment to 'disable' code?", listOf("To make the file smaller", "To test logic without deleting it", "To encrypt the code", "To change the variable type"), 1),
                        QuizQuestion("Can a single-line comment be placed at the end of a statement?", listOf("Yes", "No", "Only inside a block", "Only with const"), 0)
                    ),
                    subTopicName = "JS Comments",
                    headlines = listOf(

                        Headline(
                            headline = "JS Comments",
                            explaination = "JavaScript comments are used to describe the code and make it easier to understand. "
                                    + "Comments are ignored by the browser and do not affect program execution."
                        ),

                        Headline(
                            headline = "Single-Line Comments",
                            explaination = "Single-line comments are used to comment only one line of code.",
                            codeExample = """
                // This is a single-line comment
                let x = 10; // This comment explains the variable
            """.trimIndent(),
                            afterCodeEplainations = "Anything written after // is treated as a comment and is not executed."
                        ),

                        Headline(
                            explaination = "Single-line comments are often used for short explanations or notes in the code.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Comments can also be used to explain complex logic or important steps in a program.",
                            tip = "Write clear and meaningful comments, but avoid commenting obvious code.",
                            codeExample = """
                // Calculate total price
                let total = price + tax;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Multi-Line Comments",
                            explaination = "Multi-line comments are used to comment multiple lines at once.",
                            codeExample = """
                /*
                  This is a multi-line comment
                  It can span multiple lines
                */
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Disabling Code Using Comments",
                            explaination = "Comments can be used to temporarily disable code without deleting it.",
                            codeExample = """
                // console.log("This line will not run");

                /*
                alert("This code is disabled");
                */
            """.trimIndent()
                        )

                    )
                ),


                Subtopic(
                    sutopicId = 7,
                    questions = listOf(
                        QuizQuestion("What is the result of 'let x;' if you log x?", listOf("0", "null", "undefined", "Error"), 2),
                        QuizQuestion("Which operator is used to assign a value to a variable?", listOf("==", "===", "=", ":="), 2),
                        QuizQuestion("What happens if you try to change a 'const' variable?", listOf("It changes successfully", "It resets to zero", "It causes a runtime error", "It creates a new variable"), 2),
                        QuizQuestion("Which is a valid variable name?", listOf("1stUser", "user-name", "_totalAmount", "let"), 2),
                        QuizQuestion("When should you use 'let' instead of 'const'?", listOf("When the value will stay the same", "When the value needs to be updated later", "Only for strings", "Only for numbers"), 1)
                    ),
                    subTopicName = "JS Variables",
                    headlines = listOf(

                        Headline(
                            headline = "JS Variables",
                            explaination = "Variables are used to store data values in JavaScript. "
                                    + "A variable can hold different types of data such as numbers or text.",
                            codeExample = "let name;",
                            afterCodeEplainations = "This declares a variable named name without assigning a value."
                        ),

                        Headline(
                            explaination = "The assignment operator (=) is used to assign a value to a variable.",
                            codeExample = """
                let age = 25;
                let city = "New York";
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "Variables can store different types of data and their values can be used later in the program.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Undefined Variable",
                            explaination = "A variable that is declared but not assigned a value is called an undefined variable.",
                            codeExample = """
                let x;
                console.log(x);
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Changing Value",
                            explaination = "The value of a variable can be changed after it is declared.",
                            codeExample = """
                let score = 10;
                score = 20;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Constant Variables",
                            explaination = "Constant variables are declared using const and their values cannot be changed.",
                            codeExample = """
                const pi = 3.14;
            """.trimIndent(),
                            afterCodeEplainations = "Trying to change a const variable will cause an error."
                        ),

                        Headline(
                            explaination = "Use let for values that change and const for values that should stay the same.",
                            tip = "Always prefer const unless you know the value will change.",
                            codeExample = """
                let count = 1;
                const maxLimit = 100;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Naming Variables",
                            explaination = "Variable names should be meaningful and describe the data they store."
                        ),

                        Headline(
                            headline = "Rules for Naming Variables",
                            explaination = "Variable names must start with a letter, underscore (_), or dollar sign ($) "
                                    + "and cannot contain spaces.",
                            tip = "Use camelCase for variable names, like userName or totalPrice."
                        )

                    ),
                ),



                Subtopic(
                    sutopicId = 8,
                    questions = listOf(
                        QuizQuestion("What keyword is used to create a function?", listOf("method", "function", "def", "routine"), 1),
                        QuizQuestion("How do you 'call' a function named 'myFunc'?", listOf("call myFunc", "myFunc[]", "myFunc()", "run(myFunc)"), 2),
                        QuizQuestion("What does the 'return' statement do?", listOf("Restarts the function", "Exits the function and sends back a value", "Repeats the code", "Deletes the variable"), 1),
                        QuizQuestion("A variable declared inside a function is:", listOf("Global", "Local (Function Scope)", "Shared", "Permanent"), 1),
                        QuizQuestion("What happens if you define a function but never call it?", listOf("The code runs once", "The browser crashes", "The code inside never executes", "It runs automatically"), 2)
                    ),
                    subTopicName = "JS Functions",

                    headlines = listOf(

                        Headline(
                            headline = "JS Functions",
                            explaination = "Functions are blocks of code designed to perform a specific task. "
                                    + "They help organize code and avoid repetition."
                        ),

                        Headline(
                            headline = "Function Definition",
                            explaination = "A function definition creates a function using the function keyword, "
                                    + "a name, and parentheses.",
                            tip = "Choose clear and meaningful function names.",
                            codeExample = """
                function greet() {
                    console.log("Hello!");
                }
            """.trimIndent(),
                            afterCodeEplainations = "This defines a function named greet, but it will not run until called."
                        ),

                        Headline(
                            explaination = "Functions can contain one or more statements inside their body.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Functions can be reused many times in a program.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Calling a Function",
                            explaination = "Calling a function means executing the code inside the function.",
                            codeExample = """
                greet();
            """.trimIndent(),
                            afterCodeEplainations = "This line runs the greet function."
                        ),

                        Headline(
                            explaination = "A function can be called multiple times whenever needed.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "The return Statement",
                            explaination = "The return statement sends a value back from the function.",
                            codeExample = """
                function add(a, b) {
                    return a + b;
                }
            """.trimIndent(),
                            afterCodeEplainations = "The function returns the result of a + b."
                        ),

                        Headline(
                            explaination = "Returned values can be stored in variables.",
                            codeExample = """
                let result = add(5, 3);
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "Once return is executed, the function stops running.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Not all functions need to return a value.",
                            tip = "Use return only when you need a result from the function.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Function Scope",
                            explaination = "Variables declared inside a function can only be used within that function.",
                            codeExample = """
                function test() {
                    let x = 10;
                    console.log(x);
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Global Vaiables",
                            explaination = "Global variables are declared outside functions and can be accessed anywhere in the code.",
                            codeExample = """
                let message = "Hello";

                function showMessage() {
                    console.log(message);
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Why Use Functions",
                            explaination = "Functions make code reusable, organized, and easier to maintain.",
                            tip = "Break large programs into smaller functions.",
                            codeExample = """
                function calculateTotal(price, tax) {
                    return price + tax;
                }
            """.trimIndent(),
                            afterCodeEplainations = "This function can be reused whenever total calculation is needed."
                        )

                    )
                ),




                Subtopic(
                    sutopicId = 9,
                    questions = listOf(
                        QuizQuestion("Which event fires when a user clicks an HTML element?", listOf("onhover", "onclick", "onpress", "onchange"), 1),
                        QuizQuestion("What is the modern method to attach an event handler?", listOf("on()", "attachEvent()", "addEventListener()", "setEvent()"), 2),
                        QuizQuestion("How do you prevent a form from refreshing the page on submit?", listOf("e.stop()", "e.preventDefault()", "e.halt()", "e.ignore()"), 1),
                        QuizQuestion("Which event fires as soon as the HTML is loaded but before images load?", listOf("onload", "DOMReady", "DOMContentLoaded", "onfinish"), 2),
                        QuizQuestion("What is the difference between 'focus' and 'blur'?", listOf("There is no difference", "Focus is entering a field, blur is leaving it", "Focus is for buttons, blur is for text", "Blur happens only on scroll"), 1),
                        QuizQuestion("Which event tracks every single keystroke in an input?", listOf("change", "submit", "input", "blur"), 2),
                        QuizQuestion("What does 'window.scrollY' tell you during a scroll event?", listOf("The width of the page", "The vertical distance scrolled in pixels", "The speed of scrolling", "The number of elements on screen"), 1)
                    ),
                    subTopicName = "JS Events",
                    headlines = listOf(
                        Headline(
                            headline = "JS Events",
                            explaination = "JavaScript events are actions that happen in the browser, such as clicking a button, typing on the keyboard, or loading a page.",
                            codeExample = """
                <button onclick="showAlert()">Click Me</button>
                <script>
                    function showAlert() {
                        alert("Button clicked!");
                    }
                </script>
            """.trimIndent(),
                            afterCodeEplainations = "The function runs when the button is clicked."
                        ),

                        Headline(
                            headline = "Inline Event Handlers",
                            explaination = "Inline event handlers are written directly inside HTML elements using attributes like onclick or onmouseover.",
                            codeExample = """
                <button onclick="alert('Hello!')">Click</button>
            """.trimIndent(),
                            afterCodeEplainations = "Inline events are easy to use but not recommended for large applications as they mix logic with structure."
                        ),

                        Headline(
                            headline = "The addEventListener() Method",
                            explaination = "addEventListener() is the modern way to attach event handlers. It allows multiple listeners for a single event.",
                            codeExample = """
                <button id="btn">Click Me</button>
                <script>
                    document.getElementById("btn")
                        .addEventListener("click", () => {
                            alert("Modern click handler!");
                        });
                </script>
            """.trimIndent(),
                            afterCodeEplainations = "This method keeps JavaScript separate from HTML and is easier to maintain."
                        ),

                        Headline(
                            headline = "The DOMContentLoaded Event",
                            explaination = "This event fires when the HTML document has been completely loaded and parsed, without waiting for images or stylesheets.",
                            codeExample = """
                <script>
                    document.addEventListener("DOMContentLoaded", () => {
                        console.log("DOM is ready, you can now manipulate elements!");
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The input Event",
                            explaination = "Unlike 'change', the 'input' event fires immediately every time the value of an element changes.",
                            codeExample = """
                <input type="text" id="myInput">
                <p id="output"></p>
                <script>
                    document.getElementById("myInput").addEventListener("input", (e) => {
                        document.getElementById("output").innerText = e.target.value;
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Mouse Events: mousedown & mouseup",
                            explaination = "These track the exact moments a mouse button is pressed down and then released.",
                            codeExample = """
                <button id="holdBtn">Hold Me</button>
                <script>
                    const btn = document.getElementById("holdBtn");
                    btn.addEventListener("mousedown", () => btn.innerText = "Pressed!");
                    btn.addEventListener("mouseup", () => btn.innerText = "Released!");
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The keydown Event",
                            explaination = "The keydown event occurs the moment a key is pressed. It is more reliable than keypress for non-character keys.",
                            codeExample = """
                <script>
                    window.addEventListener("keydown", (event) => {
                        console.log("Key pressed: " + event.key);
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The submit Event",
                            explaination = "This event occurs when a form is submitted. It is usually used to validate data or prevent the page from refreshing.",
                            codeExample = """
                <form id="myForm">
                    <input type="text" required>
                    <button type="submit">Send</button>
                </form>
                <script>
                    document.getElementById("myForm").addEventListener("submit", (e) => {
                        e.preventDefault(); // Stops the page from refreshing
                        alert("Form submitted safely!");
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The focus and blur Events",
                            explaination = "Focus happens when you enter an input field; blur happens when you leave it.",
                            codeExample = """
                <input type="text" id="fld" placeholder="Focus me">
                <script>
                    const fld = document.getElementById("fld");
                    fld.onfocus = () => fld.style.border = "2px solid blue";
                    fld.onblur = () => fld.style.border = "1px solid gray";
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The scroll Event",
                            explaination = "The scroll event fires when the document view or an element has been scrolled.",
                            codeExample = """
                <script>
                    window.onscroll = () => {
                        console.log("You are scrolling at: " + window.scrollY + "px");
                    };
                </script>
            """.trimIndent(),
                            tip = "Use 'throttling' or 'debouncing' with scroll events to maintain browser performance."
                        ),

                        Headline(
                            headline = "The contextmenu Event",
                            explaination = "This event fires when the user attempts to open a context menu (usually by right-clicking).",
                            codeExample = """
                <div style="background: lightgray; height: 50px;">Right-click here</div>
                <script>
                    document.addEventListener("contextmenu", (e) => {
                        e.preventDefault();
                        alert("Right-click is disabled!");
                    });
                </script>
            """.trimIndent()
                        )
                    )
                )









            ),

            Subtopic(
                sutopicId=19,
                subTopicName = "Block Level Elements",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML Block Level Elements",
                        explaination = "Explain and list commonly used with thier tags and used for" ,
                        codeExample = "give amazing runnable html example involving all",
                        tip = "give tip"
                    ),

                    Headline(
                        explaination = "Example ",
                        codeExample = "give amazing runnable html example involving all",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        headline = "Inline Elements",
                        explaination = "Explain and list commonly used with thier tags and used for" ,
                        codeExample = "give amazing runnable html example involving all",
                        afterCodeEplainations = "Explain",

                        ),

                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "amazing",
                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ) ,
            Subtopic(
                sutopicId=17,
                subTopicName = "HTML Sections",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML Sections",
                        majorHeadileExplanation = "Explain ",

                        tip = "give",
                     ),
                    Headline(
                        headline = "Elements used for HTML Sections",
                        explaination = "Explain listing them and bulleting them all",
                        codeExample ="give code example that user can run ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(

                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        headline = "HTML5 Semantic Elements ",
                        explaination = "Explain listing them and bulleting them all",
                        codeExample ="give code example that user can run ",

                        ),
                    Headline(
                        headline = "Element <div>",

                        codeExample ="give code example that user can run ",

                        ),
                    Headline(
                        headline = "Element <span>",

                        codeExample ="give code example that user can run ",

                        ),

                    questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )

                ),
            ),
            Subtopic(
                sutopicId=18,
                subTopicName = "Images",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Images in HTML",
                        majorHeadileExplanation = "explain shing tag used",
                        codeExample = "give a runnable involving html colors more than one ",


                        tip = "give tip"
                    ),
                    Headline(
                        headline = "src",
                        explaination = "explain",
                        codeExample = "give amazing runnable html  example",


                    ),
                    Headline(
                        headline = "alt",
                        explaination = "explain",
                        codeExample = "give amazing runnable html  example",


                        ),
                    Headline(
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        headline = "styling image",
                        explaination = "List well commonly used styles",
                        codeExample = "give runnable html example  involving them",
                    ),


                    Headline(
                        headline = "width and height",
                        explaination = "explain ",
                        codeExample = "",


                        ),
                    Headline(
                        headline = "floating image",
                        explaination = "explain ",
                        codeExample = "",


                        ),
                    Headline(
                        headline = "shape image",
                        explaination = "explain ",
                        codeExample = "",


                        ),
                    Headline(
                        headline = "image as link",
                        explaination = "explain ",
                        codeExample = "",


                        ),
                    Headline(
                        headline = "web image",
                        explaination = "explain ",
                        codeExample = "",


                        ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ),
            Subtopic(
                sutopicId=20,
                subTopicName = "HTML Tables",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML Tables",
                        majorHeadileExplanation = "Explain  and show tag used",
                        codeExample ="give a runnable code example with attributes you can use comment to explain inside the code",
                        tip = "give",

                    ),
                    Headline(
                        headline = "Table Elements",
                        explaination = "explain all using bulleting listing them with their tags ",
                        codeExample = "good example",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Table Attributes",
                        explaination = "explain all using bulleting listing them with their tags ",
                        codeExample = "good example",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Example Of a table",

                        codeExample = "good example example of a table having most of the things above",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = " table having bg,colgroup,witdth,border",

                        codeExample = "good example example of a table having bg,colgroup,witdth,border",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "table havingcell padding,cell spacing,row group,caption",

                        codeExample = "good example example of a table having cell padding,cell spacing,row group,caption",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Collapsing HTML Table Borders",

                        codeExample = "good example example",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Rowspan ",

                        codeExample = "good example example of a table having Rowspan",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Collspan ",

                        codeExample = "good example example of a table having colspan",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Collapsed border,rowspan,colspan ",

                        codeExample = "good example example of a table having Rowspan",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        explaination = "Example  ",
                        codeExample = "Complex Example but amazing",

                        ),

                    questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )

                ),


                // --- SUBTOPIC 2: WRITING & INTEGRATING JS ---
                Subtopic(
                    sutopicId = 2,
                    subTopicName = "JS Writing Code",
                    headlines = listOf(
                        Headline(
                            headline = "The <script> Tag",
                            explaination = "JavaScript is executed by the browser's engine. To run it, code is either embedded directly into HTML or linked as an external script using the <script> tag. This tag tells the browser to pause HTML parsing and execute the logic inside.",
                            codeExample = "<script>\n  console.log('Writing JS directly in HTML!');\n</script>",
                            afterCodeEplainations = "Browsers read files from top to bottom, executing scripts as they are encountered."
                        ),
                        Headline(
                            headline = "Internal JS & Placement",
                            explaination = "Internal JS lives inside your HTML file. If placed in the <head>, it loads early but can slow down visual rendering. If placed at the bottom of the <body>, the page structure loads first, which is a common performance optimization.",
                            codeExample = "<body>\n  <h1 id='title'>Hello</h1>\n  <script>\n    // This runs after the <h1> is created\n    console.log('Body script executed');\n  </script>\n</body>",
                            tip = "Placing scripts in the head might cause errors if the script tries to access HTML elements that haven't been created yet."
                        ),
                        Headline(
                            headline = "External JS (.js Files)",
                            explaination = "For production, code is kept in separate .js files. This promotes 'Separation of Concerns' and allows browsers to cache the file, similar to how Linux shared libraries (.so files) save memory by being reused.",
                            codeExample = "// In HTML: <script src='script.js'></script>\n\n// In script.js:\nfunction init() {\n  console.log('External app started');\n}",
                            afterCodeEplainations = "The 'src' attribute acts like a file path, pointing the browser to the logic's location."
                        ),
                        Headline(
                            headline = "The Render Process & Parser Blocking",
                            explaination = "When a browser hits a script tag without special attributes, it stops building the page to download and run it. This is 'parser blocking'—think of it like a sequential bash script where command B must wait for A.",
                            codeExample = "<script src='heavy-library.js'></script>",
                            afterCodeEplainations = "Large scripts can make a site feel 'frozen' during this download phase."
                        ),
                        Headline(
                            headline = "Modern Loading: Async & Defer",
                            explaination = "Modern JS uses 'async' and 'defer' to prevent blocking. 'Defer' downloads the script in the background and executes it only after the HTML is fully parsed. This is currently the industry standard.",
                            codeExample = "<script src='app.js' defer></script>",
                            tip = "Always use 'defer' for external scripts in the <head> to get the best performance and avoid null errors."
                        ),
                        Headline(
                            headline = "Modern Module System",
                            explaination = "Today we use 'type=module' to organize code into pieces that can import/export functionality. Modules automatically use 'strict mode' to prevent common coding errors.",
                            codeExample = "<script type='module' src='main.js'></script>"
                        )
                    ),
                    questions = listOf(
                        QuizQuestion("Which tag is used for JavaScript?", listOf("<js>", "<script>", "<javascript>", "<code_js>"), 1),
                        QuizQuestion("What is the best location for scripts for performance?", listOf("In the <head>", "Before the <html> tag", "At the bottom of the <body>", "Inside a <div>"), 2),
                        QuizQuestion("Which attribute links an external JS file?", listOf("href", "link", "src", "path"), 2),
                        QuizQuestion("What does the 'defer' attribute do?", listOf("Stops the script", "Hides the script", "Downloads in background and runs after parsing", "Deletes the script"), 2),
                        QuizQuestion("Why is External JS better for performance?", listOf("It is smaller", "It can be cached by the browser", "It runs faster", "It uses less RAM"), 1)
                    )
                ),

                // --- SUBTOPIC 3: DISPLAYING OUTPUT & DEBUGGING ---
                Subtopic(
                    sutopicId = 3,
                    subTopicName = "JS Displaying Output",
                    headlines = listOf(
                        Headline(
                            headline = "Data Visualization Streams",
                            explaination = "JavaScript output means showing results to the user or developer. It can be displayed in the console, dialog boxes, or directly inside HTML elements.",
                            codeExample = "// Different output streams\nconsole.log('For developers');\nalert('For urgent alerts');\ndocument.getElementById('msg').innerHTML = 'For users';"
                        ),
                        Headline(
                            headline = "Using the Console",
                            explaination = "The console is the primary tool for debugging. Beyond log(), you can use console.table() to visualize arrays of data clearly in the browser's DevTools (F12).",
                            codeExample = """
                            const servers = [
                                { name: "Nginx", status: "Active" },
                                { name: "Apache", status: "Down" }
                            ];
                            console.table(servers);
                        """.trimIndent(),
                            afterCodeEplainations = "The output is not visible to website users, making it safe for sensitive debugging info."
                        ),
                        Headline(
                            headline = "Writing to HTML Components",
                            explaination = "JavaScript can change content by selecting an element's ID. You use 'innerHTML' for HTML content or 'textContent' for plain text. Use <br> for line breaks within innerHTML.",
                            codeExample = """
                            <p id="status"></p>
                            <script>
                                document.getElementById("status").innerHTML = "System:<br>Online";
                            </script>
                        """.trimIndent(),
                            tip = "Careful: innerHTML can be a security risk (XSS). Use textContent if you don't need to render HTML tags."
                        ),
                        Headline(
                            headline = "Using Dialog Boxes",
                            explaination = "Dialog boxes like alert(), confirm(), and prompt() are popups. Note that they are 'blocking' operations; they freeze the browser's main thread until the user interacts.",
                            codeExample = "alert('Welcome to the JavaScript Compiler!');"
                        ),
                        Headline(
                            headline = "The Window Object",
                            explaination = "In the browser, 'window' is the global object. This means 'window.alert()' and 'alert()' are identical. It represents the browser window itself.",
                            codeExample = "window.console.log('Global window access');"
                        ),
                        Headline(
                            headline = "Dangerous Output: document.write()",
                            explaination = "JavaScript can write directly to the document stream. However, if document.write() is used after the page has finished loading, it will overwrite the entire HTML document.",
                            codeExample = "function wipe() {\n  document.write('The rest of the page is now gone.');\n}",
                            tip = "Avoid using document.write() in real applications. It is strictly for quick testing."
                        )
                    ),
                    questions = listOf(
                        QuizQuestion("Which method is best for debugging?", listOf("alert()", "console.log()", "document.write()", "window.print()"), 1),
                        QuizQuestion("How do you change the content of an HTML element?", listOf(".innerHTML", ".changeText", ".value", ".setContent"), 0),
                        QuizQuestion("What is a risk of using innerHTML with user input?", listOf("Slow loading", "Security (XSS)", "Color changes", "Syntax errors"), 1),
                        QuizQuestion("What happens if document.write() runs after the page loads?", listOf("Adds text at top", "Does nothing", "Wipes the entire page", "Opens a new tab"), 2),
                        QuizQuestion("Which command prints a table of data?", listOf("console.grid()", "console.table()", "console.view()", "console.list()"), 1)
                    )
                )
                ,




                Subtopic(
                    sutopicId=4,
                    subTopicName = "JS Statements",
                    headlines = listOf(

                        Headline(
                            headline = "JS Statements",
                            explaination = "JavaScript statements are instructions that tell the browser what to do. "
                                    + "Each statement is executed in the order it is written.",
                            codeExample = """
                let x = 10;
                let y = 20;
                let sum = x + y;
            """.trimIndent(),
                            afterCodeEplainations = "Each line is a separate statement. "
                                    + "JavaScript reads and runs them one by one."
                        ),

                        Headline(
                            explaination = "JavaScript statements usually end with a semicolon. "
                                    + "The semicolon separates one statement from another.",
                            codeExample = """
                let name = "John";
                let age = 25;
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "JavaScript allows multiple statements in one line, "
                                    + "but writing one statement per line makes the code easier to read.",
                            codeExample = """
                let a = 5; let b = 10; let c = a + b;
            """.trimIndent(),
                            tip = "For better readability, always write one statement per line."
                        ),

                        Headline(
                            headline = "Grouping JS Statements",
                            explaination = "JavaScript statements can be grouped together using curly braces {}. "
                                    + "Grouped statements are treated as a block of code.",
                            codeExample = """
                if (x > 5) {
                    console.log("x is greater than 5");
                    console.log("This is a block of statements");
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "JS Keywords",
                            explaination = "JavaScript keywords are reserved words that have special meanings. "
                                    + "They are used to define actions, variables, and control the program flow.",
                            codeExample = """
                let number = 10;

                if (number > 5) {
                    console.log("Number is greater than 5");
                }
            """.trimIndent(),
                            afterCodeEplainations = "`let` and `if` are JavaScript keywords and cannot be used as variable names."
                        )

                    ),
                    questions = listOf(
                        QuizQuestion("What is a JavaScript statement?", listOf("A style rule", "An instruction to the browser", "A type of variable", "A comment"), 1),
                        QuizQuestion("Which character is usually used to separate JS statements?", listOf("Colon (:)", "Comma (,)", "Semicolon (;)", "Full stop (.)"), 2),
                        QuizQuestion("Is it possible to write multiple statements on one line?", listOf("No, it causes an error", "Yes, but it's not recommended", "Only inside a function", "Only if they are empty"), 1),
                        QuizQuestion("What are curly braces {} used for in statements?", listOf("To create a comment", "To group statements into a block", "To multiply numbers", "To end the program"), 1),
                        QuizQuestion("In what order are JavaScript statements executed?", listOf("Randomly", "Bottom to top", "In the order they are written", "Alphabetically"), 2)
                    )
                ),

                Subtopic(
                    sutopicId=5,
                    subTopicName = "JS Syntax",questions = listOf(
                        QuizQuestion("Which keyword is used for a variable that should NOT change?", listOf("let", "var", "const", "change"), 2),
                        QuizQuestion("Is JavaScript case-sensitive?", listOf("Yes", "No", "Only for numbers", "Only in Linux"), 0),
                        QuizQuestion("Which is a correct way to declare a variable in modern JS?", listOf("variable x = 5;", "let x = 5;", "set x = 5;", "int x = 5;"), 1),
                        QuizQuestion("If you have 'let Name' and 'let name', how many variables exist?", listOf("One", "Two", "None (error)", "It depends on the browser"), 1),
                        QuizQuestion("What is the naming style 'userName' called?", listOf("snake_case", "PascalCase", "camelCase", "Flatcase"), 2)
                    ),
                    headlines = listOf(

                        Headline(
                            headline = "JS Syntax?",
                            explaination = "JavaScript syntax refers to the rules that define how JavaScript code is written "
                                    + "and structured. Following correct syntax helps the browser understand and execute the code."
                        ),

                        Headline(
                            headline = "Variable Declaration",
                            explaination = "Variable declaration means creating a variable to store data. "
                                    + "JavaScript allows variables to be declared using let, const, or var.",
                            codeExample = """
                let name = "John";
                const age = 30;
                var city = "Paris";
            """.trimIndent(),
                            afterCodeEplainations = "`let` is used for values that can change, "
                                    + "`const` is used for fixed values, and `var` is an older way to declare variables."
                        ),

                        Headline(
                            headline = "Case Sensitivity",
                            explaination = "JavaScript is case-sensitive, which means uppercase and lowercase letters "
                                    + "are treated as different.",
                            codeExample = """
                let userName = "Alice";
                let username = "Bob";
            """.trimIndent(),
                            tip = "Always use consistent naming styles like camelCase to avoid errors."
                        )

                    )
                ),





                Subtopic(
                    sutopicId=6,
                    questions = listOf(
                        QuizQuestion("How do you start a single-line comment in JS?", listOf("/*", "//", "", "/* and */", "[[ and ]]"), 2),
                        QuizQuestion("What happens to comments during program execution?", listOf("They are displayed in console", "They are ignored by the browser", "They make the code run faster", "They cause an error"), 1),
                        QuizQuestion("Why would you use a comment to 'disable' code?", listOf("To make the file smaller", "To test logic without deleting it", "To encrypt the code", "To change the variable type"), 1),
                        QuizQuestion("Can a single-line comment be placed at the end of a statement?", listOf("Yes", "No", "Only inside a block", "Only with const"), 0)
                    ),
                    subTopicName = "JS Comments",
                    headlines = listOf(

                        Headline(
                            headline = "JS Comments",
                            explaination = "JavaScript comments are used to describe the code and make it easier to understand. "
                                    + "Comments are ignored by the browser and do not affect program execution."
                        ),

                        Headline(
                            headline = "Single-Line Comments",
                            explaination = "Single-line comments are used to comment only one line of code.",
                            codeExample = """
                // This is a single-line comment
                let x = 10; // This comment explains the variable
            """.trimIndent(),
                            afterCodeEplainations = "Anything written after // is treated as a comment and is not executed."
                        ),

                        Headline(
                            explaination = "Single-line comments are often used for short explanations or notes in the code.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Comments can also be used to explain complex logic or important steps in a program.",
                            tip = "Write clear and meaningful comments, but avoid commenting obvious code.",
                            codeExample = """
                // Calculate total price
                let total = price + tax;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Multi-Line Comments",
                            explaination = "Multi-line comments are used to comment multiple lines at once.",
                            codeExample = """
                /*
                  This is a multi-line comment
                  It can span multiple lines
                */
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Disabling Code Using Comments",
                            explaination = "Comments can be used to temporarily disable code without deleting it.",
                            codeExample = """
                // console.log("This line will not run");

                /*
                alert("This code is disabled");
                */
            """.trimIndent()
                        )

                    )
                ),


                Subtopic(
                    sutopicId = 7,
                    questions = listOf(
                        QuizQuestion("What is the result of 'let x;' if you log x?", listOf("0", "null", "undefined", "Error"), 2),
                        QuizQuestion("Which operator is used to assign a value to a variable?", listOf("==", "===", "=", ":="), 2),
                        QuizQuestion("What happens if you try to change a 'const' variable?", listOf("It changes successfully", "It resets to zero", "It causes a runtime error", "It creates a new variable"), 2),
                        QuizQuestion("Which is a valid variable name?", listOf("1stUser", "user-name", "_totalAmount", "let"), 2),
                        QuizQuestion("When should you use 'let' instead of 'const'?", listOf("When the value will stay the same", "When the value needs to be updated later", "Only for strings", "Only for numbers"), 1)
                    ),
                    subTopicName = "JS Variables",
                    headlines = listOf(

                        Headline(
                            headline = "JS Variables",
                            explaination = "Variables are used to store data values in JavaScript. "
                                    + "A variable can hold different types of data such as numbers or text.",
                            codeExample = "let name;",
                            afterCodeEplainations = "This declares a variable named name without assigning a value."
                        ),

                        Headline(
                            explaination = "The assignment operator (=) is used to assign a value to a variable.",
                            codeExample = """
                let age = 25;
                let city = "New York";
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "Variables can store different types of data and their values can be used later in the program.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Undefined Variable",
                            explaination = "A variable that is declared but not assigned a value is called an undefined variable.",
                            codeExample = """
                let x;
                console.log(x);
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Changing Value",
                            explaination = "The value of a variable can be changed after it is declared.",
                            codeExample = """
                let score = 10;
                score = 20;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Constant Variables",
                            explaination = "Constant variables are declared using const and their values cannot be changed.",
                            codeExample = """
                const pi = 3.14;
            """.trimIndent(),
                            afterCodeEplainations = "Trying to change a const variable will cause an error."
                        ),

                        Headline(
                            explaination = "Use let for values that change and const for values that should stay the same.",
                            tip = "Always prefer const unless you know the value will change.",
                            codeExample = """
                let count = 1;
                const maxLimit = 100;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Naming Variables",
                            explaination = "Variable names should be meaningful and describe the data they store."
                        ),

                        Headline(
                            headline = "Rules for Naming Variables",
                            explaination = "Variable names must start with a letter, underscore (_), or dollar sign ($) "
                                    + "and cannot contain spaces.",
                            tip = "Use camelCase for variable names, like userName or totalPrice."
                        )

                    ),
                ),



                Subtopic(
                    sutopicId = 8,
                    questions = listOf(
                        QuizQuestion("What keyword is used to create a function?", listOf("method", "function", "def", "routine"), 1),
                        QuizQuestion("How do you 'call' a function named 'myFunc'?", listOf("call myFunc", "myFunc[]", "myFunc()", "run(myFunc)"), 2),
                        QuizQuestion("What does the 'return' statement do?", listOf("Restarts the function", "Exits the function and sends back a value", "Repeats the code", "Deletes the variable"), 1),
                        QuizQuestion("A variable declared inside a function is:", listOf("Global", "Local (Function Scope)", "Shared", "Permanent"), 1),
                        QuizQuestion("What happens if you define a function but never call it?", listOf("The code runs once", "The browser crashes", "The code inside never executes", "It runs automatically"), 2)
                    ),
                    subTopicName = "JS Functions",

                    headlines = listOf(

                        Headline(
                            headline = "JS Functions",
                            explaination = "Functions are blocks of code designed to perform a specific task. "
                                    + "They help organize code and avoid repetition."
                        ),

                        Headline(
                            headline = "Function Definition",
                            explaination = "A function definition creates a function using the function keyword, "
                                    + "a name, and parentheses.",
                            tip = "Choose clear and meaningful function names.",
                            codeExample = """
                function greet() {
                    console.log("Hello!");
                }
            """.trimIndent(),
                            afterCodeEplainations = "This defines a function named greet, but it will not run until called."
                        ),

                        Headline(
                            explaination = "Functions can contain one or more statements inside their body.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Functions can be reused many times in a program.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Calling a Function",
                            explaination = "Calling a function means executing the code inside the function.",
                            codeExample = """
                greet();
            """.trimIndent(),
                            afterCodeEplainations = "This line runs the greet function."
                        ),

                        Headline(
                            explaination = "A function can be called multiple times whenever needed.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "The return Statement",
                            explaination = "The return statement sends a value back from the function.",
                            codeExample = """
                function add(a, b) {
                    return a + b;
                }
            """.trimIndent(),
                            afterCodeEplainations = "The function returns the result of a + b."
                        ),

                        Headline(
                            explaination = "Returned values can be stored in variables.",
                            codeExample = """
                let result = add(5, 3);
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "Once return is executed, the function stops running.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Not all functions need to return a value.",
                            tip = "Use return only when you need a result from the function.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Function Scope",
                            explaination = "Variables declared inside a function can only be used within that function.",
                            codeExample = """
                function test() {
                    let x = 10;
                    console.log(x);
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Global Vaiables",
                            explaination = "Global variables are declared outside functions and can be accessed anywhere in the code.",
                            codeExample = """
                let message = "Hello";

                function showMessage() {
                    console.log(message);
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Why Use Functions",
                            explaination = "Functions make code reusable, organized, and easier to maintain.",
                            tip = "Break large programs into smaller functions.",
                            codeExample = """
                function calculateTotal(price, tax) {
                    return price + tax;
                }
            """.trimIndent(),
                            afterCodeEplainations = "This function can be reused whenever total calculation is needed."
                        )

                    )
                ),




                Subtopic(
                    sutopicId = 9,
                    questions = listOf(
                        QuizQuestion("Which event fires when a user clicks an HTML element?", listOf("onhover", "onclick", "onpress", "onchange"), 1),
                        QuizQuestion("What is the modern method to attach an event handler?", listOf("on()", "attachEvent()", "addEventListener()", "setEvent()"), 2),
                        QuizQuestion("How do you prevent a form from refreshing the page on submit?", listOf("e.stop()", "e.preventDefault()", "e.halt()", "e.ignore()"), 1),
                        QuizQuestion("Which event fires as soon as the HTML is loaded but before images load?", listOf("onload", "DOMReady", "DOMContentLoaded", "onfinish"), 2),
                        QuizQuestion("What is the difference between 'focus' and 'blur'?", listOf("There is no difference", "Focus is entering a field, blur is leaving it", "Focus is for buttons, blur is for text", "Blur happens only on scroll"), 1),
                        QuizQuestion("Which event tracks every single keystroke in an input?", listOf("change", "submit", "input", "blur"), 2),
                        QuizQuestion("What does 'window.scrollY' tell you during a scroll event?", listOf("The width of the page", "The vertical distance scrolled in pixels", "The speed of scrolling", "The number of elements on screen"), 1)
                    ),
                    subTopicName = "JS Events",
                    headlines = listOf(
                        Headline(
                            headline = "JS Events",
                            explaination = "JavaScript events are actions that happen in the browser, such as clicking a button, typing on the keyboard, or loading a page.",
                            codeExample = """
                <button onclick="showAlert()">Click Me</button>
                <script>
                    function showAlert() {
                        alert("Button clicked!");
                    }
                </script>
            """.trimIndent(),
                            afterCodeEplainations = "The function runs when the button is clicked."
                        ),

                        Headline(
                            headline = "Inline Event Handlers",
                            explaination = "Inline event handlers are written directly inside HTML elements using attributes like onclick or onmouseover.",
                            codeExample = """
                <button onclick="alert('Hello!')">Click</button>
            """.trimIndent(),
                            afterCodeEplainations = "Inline events are easy to use but not recommended for large applications as they mix logic with structure."
                        ),

                        Headline(
                            headline = "The addEventListener() Method",
                            explaination = "addEventListener() is the modern way to attach event handlers. It allows multiple listeners for a single event.",
                            codeExample = """
                <button id="btn">Click Me</button>
                <script>
                    document.getElementById("btn")
                        .addEventListener("click", () => {
                            alert("Modern click handler!");
                        });
                </script>
            """.trimIndent(),
                            afterCodeEplainations = "This method keeps JavaScript separate from HTML and is easier to maintain."
                        ),

                        Headline(
                            headline = "The DOMContentLoaded Event",
                            explaination = "This event fires when the HTML document has been completely loaded and parsed, without waiting for images or stylesheets.",
                            codeExample = """
                <script>
                    document.addEventListener("DOMContentLoaded", () => {
                        console.log("DOM is ready, you can now manipulate elements!");
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The input Event",
                            explaination = "Unlike 'change', the 'input' event fires immediately every time the value of an element changes.",
                            codeExample = """
                <input type="text" id="myInput">
                <p id="output"></p>
                <script>
                    document.getElementById("myInput").addEventListener("input", (e) => {
                        document.getElementById("output").innerText = e.target.value;
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Mouse Events: mousedown & mouseup",
                            explaination = "These track the exact moments a mouse button is pressed down and then released.",
                            codeExample = """
                <button id="holdBtn">Hold Me</button>
                <script>
                    const btn = document.getElementById("holdBtn");
                    btn.addEventListener("mousedown", () => btn.innerText = "Pressed!");
                    btn.addEventListener("mouseup", () => btn.innerText = "Released!");
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The keydown Event",
                            explaination = "The keydown event occurs the moment a key is pressed. It is more reliable than keypress for non-character keys.",
                            codeExample = """
                <script>
                    window.addEventListener("keydown", (event) => {
                        console.log("Key pressed: " + event.key);
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The submit Event",
                            explaination = "This event occurs when a form is submitted. It is usually used to validate data or prevent the page from refreshing.",
                            codeExample = """
                <form id="myForm">
                    <input type="text" required>
                    <button type="submit">Send</button>
                </form>
                <script>
                    document.getElementById("myForm").addEventListener("submit", (e) => {
                        e.preventDefault(); // Stops the page from refreshing
                        alert("Form submitted safely!");
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The focus and blur Events",
                            explaination = "Focus happens when you enter an input field; blur happens when you leave it.",
                            codeExample = """
                <input type="text" id="fld" placeholder="Focus me">
                <script>
                    const fld = document.getElementById("fld");
                    fld.onfocus = () => fld.style.border = "2px solid blue";
                    fld.onblur = () => fld.style.border = "1px solid gray";
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The scroll Event",
                            explaination = "The scroll event fires when the document view or an element has been scrolled.",
                            codeExample = """
                <script>
                    window.onscroll = () => {
                        console.log("You are scrolling at: " + window.scrollY + "px");
                    };
                </script>
            """.trimIndent(),
                            tip = "Use 'throttling' or 'debouncing' with scroll events to maintain browser performance."
                        ),

                        Headline(
                            headline = "The contextmenu Event",
                            explaination = "This event fires when the user attempts to open a context menu (usually by right-clicking).",
                            codeExample = """
                <div style="background: lightgray; height: 50px;">Right-click here</div>
                <script>
                    document.addEventListener("contextmenu", (e) => {
                        e.preventDefault();
                        alert("Right-click is disabled!");
                    });
                </script>
            """.trimIndent()
                        )
                    )
                )









            ),

            Subtopic(
                sutopicId=201,
                subTopicName = "HTML Lists",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML Lists",
                        majorHeadileExplanation = "Explain and good structure" ,

                        tip = "give tip"
                    ),
                    Headline(
                        headline = "HTML List Elements",
                        explaination = "List well all ,with their tags and bulleting and explain them",
                        codeExample = "give runnable html example ",
                    ),

                    Headline(
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        headline = "Nested HTML Lists",
                        explaination = "explain",
                        codeExample = "give runnable html example ",
                    ),
                    Headline(
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),

                    Headline(
                        headline = "List Style Type",
                        explaination = "explain",
                        codeExample = "give runnable html example ",
                    ),
                    Headline(
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        headline = "Changing and Coloring Bullets",
                        explaination = "explain",
                        codeExample = "give runnable html example ",
                    ),
                    Headline(
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        codeExample = "give amazing runnable html  example",
                        afterCodeEplainations = ""

                    ),

                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "",
                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ),
            Subtopic(
                sutopicId=203,
                subTopicName = "HTML Description Lists",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML Description Lists",
                        majorHeadileExplanation = "Explain  and list the tags all of them ",
                        codeExample ="give a runnable code example ",
                        tip = "give",
                        afterCodeEplainations = ""
                    ),
                    Headline(

                        codeExample = "good example",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Styling HTML Description Lists ",
                        explaination = "explain ",
                        codeExample = "good example",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        explaination = "explain ",
                        codeExample = "",

                        ),

                    questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )

                ),


                // --- SUBTOPIC 2: WRITING & INTEGRATING JS ---
                Subtopic(
                    sutopicId = 2,
                    subTopicName = "JS Writing Code",
                    headlines = listOf(
                        Headline(
                            headline = "The <script> Tag",
                            explaination = "JavaScript is executed by the browser's engine. To run it, code is either embedded directly into HTML or linked as an external script using the <script> tag. This tag tells the browser to pause HTML parsing and execute the logic inside.",
                            codeExample = "<script>\n  console.log('Writing JS directly in HTML!');\n</script>",
                            afterCodeEplainations = "Browsers read files from top to bottom, executing scripts as they are encountered."
                        ),
                        Headline(
                            headline = "Internal JS & Placement",
                            explaination = "Internal JS lives inside your HTML file. If placed in the <head>, it loads early but can slow down visual rendering. If placed at the bottom of the <body>, the page structure loads first, which is a common performance optimization.",
                            codeExample = "<body>\n  <h1 id='title'>Hello</h1>\n  <script>\n    // This runs after the <h1> is created\n    console.log('Body script executed');\n  </script>\n</body>",
                            tip = "Placing scripts in the head might cause errors if the script tries to access HTML elements that haven't been created yet."
                        ),
                        Headline(
                            headline = "External JS (.js Files)",
                            explaination = "For production, code is kept in separate .js files. This promotes 'Separation of Concerns' and allows browsers to cache the file, similar to how Linux shared libraries (.so files) save memory by being reused.",
                            codeExample = "// In HTML: <script src='script.js'></script>\n\n// In script.js:\nfunction init() {\n  console.log('External app started');\n}",
                            afterCodeEplainations = "The 'src' attribute acts like a file path, pointing the browser to the logic's location."
                        ),
                        Headline(
                            headline = "The Render Process & Parser Blocking",
                            explaination = "When a browser hits a script tag without special attributes, it stops building the page to download and run it. This is 'parser blocking'—think of it like a sequential bash script where command B must wait for A.",
                            codeExample = "<script src='heavy-library.js'></script>",
                            afterCodeEplainations = "Large scripts can make a site feel 'frozen' during this download phase."
                        ),
                        Headline(
                            headline = "Modern Loading: Async & Defer",
                            explaination = "Modern JS uses 'async' and 'defer' to prevent blocking. 'Defer' downloads the script in the background and executes it only after the HTML is fully parsed. This is currently the industry standard.",
                            codeExample = "<script src='app.js' defer></script>",
                            tip = "Always use 'defer' for external scripts in the <head> to get the best performance and avoid null errors."
                        ),
                        Headline(
                            headline = "Modern Module System",
                            explaination = "Today we use 'type=module' to organize code into pieces that can import/export functionality. Modules automatically use 'strict mode' to prevent common coding errors.",
                            codeExample = "<script type='module' src='main.js'></script>"
                        )
                    ),
                    questions = listOf(
                        QuizQuestion("Which tag is used for JavaScript?", listOf("<js>", "<script>", "<javascript>", "<code_js>"), 1),
                        QuizQuestion("What is the best location for scripts for performance?", listOf("In the <head>", "Before the <html> tag", "At the bottom of the <body>", "Inside a <div>"), 2),
                        QuizQuestion("Which attribute links an external JS file?", listOf("href", "link", "src", "path"), 2),
                        QuizQuestion("What does the 'defer' attribute do?", listOf("Stops the script", "Hides the script", "Downloads in background and runs after parsing", "Deletes the script"), 2),
                        QuizQuestion("Why is External JS better for performance?", listOf("It is smaller", "It can be cached by the browser", "It runs faster", "It uses less RAM"), 1)
                    )
                ),

                // --- SUBTOPIC 3: DISPLAYING OUTPUT & DEBUGGING ---
                Subtopic(
                    sutopicId = 3,
                    subTopicName = "JS Displaying Output",
                    headlines = listOf(
                        Headline(
                            headline = "Data Visualization Streams",
                            explaination = "JavaScript output means showing results to the user or developer. It can be displayed in the console, dialog boxes, or directly inside HTML elements.",
                            codeExample = "// Different output streams\nconsole.log('For developers');\nalert('For urgent alerts');\ndocument.getElementById('msg').innerHTML = 'For users';"
                        ),
                        Headline(
                            headline = "Using the Console",
                            explaination = "The console is the primary tool for debugging. Beyond log(), you can use console.table() to visualize arrays of data clearly in the browser's DevTools (F12).",
                            codeExample = """
                            const servers = [
                                { name: "Nginx", status: "Active" },
                                { name: "Apache", status: "Down" }
                            ];
                            console.table(servers);
                        """.trimIndent(),
                            afterCodeEplainations = "The output is not visible to website users, making it safe for sensitive debugging info."
                        ),
                        Headline(
                            headline = "Writing to HTML Components",
                            explaination = "JavaScript can change content by selecting an element's ID. You use 'innerHTML' for HTML content or 'textContent' for plain text. Use <br> for line breaks within innerHTML.",
                            codeExample = """
                            <p id="status"></p>
                            <script>
                                document.getElementById("status").innerHTML = "System:<br>Online";
                            </script>
                        """.trimIndent(),
                            tip = "Careful: innerHTML can be a security risk (XSS). Use textContent if you don't need to render HTML tags."
                        ),
                        Headline(
                            headline = "Using Dialog Boxes",
                            explaination = "Dialog boxes like alert(), confirm(), and prompt() are popups. Note that they are 'blocking' operations; they freeze the browser's main thread until the user interacts.",
                            codeExample = "alert('Welcome to the JavaScript Compiler!');"
                        ),
                        Headline(
                            headline = "The Window Object",
                            explaination = "In the browser, 'window' is the global object. This means 'window.alert()' and 'alert()' are identical. It represents the browser window itself.",
                            codeExample = "window.console.log('Global window access');"
                        ),
                        Headline(
                            headline = "Dangerous Output: document.write()",
                            explaination = "JavaScript can write directly to the document stream. However, if document.write() is used after the page has finished loading, it will overwrite the entire HTML document.",
                            codeExample = "function wipe() {\n  document.write('The rest of the page is now gone.');\n}",
                            tip = "Avoid using document.write() in real applications. It is strictly for quick testing."
                        )
                    ),
                    questions = listOf(
                        QuizQuestion("Which method is best for debugging?", listOf("alert()", "console.log()", "document.write()", "window.print()"), 1),
                        QuizQuestion("How do you change the content of an HTML element?", listOf(".innerHTML", ".changeText", ".value", ".setContent"), 0),
                        QuizQuestion("What is a risk of using innerHTML with user input?", listOf("Slow loading", "Security (XSS)", "Color changes", "Syntax errors"), 1),
                        QuizQuestion("What happens if document.write() runs after the page loads?", listOf("Adds text at top", "Does nothing", "Wipes the entire page", "Opens a new tab"), 2),
                        QuizQuestion("Which command prints a table of data?", listOf("console.grid()", "console.table()", "console.view()", "console.list()"), 1)
                    )
                )
                ,




                Subtopic(
                    sutopicId=4,
                    subTopicName = "JS Statements",
                    headlines = listOf(

                        Headline(
                            headline = "JS Statements",
                            explaination = "JavaScript statements are instructions that tell the browser what to do. "
                                    + "Each statement is executed in the order it is written.",
                            codeExample = """
                let x = 10;
                let y = 20;
                let sum = x + y;
            """.trimIndent(),
                            afterCodeEplainations = "Each line is a separate statement. "
                                    + "JavaScript reads and runs them one by one."
                        ),

                        Headline(
                            explaination = "JavaScript statements usually end with a semicolon. "
                                    + "The semicolon separates one statement from another.",
                            codeExample = """
                let name = "John";
                let age = 25;
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "JavaScript allows multiple statements in one line, "
                                    + "but writing one statement per line makes the code easier to read.",
                            codeExample = """
                let a = 5; let b = 10; let c = a + b;
            """.trimIndent(),
                            tip = "For better readability, always write one statement per line."
                        ),

                        Headline(
                            headline = "Grouping JS Statements",
                            explaination = "JavaScript statements can be grouped together using curly braces {}. "
                                    + "Grouped statements are treated as a block of code.",
                            codeExample = """
                if (x > 5) {
                    console.log("x is greater than 5");
                    console.log("This is a block of statements");
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "JS Keywords",
                            explaination = "JavaScript keywords are reserved words that have special meanings. "
                                    + "They are used to define actions, variables, and control the program flow.",
                            codeExample = """
                let number = 10;

                if (number > 5) {
                    console.log("Number is greater than 5");
                }
            """.trimIndent(),
                            afterCodeEplainations = "`let` and `if` are JavaScript keywords and cannot be used as variable names."
                        )

                    ),
                    questions = listOf(
                        QuizQuestion("What is a JavaScript statement?", listOf("A style rule", "An instruction to the browser", "A type of variable", "A comment"), 1),
                        QuizQuestion("Which character is usually used to separate JS statements?", listOf("Colon (:)", "Comma (,)", "Semicolon (;)", "Full stop (.)"), 2),
                        QuizQuestion("Is it possible to write multiple statements on one line?", listOf("No, it causes an error", "Yes, but it's not recommended", "Only inside a function", "Only if they are empty"), 1),
                        QuizQuestion("What are curly braces {} used for in statements?", listOf("To create a comment", "To group statements into a block", "To multiply numbers", "To end the program"), 1),
                        QuizQuestion("In what order are JavaScript statements executed?", listOf("Randomly", "Bottom to top", "In the order they are written", "Alphabetically"), 2)
                    )
                ),

                Subtopic(
                    sutopicId=5,
                    subTopicName = "JS Syntax",questions = listOf(
                        QuizQuestion("Which keyword is used for a variable that should NOT change?", listOf("let", "var", "const", "change"), 2),
                        QuizQuestion("Is JavaScript case-sensitive?", listOf("Yes", "No", "Only for numbers", "Only in Linux"), 0),
                        QuizQuestion("Which is a correct way to declare a variable in modern JS?", listOf("variable x = 5;", "let x = 5;", "set x = 5;", "int x = 5;"), 1),
                        QuizQuestion("If you have 'let Name' and 'let name', how many variables exist?", listOf("One", "Two", "None (error)", "It depends on the browser"), 1),
                        QuizQuestion("What is the naming style 'userName' called?", listOf("snake_case", "PascalCase", "camelCase", "Flatcase"), 2)
                    ),
                    headlines = listOf(

                        Headline(
                            headline = "JS Syntax?",
                            explaination = "JavaScript syntax refers to the rules that define how JavaScript code is written "
                                    + "and structured. Following correct syntax helps the browser understand and execute the code."
                        ),

                        Headline(
                            headline = "Variable Declaration",
                            explaination = "Variable declaration means creating a variable to store data. "
                                    + "JavaScript allows variables to be declared using let, const, or var.",
                            codeExample = """
                let name = "John";
                const age = 30;
                var city = "Paris";
            """.trimIndent(),
                            afterCodeEplainations = "`let` is used for values that can change, "
                                    + "`const` is used for fixed values, and `var` is an older way to declare variables."
                        ),

                        Headline(
                            headline = "Case Sensitivity",
                            explaination = "JavaScript is case-sensitive, which means uppercase and lowercase letters "
                                    + "are treated as different.",
                            codeExample = """
                let userName = "Alice";
                let username = "Bob";
            """.trimIndent(),
                            tip = "Always use consistent naming styles like camelCase to avoid errors."
                        )

                    )
                ),





                Subtopic(
                    sutopicId=6,
                    questions = listOf(
                        QuizQuestion("How do you start a single-line comment in JS?", listOf("/*", "//", "", "/* and */", "[[ and ]]"), 2),
                        QuizQuestion("What happens to comments during program execution?", listOf("They are displayed in console", "They are ignored by the browser", "They make the code run faster", "They cause an error"), 1),
                        QuizQuestion("Why would you use a comment to 'disable' code?", listOf("To make the file smaller", "To test logic without deleting it", "To encrypt the code", "To change the variable type"), 1),
                        QuizQuestion("Can a single-line comment be placed at the end of a statement?", listOf("Yes", "No", "Only inside a block", "Only with const"), 0)
                    ),
                    subTopicName = "JS Comments",
                    headlines = listOf(

                        Headline(
                            headline = "JS Comments",
                            explaination = "JavaScript comments are used to describe the code and make it easier to understand. "
                                    + "Comments are ignored by the browser and do not affect program execution."
                        ),

                        Headline(
                            headline = "Single-Line Comments",
                            explaination = "Single-line comments are used to comment only one line of code.",
                            codeExample = """
                // This is a single-line comment
                let x = 10; // This comment explains the variable
            """.trimIndent(),
                            afterCodeEplainations = "Anything written after // is treated as a comment and is not executed."
                        ),

                        Headline(
                            explaination = "Single-line comments are often used for short explanations or notes in the code.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Comments can also be used to explain complex logic or important steps in a program.",
                            tip = "Write clear and meaningful comments, but avoid commenting obvious code.",
                            codeExample = """
                // Calculate total price
                let total = price + tax;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Multi-Line Comments",
                            explaination = "Multi-line comments are used to comment multiple lines at once.",
                            codeExample = """
                /*
                  This is a multi-line comment
                  It can span multiple lines
                */
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Disabling Code Using Comments",
                            explaination = "Comments can be used to temporarily disable code without deleting it.",
                            codeExample = """
                // console.log("This line will not run");

                /*
                alert("This code is disabled");
                */
            """.trimIndent()
                        )

                    )
                ),


                Subtopic(
                    sutopicId = 7,
                    questions = listOf(
                        QuizQuestion("What is the result of 'let x;' if you log x?", listOf("0", "null", "undefined", "Error"), 2),
                        QuizQuestion("Which operator is used to assign a value to a variable?", listOf("==", "===", "=", ":="), 2),
                        QuizQuestion("What happens if you try to change a 'const' variable?", listOf("It changes successfully", "It resets to zero", "It causes a runtime error", "It creates a new variable"), 2),
                        QuizQuestion("Which is a valid variable name?", listOf("1stUser", "user-name", "_totalAmount", "let"), 2),
                        QuizQuestion("When should you use 'let' instead of 'const'?", listOf("When the value will stay the same", "When the value needs to be updated later", "Only for strings", "Only for numbers"), 1)
                    ),
                    subTopicName = "JS Variables",
                    headlines = listOf(

                        Headline(
                            headline = "JS Variables",
                            explaination = "Variables are used to store data values in JavaScript. "
                                    + "A variable can hold different types of data such as numbers or text.",
                            codeExample = "let name;",
                            afterCodeEplainations = "This declares a variable named name without assigning a value."
                        ),

                        Headline(
                            explaination = "The assignment operator (=) is used to assign a value to a variable.",
                            codeExample = """
                let age = 25;
                let city = "New York";
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "Variables can store different types of data and their values can be used later in the program.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Undefined Variable",
                            explaination = "A variable that is declared but not assigned a value is called an undefined variable.",
                            codeExample = """
                let x;
                console.log(x);
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Changing Value",
                            explaination = "The value of a variable can be changed after it is declared.",
                            codeExample = """
                let score = 10;
                score = 20;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Constant Variables",
                            explaination = "Constant variables are declared using const and their values cannot be changed.",
                            codeExample = """
                const pi = 3.14;
            """.trimIndent(),
                            afterCodeEplainations = "Trying to change a const variable will cause an error."
                        ),

                        Headline(
                            explaination = "Use let for values that change and const for values that should stay the same.",
                            tip = "Always prefer const unless you know the value will change.",
                            codeExample = """
                let count = 1;
                const maxLimit = 100;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Naming Variables",
                            explaination = "Variable names should be meaningful and describe the data they store."
                        ),

                        Headline(
                            headline = "Rules for Naming Variables",
                            explaination = "Variable names must start with a letter, underscore (_), or dollar sign ($) "
                                    + "and cannot contain spaces.",
                            tip = "Use camelCase for variable names, like userName or totalPrice."
                        )

                    ),
                ),



                Subtopic(
                    sutopicId = 8,
                    questions = listOf(
                        QuizQuestion("What keyword is used to create a function?", listOf("method", "function", "def", "routine"), 1),
                        QuizQuestion("How do you 'call' a function named 'myFunc'?", listOf("call myFunc", "myFunc[]", "myFunc()", "run(myFunc)"), 2),
                        QuizQuestion("What does the 'return' statement do?", listOf("Restarts the function", "Exits the function and sends back a value", "Repeats the code", "Deletes the variable"), 1),
                        QuizQuestion("A variable declared inside a function is:", listOf("Global", "Local (Function Scope)", "Shared", "Permanent"), 1),
                        QuizQuestion("What happens if you define a function but never call it?", listOf("The code runs once", "The browser crashes", "The code inside never executes", "It runs automatically"), 2)
                    ),
                    subTopicName = "JS Functions",

                    headlines = listOf(

                        Headline(
                            headline = "JS Functions",
                            explaination = "Functions are blocks of code designed to perform a specific task. "
                                    + "They help organize code and avoid repetition."
                        ),

                        Headline(
                            headline = "Function Definition",
                            explaination = "A function definition creates a function using the function keyword, "
                                    + "a name, and parentheses.",
                            tip = "Choose clear and meaningful function names.",
                            codeExample = """
                function greet() {
                    console.log("Hello!");
                }
            """.trimIndent(),
                            afterCodeEplainations = "This defines a function named greet, but it will not run until called."
                        ),

                        Headline(
                            explaination = "Functions can contain one or more statements inside their body.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Functions can be reused many times in a program.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Calling a Function",
                            explaination = "Calling a function means executing the code inside the function.",
                            codeExample = """
                greet();
            """.trimIndent(),
                            afterCodeEplainations = "This line runs the greet function."
                        ),

                        Headline(
                            explaination = "A function can be called multiple times whenever needed.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "The return Statement",
                            explaination = "The return statement sends a value back from the function.",
                            codeExample = """
                function add(a, b) {
                    return a + b;
                }
            """.trimIndent(),
                            afterCodeEplainations = "The function returns the result of a + b."
                        ),

                        Headline(
                            explaination = "Returned values can be stored in variables.",
                            codeExample = """
                let result = add(5, 3);
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "Once return is executed, the function stops running.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Not all functions need to return a value.",
                            tip = "Use return only when you need a result from the function.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Function Scope",
                            explaination = "Variables declared inside a function can only be used within that function.",
                            codeExample = """
                function test() {
                    let x = 10;
                    console.log(x);
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Global Vaiables",
                            explaination = "Global variables are declared outside functions and can be accessed anywhere in the code.",
                            codeExample = """
                let message = "Hello";

                function showMessage() {
                    console.log(message);
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Why Use Functions",
                            explaination = "Functions make code reusable, organized, and easier to maintain.",
                            tip = "Break large programs into smaller functions.",
                            codeExample = """
                function calculateTotal(price, tax) {
                    return price + tax;
                }
            """.trimIndent(),
                            afterCodeEplainations = "This function can be reused whenever total calculation is needed."
                        )

                    )
                ),




                Subtopic(
                    sutopicId = 9,
                    questions = listOf(
                        QuizQuestion("Which event fires when a user clicks an HTML element?", listOf("onhover", "onclick", "onpress", "onchange"), 1),
                        QuizQuestion("What is the modern method to attach an event handler?", listOf("on()", "attachEvent()", "addEventListener()", "setEvent()"), 2),
                        QuizQuestion("How do you prevent a form from refreshing the page on submit?", listOf("e.stop()", "e.preventDefault()", "e.halt()", "e.ignore()"), 1),
                        QuizQuestion("Which event fires as soon as the HTML is loaded but before images load?", listOf("onload", "DOMReady", "DOMContentLoaded", "onfinish"), 2),
                        QuizQuestion("What is the difference between 'focus' and 'blur'?", listOf("There is no difference", "Focus is entering a field, blur is leaving it", "Focus is for buttons, blur is for text", "Blur happens only on scroll"), 1),
                        QuizQuestion("Which event tracks every single keystroke in an input?", listOf("change", "submit", "input", "blur"), 2),
                        QuizQuestion("What does 'window.scrollY' tell you during a scroll event?", listOf("The width of the page", "The vertical distance scrolled in pixels", "The speed of scrolling", "The number of elements on screen"), 1)
                    ),
                    subTopicName = "JS Events",
                    headlines = listOf(
                        Headline(
                            headline = "JS Events",
                            explaination = "JavaScript events are actions that happen in the browser, such as clicking a button, typing on the keyboard, or loading a page.",
                            codeExample = """
                <button onclick="showAlert()">Click Me</button>
                <script>
                    function showAlert() {
                        alert("Button clicked!");
                    }
                </script>
            """.trimIndent(),
                            afterCodeEplainations = "The function runs when the button is clicked."
                        ),

                        Headline(
                            headline = "Inline Event Handlers",
                            explaination = "Inline event handlers are written directly inside HTML elements using attributes like onclick or onmouseover.",
                            codeExample = """
                <button onclick="alert('Hello!')">Click</button>
            """.trimIndent(),
                            afterCodeEplainations = "Inline events are easy to use but not recommended for large applications as they mix logic with structure."
                        ),

                        Headline(
                            headline = "The addEventListener() Method",
                            explaination = "addEventListener() is the modern way to attach event handlers. It allows multiple listeners for a single event.",
                            codeExample = """
                <button id="btn">Click Me</button>
                <script>
                    document.getElementById("btn")
                        .addEventListener("click", () => {
                            alert("Modern click handler!");
                        });
                </script>
            """.trimIndent(),
                            afterCodeEplainations = "This method keeps JavaScript separate from HTML and is easier to maintain."
                        ),

                        Headline(
                            headline = "The DOMContentLoaded Event",
                            explaination = "This event fires when the HTML document has been completely loaded and parsed, without waiting for images or stylesheets.",
                            codeExample = """
                <script>
                    document.addEventListener("DOMContentLoaded", () => {
                        console.log("DOM is ready, you can now manipulate elements!");
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The input Event",
                            explaination = "Unlike 'change', the 'input' event fires immediately every time the value of an element changes.",
                            codeExample = """
                <input type="text" id="myInput">
                <p id="output"></p>
                <script>
                    document.getElementById("myInput").addEventListener("input", (e) => {
                        document.getElementById("output").innerText = e.target.value;
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Mouse Events: mousedown & mouseup",
                            explaination = "These track the exact moments a mouse button is pressed down and then released.",
                            codeExample = """
                <button id="holdBtn">Hold Me</button>
                <script>
                    const btn = document.getElementById("holdBtn");
                    btn.addEventListener("mousedown", () => btn.innerText = "Pressed!");
                    btn.addEventListener("mouseup", () => btn.innerText = "Released!");
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The keydown Event",
                            explaination = "The keydown event occurs the moment a key is pressed. It is more reliable than keypress for non-character keys.",
                            codeExample = """
                <script>
                    window.addEventListener("keydown", (event) => {
                        console.log("Key pressed: " + event.key);
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The submit Event",
                            explaination = "This event occurs when a form is submitted. It is usually used to validate data or prevent the page from refreshing.",
                            codeExample = """
                <form id="myForm">
                    <input type="text" required>
                    <button type="submit">Send</button>
                </form>
                <script>
                    document.getElementById("myForm").addEventListener("submit", (e) => {
                        e.preventDefault(); // Stops the page from refreshing
                        alert("Form submitted safely!");
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The focus and blur Events",
                            explaination = "Focus happens when you enter an input field; blur happens when you leave it.",
                            codeExample = """
                <input type="text" id="fld" placeholder="Focus me">
                <script>
                    const fld = document.getElementById("fld");
                    fld.onfocus = () => fld.style.border = "2px solid blue";
                    fld.onblur = () => fld.style.border = "1px solid gray";
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The scroll Event",
                            explaination = "The scroll event fires when the document view or an element has been scrolled.",
                            codeExample = """
                <script>
                    window.onscroll = () => {
                        console.log("You are scrolling at: " + window.scrollY + "px");
                    };
                </script>
            """.trimIndent(),
                            tip = "Use 'throttling' or 'debouncing' with scroll events to maintain browser performance."
                        ),

                        Headline(
                            headline = "The contextmenu Event",
                            explaination = "This event fires when the user attempts to open a context menu (usually by right-clicking).",
                            codeExample = """
                <div style="background: lightgray; height: 50px;">Right-click here</div>
                <script>
                    document.addEventListener("contextmenu", (e) => {
                        e.preventDefault();
                        alert("Right-click is disabled!");
                    });
                </script>
            """.trimIndent()
                        )
                    )
                )









            ),
            Subtopic(
                sutopicId=204,
                subTopicName = "HTML JavaScript",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML JavaScript",
                        majorHeadileExplanation = "Explain and well listing how js can be added and structure ",
                        codeExample ="give a runnable code example ",
                        tip = "give",
                        afterCodeEplainations = ""
                    ),
                    Headline(

                        codeExample = "good example",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "id and classes used in js",
                        explaination = "explain ",
                        codeExample = "good example showing how they are used and them being used ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        explaination = "explain ",
                        codeExample = "",

                        ),
                    Headline(
                        headline = " inline javascript",
                        explaination = "explain ",
                        codeExample = "good example having running example ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        explaination = "explain ",
                        codeExample = "",

                        ),
                    Headline(
                        headline = "HTML With javascript in the structure",
                        explaination = "explain ",
                        codeExample = "good example having full structure with html in the body",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        explaination = "explain ",
                        codeExample = "",

                        ),
                    Headline(
                        headline = "Dynamic Styling",
                        explaination = "explain ",
                        codeExample = "good example that can run ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        explaination = "explain ",
                        codeExample = "",

                        ),
                    Headline(
                        headline = "Hiding and showing",
                        explaination = "explain ",
                        codeExample = "good example ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        explaination = "explain ",
                        codeExample = "",

                        ),
                    Headline(
                        headline = "innerHtml",
                        explaination = "explain ",
                        codeExample = "good example ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        explaination = "explain ",
                        codeExample = "",

                        ),
                    questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )

                ),


                // --- SUBTOPIC 2: WRITING & INTEGRATING JS ---
                Subtopic(
                    sutopicId = 2,
                    subTopicName = "JS Writing Code",
                    headlines = listOf(
                        Headline(
                            headline = "The <script> Tag",
                            explaination = "JavaScript is executed by the browser's engine. To run it, code is either embedded directly into HTML or linked as an external script using the <script> tag. This tag tells the browser to pause HTML parsing and execute the logic inside.",
                            codeExample = "<script>\n  console.log('Writing JS directly in HTML!');\n</script>",
                            afterCodeEplainations = "Browsers read files from top to bottom, executing scripts as they are encountered."
                        ),
                        Headline(
                            headline = "Internal JS & Placement",
                            explaination = "Internal JS lives inside your HTML file. If placed in the <head>, it loads early but can slow down visual rendering. If placed at the bottom of the <body>, the page structure loads first, which is a common performance optimization.",
                            codeExample = "<body>\n  <h1 id='title'>Hello</h1>\n  <script>\n    // This runs after the <h1> is created\n    console.log('Body script executed');\n  </script>\n</body>",
                            tip = "Placing scripts in the head might cause errors if the script tries to access HTML elements that haven't been created yet."
                        ),
                        Headline(
                            headline = "External JS (.js Files)",
                            explaination = "For production, code is kept in separate .js files. This promotes 'Separation of Concerns' and allows browsers to cache the file, similar to how Linux shared libraries (.so files) save memory by being reused.",
                            codeExample = "// In HTML: <script src='script.js'></script>\n\n// In script.js:\nfunction init() {\n  console.log('External app started');\n}",
                            afterCodeEplainations = "The 'src' attribute acts like a file path, pointing the browser to the logic's location."
                        ),
                        Headline(
                            headline = "The Render Process & Parser Blocking",
                            explaination = "When a browser hits a script tag without special attributes, it stops building the page to download and run it. This is 'parser blocking'—think of it like a sequential bash script where command B must wait for A.",
                            codeExample = "<script src='heavy-library.js'></script>",
                            afterCodeEplainations = "Large scripts can make a site feel 'frozen' during this download phase."
                        ),
                        Headline(
                            headline = "Modern Loading: Async & Defer",
                            explaination = "Modern JS uses 'async' and 'defer' to prevent blocking. 'Defer' downloads the script in the background and executes it only after the HTML is fully parsed. This is currently the industry standard.",
                            codeExample = "<script src='app.js' defer></script>",
                            tip = "Always use 'defer' for external scripts in the <head> to get the best performance and avoid null errors."
                        ),
                        Headline(
                            headline = "Modern Module System",
                            explaination = "Today we use 'type=module' to organize code into pieces that can import/export functionality. Modules automatically use 'strict mode' to prevent common coding errors.",
                            codeExample = "<script type='module' src='main.js'></script>"
                        )
                    ),
                    questions = listOf(
                        QuizQuestion("Which tag is used for JavaScript?", listOf("<js>", "<script>", "<javascript>", "<code_js>"), 1),
                        QuizQuestion("What is the best location for scripts for performance?", listOf("In the <head>", "Before the <html> tag", "At the bottom of the <body>", "Inside a <div>"), 2),
                        QuizQuestion("Which attribute links an external JS file?", listOf("href", "link", "src", "path"), 2),
                        QuizQuestion("What does the 'defer' attribute do?", listOf("Stops the script", "Hides the script", "Downloads in background and runs after parsing", "Deletes the script"), 2),
                        QuizQuestion("Why is External JS better for performance?", listOf("It is smaller", "It can be cached by the browser", "It runs faster", "It uses less RAM"), 1)
                    )
                ),

                // --- SUBTOPIC 3: DISPLAYING OUTPUT & DEBUGGING ---
                Subtopic(
                    sutopicId = 3,
                    subTopicName = "JS Displaying Output",
                    headlines = listOf(
                        Headline(
                            headline = "Data Visualization Streams",
                            explaination = "JavaScript output means showing results to the user or developer. It can be displayed in the console, dialog boxes, or directly inside HTML elements.",
                            codeExample = "// Different output streams\nconsole.log('For developers');\nalert('For urgent alerts');\ndocument.getElementById('msg').innerHTML = 'For users';"
                        ),
                        Headline(
                            headline = "Using the Console",
                            explaination = "The console is the primary tool for debugging. Beyond log(), you can use console.table() to visualize arrays of data clearly in the browser's DevTools (F12).",
                            codeExample = """
                            const servers = [
                                { name: "Nginx", status: "Active" },
                                { name: "Apache", status: "Down" }
                            ];
                            console.table(servers);
                        """.trimIndent(),
                            afterCodeEplainations = "The output is not visible to website users, making it safe for sensitive debugging info."
                        ),
                        Headline(
                            headline = "Writing to HTML Components",
                            explaination = "JavaScript can change content by selecting an element's ID. You use 'innerHTML' for HTML content or 'textContent' for plain text. Use <br> for line breaks within innerHTML.",
                            codeExample = """
                            <p id="status"></p>
                            <script>
                                document.getElementById("status").innerHTML = "System:<br>Online";
                            </script>
                        """.trimIndent(),
                            tip = "Careful: innerHTML can be a security risk (XSS). Use textContent if you don't need to render HTML tags."
                        ),
                        Headline(
                            headline = "Using Dialog Boxes",
                            explaination = "Dialog boxes like alert(), confirm(), and prompt() are popups. Note that they are 'blocking' operations; they freeze the browser's main thread until the user interacts.",
                            codeExample = "alert('Welcome to the JavaScript Compiler!');"
                        ),
                        Headline(
                            headline = "The Window Object",
                            explaination = "In the browser, 'window' is the global object. This means 'window.alert()' and 'alert()' are identical. It represents the browser window itself.",
                            codeExample = "window.console.log('Global window access');"
                        ),
                        Headline(
                            headline = "Dangerous Output: document.write()",
                            explaination = "JavaScript can write directly to the document stream. However, if document.write() is used after the page has finished loading, it will overwrite the entire HTML document.",
                            codeExample = "function wipe() {\n  document.write('The rest of the page is now gone.');\n}",
                            tip = "Avoid using document.write() in real applications. It is strictly for quick testing."
                        )
                    ),
                    questions = listOf(
                        QuizQuestion("Which method is best for debugging?", listOf("alert()", "console.log()", "document.write()", "window.print()"), 1),
                        QuizQuestion("How do you change the content of an HTML element?", listOf(".innerHTML", ".changeText", ".value", ".setContent"), 0),
                        QuizQuestion("What is a risk of using innerHTML with user input?", listOf("Slow loading", "Security (XSS)", "Color changes", "Syntax errors"), 1),
                        QuizQuestion("What happens if document.write() runs after the page loads?", listOf("Adds text at top", "Does nothing", "Wipes the entire page", "Opens a new tab"), 2),
                        QuizQuestion("Which command prints a table of data?", listOf("console.grid()", "console.table()", "console.view()", "console.list()"), 1)
                    )
                )
                ,




                Subtopic(
                    sutopicId=4,
                    subTopicName = "JS Statements",
                    headlines = listOf(

                        Headline(
                            headline = "JS Statements",
                            explaination = "JavaScript statements are instructions that tell the browser what to do. "
                                    + "Each statement is executed in the order it is written.",
                            codeExample = """
                let x = 10;
                let y = 20;
                let sum = x + y;
            """.trimIndent(),
                            afterCodeEplainations = "Each line is a separate statement. "
                                    + "JavaScript reads and runs them one by one."
                        ),

                        Headline(
                            explaination = "JavaScript statements usually end with a semicolon. "
                                    + "The semicolon separates one statement from another.",
                            codeExample = """
                let name = "John";
                let age = 25;
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "JavaScript allows multiple statements in one line, "
                                    + "but writing one statement per line makes the code easier to read.",
                            codeExample = """
                let a = 5; let b = 10; let c = a + b;
            """.trimIndent(),
                            tip = "For better readability, always write one statement per line."
                        ),

                        Headline(
                            headline = "Grouping JS Statements",
                            explaination = "JavaScript statements can be grouped together using curly braces {}. "
                                    + "Grouped statements are treated as a block of code.",
                            codeExample = """
                if (x > 5) {
                    console.log("x is greater than 5");
                    console.log("This is a block of statements");
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "JS Keywords",
                            explaination = "JavaScript keywords are reserved words that have special meanings. "
                                    + "They are used to define actions, variables, and control the program flow.",
                            codeExample = """
                let number = 10;

                if (number > 5) {
                    console.log("Number is greater than 5");
                }
            """.trimIndent(),
                            afterCodeEplainations = "`let` and `if` are JavaScript keywords and cannot be used as variable names."
                        )

                    ),
                    questions = listOf(
                        QuizQuestion("What is a JavaScript statement?", listOf("A style rule", "An instruction to the browser", "A type of variable", "A comment"), 1),
                        QuizQuestion("Which character is usually used to separate JS statements?", listOf("Colon (:)", "Comma (,)", "Semicolon (;)", "Full stop (.)"), 2),
                        QuizQuestion("Is it possible to write multiple statements on one line?", listOf("No, it causes an error", "Yes, but it's not recommended", "Only inside a function", "Only if they are empty"), 1),
                        QuizQuestion("What are curly braces {} used for in statements?", listOf("To create a comment", "To group statements into a block", "To multiply numbers", "To end the program"), 1),
                        QuizQuestion("In what order are JavaScript statements executed?", listOf("Randomly", "Bottom to top", "In the order they are written", "Alphabetically"), 2)
                    )
                ),

                Subtopic(
                    sutopicId=5,
                    subTopicName = "JS Syntax",questions = listOf(
                        QuizQuestion("Which keyword is used for a variable that should NOT change?", listOf("let", "var", "const", "change"), 2),
                        QuizQuestion("Is JavaScript case-sensitive?", listOf("Yes", "No", "Only for numbers", "Only in Linux"), 0),
                        QuizQuestion("Which is a correct way to declare a variable in modern JS?", listOf("variable x = 5;", "let x = 5;", "set x = 5;", "int x = 5;"), 1),
                        QuizQuestion("If you have 'let Name' and 'let name', how many variables exist?", listOf("One", "Two", "None (error)", "It depends on the browser"), 1),
                        QuizQuestion("What is the naming style 'userName' called?", listOf("snake_case", "PascalCase", "camelCase", "Flatcase"), 2)
                    ),
                    headlines = listOf(

                        Headline(
                            headline = "JS Syntax?",
                            explaination = "JavaScript syntax refers to the rules that define how JavaScript code is written "
                                    + "and structured. Following correct syntax helps the browser understand and execute the code."
                        ),

                        Headline(
                            headline = "Variable Declaration",
                            explaination = "Variable declaration means creating a variable to store data. "
                                    + "JavaScript allows variables to be declared using let, const, or var.",
                            codeExample = """
                let name = "John";
                const age = 30;
                var city = "Paris";
            """.trimIndent(),
                            afterCodeEplainations = "`let` is used for values that can change, "
                                    + "`const` is used for fixed values, and `var` is an older way to declare variables."
                        ),

                        Headline(
                            headline = "Case Sensitivity",
                            explaination = "JavaScript is case-sensitive, which means uppercase and lowercase letters "
                                    + "are treated as different.",
                            codeExample = """
                let userName = "Alice";
                let username = "Bob";
            """.trimIndent(),
                            tip = "Always use consistent naming styles like camelCase to avoid errors."
                        )

                    )
                ),





                Subtopic(
                    sutopicId=6,
                    questions = listOf(
                        QuizQuestion("How do you start a single-line comment in JS?", listOf("/*", "//", "", "/* and */", "[[ and ]]"), 2),
                        QuizQuestion("What happens to comments during program execution?", listOf("They are displayed in console", "They are ignored by the browser", "They make the code run faster", "They cause an error"), 1),
                        QuizQuestion("Why would you use a comment to 'disable' code?", listOf("To make the file smaller", "To test logic without deleting it", "To encrypt the code", "To change the variable type"), 1),
                        QuizQuestion("Can a single-line comment be placed at the end of a statement?", listOf("Yes", "No", "Only inside a block", "Only with const"), 0)
                    ),
                    subTopicName = "JS Comments",
                    headlines = listOf(

                        Headline(
                            headline = "JS Comments",
                            explaination = "JavaScript comments are used to describe the code and make it easier to understand. "
                                    + "Comments are ignored by the browser and do not affect program execution."
                        ),

                        Headline(
                            headline = "Single-Line Comments",
                            explaination = "Single-line comments are used to comment only one line of code.",
                            codeExample = """
                // This is a single-line comment
                let x = 10; // This comment explains the variable
            """.trimIndent(),
                            afterCodeEplainations = "Anything written after // is treated as a comment and is not executed."
                        ),

                        Headline(
                            explaination = "Single-line comments are often used for short explanations or notes in the code.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Comments can also be used to explain complex logic or important steps in a program.",
                            tip = "Write clear and meaningful comments, but avoid commenting obvious code.",
                            codeExample = """
                // Calculate total price
                let total = price + tax;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Multi-Line Comments",
                            explaination = "Multi-line comments are used to comment multiple lines at once.",
                            codeExample = """
                /*
                  This is a multi-line comment
                  It can span multiple lines
                */
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Disabling Code Using Comments",
                            explaination = "Comments can be used to temporarily disable code without deleting it.",
                            codeExample = """
                // console.log("This line will not run");

                /*
                alert("This code is disabled");
                */
            """.trimIndent()
                        )

                    )
                ),


                Subtopic(
                    sutopicId = 7,
                    questions = listOf(
                        QuizQuestion("What is the result of 'let x;' if you log x?", listOf("0", "null", "undefined", "Error"), 2),
                        QuizQuestion("Which operator is used to assign a value to a variable?", listOf("==", "===", "=", ":="), 2),
                        QuizQuestion("What happens if you try to change a 'const' variable?", listOf("It changes successfully", "It resets to zero", "It causes a runtime error", "It creates a new variable"), 2),
                        QuizQuestion("Which is a valid variable name?", listOf("1stUser", "user-name", "_totalAmount", "let"), 2),
                        QuizQuestion("When should you use 'let' instead of 'const'?", listOf("When the value will stay the same", "When the value needs to be updated later", "Only for strings", "Only for numbers"), 1)
                    ),
                    subTopicName = "JS Variables",
                    headlines = listOf(

                        Headline(
                            headline = "JS Variables",
                            explaination = "Variables are used to store data values in JavaScript. "
                                    + "A variable can hold different types of data such as numbers or text.",
                            codeExample = "let name;",
                            afterCodeEplainations = "This declares a variable named name without assigning a value."
                        ),

                        Headline(
                            explaination = "The assignment operator (=) is used to assign a value to a variable.",
                            codeExample = """
                let age = 25;
                let city = "New York";
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "Variables can store different types of data and their values can be used later in the program.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Undefined Variable",
                            explaination = "A variable that is declared but not assigned a value is called an undefined variable.",
                            codeExample = """
                let x;
                console.log(x);
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Changing Value",
                            explaination = "The value of a variable can be changed after it is declared.",
                            codeExample = """
                let score = 10;
                score = 20;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Constant Variables",
                            explaination = "Constant variables are declared using const and their values cannot be changed.",
                            codeExample = """
                const pi = 3.14;
            """.trimIndent(),
                            afterCodeEplainations = "Trying to change a const variable will cause an error."
                        ),

                        Headline(
                            explaination = "Use let for values that change and const for values that should stay the same.",
                            tip = "Always prefer const unless you know the value will change.",
                            codeExample = """
                let count = 1;
                const maxLimit = 100;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Naming Variables",
                            explaination = "Variable names should be meaningful and describe the data they store."
                        ),

                        Headline(
                            headline = "Rules for Naming Variables",
                            explaination = "Variable names must start with a letter, underscore (_), or dollar sign ($) "
                                    + "and cannot contain spaces.",
                            tip = "Use camelCase for variable names, like userName or totalPrice."
                        )

                    ),
                ),



                Subtopic(
                    sutopicId = 8,
                    questions = listOf(
                        QuizQuestion("What keyword is used to create a function?", listOf("method", "function", "def", "routine"), 1),
                        QuizQuestion("How do you 'call' a function named 'myFunc'?", listOf("call myFunc", "myFunc[]", "myFunc()", "run(myFunc)"), 2),
                        QuizQuestion("What does the 'return' statement do?", listOf("Restarts the function", "Exits the function and sends back a value", "Repeats the code", "Deletes the variable"), 1),
                        QuizQuestion("A variable declared inside a function is:", listOf("Global", "Local (Function Scope)", "Shared", "Permanent"), 1),
                        QuizQuestion("What happens if you define a function but never call it?", listOf("The code runs once", "The browser crashes", "The code inside never executes", "It runs automatically"), 2)
                    ),
                    subTopicName = "JS Functions",

                    headlines = listOf(

                        Headline(
                            headline = "JS Functions",
                            explaination = "Functions are blocks of code designed to perform a specific task. "
                                    + "They help organize code and avoid repetition."
                        ),

                        Headline(
                            headline = "Function Definition",
                            explaination = "A function definition creates a function using the function keyword, "
                                    + "a name, and parentheses.",
                            tip = "Choose clear and meaningful function names.",
                            codeExample = """
                function greet() {
                    console.log("Hello!");
                }
            """.trimIndent(),
                            afterCodeEplainations = "This defines a function named greet, but it will not run until called."
                        ),

                        Headline(
                            explaination = "Functions can contain one or more statements inside their body.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Functions can be reused many times in a program.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Calling a Function",
                            explaination = "Calling a function means executing the code inside the function.",
                            codeExample = """
                greet();
            """.trimIndent(),
                            afterCodeEplainations = "This line runs the greet function."
                        ),

                        Headline(
                            explaination = "A function can be called multiple times whenever needed.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "The return Statement",
                            explaination = "The return statement sends a value back from the function.",
                            codeExample = """
                function add(a, b) {
                    return a + b;
                }
            """.trimIndent(),
                            afterCodeEplainations = "The function returns the result of a + b."
                        ),

                        Headline(
                            explaination = "Returned values can be stored in variables.",
                            codeExample = """
                let result = add(5, 3);
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "Once return is executed, the function stops running.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Not all functions need to return a value.",
                            tip = "Use return only when you need a result from the function.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Function Scope",
                            explaination = "Variables declared inside a function can only be used within that function.",
                            codeExample = """
                function test() {
                    let x = 10;
                    console.log(x);
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Global Vaiables",
                            explaination = "Global variables are declared outside functions and can be accessed anywhere in the code.",
                            codeExample = """
                let message = "Hello";

                function showMessage() {
                    console.log(message);
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Why Use Functions",
                            explaination = "Functions make code reusable, organized, and easier to maintain.",
                            tip = "Break large programs into smaller functions.",
                            codeExample = """
                function calculateTotal(price, tax) {
                    return price + tax;
                }
            """.trimIndent(),
                            afterCodeEplainations = "This function can be reused whenever total calculation is needed."
                        )

                    )
                ),




                Subtopic(
                    sutopicId = 9,
                    questions = listOf(
                        QuizQuestion("Which event fires when a user clicks an HTML element?", listOf("onhover", "onclick", "onpress", "onchange"), 1),
                        QuizQuestion("What is the modern method to attach an event handler?", listOf("on()", "attachEvent()", "addEventListener()", "setEvent()"), 2),
                        QuizQuestion("How do you prevent a form from refreshing the page on submit?", listOf("e.stop()", "e.preventDefault()", "e.halt()", "e.ignore()"), 1),
                        QuizQuestion("Which event fires as soon as the HTML is loaded but before images load?", listOf("onload", "DOMReady", "DOMContentLoaded", "onfinish"), 2),
                        QuizQuestion("What is the difference between 'focus' and 'blur'?", listOf("There is no difference", "Focus is entering a field, blur is leaving it", "Focus is for buttons, blur is for text", "Blur happens only on scroll"), 1),
                        QuizQuestion("Which event tracks every single keystroke in an input?", listOf("change", "submit", "input", "blur"), 2),
                        QuizQuestion("What does 'window.scrollY' tell you during a scroll event?", listOf("The width of the page", "The vertical distance scrolled in pixels", "The speed of scrolling", "The number of elements on screen"), 1)
                    ),
                    subTopicName = "JS Events",
                    headlines = listOf(
                        Headline(
                            headline = "JS Events",
                            explaination = "JavaScript events are actions that happen in the browser, such as clicking a button, typing on the keyboard, or loading a page.",
                            codeExample = """
                <button onclick="showAlert()">Click Me</button>
                <script>
                    function showAlert() {
                        alert("Button clicked!");
                    }
                </script>
            """.trimIndent(),
                            afterCodeEplainations = "The function runs when the button is clicked."
                        ),

                        Headline(
                            headline = "Inline Event Handlers",
                            explaination = "Inline event handlers are written directly inside HTML elements using attributes like onclick or onmouseover.",
                            codeExample = """
                <button onclick="alert('Hello!')">Click</button>
            """.trimIndent(),
                            afterCodeEplainations = "Inline events are easy to use but not recommended for large applications as they mix logic with structure."
                        ),

                        Headline(
                            headline = "The addEventListener() Method",
                            explaination = "addEventListener() is the modern way to attach event handlers. It allows multiple listeners for a single event.",
                            codeExample = """
                <button id="btn">Click Me</button>
                <script>
                    document.getElementById("btn")
                        .addEventListener("click", () => {
                            alert("Modern click handler!");
                        });
                </script>
            """.trimIndent(),
                            afterCodeEplainations = "This method keeps JavaScript separate from HTML and is easier to maintain."
                        ),

                        Headline(
                            headline = "The DOMContentLoaded Event",
                            explaination = "This event fires when the HTML document has been completely loaded and parsed, without waiting for images or stylesheets.",
                            codeExample = """
                <script>
                    document.addEventListener("DOMContentLoaded", () => {
                        console.log("DOM is ready, you can now manipulate elements!");
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The input Event",
                            explaination = "Unlike 'change', the 'input' event fires immediately every time the value of an element changes.",
                            codeExample = """
                <input type="text" id="myInput">
                <p id="output"></p>
                <script>
                    document.getElementById("myInput").addEventListener("input", (e) => {
                        document.getElementById("output").innerText = e.target.value;
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Mouse Events: mousedown & mouseup",
                            explaination = "These track the exact moments a mouse button is pressed down and then released.",
                            codeExample = """
                <button id="holdBtn">Hold Me</button>
                <script>
                    const btn = document.getElementById("holdBtn");
                    btn.addEventListener("mousedown", () => btn.innerText = "Pressed!");
                    btn.addEventListener("mouseup", () => btn.innerText = "Released!");
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The keydown Event",
                            explaination = "The keydown event occurs the moment a key is pressed. It is more reliable than keypress for non-character keys.",
                            codeExample = """
                <script>
                    window.addEventListener("keydown", (event) => {
                        console.log("Key pressed: " + event.key);
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The submit Event",
                            explaination = "This event occurs when a form is submitted. It is usually used to validate data or prevent the page from refreshing.",
                            codeExample = """
                <form id="myForm">
                    <input type="text" required>
                    <button type="submit">Send</button>
                </form>
                <script>
                    document.getElementById("myForm").addEventListener("submit", (e) => {
                        e.preventDefault(); // Stops the page from refreshing
                        alert("Form submitted safely!");
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The focus and blur Events",
                            explaination = "Focus happens when you enter an input field; blur happens when you leave it.",
                            codeExample = """
                <input type="text" id="fld" placeholder="Focus me">
                <script>
                    const fld = document.getElementById("fld");
                    fld.onfocus = () => fld.style.border = "2px solid blue";
                    fld.onblur = () => fld.style.border = "1px solid gray";
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The scroll Event",
                            explaination = "The scroll event fires when the document view or an element has been scrolled.",
                            codeExample = """
                <script>
                    window.onscroll = () => {
                        console.log("You are scrolling at: " + window.scrollY + "px");
                    };
                </script>
            """.trimIndent(),
                            tip = "Use 'throttling' or 'debouncing' with scroll events to maintain browser performance."
                        ),

                        Headline(
                            headline = "The contextmenu Event",
                            explaination = "This event fires when the user attempts to open a context menu (usually by right-clicking).",
                            codeExample = """
                <div style="background: lightgray; height: 50px;">Right-click here</div>
                <script>
                    document.addEventListener("contextmenu", (e) => {
                        e.preventDefault();
                        alert("Right-click is disabled!");
                    });
                </script>
            """.trimIndent()
                        )
                    )
                )









            ),

            ),
    ),



    NoteModule(
   topic = "Forms in HTML5",
   topicId=1,
   subtopics = listOf(
       Subtopic(
           sutopicId=111,
           subTopicName = "Forms in HTML5",
           headlines = listOf(
               Headline(
                   majorHeadline ="Forms in HTML",
                   explaination = "Explain and show the tag used for forms" ,
                   codeExample = "give a simple form ",
                   tip = "give tip"
               ),

               Headline(

                   headline = "Attributes in a form ",
                   explaination = "Give all the attributes in a form in a bulleting the way they are types or names and how they are used or where ",
                   codeExample = "give amazing runnable html example involving all",
                   afterCodeEplainations = ""

               ),
               Headline(
                   headline = "Attribute method",
                   explaination = "Explain " ,
                   codeExample = "give amazing runnable code",
                   afterCodeEplainations = "Explain",

                   ),
               Headline(
                   headline = "Post vs Get",
                   explaination = "Explain " ,
                   codeExample = "give amazing runnable code",
                   afterCodeEplainations = "Explain",

                   ),
               Headline(
                   headline = "Submit",
                   explaination = "Explain " ,
                   codeExample = "give amazing runnable code",
                   afterCodeEplainations = "Explain",

                   ),
               Headline(
                   headline = "Elements in form",
                   explaination = "Explain " ,
                   codeExample = "give amazing runnable code",
                   afterCodeEplainations = "Explain",

                   ),
               Headline(
                   headline = "input",
                   explaination = "Explain " ,
                   codeExample = "give amazing runnable code",
                   afterCodeEplainations = "Explain",

                   ),


               Headline(
                   headline = "Give other(s) Headline",
                   explaination = "explain ",
                   codeExample = "amazing",
                   afterCodeEplainations = "Explain",

                   ),
               questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                   QuizQuestion(
                       "Question",
                       listOf(
                           "options"
                       ),
                       number of correct ans
                   )


               )
           )

       ) ,
       Subtopic(
           sutopicId=112,
           subTopicName = "Form labels",
           headlines = listOf(
               Headline(
                   majorHeadline = "Form labels",
                   majorHeadileExplanation = "Explain giving proper structure of label and all the attributes in well bulleting way",

                   tip = "give",
                   codeExample = "give good simple running example"
               ),
               Headline(
                   headline = "Input inside label",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run  ",
                   afterCodeEplainations = "Explain",

                   ),
               Headline(

                   codeExample = "give amazing runnable example",
                   afterCodeEplainations = ""

               ),
               Headline(
                   headline = "Styling HTML Form",
                   explaination = "Explain listing them and bulleting them all",
                   codeExample ="give code example that user can run ",

                   ),
               Headline(
                   headline = "style with id ",

                   codeExample ="give amazing code example that user can run ",

                   ),
               Headline(
                   headline = "inline styling form",

                   codeExample ="give code example that user can run involving or having most inline styles ",

                   ),
               Headline(
                   headline = "internal styling form",

                   codeExample ="give code example that user can run involving or having most internal styles ",

                   ),

               questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                   QuizQuestion(
                       "Question",
                       listOf(
                           "options"
                       ),
                       number of correct ans
                   )


               )

           ),
       ),
       Subtopic(
           sutopicId=113,
           subTopicName = "Input types",
           headlines = listOf(
               Headline(
                   majorHeadline = "Input types in HTML",
                   majorHeadileExplanation = "explain showing tag used",
                   codeExample = "give a runnable involving html colors more than one ",


                   tip = "give tip"
               ),
               Headline(
                   headline = "Text",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input type text and button and small running js ",


                   ),
               Headline(
                   headline = "CheckBox",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input type CheckBox and button and small running js ",


                   ),
               Headline(
                   headline = "color",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input type color and button and small running js ",
                   ),

               Headline(
                   headline = "Radio button",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input type radio and button and small running js ",
                   ),

               Headline(
                   headline = "grouping radio button",
                   explaination = "explain ",
                   codeExample = "give amazing runnable html  example with input type radio and button and small running js ",


                   ),
               Headline(
                   headline = "Date",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input type Date and button and small running js ",
               ),
               Headline(
                   headline = "Datetie Local",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input type Datetime local and button and small running js ",
               ),
               Headline(
                   headline = "password",
                   explaination = "explain ",
                   codeExample = "give good example involving pass with js ",


                   ),
               Headline(
                   headline = "hidind and showing password",
                   explaination = "explain ",
                   codeExample = "good example that can be runned",


                   ),
               Headline(
                   headline = "Email",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input email  and button and small running js ",
               ),
               Headline(
                   headline = "FIle",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input type file and button and small running js ",
               ),
               Headline(
                   headline = "Hidden",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input type hiden and button and small running js ",
               ),
               Headline(
                   headline = "Month",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input type month and button and small running js ",
               ),
               Headline(
                   headline = "Number",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input type Number and button and small running js ",
               ),
               Headline(
                   headline = "Range",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input type range and button and small running js ",
               ),
               Headline(
                   headline = "Search",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input search Date and button and small running js ",
               ),
               Headline(
                   headline = "Tel",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input type tel and button and small running js ",
               ),
               Headline(
                   headline = "Time",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input type time and button and small running js ",
               ),
               Headline(
                   headline = "Url",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input url Date and button and small running js ",
               ),
               Headline(
                   headline = "Week",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input type week and button and small running js ",
               ),
               Headline(
                   headline = "submit",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input submit Date and button and small running js ",
               ),
               Headline(
                   headline = "Cancel",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input type clear or cancel and button and small running js ",
               ),
               Headline(
                   headline = "Modifing input with js",
                   explaination ="exaplain",
                   codeExample = "good example with js that is running modifing input in may ways with buttons too",
                   afterCodeEplainations = "Explain",

                   ),
               questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                   QuizQuestion(
                       "Question",
                       listOf(
                           "options"
                       ),
                       number of correct ans
                   )


               )
           )

       ),
       Subtopic(
           sutopicId=114,
           subTopicName = "HTML Textarea",
           headlines = listOf(
               Headline(
                   majorHeadline = "HTML Textarea",
                   majorHeadileExplanation = "Explain  and show tag used",
                   tip = "give",
                   codeExample = "good example",

                   ),
               Headline(
                   headline = "Table Textarea ",
                   explaination = "explain all using bulleting listing them with ther names and how they are used and why ",

                   codeExample ="give a runnable code example  you can use comment to explain inside the code",


                   ),
               Headline(
                   headline = "Styling Textarea",
                   explaination = "show inline styling",
                   codeExample = "good running example  showing commonly inline styling",


                   ),
               Headline(

                   explaination = "show internal styling",
                   codeExample = "good running example showing commonly internal styling",


                   ),
               Headline(
                   headline = "Getting Values of textarea ",
                   explaination ="exaplain",
                       codeExample = "good example with js that is running",
                   afterCodeEplainations = "Explain",

                   ),
               Headline(
                   headline = "Modifing TextArea with js",
                   explaination ="exaplain",
                   codeExample = "good example with js that is running modifing textarea in may ways with buttons too",
                   afterCodeEplainations = "Explain",

                   ),

               questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                   QuizQuestion(
                       "Question",
                       listOf(
                           "options"
                       ),
                       number of correct ans
                   )


               )

           ),


           // --- SUBTOPIC 2: WRITING & INTEGRATING JS ---
           Subtopic(
               sutopicId = 2,
               subTopicName = "JS Writing Code",
               headlines = listOf(
                   Headline(
                       headline = "The <script> Tag",
                       explaination = "JavaScript is executed by the browser's engine. To run it, code is either embedded directly into HTML or linked as an external script using the <script> tag. This tag tells the browser to pause HTML parsing and execute the logic inside.",
                       codeExample = "<script>\n  console.log('Writing JS directly in HTML!');\n</script>",
                       afterCodeEplainations = "Browsers read files from top to bottom, executing scripts as they are encountered."
                   ),
                   Headline(
                       headline = "Internal JS & Placement",
                       explaination = "Internal JS lives inside your HTML file. If placed in the <head>, it loads early but can slow down visual rendering. If placed at the bottom of the <body>, the page structure loads first, which is a common performance optimization.",
                       codeExample = "<body>\n  <h1 id='title'>Hello</h1>\n  <script>\n    // This runs after the <h1> is created\n    console.log('Body script executed');\n  </script>\n</body>",
                       tip = "Placing scripts in the head might cause errors if the script tries to access HTML elements that haven't been created yet."
                   ),
                   Headline(
                       headline = "External JS (.js Files)",
                       explaination = "For production, code is kept in separate .js files. This promotes 'Separation of Concerns' and allows browsers to cache the file, similar to how Linux shared libraries (.so files) save memory by being reused.",
                       codeExample = "// In HTML: <script src='script.js'></script>\n\n// In script.js:\nfunction init() {\n  console.log('External app started');\n}",
                       afterCodeEplainations = "The 'src' attribute acts like a file path, pointing the browser to the logic's location."
                   ),
                   Headline(
                       headline = "The Render Process & Parser Blocking",
                       explaination = "When a browser hits a script tag without special attributes, it stops building the page to download and run it. This is 'parser blocking'—think of it like a sequential bash script where command B must wait for A.",
                       codeExample = "<script src='heavy-library.js'></script>",
                       afterCodeEplainations = "Large scripts can make a site feel 'frozen' during this download phase."
                   ),
                   Headline(
                       headline = "Modern Loading: Async & Defer",
                       explaination = "Modern JS uses 'async' and 'defer' to prevent blocking. 'Defer' downloads the script in the background and executes it only after the HTML is fully parsed. This is currently the industry standard.",
                       codeExample = "<script src='app.js' defer></script>",
                       tip = "Always use 'defer' for external scripts in the <head> to get the best performance and avoid null errors."
                   ),
                   Headline(
                       headline = "Modern Module System",
                       explaination = "Today we use 'type=module' to organize code into pieces that can import/export functionality. Modules automatically use 'strict mode' to prevent common coding errors.",
                       codeExample = "<script type='module' src='main.js'></script>"
                   )
               ),
               questions = listOf(
                   QuizQuestion("Which tag is used for JavaScript?", listOf("<js>", "<script>", "<javascript>", "<code_js>"), 1),
                   QuizQuestion("What is the best location for scripts for performance?", listOf("In the <head>", "Before the <html> tag", "At the bottom of the <body>", "Inside a <div>"), 2),
                   QuizQuestion("Which attribute links an external JS file?", listOf("href", "link", "src", "path"), 2),
                   QuizQuestion("What does the 'defer' attribute do?", listOf("Stops the script", "Hides the script", "Downloads in background and runs after parsing", "Deletes the script"), 2),
                   QuizQuestion("Why is External JS better for performance?", listOf("It is smaller", "It can be cached by the browser", "It runs faster", "It uses less RAM"), 1)
               )
           ),

           // --- SUBTOPIC 3: DISPLAYING OUTPUT & DEBUGGING ---
           Subtopic(
               sutopicId = 3,
               subTopicName = "JS Displaying Output",
               headlines = listOf(
                   Headline(
                       headline = "Data Visualization Streams",
                       explaination = "JavaScript output means showing results to the user or developer. It can be displayed in the console, dialog boxes, or directly inside HTML elements.",
                       codeExample = "// Different output streams\nconsole.log('For developers');\nalert('For urgent alerts');\ndocument.getElementById('msg').innerHTML = 'For users';"
                   ),
                   Headline(
                       headline = "Using the Console",
                       explaination = "The console is the primary tool for debugging. Beyond log(), you can use console.table() to visualize arrays of data clearly in the browser's DevTools (F12).",
                       codeExample = """
                            const servers = [
                                { name: "Nginx", status: "Active" },
                                { name: "Apache", status: "Down" }
                            ];
                            console.table(servers);
                        """.trimIndent(),
                       afterCodeEplainations = "The output is not visible to website users, making it safe for sensitive debugging info."
                   ),
                   Headline(
                       headline = "Writing to HTML Components",
                       explaination = "JavaScript can change content by selecting an element's ID. You use 'innerHTML' for HTML content or 'textContent' for plain text. Use <br> for line breaks within innerHTML.",
                       codeExample = """
                            <p id="status"></p>
                            <script>
                                document.getElementById("status").innerHTML = "System:<br>Online";
                            </script>
                        """.trimIndent(),
                       tip = "Careful: innerHTML can be a security risk (XSS). Use textContent if you don't need to render HTML tags."
                   ),
                   Headline(
                       headline = "Using Dialog Boxes",
                       explaination = "Dialog boxes like alert(), confirm(), and prompt() are popups. Note that they are 'blocking' operations; they freeze the browser's main thread until the user interacts.",
                       codeExample = "alert('Welcome to the JavaScript Compiler!');"
                   ),
                   Headline(
                       headline = "The Window Object",
                       explaination = "In the browser, 'window' is the global object. This means 'window.alert()' and 'alert()' are identical. It represents the browser window itself.",
                       codeExample = "window.console.log('Global window access');"
                   ),
                   Headline(
                       headline = "Dangerous Output: document.write()",
                       explaination = "JavaScript can write directly to the document stream. However, if document.write() is used after the page has finished loading, it will overwrite the entire HTML document.",
                       codeExample = "function wipe() {\n  document.write('The rest of the page is now gone.');\n}",
                       tip = "Avoid using document.write() in real applications. It is strictly for quick testing."
                   )
               ),
               questions = listOf(
                   QuizQuestion("Which method is best for debugging?", listOf("alert()", "console.log()", "document.write()", "window.print()"), 1),
                   QuizQuestion("How do you change the content of an HTML element?", listOf(".innerHTML", ".changeText", ".value", ".setContent"), 0),
                   QuizQuestion("What is a risk of using innerHTML with user input?", listOf("Slow loading", "Security (XSS)", "Color changes", "Syntax errors"), 1),
                   QuizQuestion("What happens if document.write() runs after the page loads?", listOf("Adds text at top", "Does nothing", "Wipes the entire page", "Opens a new tab"), 2),
                   QuizQuestion("Which command prints a table of data?", listOf("console.grid()", "console.table()", "console.view()", "console.list()"), 1)
               )
           )
           ,




           Subtopic(
               sutopicId=4,
               subTopicName = "JS Statements",
               headlines = listOf(

                   Headline(
                       headline = "JS Statements",
                       explaination = "JavaScript statements are instructions that tell the browser what to do. "
                               + "Each statement is executed in the order it is written.",
                       codeExample = """
                let x = 10;
                let y = 20;
                let sum = x + y;
            """.trimIndent(),
                       afterCodeEplainations = "Each line is a separate statement. "
                               + "JavaScript reads and runs them one by one."
                   ),

                   Headline(
                       explaination = "JavaScript statements usually end with a semicolon. "
                               + "The semicolon separates one statement from another.",
                       codeExample = """
                let name = "John";
                let age = 25;
            """.trimIndent()
                   ),

                   Headline(
                       explaination = "JavaScript allows multiple statements in one line, "
                               + "but writing one statement per line makes the code easier to read.",
                       codeExample = """
                let a = 5; let b = 10; let c = a + b;
            """.trimIndent(),
                       tip = "For better readability, always write one statement per line."
                   ),

                   Headline(
                       headline = "Grouping JS Statements",
                       explaination = "JavaScript statements can be grouped together using curly braces {}. "
                               + "Grouped statements are treated as a block of code.",
                       codeExample = """
                if (x > 5) {
                    console.log("x is greater than 5");
                    console.log("This is a block of statements");
                }
            """.trimIndent()
                   ),

                   Headline(
                       headline = "JS Keywords",
                       explaination = "JavaScript keywords are reserved words that have special meanings. "
                               + "They are used to define actions, variables, and control the program flow.",
                       codeExample = """
                let number = 10;

                if (number > 5) {
                    console.log("Number is greater than 5");
                }
            """.trimIndent(),
                       afterCodeEplainations = "`let` and `if` are JavaScript keywords and cannot be used as variable names."
                   )

               ),
               questions = listOf(
                   QuizQuestion("What is a JavaScript statement?", listOf("A style rule", "An instruction to the browser", "A type of variable", "A comment"), 1),
                   QuizQuestion("Which character is usually used to separate JS statements?", listOf("Colon (:)", "Comma (,)", "Semicolon (;)", "Full stop (.)"), 2),
                   QuizQuestion("Is it possible to write multiple statements on one line?", listOf("No, it causes an error", "Yes, but it's not recommended", "Only inside a function", "Only if they are empty"), 1),
                   QuizQuestion("What are curly braces {} used for in statements?", listOf("To create a comment", "To group statements into a block", "To multiply numbers", "To end the program"), 1),
                   QuizQuestion("In what order are JavaScript statements executed?", listOf("Randomly", "Bottom to top", "In the order they are written", "Alphabetically"), 2)
               )
           ),

           Subtopic(
               sutopicId=5,
               subTopicName = "JS Syntax",questions = listOf(
                   QuizQuestion("Which keyword is used for a variable that should NOT change?", listOf("let", "var", "const", "change"), 2),
                   QuizQuestion("Is JavaScript case-sensitive?", listOf("Yes", "No", "Only for numbers", "Only in Linux"), 0),
                   QuizQuestion("Which is a correct way to declare a variable in modern JS?", listOf("variable x = 5;", "let x = 5;", "set x = 5;", "int x = 5;"), 1),
                   QuizQuestion("If you have 'let Name' and 'let name', how many variables exist?", listOf("One", "Two", "None (error)", "It depends on the browser"), 1),
                   QuizQuestion("What is the naming style 'userName' called?", listOf("snake_case", "PascalCase", "camelCase", "Flatcase"), 2)
               ),
               headlines = listOf(

                   Headline(
                       headline = "JS Syntax?",
                       explaination = "JavaScript syntax refers to the rules that define how JavaScript code is written "
                               + "and structured. Following correct syntax helps the browser understand and execute the code."
                   ),

                   Headline(
                       headline = "Variable Declaration",
                       explaination = "Variable declaration means creating a variable to store data. "
                               + "JavaScript allows variables to be declared using let, const, or var.",
                       codeExample = """
                let name = "John";
                const age = 30;
                var city = "Paris";
            """.trimIndent(),
                       afterCodeEplainations = "`let` is used for values that can change, "
                               + "`const` is used for fixed values, and `var` is an older way to declare variables."
                   ),

                   Headline(
                       headline = "Case Sensitivity",
                       explaination = "JavaScript is case-sensitive, which means uppercase and lowercase letters "
                               + "are treated as different.",
                       codeExample = """
                let userName = "Alice";
                let username = "Bob";
            """.trimIndent(),
                       tip = "Always use consistent naming styles like camelCase to avoid errors."
                   )

               )
           ),





           Subtopic(
               sutopicId=6,
               questions = listOf(
                   QuizQuestion("How do you start a single-line comment in JS?", listOf("/*", "//", "", "/* and */", "[[ and ]]"), 2),
                   QuizQuestion("What happens to comments during program execution?", listOf("They are displayed in console", "They are ignored by the browser", "They make the code run faster", "They cause an error"), 1),
                   QuizQuestion("Why would you use a comment to 'disable' code?", listOf("To make the file smaller", "To test logic without deleting it", "To encrypt the code", "To change the variable type"), 1),
                   QuizQuestion("Can a single-line comment be placed at the end of a statement?", listOf("Yes", "No", "Only inside a block", "Only with const"), 0)
               ),
               subTopicName = "JS Comments",
               headlines = listOf(

                   Headline(
                       headline = "JS Comments",
                       explaination = "JavaScript comments are used to describe the code and make it easier to understand. "
                               + "Comments are ignored by the browser and do not affect program execution."
                   ),

                   Headline(
                       headline = "Single-Line Comments",
                       explaination = "Single-line comments are used to comment only one line of code.",
                       codeExample = """
                // This is a single-line comment
                let x = 10; // This comment explains the variable
            """.trimIndent(),
                       afterCodeEplainations = "Anything written after // is treated as a comment and is not executed."
                   ),

                   Headline(
                       explaination = "Single-line comments are often used for short explanations or notes in the code.",
                       codeExample = ""
                   ),

                   Headline(
                       explaination = "Comments can also be used to explain complex logic or important steps in a program.",
                       tip = "Write clear and meaningful comments, but avoid commenting obvious code.",
                       codeExample = """
                // Calculate total price
                let total = price + tax;
            """.trimIndent()
                   ),

                   Headline(
                       headline = "Multi-Line Comments",
                       explaination = "Multi-line comments are used to comment multiple lines at once.",
                       codeExample = """
                /*
                  This is a multi-line comment
                  It can span multiple lines
                */
            """.trimIndent()
                   ),

                   Headline(
                       headline = "Disabling Code Using Comments",
                       explaination = "Comments can be used to temporarily disable code without deleting it.",
                       codeExample = """
                // console.log("This line will not run");

                /*
                alert("This code is disabled");
                */
            """.trimIndent()
                   )

               )
           ),


           Subtopic(
               sutopicId = 7,
               questions = listOf(
                   QuizQuestion("What is the result of 'let x;' if you log x?", listOf("0", "null", "undefined", "Error"), 2),
                   QuizQuestion("Which operator is used to assign a value to a variable?", listOf("==", "===", "=", ":="), 2),
                   QuizQuestion("What happens if you try to change a 'const' variable?", listOf("It changes successfully", "It resets to zero", "It causes a runtime error", "It creates a new variable"), 2),
                   QuizQuestion("Which is a valid variable name?", listOf("1stUser", "user-name", "_totalAmount", "let"), 2),
                   QuizQuestion("When should you use 'let' instead of 'const'?", listOf("When the value will stay the same", "When the value needs to be updated later", "Only for strings", "Only for numbers"), 1)
               ),
               subTopicName = "JS Variables",
               headlines = listOf(

                   Headline(
                       headline = "JS Variables",
                       explaination = "Variables are used to store data values in JavaScript. "
                               + "A variable can hold different types of data such as numbers or text.",
                       codeExample = "let name;",
                       afterCodeEplainations = "This declares a variable named name without assigning a value."
                   ),

                   Headline(
                       explaination = "The assignment operator (=) is used to assign a value to a variable.",
                       codeExample = """
                let age = 25;
                let city = "New York";
            """.trimIndent()
                   ),

                   Headline(
                       explaination = "Variables can store different types of data and their values can be used later in the program.",
                       codeExample = ""
                   ),

                   Headline(
                       headline = "Undefined Variable",
                       explaination = "A variable that is declared but not assigned a value is called an undefined variable.",
                       codeExample = """
                let x;
                console.log(x);
            """.trimIndent()
                   ),

                   Headline(
                       headline = "Changing Value",
                       explaination = "The value of a variable can be changed after it is declared.",
                       codeExample = """
                let score = 10;
                score = 20;
            """.trimIndent()
                   ),

                   Headline(
                       headline = "Constant Variables",
                       explaination = "Constant variables are declared using const and their values cannot be changed.",
                       codeExample = """
                const pi = 3.14;
            """.trimIndent(),
                       afterCodeEplainations = "Trying to change a const variable will cause an error."
                   ),

                   Headline(
                       explaination = "Use let for values that change and const for values that should stay the same.",
                       tip = "Always prefer const unless you know the value will change.",
                       codeExample = """
                let count = 1;
                const maxLimit = 100;
            """.trimIndent()
                   ),

                   Headline(
                       headline = "Naming Variables",
                       explaination = "Variable names should be meaningful and describe the data they store."
                   ),

                   Headline(
                       headline = "Rules for Naming Variables",
                       explaination = "Variable names must start with a letter, underscore (_), or dollar sign ($) "
                               + "and cannot contain spaces.",
                       tip = "Use camelCase for variable names, like userName or totalPrice."
                   )

               ),
           ),



           Subtopic(
               sutopicId = 8,
               questions = listOf(
                   QuizQuestion("What keyword is used to create a function?", listOf("method", "function", "def", "routine"), 1),
                   QuizQuestion("How do you 'call' a function named 'myFunc'?", listOf("call myFunc", "myFunc[]", "myFunc()", "run(myFunc)"), 2),
                   QuizQuestion("What does the 'return' statement do?", listOf("Restarts the function", "Exits the function and sends back a value", "Repeats the code", "Deletes the variable"), 1),
                   QuizQuestion("A variable declared inside a function is:", listOf("Global", "Local (Function Scope)", "Shared", "Permanent"), 1),
                   QuizQuestion("What happens if you define a function but never call it?", listOf("The code runs once", "The browser crashes", "The code inside never executes", "It runs automatically"), 2)
               ),
               subTopicName = "JS Functions",

               headlines = listOf(

                   Headline(
                       headline = "JS Functions",
                       explaination = "Functions are blocks of code designed to perform a specific task. "
                               + "They help organize code and avoid repetition."
                   ),

                   Headline(
                       headline = "Function Definition",
                       explaination = "A function definition creates a function using the function keyword, "
                               + "a name, and parentheses.",
                       tip = "Choose clear and meaningful function names.",
                       codeExample = """
                function greet() {
                    console.log("Hello!");
                }
            """.trimIndent(),
                       afterCodeEplainations = "This defines a function named greet, but it will not run until called."
                   ),

                   Headline(
                       explaination = "Functions can contain one or more statements inside their body.",
                       codeExample = ""
                   ),

                   Headline(
                       explaination = "Functions can be reused many times in a program.",
                       codeExample = ""
                   ),

                   Headline(
                       headline = "Calling a Function",
                       explaination = "Calling a function means executing the code inside the function.",
                       codeExample = """
                greet();
            """.trimIndent(),
                       afterCodeEplainations = "This line runs the greet function."
                   ),

                   Headline(
                       explaination = "A function can be called multiple times whenever needed.",
                       codeExample = ""
                   ),

                   Headline(
                       headline = "The return Statement",
                       explaination = "The return statement sends a value back from the function.",
                       codeExample = """
                function add(a, b) {
                    return a + b;
                }
            """.trimIndent(),
                       afterCodeEplainations = "The function returns the result of a + b."
                   ),

                   Headline(
                       explaination = "Returned values can be stored in variables.",
                       codeExample = """
                let result = add(5, 3);
            """.trimIndent()
                   ),

                   Headline(
                       explaination = "Once return is executed, the function stops running.",
                       codeExample = ""
                   ),

                   Headline(
                       explaination = "Not all functions need to return a value.",
                       tip = "Use return only when you need a result from the function.",
                       codeExample = ""
                   ),

                   Headline(
                       headline = "Function Scope",
                       explaination = "Variables declared inside a function can only be used within that function.",
                       codeExample = """
                function test() {
                    let x = 10;
                    console.log(x);
                }
            """.trimIndent()
                   ),

                   Headline(
                       headline = "Global Vaiables",
                       explaination = "Global variables are declared outside functions and can be accessed anywhere in the code.",
                       codeExample = """
                let message = "Hello";

                function showMessage() {
                    console.log(message);
                }
            """.trimIndent()
                   ),

                   Headline(
                       headline = "Why Use Functions",
                       explaination = "Functions make code reusable, organized, and easier to maintain.",
                       tip = "Break large programs into smaller functions.",
                       codeExample = """
                function calculateTotal(price, tax) {
                    return price + tax;
                }
            """.trimIndent(),
                       afterCodeEplainations = "This function can be reused whenever total calculation is needed."
                   )

               )
           ),




           Subtopic(
               sutopicId = 9,
               questions = listOf(
                   QuizQuestion("Which event fires when a user clicks an HTML element?", listOf("onhover", "onclick", "onpress", "onchange"), 1),
                   QuizQuestion("What is the modern method to attach an event handler?", listOf("on()", "attachEvent()", "addEventListener()", "setEvent()"), 2),
                   QuizQuestion("How do you prevent a form from refreshing the page on submit?", listOf("e.stop()", "e.preventDefault()", "e.halt()", "e.ignore()"), 1),
                   QuizQuestion("Which event fires as soon as the HTML is loaded but before images load?", listOf("onload", "DOMReady", "DOMContentLoaded", "onfinish"), 2),
                   QuizQuestion("What is the difference between 'focus' and 'blur'?", listOf("There is no difference", "Focus is entering a field, blur is leaving it", "Focus is for buttons, blur is for text", "Blur happens only on scroll"), 1),
                   QuizQuestion("Which event tracks every single keystroke in an input?", listOf("change", "submit", "input", "blur"), 2),
                   QuizQuestion("What does 'window.scrollY' tell you during a scroll event?", listOf("The width of the page", "The vertical distance scrolled in pixels", "The speed of scrolling", "The number of elements on screen"), 1)
               ),
               subTopicName = "JS Events",
               headlines = listOf(
                   Headline(
                       headline = "JS Events",
                       explaination = "JavaScript events are actions that happen in the browser, such as clicking a button, typing on the keyboard, or loading a page.",
                       codeExample = """
                <button onclick="showAlert()">Click Me</button>
                <script>
                    function showAlert() {
                        alert("Button clicked!");
                    }
                </script>
            """.trimIndent(),
                       afterCodeEplainations = "The function runs when the button is clicked."
                   ),

                   Headline(
                       headline = "Inline Event Handlers",
                       explaination = "Inline event handlers are written directly inside HTML elements using attributes like onclick or onmouseover.",
                       codeExample = """
                <button onclick="alert('Hello!')">Click</button>
            """.trimIndent(),
                       afterCodeEplainations = "Inline events are easy to use but not recommended for large applications as they mix logic with structure."
                   ),

                   Headline(
                       headline = "The addEventListener() Method",
                       explaination = "addEventListener() is the modern way to attach event handlers. It allows multiple listeners for a single event.",
                       codeExample = """
                <button id="btn">Click Me</button>
                <script>
                    document.getElementById("btn")
                        .addEventListener("click", () => {
                            alert("Modern click handler!");
                        });
                </script>
            """.trimIndent(),
                       afterCodeEplainations = "This method keeps JavaScript separate from HTML and is easier to maintain."
                   ),

                   Headline(
                       headline = "The DOMContentLoaded Event",
                       explaination = "This event fires when the HTML document has been completely loaded and parsed, without waiting for images or stylesheets.",
                       codeExample = """
                <script>
                    document.addEventListener("DOMContentLoaded", () => {
                        console.log("DOM is ready, you can now manipulate elements!");
                    });
                </script>
            """.trimIndent()
                   ),

                   Headline(
                       headline = "The input Event",
                       explaination = "Unlike 'change', the 'input' event fires immediately every time the value of an element changes.",
                       codeExample = """
                <input type="text" id="myInput">
                <p id="output"></p>
                <script>
                    document.getElementById("myInput").addEventListener("input", (e) => {
                        document.getElementById("output").innerText = e.target.value;
                    });
                </script>
            """.trimIndent()
                   ),

                   Headline(
                       headline = "Mouse Events: mousedown & mouseup",
                       explaination = "These track the exact moments a mouse button is pressed down and then released.",
                       codeExample = """
                <button id="holdBtn">Hold Me</button>
                <script>
                    const btn = document.getElementById("holdBtn");
                    btn.addEventListener("mousedown", () => btn.innerText = "Pressed!");
                    btn.addEventListener("mouseup", () => btn.innerText = "Released!");
                </script>
            """.trimIndent()
                   ),

                   Headline(
                       headline = "The keydown Event",
                       explaination = "The keydown event occurs the moment a key is pressed. It is more reliable than keypress for non-character keys.",
                       codeExample = """
                <script>
                    window.addEventListener("keydown", (event) => {
                        console.log("Key pressed: " + event.key);
                    });
                </script>
            """.trimIndent()
                   ),

                   Headline(
                       headline = "The submit Event",
                       explaination = "This event occurs when a form is submitted. It is usually used to validate data or prevent the page from refreshing.",
                       codeExample = """
                <form id="myForm">
                    <input type="text" required>
                    <button type="submit">Send</button>
                </form>
                <script>
                    document.getElementById("myForm").addEventListener("submit", (e) => {
                        e.preventDefault(); // Stops the page from refreshing
                        alert("Form submitted safely!");
                    });
                </script>
            """.trimIndent()
                   ),

                   Headline(
                       headline = "The focus and blur Events",
                       explaination = "Focus happens when you enter an input field; blur happens when you leave it.",
                       codeExample = """
                <input type="text" id="fld" placeholder="Focus me">
                <script>
                    const fld = document.getElementById("fld");
                    fld.onfocus = () => fld.style.border = "2px solid blue";
                    fld.onblur = () => fld.style.border = "1px solid gray";
                </script>
            """.trimIndent()
                   ),

                   Headline(
                       headline = "The scroll Event",
                       explaination = "The scroll event fires when the document view or an element has been scrolled.",
                       codeExample = """
                <script>
                    window.onscroll = () => {
                        console.log("You are scrolling at: " + window.scrollY + "px");
                    };
                </script>
            """.trimIndent(),
                       tip = "Use 'throttling' or 'debouncing' with scroll events to maintain browser performance."
                   ),

                   Headline(
                       headline = "The contextmenu Event",
                       explaination = "This event fires when the user attempts to open a context menu (usually by right-clicking).",
                       codeExample = """
                <div style="background: lightgray; height: 50px;">Right-click here</div>
                <script>
                    document.addEventListener("contextmenu", (e) => {
                        e.preventDefault();
                        alert("Right-click is disabled!");
                    });
                </script>
            """.trimIndent()
                   )
               )
           )









       ),

       Subtopic(
           sutopicId=115,
           subTopicName = "Dropdown List",
           headlines = listOf(
               Headline(
                   majorHeadline ="Dropdown List in HTML",
                   explaination = "Explain and show the tag used for forms" ,
                   codeExample = "give a simple example  ",
                   tip = "give tip"
               ),

               Headline(

                   headline = "Attributes in a form ",
                   explaination = "Give all the attributes in a form in a bulleting the way they are types or names and how they are used or where ",
                   codeExample = "give amazing runnable html example involving all",
                   afterCodeEplainations = ""

               ),
               Headline(
                   headline = "Dropdown Attributes",
                   explaination = "Explain showing all attributes used and the names in bulleting " ,
                   codeExample = "give amazing runnable code",
                   afterCodeEplainations = "Explain",

                   ),
               Headline(
                   headline = "Multiple Options",
                   explaination = "Explain " ,
                   codeExample = "give amazing runnable code",
                   afterCodeEplainations = "Explain",

                   ),
               Headline(
                   headline = "Select",
                   explaination = "Explain " ,
                   codeExample = "give amazing runnable code",
                   afterCodeEplainations = "Explain",

                   ),
               Headline(
                   headline = "Good Example",
                   explaination = "Explain " ,
                   codeExample = "give amazing runnable code",
                   afterCodeEplainations = "Explain",

                   ),
               Headline(
                   headline = "Good Exaple with good js",
                   explaination = "Explain " ,
                   codeExample = "give amazing runnable code",
                   afterCodeEplainations = "Explain",

                   ),


               Headline(
                   headline = "Give other(s) Headline",
                   explaination = "explain ",
                   codeExample = "amazing",
                   afterCodeEplainations = "Explain",

                   ),
               questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                   QuizQuestion(
                       "Question",
                       listOf(
                           "options"
                       ),
                       number of correct ans
                   )


               )
           )

       ) ,
       Subtopic(
           sutopicId=116,
           subTopicName = "Form Elements Attributes",
           headlines = listOf(
               Headline(
                   majorHeadline = "Form Elements Attributes",
                   majorHeadileExplanation = "Explain giving  all the attributes in well bulleting way",

                   tip = "give",
                   codeExample = "give good simple running example having most attributes"
               ),
               Headline(
                   headline = "autocapitalize",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run  involing all autocapitalize ",
                   afterCodeEplainations = "Explain",

                   ),
               Headline(

                   codeExample = "give amazing runnable example",
                   afterCodeEplainations = ""

               ),
               Headline(
                   headline = "autocomplete",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run  involing all autocomplete ",
                   afterCodeEplainations = "Explain",

                   ),
               Headline(
                   headline = "autofocus",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run  ",


                   ),
               Headline(
                   headline = "disabled",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run   ",


                   ),
               Headline(
                   headline = "max",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run  having form and alert ",
                   ),
               Headline(
                   headline = "maxlength",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run  having form and button ",
               ),

               Headline(
                   headline = "min",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run  having form and button ",
               ),

               Headline(
                   headline = "minlength",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run  having form and button ",
               ),

               Headline(
                   headline = "pattern",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run  having form and button ",
               ),

               Headline(
                   headline = "wrap",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run  having form and button ",
               ),

               Headline(
                   headline = "spellcheck",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run  having form and button ",
               ),
               Headline(
                   headline = "required",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run  having form and button ",
               ),

               Headline(
                   headline = "readonly",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run  having form and button ",
               ),
               Headline(
                   headline = "placeholder",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run  having form and button ",
               ),
               Headline(
                   headline = "maxlength",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run  having form and button ",
               ),
               Headline(
                   headline = "multiple",
                   explaination = "Explain ",
                   codeExample ="give simple code example that user can run  having form and button, file ",
               ),

               Headline(
                   headline = "All attributes used",

                   codeExample ="give amazing code example that user can run  having all attributes ,internal styling,js",
               ),
               questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                   QuizQuestion(
                       "Question",
                       listOf(
                           "options"
                       ),
                       number of correct ans
                   )


               )

           ),
       ),
       Subtopic(
           sutopicId=117,
           subTopicName = "Buttons",
           headlines = listOf(
               Headline(
                   majorHeadline = "Buttons in Html",
                   majorHeadileExplanation = "explain showing tag used",
                   codeExample = "give a runnable involving html buttons more than one ",


                   tip = "give tip"
               ),
               Headline(
                   headline = "Used of buttons in html",
                   explaination = "explain first user",
                   codeExample = "give amazing runnable html  example with input type text and button and small running js ",
                   ),// give headlines for each use explaing it clearly with examples
               Headline(
                   headline = "Calling a JS Function",
                   explaination = "explain",
                   codeExample = "give amazing runnable html  example with input type CheckBox and button and small running js ",


                   ),
               Headline(
                   headline = "Attributes in a button",
                   explaination = "explain and list all",
                   codeExample = "give amazing runnable html  example with input type color and button and small running js ",
               ),

               Headline(
                   headline = "buttons in html",
                   explaination = "explain explain all their and action they do eg submit",
                   codeExample = "give amazing example performing submit and action method of the form ",
               ),// do the same for all the buttons of the form including resetting to have its headline each

               Headline(
                   headline = "styling butthon",
                   explaination = "Inline styling ",
                   codeExample = "give diffent buttons styled differently inline ",


                   ),
               Headline(

                   explaination = "Internal styling ",
                   codeExample = "give diffent buttons styled differently internaly ",


                   ),
               Headline(
                   headline = "Disable",
                   explaination = "explain",
                   codeExample = "give good examples "
               ),
            //add many headings involving this subtopic
               questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                   QuizQuestion(
                       "Question",
                       listOf(
                           "options"
                       ),
                       number of correct ans
                   )


               )
           )

       ),
       Subtopic(
           sutopicId=114,
           subTopicName = "Form Examples",
           headlines = listOf(
               Headline(
                   majorHeadline = "Form Examples",

                   tip = "give",
                   codeExample = "good simple example",

                   ),
               Headline(
                   headline = "Form example forcusing on styling ",
                   explaination = "explain",
                   codeExample ="give good full form focussing on styling",
                   ),

               Headline(
                   headline = "Form example forcusing on attributes ",
                   explaination = "explain",
                   codeExample ="give good full form focussing on attributes",
               ),

               Headline(
                   headline = "Form example forcusing on data ",
                   explaination = "explain",
                   codeExample ="give good full form focussing on data",
               ),

               Headline(
                   headline = "Form example forcusing on input type ",
                   explaination = "explain",
                   codeExample ="give good full form focussing on input types",
               ),

               Headline(
                   headline = "Form example forcusing on actions ",
                   explaination = "explain",
                   codeExample ="give good full form focussing on actions",
               ),

               Headline(
                   headline = "Form example forcusing on method ",
                   explaination = "explain",
                   codeExample ="give good full form focussing on methods",
               ),

               Headline(
                   headline = "Form example forcusing on resposiveness ",
                   explaination = "explain",
                   codeExample ="give good full form focussing on resposiveness",
               ),

               Headline(
                   headline = "Form example forcusing on buttons ",
                   explaination = "explain",
                   codeExample ="give good full form focussing on buttons",
               ),


               Headline(
                   headline = "Form example forcusing on amazing ",
                   explaination = "explain",
                   codeExample ="give good full form focussing on amazing",
               ),

               Headline(
                   headline = "Form example forcusing on getting values ",
                   explaination = "explain",
                   codeExample ="give good full form focussing on getting values",
               ),

               Headline(
                   headline = "Form example forcusing on validation ",
                   explaination = "explain",
                   codeExample ="give good full form focussing on validation",
               ),

               Headline(
                   headline = "Form example forcusing on js ",
                   explaination = "explain",
                   codeExample ="give good full form focussing on js",
               ),

               Headline(
                   headline = "Form example forcusing on modifying using js ",
                   explaination = "explain",
                   codeExample ="give good full form focussing on modifying using js",
               ),
               questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                   QuizQuestion(
                       "Question",
                       listOf(
                           "options"
                       ),
                       number of correct ans
                   )


               )

           ),


           // --- SUBTOPIC 2: WRITING & INTEGRATING JS ---
           Subtopic(
               sutopicId = 2,
               subTopicName = "JS Writing Code",
               headlines = listOf(
                   Headline(
                       headline = "The <script> Tag",
                       explaination = "JavaScript is executed by the browser's engine. To run it, code is either embedded directly into HTML or linked as an external script using the <script> tag. This tag tells the browser to pause HTML parsing and execute the logic inside.",
                       codeExample = "<script>\n  console.log('Writing JS directly in HTML!');\n</script>",
                       afterCodeEplainations = "Browsers read files from top to bottom, executing scripts as they are encountered."
                   ),
                   Headline(
                       headline = "Internal JS & Placement",
                       explaination = "Internal JS lives inside your HTML file. If placed in the <head>, it loads early but can slow down visual rendering. If placed at the bottom of the <body>, the page structure loads first, which is a common performance optimization.",
                       codeExample = "<body>\n  <h1 id='title'>Hello</h1>\n  <script>\n    // This runs after the <h1> is created\n    console.log('Body script executed');\n  </script>\n</body>",
                       tip = "Placing scripts in the head might cause errors if the script tries to access HTML elements that haven't been created yet."
                   ),
                   Headline(
                       headline = "External JS (.js Files)",
                       explaination = "For production, code is kept in separate .js files. This promotes 'Separation of Concerns' and allows browsers to cache the file, similar to how Linux shared libraries (.so files) save memory by being reused.",
                       codeExample = "// In HTML: <script src='script.js'></script>\n\n// In script.js:\nfunction init() {\n  console.log('External app started');\n}",
                       afterCodeEplainations = "The 'src' attribute acts like a file path, pointing the browser to the logic's location."
                   ),
                   Headline(
                       headline = "The Render Process & Parser Blocking",
                       explaination = "When a browser hits a script tag without special attributes, it stops building the page to download and run it. This is 'parser blocking'—think of it like a sequential bash script where command B must wait for A.",
                       codeExample = "<script src='heavy-library.js'></script>",
                       afterCodeEplainations = "Large scripts can make a site feel 'frozen' during this download phase."
                   ),
                   Headline(
                       headline = "Modern Loading: Async & Defer",
                       explaination = "Modern JS uses 'async' and 'defer' to prevent blocking. 'Defer' downloads the script in the background and executes it only after the HTML is fully parsed. This is currently the industry standard.",
                       codeExample = "<script src='app.js' defer></script>",
                       tip = "Always use 'defer' for external scripts in the <head> to get the best performance and avoid null errors."
                   ),
                   Headline(
                       headline = "Modern Module System",
                       explaination = "Today we use 'type=module' to organize code into pieces that can import/export functionality. Modules automatically use 'strict mode' to prevent common coding errors.",
                       codeExample = "<script type='module' src='main.js'></script>"
                   )
               ),
               questions = listOf(
                   QuizQuestion("Which tag is used for JavaScript?", listOf("<js>", "<script>", "<javascript>", "<code_js>"), 1),
                   QuizQuestion("What is the best location for scripts for performance?", listOf("In the <head>", "Before the <html> tag", "At the bottom of the <body>", "Inside a <div>"), 2),
                   QuizQuestion("Which attribute links an external JS file?", listOf("href", "link", "src", "path"), 2),
                   QuizQuestion("What does the 'defer' attribute do?", listOf("Stops the script", "Hides the script", "Downloads in background and runs after parsing", "Deletes the script"), 2),
                   QuizQuestion("Why is External JS better for performance?", listOf("It is smaller", "It can be cached by the browser", "It runs faster", "It uses less RAM"), 1)
               )
           ),

           // --- SUBTOPIC 3: DISPLAYING OUTPUT & DEBUGGING ---
           Subtopic(
               sutopicId = 3,
               subTopicName = "JS Displaying Output",
               headlines = listOf(
                   Headline(
                       headline = "Data Visualization Streams",
                       explaination = "JavaScript output means showing results to the user or developer. It can be displayed in the console, dialog boxes, or directly inside HTML elements.",
                       codeExample = "// Different output streams\nconsole.log('For developers');\nalert('For urgent alerts');\ndocument.getElementById('msg').innerHTML = 'For users';"
                   ),
                   Headline(
                       headline = "Using the Console",
                       explaination = "The console is the primary tool for debugging. Beyond log(), you can use console.table() to visualize arrays of data clearly in the browser's DevTools (F12).",
                       codeExample = """
                            const servers = [
                                { name: "Nginx", status: "Active" },
                                { name: "Apache", status: "Down" }
                            ];
                            console.table(servers);
                        """.trimIndent(),
                       afterCodeEplainations = "The output is not visible to website users, making it safe for sensitive debugging info."
                   ),
                   Headline(
                       headline = "Writing to HTML Components",
                       explaination = "JavaScript can change content by selecting an element's ID. You use 'innerHTML' for HTML content or 'textContent' for plain text. Use <br> for line breaks within innerHTML.",
                       codeExample = """
                            <p id="status"></p>
                            <script>
                                document.getElementById("status").innerHTML = "System:<br>Online";
                            </script>
                        """.trimIndent(),
                       tip = "Careful: innerHTML can be a security risk (XSS). Use textContent if you don't need to render HTML tags."
                   ),
                   Headline(
                       headline = "Using Dialog Boxes",
                       explaination = "Dialog boxes like alert(), confirm(), and prompt() are popups. Note that they are 'blocking' operations; they freeze the browser's main thread until the user interacts.",
                       codeExample = "alert('Welcome to the JavaScript Compiler!');"
                   ),
                   Headline(
                       headline = "The Window Object",
                       explaination = "In the browser, 'window' is the global object. This means 'window.alert()' and 'alert()' are identical. It represents the browser window itself.",
                       codeExample = "window.console.log('Global window access');"
                   ),
                   Headline(
                       headline = "Dangerous Output: document.write()",
                       explaination = "JavaScript can write directly to the document stream. However, if document.write() is used after the page has finished loading, it will overwrite the entire HTML document.",
                       codeExample = "function wipe() {\n  document.write('The rest of the page is now gone.');\n}",
                       tip = "Avoid using document.write() in real applications. It is strictly for quick testing."
                   )
               ),
               questions = listOf(
                   QuizQuestion("Which method is best for debugging?", listOf("alert()", "console.log()", "document.write()", "window.print()"), 1),
                   QuizQuestion("How do you change the content of an HTML element?", listOf(".innerHTML", ".changeText", ".value", ".setContent"), 0),
                   QuizQuestion("What is a risk of using innerHTML with user input?", listOf("Slow loading", "Security (XSS)", "Color changes", "Syntax errors"), 1),
                   QuizQuestion("What happens if document.write() runs after the page loads?", listOf("Adds text at top", "Does nothing", "Wipes the entire page", "Opens a new tab"), 2),
                   QuizQuestion("Which command prints a table of data?", listOf("console.grid()", "console.table()", "console.view()", "console.list()"), 1)
               )
           )
           ,




           Subtopic(
               sutopicId=4,
               subTopicName = "JS Statements",
               headlines = listOf(

                   Headline(
                       headline = "JS Statements",
                       explaination = "JavaScript statements are instructions that tell the browser what to do. "
                               + "Each statement is executed in the order it is written.",
                       codeExample = """
                let x = 10;
                let y = 20;
                let sum = x + y;
            """.trimIndent(),
                       afterCodeEplainations = "Each line is a separate statement. "
                               + "JavaScript reads and runs them one by one."
                   ),

                   Headline(
                       explaination = "JavaScript statements usually end with a semicolon. "
                               + "The semicolon separates one statement from another.",
                       codeExample = """
                let name = "John";
                let age = 25;
            """.trimIndent()
                   ),

                   Headline(
                       explaination = "JavaScript allows multiple statements in one line, "
                               + "but writing one statement per line makes the code easier to read.",
                       codeExample = """
                let a = 5; let b = 10; let c = a + b;
            """.trimIndent(),
                       tip = "For better readability, always write one statement per line."
                   ),

                   Headline(
                       headline = "Grouping JS Statements",
                       explaination = "JavaScript statements can be grouped together using curly braces {}. "
                               + "Grouped statements are treated as a block of code.",
                       codeExample = """
                if (x > 5) {
                    console.log("x is greater than 5");
                    console.log("This is a block of statements");
                }
            """.trimIndent()
                   ),

                   Headline(
                       headline = "JS Keywords",
                       explaination = "JavaScript keywords are reserved words that have special meanings. "
                               + "They are used to define actions, variables, and control the program flow.",
                       codeExample = """
                let number = 10;

                if (number > 5) {
                    console.log("Number is greater than 5");
                }
            """.trimIndent(),
                       afterCodeEplainations = "`let` and `if` are JavaScript keywords and cannot be used as variable names."
                   )

               ),
               questions = listOf(
                   QuizQuestion("What is a JavaScript statement?", listOf("A style rule", "An instruction to the browser", "A type of variable", "A comment"), 1),
                   QuizQuestion("Which character is usually used to separate JS statements?", listOf("Colon (:)", "Comma (,)", "Semicolon (;)", "Full stop (.)"), 2),
                   QuizQuestion("Is it possible to write multiple statements on one line?", listOf("No, it causes an error", "Yes, but it's not recommended", "Only inside a function", "Only if they are empty"), 1),
                   QuizQuestion("What are curly braces {} used for in statements?", listOf("To create a comment", "To group statements into a block", "To multiply numbers", "To end the program"), 1),
                   QuizQuestion("In what order are JavaScript statements executed?", listOf("Randomly", "Bottom to top", "In the order they are written", "Alphabetically"), 2)
               )
           ),

           Subtopic(
               sutopicId=5,
               subTopicName = "JS Syntax",questions = listOf(
                   QuizQuestion("Which keyword is used for a variable that should NOT change?", listOf("let", "var", "const", "change"), 2),
                   QuizQuestion("Is JavaScript case-sensitive?", listOf("Yes", "No", "Only for numbers", "Only in Linux"), 0),
                   QuizQuestion("Which is a correct way to declare a variable in modern JS?", listOf("variable x = 5;", "let x = 5;", "set x = 5;", "int x = 5;"), 1),
                   QuizQuestion("If you have 'let Name' and 'let name', how many variables exist?", listOf("One", "Two", "None (error)", "It depends on the browser"), 1),
                   QuizQuestion("What is the naming style 'userName' called?", listOf("snake_case", "PascalCase", "camelCase", "Flatcase"), 2)
               ),
               headlines = listOf(

                   Headline(
                       headline = "JS Syntax?",
                       explaination = "JavaScript syntax refers to the rules that define how JavaScript code is written "
                               + "and structured. Following correct syntax helps the browser understand and execute the code."
                   ),

                   Headline(
                       headline = "Variable Declaration",
                       explaination = "Variable declaration means creating a variable to store data. "
                               + "JavaScript allows variables to be declared using let, const, or var.",
                       codeExample = """
                let name = "John";
                const age = 30;
                var city = "Paris";
            """.trimIndent(),
                       afterCodeEplainations = "`let` is used for values that can change, "
                               + "`const` is used for fixed values, and `var` is an older way to declare variables."
                   ),

                   Headline(
                       headline = "Case Sensitivity",
                       explaination = "JavaScript is case-sensitive, which means uppercase and lowercase letters "
                               + "are treated as different.",
                       codeExample = """
                let userName = "Alice";
                let username = "Bob";
            """.trimIndent(),
                       tip = "Always use consistent naming styles like camelCase to avoid errors."
                   )

               )
           ),





           Subtopic(
               sutopicId=6,
               questions = listOf(
                   QuizQuestion("How do you start a single-line comment in JS?", listOf("/*", "//", "", "/* and */", "[[ and ]]"), 2),
                   QuizQuestion("What happens to comments during program execution?", listOf("They are displayed in console", "They are ignored by the browser", "They make the code run faster", "They cause an error"), 1),
                   QuizQuestion("Why would you use a comment to 'disable' code?", listOf("To make the file smaller", "To test logic without deleting it", "To encrypt the code", "To change the variable type"), 1),
                   QuizQuestion("Can a single-line comment be placed at the end of a statement?", listOf("Yes", "No", "Only inside a block", "Only with const"), 0)
               ),
               subTopicName = "JS Comments",
               headlines = listOf(

                   Headline(
                       headline = "JS Comments",
                       explaination = "JavaScript comments are used to describe the code and make it easier to understand. "
                               + "Comments are ignored by the browser and do not affect program execution."
                   ),

                   Headline(
                       headline = "Single-Line Comments",
                       explaination = "Single-line comments are used to comment only one line of code.",
                       codeExample = """
                // This is a single-line comment
                let x = 10; // This comment explains the variable
            """.trimIndent(),
                       afterCodeEplainations = "Anything written after // is treated as a comment and is not executed."
                   ),

                   Headline(
                       explaination = "Single-line comments are often used for short explanations or notes in the code.",
                       codeExample = ""
                   ),

                   Headline(
                       explaination = "Comments can also be used to explain complex logic or important steps in a program.",
                       tip = "Write clear and meaningful comments, but avoid commenting obvious code.",
                       codeExample = """
                // Calculate total price
                let total = price + tax;
            """.trimIndent()
                   ),

                   Headline(
                       headline = "Multi-Line Comments",
                       explaination = "Multi-line comments are used to comment multiple lines at once.",
                       codeExample = """
                /*
                  This is a multi-line comment
                  It can span multiple lines
                */
            """.trimIndent()
                   ),

                   Headline(
                       headline = "Disabling Code Using Comments",
                       explaination = "Comments can be used to temporarily disable code without deleting it.",
                       codeExample = """
                // console.log("This line will not run");

                /*
                alert("This code is disabled");
                */
            """.trimIndent()
                   )

               )
           ),


           Subtopic(
               sutopicId = 7,
               questions = listOf(
                   QuizQuestion("What is the result of 'let x;' if you log x?", listOf("0", "null", "undefined", "Error"), 2),
                   QuizQuestion("Which operator is used to assign a value to a variable?", listOf("==", "===", "=", ":="), 2),
                   QuizQuestion("What happens if you try to change a 'const' variable?", listOf("It changes successfully", "It resets to zero", "It causes a runtime error", "It creates a new variable"), 2),
                   QuizQuestion("Which is a valid variable name?", listOf("1stUser", "user-name", "_totalAmount", "let"), 2),
                   QuizQuestion("When should you use 'let' instead of 'const'?", listOf("When the value will stay the same", "When the value needs to be updated later", "Only for strings", "Only for numbers"), 1)
               ),
               subTopicName = "JS Variables",
               headlines = listOf(

                   Headline(
                       headline = "JS Variables",
                       explaination = "Variables are used to store data values in JavaScript. "
                               + "A variable can hold different types of data such as numbers or text.",
                       codeExample = "let name;",
                       afterCodeEplainations = "This declares a variable named name without assigning a value."
                   ),

                   Headline(
                       explaination = "The assignment operator (=) is used to assign a value to a variable.",
                       codeExample = """
                let age = 25;
                let city = "New York";
            """.trimIndent()
                   ),

                   Headline(
                       explaination = "Variables can store different types of data and their values can be used later in the program.",
                       codeExample = ""
                   ),

                   Headline(
                       headline = "Undefined Variable",
                       explaination = "A variable that is declared but not assigned a value is called an undefined variable.",
                       codeExample = """
                let x;
                console.log(x);
            """.trimIndent()
                   ),

                   Headline(
                       headline = "Changing Value",
                       explaination = "The value of a variable can be changed after it is declared.",
                       codeExample = """
                let score = 10;
                score = 20;
            """.trimIndent()
                   ),

                   Headline(
                       headline = "Constant Variables",
                       explaination = "Constant variables are declared using const and their values cannot be changed.",
                       codeExample = """
                const pi = 3.14;
            """.trimIndent(),
                       afterCodeEplainations = "Trying to change a const variable will cause an error."
                   ),

                   Headline(
                       explaination = "Use let for values that change and const for values that should stay the same.",
                       tip = "Always prefer const unless you know the value will change.",
                       codeExample = """
                let count = 1;
                const maxLimit = 100;
            """.trimIndent()
                   ),

                   Headline(
                       headline = "Naming Variables",
                       explaination = "Variable names should be meaningful and describe the data they store."
                   ),

                   Headline(
                       headline = "Rules for Naming Variables",
                       explaination = "Variable names must start with a letter, underscore (_), or dollar sign ($) "
                               + "and cannot contain spaces.",
                       tip = "Use camelCase for variable names, like userName or totalPrice."
                   )

               ),
           ),



           Subtopic(
               sutopicId = 8,
               questions = listOf(
                   QuizQuestion("What keyword is used to create a function?", listOf("method", "function", "def", "routine"), 1),
                   QuizQuestion("How do you 'call' a function named 'myFunc'?", listOf("call myFunc", "myFunc[]", "myFunc()", "run(myFunc)"), 2),
                   QuizQuestion("What does the 'return' statement do?", listOf("Restarts the function", "Exits the function and sends back a value", "Repeats the code", "Deletes the variable"), 1),
                   QuizQuestion("A variable declared inside a function is:", listOf("Global", "Local (Function Scope)", "Shared", "Permanent"), 1),
                   QuizQuestion("What happens if you define a function but never call it?", listOf("The code runs once", "The browser crashes", "The code inside never executes", "It runs automatically"), 2)
               ),
               subTopicName = "JS Functions",

               headlines = listOf(

                   Headline(
                       headline = "JS Functions",
                       explaination = "Functions are blocks of code designed to perform a specific task. "
                               + "They help organize code and avoid repetition."
                   ),

                   Headline(
                       headline = "Function Definition",
                       explaination = "A function definition creates a function using the function keyword, "
                               + "a name, and parentheses.",
                       tip = "Choose clear and meaningful function names.",
                       codeExample = """
                function greet() {
                    console.log("Hello!");
                }
            """.trimIndent(),
                       afterCodeEplainations = "This defines a function named greet, but it will not run until called."
                   ),

                   Headline(
                       explaination = "Functions can contain one or more statements inside their body.",
                       codeExample = ""
                   ),

                   Headline(
                       explaination = "Functions can be reused many times in a program.",
                       codeExample = ""
                   ),

                   Headline(
                       headline = "Calling a Function",
                       explaination = "Calling a function means executing the code inside the function.",
                       codeExample = """
                greet();
            """.trimIndent(),
                       afterCodeEplainations = "This line runs the greet function."
                   ),

                   Headline(
                       explaination = "A function can be called multiple times whenever needed.",
                       codeExample = ""
                   ),

                   Headline(
                       headline = "The return Statement",
                       explaination = "The return statement sends a value back from the function.",
                       codeExample = """
                function add(a, b) {
                    return a + b;
                }
            """.trimIndent(),
                       afterCodeEplainations = "The function returns the result of a + b."
                   ),

                   Headline(
                       explaination = "Returned values can be stored in variables.",
                       codeExample = """
                let result = add(5, 3);
            """.trimIndent()
                   ),

                   Headline(
                       explaination = "Once return is executed, the function stops running.",
                       codeExample = ""
                   ),

                   Headline(
                       explaination = "Not all functions need to return a value.",
                       tip = "Use return only when you need a result from the function.",
                       codeExample = ""
                   ),

                   Headline(
                       headline = "Function Scope",
                       explaination = "Variables declared inside a function can only be used within that function.",
                       codeExample = """
                function test() {
                    let x = 10;
                    console.log(x);
                }
            """.trimIndent()
                   ),

                   Headline(
                       headline = "Global Vaiables",
                       explaination = "Global variables are declared outside functions and can be accessed anywhere in the code.",
                       codeExample = """
                let message = "Hello";

                function showMessage() {
                    console.log(message);
                }
            """.trimIndent()
                   ),

                   Headline(
                       headline = "Why Use Functions",
                       explaination = "Functions make code reusable, organized, and easier to maintain.",
                       tip = "Break large programs into smaller functions.",
                       codeExample = """
                function calculateTotal(price, tax) {
                    return price + tax;
                }
            """.trimIndent(),
                       afterCodeEplainations = "This function can be reused whenever total calculation is needed."
                   )

               )
           ),




           Subtopic(
               sutopicId = 9,
               questions = listOf(
                   QuizQuestion("Which event fires when a user clicks an HTML element?", listOf("onhover", "onclick", "onpress", "onchange"), 1),
                   QuizQuestion("What is the modern method to attach an event handler?", listOf("on()", "attachEvent()", "addEventListener()", "setEvent()"), 2),
                   QuizQuestion("How do you prevent a form from refreshing the page on submit?", listOf("e.stop()", "e.preventDefault()", "e.halt()", "e.ignore()"), 1),
                   QuizQuestion("Which event fires as soon as the HTML is loaded but before images load?", listOf("onload", "DOMReady", "DOMContentLoaded", "onfinish"), 2),
                   QuizQuestion("What is the difference between 'focus' and 'blur'?", listOf("There is no difference", "Focus is entering a field, blur is leaving it", "Focus is for buttons, blur is for text", "Blur happens only on scroll"), 1),
                   QuizQuestion("Which event tracks every single keystroke in an input?", listOf("change", "submit", "input", "blur"), 2),
                   QuizQuestion("What does 'window.scrollY' tell you during a scroll event?", listOf("The width of the page", "The vertical distance scrolled in pixels", "The speed of scrolling", "The number of elements on screen"), 1)
               ),
               subTopicName = "JS Events",
               headlines = listOf(
                   Headline(
                       headline = "JS Events",
                       explaination = "JavaScript events are actions that happen in the browser, such as clicking a button, typing on the keyboard, or loading a page.",
                       codeExample = """
                <button onclick="showAlert()">Click Me</button>
                <script>
                    function showAlert() {
                        alert("Button clicked!");
                    }
                </script>
            """.trimIndent(),
                       afterCodeEplainations = "The function runs when the button is clicked."
                   ),

                   Headline(
                       headline = "Inline Event Handlers",
                       explaination = "Inline event handlers are written directly inside HTML elements using attributes like onclick or onmouseover.",
                       codeExample = """
                <button onclick="alert('Hello!')">Click</button>
            """.trimIndent(),
                       afterCodeEplainations = "Inline events are easy to use but not recommended for large applications as they mix logic with structure."
                   ),

                   Headline(
                       headline = "The addEventListener() Method",
                       explaination = "addEventListener() is the modern way to attach event handlers. It allows multiple listeners for a single event.",
                       codeExample = """
                <button id="btn">Click Me</button>
                <script>
                    document.getElementById("btn")
                        .addEventListener("click", () => {
                            alert("Modern click handler!");
                        });
                </script>
            """.trimIndent(),
                       afterCodeEplainations = "This method keeps JavaScript separate from HTML and is easier to maintain."
                   ),

                   Headline(
                       headline = "The DOMContentLoaded Event",
                       explaination = "This event fires when the HTML document has been completely loaded and parsed, without waiting for images or stylesheets.",
                       codeExample = """
                <script>
                    document.addEventListener("DOMContentLoaded", () => {
                        console.log("DOM is ready, you can now manipulate elements!");
                    });
                </script>
            """.trimIndent()
                   ),

                   Headline(
                       headline = "The input Event",
                       explaination = "Unlike 'change', the 'input' event fires immediately every time the value of an element changes.",
                       codeExample = """
                <input type="text" id="myInput">
                <p id="output"></p>
                <script>
                    document.getElementById("myInput").addEventListener("input", (e) => {
                        document.getElementById("output").innerText = e.target.value;
                    });
                </script>
            """.trimIndent()
                   ),

                   Headline(
                       headline = "Mouse Events: mousedown & mouseup",
                       explaination = "These track the exact moments a mouse button is pressed down and then released.",
                       codeExample = """
                <button id="holdBtn">Hold Me</button>
                <script>
                    const btn = document.getElementById("holdBtn");
                    btn.addEventListener("mousedown", () => btn.innerText = "Pressed!");
                    btn.addEventListener("mouseup", () => btn.innerText = "Released!");
                </script>
            """.trimIndent()
                   ),

                   Headline(
                       headline = "The keydown Event",
                       explaination = "The keydown event occurs the moment a key is pressed. It is more reliable than keypress for non-character keys.",
                       codeExample = """
                <script>
                    window.addEventListener("keydown", (event) => {
                        console.log("Key pressed: " + event.key);
                    });
                </script>
            """.trimIndent()
                   ),

                   Headline(
                       headline = "The submit Event",
                       explaination = "This event occurs when a form is submitted. It is usually used to validate data or prevent the page from refreshing.",
                       codeExample = """
                <form id="myForm">
                    <input type="text" required>
                    <button type="submit">Send</button>
                </form>
                <script>
                    document.getElementById("myForm").addEventListener("submit", (e) => {
                        e.preventDefault(); // Stops the page from refreshing
                        alert("Form submitted safely!");
                    });
                </script>
            """.trimIndent()
                   ),

                   Headline(
                       headline = "The focus and blur Events",
                       explaination = "Focus happens when you enter an input field; blur happens when you leave it.",
                       codeExample = """
                <input type="text" id="fld" placeholder="Focus me">
                <script>
                    const fld = document.getElementById("fld");
                    fld.onfocus = () => fld.style.border = "2px solid blue";
                    fld.onblur = () => fld.style.border = "1px solid gray";
                </script>
            """.trimIndent()
                   ),

                   Headline(
                       headline = "The scroll Event",
                       explaination = "The scroll event fires when the document view or an element has been scrolled.",
                       codeExample = """
                <script>
                    window.onscroll = () => {
                        console.log("You are scrolling at: " + window.scrollY + "px");
                    };
                </script>
            """.trimIndent(),
                       tip = "Use 'throttling' or 'debouncing' with scroll events to maintain browser performance."
                   ),

                   Headline(
                       headline = "The contextmenu Event",
                       explaination = "This event fires when the user attempts to open a context menu (usually by right-clicking).",
                       codeExample = """
                <div style="background: lightgray; height: 50px;">Right-click here</div>
                <script>
                    document.addEventListener("contextmenu", (e) => {
                        e.preventDefault();
                        alert("Right-click is disabled!");
                    });
                </script>
            """.trimIndent()
                   )
               )
           )









       ),


       )
),


    NoteModule(
        topic = "Deep Learning",
        topicId=4,
        subtopics = listOf(
            Subtopic(
                sutopicId=45,
                subTopicName = "Subscript Text ",
                headlines = listOf(
                    Headline(
                        majorHeadline ="Subscript Text",
                        explaination = "Explain and show the tag used " ,
                        codeExample = "give a simple example  ",
                        tip = "give tip"
                    ),


                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "amazing",
                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ) ,
            Subtopic(
                sutopicId=46,
                subTopicName = "Superscript Text ",
                headlines = listOf(
                    Headline(
                        majorHeadline ="Superscript Text",
                        explaination = "Explain and show the tag used " ,
                        codeExample = "give a simple example  ",
                        tip = "give tip"
                    ),


                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "amazing",
                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ) ,
            Subtopic(
                sutopicId=47,
                subTopicName = "Pre Element ",
                headlines = listOf(
                    Headline(
                        majorHeadline ="Pre Element ",
                        explaination = "Explain and show the tag used " ,
                        codeExample = "give a simple good example  ",
                        tip = "give tip"
                    ),


                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "amazing",
                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ) ,
            Subtopic(
                sutopicId=48,
                subTopicName = "HTML Figures ",
                headlines = listOf(
                    Headline(
                        majorHeadline ="HTML Figures ",
                        explaination = "Explain and show the tag used " ,
                        codeExample = "give a good amazing example  ",
                        tip = "give tip"
                    ),

                    Headline(
                        headline = "Give examples where else figure can be users each whi its headline and good example  ",
                        explaination = "explain ",
                        codeExample = "amazing",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "amazing",
                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ) ,
            Subtopic(
                sutopicId=41,
                subTopicName = "Editable",
                headlines = listOf(
                    Headline(
                        majorHeadline ="Editable",
                        explaination = "Explain " ,
                        codeExample = "give a simple example ",
                        tip = "give tip"
                    ),

                    Headline(

                        headline = "Attribute contenteditable ",
                        explaination = "Explain clearly",
                        codeExample = "give an example or where it is used with and without",
                        afterCodeEplainations = ""

                    ),
                    Headline(
                        headline = "Caret Color",
                        explaination = "Explain " ,
                        codeExample = "give amazing runnable code used with and without",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Remove Outline",
                        explaination = "Explain " ,
                        codeExample = "give amazing runnable code",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(

                        codeExample = "give amazing runnable code",


                        ),

                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "amazing",
                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ) ,
            Subtopic(
                sutopicId=42,
                subTopicName = "HTML Meta",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML Meta",
                        majorHeadileExplanation = "Explain showing clearly the tag used and where it is placed and why",

                        tip = "give",
                        codeExample = "give good simple running example"
                    ),
                    Headline(
                        headline = "Attribute http-equiv",
                        explaination = "Explain ",
                        codeExample ="give simple code example ",


                        ),
                    Headline(
                        headline = "Attribute name",
                        explaination = "Explain ",
                        codeExample ="give simple code example ",


                        ),
                    Headline(
                        headline = "Attribute content",
                        explaination = "Explain ",
                        codeExample ="give simple code example ",


                        ),

                    Headline(
                        headline = "Making a Web Page Adaptable to screen sizes  with Meta",
                        explaination = "Explain ",
                        codeExample ="give code example that user can run and which shows responsive  ",

                        ),
                    Headline(
                        explaination = "to the user to remove and see how page behave",

                        codeExample ="give amazing code example that user can run with the user can test responsive with meta ",

                        ),
                    Headline(
                        headline = "SEO /Search Engine OPtimization",
                        explaination="Explain",
                        codeExample ="give good code example ",

                        ),
                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "amazing",
                        afterCodeEplainations = "Explain",

                        ),


                    questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )

                ),
            ),
            Subtopic(
                sutopicId=43,
                subTopicName = "HTML Blockquote",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML Blockquote",
                        majorHeadileExplanation = "explain showing tag used",
                        codeExample = "give a runnable involving html colors more than one ",


                        tip = "give tip"
                    ),
                    Headline(
                        headline = "Attribute cite and <cite> element",
                        explaination = "explain",
                        codeExample = "give amazing runnable html  example ",


                        ),
                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "amazing",
                        afterCodeEplainations = "Explain",

                        ),

                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ),
            Subtopic(
                sutopicId=44,
                subTopicName = "nbsp",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML nbsp",
                        majorHeadileExplanation = "Explain and  why it used example ",
                        tip = "give",
                        codeExample = "good example",

                        ),
                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "amazing",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "amazing",
                        afterCodeEplainations = "Explain",

                        ),


                    questions = listOf(
//                    give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )

                ),


                // --- SUBTOPIC 2: WRITING & INTEGRATING JS ---
                Subtopic(
                    sutopicId = 2,
                    subTopicName = "JS Writing Code",
                    headlines = listOf(
                        Headline(
                            headline = "The <script> Tag",
                            explaination = "JavaScript is executed by the browser's engine. To run it, code is either embedded directly into HTML or linked as an external script using the <script> tag. This tag tells the browser to pause HTML parsing and execute the logic inside.",
                            codeExample = "<script>\n  console.log('Writing JS directly in HTML!');\n</script>",
                            afterCodeEplainations = "Browsers read files from top to bottom, executing scripts as they are encountered."
                        ),
                        Headline(
                            headline = "Internal JS & Placement",
                            explaination = "Internal JS lives inside your HTML file. If placed in the <head>, it loads early but can slow down visual rendering. If placed at the bottom of the <body>, the page structure loads first, which is a common performance optimization.",
                            codeExample = "<body>\n  <h1 id='title'>Hello</h1>\n  <script>\n    // This runs after the <h1> is created\n    console.log('Body script executed');\n  </script>\n</body>",
                            tip = "Placing scripts in the head might cause errors if the script tries to access HTML elements that haven't been created yet."
                        ),
                        Headline(
                            headline = "External JS (.js Files)",
                            explaination = "For production, code is kept in separate .js files. This promotes 'Separation of Concerns' and allows browsers to cache the file, similar to how Linux shared libraries (.so files) save memory by being reused.",
                            codeExample = "// In HTML: <script src='script.js'></script>\n\n// In script.js:\nfunction init() {\n  console.log('External app started');\n}",
                            afterCodeEplainations = "The 'src' attribute acts like a file path, pointing the browser to the logic's location."
                        ),
                        Headline(
                            headline = "The Render Process & Parser Blocking",
                            explaination = "When a browser hits a script tag without special attributes, it stops building the page to download and run it. This is 'parser blocking'—think of it like a sequential bash script where command B must wait for A.",
                            codeExample = "<script src='heavy-library.js'></script>",
                            afterCodeEplainations = "Large scripts can make a site feel 'frozen' during this download phase."
                        ),
                        Headline(
                            headline = "Modern Loading: Async & Defer",
                            explaination = "Modern JS uses 'async' and 'defer' to prevent blocking. 'Defer' downloads the script in the background and executes it only after the HTML is fully parsed. This is currently the industry standard.",
                            codeExample = "<script src='app.js' defer></script>",
                            tip = "Always use 'defer' for external scripts in the <head> to get the best performance and avoid null errors."
                        ),
                        Headline(
                            headline = "Modern Module System",
                            explaination = "Today we use 'type=module' to organize code into pieces that can import/export functionality. Modules automatically use 'strict mode' to prevent common coding errors.",
                            codeExample = "<script type='module' src='main.js'></script>"
                        )
                    ),
                    questions = listOf(
                        QuizQuestion("Which tag is used for JavaScript?", listOf("<js>", "<script>", "<javascript>", "<code_js>"), 1),
                        QuizQuestion("What is the best location for scripts for performance?", listOf("In the <head>", "Before the <html> tag", "At the bottom of the <body>", "Inside a <div>"), 2),
                        QuizQuestion("Which attribute links an external JS file?", listOf("href", "link", "src", "path"), 2),
                        QuizQuestion("What does the 'defer' attribute do?", listOf("Stops the script", "Hides the script", "Downloads in background and runs after parsing", "Deletes the script"), 2),
                        QuizQuestion("Why is External JS better for performance?", listOf("It is smaller", "It can be cached by the browser", "It runs faster", "It uses less RAM"), 1)
                    )
                ),

                // --- SUBTOPIC 3: DISPLAYING OUTPUT & DEBUGGING ---
                Subtopic(
                    sutopicId = 3,
                    subTopicName = "JS Displaying Output",
                    headlines = listOf(
                        Headline(
                            headline = "Data Visualization Streams",
                            explaination = "JavaScript output means showing results to the user or developer. It can be displayed in the console, dialog boxes, or directly inside HTML elements.",
                            codeExample = "// Different output streams\nconsole.log('For developers');\nalert('For urgent alerts');\ndocument.getElementById('msg').innerHTML = 'For users';"
                        ),
                        Headline(
                            headline = "Using the Console",
                            explaination = "The console is the primary tool for debugging. Beyond log(), you can use console.table() to visualize arrays of data clearly in the browser's DevTools (F12).",
                            codeExample = """
                            const servers = [
                                { name: "Nginx", status: "Active" },
                                { name: "Apache", status: "Down" }
                            ];
                            console.table(servers);
                        """.trimIndent(),
                            afterCodeEplainations = "The output is not visible to website users, making it safe for sensitive debugging info."
                        ),
                        Headline(
                            headline = "Writing to HTML Components",
                            explaination = "JavaScript can change content by selecting an element's ID. You use 'innerHTML' for HTML content or 'textContent' for plain text. Use <br> for line breaks within innerHTML.",
                            codeExample = """
                            <p id="status"></p>
                            <script>
                                document.getElementById("status").innerHTML = "System:<br>Online";
                            </script>
                        """.trimIndent(),
                            tip = "Careful: innerHTML can be a security risk (XSS). Use textContent if you don't need to render HTML tags."
                        ),
                        Headline(
                            headline = "Using Dialog Boxes",
                            explaination = "Dialog boxes like alert(), confirm(), and prompt() are popups. Note that they are 'blocking' operations; they freeze the browser's main thread until the user interacts.",
                            codeExample = "alert('Welcome to the JavaScript Compiler!');"
                        ),
                        Headline(
                            headline = "The Window Object",
                            explaination = "In the browser, 'window' is the global object. This means 'window.alert()' and 'alert()' are identical. It represents the browser window itself.",
                            codeExample = "window.console.log('Global window access');"
                        ),
                        Headline(
                            headline = "Dangerous Output: document.write()",
                            explaination = "JavaScript can write directly to the document stream. However, if document.write() is used after the page has finished loading, it will overwrite the entire HTML document.",
                            codeExample = "function wipe() {\n  document.write('The rest of the page is now gone.');\n}",
                            tip = "Avoid using document.write() in real applications. It is strictly for quick testing."
                        )
                    ),
                    questions = listOf(
                        QuizQuestion("Which method is best for debugging?", listOf("alert()", "console.log()", "document.write()", "window.print()"), 1),
                        QuizQuestion("How do you change the content of an HTML element?", listOf(".innerHTML", ".changeText", ".value", ".setContent"), 0),
                        QuizQuestion("What is a risk of using innerHTML with user input?", listOf("Slow loading", "Security (XSS)", "Color changes", "Syntax errors"), 1),
                        QuizQuestion("What happens if document.write() runs after the page loads?", listOf("Adds text at top", "Does nothing", "Wipes the entire page", "Opens a new tab"), 2),
                        QuizQuestion("Which command prints a table of data?", listOf("console.grid()", "console.table()", "console.view()", "console.list()"), 1)
                    )
                )
                ,




                Subtopic(
                    sutopicId=4,
                    subTopicName = "JS Statements",
                    headlines = listOf(

                        Headline(
                            headline = "JS Statements",
                            explaination = "JavaScript statements are instructions that tell the browser what to do. "
                                    + "Each statement is executed in the order it is written.",
                            codeExample = """
                let x = 10;
                let y = 20;
                let sum = x + y;
            """.trimIndent(),
                            afterCodeEplainations = "Each line is a separate statement. "
                                    + "JavaScript reads and runs them one by one."
                        ),

                        Headline(
                            explaination = "JavaScript statements usually end with a semicolon. "
                                    + "The semicolon separates one statement from another.",
                            codeExample = """
                let name = "John";
                let age = 25;
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "JavaScript allows multiple statements in one line, "
                                    + "but writing one statement per line makes the code easier to read.",
                            codeExample = """
                let a = 5; let b = 10; let c = a + b;
            """.trimIndent(),
                            tip = "For better readability, always write one statement per line."
                        ),

                        Headline(
                            headline = "Grouping JS Statements",
                            explaination = "JavaScript statements can be grouped together using curly braces {}. "
                                    + "Grouped statements are treated as a block of code.",
                            codeExample = """
                if (x > 5) {
                    console.log("x is greater than 5");
                    console.log("This is a block of statements");
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "JS Keywords",
                            explaination = "JavaScript keywords are reserved words that have special meanings. "
                                    + "They are used to define actions, variables, and control the program flow.",
                            codeExample = """
                let number = 10;

                if (number > 5) {
                    console.log("Number is greater than 5");
                }
            """.trimIndent(),
                            afterCodeEplainations = "`let` and `if` are JavaScript keywords and cannot be used as variable names."
                        )

                    ),
                    questions = listOf(
                        QuizQuestion("What is a JavaScript statement?", listOf("A style rule", "An instruction to the browser", "A type of variable", "A comment"), 1),
                        QuizQuestion("Which character is usually used to separate JS statements?", listOf("Colon (:)", "Comma (,)", "Semicolon (;)", "Full stop (.)"), 2),
                        QuizQuestion("Is it possible to write multiple statements on one line?", listOf("No, it causes an error", "Yes, but it's not recommended", "Only inside a function", "Only if they are empty"), 1),
                        QuizQuestion("What are curly braces {} used for in statements?", listOf("To create a comment", "To group statements into a block", "To multiply numbers", "To end the program"), 1),
                        QuizQuestion("In what order are JavaScript statements executed?", listOf("Randomly", "Bottom to top", "In the order they are written", "Alphabetically"), 2)
                    )
                ),

                Subtopic(
                    sutopicId=5,
                    subTopicName = "JS Syntax",questions = listOf(
                        QuizQuestion("Which keyword is used for a variable that should NOT change?", listOf("let", "var", "const", "change"), 2),
                        QuizQuestion("Is JavaScript case-sensitive?", listOf("Yes", "No", "Only for numbers", "Only in Linux"), 0),
                        QuizQuestion("Which is a correct way to declare a variable in modern JS?", listOf("variable x = 5;", "let x = 5;", "set x = 5;", "int x = 5;"), 1),
                        QuizQuestion("If you have 'let Name' and 'let name', how many variables exist?", listOf("One", "Two", "None (error)", "It depends on the browser"), 1),
                        QuizQuestion("What is the naming style 'userName' called?", listOf("snake_case", "PascalCase", "camelCase", "Flatcase"), 2)
                    ),
                    headlines = listOf(

                        Headline(
                            headline = "JS Syntax?",
                            explaination = "JavaScript syntax refers to the rules that define how JavaScript code is written "
                                    + "and structured. Following correct syntax helps the browser understand and execute the code."
                        ),

                        Headline(
                            headline = "Variable Declaration",
                            explaination = "Variable declaration means creating a variable to store data. "
                                    + "JavaScript allows variables to be declared using let, const, or var.",
                            codeExample = """
                let name = "John";
                const age = 30;
                var city = "Paris";
            """.trimIndent(),
                            afterCodeEplainations = "`let` is used for values that can change, "
                                    + "`const` is used for fixed values, and `var` is an older way to declare variables."
                        ),

                        Headline(
                            headline = "Case Sensitivity",
                            explaination = "JavaScript is case-sensitive, which means uppercase and lowercase letters "
                                    + "are treated as different.",
                            codeExample = """
                let userName = "Alice";
                let username = "Bob";
            """.trimIndent(),
                            tip = "Always use consistent naming styles like camelCase to avoid errors."
                        )

                    )
                ),





                Subtopic(
                    sutopicId=6,
                    questions = listOf(
                        QuizQuestion("How do you start a single-line comment in JS?", listOf("/*", "//", "", "/* and */", "[[ and ]]"), 2),
                        QuizQuestion("What happens to comments during program execution?", listOf("They are displayed in console", "They are ignored by the browser", "They make the code run faster", "They cause an error"), 1),
                        QuizQuestion("Why would you use a comment to 'disable' code?", listOf("To make the file smaller", "To test logic without deleting it", "To encrypt the code", "To change the variable type"), 1),
                        QuizQuestion("Can a single-line comment be placed at the end of a statement?", listOf("Yes", "No", "Only inside a block", "Only with const"), 0)
                    ),
                    subTopicName = "JS Comments",
                    headlines = listOf(

                        Headline(
                            headline = "JS Comments",
                            explaination = "JavaScript comments are used to describe the code and make it easier to understand. "
                                    + "Comments are ignored by the browser and do not affect program execution."
                        ),

                        Headline(
                            headline = "Single-Line Comments",
                            explaination = "Single-line comments are used to comment only one line of code.",
                            codeExample = """
                // This is a single-line comment
                let x = 10; // This comment explains the variable
            """.trimIndent(),
                            afterCodeEplainations = "Anything written after // is treated as a comment and is not executed."
                        ),

                        Headline(
                            explaination = "Single-line comments are often used for short explanations or notes in the code.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Comments can also be used to explain complex logic or important steps in a program.",
                            tip = "Write clear and meaningful comments, but avoid commenting obvious code.",
                            codeExample = """
                // Calculate total price
                let total = price + tax;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Multi-Line Comments",
                            explaination = "Multi-line comments are used to comment multiple lines at once.",
                            codeExample = """
                /*
                  This is a multi-line comment
                  It can span multiple lines
                */
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Disabling Code Using Comments",
                            explaination = "Comments can be used to temporarily disable code without deleting it.",
                            codeExample = """
                // console.log("This line will not run");

                /*
                alert("This code is disabled");
                */
            """.trimIndent()
                        )

                    )
                ),


                Subtopic(
                    sutopicId = 7,
                    questions = listOf(
                        QuizQuestion("What is the result of 'let x;' if you log x?", listOf("0", "null", "undefined", "Error"), 2),
                        QuizQuestion("Which operator is used to assign a value to a variable?", listOf("==", "===", "=", ":="), 2),
                        QuizQuestion("What happens if you try to change a 'const' variable?", listOf("It changes successfully", "It resets to zero", "It causes a runtime error", "It creates a new variable"), 2),
                        QuizQuestion("Which is a valid variable name?", listOf("1stUser", "user-name", "_totalAmount", "let"), 2),
                        QuizQuestion("When should you use 'let' instead of 'const'?", listOf("When the value will stay the same", "When the value needs to be updated later", "Only for strings", "Only for numbers"), 1)
                    ),
                    subTopicName = "JS Variables",
                    headlines = listOf(

                        Headline(
                            headline = "JS Variables",
                            explaination = "Variables are used to store data values in JavaScript. "
                                    + "A variable can hold different types of data such as numbers or text.",
                            codeExample = "let name;",
                            afterCodeEplainations = "This declares a variable named name without assigning a value."
                        ),

                        Headline(
                            explaination = "The assignment operator (=) is used to assign a value to a variable.",
                            codeExample = """
                let age = 25;
                let city = "New York";
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "Variables can store different types of data and their values can be used later in the program.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Undefined Variable",
                            explaination = "A variable that is declared but not assigned a value is called an undefined variable.",
                            codeExample = """
                let x;
                console.log(x);
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Changing Value",
                            explaination = "The value of a variable can be changed after it is declared.",
                            codeExample = """
                let score = 10;
                score = 20;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Constant Variables",
                            explaination = "Constant variables are declared using const and their values cannot be changed.",
                            codeExample = """
                const pi = 3.14;
            """.trimIndent(),
                            afterCodeEplainations = "Trying to change a const variable will cause an error."
                        ),

                        Headline(
                            explaination = "Use let for values that change and const for values that should stay the same.",
                            tip = "Always prefer const unless you know the value will change.",
                            codeExample = """
                let count = 1;
                const maxLimit = 100;
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Naming Variables",
                            explaination = "Variable names should be meaningful and describe the data they store."
                        ),

                        Headline(
                            headline = "Rules for Naming Variables",
                            explaination = "Variable names must start with a letter, underscore (_), or dollar sign ($) "
                                    + "and cannot contain spaces.",
                            tip = "Use camelCase for variable names, like userName or totalPrice."
                        )

                    ),
                ),



                Subtopic(
                    sutopicId = 8,
                    questions = listOf(
                        QuizQuestion("What keyword is used to create a function?", listOf("method", "function", "def", "routine"), 1),
                        QuizQuestion("How do you 'call' a function named 'myFunc'?", listOf("call myFunc", "myFunc[]", "myFunc()", "run(myFunc)"), 2),
                        QuizQuestion("What does the 'return' statement do?", listOf("Restarts the function", "Exits the function and sends back a value", "Repeats the code", "Deletes the variable"), 1),
                        QuizQuestion("A variable declared inside a function is:", listOf("Global", "Local (Function Scope)", "Shared", "Permanent"), 1),
                        QuizQuestion("What happens if you define a function but never call it?", listOf("The code runs once", "The browser crashes", "The code inside never executes", "It runs automatically"), 2)
                    ),
                    subTopicName = "JS Functions",

                    headlines = listOf(

                        Headline(
                            headline = "JS Functions",
                            explaination = "Functions are blocks of code designed to perform a specific task. "
                                    + "They help organize code and avoid repetition."
                        ),

                        Headline(
                            headline = "Function Definition",
                            explaination = "A function definition creates a function using the function keyword, "
                                    + "a name, and parentheses.",
                            tip = "Choose clear and meaningful function names.",
                            codeExample = """
                function greet() {
                    console.log("Hello!");
                }
            """.trimIndent(),
                            afterCodeEplainations = "This defines a function named greet, but it will not run until called."
                        ),

                        Headline(
                            explaination = "Functions can contain one or more statements inside their body.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Functions can be reused many times in a program.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Calling a Function",
                            explaination = "Calling a function means executing the code inside the function.",
                            codeExample = """
                greet();
            """.trimIndent(),
                            afterCodeEplainations = "This line runs the greet function."
                        ),

                        Headline(
                            explaination = "A function can be called multiple times whenever needed.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "The return Statement",
                            explaination = "The return statement sends a value back from the function.",
                            codeExample = """
                function add(a, b) {
                    return a + b;
                }
            """.trimIndent(),
                            afterCodeEplainations = "The function returns the result of a + b."
                        ),

                        Headline(
                            explaination = "Returned values can be stored in variables.",
                            codeExample = """
                let result = add(5, 3);
            """.trimIndent()
                        ),

                        Headline(
                            explaination = "Once return is executed, the function stops running.",
                            codeExample = ""
                        ),

                        Headline(
                            explaination = "Not all functions need to return a value.",
                            tip = "Use return only when you need a result from the function.",
                            codeExample = ""
                        ),

                        Headline(
                            headline = "Function Scope",
                            explaination = "Variables declared inside a function can only be used within that function.",
                            codeExample = """
                function test() {
                    let x = 10;
                    console.log(x);
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Global Vaiables",
                            explaination = "Global variables are declared outside functions and can be accessed anywhere in the code.",
                            codeExample = """
                let message = "Hello";

                function showMessage() {
                    console.log(message);
                }
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Why Use Functions",
                            explaination = "Functions make code reusable, organized, and easier to maintain.",
                            tip = "Break large programs into smaller functions.",
                            codeExample = """
                function calculateTotal(price, tax) {
                    return price + tax;
                }
            """.trimIndent(),
                            afterCodeEplainations = "This function can be reused whenever total calculation is needed."
                        )

                    )
                ),




                Subtopic(
                    sutopicId = 9,
                    questions = listOf(
                        QuizQuestion("Which event fires when a user clicks an HTML element?", listOf("onhover", "onclick", "onpress", "onchange"), 1),
                        QuizQuestion("What is the modern method to attach an event handler?", listOf("on()", "attachEvent()", "addEventListener()", "setEvent()"), 2),
                        QuizQuestion("How do you prevent a form from refreshing the page on submit?", listOf("e.stop()", "e.preventDefault()", "e.halt()", "e.ignore()"), 1),
                        QuizQuestion("Which event fires as soon as the HTML is loaded but before images load?", listOf("onload", "DOMReady", "DOMContentLoaded", "onfinish"), 2),
                        QuizQuestion("What is the difference between 'focus' and 'blur'?", listOf("There is no difference", "Focus is entering a field, blur is leaving it", "Focus is for buttons, blur is for text", "Blur happens only on scroll"), 1),
                        QuizQuestion("Which event tracks every single keystroke in an input?", listOf("change", "submit", "input", "blur"), 2),
                        QuizQuestion("What does 'window.scrollY' tell you during a scroll event?", listOf("The width of the page", "The vertical distance scrolled in pixels", "The speed of scrolling", "The number of elements on screen"), 1)
                    ),
                    subTopicName = "JS Events",
                    headlines = listOf(
                        Headline(
                            headline = "JS Events",
                            explaination = "JavaScript events are actions that happen in the browser, such as clicking a button, typing on the keyboard, or loading a page.",
                            codeExample = """
                <button onclick="showAlert()">Click Me</button>
                <script>
                    function showAlert() {
                        alert("Button clicked!");
                    }
                </script>
            """.trimIndent(),
                            afterCodeEplainations = "The function runs when the button is clicked."
                        ),

                        Headline(
                            headline = "Inline Event Handlers",
                            explaination = "Inline event handlers are written directly inside HTML elements using attributes like onclick or onmouseover.",
                            codeExample = """
                <button onclick="alert('Hello!')">Click</button>
            """.trimIndent(),
                            afterCodeEplainations = "Inline events are easy to use but not recommended for large applications as they mix logic with structure."
                        ),

                        Headline(
                            headline = "The addEventListener() Method",
                            explaination = "addEventListener() is the modern way to attach event handlers. It allows multiple listeners for a single event.",
                            codeExample = """
                <button id="btn">Click Me</button>
                <script>
                    document.getElementById("btn")
                        .addEventListener("click", () => {
                            alert("Modern click handler!");
                        });
                </script>
            """.trimIndent(),
                            afterCodeEplainations = "This method keeps JavaScript separate from HTML and is easier to maintain."
                        ),

                        Headline(
                            headline = "The DOMContentLoaded Event",
                            explaination = "This event fires when the HTML document has been completely loaded and parsed, without waiting for images or stylesheets.",
                            codeExample = """
                <script>
                    document.addEventListener("DOMContentLoaded", () => {
                        console.log("DOM is ready, you can now manipulate elements!");
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The input Event",
                            explaination = "Unlike 'change', the 'input' event fires immediately every time the value of an element changes.",
                            codeExample = """
                <input type="text" id="myInput">
                <p id="output"></p>
                <script>
                    document.getElementById("myInput").addEventListener("input", (e) => {
                        document.getElementById("output").innerText = e.target.value;
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "Mouse Events: mousedown & mouseup",
                            explaination = "These track the exact moments a mouse button is pressed down and then released.",
                            codeExample = """
                <button id="holdBtn">Hold Me</button>
                <script>
                    const btn = document.getElementById("holdBtn");
                    btn.addEventListener("mousedown", () => btn.innerText = "Pressed!");
                    btn.addEventListener("mouseup", () => btn.innerText = "Released!");
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The keydown Event",
                            explaination = "The keydown event occurs the moment a key is pressed. It is more reliable than keypress for non-character keys.",
                            codeExample = """
                <script>
                    window.addEventListener("keydown", (event) => {
                        console.log("Key pressed: " + event.key);
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The submit Event",
                            explaination = "This event occurs when a form is submitted. It is usually used to validate data or prevent the page from refreshing.",
                            codeExample = """
                <form id="myForm">
                    <input type="text" required>
                    <button type="submit">Send</button>
                </form>
                <script>
                    document.getElementById("myForm").addEventListener("submit", (e) => {
                        e.preventDefault(); // Stops the page from refreshing
                        alert("Form submitted safely!");
                    });
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The focus and blur Events",
                            explaination = "Focus happens when you enter an input field; blur happens when you leave it.",
                            codeExample = """
                <input type="text" id="fld" placeholder="Focus me">
                <script>
                    const fld = document.getElementById("fld");
                    fld.onfocus = () => fld.style.border = "2px solid blue";
                    fld.onblur = () => fld.style.border = "1px solid gray";
                </script>
            """.trimIndent()
                        ),

                        Headline(
                            headline = "The scroll Event",
                            explaination = "The scroll event fires when the document view or an element has been scrolled.",
                            codeExample = """
                <script>
                    window.onscroll = () => {
                        console.log("You are scrolling at: " + window.scrollY + "px");
                    };
                </script>
            """.trimIndent(),
                            tip = "Use 'throttling' or 'debouncing' with scroll events to maintain browser performance."
                        ),

                        Headline(
                            headline = "The contextmenu Event",
                            explaination = "This event fires when the user attempts to open a context menu (usually by right-clicking).",
                            codeExample = """
                <div style="background: lightgray; height: 50px;">Right-click here</div>
                <script>
                    document.addEventListener("contextmenu", (e) => {
                        e.preventDefault();
                        alert("Right-click is disabled!");
                    });
                </script>
            """.trimIndent()
                        )
                    )
                )









            ),



            Subtopic(
                sutopicId=49,
                subTopicName = "HTML Character Entity",
                headlines = listOf(
                    Headline(
                        majorHeadline ="HTML Character Entity",
                        explaination = "Explain and show using bulleting to explain all well " ,
                        codeExample = "give a simple example  ",
                        tip = "give tip"
                    ),
                    Headline(
                        explaination = "List the commonly used 10 and the symbol and name",
                        codeExample = "code example involving them",
                        afterCodeEplainations = "Explain",
                        ),

                    Headline(
                        headline = "Give other(s) Headline",
                        explaination = "explain ",
                        codeExample = "amazing",
                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ) ,
            Subtopic(
                sutopicId=410,
                subTopicName = "Audio",
                headlines = listOf(
                    Headline(
                        majorHeadline ="Audio",
                        explaination = "Explain and show the tag used " ,
                        codeExample = "give a simple example  ",
                        tip = "give tip"
                    ),
                    Headline(
                        headline = "Architecture of audio element",
                        explaination = "explain ",
                        codeExample = "give detailed example ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Architecture of audio element",
                        explaination = "explain ",
                        codeExample = "give detailed example ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Audios Attribute",
                        explaination = "explain each in a bulleting way ",
                        codeExample = "give detailed example using them ",
                        afterCodeEplainations = "Explain",

                        ),

                    Headline(
                        headline = "Audios Attribute",
                        explaination = "explain each in a bulleting way ",
                        codeExample = "give detailed example using them ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Audios autoplay",
                        explaination = "explain  ",
                        codeExample = "give example  ",


                        ),

                    Headline(
                        headline = "Audios loop",
                        explaination = "explain  ",
                        codeExample = "give example  ",


                        ),
                    Headline(
                        headline = "Audios muted",
                        explaination = "explain  ",
                        codeExample = "give example  ",
                    ),

                    Headline(
                        headline = "Audios controls",
                        explaination = "explain  ",
                        codeExample = "give example  ",
                        ),
                    Headline(
                        headline = " <source>",
                        explaination = "explain  ",
                        codeExample = "give example  ",
                    ),
                    Headline(
                        headline = "Advance Audio",
                        explaination = "explain  ",
                        codeExample = "give example  ",
                    ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ) ,
            Subtopic(
                sutopicId=411,
                subTopicName = "Video",
                headlines = listOf(
                    Headline(
                        majorHeadline ="Video",
                        explaination = "Explain and show the tag used " ,
                        codeExample = "give a simple example  ",
                        tip = "give tip"
                    ),
                    Headline(
                        headline = "Architecture of video element",
                        explaination = "explain ",
                        codeExample = "give detailed example ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Architecture of video element",
                        explaination = "explain ",
                        codeExample = "give detailed example ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Video Attribute",
                        explaination = "explain each in a bulleting way ",
                        codeExample = "give detailed example using them ",
                        afterCodeEplainations = "Explain",

                        ),

                    Headline(
                        headline = "Video Attribute",
                        explaination = "explain each in a bulleting way ",
                        codeExample = "give detailed example using them ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Video autoplay",
                        explaination = "explain  ",
                        codeExample = "give example  ",


                        ),

                    Headline(
                        headline = "Video loop",
                        explaination = "explain  ",
                        codeExample = "give example  ",


                        ),
                    Headline(
                        headline = "Video muted",
                        explaination = "explain  ",
                        codeExample = "give example  ",
                    ),

                    Headline(
                        headline = "Video controls",
                        explaination = "explain  ",
                        codeExample = "give example  ",
                    ),
                    Headline(
                        headline = " <source>",
                        explaination = "explain  ",
                        codeExample = "give example  ",
                    ),
                    Headline(
                        headline = "Advance Video",
                        explaination = "explain  ",
                        codeExample = "give example  ",
                    ),
                    Headline(
                        headline = "Video loading metadata",
                        explaination = "explain  ",
                        codeExample = "give example  ",
                    ),
                    Headline(
                        headline = "Video loading decrease",
                        explaination = "explain  how to use same videos each with different quality to load faster over low internet",
                        codeExample = "give example  ",
                    ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ) ,
            Subtopic(
                sutopicId=412,
                subTopicName = "Iframe",
                headlines = listOf(
                    Headline(
                        majorHeadline ="Iframe",
                        explaination = "Explain and show the tag used " ,
                        codeExample = "give a simple example  ",
                        tip = "give tip"
                    ),
                    Headline(
                        headline = "Architecture of Iframe element",
                        explaination = "explain ",
                        codeExample = "give detailed example ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Architecture of video element",
                        explaination = "explain ",
                        codeExample = "give detailed example ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Iframe Attribute",
                        explaination = "explain each in a bulleting way ",
                        codeExample = "give detailed example using them ",
                        afterCodeEplainations = "Explain",

                        ),

                    Headline(
                        headline = "Iframe height and width  Attribute",
                        explaination = "explain each in a bulleting way ",
                        codeExample = "give detailed example using them ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Iframe src",
                        explaination = "explain  ",
                        codeExample = "give example  ",


                        ),

                    Headline(
                        headline = "Iframe name",
                        explaination = "explain  ",
                        codeExample = "give example  ",


                        ),
                    Headline(
                        headline = "Iframe styling",
                        explaination = "explain  and show how to remove border ",
                        codeExample = "give example  ",


                        ),
                    Headline(
                        headline = "Embadding ExTernal  Website ",
                        explaination = "explain and show things that can be embeded eg maps ets  ",
                        codeExample = "give example  eg a map etc let it be running ",
                    ),


                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ) ,
            Subtopic(
                sutopicId=412,
                subTopicName = "Iframe Video",
                headlines = listOf(
                    Headline(
                        majorHeadline ="Youtube videos in iframe",
                        explaination = "Explain  " ,
                        codeExample = "give a good amazing example  ",
                        tip = "give tip"
                    ),
                    Headline(
                        headline = "Full Screen",
                        explaination = "explain ",
                        codeExample = "give detailed example ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "Architecture of Youtube video element",
                        explaination = "explain ",
                        codeExample = "give detailed example ",
                        afterCodeEplainations = "Explain",

                        ),
                    Headline(
                        headline = "HD Enabling",
                        explaination = "explain each in a bulleting way ",
                        codeExample = "give detailed example using them ",


                        ),
                    Headline(
                        headline = "Removing  video Controls",
                        explaination = "explain each in a bulleting way ",
                        codeExample = "give detailed example using them ",


                        ),

                    Headline(
                        headline = "Removing Suggested video",
                        explaination = "explain each in a bulleting way ",
                        codeExample = "give detailed example using them ",


                        ),
                    Headline(
                        headline = "Adding Captions",
                        explaination = "explain  ",
                        codeExample = "give example  ",


                        ),

                    Headline(
                        headline = "Seting starting point",
                        explaination = "explain  ",
                        codeExample = "give example  ",


                        ),
                    Headline(
                        headline = "Iframe styling",
                        explaination = "explain  and show how to remove border ",
                        codeExample = "give example  ",


                        ),
                 // add more headline on this topic

                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ) ,
            Subtopic(
                sutopicId=48,
                subTopicName = "HTML File Paths ",
                headlines = listOf(
                    Headline(
                        majorHeadline ="HTML File Paths ",
                        explaination = "Explain  " ,
                        codeExample = "give a good amazing example  ",
                        tip = "give tip"
                    ),

                    Headline(
                        headline = "Absolute file paths ",
                        explaination = "explain ",
                        codeExample = "amazing",


                        ),
                    Headline(
                        headline = "Relative file paths ",
                        explaination = "explain ",
                        codeExample = "amazing",


                        ),
                    Headline(
                        headline = "Give other(s) Headlines",
                        explaination = "explain ",
                        codeExample = "amazing",
                        afterCodeEplainations = "Explain",

                        ),
                    questions = listOf(
//                      give 5-8 questions on the subtopic in this format
                        QuizQuestion(
                            "Question",
                            listOf(
                                "options"
                            ),
                            number of correct ans
                        )


                    )
                )

            ) ,



            )
),


)















