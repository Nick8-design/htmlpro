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






            ),



    ),





    NoteModule(
   topic = "JS Basic Data Types",
   topicId=1,
   subtopics = listOf(

       Subtopic(
           sutopicId = 10,
           subTopicName = "JS String",
           questions = listOf(
               QuizQuestion("What is a String in JavaScript?", listOf("A type of number", "A sequence of characters used for text", "A mathematical formula", "A list of files"), 1),
               QuizQuestion("How must strings be written in JavaScript?", listOf("Inside curly braces {}", "Inside parentheses ()", "Inside single or double quotes", "Without any symbols"), 2),
               QuizQuestion("Which of these is a valid string?", listOf("let s = Hello;", "let s = 'Hello';", "let s = {Hello}", "let s = <Hello>"), 1),
               QuizQuestion("Can a string contain numbers?", listOf("Yes, but they are treated as text", "No, only letters", "Only if you use special tags", "Only in Linux systems"), 0),
               QuizQuestion("What data type is used for names and messages?", listOf("Number", "Boolean", "String", "Undefined"), 2)
           ),
           headlines = listOf(

               Headline(
                   headline = "JS Data Types?",
                   explaination = "JavaScript data types describe the kind of data a variable can store, "
                           + "such as text, numbers, or boolean values."
               ),

               Headline(
                   headline = "What are Data Types",
                   explaination = "Data types help JavaScript understand how to store and process different kinds of values."
               ),

               Headline(
                   headline = "String Data Types",
                   explaination = "A string is a sequence of characters used to represent text. "
                           + "Strings are written inside single or double quotes.",
                   codeExample = "",
                   afterCodeEplainations = "Strings can contain letters, numbers, and symbols."
               ),

               Headline(
                   explaination = "Strings are commonly used to store names, messages, and text values.",
                   codeExample = """
                let name = "John";
                let message = 'Hello World';
            """.trimIndent()
               )

           )
       ),




       Subtopic(
           sutopicId = 11,
           subTopicName = "JS Number",
           questions = listOf(
               QuizQuestion("How many data types does JS use for both integers and decimals?", listOf("One (Number)", "Two (Int and Float)", "Three", "None"), 0),
               QuizQuestion("What is the result of 10 + 5 in JavaScript?", listOf("'105'", "15", "105", "Undefined"), 1),
               QuizQuestion("What is 'String Concatenation'?", listOf("Subtracting numbers", "Combining a string with another value", "Deleting a variable", "Multiplying strings"), 1),
               QuizQuestion("What is the result of: 'Age: ' + 25?", listOf("Age: 25 (as a string)", "25", "An error", "Age: (25)"), 0),
               QuizQuestion("Which variable stores a decimal correctly?", listOf("let p = 99,99;", "let p = [99.99];", "let p = 99.99;", "let p = {99.99}"), 2)
           ),
           headlines = listOf(

               Headline(
                   headline = "Number Data Types",
                   explaination = "The number data type is used to store numeric values such as integers and decimals.",
                   codeExample = """
                let age = 25;
                let price = 99.99;
            """.trimIndent(),
                   afterCodeEplainations = "JavaScript uses the same data type for both whole numbers and decimals."
               ),

               Headline(
                   explaination = "Numbers can be used for calculations like addition, subtraction, and multiplication.",
                   codeExample = """
                let total = 10 + 5;
            """.trimIndent()
               ),

               Headline(
                   headline = "Combining Strings and Numbers",
                   explaination = "When a string is combined with a number, JavaScript converts the number into a string.",
                   codeExample = ""
               ),

               Headline(
                   explaination = "This process is called string concatenation.",
                   codeExample = """
                let result = "Age: " + 25;
            """.trimIndent()
               )

           )
       ),




       Subtopic(
           sutopicId = 12,
           subTopicName = "JS Boolean",
           questions = listOf(
               QuizQuestion("How many values can a Boolean data type have?", listOf("One", "Two", "Three", "Infinite"), 1),
               QuizQuestion("Which values represent the Boolean type?", listOf("yes / no", "1 / 0", "true / false", "on / off"), 2),
               QuizQuestion("What is the result of (5 > 3)?", listOf("false", "true", "null", "undefined"), 1),
               QuizQuestion("Where are Booleans most commonly used?", listOf("In mathematical equations", "In if-statements and conditions", "To store usernames", "To design CSS"), 1),
               QuizQuestion("If isActive = true, what kind of data type is it?", listOf("String", "Number", "Boolean", "Object"), 2)
           ),
           headlines = listOf(

               Headline(
                   headline = "Boolean Data Types",
                   explaination = "The Boolean data type has only two values: true or false. "
                           + "It is used to represent logical values, conditions, and comparisons.",
                   codeExample = """
                let isActive = true;
                let isLoggedIn = false;
            """.trimIndent(),
                   afterCodeEplainations = "Boolean values are often used in if statements or loops."
               ),

               Headline(
                   explaination = "Booleans can be the result of comparisons like >, <, ==, etc.",
                   tip = "Use Boolean values to control program flow and check conditions.",
                   codeExample = """
                let result = (5 > 3); // true
            """.trimIndent()
               )

           )
       ),



       Subtopic(
           sutopicId = 13,
           subTopicName = "JS Object",
           questions = listOf(
               QuizQuestion("What is a JavaScript Object?", listOf("A single number", "A collection of key-value pairs", "A type of comment", "A hidden file"), 1),
               QuizQuestion("In an object, what are the 'keys' called?", listOf("Values", "Properties", "Indexes", "Tags"), 1),
               QuizQuestion("How do you access the 'name' property of an object 'person'?", listOf("person->name", "person(name)", "person.name", "person[name]"), 2),
               QuizQuestion("Which symbols are used to define an object?", listOf("Square brackets []", "Parentheses ()", "Curly braces {}", "Angle brackets <>"), 2),
               QuizQuestion("Can an object store different data types at once?", listOf("Yes", "No, only strings", "No, only numbers", "Only in external files"), 0)
           ),
           headlines = listOf(

               Headline(
                   headline = "Object Data Type",
                   explaination = "Objects are collections of key-value pairs that store related data together. "
                           + "Keys are called properties, and values can be any data type.",
                   codeExample = """
                let person = {
                    name: "Alice",
                    age: 25,
                    isStudent: true
                };
            """.trimIndent(),
                   afterCodeEplainations = "person.name gives 'Alice', person.age gives 25, etc."
               ),

               Headline(
                   explaination = "Objects help organize complex data and make it easier to manage.",
                   tip = "Use descriptive property names for clarity.",
                   codeExample = """
                let car = {
                    brand: "Toyota",
                    model: "Corolla",
                    year: 2021
                };
            """.trimIndent(),
                   afterCodeEplainations = "You can access values using dot notation like car.brand or car.year."
               )

           )
       ),


       Subtopic(
           sutopicId = 14,
           questions = listOf(
               QuizQuestion("What is an Array?", listOf("A single value", "An ordered collection of values", "A logical condition", "A type of popup"), 1),
               QuizQuestion("What is the starting index of a JavaScript Array?", listOf("1", "0", "-1", "A"), 1),
               QuizQuestion("If fruits = ['Apple', 'Banana'], what is fruits[0]?", listOf("Banana", "Apple", "null", "2"), 1),
               QuizQuestion("Which symbols are used to define an array?", listOf("{}", "()", "[]", "//"), 2),
               QuizQuestion("How many items can a single array variable hold?", listOf("Only one", "Exactly ten", "Multiple items", "Zero"), 2)
           ),
           subTopicName = "JS Array",
           headlines = listOf(

               Headline(
                   headline = "JS Arrays?",
                   explaination = "Arrays are ordered collections of values. They can store multiple items in a single variable.",
                   codeExample = """
                let fruits = ["Apple", "Banana", "Cherry"];
                console.log(fruits[0]); // Apple
            """.trimIndent(),
                   afterCodeEplainations = "Array elements are accessed using their index, starting from 0."
               )

           )
       ),


       Subtopic(
           sutopicId = 15,
           questions = listOf(
               QuizQuestion("When does 'undefined' occur?", listOf("When a variable is deleted", "When a variable is declared but not assigned a value", "When a number is too large", "When a string is empty"), 1),
               QuizQuestion("If you write 'let x;' and then 'console.log(x);', what is the output?", listOf("0", "null", "undefined", "Error"), 2),
               QuizQuestion("Is 'undefined' a data type?", listOf("Yes", "No", "Only in HTML", "Only in CSS"), 0),
               QuizQuestion("True or False: undefined means the variable does not exist at all.", listOf("True", "False (It exists but has no value)", "Only in Node.js", "Only on Linux"), 1),
               QuizQuestion("Does 'let x = 0;' result in undefined?", listOf("Yes", "No, it is assigned the value 0", "Only if x is a string", "Only in functions"), 1)
           ),
           subTopicName = "JS Undefined",
           headlines = listOf(

               Headline(
                   headline = "The undefined Data Type",
                   explaination = "The undefined data type occurs when a variable is declared but has not been assigned a value.",
                   codeExample = """
                let x;
                console.log(x); // undefined
            """.trimIndent(),
                   afterCodeEplainations = "Since x has no value assigned, it is undefined."
               )

           )
       ),


       Subtopic(
           sutopicId = 16,
           subTopicName = "JS null",
           questions = listOf(
               QuizQuestion("What does 'null' represent?", listOf("A syntax error", "An intentional absence of any value", "A very large number", "An unassigned variable"), 1),
               QuizQuestion("How is 'null' different from 'undefined'?", listOf("They are the same", "null is assigned by the developer, undefined is set by JS", "null is for numbers only", "undefined is for objects only"), 1),
               QuizQuestion("Which is the correct way to empty an object variable?", listOf("let user = 0;", "let user = null;", "let user = 'empty';", "let user = undefined;"), 1),
               QuizQuestion("What is the value of 'y' if you write 'let y = null;'?", listOf("undefined", "0", "null", "NaN"), 2),
               QuizQuestion("Should you use null to indicate an empty object?", listOf("Yes", "No", "Only for strings", "Only for arrays"), 0)
           ),
           headlines = listOf(

               Headline(
                   headline = "The null Data Type",
                   explaination = "The null value represents an intentional absence of any object value. "
                           + "It is different from undefined.",
                   codeExample = """
                let y = null;
                console.log(y); // null
            """.trimIndent(),
                   afterCodeEplainations = "null is explicitly assigned to show the variable has no value."
               ),

               Headline(
                   explaination = "Use null when you want to reset a variable or indicate it has no value.",
                   tip = "Don't confuse null with undefined; undefined means 'not assigned', null means 'empty'.",
                   codeExample = """
                let user = null; // user has no object yet
            """.trimIndent()
               )

           )
       ),


       Subtopic(
           sutopicId = 17,
           questions = listOf(
               QuizQuestion("What does it mean that JS is a 'dynamic' language?", listOf("It runs fast", "Variables can change types at runtime", "It only works on dynamic websites", "It requires a lot of power"), 1),
               QuizQuestion("Which operator is used to check the type of a variable?", listOf("type()", "checkType", "typeof", "kindof"), 2),
               QuizQuestion("What will 'typeof 25' return?", listOf("string", "boolean", "number", "object"), 2),
               QuizQuestion("Which of the following is a Primitive data type?", listOf("Object", "Array", "String", "Function"), 2),
               QuizQuestion("Which of the following is a Complex data type?", listOf("Number", "Boolean", "Object", "Null"), 2)
           ),
           subTopicName = "JS is Dynamic",
           headlines = listOf(

               Headline(
                   headline = "JS is Dynamic",
                   explaination = "JavaScript is a dynamic language, meaning variables can change type at runtime.",
                   codeExample = """
                let value = 10;   // number
                value = "Hello";  // now string
            """.trimIndent()
               ),

               Headline(
                   headline = "The typeof Operator",
                   explaination = "The typeof operator checks the type of a variable or value.",
                   tip = "Use typeof to debug or check data types during runtime.",
                   codeExample = """
                let name = "Alice";
                console.log(typeof name); // string
            """.trimIndent()
               ),

               Headline(
                   headline = "JS in head",
                   explaination = "You can include JavaScript in the head section of HTML using the <script> tag.",
                   codeExample = ""
               ),

               Headline(
                   headline = "Primitive Data Type",
                   explaination = "Primitive data types include string, number, boolean, null, undefined, and symbol. "
                           + "They store simple values."
               ),

               Headline(
                   headline = "Complex Data",
                   explaination = "Complex data types include objects and arrays, which can store multiple values and properties.",
                   codeExample = """
                let person = { name: "Bob", age: 30 };
                let fruits = ["Apple", "Banana"];
            """.trimIndent(),
                   afterCodeEplainations = "Objects and arrays can hold multiple values and are more flexible than primitive types."
               )

           )
       ),


       )
),


    NoteModule(
        topic = "Operators in Javascript",
        topicId=2,
        subtopics = listOf(

            Subtopic(
                sutopicId = 18,
                questions = listOf(
                    QuizQuestion("What is the primary purpose of an operator in JS?", listOf("To store data", "To perform actions/operations on values", "To create a new file", "To design the UI"), 1),
                    QuizQuestion("Which operator is used to assign a value to a variable?", listOf("==", "===", "=", "=>"), 2),
                    QuizQuestion("What is the result of '5 + 2' in JavaScript?", listOf("52", "7", "3", "10"), 1),
                    QuizQuestion("Why is '===' preferred over '=='?", listOf("It is faster", "It checks both value and data type", "It is easier to type", "It works only for numbers"), 1),
                    QuizQuestion("What does the '!' (NOT) operator do?", listOf("Adds a value", "Multiplies a value", "Flips a Boolean value", "Ends the script"), 2)
                ),
                subTopicName = "JS Operators",
                headlines = listOf(
                    Headline(
                        headline = "Introduction to JS Operators",
                        explaination = "In JavaScript, operators are special symbols used to perform operations on variables and values. Think of them as verbs: if variables are the 'nouns', operators are the 'actions' that add, compare, or assign them."
                    ),
                    Headline(
                        headline = "Assignment Operator (=)",
                        explaination = "The simplest operator is the assignment operator. It assigns the value on the right to the variable on the left.",
                        codeExample = """
                let x = 10;
                let message = "Hello JS";
                console.log(x);
                console.log(message);
            """.trimIndent(),
                        afterCodeEplainations = "The '=' does not mean 'equal to' in JS; it means 'take the value on the right and put it into the box on the left'."
                    ),
                    Headline(
                        headline = "Arithmetic Operators",
                        explaination = "These are used to perform common mathematical calculations like addition, subtraction, and multiplication.",
                        codeExample = """
                let sum = 5 + 2;      // 7
                let product = 5 * 2;  // 10
                console.log("Sum: " + sum + ", Product: " + product);
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Comparison Operators",
                        explaination = "Comparison operators compare two values and return a logical value: either true or false. They are the backbone of decision-making in code.",
                        codeExample = """
                let age = 18;
                console.log(age >= 18); // true
                console.log(age == "18"); // true (loose equality)
                console.log(age === "18"); // false (strict equality)
            """.trimIndent(),
                        afterCodeEplainations = "Using triple equals (===) is safer because it checks both the value and the data type."
                    ),
                    Headline(
                        headline = "Logical Operators",
                        explaination = "Logical operators allow you to combine multiple comparisons. They are: AND (&&), OR (||), and NOT (!).",
                        codeExample = """
                let hasTicket = true;
                let hasID = false;
                // Requires BOTH to be true
                console.log(hasTicket && hasID); // false
                // Requires only ONE to be true
                console.log(hasTicket || hasID); // true
            """.trimIndent()
                    ),
                    Headline(
                        headline = "String Operators",
                        explaination = "The '+' operator isn't just for numbers! When used on strings, it joins them together (concatenation).",
                        tip = "If you add a number to a string, JS will convert the number to a string and join them!",
                        codeExample = """
                let firstName = "John";
                let lastName = "Doe";
                console.log(firstName + " " + lastName); // "John Doe"
                console.log("Points: " + 50); // "Points: 50"
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Bitwise Operators",
                        explaination = "Bitwise operators work on 32-bit numbers at the binary level (0s and 1s). They are rarely used in standard web apps but are vital for low-level graphics or cryptography.",
                        codeExample = """
                // 5 in binary: 0101
                // 1 in binary: 0001
                console.log(5 & 1); // Output: 1 (AND operation)
            """.trimIndent()
                    )
                )
            ),

            Subtopic(
                sutopicId = 19,
                questions = listOf(
                    QuizQuestion("What is the result of '10 % 3' (Remainder)?", listOf("3", "0", "1", "3.33"), 2),
                    QuizQuestion("Which operator raises a number to a power?", listOf("^", "*", "exp", "**"), 3),
                    QuizQuestion("What happens if you use 'count++' on a variable with value 5?", listOf("Value becomes 4", "Value stays 5", "Value becomes 6", "Error"), 2),
                    QuizQuestion("According to precedence, what is '10 + 5 * 2'?", listOf("30", "20", "25", "15"), 1),
                    QuizQuestion("Which operator is used for division?", listOf("\\", "/", "%", "÷"), 1)
                ),
                subTopicName = "JS Arithmetic Operators",
                headlines = listOf(
                    Headline(
                        headline = "What are Arithmetic Operators?",
                        explaination = "Arithmetic operators take numerical values (either literals or variables) as their operands and return a single numerical value."
                    ),
                    Headline(
                        headline = "Addition Operator (+)",
                        explaination = "The addition operator adds numbers together.",
                        tip = "Be careful: Using '+' with a string will merge them, not add them mathematically.",
                        codeExample = """
                let apples = 10;
                let oranges = 5;
                let totalFruit = apples + oranges;
                console.log(totalFruit); // 15
            """.trimIndent(),
                        afterCodeEplainations = "If you add 10 + 5, you get 15. If you add '10' + 5, you get '105'."
                    ),
                    Headline(
                        headline = "Subtraction Operator (-)",
                        explaination = "The subtraction operator (-) subtracts the right operand from the left operand.",
                        codeExample = """
                let balance = 100;
                let spent = 40;
                console.log(balance - spent); // 60
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Multiplication (*) and Division (/)",
                        explaination = "Multiplication uses the asterisk (*), and division uses the forward slash (/).",
                        codeExample = """
                console.log(10 * 3); // 30
                console.log(10 / 2); // 5
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Exponentiation (**)",
                        explaination = "The exponentiation operator (**) raises the first operand to the power of the second operand (ES2016).",
                        codeExample = """
                let base = 5;
                console.log(base ** 2); // 25 (5 squared)
                console.log(2 ** 3);    // 8 (2 cubed)
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Remainder Operator (%)",
                        explaination = "Also called the Modulo operator, it returns the division remainder. It is incredibly useful for checking if a number is even or odd.",
                        codeExample = """
                console.log(10 % 3); // 1 (3 goes into 10 three times, 1 left over)
                console.log(10 % 2); // 0 (Even number)
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Increment (++) and Decrement (--)",
                        explaination = "These operators increase or decrease the value of a variable by exactly 1. They are common in loops.",
                        codeExample = """
                let count = 5;
                count++; // count is now 6
                count--; // count is now 5 again
                console.log(count);
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Operator Precedence",
                        explaination = "Just like in school math (BODMAS/PEMDAS), JS follows an order. Multiplication and Division are calculated before Addition and Subtraction.",
                        tip = "Always use parentheses ( ) to make sure your math is calculated in the order you want!",
                        codeExample = """
                let result = 10 + 5 * 2;   // 20 (5*2 first)
                let grouped = (10 + 5) * 2; // 30 (10+5 first)
                console.log(result, grouped);
            """.trimIndent()
                    )
                )
            ),


            Subtopic(
                sutopicId = 20,
                questions = listOf(
                    QuizQuestion("What is 'points += 5' short for?", listOf("points = 5", "points = points + 5", "points + 5", "points == 5"), 1),
                    QuizQuestion("Which operator subtracts a value and saves the result?", listOf("=-", "--", "-=", "<-"), 2),
                    QuizQuestion("If x = 10, what is the value of x after 'x *= 2'?", listOf("10", "12", "20", "100"), 2),
                    QuizQuestion("Which operator is used to calculate and assign a remainder?", listOf("/=", "%%", "%=", "^="), 2),
                    QuizQuestion("Can you chain multiple assignment updates in JS?", listOf("Yes", "No", "Only for strings", "Only in Linux"), 0)
                ),
                subTopicName = "Assignment Operators",
                headlines = listOf(
                    Headline(
                        headline = "What is an Assignment Operator?",
                        explaination = "Assignment operators are used to store values in variables. They aren't just for initial setup; they are used throughout your code to update values as your program runs."
                    ),
                    Headline(
                        headline = "Basic Assignment (=)",
                        explaination = "The standard equal sign assigns the value on the right side to the variable on the left side.",
                        codeExample = """
                let userAge = 25;
                let cityName = "New York";
                console.log(userAge); // Output: 25
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Addition Assignment (+=)",
                        explaination = "This operator adds the value of the right operand to a variable and assigns the result to that variable.",
                        codeExample = """
                let points = 10;
                points += 5; // Same as: points = points + 5
                console.log(points); // Output: 15
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Subtraction Assignment (-=)",
                        explaination = "Subtracts a value from a variable and saves the result back into that same variable.",
                        codeExample = """
                let health = 100;
                health -= 20; // Same as: health = health - 20
                console.log(health); // Output: 80
            """.trimIndent(),
                        afterCodeEplainations = "Perfect for reducing counters or decreasing player health in games."
                    ),
                    Headline(
                        headline = "Multiplication (*=) and Division (/=)",
                        explaination = "These shortcuts multiply or divide the current variable value by the right-hand number.",
                        codeExample = """
                let salary = 2000;
                salary *= 1.10; // 10% raise

                let cookies = 10;
                cookies /= 2; // Split between two people
                console.log(salary, cookies); // Output: 2200, 5
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Remainder Assignment (%=)",
                        explaination = "Divides the variable by a value and assigns the remainder to the variable.",
                        codeExample = """
                let items = 10;
                items %= 3;
                console.log(items); // Output: 1
            """.trimIndent(),
                        afterCodeEplainations = "10 divided by 3 is 3 with a remainder of 1."
                    ),
                    Headline(
                        headline = "Exponentiation Assignment (**=)",
                        explaination = "Raises the variable to the power of the right operand and stores the result.",
                        codeExample = """
                let power = 2;
                power **= 3; // 2 to the power of 3 (2 * 2 * 2)
                console.log(power); // Output: 8
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Chaining Assignment Operators",
                        explaination = "You can actually perform multiple updates in a sequence using these shortcuts.",
                        tip = "Chaining makes code concise but ensure it remains readable for others!",
                        codeExample = """
                let x = 10;
                x += 5; // 15
                x *= 2; // 30
                x -= 10; // 20
                console.log(x); // Output: 20
            """.trimIndent()
                    )
                )
            ),

            Subtopic(
                sutopicId = 21,
                questions = listOf(
                    QuizQuestion("What does '5 == \"5\"' return?", listOf("true", "false", "undefined", "Error"), 0),
                    QuizQuestion("What does '5 === \"5\"' return?", listOf("true", "false", "undefined", "Error"), 1),
                    QuizQuestion("Which operator checks if two values are NOT strictly equal?", listOf("!=", "!==", "<>", "not="), 1),
                    QuizQuestion("What is the result of '\"Apple\" < \"Banana\"'?", listOf("true", "false", "null", "undefined"), 0),
                    QuizQuestion("Which operator checks if a value is 'Greater Than or Equal'?", listOf(">", "=>", ">=", ">>"), 2)
                ),
                subTopicName = "Comparison Operators",
                headlines = listOf(
                    Headline(
                        headline = "The Goal of Comparison",
                        explaination = "Comparison operators compare two values and always result in a Boolean: either true or false. They are the 'decision makers' in programming.",
                        tip = "Comparisons are the foundation of 'if' statements and loops."
                    ),
                    Headline(
                        headline = "Equal To (==) vs Strict Equal (===)",
                        explaination = "The double equals (==) checks if values are the same, even if they are different types (like '5' and 5). The triple equals (===) requires the type AND the value to be identical.",
                        codeExample = """
                console.log(5 == "5");  // true (type is ignored)
                console.log(5 === "5"); // false (one is Number, one is String)
            """.trimIndent(),
                        afterCodeEplainations = "In modern JS, always use === to avoid unexpected bugs."
                    ),
                    Headline(
                        headline = "Not Equal (!=) vs Strict Not Equal (!==)",
                        explaination = "Similar to equality, these check if values are different. Strict (!==) is preferred as it checks the data type as well.",
                        codeExample = """
                console.log(10 != "10");  // false (they are seen as equal)
                console.log(10 !== "10"); // true (they are different types)
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Greater Than (>) and Less Than (<)",
                        explaination = "These work just like math class. They check if the left value is bigger or smaller than the right value.",
                        codeExample = """
                console.log(15 > 10); // true
                console.log(5 < 2);   // false
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Greater Than or Equal (>=) and Less or Equal (<=)",
                        explaination = "These include the number itself in the comparison. If the numbers are exactly the same, these return true.",
                        codeExample = """
                let passingGrade = 50;
                let myGrade = 50;
                console.log(myGrade >= passingGrade); // true
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Comparing Strings",
                        explaination = "JavaScript can compare strings alphabetically. Be careful: uppercase letters come before lowercase in the computer's memory!",
                        codeExample = """
                console.log("Apple" < "Banana"); // true
                console.log("apple" > "Banana"); // true (lowercase 'a' > uppercase 'B')
            """.trimIndent()
                    )
                )
            ),

            Subtopic(
                sutopicId = 22,
                questions = listOf(
                    QuizQuestion("Which operator returns true only if BOTH sides are true?", listOf("||", "&&", "!", "??"), 1),
                    QuizQuestion("Which operator returns true if at least one side is true?", listOf("||", "&&", "!", "??"), 0),
                    QuizQuestion("What is the result of '!false'?", listOf("false", "true", "null", "undefined"), 1),
                    QuizQuestion("What does the '??' (Nullish Coalescing) operator do?", listOf("Multiplies null values", "Provides a default value if left side is null/undefined", "Compares two numbers", "Checks for errors"), 1),
                    QuizQuestion("If a = true and b = false, what is 'a && b'?", listOf("true", "false", "undefined", "null"), 1)
                ),
                subTopicName = "Logical Operators",
                headlines = listOf(
                    Headline(
                        headline = "Connecting Logic",
                        explaination = "Logical operators allow you to combine multiple comparisons into one big decision.",
                        tip = "Think of them as the words AND, OR, and NOT."
                    ),
                    Headline(
                        headline = "Logical AND (&&)",
                        explaination = "This operator only returns true if BOTH sides are true. If even one side is false, the whole thing is false.",
                        codeExample = """
                let hasJob = true;
                let hasMoney = true;
                console.log(hasJob && hasMoney); // true
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Logical OR (||)",
                        explaination = "This returns true if AT LEAST ONE side is true. It only returns false if both sides are false.",
                        codeExample = """
                let isWeekend = true;
                let isHoliday = false;
                console.log(isWeekend || isHoliday); // true
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Logical NOT (!)",
                        explaination = "The 'flipper.' It turns true into false, and false into true.",
                        codeExample = """
                let isRaining = true;
                console.log(!isRaining); // false
            """.trimIndent()
                    ),
                    Headline(
                        headline = "The Nullish Coalescing Operator (??)",
                        explaination = "A specialized operator that returns the right-hand side if the left-hand side is null or undefined.",
                        codeExample = """
                let username = null;
                let displayName = username ?? "Anonymous";
                console.log(displayName); // "Anonymous"
            """.trimIndent(),
                        afterCodeEplainations = "This is great for setting default values without accidentally ignoring empty strings or zeros."
                    )
                )
            ),

            Subtopic(
                sutopicId = 23,
                subTopicName = "Bitwise Operators",
                questions = listOf(
                    QuizQuestion("Bitwise operators work on numbers at which level?", listOf("Decimal", "Binary (0s and 1s)", "Strings", "Hexadecimal"), 1),
                    QuizQuestion("Which symbol is used for Bitwise AND?", listOf("&&", "&", "AND", "||"), 1),
                    QuizQuestion("What is the effect of the Left Shift (<<) operator?", listOf("Divides by 2", "Adds 1", "Multiplies by 2", "Subtracts 1"), 2),
                    QuizQuestion("Which operator is used for Bitwise OR?", listOf("||", "|", "OR", "&&"), 1),
                    QuizQuestion("Are Bitwise operators commonly used in standard web forms?", listOf("Yes, always", "No, they are usually for low-level logic", "Only in CSS", "Only for mobile apps"), 1)
                ),
                headlines = listOf(
                    Headline(
                        headline = "Deep Dive into Bits",
                        explaination = "Bitwise operators treat their operands as a set of 32 bits (zeros and ones) rather than decimal numbers."
                    ),
                    Headline(
                        headline = "Bitwise AND (&)",
                        explaination = "Compares each bit. It results in 1 only if both corresponding bits are 1.",
                        codeExample = """
                // 5: 0101
                // 1: 0001
                console.log(5 & 1); // 1 (0001)
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Bitwise OR (|)",
                        explaination = "Results in 1 if at least one of the corresponding bits is 1.",
                        codeExample = """
                // 5: 0101
                // 2: 0010
                console.log(5 | 2); // 7 (0111)
            """.trimIndent()
                    ),
                    Headline(
                        headline = "Shift Operators (<< and >>)",
                        explaination = "These move the bits to the left or right. Moving left (<<) effectively multiplies by 2, and moving right (>>) divides by 2.",
                        codeExample = """
                console.log(5 << 1); // 10
                console.log(10 >> 1); // 5
            """.trimIndent()
                    )
                )
            )


            )
),

    NoteModule(
        topic = "JS More on Data Types",
        topicId=3,
        subtopics = listOf(
            Subtopic(
                sutopicId = 31,
                questions = listOf(
                    QuizQuestion("What is a JavaScript Object?", listOf("A single primitive value", "A collection of related data and functionality (properties/methods)", "An ordered list of numbers", "A type of string"), 1),
                    QuizQuestion("Which notation is required if a property name has a space?", listOf("Dot notation (.)", "Bracket notation ([])", "Slash notation (/)", "Colon notation (:)"), 1),
                    QuizQuestion("What does the 'this' keyword refer to inside an object method?", listOf("The global window", "The method itself", "The owner object", "The first variable in the script"), 2),
                    QuizQuestion("How do you access a property named 'os' inside a nested object 'details' of 'developer'?", listOf("developer.os", "developer.details.os", "developer[os]", "developer.details->os"), 1),
                    QuizQuestion("What is an object 'method'?", listOf("A CSS style", "A property that holds a function", "A way to delete the object", "A type of array"), 1)
                ),
                subTopicName = "JS Objects",
                headlines = listOf(
                    Headline(
                        headline = "Object",
                        explaination = "In JavaScript, an object is a standalone entity with properties and type. It is a collection of related data and/or functionality, consisting of variables (properties) and functions (methods).",
                        codeExample = "const car = { brand: 'Tesla', model: 'Model 3', year: 2024 };\nconsole.log(car);",
                        afterCodeEplainations = "This creates a 'car' object with three properties. Each property has a key (like brand) and a value (like Tesla).",
                        tip = "Think of an object as a container for related information, like a real-world object's characteristics."
                    ),
                    Headline(
                        headline = "Methods in an Object",
                        explaination = "Methods are actions that can be performed on objects. They are essentially functions stored as object properties.",
                        codeExample = "const user = {\n  name: 'Alice',\n  greet: function() { return 'Hello, ' + this.name; }\n};\nconsole.log(user.greet());",
                        afterCodeEplainations = "The 'greet' property is a method. When called using (), it executes the function logic."
                    ),
                    Headline(
                        headline = "Accessing Object's Properties",
                        explaination = "You can retrieve the values stored in an object using two primary ways: Dot Notation and Bracket Notation.",
                        codeExample = "const laptop = { brand: 'Apple', ram: '16GB' };\nconsole.log(laptop.brand);\nconsole.log(laptop['ram']);",
                        afterCodeEplainations = "Both console logs output the values associated with the keys 'brand' and 'ram'."
                    ),
                    Headline(
                        headline = "Dot Notation (.)",
                        explaination = "Dot notation is the most common way to access properties. You simply use the object name followed by a dot and the property name.",
                        codeExample = "const server = { port: 8080 };\nconsole.log(server.port);",
                        afterCodeEplainations = "Use this when you know the name of the property beforehand and it doesn't contain special characters."
                    ),
                    Headline(
                        headline = "Bracket Notation",
                        explaination = "Bracket notation uses square brackets. It is required if the property name has spaces or if you are using a variable to access the key.",
                        codeExample = "const config = { 'max-users': 100 };\nconst key = 'max-users';\nconsole.log(config[key]);",
                        afterCodeEplainations = "This is powerful because it allows for dynamic property access."
                    ),
                    Headline(
                        headline = "this Keyword",
                        explaination = "Inside an object method, 'this' refers to the 'owner' of the function—the object itself.",
                        codeExample = "const robot = {\n  model: 'RX-78',\n  identify: function() { return 'I am model ' + this.model; }\n};\nconsole.log(robot.identify());",
                        afterCodeEplainations = "'this.model' ensures we are grabbing the model property from the current robot object."
                    ),
                    Headline(
                        headline = "An Object in an Object (Nested)",
                        explaination = "Objects can contain other objects as properties. This is called nesting and helps represent complex data structures.",
                        codeExample = "const developer = {\n  id: 1,\n  details: { language: 'JS', os: 'Linux' }\n};\nconsole.log(developer.details.os);",
                        afterCodeEplainations = "We chain the dots to 'drill down' into the nested object."
                    )
                )
            ),
            Subtopic(
                sutopicId = 32,
                questions = listOf(
                    QuizQuestion("Are JavaScript strings mutable (can you change one character directly)?", listOf("Yes", "No, they are immutable", "Only if using double quotes", "Only in Linux"), 1),
                    QuizQuestion("Which character is used to 'escape' a quote inside a string?", listOf("Forward slash (/)", "Backslash (\\)", "Asterisk (*)", "Percentage (%)"), 1),
                    QuizQuestion("What is the result of 'Java' + 'Script'?", listOf("Java Script", "JavaScript", "JS", "Error"), 1),
                    QuizQuestion("Is there a technical difference between single (') and double (\") quotes?", listOf("Yes, double is faster", "Yes, single is for characters only", "No technical difference", "Yes, single is for Linux"), 2),
                    QuizQuestion("What usually causes a 'Bad String' error?", listOf("Using too many words", "Mismatched or unclosed quotes", "Using numbers in text", "Using the + operator"), 1)
                ),
                subTopicName = "JS Strings",
                headlines = listOf(
                    Headline(
                        headline = "JS Strings",
                        explaination = "Strings are used for storing and manipulating text. They are a sequence of characters wrapped in quotes.",
                        codeExample = "let message = 'Welcome to Linux Kernel development';\nconsole.log(message);",
                        afterCodeEplainations = "The variable 'message' now holds a text string.",
                        tip = "Strings are immutable, meaning you cannot change a single character of a string directly; you must create a new one."
                    ),
                    Headline(
                        headline = "Single or Double Quotes",
                        explaination = "JavaScript allows strings to be wrapped in either single (') or double (\") quotes. There is no technical difference between them.",
                        codeExample = "let text1 = 'Single';\nlet text2 = \"Double\";\nconsole.log(text1, text2);",
                        afterCodeEplainations = "Consistency is key. Pick one style and stick to it across your project."
                    ),
                    Headline(
                        headline = "Concatenating Strings (+)",
                        explaination = "The plus operator (+) can join two or more strings together to create a single longer string.",
                        codeExample = "let part1 = 'Java';\nlet part2 = 'Script';\nconsole.log(part1 + part2);",
                        afterCodeEplainations = "This outputs 'JavaScript' by merging the two variables."
                    ),
                    Headline(
                        headline = "Escaping Characters",
                        explaination = "Because strings use quotes, if you need to include a quote inside the text, you must use a backslash (\\) to 'escape' it.",
                        codeExample = "let quote = \"It\\'s a 'Unix' system!\";\nconsole.log(quote);",
                        afterCodeEplainations = "The backslash tells JavaScript that the following quote is part of the text, not the end of the string."
                    ),
                    Headline(
                        headline = "Bad String",
                        explaination = "A 'bad string' usually refers to a syntax error where quotes are mismatched or unclosed, causing the script to crash.",
                        codeExample = "// let error = 'Missing quote;\nconsole.log('Ensure you close your quotes!');",
                        afterCodeEplainations = "Always check your IDE for red squiggles indicating unclosed strings."
                    )
                )
            ),
            Subtopic(
                sutopicId = 33,
                questions = listOf(
                    QuizQuestion("Which property returns the number of characters in a string?", listOf(".size", ".count", ".length", ".width"), 2),
                    QuizQuestion("What is the index of the first character in a string?", listOf("1", "0", "-1", "A"), 1),
                    QuizQuestion("What does .trim() do?", listOf("Cuts the string in half", "Removes whitespace from both ends", "Changes text to lowercase", "Deletes the string"), 1),
                    QuizQuestion("If .search() does not find a match, what does it return?", listOf("0", "null", "-1", "false"), 2),
                    QuizQuestion("What is the result of 'Frontend'.slice(0, 5)?", listOf("Front", "Fronte", "End", "Frontend"), 0)
                ),
                subTopicName = "JS String Methods",
                headlines = listOf(
                    Headline(
                        headline = "String as Object",
                        explaination = "In JS, primitive strings can act like objects. When you call a method, JS temporarily wraps the string in an object so you can access properties.",
                        codeExample = "let str = 'hello';\nconsole.log(str.toUpperCase());",
                        afterCodeEplainations = "Even though 'str' is a primitive, we can call .toUpperCase() on it."
                    ),
                    Headline(
                        headline = "Getting String Length",
                        explaination = "The .length property returns the total number of characters in a string, including spaces.",
                        codeExample = "let path = '/usr/bin/node';\nconsole.log(path.length);",
                        afterCodeEplainations = "This counts every character from the first slash to the 'e'."
                    ),
                    Headline(
                        headline = "Getting a Character",
                        explaination = "You can access characters by their index (starting at 0) using charAt() or bracket notation.",
                        codeExample = "let name = 'Linux';\nconsole.log(name.charAt(0)); // L",
                        afterCodeEplainations = "Index 0 is the first character. Index 1 is the second, and so on."
                    ),
                    Headline(
                        headline = "The slice() Method",
                        explaination = "slice(start, end) extracts a part of a string and returns it as a new string.",
                        codeExample = "let text = 'Frontend development';\nconsole.log(text.slice(0, 8));",
                        afterCodeEplainations = "This outputs 'Frontend'. The 'end' index is not included in the result."
                    ),
                    Headline(
                        headline = "search() method",
                        explaination = "The search() method searches a string for a value and returns the index position of the match.",
                        codeExample = "let msg = 'Locate the bug';\nconsole.log(msg.search('bug'));",
                        afterCodeEplainations = "If the word is found, it returns the index; if not found, it returns -1."
                    ),
                    Headline(
                        headline = "Trimming a String",
                        explaination = "The trim() method removes whitespace from both ends of a string.",
                        codeExample = "let dirty = '   root   ';\nconsole.log(dirty.trim());",
                        afterCodeEplainations = "This is very useful for cleaning up user input or form data."
                    ),
                    Headline(
                        headline = "Converting Case",
                        explaination = "Use toUpperCase() and toLowerCase() to change the casing of the entire string.",
                        codeExample = "let cmd = 'sudo';\nconsole.log(cmd.toUpperCase());",
                        afterCodeEplainations = "The original string remains unchanged; the method returns a new modified string."
                    )
                )
            ),
            Subtopic(
                sutopicId = 34,
                questions = listOf(
                    QuizQuestion("How many types of numbers does JavaScript have?", listOf("One (64-bit float)", "Two (Int and Float)", "Three", "Four"), 0),
                    QuizQuestion("What does NaN stand for?", listOf("No Assigned Number", "Not a Number", "Number and Null", "New ASCII Number"), 1),
                    QuizQuestion("What is the result of 100 / 'Apple'?", listOf("0", "Error", "NaN", "100Apple"), 2),
                    QuizQuestion("How do you write a Hexadecimal number in JS?", listOf("Hex(FF)", "#FF", "0xFF", "16xFF"), 2),
                    QuizQuestion("What is the result of '100' / '10'?", listOf("'10'", "10", "NaN", "10010"), 1)
                ),
                subTopicName = "JS Numbers",
                headlines = listOf(
                    Headline(
                        headline = "JS Numbers",
                        explaination = "JavaScript has only one type of number. Numbers can be written with or without decimals.",
                        codeExample = "let x = 3.14; let y = 3;",
                        afterCodeEplainations = "Unlike other languages (int, float, double), JS treats them all as 64-bit floating point numbers."
                    ),
                    Headline(
                        headline = "NaN - Not A Number",
                        explaination = "NaN is a JavaScript reserved word indicating that a number is not a legal number.",
                        codeExample = "let result = 100 / 'Apple';\nconsole.log(result);",
                        afterCodeEplainations = "Trying to do math with a non-numeric string (that isn't a digit) results in NaN."
                    ),
                    Headline(
                        headline = "isNaN() Method",
                        explaination = "You can use the global isNaN() function to determine if a value is an illegal number.",
                        codeExample = "console.log(isNaN('Hello')); // true",
                        afterCodeEplainations = "Returns true if the value is NaN, false if it is a valid number."
                    ),
                    Headline(
                        headline = "Hexadecimal Numbers",
                        explaination = "JavaScript interprets numeric constants as hexadecimal if they are preceded by 0x.",
                        codeExample = "let hex = 0xFF;\nconsole.log(hex);",
                        afterCodeEplainations = "This will output 255, which is the decimal equivalent of the hex value FF."
                    ),
                    Headline(
                        headline = "String as Numbers",
                        explaination = "If a string looks like a number, JS will try to convert it automatically in most math operations (except +).",
                        codeExample = "let res = '100' / '10';\nconsole.log(res);",
                        afterCodeEplainations = "The division operator converts the strings to numbers. Note that '10' + 10 would result in '1010' (string concatenation)."
                    )
                )
            ),
            Subtopic(
                sutopicId =35,
                subTopicName = "JS Number Methods",
                headlines = listOf(
                    Headline(
                        headline = "JS Number Methods",
                        explaination ="Explain",

                        ),
                    Headline(
                        headline = "The Number.isInteger() Method",
                        explaination ="Explain" ,
                        tip = "give tip",
                        codeExample = "give example",
                        afterCodeEplainations = "give explanation..."
                    ),

                    Headline(
                        headline = "The isNaN() Method",
                        explaination = "Give explanation",
                        codeExample = "",
                        afterCodeEplainations = ""
                    ),

                    Headline(
                        headline = "The parseInt() Method",
                        explaination ="Explain",
                        codeExample = "code example",
                        afterCodeEplainations = "code after"
                    ),

                    Headline(
                        headline = "The parseFloat() Method",
                        explaination ="Explain",
                        codeExample = "code example",
                        afterCodeEplainations = "code after"
                    ),
                    Headline(
                        headline = "The toFixed() Method",
                        explaination ="Explain",
                        codeExample = "code example",
                        afterCodeEplainations = "code after"
                    ),

                    Headline(
                        headline = "The toExponential() Method",
                        explaination ="Explain",
                        codeExample = "code example",
                        afterCodeEplainations = "code after"
                    ),
                    Headline(
                        headline = "The toString() Method",

                        explaination ="Explain",
                        codeExample = "code example",
                        afterCodeEplainations = "code after"
                    ),
                    Headline(
                        headline = "NUMBER Properties",

                        explaination ="Explain",
                        tip = "give tip",
                        codeExample = "code example",
                        afterCodeEplainations = "code after"
                    ),






                    )
            ),
            Subtopic(
                sutopicId = 35,
                questions = listOf(
                    QuizQuestion("Which method checks if a value is exactly an integer?", listOf("isNaN()", "isInteger()", "Number.isInteger()", "parseInt()"), 2),
                    QuizQuestion("What does parseInt('123px') return?", listOf("NaN", "123", "123px", "0"), 1),
                    QuizQuestion("How do you format a number to 2 decimal places?", listOf("toFixed(2)", "toString(2)", "toExponential(2)", "Math.round(2)"), 0),
                    QuizQuestion("What does toString(16) do to a number?", listOf("Adds 16 to it", "Converts it to a Hexadecimal string", "Multiplies it by 16", "Checks if it is 16"), 1),
                    QuizQuestion("What property represents the largest possible number in JS?", listOf("MAX_LIMIT", "INFINITY", "Number.MAX_VALUE", "Number.TOP"), 2)
                ),
                subTopicName = "JS Number Methods",
                headlines = listOf(

                    Headline(
                        headline = "JS Number Methods",
                        explaination = "JavaScript provides a variety of methods to work with numbers, such as checking, converting, formatting, and performing operations."
                    ),

                    Headline(
                        headline = "The Number.isInteger() Method",
                        explaination = "This method checks if a value is an integer.",
                        tip = "Use this to validate that a number has no fractional part.",
                        codeExample = """
console.log(Number.isInteger(10));     // true
console.log(Number.isInteger(10.5));   // false
console.log(Number.isInteger("10"));   // false
"""
                    ),

                    Headline(
                        headline = "The isNaN() Method",
                        explaination = "Checks whether a value is NaN (Not a Number). Unlike the global isNaN(), it does not coerce the value.",
                        codeExample = """
console.log(Number.isNaN(NaN));        // true
console.log(Number.isNaN("Hello"));    // false
"""
                    ),

                    Headline(
                        headline = "The parseInt() Method",
                        explaination = "Converts a string to an integer. It ignores trailing characters that are not numbers.",
                        codeExample = """
console.log(parseInt("123"));      // 123
console.log(parseInt("123px"));    // 123
console.log(parseInt("px123"));    // NaN
"""
                    ),

                    Headline(
                        headline = "The parseFloat() Method",
                        explaination = "Converts a string to a floating-point number.",
                        codeExample = """
console.log(parseFloat("3.14"));     // 3.14
console.log(parseFloat("3.14abc"));  // 3.14
"""
                    ),

                    Headline(
                        headline = "The toFixed() Method",
                        explaination = "Formats a number using fixed-point notation and returns a string.",
                        codeExample = """
let num = 3.14159;
console.log(num.toFixed(2));  // "3.14"
console.log(num.toFixed(0));  // "3"
"""
                    ),

                    Headline(
                        headline = "The toExponential() Method",
                        explaination = "Returns a string representing the number in exponential notation.",
                        codeExample = """
let num = 12345;
console.log(num.toExponential(2));  // "1.23e+4"
"""
                    ),

                    Headline(
                        headline = "The toString() Method",
                        explaination = "Converts a number to a string in a specified base (default is base 10).",
                        codeExample = """
let num = 255;
console.log(num.toString());    // "255"
console.log(num.toString(16));  // "ff" (hexadecimal)
"""
                    ),

                    Headline(
                        headline = "NUMBER Properties",
                        explaination = "JavaScript numbers have useful properties for constants and limits, such as MAX_VALUE, MIN_VALUE, POSITIVE_INFINITY, NEGATIVE_INFINITY, and NaN.",
                        tip = "Use these properties to handle edge cases in calculations.",
                        codeExample = """
console.log(Number.MAX_VALUE);   // 1.7976931348623157e+308
console.log(Number.MIN_VALUE);   // 5e-324
console.log(Number.POSITIVE_INFINITY); // Infinity
console.log(Number.NEGATIVE_INFINITY); // -Infinity
console.log(Number.NaN);         // NaN
"""
                    )

                )
            )
            ,
            Subtopic(
                sutopicId = 36,
                questions = listOf(
                    QuizQuestion("What is the data type of an array when checked with 'typeof'?", listOf("array", "list", "object", "undefined"), 2),
                    QuizQuestion("Which method adds a new element to the END of an array?", listOf("unshift()", "push()", "pop()", "shift()"), 1),
                    QuizQuestion("How do you access the very last item of an array 'arr'?", listOf("arr[last]", "arr[arr.length]", "arr[arr.length - 1]", "arr.end()"), 2),
                    QuizQuestion("What does .pop() do?", listOf("Adds an item", "Removes the first item", "Removes the last item", "Clears the array"), 2),
                    QuizQuestion("Which method is used to remove an item from the START of an array?", listOf("pop()", "shift()", "unshift()", "splice()"), 1)
                ),
                subTopicName = "JS Arrays",
                headlines = listOf(

                    Headline(
                        headline = "JS Arrays",
                        explaination = "Arrays in JavaScript are used to store multiple values in a single variable. Arrays are zero-indexed and can hold elements of any type.",
                        codeExample = """
let fruits = ["Apple", "Banana", "Cherry"];
console.log(fruits);  // ["Apple", "Banana", "Cherry"]
"""
                    ),

                    Headline(
                        headline = "Creating Arrays",
                        explaination = "You can create arrays using array literals or the Array constructor.",
                        tip = "Array literals are preferred for simplicity and readability.",
                        codeExample = """
let numbers = [1, 2, 3, 4];
let colors = new Array("Red", "Green", "Blue");
console.log(numbers);
console.log(colors);
"""
                    ),

                    Headline(
                        headline = "Access an Array Item",
                        explaination = "Access array elements using their index. Indexing starts from 0.",
                        codeExample = """
let fruits = ["Apple", "Banana", "Cherry"];
console.log(fruits[0]);  // "Apple"
console.log(fruits[2]);  // "Cherry"
"""
                    ),

                    Headline(
                        headline = "Add Items to an Array",
                        explaination = "You can add items using push() (end), unshift() (start), or by assigning to a specific index.",
                        codeExample = """
let fruits = ["Apple", "Banana"];
fruits.push("Cherry");    // Add to end
fruits.unshift("Mango");  // Add to start
fruits[4] = "Orange";     // Add by index
console.log(fruits);      // ["Mango","Apple","Banana","Cherry", "Orange"]
"""
                    ),

                    Headline(
                        headline = "Remove Items from an Array",
                        explaination = "Use pop() to remove the last item, shift() to remove the first, or splice() to remove at any index.",
                        tip = "splice() can also be used to replace items while removing.",
                        codeExample = """
let fruits = ["Mango","Apple","Banana","Cherry","Orange"];
fruits.pop();      // Removes "Orange"
fruits.shift();    // Removes "Mango"
fruits.splice(1,1); // Removes 1 item at index 1 ("Banana")
console.log(fruits); // ["Apple", "Cherry"]
"""
                    ),

                    Headline(
                        headline = "Get the Length of an Array",
                        explaination = "Use the length property to determine the number of elements in an array.",
                        codeExample = """
let fruits = ["Apple", "Banana", "Cherry"];
console.log(fruits.length);  // 3
"""
                    ),

                    Headline(
                        headline = "Access the Last Item",
                        explaination = "Use array length to access the last element dynamically.",
                        tip = "Index of the last item = array.length - 1",
                        codeExample = """
let fruits = ["Apple", "Banana", "Cherry"];
console.log(fruits[fruits.length - 1]);  // "Cherry"
"""
                    ),

                    Headline(
                        headline = "Loop Over an Array",
                        explaination = "You can iterate arrays using for loops, for...of loops, or array methods like forEach().",
                        codeExample = """
let fruits = ["Apple", "Banana", "Cherry"];
for (let i = 0; i < fruits.length; i++) {
  console.log(fruits[i]);
}

for (let fruit of fruits) {
  console.log(fruit);
}
"""
                    ),

                    Headline(
                        headline = "Arrays are Objects",
                        explaination = "In JavaScript, arrays are special objects with numbered indexes and built-in methods.",
                        tip = "You can access array methods and properties because arrays inherit from Array.prototype.",
                        codeExample = """
let fruits = ["Apple", "Banana"];
console.log(typeof fruits);         // "object"
console.log(Array.isArray(fruits)); // true
"""
                    )

                )
            )
            ,

            Subtopic(
                sutopicId = 37,
                questions = listOf(
                    QuizQuestion("Which method converts an array to a string with a custom separator?", listOf("toString()", "join()", "split()", "concat()"), 1),
                    QuizQuestion("How do you merge two arrays into one?", listOf("arr1.merge(arr2)", "arr1.combine(arr2)", "arr1.concat(arr2)", "arr1.push(arr2)"), 2),
                    QuizQuestion("Which method returns true if an array contains a specific value?", listOf("indexOf()", "search()", "includes()", "find()"), 2),
                    QuizQuestion("What does .split(',') do to a string?", listOf("Deletes the commas", "Converts it into an array", "Joins it with another string", "Reverses it"), 1),
                    QuizQuestion("What is the effect of setting 'array.length = 0'?", listOf("It creates an error", "It sets all values to zero", "It clears/empties the array", "It does nothing"), 2)
                ),
                subTopicName = "JS Array Methods",
                headlines = listOf(

                    Headline(
                        headline = "JS Array Methods",
                        explaination = "JavaScript arrays come with built-in methods that make tasks like adding, removing, searching, and transforming elements easier.",
                    ),

                    Headline(
                        headline = "The forEach() Method",
                        explaination = "Executes a provided function once for each array element.",
                        tip = "Use forEach when you want to perform side effects; it does not return a new array.",
                        codeExample = """
let fruits = ["Apple", "Banana", "Cherry"];
fruits.forEach(function(fruit) {
  console.log(fruit);
});
// Apple
// Banana
// Cherry
"""
                    ),

                    Headline(
                        headline = "Arrays to Strings",
                        explaination = "You can convert arrays to strings using the toString() or join() methods.",
                        codeExample = """
let fruits = ["Apple", "Banana", "Cherry"];
console.log(fruits.toString());    // "Apple,Banana,Cherry"
console.log(fruits.join(" - "));   // "Apple - Banana - Cherry"
"""
                    ),

                    Headline(
                        headline = "Strings to Arrays",
                        explaination = "Use the split() method on strings to create arrays.",
                        codeExample = """
let text = "Apple,Banana,Cherry";
let fruits = text.split(",");
console.log(fruits); // ["Apple", "Banana", "Cherry"]
"""
                    ),

                    Headline(
                        headline = "Merging Arrays",
                        explaination = "Use concat() or the spread operator (...) to merge arrays.",
                        codeExample = """
let arr1 = [1,2];
let arr2 = [3,4];
let merged = arr1.concat(arr2);
let merged2 = [...arr1, ...arr2];
console.log(merged);   // [1,2,3,4]
console.log(merged2);  // [1,2,3,4]
"""
                    ),

                    Headline(
                        headline = "Searching an Item",
                        explaination = "Use indexOf(), lastIndexOf(), or includes() to search for elements in an array.",
                        tip = "includes() returns a boolean, indexOf() returns the index or -1 if not found.",
                        codeExample = """
let fruits = ["Apple","Banana","Cherry"];
console.log(fruits.indexOf("Banana")); // 1
console.log(fruits.includes("Mango")); // false
"""
                    ),

                    Headline(
                        headline = "Slicing an Array",
                        explaination = "Use slice() to extract a portion of an array without modifying the original array.",
                        tip = "slice(start, end) extracts up to but not including 'end' index.",
                        codeExample = """
let fruits = ["Apple","Banana","Cherry","Mango"];
let newFruits = fruits.slice(1,3);
console.log(newFruits); // ["Banana","Cherry"]
"""
                    ),

                    Headline(
                        headline = "Splicing an Array",
                        explaination = "Use splice() to add, remove, or replace elements in an array.",
                        codeExample = """
let fruits = ["Apple","Banana","Cherry"];
fruits.splice(1,1,"Mango"); // Remove 1 at index 1 and add "Mango"
console.log(fruits); // ["Apple","Mango","Cherry"]
"""
                    ),

                    Headline(
                        headline = "Removing an Array",
                        explaination = "To clear an array, you can set its length to 0 or assign an empty array.",
                        codeExample = """
let fruits = ["Apple","Banana"];
fruits.length = 0;
console.log(fruits); // []
"""
                    ),

                    Headline(
                        headline = "Replacing an Item's Value",
                        explaination = "You can replace an array element by directly assigning a new value to its index.",
                        codeExample = """
let fruits = ["Apple","Banana","Cherry"];
fruits[1] = "Mango";
console.log(fruits); // ["Apple","Mango","Cherry"]
"""
                    )

                )
            )
            ,
            Subtopic(
                sutopicId = 38,
                questions = listOf(
                    QuizQuestion("What is the default behavior of .sort() without a compare function?", listOf("Sorts numbers correctly", "Sorts elements as strings (Unicode)", "Sorts randomly", "Does nothing"), 1),
                    QuizQuestion("What is the correct compare function for ascending numerical sort?", listOf("(a,b) => a + b", "(a,b) => b - a", "(a,b) => a - b", "(a,b) => a * b"), 2),
                    QuizQuestion("What happens if you sort [3, 12, 5] without a function?", listOf("[3, 5, 12]", "[12, 3, 5]", "[5, 3, 12]", "[12, 5, 3]"), 1),
                    QuizQuestion("Which method reverses the order of elements in place?", listOf("backwards()", "flip()", "reverse()", "sortDesc()"), 2),
                    QuizQuestion("How do you find the highest number in a numerically sorted array?", listOf("arr[0]", "arr[arr.length - 1]", "arr.max()", "arr.highest()"), 1)
                ),
                subTopicName = "JS Array Sorting",
                headlines = listOf(

                    Headline(
                        headline = "JS Array Sorting",
                        explaination = "JavaScript arrays can be sorted using built-in methods to arrange elements in a specific order.",
                    ),

                    Headline(
                        headline = "The sort() Method",
                        explaination = "The sort() method sorts the elements of an array in place and returns the sorted array as a string by default, based on Unicode code points.",
                        tip = "For numbers, always provide a compare function, otherwise elements are sorted as strings.",
                        codeExample = """
let fruits = ["Banana","Apple","Cherry"];
fruits.sort();
console.log(fruits); // ["Apple","Banana","Cherry"]
"""
                    ),

                    Headline(
                        headline = "The Compare Function",
                        explaination = "A compare function defines the sort order. It takes two arguments (a, b) and returns a number: negative, zero, or positive.",
                        codeExample = """
let numbers = [40,100,1,5,25,10];
numbers.sort(function(a,b){ return a - b; }); // Ascending
console.log(numbers); // [1,5,10,25,40,100]

numbers.sort(function(a,b){ return b - a; }); // Descending
console.log(numbers); // [100,40,25,10,5,1]
"""
                    ),

                    Headline(
                        headline = "Sorting Numbers",
                        explaination = "Sorting numbers without a compare function may give incorrect results because elements are treated as strings.",
                        codeExample = """
let numbers = [3,12,5,25];
numbers.sort();
console.log(numbers); // [12,25,3,5] <- Wrong for numbers
"""
                    ),

                    Headline(
                        headline = "Get the Highest or Lowest Value",
                        explaination = "After sorting numerically, the first element is the lowest and the last is the highest.",
                        codeExample = """
let numbers = [10,5,20,8];
numbers.sort((a,b)=>a-b);
console.log("Lowest:", numbers[0]); // 5
console.log("Highest:", numbers[numbers.length-1]); // 20
"""
                    ),

                    Headline(
                        headline = "Sorting an Array of Objects",
                        explaination = "Use sort() with a compare function to sort objects based on a property.",
                        tip = "Always return a negative, zero, or positive value from the compare function.",
                        codeExample = """
let items = [
  {name:"Apple", price:50},
  {name:"Banana", price:30},
  {name:"Cherry", price:40}
];
items.sort((a,b) => a.price - b.price);
console.log(items);
/*
[
  {name:"Banana", price:30},
  {name:"Cherry", price:40},
  {name:"Apple", price:50}
]
*/
"""
                    ),

                    Headline(
                        headline = "Reversing an Array",
                        explaination = "Use the reverse() method to reverse the order of elements in an array.",
                        codeExample = """
let fruits = ["Apple","Banana","Cherry"];
fruits.reverse();
console.log(fruits); // ["Cherry","Banana","Apple"]
"""
                    )

                )
            )
            ,


            Subtopic(
                sutopicId = 39,
                subTopicName = "JS Array Iteration",
                questions = listOf(
                    QuizQuestion("Which method creates a NEW array by transforming every element?", listOf("forEach()", "map()", "filter()", "slice()"), 1),
                    QuizQuestion("Which method is best for extracting only elements that meet a condition?", listOf("map()", "forEach()", "filter()", "concat()"), 2),
                    QuizQuestion("What is a major limitation of forEach() compared to a for loop?", listOf("It is slower", "It cannot use the index", "You cannot 'break' out of it", "It only works with numbers"), 2),
                    QuizQuestion("What is the output of [1, 2].map(x => x * 2)?", listOf("[1, 2]", "[2, 4]", "3", "[1, 2, 2, 4]"), 1),
                    QuizQuestion("When should you use a classic 'for' loop?", listOf("When you don't care about the index", "When you need to use break or continue", "Only for strings", "Never, it is deprecated"), 1)
                ),
                headlines = listOf(

                    Headline(
                        headline = "JS Array Iteration",
                        explaination = "JavaScript provides several ways to iterate over arrays to access or manipulate each element."
                    ),

                    Headline(
                        headline = "Using for Loop",
                        explaination = "The classic for loop allows you to iterate over array indices manually.",
                        tip = "Use a standard for loop when you need the index or want to break/continue.",
                        codeExample = """
let fruits = ["Apple","Banana","Cherry"];
for(let i = 0; i < fruits.length; i++){
    console.log(fruits[i]);
}
// Output: Apple, Banana, Cherry
"""
                    ),

                    Headline(
                        headline = "Using forEach() Method",
                        explaination = "The forEach() method executes a provided function once for each array element. It is simpler than a for loop but cannot break out of the loop.",
                        codeExample = """
let fruits = ["Apple","Banana","Cherry"];
fruits.forEach(function(item){
    console.log(item);
});
// Output: Apple, Banana, Cherry
"""
                    ),

                    Headline(
                        headline = "Using map() Method",
                        explaination = "The map() method creates a new array by applying a function to each element of the original array.",
                        tip = "Use map() when you want to transform array elements into a new array.",
                        codeExample = """
let numbers = [1,2,3,4];
let squares = numbers.map(num => num * num);
console.log(squares); // [1,4,9,16]
"""
                    ),

                    Headline(
                        headline = "Using filter() Method",
                        explaination = "The filter() method creates a new array with all elements that pass a test implemented by the provided function.",
                        tip = "Use filter() to extract elements that meet certain conditions.",
                        codeExample = """
let numbers = [10,15,20,25];
let over15 = numbers.filter(num => num > 15);
console.log(over15); // [20,25]
"""
                    )

                )
            )
            ,
            Subtopic(
                sutopicId = 310,
                questions = listOf(
                    QuizQuestion("Which method rounds 4.2 UP to 5?", listOf("Math.floor()", "Math.round()", "Math.ceil()", "Math.abs()"), 2),
                    QuizQuestion("What does Math.floor(-4.8) return?", listOf("-4", "-5", "4", "5"), 1),
                    QuizQuestion("Which method is used to find the square root of a number?", listOf("Math.pow()", "Math.sqrt()", "Math.cbrt()", "Math.root()"), 1),
                    QuizQuestion("What is the result of Math.max(10, 20, 5)?", listOf("5", "10", "20", "NaN"), 2),
                    QuizQuestion("How do you calculate 5 squared (5 to the power of 2) using Math?", listOf("Math.sqrt(5, 2)", "Math.pow(5, 2)", "Math.exp(5)", "Math.max(5, 2)"), 1),
                    QuizQuestion("What is the absolute value of -7 (Math.abs(-7))?", listOf("-7", "0", "7", "1"), 2)
                ),
                subTopicName = "JS Math Object",
                headlines = listOf(

                    Headline(
                        headline = "JS Math Object",
                        explaination = "The Math object in JavaScript provides properties and methods for mathematical constants and functions. It is not a function object, so it cannot be instantiated."
                    ),

                    Headline(
                        headline = "The ceil() Method",
                        explaination = "Math.ceil() rounds a number **up** to the nearest integer.",
                        codeExample = """
console.log(Math.ceil(4.2)); // 5
console.log(Math.ceil(-4.2)); // -4
"""
                    ),

                    Headline(
                        headline = "The floor() Method",
                        explaination = "Math.floor() rounds a number **down** to the nearest integer.",
                        codeExample = """
console.log(Math.floor(4.8)); // 4
console.log(Math.floor(-4.8)); // -5
"""
                    ),

                    Headline(
                        headline = "The round() Method",
                        explaination = "Math.round() rounds a number to the nearest integer. Numbers with a decimal of 0.5 or higher are rounded up.",
                        codeExample = """
console.log(Math.round(4.5)); // 5
console.log(Math.round(4.4)); // 4
"""
                    ),

                    Headline(
                        headline = "The sqrt() Method",
                        explaination = "Math.sqrt() returns the square root of a number.",
                        codeExample = """
console.log(Math.sqrt(16)); // 4
console.log(Math.sqrt(25)); // 5
"""
                    ),

                    Headline(
                        headline = "The cbrt() Method",
                        explaination = "Math.cbrt() returns the cube root of a number.",
                        codeExample = """
console.log(Math.cbrt(27)); // 3
console.log(Math.cbrt(64)); // 4
"""
                    ),

                    Headline(
                        headline = "The abs() Method",
                        explaination = "Math.abs() returns the absolute value of a number.",
                        codeExample = """
console.log(Math.abs(-7)); // 7
console.log(Math.abs(7));  // 7
"""
                    ),

                    Headline(
                        headline = "The max() Method",
                        explaination = "Math.max() returns the largest of zero or more numbers.",
                        codeExample = """
console.log(Math.max(10, 20, 5)); // 20
"""
                    ),

                    Headline(
                        headline = "The min() Method",
                        explaination = "Math.min() returns the smallest of zero or more numbers.",
                        codeExample = """
console.log(Math.min(10, 20, 5)); // 5
"""
                    ),

                    Headline(
                        headline = "The pow() Method",
                        explaination = "Math.pow(base, exponent) returns the base raised to the exponent power.",
                        codeExample = """
console.log(Math.pow(2,3)); // 8
console.log(Math.pow(5,2)); // 25
"""
                    ),

                    Headline(
                        headline = "The Math Properties",
                        explaination = "Math object also provides useful constants such as Math.PI, Math.E, Math.LN2, and more.",
                        tip = "Use Math.PI for accurate π calculations instead of hardcoding 3.14.",
                        codeExample = """
console.log(Math.PI); // 3.141592653589793
console.log(Math.E);  // 2.718281828459045
"""
                    )

                )
            )
            ,
            Subtopic(
                sutopicId = 311,
                questions = listOf(
                    QuizQuestion("What range of numbers does Math.random() return?", listOf("0 to 10", "1 to 100", "0 (inclusive) to 1 (exclusive)", "Any integer"), 2),
                    QuizQuestion("How do you get a random integer from 0 to 9?", listOf("Math.random() * 9", "Math.floor(Math.random() * 10)", "Math.ceil(Math.random() * 9)", "Math.random(0, 9)"), 1),
                    QuizQuestion("Where is the recommended place to put <script> tags for better performance?", listOf("Inside the <head>", "At the very beginning of <body>", "At the end of the <body>", "Outside the <html> tag"), 2),
                    QuizQuestion("What is an advantage of using External JS files?", listOf("They run faster than inline", "They separate logic from structure and are reusable", "They don't require a browser", "They make the file size larger"), 1),
                    QuizQuestion("Which attribute is used to link an external JS file?", listOf("href", "link", "src", "rel"), 2)
                ),
                subTopicName = "JS Math Random",
                headlines = listOf(

                    Headline(
                        headline = "JS Math Random",
                        explaination = "The Math.random() method returns a pseudo-random floating-point number between 0 (inclusive) and 1 (exclusive)."
                    ),

                    Headline(
                        headline = "The random() Method",
                        explaination = "Math.random() generates a random number. To use it effectively, you can scale it to a desired range.",
                        tip = "Multiply by the range and use Math.floor() to get an integer.",
                        codeExample = """
console.log(Math.random()); // e.g., 0.123456789
console.log(Math.floor(Math.random() * 10)); // random integer from 0 to 9
"""
                    ),

                    Headline(
                        headline = "Get Random Integer Between Two Numbers",
                        explaination = "To get a random integer between min and max (inclusive), use this formula:",
                        codeExample = """
function getRandomInt(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

console.log(getRandomInt(1, 10)); // random integer from 1 to 10
"""
                    ),

                    Headline(
                        headline = "JS body vs head",
                        explaination = "Placing your <script> tag in the <head> runs scripts before the HTML body loads, which can cause errors if elements aren't available. Placing it at the end of <body> ensures the DOM is ready.",
                        codeExample = """
<!-- In head -->
<head>
  <script src='script.js'></script>
</head>

<!-- At end of body (recommended) -->
<body>
  ...
  <script src='script.js'></script>
</body>
"""
                    ),

                    Headline(
                        headline = "External JS",
                        explaination = "External JavaScript files allow you to separate code from HTML. Use the src attribute in the <script> tag.",
                        codeExample = """
<!-- HTML -->
<script src="myscript.js"></script>

<!-- myscript.js -->
console.log('Hello from external JS!');
"""
                    ),

                    Headline(
                        headline = "Inline vs External JS",
                        explaination = "Inline JS is written inside <script> tags in the HTML file. External JS is in a separate .js file. External JS promotes reusability and cleaner HTML.",
                        tip = "Use external JS for larger projects, inline JS for quick tests or small scripts.",
                        codeExample = """
<!-- Inline -->
<script>
    console.log('Inline JS');
</script>
"""
                    )

                )
            )

            )



    ),

    NoteModule(
        topic = "JS Control Flow",
        topicId = 4,
        subtopics = listOf(

            Subtopic(
                sutopicId = 41,
                questions = listOf(
                    QuizQuestion("Which statement executes code only when a condition is true?", listOf("else", "if", "switch", "while"), 1),
                    QuizQuestion("What does the 'else' block do in an if...else statement?", listOf("Checks a new condition", "Runs if the if-condition is false", "Loops the code", "Exits the script"), 1),
                    QuizQuestion("In an 'else if' chain, how many blocks can execute?", listOf("All of them", "None", "Only the first true one", "Two blocks"), 2),
                    QuizQuestion("Is it possible to put an 'if' statement inside another 'if' statement?", listOf("Yes, it is called nesting", "No, it causes a SyntaxError", "Only if using Linux", "Only in the head section"), 0),
                    QuizQuestion("What does the ternary operator 'condition ? expr1 : expr2' represent?", listOf("A loop", "A shorthand for if...else", "A mathematical calculation", "A type of array"), 1)
                ),
                subTopicName = "The if...else Statement",
                headlines = listOf(

                    Headline(
                        headline = "The if...else Statement",
                        explaination = "The if...else statement allows JavaScript to make decisions by executing different blocks of code depending on whether a condition evaluates to true or false."
                    ),

                    Headline(
                        headline = "The if Statement",
                        explaination = "The if statement executes a block of code only when the specified condition is true.",
                        codeExample = """
                        let age = 20;

                        if (age >= 18) {
                          console.log("You are an adult");
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "Since the condition is true, the message is printed to the console."
                    ),

                    Headline(
                        explaination = "If the condition evaluates to false, the code inside the if block will not execute.",
                        codeExample = """
                        let temperature = 15;

                        if (temperature > 25) {
                          console.log("It is hot today");
                        }
                    """.trimIndent()
                    ),

                    Headline(
                        headline = "The if...else Statement",
                        explaination = "The else block runs when the if condition evaluates to false.",
                        codeExample = """
                        let score = 40;

                        if (score >= 50) {
                          console.log("You passed");
                        } else {
                          console.log("You failed");
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "Because the score is less than 50, the else block executes."
                    ),

                    Headline(
                        explaination = "JavaScript allows multiple conditions using logical operators.",
                        codeExample = """
                        let number = 10;

                        if (number > 0 && number < 20) {
                          console.log("Number is between 1 and 19");
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "Both conditions must be true for the message to display."
                    ),

                    Headline(
                        explaination = "An if statement can be nested inside another if statement.",
                        codeExample = """
                        let user = "admin";
                        let password = "1234";

                        if (user === "admin") {
                          if (password === "1234") {
                            console.log("Access granted");
                          }
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "The inner if runs only when the outer condition is true."
                    ),

                    Headline(
                        explaination = "Braces can be omitted when there is only one statement, though using braces is recommended.",
                        codeExample = """
                        let loggedIn = true;

                        if (loggedIn)
                          console.log("Welcome back!");
                    """.trimIndent()
                    ),

                    Headline(
                        headline = "The else if Statement",
                        explaination = "The else if statement is used to check multiple conditions sequentially.",
                        tip = "JavaScript checks conditions from top to bottom and stops at the first true condition.",
                        codeExample = """
                        let marks = 72;

                        if (marks >= 90) {
                          console.log("Grade A");
                        } else if (marks >= 70) {
                          console.log("Grade B");
                        } else {
                          console.log("Grade C");
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "Since marks are 72, the else if block executes."
                    ),

                    Headline(
                        explaination = "Only one block in an if...else if chain will execute.",
                        codeExample = """
                        let value = 5;

                        if (value > 10) {
                          console.log("Greater than 10");
                        } else if (value > 3) {
                          console.log("Greater than 3");
                        } else {
                          console.log("3 or less");
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "The second condition matches and runs."
                    ),

                    Headline(
                        explaination = "Conditions should be written clearly to improve readability.",
                        codeExample = """
                        let isMember = true;
                        let fee = isMember ? 10 : 20;

                        console.log(fee);
                    """.trimIndent()
                    )
                )
            ),
            Subtopic(
                questions = listOf(
                    QuizQuestion("Which operator does the switch statement use for case matching?", listOf("==", "===", "=", "!="), 1),
                    QuizQuestion("What happens if you omit the 'break' keyword in a case?", listOf("The script crashes", "Execution falls through to the next case", "The default case runs immediately", "It skips the next case"), 1),
                    QuizQuestion("When is the 'default' clause executed?", listOf("Always", "Only if no other case matches", "At the start of the switch", "Only if there is an error"), 1),
                    QuizQuestion("Switch is often a cleaner alternative to which structure?", listOf("For loops", "Multiple else if statements", "Try...catch", "Variable declarations"), 1),
                    QuizQuestion("Can a switch statement handle strings as case values?", listOf("No, only numbers", "Yes", "Only if they are converted to numbers", "Only in external files"), 1)
                ),
                sutopicId = 42,
                subTopicName = "The Switch Statement",
                headlines = listOf(

                    Headline(
                        headline = "The Switch Statement",
                        explaination = "The switch statement is used to perform different actions based on the value of a variable."
                    ),

                    Headline(
                        headline = "JS Switch Statement",
                        explaination = "Switch is often used as a cleaner alternative to multiple else if statements.",
                        codeExample = """
                        let day = 3;

                        switch (day) {
                          case 1:
                            console.log("Monday");
                            break;
                          case 2:
                            console.log("Tuesday");
                            break;
                          case 3:
                            console.log("Wednesday");
                            break;
                          default:
                            console.log("Invalid day");
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "The case matching value 3 runs and prints Wednesday."
                    ),

                    Headline(
                        explaination = "Without a break statement, execution continues to the next case.",
                        codeExample = """
                        let x = 1;

                        switch (x) {
                          case 1:
                            console.log("One");
                          case 2:
                            console.log("Two");
                        }
                    """.trimIndent()
                    ),

                    Headline(
                        headline = "The Switch Statement",
                        explaination = "Each case is compared using strict equality (===).",
                        codeExample = """
                        let value = "10";

                        switch (value) {
                          case 10:
                            console.log("Number");
                            break;
                          case "10":
                            console.log("String");
                            break;
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "Switch compares both value and type."
                    ),

                    Headline(
                        explaination = "Switch improves readability when dealing with fixed values.",
                        codeExample = """
                        let role = "admin";

                        switch (role) {
                          case "admin":
                            console.log("Full access");
                            break;
                          case "user":
                            console.log("Limited access");
                            break;
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "The correct access level is displayed."
                    ),

                    Headline(
                        headline = "The Break Keyword",
                        explaination = "The break keyword exits the switch block.",
                        codeExample = """
                        let color = "red";

                        switch (color) {
                          case "red":
                            console.log("Stop");
                            break;
                          case "green":
                            console.log("Go");
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "Break prevents fall-through."
                    ),

                    Headline(
                        headline = "The Default Clause",
                        explaination = "The default clause executes when no case matches.",
                        codeExample = """
                        let fruit = "apple";

                        switch (fruit) {
                          case "banana":
                            console.log("Yellow");
                            break;
                          default:
                            console.log("Unknown fruit");
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "Default handles unexpected values."
                    ),

                    Headline(
                        headline = "Illustrative Example",
                        explaination = "A grading system implemented using switch.",
                        codeExample = """
                        let grade = "B";

                        switch (grade) {
                          case "A":
                            console.log("Excellent");
                            break;
                          case "B":
                            console.log("Good job");
                            break;
                          default:
                            console.log("Needs improvement");
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "The matching grade message is displayed."
                    ),
                )
            ),
            Subtopic(
                sutopicId = 43,
                subTopicName = "JS For Loop",
                questions = listOf(
                    QuizQuestion("What are the three parts of a for loop header?", listOf("if, else, switch", "try, catch, finally", "initialization, condition, increment/decrement", "start, stop, pause"), 2),
                    QuizQuestion("Which part of the for loop determines if the loop should stop?", listOf("Initialization", "Condition", "Increment", "Body"), 1),
                    QuizQuestion("How do you access array elements inside a for loop?", listOf("Using the array name only", "Using the loop index (e.g., fruits[i])", "Using the 'this' keyword", "Using the 'of' keyword"), 1),
                    QuizQuestion("What is a nested for loop?", listOf("A loop that never ends", "A loop inside another loop", "A loop that runs in reverse", "A loop that uses strings"), 1),
                    QuizQuestion("To run a loop 5 times starting from i=1, what should the condition be?", listOf("i < 5", "i > 5", "i <= 5", "i == 5"), 2)
                ),
                headlines = listOf(

                    Headline(
                        headline = "JS for loop",
                        explaination = "The for loop is used to run a block of code a specific number of times."
                    ),

                    Headline(
                        explaination = "A for loop consists of initialization, condition, and increment or decrement.",
                        codeExample = """
                        for (let i = 1; i <= 5; i++) {
                          console.log("Count:", i);
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "The loop starts at 1 and runs until the condition becomes false."
                    ),

                    Headline(
                        headline = "What is a for loop",
                        explaination = "A for loop is ideal when the number of iterations is known in advance."
                    ),

                    Headline(
                        explaination = "A for loop can be used to iterate through arrays using index values.",
                        codeExample = """
                        let fruits = ["Apple", "Banana", "Mango"];

                        for (let i = 0; i < fruits.length; i++) {
                          console.log(fruits[i]);
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "Each array element is accessed using its index."
                    ),

                    Headline(
                        explaination = "For loops can also run in reverse order.",
                        codeExample = """
                        for (let i = 5; i >= 1; i--) {
                          console.log(i);
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "The loop decreases the counter value on each iteration."
                    ),

                    Headline(
                        explaination = "Nested for loops are commonly used in tables and patterns.",
                        tip = "Avoid deep nesting as it can affect performance.",
                        codeExample = """
                        for (let i = 1; i <= 3; i++) {
                          for (let j = 1; j <= 2; j++) {
                            console.log("i:", i, "j:", j);
                          }
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "The inner loop runs fully for each iteration of the outer loop."
                    )
                )
            ),
            Subtopic(
                sutopicId = 44,
                subTopicName = "JS For Of Loop",
                questions = listOf(
                    QuizQuestion("Which objects can you iterate over with a for...of loop?", listOf("Only numbers", "Iterable objects like arrays and strings", "Only objects with keys", "Only Boolean values"), 1),
                    QuizQuestion("What is the main advantage of for...of over a traditional for loop?", listOf("It is much faster", "It doesn't require managing an index", "It can reverse the array automatically", "It works only on Linux"), 1),
                    QuizQuestion("If you use for...of on the string 'Hi', how many times will it loop?", listOf("1", "2", "0", "3"), 1),
                    QuizQuestion("Does for...of provide the index of the current element by default?", listOf("Yes", "No", "Only for strings", "Only for numbers"), 1),
                    QuizQuestion("In 'for (let x of arr)', what does 'x' represent?", listOf("The index", "The current value in the array", "The total length", "The array itself"), 1)
                ),
                headlines = listOf(

                    Headline(
                        headline = "JS for...of Loop",
                        explaination = "The for...of loop iterates over iterable objects such as arrays and strings."
                    ),

                    Headline(
                        explaination = "It provides a simpler syntax compared to traditional for loops.",
                        codeExample = """
                        let colors = ["Red", "Green", "Blue"];

                        for (let color of colors) {
                          console.log(color);
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "Each iteration returns the value directly."
                    ),

                    Headline(
                        explaination = "The for...of loop is best used when the index value is not required.",
                        codeExample = ""
                    ),

                    Headline(
                        explaination = "Strings are iterable, so for...of can loop through characters.",
                        codeExample = """
                        let word = "Hello";

                        for (let char of word) {
                          console.log(char);
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "Each character of the string is printed."
                    )
                )
            ),
            Subtopic(
                sutopicId = 45,
                questions = listOf(
                    QuizQuestion("When is a while loop more useful than a for loop?", listOf("When you know exactly how many loops you need", "When the number of iterations is not known beforehand", "When working with CSS", "When you want to use the 'of' keyword"), 1),
                    QuizQuestion("What is the primary difference between while and do...while?", listOf("While runs faster", "Do...while always runs at least once", "While is for numbers only", "There is no difference"), 1),
                    QuizQuestion("What happens if the condition in a while loop never becomes false?", listOf("The program finishes early", "It creates an infinite loop", "The browser ignores it", "It deletes the variable"), 1),
                    QuizQuestion("In a while loop, where is the increment usually placed?", listOf("Inside the condition brackets", "Inside the loop body", "Before the loop starts", "After the loop ends"), 1),
                    QuizQuestion("If i = 10, does 'while (i < 5)' execute its body?", listOf("Yes, once", "No", "It throws an error", "Only in the head section"), 1)
                ),
                subTopicName = "JS While Loop",
                headlines = listOf(

                    Headline(
                        headline = "JS while Loop",
                        explaination = "The while loop executes code repeatedly as long as the condition remains true."
                    ),

                    Headline(
                        codeExample = """
                        let count = 1;

                        while (count <= 5) {
                          console.log(count);
                          count++;
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "The loop continues until the condition becomes false."
                    ),

                    Headline(
                        explaination = "While loops are useful when the number of iterations is not known beforehand.",
                        codeExample = ""
                    ),

                    Headline(
                        headline = "Looping Over an Array Using while Loop",
                        explaination = "A while loop can iterate over arrays using a counter variable.",
                        codeExample = """
                        let numbers = [10, 20, 30];
                        let index = 0;

                        while (index < numbers.length) {
                          console.log(numbers[index]);
                          index++;
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "The index increases until all elements are processed."
                    ),

                    Headline(
                        headline = "The do...while Loop",
                        explaination = "The do...while loop executes at least once before checking the condition.",
                        codeExample = """
                        let i = 1;

                        do {
                          console.log(i);
                          i++;
                        } while (i <= 3);
                    """.trimIndent(),
                        afterCodeEplainations = "The loop runs once even if the condition is initially false."
                    ),

                    Headline(
                        headline = "Looping Over an Array Using do...while Loop",
                        explaination = "This loop is useful when the code must run at least once.",
                        tip = "Ensure the condition eventually becomes false to avoid infinite loops.",
                        codeExample = """
                        let items = ["A", "B", "C"];
                        let i = 0;

                        do {
                          console.log(items[i]);
                          i++;
                        } while (i < items.length);
                    """.trimIndent(),
                        afterCodeEplainations = "Each array element is printed once."
                    )
                )
            ),
            Subtopic(
                sutopicId = 46,
                subTopicName = "JS Break and Continue",
                questions = listOf(
                    QuizQuestion("What does the 'break' statement do inside a loop?", listOf("Skips one iteration", "Exits the loop entirely", "Restarts the loop", "Pauses the loop for 1 second"), 1),
                    QuizQuestion("What does the 'continue' statement do?", listOf("Exits the loop", "Skips the current iteration and moves to the next", "Ends the script", "Resets the variable"), 1),
                    QuizQuestion("If a loop runs from 1 to 5 and has 'if(i===3) break', what is the last number printed?", listOf("5", "3", "2", "4"), 2),
                    QuizQuestion("If a loop runs from 1 to 5 and has 'if(i===3) continue', which number is missing?", listOf("1", "5", "3", "None"), 2),
                    QuizQuestion("Can 'break' be used inside a switch statement?", listOf("Yes", "No", "Only for numbers", "Only in functions"), 0)
                ),
                headlines = listOf(

                    Headline(
                        headline = "JS Break and Continue",
                        explaination = "Break and continue control the flow of loops."
                    ),

                    Headline(
                        headline = "The break Statement",
                        explaination = "The break statement immediately exits a loop.",
                        codeExample = """
                        for (let i = 1; i <= 5; i++) {
                          if (i === 3) {
                            break;
                          }
                          console.log(i);
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "The loop stops when the value reaches 3."
                    ),

                    Headline(
                        explaination = "Break is often used when a condition is met early.",
                        codeExample = ""
                    ),

                    Headline(
                        headline = "The Continue Statement",
                        explaination = "The continue statement skips the current iteration and moves to the next one.",
                        codeExample = """
                        for (let i = 1; i <= 5; i++) {
                          if (i === 3) {
                            continue;
                          }
                          console.log(i);
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "The value 3 is skipped during iteration."
                    )
                )
            ),
            Subtopic(
                sutopicId = 47,
                questions = listOf(
                    QuizQuestion("Which function executes a function once after a delay?", listOf("setInterval", "setTimeout", "clearTimeout", "wait"), 1),
                    QuizQuestion("What is the time unit used in setTimeout (e.g., 2000)?", listOf("Seconds", "Milliseconds", "Microseconds", "Nanoseconds"), 1),
                    QuizQuestion("How do you stop a repeated interval from running?", listOf("stopInterval()", "clearTimeout()", "clearInterval()", "end()"), 2),
                    QuizQuestion("What does setInterval return?", listOf("A copy of the function", "The result of the function", "An ID used to clear the interval", "Nothing"), 2),
                    QuizQuestion("What happens if you don't clear an interval that is no longer needed?", listOf("The script stops", "It can cause memory leaks and unwanted execution", "The browser closes", "It automatically stops after 1 hour"), 1)
                ),
                subTopicName = "JS Timeout and Interval",
                headlines = listOf(

                    Headline(
                        headline = "JS Timeout and Interval",
                        explaination = "JavaScript provides timing functions to execute code after delays or repeatedly."
                    ),

                    Headline(
                        explaination = "setTimeout executes a function once after a specified delay.",
                        codeExample = """
                        setTimeout(() => {
                          console.log("Executed after 2 seconds");
                        }, 2000);
                    """.trimIndent(),
                        afterCodeEplainations = "The message appears after the delay completes."
                    ),

                    Headline(
                        explaination = "JavaScript timers return an ID that can be used to cancel execution.",
                        codeExample = ""
                    ),

                    Headline(
                        codeExample = """
                        let timeoutId = setTimeout(() => {
                          console.log("This will not run");
                        }, 3000);
                    """.trimIndent(),
                        afterCodeEplainations = "The timeout ID is stored for later use."
                    ),

                    Headline(
                        headline = "Canceling a Timeout",
                        explaination = "clearTimeout stops a scheduled timeout.",
                        codeExample = """
                        clearTimeout(timeoutId);
                    """.trimIndent(),
                        afterCodeEplainations = "The scheduled function will not execute."
                    ),

                    Headline(
                        headline = "JS Interval",
                        explaination = "setInterval runs a function repeatedly after a fixed time interval.",
                        codeExample = """
                        let intervalId = setInterval(() => {
                          console.log("Running every second");
                        }, 1000);
                    """.trimIndent(),
                        afterCodeEplainations = "The function runs every second."
                    ),

                    Headline(
                        explaination = "Intervals should always be cleared when no longer needed.",
                        codeExample = """
                        clearInterval(intervalId);
                    """.trimIndent(),
                        afterCodeEplainations = "The repeated execution stops."
                    ),

                    Headline(
                        headline = "Stopping an Interval",
                        explaination = "Stopping intervals prevents memory leaks and unwanted execution.",
                        codeExample = ""
                    )
                )
            ),

            Subtopic(
                sutopicId = 48,
                questions = listOf(
                    QuizQuestion("Which block contains code that might throw an error?", listOf("catch", "try", "finally", "throw"), 1),
                    QuizQuestion("When does the 'finally' block execute?", listOf("Only if an error occurs", "Only if no error occurs", "Always, regardless of an error", "Only if the script crashes"), 2),
                    QuizQuestion("Which statement is used to create a custom error?", listOf("error", "catch", "throw", "reject"), 2),
                    QuizQuestion("What error occurs when you access a variable that hasn't been declared?", listOf("TypeError", "SyntaxError", "ReferenceError", "RangeError"), 2),
                    QuizQuestion("What does 'catch(error)' receive?", listOf("A number", "An error object containing information like the message", "The line number only", "Nothing"), 1)
                ),
                subTopicName = "JS Exception Handling",
                headlines = listOf(

                    Headline(
                        headline = "JS Exception Handling",
                        explaination = "Exception handling allows JavaScript to manage runtime errors gracefully."
                    ),

                    Headline(
                        headline = "What is an Exception",
                        explaination = "An exception is an error that occurs during program execution."
                    ),

                    Headline(
                        headline = "Catching an Exception",
                        explaination = "Exceptions can be caught to prevent program crashes."
                    ),

                    Headline(
                        headline = "The try...catch Statement",
                        explaination = "The try block contains code that may cause an error.",
                        codeExample = """
                        try {
                          let result = x + 10;
                        } catch (error) {
                          console.log("Error:", error.message);
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "The error is caught and handled safely."
                    ),

                    Headline(
                        codeExample = """
                        try {
                          JSON.parse("{invalid}");
                        } catch (e) {
                          console.log("Invalid JSON format");
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "Parsing fails and control moves to catch."
                    ),

                    Headline(
                        headline = "The throw Statement",
                        explaination = "The throw statement creates a custom error.",
                        codeExample = """
                        let age = -5;

                        if (age < 0) {
                          throw new Error("Age cannot be negative");
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "A custom error is generated."
                    ),

                    Headline(
                        codeExample = """
                        try {
                          throw new Error("Manual error");
                        } catch (e) {
                          console.log(e.message);
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "The thrown error is caught."
                    ),

                    Headline(
                        headline = "The finally Statement",
                        explaination = "The finally block executes regardless of an error.",
                        codeExample = """
                        try {
                          console.log("Try block");
                        } finally {
                          console.log("Finally block");
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "Finally always executes."
                    ),

                    Headline(
                        headline = "Illustrative Example",
                        explaination = "A complete example demonstrating try, catch, and finally.",
                        tip = "Use finally to clean up resources.",
                        codeExample = """
                        try {
                          let data = JSON.parse("{name:'John'}");
                        } catch (e) {
                          console.log("Parsing error");
                        } finally {
                          console.log("Operation completed");
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "The flow continues safely."
                    ),

                    Headline(
                        headline = "Error Objects",
                        explaination = "JavaScript provides built-in error types.",
                        codeExample = """
                        try {
                          null.test();
                        } catch (e) {
                          console.log(e.name);
                        }
                    """.trimIndent(),
                        afterCodeEplainations = "The error type is displayed."
                    ),

                    Headline(
                        headline = "RangeError",
                        explaination = "Occurs when a value is outside the allowed range.",
                        tip = "Check numeric limits carefully.",
                        codeExample = """
                        let arr = new Array(-1);
                    """.trimIndent(),
                        afterCodeEplainations = "Invalid array length causes RangeError."
                    ),

                    Headline(
                        headline = "ReferenceError",
                        explaination = "Occurs when accessing an undefined variable.",
                        tip = "Always declare variables before use.",
                        codeExample = """
                        console.log(undefinedVariable);
                    """.trimIndent(),
                        afterCodeEplainations = "The variable does not exist."
                    ),

                    Headline(
                        headline = "SyntaxError",
                        explaination = "Occurs due to invalid JavaScript syntax.",
                        tip = "Use linters to detect syntax issues early.",
                        codeExample = """
                        eval("if (true {");
                    """.trimIndent(),
                        afterCodeEplainations = "Invalid syntax triggers the error."
                    ),

                    Headline(
                        headline = "TypeError",
                        explaination = "Occurs when an operation is performed on an incorrect type.",
                        tip = "Validate data types before operations.",
                        codeExample = """
                        let num = 5;
                        num();
                    """.trimIndent(),
                        afterCodeEplainations = "A number is not callable."
                    ),

                    Headline(
                        headline = "URIError",
                        explaination = "Occurs when malformed URI functions are used.",
                        tip = "Ensure URIs are properly encoded.",
                        codeExample = """
                        decodeURI("%");
                    """.trimIndent(),
                        afterCodeEplainations = "Malformed URI causes the error."
                    )
                )
            )



        )



    ),



    NoteModule(
        topic = "JS Advanced",
        topicId=5,
        subtopics = listOf(

            Subtopic(
                sutopicId = 51,
                questions = listOf(
                    QuizQuestion("Where can a global variable be accessed in your JavaScript code?", listOf("Only inside the function it was created", "Anywhere in the code", "Only inside a loop", "Only in the head section"), 1),
                    QuizQuestion("What creates a local scope in JavaScript?", listOf("A semicolon", "A function", "A single quote", "A console.log"), 1),
                    QuizQuestion("Which keywords allow for 'Block Scope' inside curly braces {}?", listOf("var only", "let and const", "let only", "Global and Local"), 1),
                    QuizQuestion("If you declare 'let x' inside a function and 'let x' outside, which one is used inside the function?", listOf("The global x", "The local x", "Both", "It causes a crash"), 1),
                    QuizQuestion("Why are global variables generally avoided in large projects?", listOf("They are too slow", "They can be accidentally modified from anywhere, causing bugs", "They don't work in Linux", "They only hold numbers"), 1)
                ),
                subTopicName = "JS Variable Scope",
                headlines = listOf(
                    Headline(
                        headline = "JS Variable Scope",
                        explaination = "Variable scope determines where a variable is accessible in the code. JavaScript has global and local scope."
                    ),
                    Headline(
                        headline = "Global Variables",
                        explaination = "Global variables are declared outside any function or block and can be accessed anywhere in the code.",
                        codeExample = """
            let globalVar = "I am global";

            function showVar() {
              console.log(globalVar);
            }

            showVar(); // Output: I am global
        """.trimIndent(),
                        afterCodeEplainations = "The variable `globalVar` is accessible inside the function because it's declared globally."
                    ),
                    Headline(
                        explaination = "Global variables are generally avoided for large projects because they can be modified from anywhere, causing bugs.",
                        codeExample = ""
                    ),
                    Headline(
                        headline = "Local Variables",
                        explaination = "Local variables are declared inside a function or block and are only accessible there.",
                        codeExample = """
            function greet() {
              let message = "Hello!";
              console.log(message);
            }

            greet(); // Output: Hello!
            // console.log(message); // Error: message is not defined
        """.trimIndent(),
                        afterCodeEplainations = "The variable `message` is local to the function `greet` and cannot be accessed outside."
                    ),
                    Headline(
                        headline = "JS Function",
                        explaination = "Functions create a local scope. Variables declared inside a function do not affect the global scope.",
                        codeExample = """
            let name = "Alice";

            function showName() {
              let name = "Bob";
              console.log(name);
            }

            showName(); // Output: Bob
            console.log(name); // Output: Alice
        """.trimIndent(),
                        afterCodeEplainations = "The function has its own local `name` variable; the global `name` remains unchanged."
                    ),
                    Headline(
                        explaination = "Block scope is created using `let` and `const`. Variables declared inside `{}` are not accessible outside.",
                        codeExample = """
            {
              let blockVar = "Inside block";
              console.log(blockVar); // Output: Inside block
            }
            // console.log(blockVar); // Error: blockVar is not defined
        """.trimIndent(),
                        afterCodeEplainations = "Block-scoped variables prevent accidental access from outside the block."
                    )
                )
            ),

            Subtopic(
                sutopicId = 52,
                questions = listOf(
                    QuizQuestion("What is hoisting in JavaScript?", listOf("Deleting unused variables", "Moving declarations to the top of the scope", "Optimizing math calculations", "A way to join strings"), 1),
                    QuizQuestion("What is the result of logging a 'var' variable before it is declared?", listOf("ReferenceError", "undefined", "null", "5"), 1),
                    QuizQuestion("What happens if you access a 'let' variable before its declaration?", listOf("It returns undefined", "It works normally", "It throws a ReferenceError (Temporal Dead Zone)", "It returns 0"), 2),
                    QuizQuestion("Are function declarations (function myFunc(){...}) hoisted?", listOf("Yes, including the body", "No", "Only the name is hoisted", "Only in strict mode"), 0),
                    QuizQuestion("Is a function expression (const x = function(){}) hoisted like a declaration?", listOf("Yes", "No", "Only if using var", "Only on Sundays"), 1)
                ),
                subTopicName = "JS Variable Hoisting",
                headlines = listOf(
                    Headline(
                        headline = "JS Variable Hoisting",
                        explaination = "Hoisting moves variable and function declarations to the top of their scope before execution.",
                        codeExample = """
            console.log(a); // Output: undefined
            var a = 5;
        """.trimIndent(),
                        afterCodeEplainations = "`var` declarations are hoisted but not their initializations."
                    ),
                    Headline(
                        codeExample = """
            console.log(b); // Error: Cannot access 'b' before initialization
            let b = 10;
        """.trimIndent(),
                        afterCodeEplainations = "`let` and `const` are hoisted but cannot be accessed before declaration (Temporal Dead Zone)."
                    ),
                    Headline(
                        headline = "JS Initializations and Not Hoisting",
                        explaination = "Only declarations are hoisted, initializations remain in place.",
                        codeExample = ""
                    ),
                    Headline(
                        explaination = "Functions declared using `function` keyword are fully hoisted with their body.",
                        codeExample = """
            greet();

            function greet() {
              console.log("Hello!");
            }
        """.trimIndent(),
                        afterCodeEplainations = "Function declarations can be called before they appear in the code."
                    ),
                    Headline(
                        codeExample = """
            const sayHi = function() {
              console.log("Hi");
            };
            // sayHi(); // Must be called after declaration
        """.trimIndent(),
                        afterCodeEplainations = "Function expressions are not hoisted like function declarations."
                    ),
                    Headline(
                        headline = "Recommended: Declare Variables at the Top",
                        explaination = "Declaring variables at the top of their scope improves readability and avoids hoisting-related bugs."
                    )
                )
            ),

            Subtopic(
                sutopicId = 53,
                subTopicName = "JS Strict Mode",
                questions = listOf(
                    QuizQuestion("How do you enable Strict Mode in a script?", listOf("use strict;", "'use strict';", "strict = true;", "import strict;"), 1),
                    QuizQuestion("What happens in strict mode if you assign a value to an undeclared variable (x = 10)?", listOf("It creates a global variable", "It throws an error", "It ignores the line", "It creates a local variable"), 1),
                    QuizQuestion("Does strict mode allow duplicate parameter names in functions?", listOf("Yes", "No", "Only for numbers", "Only in external files"), 1),
                    QuizQuestion("What is one benefit of Strict Mode?", listOf("Makes the code colorful", "Helps catch common coding mistakes and unsafe actions", "Increases the font size", "Allows deleting the object prototype"), 1),
                    QuizQuestion("Can strict mode be applied to a single function only?", listOf("No, it must be global", "Yes, by placing it at the top of the function body", "Only if the function is hoisted", "Only using let"), 1)
                ),
                headlines = listOf(
                    Headline(
                        headline = "JS Strict Mode",
                        explaination = "Strict mode enforces stricter parsing and error handling in JavaScript."
                    ),
                    Headline(
                        headline = "Invoking Strict Mode",
                        explaination = "Strict mode can be enabled by adding `'use strict';` at the beginning of a script or function.",
                        tip = "It helps catch common coding mistakes like undeclared variables.",
                        codeExample = """
            'use strict';
            x = 3.14; // Error: x is not defined
        """.trimIndent(),
                        afterCodeEplainations = "Without strict mode, this would have created a global variable."
                    ),
                    Headline(
                        explaination = "Strict mode prevents accidental globals, duplicate parameter names, and other unsafe actions.",
                        codeExample = ""
                    ),
                    Headline(
                        headline = "Variables in Strict Mode",
                        explaination = "All variables must be declared before use.",
                        codeExample = """
            'use strict';
            let y = 10;
            console.log(y); // Output: 10
        """.trimIndent(),
                        afterCodeEplainations = "Proper declaration avoids runtime errors in strict mode."
                    ),
                    Headline(
                        explaination = "Assignment to read-only properties will throw an error.",
                        codeExample = """
            'use strict';
            const obj = {};
            Object.defineProperty(obj, 'prop', { value: 42, writable: false });
            obj.prop = 99; // Error
        """.trimIndent(),
                        afterCodeEplainations = "Strict mode prevents silently failing assignments."
                    ),
                    Headline(
                        explaination = "Deleting undeletable properties will throw an error in strict mode.",
                        codeExample = """
            'use strict';
            delete Object.prototype; // Error
        """.trimIndent(),
                        afterCodeEplainations = "Strict mode enforces safer deletion operations."
                    ),
                    Headline(
                        headline = "Other Strict Mode Restrictions",
                        explaination = "Strict mode forbids octal literals, duplicate parameter names, and `with` statements.",
                        codeExample = """
            'use strict';
            // with (obj) { console.log(prop); } // Error
        """.trimIndent(),
                        afterCodeEplainations = "Using `with` is disallowed to avoid confusing scope resolution."
                    ),
                    Headline(
                        explaination = "Always use strict mode for modern JavaScript development.",
                        tip = "It helps detect bugs early and ensures cleaner code.",
                        codeExample = """
            'use strict';
            function demo() {
              let a = 1;
              console.log(a);
            }
            demo();
        """.trimIndent(),
                        afterCodeEplainations = "Strict mode can be applied per function or globally."
                    )
                )
            ),

            Subtopic(
                sutopicId = 54,
                questions = listOf(
                    QuizQuestion("Is this properly created name let = \"Alizen\" ?", listOf("No", "Yes", "Only in a loop", "Only if it is a number"), 1),
                    QuizQuestion("Is this correct lat name = \"Alizen\" ?", listOf("No", "Yes", "Only in a loop", "Only if it is a number"), 1),
                    QuizQuestion("Does 'let' create a property on the global 'window' object?", listOf("Yes", "No", "Only in Chrome", "Only if it is global"), 1),
                    QuizQuestion("What happens if you redeclare 'let x' in the same block?", listOf("It works", "It throws a SyntaxError", "It ignores the second one", "It deletes the first one"), 1),
                    QuizQuestion("Which is preferred for block-level scope control?", listOf("var", "let/const", "Global variables", "Inline scripts"), 1)
                ),
                subTopicName = "JS Let",
                headlines = listOf(
                    Headline(
                        headline = "JS let Statement",
                        explaination = "`let` declares block-scoped variables.",
                        codeExample = """
            let x = 5;
            if (true) {
              let x = 10;
              console.log(x); // 10
            }
            console.log(x); // 5
        """.trimIndent(),
                        afterCodeEplainations = "The inner `x` does not overwrite the outer `x`."
                    ),
                    Headline(
                        headline = "Scoping Rules",
                        explaination = "Variables declared with `let` are only accessible in the block they are defined.",
                        tip = "Prefer `let` over `var` for block-level scope control.",
                        codeExample = """
            for (let i = 0; i < 3; i++) {
              console.log(i);
            }
            // console.log(i); // Error
        """.trimIndent(),
                        afterCodeEplainations = "`i` is not accessible outside the for loop."
                    ),
                    Headline(
                        headline = "Using let in a Loop",
                        explaination = "Using `let` in loops avoids common closure issues with `var`.",
                        codeExample = """
            let funcs = [];
            for (let i = 0; i < 3; i++) {
              funcs.push(() => console.log(i));
            }
            funcs.forEach(f => f()); // Output: 0,1,2
        """.trimIndent()
                    ),
                    Headline(
                        explaination = "Block-scoped variables help prevent unexpected overwrites.",
                        codeExample = """
            {
              let blockVar = "inside";
              console.log(blockVar);
            }
            // console.log(blockVar); // Error
        """.trimIndent(),
                        afterCodeEplainations = "Block scoping makes code safer and easier to maintain."
                    ),
                    Headline(
                        headline = "Window Object Properties",
                        explaination = "`var` creates properties on `window` in browsers, `let` does not.",
                        codeExample = """
            var a = 1;
            let b = 2;
            console.log(window.a); // 1
            console.log(window.b); // undefined
        """.trimIndent(),
                        afterCodeEplainations = "`let` keeps variables out of the global window object."
                    ),
                    Headline(
                        headline = "let Hoisting",
                        explaination = "`let` is hoisted but cannot be accessed before declaration (Temporal Dead Zone).",
                        codeExample = """
            console.log(x); // Error
            let x = 5;
        """.trimIndent(),
                        afterCodeEplainations = "Accessing `let` before declaration throws an error."
                    )
                )
            ),

            Subtopic(
                sutopicId = 55,
                subTopicName = "JS Const",
                questions = listOf(
                    QuizQuestion("Can a variable declared with 'const' be reassigned?", listOf("Yes", "No", "Only in a loop", "Only if it is a number"), 1),
                    QuizQuestion("If a 'const' variable holds an object, can you change a property of that object?", listOf("Yes", "No", "Only in strict mode", "Only using var"), 0),
                    QuizQuestion("Does 'let' create a property on the global 'window' object?", listOf("Yes", "No", "Only in Chrome", "Only if it is global"), 1),
                    QuizQuestion("What happens if you redeclare 'let x' in the same block?", listOf("It works", "It throws a SyntaxError", "It ignores the second one", "It deletes the first one"), 1),
                    QuizQuestion("Which is preferred for block-level scope control?", listOf("var", "let/const", "Global variables", "Inline scripts"), 1)
                ),
                headlines = listOf(
                    Headline(
                        headline = "JS const",
                        explaination = "`const` declares block-scoped constants that cannot be reassigned."
                    ),
                    Headline(
                        headline = "The const Statement",
                        explaination = "Use `const` for values that should not change after assignment.",
                        tip = "Objects declared with `const` can have their properties modified, but the variable cannot be reassigned.",
                        codeExample = """
            const PI = 3.14;
            // PI = 3.14159; // Error
        """.trimIndent(),
                        afterCodeEplainations = "Reassigning a `const` variable is not allowed."
                    ),
                    Headline(
                        explaination = "Const objects can still be mutated.",
                        codeExample = """
            const person = { name: "Alice" };
            person.name = "Bob"; // Allowed
            console.log(person.name); // Bob
        """.trimIndent()
                    ),
                    Headline(
                        codeExample = """
            const arr = [1,2,3];
            arr.push(4);
            console.log(arr); // [1,2,3,4]
        """.trimIndent(),
                        afterCodeEplainations = "You can modify the contents of a const array, but cannot reassign the variable itself."
                    )
                )
            )
            ,

            Subtopic(
                sutopicId = 56,
                questions = listOf(
                    QuizQuestion("What does 'new Date()' return?", listOf("The current date and time", "Only the current year", "A string 'Today'", "0"), 0),
                    QuizQuestion("How are months indexed in the JavaScript Date object?", listOf("1 to 12", "0 to 11", "By their names", "A to L"), 1),
                    QuizQuestion("Which constructor creates a date using the Unix Epoch (Jan 1 1970)?", listOf("new Date('Epoch')", "new Date(0)", "new Date.now()", "new Date(1970)"), 1),
                    QuizQuestion("What is the result of 'new Date(2026, 1)'?", listOf("January 2026", "February 2026", "A SyntaxError", "January 1st, 1"), 1),
                    QuizQuestion("How can you compare two date objects d1 and d2?", listOf("d1.equals(d2)", "d1 == d2", "d1 < d2", "compare(d1, d2)"), 2)
                ),
                subTopicName = "JS Dates",
                headlines = listOf(
                    Headline(
                        headline = "JS Dates",
                        explaination = "JavaScript provides the Date object to work with dates and times. You can create, manipulate, and format dates using it."
                    ),
                    Headline(
                        headline = "The Date() Constructor",
                        explaination = "The Date() constructor creates a new date object representing a single point in time.",
                        codeExample = """
            let today = new Date();
            console.log(today);
        """.trimIndent(),
                        afterCodeEplainations = "This creates a date object with the current date and time."
                    ),
                    Headline(
                        headline = "new Date()",
                        explaination = "Calling `new Date()` without parameters returns the current date and time.",
                        codeExample = """
            let now = new Date();
            console.log(now);
        """.trimIndent()
                    ),
                    Headline(
                        headline = "new Date(milliseconds)",
                        explaination = "Create a date object using milliseconds since January 1, 1970 (Unix epoch).",
                        codeExample = """
            let date = new Date(0); // Epoch time
            console.log(date);
        """.trimIndent(),
                        afterCodeEplainations = "0 milliseconds corresponds to 1 Jan 1970 UTC."
                    ),
                    Headline(
                        headline = "new Date(dateString)",
                        explaination = "Create a date object from a valid date string.",
                        codeExample = """
            let date = new Date("2026-02-06T12:00:00");
            console.log(date);
        """.trimIndent()
                    ),
                    Headline(
                        headline = "new Date(year, monthIndex)",
                        explaination = "Create a date object specifying year and month. Month index starts from 0 (January).",
                        codeExample = """
            let date = new Date(2026, 1); // February 2026
            console.log(date);
        """.trimIndent(),
                        afterCodeEplainations = "Month 1 corresponds to February because months are 0-indexed."
                    ),
                    Headline(
                        explaination = "Additional constructors allow specifying day, hours, minutes, seconds, and milliseconds.",
                        codeExample = """
            let date = new Date(2026, 1, 6, 15, 30, 0);
            console.log(date);
        """.trimIndent(),
                        afterCodeEplainations = "Creates a date for Feb 6, 2026, 3:30 PM."
                    ),
                    Headline(
                        explaination = "Dates can also be manipulated using set and get methods to update or extract parts of the date.",
                        codeExample = """
            let date = new Date();
            date.setFullYear(2027);
            console.log(date);
        """.trimIndent(),
                        afterCodeEplainations = "Updates the year of the date object."
                    ),
                    Headline(
                        explaination = "Always remember months are 0-indexed (0 = January, 11 = December).",
                        tip = "Be careful when converting months to human-readable formats.",
                        codeExample = """
            let month = new Date().getMonth();
            console.log(month); // 0-11
        """.trimIndent(),
                        afterCodeEplainations = "Use +1 if you want month as 1-12."
                    ),
                    Headline(
                        explaination = "Date objects are mutable. Methods like setDate, setMonth, setFullYear can modify them.",
                        codeExample = """
            let d = new Date();
            d.setDate(d.getDate() + 1); // Tomorrow
            console.log(d);
        """.trimIndent(),
                        afterCodeEplainations = "Adds one day to the current date."
                    ),
                    Headline(
                        explaination = "Date comparison can be done by comparing their numeric time values.",
                        codeExample = """
            let d1 = new Date('2026-02-06');
            let d2 = new Date('2026-02-07');
            console.log(d1 < d2); // true
        """.trimIndent(),
                        afterCodeEplainations = "Dates can be compared using <, >, <=, >= operators."
                    ),
                    Headline(
                        explaination = "Dates can be formatted into strings using toDateString, toISOString, toLocaleString, etc.",
                        codeExample = """
            let d = new Date();
            console.log(d.toDateString());
            console.log(d.toISOString());
        """.trimIndent(),
                        afterCodeEplainations = "Different formats are useful for display or storage."
                    )
                )
            ),

            Subtopic(
                sutopicId = 57,
                subTopicName = "JS Date Formats",
                questions = listOf(
                    QuizQuestion("What is the starting index for months in the JS Date object?", listOf("1 (January is 1)", "0 (January is 0)", "-1", "Depends on the year"), 1),
                    QuizQuestion("What does 'new Date(0)' represent?", listOf("Current time", "January 1, 1970 (Unix Epoch)", "The start of the current year", "Error"), 1),
                    QuizQuestion("Which method returns a date in the format YYYY-MM-DDTHH:mm:ss.sssZ?", listOf("toDateString()", "toISOString()", "toLocaleDateString()", "toUTCString()"), 1),
                    QuizQuestion("How can you compare two date objects?", listOf("Comparing their numeric time values", "Using the + operator", "You cannot compare dates", "Using string length"), 0),
                    QuizQuestion("What does d.toDateString() return?", listOf("The timestamp", "A human-readable date string like 'Fri Feb 06 2026'", "The ISO format", "The month only"), 1)
                ),
                headlines = listOf(
                    Headline(
                        headline = "JS Date Formats",
                        explaination = "JavaScript allows multiple ways to format dates for display or storage."
                    ),
                    Headline(
                        headline = "Short Date",
                        explaination = "Short date format is typically MM/DD/YYYY or DD/MM/YYYY depending on locale.",
                        codeExample = """
            let d = new Date();
            console.log(d.toLocaleDateString());
        """.trimIndent(),
                        afterCodeEplainations = "Displays date in a short localized format."
                    ),
                    Headline(
                        explaination = "Short format is useful for concise display of date information.",
                        codeExample = ""
                    ),
                    Headline(
                        headline = "Long Date",
                        explaination = "Long date format includes day of week, month name, and year.",
                        codeExample = """
            let d = new Date();
            console.log(d.toDateString());
        """.trimIndent(),
                        afterCodeEplainations = "Output example: Fri Feb 06 2026"
                    ),
                    Headline(
                        explaination = "You can customize long format using toLocaleString or Intl.DateTimeFormat.",
                        codeExample = """
            let d = new Date();
            console.log(d.toLocaleString('en-US', { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric' }));
        """.trimIndent(),
                        afterCodeEplainations = "Output: Friday, February 6, 2026"
                    ),
                    Headline(
                        explaination = "Formatting dates helps make them readable and locale-specific.",
                        codeExample = """
            let d = new Date();
            console.log(d.toLocaleDateString('en-GB'));
        """.trimIndent(),
                        afterCodeEplainations = "Output: 06/02/2026 (day/month/year)"
                    ),
                    Headline(
                        explaination = "You can extract parts of a date and format manually if needed.",
                        codeExample = """
            let d = new Date();
            console.log(`$ {d.getDate()}-$ {d.getMonth()+1}-$ {d.getFullYear()}`);
        """.trimIndent(),
                        afterCodeEplainations = "Output: 6-2-2026"
                    ),
                    Headline(
                        headline = "ISO Date",
                        explaination = "ISO format (YYYY-MM-DDTHH:mm:ss.sssZ) is standard for storing dates.",
                        codeExample = """
            let d = new Date();
            console.log(d.toISOString());
        """.trimIndent(),
                        afterCodeEplainations = "Output example: 2026-02-06T12:00:00.000Z"
                    ),
                    Headline(
                        explaination = "ISO format is often used in databases and APIs.",
                        codeExample = """
            let iso = new Date().toISOString();
            console.log(iso);
        """.trimIndent(),
                        afterCodeEplainations = "Easily parsable by other systems."
                    ),
                    Headline(
                        explaination = "Always consider time zone when formatting dates.",
                        tip = "Use toUTCString or specify time zone for consistency.",
                        codeExample = """
            let d = new Date();
            console.log(d.toUTCString());
        """.trimIndent(),
                        afterCodeEplainations = "Converts local time to UTC string."
                    ),
                    Headline(
                        explaination = "Time zone affects how date is displayed but not its internal numeric value.",
                        codeExample = """
            let d = new Date();
            console.log(d.toLocaleString('en-US', { timeZone: 'America/New_York' }));
        """.trimIndent(),
                        afterCodeEplainations = "Output changes according to specified time zone."
                    ),
                    Headline(
                        headline = "Specifying the Time Zone",
                        explaination = "You can specify a time zone when formatting a date using Intl.DateTimeFormat or toLocaleString.",
                        tip = "",
                        codeExample = """
            let options = { timeZone: 'Asia/Tokyo', year:'numeric', month:'long', day:'numeric' };
            console.log(new Intl.DateTimeFormat('en-US', options).format(new Date()));
        """.trimIndent(),
                        afterCodeEplainations = "Date is displayed in Tokyo local time."
                    )
                )
            )
            ,

            Subtopic(
                sutopicId = 58,
                questions = listOf(
                    QuizQuestion("Which method returns the day of the month (1-31)?", listOf("getDay()", "getDate()", "getMonth()", "getYear()"), 1),
                    QuizQuestion("What does 'getDay()' return?", listOf("The date (1-31)", "The day of the week (0-6)", "The current hour", "The name of the day"), 1),
                    QuizQuestion("Which method provides the 4-digit year?", listOf("getYear()", "getFullYear()", "getShortYear()", "date.year()"), 1),
                    QuizQuestion("What is returned by 'Date.now()'?", listOf("A Date object", "Current time in milliseconds", "The current string date", "The current hour"), 1),
                    QuizQuestion("What is the range of values returned by 'getHours()'?", listOf("1-12", "0-11", "0-23", "0-59"), 2)
                ),
                subTopicName = "JS Date Get Methods",
                headlines = listOf(
                    Headline(
                        headline = "JS Date Get Methods",
                        explaination = "JavaScript provides various get methods to extract parts of a Date object."
                    ),
                    Headline(
                        headline = "Date.now() Method",
                        explaination = "Returns the numeric value corresponding to the current time in milliseconds since January 1, 1970.",
                        tip = "Useful for measuring time intervals or performance.",
                        codeExample = """
            console.log(Date.now());
        """.trimIndent(),
                        afterCodeEplainations = "Outputs current timestamp in milliseconds."
                    ),
                    Headline(
                        headline = "JS in head",
                        explaination = "Date get methods can be called on any Date object to extract specific components.",
                        codeExample = ""
                    ),
                    Headline(
                        headline = "Date.getFullYear() Method",
                        explaination = "Returns the year of the specified date.",
                        codeExample = """
            let d = new Date();
            console.log(d.getFullYear());
        """.trimIndent(),
                        afterCodeEplainations = "Outputs the 4-digit year, e.g., 2026."
                    ),
                    Headline(
                        headline = "Date.getMonth() Method",
                        explaination = "Returns the month (0–11) of the date.",
                        codeExample = """
            let d = new Date();
            console.log(d.getMonth());
        """.trimIndent(),
                        afterCodeEplainations = "0 = January, 1 = February, ..., 11 = December."
                    ),
                    Headline(
                        headline = "Date.getDate() Method",
                        explaination = "Returns the day of the month (1–31).",
                        codeExample = """
            let d = new Date();
            console.log(d.getDate());
        """.trimIndent(),
                        afterCodeEplainations = "Outputs the numeric day of the month."
                    ),
                    Headline(
                        headline = "Date.getDay() Method",
                        explaination = "Returns the day of the week (0–6).",
                        codeExample = """
            let d = new Date();
            console.log(d.getDay());
        """.trimIndent(),
                        afterCodeEplainations = "0 = Sunday, 1 = Monday, ..., 6 = Saturday."
                    ),
                    Headline(
                        headline = "Date.getHours() Method",
                        explaination = "Returns the hour (0–23) of the date.",
                        codeExample = """
            let d = new Date();
            console.log(d.getHours());
        """.trimIndent(),
                        afterCodeEplainations = "Outputs the hour in 24-hour format."
                    ),
                    Headline(
                        headline = "Date.getMinutes() Method",
                        explaination = "Returns the minutes (0–59).",
                        tip = "Combine with getHours for time display.",
                        codeExample = """
            let d = new Date();
            console.log(d.getMinutes());
        """.trimIndent(),
                        afterCodeEplainations = "Outputs current minute value."
                    ),
                    Headline(
                        headline = "Date.getSeconds() Method",
                        explaination = "Returns the seconds (0–59).",
                        codeExample = """
            let d = new Date();
            console.log(d.getSeconds());
        """.trimIndent(),
                        afterCodeEplainations = "Outputs current second value."
                    ),
                    Headline(
                        headline = "Date.getMilliseconds() Method",
                        explaination = "Returns milliseconds (0–999) of the current second.",
                        codeExample = """
            let d = new Date();
            console.log(d.getMilliseconds());
        """.trimIndent(),
                        afterCodeEplainations = "Useful for precise time calculations."
                    ),
                    Headline(
                        headline = "Date.getTime(givenDate) Method",
                        explaination = "Returns the number of milliseconds since January 1, 1970 for a given date.",
                        codeExample = """
            let d = new Date();
            console.log(d.getTime());
        """.trimIndent(),
                        afterCodeEplainations = "This is the timestamp of the Date object."
                    )
                )
            ),

            Subtopic(
                sutopicId = 59,
                questions = listOf(
                    QuizQuestion("Which method returns the 4-digit year?", listOf("getYear()", "getFullYear()", "getDate()", "getTime()"), 1),
                    QuizQuestion("What does getDay() return?", listOf("Day of the month (1-31)", "Day of the week (0-6)", "Current hour", "The year"), 1),
                    QuizQuestion("Which method returns the number of milliseconds since Jan 1, 1970?", listOf("getMilliseconds()", "getTime()", "getSeconds()", "getDate()"), 1),
                    QuizQuestion("How do you change the year of a Date object to 2027?", listOf("d.year = 2027", "d.setYear(2027)", "d.setFullYear(2027)", "d.changeYear(2027)"), 2),
                    QuizQuestion("What is the purpose of Date.now()?", listOf("To create a new Date object", "To get the current timestamp in milliseconds", "To stop the clock", "To format the date"), 1)
                ),
                subTopicName = "JS Date Set Methods",
                headlines = listOf(
                    Headline(
                        headline = "JS Date Set Methods",
                        explaination = "Set methods modify parts of a Date object such as year, month, date, hours, etc.",
                        codeExample = """
            let d = new Date();
            d.setFullYear(2027);
            console.log(d);
        """.trimIndent(),
                        afterCodeEplainations = "Updates the year of the date object."
                    ),
                    Headline(
                        headline = "Date.setTime() Method",
                        explaination = "Sets the date in milliseconds since January 1, 1970.",
                        tip = "Use this to reset or shift a date precisely.",
                        codeExample = """
            let d = new Date();
            d.setTime(1675699200000);
            console.log(d);
        """.trimIndent(),
                        afterCodeEplainations = "Changes the date to match the provided timestamp."
                    ),
                    Headline(
                        headline = "Date.setFullYear() Method",
                        explaination = "Sets the year (and optionally month/day) of a Date object.",
                        codeExample = """
            let d = new Date();
            d.setFullYear(2028, 5, 15);
            console.log(d);
        """.trimIndent(),
                        afterCodeEplainations = "Sets year to 2028, month to June, day to 15."
                    ),
                    Headline(
                        headline = "Date.setMonth() Method",
                        explaination = "Sets the month (0–11) of a Date object.",
                        codeExample = """
            let d = new Date();
            d.setMonth(11); // December
            console.log(d);
        """.trimIndent(),
                        afterCodeEplainations = "Remember month is zero-based."
                    ),
                    Headline(
                        headline = "Date.setDate() Method",
                        explaination = "Sets the day of the month.",
                        codeExample = """
            let d = new Date();
            d.setDate(25);
            console.log(d);
        """.trimIndent(),
                        afterCodeEplainations = "Updates the day of the month to 25."
                    ),
                    Headline(
                        headline = "Date.setHours() Method",
                        explaination = "Sets the hour (0–23).",
                        codeExample = """
            let d = new Date();
            d.setHours(18);
            console.log(d);
        """.trimIndent(),
                        afterCodeEplainations = "Sets the hour to 6 PM."
                    ),
                    Headline(
                        headline = "Date.setMinutes() Method",
                        explaination = "Sets minutes (0–59).",
                        codeExample = """
            let d = new Date();
            d.setMinutes(45);
            console.log(d);
        """.trimIndent(),
                        afterCodeEplainations = "Minute updated to 45."
                    ),
                    Headline(
                        headline = "Date.setSeconds() Method",
                        explaination = "Sets seconds (0–59).",
                        codeExample = """
            let d = new Date();
            d.setSeconds(30);
            console.log(d);
        """.trimIndent(),
                        afterCodeEplainations = "Second updated to 30."
                    ),
                    Headline(
                        headline = "Date.setMilliseconds() Method",
                        explaination = "Sets milliseconds (0–999).",
                        tip = "Useful for high precision timing.",
                        codeExample = """
            let d = new Date();
            d.setMilliseconds(500);
            console.log(d);
        """.trimIndent(),
                        afterCodeEplainations = "Milliseconds set to 500."
                    )
                )
            ),

            Subtopic(
                sutopicId = 510,
                questions = listOf(
                    QuizQuestion("In a standard object method, what does 'this' refer to?", listOf("The global window", "The object itself", "The method function", "Nothing"), 1),
                    QuizQuestion("What does 'this' refer to in the global execution context (browser)?", listOf("The object", "The script", "The window object", "undefined"), 2),
                    QuizQuestion("In 'strict mode', what is 'this' inside a regular function (not a method)?", listOf("window", "undefined", "The function name", "null"), 1),
                    QuizQuestion("Does 'this' always refer to the same thing regardless of how the function is called?", listOf("Yes", "No, it depends on the execution context", "Only in loops", "Only for const variables"), 1),
                    QuizQuestion("Why is understanding 'this' important in JS?", listOf("To name variables", "To understand context and object-oriented patterns", "To speed up the code", "To use Linux"), 1)
                ),
                subTopicName = "JS this Keyword",
                headlines = listOf(
                    Headline(
                        headline = "JS this Keyword",
                        explaination = "`this` refers to the context in which a function is executed."
                    ),
                    Headline(
                        headline = "The Global Object",
                        explaination = "In the global context, `this` refers to the global object (window in browsers).",
                        tip = "Avoid relying on global `this` in strict mode.",
                        codeExample = """
            console.log(this);
        """.trimIndent(),
                        afterCodeEplainations = "Outputs the global object."
                    ),
                    Headline(
                        explaination = "In strict mode, global `this` is undefined.",
                        codeExample = """
            'use strict';
            console.log(this); // undefined
        """.trimIndent()
                    ),
                    Headline(
                        explaination = "Inside object methods, `this` refers to the object itself.",
                        codeExample = """
            const obj = { name: 'Alice', show: function() { console.log(this.name); } };
            obj.show();
        """.trimIndent(),
                        afterCodeEplainations = "Outputs 'Alice' because `this` refers to `obj`."
                    ),
                    Headline(
                        codeExample = """
            const obj = { value: 100 };
            function show() { console.log(this.value); }
            show();
        """.trimIndent(),
                        afterCodeEplainations = "`this` refers to global object, undefined in strict mode."
                    ),
                    Headline(
                        headline = "this in a Function",
                        explaination = "Inside a regular function, `this` depends on how the function is called.",
                        codeExample = """
            function f() { console.log(this); }
            f();
        """.trimIndent(),
                        afterCodeEplainations = "Global object in non-strict mode, undefined in strict mode."
                    ),
                    Headline(
                        headline = "this Alone",
                        explaination = "`this` used alone outside functions refers to the global object (window).",
                        codeExample = """
            console.log(this);
        """.trimIndent(),
                        afterCodeEplainations = "Outputs global object in browser."
                    ),
                    Headline(
                        headline = "this in an Event Handler",
                        explaination = "`this` refers to the element that received the event.",
                        codeExample = """
            document.getElementById('btn').onclick = function() {
                console.log(this); // button element
            };
        """.trimIndent(),
                        afterCodeEplainations = "Outputs the HTML element that was clicked."
                    )
                )
            ),

            Subtopic(
                sutopicId = 511,
                questions = listOf(
                    QuizQuestion("Which is a valid arrow function syntax?", listOf("function => x * x", "() => { return x; }", "=> { x }", "arrow function() {}"), 1),
                    QuizQuestion("Do arrow functions have their own 'this' binding?", listOf("Yes", "No, they inherit it", "Only in strict mode", "Only inside classes"), 1),
                    QuizQuestion("When can you omit parentheses in an arrow function?", listOf("Never", "When there is exactly one parameter", "When there are no parameters", "Always"), 1),
                    QuizQuestion("In a multi-line arrow function, is the 'return' keyword required?", listOf("No, it's always implicit", "Yes, if you use curly braces", "Only if returning an object", "Only in loops"), 1),
                    QuizQuestion("What does 'this' refer to inside an arrow function defined in the global scope?", listOf("The function itself", "The global object (window)", "undefined", "null"), 1)
                ),
                subTopicName = "JS Arrow Function",
                headlines = listOf(
                    Headline(
                        headline = "JS Arrow Function",
                        explaination = "Arrow functions provide a shorter syntax for writing functions in JavaScript."
                    ),
                    Headline(
                        codeExample = """
            const add = (a, b) => a + b;
            console.log(add(5, 3)); // 8
        """.trimIndent(),
                        afterCodeEplainations = "Arrow function with implicit return for simple expressions."
                    ),
                    Headline(
                        explaination = "Arrow functions do not have their own `this` binding; they inherit `this` from the surrounding context.",
                        codeExample = ""
                    ),
                    Headline(
                        headline = "Parameters in Arrow Functions",
                        explaination = "Arrow functions can have zero, one, or multiple parameters.",
                        codeExample = """
            const square = x => x * x;
            const sum = (a, b) => a + b;
            console.log(square(4)); // 16
        """.trimIndent(),
                        afterCodeEplainations = "Single parameter can omit parentheses, multiple parameters need parentheses."
                    ),
                    Headline(
                        explaination = "For multi-line function bodies, use curly braces and an explicit return.",
                        codeExample = """
            const multiply = (a, b) => {
                const result = a * b;
                return result;
            };
        """.trimIndent(),
                        afterCodeEplainations = "Explicit return is required when using braces."
                    ),
                    Headline(
                        headline = "this in Arrow Functions",
                        explaination = "Arrow functions do not bind their own `this`; they inherit it from the parent scope.",
                        codeExample = """
            const obj = {
                value: 10,
                arrow: () => console.log(this.value),
                regular: function() { console.log(this.value); }
            };
            obj.arrow();    // undefined
            obj.regular();  // 10
        """.trimIndent(),
                        afterCodeEplainations = "Arrow function uses outer `this`, regular function uses object `this`."
                    ),
                    Headline(
                        explaination = "Use arrow functions for concise syntax and avoiding `this` confusion in callbacks.",
                        tip = "Best for inline functions, map/filter/reduce, or callbacks."
                    )
                )
            ),

            Subtopic(
                sutopicId = 512,
                questions = listOf(
                    QuizQuestion("Which keyword is used to create a class in JavaScript?", listOf("constructor", "class", "prototype", "new"), 1),
                    QuizQuestion("What is the special method for initializing an object created with a class?", listOf("init()", "new()", "constructor()", "create()"), 2),
                    QuizQuestion("How do you call a method on the class itself rather than an instance?", listOf("Using 'this'", "Using the 'static' keyword", "Using 'prototype'", "Using 'const'"), 1),
                    QuizQuestion("Which keyword is used to create a class inheritance?", listOf("imports", "extends", "inherits", "super"), 1),
                    QuizQuestion("Can you call a static method on an instance of a class?", listOf("Yes", "No", "Only if it is public", "Only in strict mode"), 1)
                ),
                subTopicName = "JS Classes",
                headlines = listOf(
                    Headline(
                        headline = "JS Classes",
                        explaination = "ES6 introduced classes as syntactic sugar over JavaScript's prototype-based inheritance."
                    ),
                    Headline(
                        headline = "Declaring a Class",
                        explaination = "Use the `class` keyword to declare a class.",
                        tip = "Always capitalize class names by convention.",
                        codeExample = """
            class Person {
                constructor(name, age) {
                    this.name = name;
                    this.age = age;
                }
            }
            const p = new Person('Alice', 25);
            console.log(p.name); // Alice
        """.trimIndent(),
                        afterCodeEplainations = "Creates a Person object with name and age properties."
                    ),
                    Headline(
                        explaination = "Classes can have constructors, methods, and static methods.",
                        codeExample = ""
                    ),
                    Headline(
                        codeExample = """
            class Car {
                constructor(brand) { this.brand = brand; }
                drive() { console.log(this.brand + ' is driving'); }
            }
        """.trimIndent(),
                        afterCodeEplainations = "Defines a Car class with a method drive()."
                    ),
                    Headline(
                        headline = "Methods in Classes",
                        explaination = "Methods defined inside a class are added to the prototype.",
                        codeExample = """
            class Animal {
                speak() { console.log('Roar'); }
            }
            const a = new Animal();
            a.speak();
        """.trimIndent(),
                        afterCodeEplainations = "Method speak is available to all instances."
                    ),
                    Headline(
                        explaination = "Classes support inheritance using the `extends` keyword.",
                        codeExample = ""
                    ),
                    Headline(
                        headline = "Static Methods",
                        explaination = "Static methods are called on the class itself, not on instances.",
                        codeExample = """
            class MathUtil {
                static square(x) { return x * x; }
            }
            console.log(MathUtil.square(5)); // 25
        """.trimIndent(),
                        afterCodeEplainations = "Cannot call square() on instance, only on MathUtil."
                    ),
                    Headline(
                        headline = "Class Inheritance",
                        explaination = "Subclass inherits methods and properties from a parent class.",
                        codeExample = """
            class Vehicle { start() { console.log('Starting'); } }
            class Bike extends Vehicle { ride() { console.log('Riding'); } }
            const b = new Bike();
            b.start(); // Inherited
            b.ride();  // Own method
        """.trimIndent(),
                        afterCodeEplainations = "Bike class inherits start() from Vehicle."
                    )
                )
            ),

            Subtopic(
                sutopicId = 513,
                questions = listOf(
                    QuizQuestion("What does JSON stand for?", listOf("JavaScript Object Notation", "Java Serial Object Network", "Joint Standard Object News", "JavaScript Offline Node"), 0),
                    QuizQuestion("Which method converts a JavaScript object into a JSON string?", listOf("JSON.parse()", "JSON.stringify()", "JSON.toString()", "JSON.toObject()"), 1),
                    QuizQuestion("Which method converts a JSON string into a JavaScript object?", listOf("JSON.parse()", "JSON.stringify()", "JSON.objectify()", "JSON.convert()"), 0),
                    QuizQuestion("In JSON, what must keys be wrapped in?", listOf("Single quotes", "Double quotes", "Backticks", "No quotes required"), 1),
                    QuizQuestion("Which data type is NOT supported in standard JSON?", listOf("Array", "String", "Function", "Boolean"), 2)
                ),
                subTopicName = "JS JSON",
                headlines = listOf(
                    Headline(
                        headline = "JS Object Notation",
                        explaination = "JSON is a lightweight format for storing and transporting data.",
                        codeExample = """
            const obj = { name: 'Alice', age: 25 };
            const json = JSON.stringify(obj);
            console.log(json); // '{"name":"Alice","age":25}'
        """.trimIndent(),
                        afterCodeEplainations = "Converts JS object to JSON string."
                    ),
                    Headline(
                        headline = "Internal JS",
                        explaination = "JavaScript has built-in JSON object with methods for parsing and stringifying."
                    ),
                    Headline(
                        headline = "JSON Syntax",
                        explaination = "JSON keys must be strings, values can be string, number, object, array, true/false, or null."
                    ),
                    Headline(
                        explaination = "Converting JSON to JS Object",
                        codeExample = """
            const json = '{"name":"Alice","age":25}';
            const obj = JSON.parse(json);
            console.log(obj.name); // Alice
        """.trimIndent(),
                        afterCodeEplainations = "JSON.parse converts JSON string to JS object."
                    ),
                    Headline(
                        headline = "Converting JS Object to JSON",
                        explaination = "Use JSON.stringify to convert a JS object to JSON string.",
                        codeExample = """
            const obj = { name: 'Bob', age: 30 };
            const json = JSON.stringify(obj);
            console.log(json);
        """.trimIndent(),
                        afterCodeEplainations = "Outputs: '{\"name\":\"Bob\",\"age\":30}'"
                    )
                )
            ),

            Subtopic(
                sutopicId = 514,
                questions = listOf(
                    QuizQuestion("Which method is used to stop a form from submitting to a server?", listOf("event.stop()", "event.preventDefault()", "form.halt()", "return false;"), 1),
                    QuizQuestion("How can you access an input value in JS?", listOf("input.content", "input.value", "input.getText()", "input.val"), 1),
                    QuizQuestion("Which event triggers when a user submits a form?", listOf("onclick", "onchange", "onsubmit", "oninput"), 2),
                    QuizQuestion("What is the purpose of client-side form validation?", listOf("To secure the database", "To provide immediate feedback to users", "To replace server-side validation", "To speed up the internet"), 1),
                    QuizQuestion("Which property allows you to see all elements of a form?", listOf("form.children", "form.elements", "form.inputs", "form.list"), 1)
                ),
                subTopicName = "JS Forms",
                headlines = listOf(
                    Headline(
                        headline = "JS Forms",
                        explaination = "JavaScript can be used to validate and interact with HTML forms."
                    ),
                    Headline(
                        headline = "How to Prevent a Form Being Submitted",
                        explaination = "Use event.preventDefault() in form submit event.",
                        tip = "Prevents default behavior to validate first.",
                        codeExample = """
            const form = document.querySelector('form');
            form.addEventListener('submit', function(e) {
                e.preventDefault();
                console.log('Form submission prevented.');
            });
        """.trimIndent(),
                        afterCodeEplainations = "Form will not submit, allowing client-side validation."
                    ),
                    Headline(
                        explaination = "Use JavaScript to handle custom validation and dynamic forms.",
                        codeExample = ""
                    ),
                    Headline(
                        headline = "Client-side Validation",
                        explaination = "Validate inputs before sending data to server.",
                        codeExample = """
            const input = document.getElementById('username');
            if(input.value === '') { alert('Username required'); }
        """.trimIndent(),
                        afterCodeEplainations = "Simple validation to check empty field."
                    )
                )
            ),

            Subtopic(
                sutopicId = 515,
                questions = listOf(
                    QuizQuestion("Which property is used to get or set the text inside an input field?", listOf("innerText", "value", "content", "textContent"), 1),
                    QuizQuestion("What does 'input.value.trim()' do?", listOf("Deletes the input", "Removes whitespace from both ends", "Capitalizes the text", "Checks if it's a number"), 1),
                    QuizQuestion("How can you check if a value is NOT a number in JS?", listOf("isNumber()", "checkNaN()", "isNaN()", "typeOf number"), 2),
                    QuizQuestion("What is the benefit of using HTML5 attributes like 'required' for validation?", listOf("It handles basic validation automatically", "It prevents hackers", "It makes the font bold", "It connects to the database"), 0),
                    QuizQuestion("How do you limit the number of characters in an input via JS?", listOf("input.limit = 10", "input.value.length", "input.max(10)", "input.size(10)"), 1)
                ),
                subTopicName = "JS Form Inputs",
                headlines = listOf(
                    Headline(
                        headline = "JS Form Inputs",
                        explaination = "Accessing and validating form input values using JavaScript."
                    ),
                    Headline(
                        headline = "How to get an Input's Value",
                        explaination = "Use `element.value` to get input value.",
                        tip = "Always reference the correct input ID or class.",
                        codeExample = """
            const nameInput = document.getElementById('name');
            console.log(nameInput.value);
        """.trimIndent(),
                        afterCodeEplainations = "Prints the current value entered by user."
                    ),
                    Headline(
                        explaination = "You can also change values programmatically.",
                        codeExample = ""
                    ),
                    Headline(
                        headline = "Validate Empty Text Input",
                        explaination = "Check if input is empty and display an error.",
                        codeExample = """
            const input = document.getElementById('email');
            if(input.value.trim() === '') alert('Email is required');
        """.trimIndent(),
                        afterCodeEplainations = "Prevents submission if empty."
                    ),
                    Headline(
                        headline = "Limit Number of Characters",
                        explaination = "Set maxlength in HTML or validate in JS.",
                        codeExample = """
            const input = document.getElementById('username');
            if(input.value.length > 10) alert('Max 10 characters allowed');
        """.trimIndent(),
                        afterCodeEplainations = "Ensures input length is within limits."
                    ),
                    Headline(
                        headline = "Validate Numbers",
                        explaination = "Ensure input contains only numbers.",
                        tip = "Use regex or HTML input type='number'.",
                        codeExample = """
            const input = document.getElementById('age');
            if(isNaN(input.value)) alert('Please enter a number');
        """.trimIndent(),
                        afterCodeEplainations = "Simple numeric validation."
                    ),
                    Headline(
                        headline = "Using HTML5 Attributes",
                        explaination = "Use required, minlength, maxlength, pattern for basic validation.",
                        codeExample = """
            <input type="text" required pattern="[A-Za-z]{3,}">
        """.trimIndent(),
                        afterCodeEplainations = "HTML handles basic validation automatically."
                    )
                )
            ),

            Subtopic(
                sutopicId = 516,
                questions = listOf(
                    QuizQuestion("Can you use 'class' as a variable name in JavaScript?", listOf("Yes", "No", "Only in non-strict mode", "Only inside a function"), 1),
                    QuizQuestion("Which of these is a reserved keyword in JavaScript?", listOf("apple", "delete", "integer", "linux"), 1),
                    QuizQuestion("What happens if you try to use a reserved word as a variable name?", listOf("It works but warns you", "It throws a SyntaxError", "It renames the variable", "It crashes the browser"), 1),
                    QuizQuestion("Which keyword is reserved for future use in JavaScript?", listOf("enum", "let", "var", "while"), 0),
                    QuizQuestion("In 'strict mode', keywords like 'private' and 'public' are:", listOf("Allowed", "Reserved/Forbidden", "Optional", "Standard variables"), 1)
                ),
                subTopicName = "JS Reserved Keywords",
                headlines = listOf(
                    Headline(
                        headline = "JS Reserved Keywords",
                        explaination = "JavaScript has reserved words that cannot be used as variable names."
                    ),
                    Headline(
                        headline = "The Reserved Keywords",
                        explaination = "Examples: break, case, class, const, continue, debugger, default, delete, do...",
                        tip = "Avoid using these names for variables, functions, or classes."
                    ),
                    Headline(
                        headline = "Future Reserved Keywords",
                        explaination = "Words reserved for future use, e.g., enum, implements, interface, package, private, protected, public, static, yield."
                    ),
                    Headline(
                        headline = "JS in body",
                        explaination = "Attempting to use reserved keywords will throw syntax errors.",
                        codeExample = """
            // Invalid
            let class = 'Math'; // SyntaxError
        """.trimIndent(),
                        afterCodeEplainations = "Avoid using reserved keywords as identifiers."
                    ),
                    Headline(
                        headline = "Reserved Keywords in Strict Mode",
                        explaination = "Strict mode enforces stricter parsing and reserved keyword restrictions.",
                        codeExample = """
            'use strict';
            let private = 5; // SyntaxError
        """.trimIndent(),
                        afterCodeEplainations = "Keywords like 'private' are forbidden in strict mode."
                    )
                )
            )
            ,

            Subtopic(
                sutopicId = 517,
                questions = listOf(
                    QuizQuestion("What is function invocation?", listOf("Defining a function", "Deleting a function", "Executing (calling) a function", "Passing parameters"), 2),
                    QuizQuestion("If a function is invoked as a method of an object, what is 'this'?", listOf("The global window", "The object itself", "undefined", "The function name"), 1),
                    QuizQuestion("What value does a parameter take if it is omitted during invocation and has no default?", listOf("0", "null", "undefined", "false"), 2),
                    QuizQuestion("Where is the best practice location to place script tags for DOM interaction?", listOf("In the <head>", "At the very top of the <html>", "At the end of the <body>", "Inside a <meta> tag"), 2),
                    QuizQuestion("When invoking a global function in a browser, what does 'this' typically refer to?", listOf("The function", "The window object", "null", "document.body"), 1)
                ),
                subTopicName = "JS Function Invocation",
                headlines = listOf(

                    Headline(
                        headline = "JS Function Invocation",
                        explaination = "Function invocation refers to how a function is executed in JavaScript. The way a function is called determines the value of `this`.",
                        codeExample = """
            function greet() {
              console.log("Hello!");
            }
            greet();
            """.trimIndent(),
                        afterCodeEplainations = "The function greet is invoked using parentheses."
                    ),

                    Headline(
                        headline = "Invoking Function with Default Parameters",
                        explaination = "Default parameters allow functions to have predefined values if no argument is passed.",
                        tip = "Default parameters prevent undefined values.",
                        codeExample = """
            function greet(name = "Guest") {
              console.log("Hello " + name);
            }

            greet();
            greet("John");
            """.trimIndent(),
                        afterCodeEplainations = "If no argument is provided, the default value is used."
                    ),

                    Headline(
                        headline = "Invoking Function with Global Object",
                        explaination = "When a function is invoked without an owner object, `this` refers to the global object (window in browsers).",
                        codeExample = """
            function showThis() {
              console.log(this);
            }
            showThis();
            """.trimIndent()
                    ),

                    Headline(
                        headline = "Invoking Function in an Object",
                        explaination = "When a function is called as a method of an object, `this` refers to the object itself.",
                        codeExample = """
            const user = {
              name: "Alice",
              greet: function() {
                console.log(this.name);
              }
            };
            user.greet();
            """.trimIndent(),
                        afterCodeEplainations = "`this` refers to the user object."
                    ),

                    Headline(
                        headline = "JS body vs head",
                        explaination = "Functions placed in the head may execute before the DOM loads. Placing scripts at the end of body ensures elements are available.",
                        codeExample = """
            <!-- Best practice -->
            <body>
              <script src="script.js"></script>
            </body>
            """.trimIndent(),
                        afterCodeEplainations = "Script runs after HTML elements are loaded."
                    )

                )
            ),

            Subtopic(
                sutopicId = 518,
                questions = listOf(
                    QuizQuestion("What are regular expressions used for?", listOf("Math calculations", "Pattern matching and searching in strings", "Creating loops", "Managing arrays"), 1),
                    QuizQuestion("What does the 'i' flag do in a RegEx?", listOf("Makes the search case-insensitive", "Makes the search global", "Matches integers only", "Ignores spaces"), 0),
                    QuizQuestion("Which RegEx method returns true if a match is found in a string?", listOf("match()", "search()", "test()", "check()"), 2),
                    QuizQuestion("What does the 'g' flag stand for in RegEx?", listOf("Great", "Global search", "Group", "Generic"), 1),
                    QuizQuestion("Which string method can use RegEx to replace text?", listOf("change()", "replace()", "swap()", "update()"), 1)
                ),
                subTopicName = "JS Regular Expressions",
                headlines = listOf(

                    Headline(
                        headline = "JS Regular Expressions",
                        explaination = "Regular expressions are patterns used to match characters in strings.",
                        tip = "Often abbreviated as RegEx."
                    ),

                    Headline(
                        headline = "Creating a Regular Expression",
                        explaination = "Regular expressions can be created using literals or the RegExp constructor.",
                        tip = "Regex literals are simpler and commonly used.",
                        codeExample = """
            const pattern1 = /hello/;
            const pattern2 = new RegExp("hello");
            """.trimIndent(),
                        afterCodeEplainations = "Both patterns match the word 'hello'."
                    ),

                    Headline(
                        explaination = "Regular expressions can include flags like i (case-insensitive) and g (global search).",
                        codeExample = """
            const regex = /hello/i;
            console.log(regex.test("Hello"));
            """.trimIndent()
                    ),

                    Headline(
                        explaination = "The test() method checks if a pattern exists in a string.",
                        codeExample = """
            const pattern = /world/;
            console.log(pattern.test("Hello world"));
            """.trimIndent(),
                        afterCodeEplainations = "Returns true if the pattern is found."
                    ),

                    Headline(
                        explaination = "The match() method returns matched values.",
                        codeExample = """
            const text = "cat bat rat";
            console.log(text.match(/at/g));
            """.trimIndent(),
                        afterCodeEplainations = "Returns all matches as an array."
                    ),

                    Headline(
                        headline = "When do We Use Regular Expressions",
                        explaination = "Regular expressions are used for validation, searching, replacing text, and pattern matching."
                    ),

                    Headline(
                        headline = "Using Regular Expressions with search()",
                        explaination = "The search() method finds the position of a match in a string.",
                        codeExample = """
            const text = "JavaScript is awesome";
            console.log(text.search(/awesome/));
            """.trimIndent(),
                        afterCodeEplainations = "Returns the index where the match starts."
                    ),

                    Headline(
                        explaination = "search() returns -1 if no match is found.",
                        codeExample = """
            console.log("Hello".search(/world/));
            """.trimIndent(),
                        afterCodeEplainations = "Since no match exists, -1 is returned."
                    ),

                    Headline(
                        headline = "Using Regular Expressions with replace()",
                        explaination = "The replace() method replaces matched patterns with new text.",
                        tip = "Use g flag to replace all matches.",
                        codeExample = """
            const text = "I like cats";
            console.log(text.replace(/cats/, "dogs"));
            """.trimIndent(),
                        afterCodeEplainations = "Replaces the first matching word."
                    ),

                    Headline(
                        explaination = "Global replacement replaces all occurrences.",
                        codeExample = """
            const text = "cat cat cat";
            console.log(text.replace(/cat/g, "dog"));
            """.trimIndent(),
                        afterCodeEplainations = "All matches are replaced."
                    ),

                    Headline(
                        explaination = "Regular expressions are powerful but should be used carefully for readability.",
                        tip = "Keep regex patterns simple and well-commented."
                    )

                )
            ),



            )



    ),

    NoteModule(
        topic = "JS and HTML DOM",
        topicId = 6,
        subtopics = listOf(

            Subtopic(
                questions = listOf(
                    QuizQuestion("What does DOM stand for?", listOf("Data Object Model", "Document Object Model", "Digital Order Model", "Desktop Object Management"), 1),
                    QuizQuestion("How does the DOM represent an HTML document?", listOf("As a flat text file", "As a tree of objects", "As a series of arrays", "As a CSS stylesheet"), 1),
                    QuizQuestion("Which object represents the root of the web page in JavaScript?", listOf("window", "document", "html", "body"), 1),
                    QuizQuestion("Can JavaScript delete HTML elements using the DOM?", listOf("Yes", "No", "Only if they are empty", "Only in Linux browsers"), 0),
                    QuizQuestion("What is the primary purpose of the DOM?", listOf("To store passwords", "To provide an interface to manipulate web pages", "To compile JavaScript", "To speed up internet connection"), 1)
                ),
                sutopicId = 61,
                subTopicName = "JS DOM Introduction",
                headlines = listOf(

                    Headline(
                        headline = "The Document Object Model(DOM)",
                        explaination = "The Document Object Model (DOM) is a programming interface for HTML documents. It represents the structure of a web page as a tree of objects."
                    ),

                    Headline(
                        headline = "What is the DOM",
                        explaination = "The DOM allows JavaScript to access, change, add, or delete HTML elements dynamically.",
                        tip = "The DOM treats every HTML element as an object.",
                        codeExample = """
                    document.title = "New Page Title";
                    """.trimIndent(),
                        afterCodeEplainations = "JavaScript accesses the document object to modify the page title."
                    ),

                    Headline(
                        headline = "DOM and JS",
                        explaination = "JavaScript uses the DOM to manipulate web pages in real-time, responding to user actions without reloading the page.",
                        tip = "DOM makes web pages interactive."
                    )

                )
            ),

            Subtopic(
                questions = listOf(
                    QuizQuestion("Which method selects a single element by its unique ID?", listOf("getElementsByClassName()", "querySelector()", "getElementById()", "getElementsByName()"), 2),
                    QuizQuestion("What does 'getElementsByClassName' return?", listOf("A single element", "An HTMLCollection", "An array of strings", "null"), 1),
                    QuizQuestion("Which selector is the most flexible and uses CSS syntax?", listOf("getElementById", "getElementsByTagName", "querySelector", "getElementByName"), 2),
                    QuizQuestion("What is returned if 'getElementById' does not find a match?", listOf("undefined", "null", "NaN", "0"), 1),
                    QuizQuestion("Which method would you use to select all <p> elements?", listOf("querySelector('p')", "getElementById('p')", "getElementsByTagName('p')", "select('p')"), 2)
                ),
                sutopicId = 62,
                subTopicName = "JS DOM Selectors",
                headlines = listOf(

                    Headline(
                        headline = "JS DOM Selectors",
                        explaination = "DOM selectors are methods used to find and select HTML elements."
                    ),

                    Headline(
                        headline = "Select the Topmost Elements",
                        explaination = "The document object represents the entire HTML document.",
                        tip = "document is the root of the DOM tree.",
                        codeExample = """
                    console.log(document.body);
                    console.log(document.head);
                    """.trimIndent(),
                        afterCodeEplainations = "Accesses the body and head elements."
                    ),

                    Headline(
                        headline = "Select an Element By ID",
                        explaination = "getElementById() selects a single element using its unique ID.",
                        codeExample = """
                    document.getElementById("title");
                    """.trimIndent()
                    ),

                    Headline(
                        explaination = "Returns null if the ID does not exist.",
                        codeExample = """
                    const el = document.getElementById("missing");
                    console.log(el);
                    """.trimIndent(),
                        afterCodeEplainations = "Outputs null if not found."
                    ),

                    Headline(
                        headline = "Select Elements by Class Name",
                        explaination = "getElementsByClassName() selects multiple elements with the same class.",
                        codeExample = """
                    document.getElementsByClassName("box");
                    """.trimIndent(),
                        afterCodeEplainations = "Returns an HTMLCollection."
                    ),

                    Headline(
                        explaination = "HTMLCollection can be accessed using index.",
                        codeExample = """
                    document.getElementsByClassName("box")[0];
                    """.trimIndent(),
                        afterCodeEplainations = "Accesses the first matched element."
                    ),

                    Headline(
                        headline = "Select Elements by Tag Name",
                        explaination = "getElementsByTagName() selects elements by their HTML tag.",
                        codeExample = """
                    document.getElementsByTagName("p");
                    """.trimIndent(),
                        afterCodeEplainations = "Selects all paragraph elements."
                    ),

                    Headline(
                        explaination = "Returns a live HTMLCollection.",
                        codeExample = """
                    document.getElementsByTagName("div").length;
                    """.trimIndent(),
                        afterCodeEplainations = "Counts div elements."
                    ),

                    Headline(
                        headline = " Select Elements by Name",
                        explaination = "getElementsByName() selects elements using the name attribute.",
                        tip = "Mostly used with form elements.",
                        codeExample = """
                    document.getElementsByName("username");
                    """.trimIndent(),
                        afterCodeEplainations = "Returns a NodeList."
                    ),

                    Headline(
                        explaination = "Useful for radio buttons and inputs.",
                        codeExample = """
                    document.getElementsByName("gender")[0];
                    """.trimIndent(),
                        afterCodeEplainations = "Selects the first radio button."
                    ),

                    Headline(
                        headline = "Select Elements using CSS Selectors",
                        explaination = "querySelector() selects the first matching CSS selector.",
                        codeExample = """
                    document.querySelector(".card");
                    """.trimIndent(),
                        afterCodeEplainations = "Returns the first matched element."
                    ),

                    Headline(
                        explaination = "querySelectorAll() selects all matching elements.",
                        codeExample = """
                    document.querySelectorAll(".card");
                    """.trimIndent(),
                        afterCodeEplainations = "Returns a NodeList."
                    ),

                    Headline(
                        explaination = "NodeList supports forEach().",
                        codeExample = """
                    document.querySelectorAll(".card").forEach(el => console.log(el));
                    """.trimIndent(),
                        afterCodeEplainations = "Loops through elements."
                    ),

                    Headline(
                        explaination = "CSS selectors give powerful selection options.",
                        tip = "querySelector is the most flexible selector."
                    )

                )
            ),

            Subtopic(
                sutopicId = 63,
                questions = listOf(
                    QuizQuestion("In the DOM, what is considered a 'node'?", listOf("Only HTML tags", "Elements, text, and comments", "Only JavaScript functions", "Only CSS classes"), 1),
                    QuizQuestion("Which property is used to find the parent of a specific node?", listOf("childNode", "parentNode", "superNode", "rootNode"), 1),
                    QuizQuestion("What is the relationship between elements that share the same parent?", listOf("Parents", "Siblings", "Descendants", "Attributes"), 1),
                    QuizQuestion("Does a text inside a paragraph count as a node?", listOf("Yes, a text node", "No, only tags are nodes", "Only if it has an ID", "Only if it is empty"), 0),
                    QuizQuestion("What does 'document.nodeType' return?", listOf("A string", "A numeric value representing the node type", "The HTML code", "The page title"), 1)
                ),
                subTopicName = "JS DOM Nodes",
                headlines = listOf(

                    Headline(
                        headline = "DOM Nodes ",
                        explaination = "A node is any object in the DOM tree."
                    ),

                    Headline(
                        headline = "What is a Node",
                        explaination = "Nodes include elements, attributes, text, and comments."
                    ),

                    Headline(
                        headline = "Example",
                        explaination = "HTML elements are nodes.",
                        codeExample = """
                    <p>Hello</p>
                    """.trimIndent()
                    ),

                    Headline(
                        headline = "Node Relations",
                        explaination = "Nodes have parent, child, and sibling relationships.",
                        codeExample = """
                    element.parentNode;
                    element.childNodes;
                    """.trimIndent(),
                        afterCodeEplainations = "Used to navigate the DOM tree."
                    ),

                    Headline(
                        headline = "Everything is a Node",
                        explaination = "The entire document including text and comments are nodes.",
                        codeExample = """
                    document.nodeType;
                    """.trimIndent(),
                        afterCodeEplainations = "Returns node type."
                    )

                )
            ),

            Subtopic(
                sutopicId = 64,
                questions = listOf(
                    QuizQuestion("Which property should you use to get only the children that are HTML elements?", listOf("childNodes", "children", "allNodes", "innerNodes"), 1),
                    QuizQuestion("What is the difference between 'firstChild' and 'firstElementChild'?", listOf("No difference", "firstChild includes text/whitespace nodes", "firstElementChild includes comments", "firstChild is faster"), 1),
                    QuizQuestion("Which method finds the nearest ancestor that matches a CSS selector?", listOf("parent()", "closest()", "find()", "ancestor()"), 1),
                    QuizQuestion("How do you move to the next element at the same level in the tree?", listOf("nextSibling", "nextElementChild", "nextElementSibling", "moveNext()"), 2),
                    QuizQuestion("Why is 'previousElementSibling' preferred over 'previousSibling'?", listOf("It is shorter", "It skips text and whitespace nodes", "It works in older browsers", "It deletes the previous node"), 1)
                ),
                subTopicName = "JS DOM Navigation",
                headlines = listOf(

                    Headline(
                        headline = "JS Navigation Nodes",
                        explaination = "DOM navigation allows moving through nodes."
                    ),

                    Headline(
                        headline = "Navigating Element Nodes",
                        explaination = "JavaScript provides properties to navigate elements.",
                        codeExample = """
                    element.firstElementChild;
                    """.trimIndent(),
                        afterCodeEplainations = "Accesses first child element."
                    ),

                    Headline(
                        headline = "Parent and Children",
                        explaination = "Use parentElement and children.",
                        codeExample = """
                    element.parentElement;
                    """.trimIndent()
                    ),

                    Headline(
                        explaination = "children returns HTMLCollection.",
                        codeExample = """
                    element.children;
                    """.trimIndent()
                    ),

                    Headline(
                        explaination = "childNodes includes text nodes.",
                        codeExample = """
                    element.childNodes;
                    """.trimIndent()
                    ),

                    Headline(
                        explaination = "firstChild may return text.",
                        codeExample = """
                    element.firstChild;
                    """.trimIndent()
                    ),

                    Headline(
                        explaination = "Use firstElementChild for elements.",
                        codeExample = """
                    element.firstElementChild;
                    """.trimIndent()
                    ),

                    Headline(
                        explaination = "lastElementChild selects last element.",
                        codeExample = """
                    element.lastElementChild;
                    """.trimIndent()
                    ),

                    Headline(
                        explaination = "parentNode includes document.",
                        codeExample = """
                    element.parentNode;
                    """.trimIndent()
                    ),

                    Headline(
                        explaination = "closest() finds nearest ancestor.",
                        codeExample = """
                    element.closest("div");
                    """.trimIndent()
                    ),

                    Headline(
                        headline = "Siblings",
                        explaination = "Sibling nodes share the same parent.",
                        codeExample = """
                    element.nextElementSibling;
                    """.trimIndent(),
                        afterCodeEplainations = "Selects next sibling."
                    ),

                    Headline(
                        explaination = "previousElementSibling selects previous.",
                        codeExample = """
                    element.previousElementSibling;
                    """.trimIndent(),
                        afterCodeEplainations = "Moves backward."
                    ),

                    Headline(
                        explaination = "nextSibling may return text.",
                        codeExample = """
                    element.nextSibling;
                    """.trimIndent(),
                        afterCodeEplainations = "Includes text nodes."
                    ),

                    Headline(
                        explaination = "Use element siblings for accuracy.",
                        codeExample = """
                    element.previousElementSibling;
                    """.trimIndent(),
                        afterCodeEplainations = "Best practice."
                    )

                )
            ),

            Subtopic(
                sutopicId = 65,
                questions = listOf(
                    QuizQuestion("Which property is used to get the HTML content inside an element?", listOf("textContent", "innerText", "innerHTML", "value"), 2),
                    QuizQuestion("How do you create a new <div> element in memory?", listOf("document.newElement('div')", "document.createElement('div')", "new Div()", "document.add('div')"), 1),
                    QuizQuestion("Which method is used to add a node as the last child of a parent?", listOf("prepend()", "appendChild()", "insert()", "replace()"), 1),
                    QuizQuestion("What is the modern way to remove an element directly?", listOf("element.delete()", "element.remove()", "document.remove(element)", "parent.kill(element)"), 1),
                    QuizQuestion("How do you change the 'src' attribute of an image?", listOf("img.src = '...' or setAttribute()", "img.change('src')", "img.value = '...'", "img.setAttribute('name')"), 0)
                ),
                subTopicName = "JS DOM HTML",
                headlines = listOf(

                    Headline(
                        headline = "JS DOM HTML",
                        explaination = "The DOM allows JavaScript to read and modify HTML content dynamically."
                    ),

                    Headline(
                        headline = "Getting Element's Content",
                        explaination = "JavaScript can access the content of HTML elements.",
                        codeExample = """
                    const text = document.getElementById("demo").innerHTML;
                    console.log(text);
                    """.trimIndent(),
                        afterCodeEplainations = "innerHTML returns the HTML content inside the element."
                    ),

                    Headline(
                        headline = "Replacing Element Contents",
                        explaination = "You can replace content using innerHTML or textContent.",
                        tip = "Use textContent for plain text.",
                        codeExample = """
                    document.getElementById("demo").innerHTML = "New Content";
                    """.trimIndent()
                    ),

                    Headline(
                        headline = "Creating Elements(Nodes)",
                        explaination = "New HTML elements can be created dynamically.",
                        codeExample = """
                    const p = document.createElement("p");
                    p.textContent = "Hello World";
                    """.trimIndent(),
                        afterCodeEplainations = "createElement creates a new node."
                    ),

                    Headline(
                        explaination = "Elements must be added to the DOM.",
                        codeExample = """
                    document.body.appendChild(p);
                    """.trimIndent(),
                        afterCodeEplainations = "Adds the element to the page."
                    ),

                    Headline(
                        explaination = "append() allows adding multiple nodes.",
                        codeExample = """
                    document.body.append(p);
                    """.trimIndent(),
                        afterCodeEplainations = "append is more flexible."
                    ),

                    Headline(
                        explaination = "prepend() inserts at the beginning.",
                        codeExample = """
                    document.body.prepend(p);
                    """.trimIndent(),
                        afterCodeEplainations = "Element appears first."
                    ),

                    Headline(
                        headline = "Inserting to Elements",
                        explaination = "insertBefore inserts before a reference node.",
                        codeExample = """
                    parent.insertBefore(newNode, referenceNode);
                    """.trimIndent(),
                        afterCodeEplainations = "Controls insertion position."
                    ),

                    Headline(
                        explaination = "replaceChild replaces existing nodes.",
                        codeExample = """
                    parent.replaceChild(newNode, oldNode);
                    """.trimIndent(),
                        afterCodeEplainations = "Old node is removed."
                    ),

                    Headline(
                        explaination = "insertAdjacentHTML inserts HTML text.",
                        codeExample = """
                    element.insertAdjacentHTML("beforeend", "<span>Hi</span>");
                    """.trimIndent(),
                        afterCodeEplainations = "Useful for HTML strings."
                    ),

                    Headline(
                        headline = "Removing Elements",
                        explaination = "Elements can be removed from the DOM.",
                        tip = "Modern browsers support remove().",
                        codeExample = """
                    element.remove();
                    """.trimIndent(),
                        afterCodeEplainations = "Element is deleted."
                    ),

                    Headline(
                        explaination = "removeChild removes via parent.",
                        codeExample = """
                    parent.removeChild(element);
                    """.trimIndent(),
                        afterCodeEplainations = "Older approach."
                    ),

                    Headline(
                        headline = "Working with Attributes",
                        explaination = "Attributes define element behavior.",
                        codeExample = """
                    element.getAttribute("class");
                    """.trimIndent()
                    ),

                    Headline(
                        headline = "Setting or Changing Attribute Value",
                        explaination = "Attributes can be added or modified.",
                        codeExample = """
                    element.setAttribute("id", "main");
                    """.trimIndent(),
                        afterCodeEplainations = "Sets attribute value."
                    ),

                    Headline(
                        explaination = "removeAttribute deletes attributes.",
                        codeExample = """
                    element.removeAttribute("id");
                    """.trimIndent(),
                        afterCodeEplainations = "Attribute removed."
                    )

                )
            ),

            Subtopic(
                questions = listOf(
                    QuizQuestion("How do you access the style properties of an element?", listOf("element.css", "element.style", "element.design", "element.class"), 1),
                    QuizQuestion("How do you write 'background-color' when styling via JavaScript?", listOf("background-color", "backgroundColor", "BackgroundColor", "background_color"), 1),
                    QuizQuestion("Which property value is used to hide an element from the page completely?", listOf("display = 'none'", "visibility = 'hidden'", "opacity = 0", "display = 'block'"), 0),
                    QuizQuestion("What happens if you set 'element.style.color = \"blue\"'?", listOf("It changes the text color", "It changes the border color", "It changes the background", "It does nothing"), 0),
                    QuizQuestion("Can you set multiple styles at once using the .style property (e.g., .style.color and .style.fontSize)?", listOf("Yes", "No", "Only in Linux environments", "Only for div elements"), 0)
                ),
                sutopicId = 66,
                subTopicName = "JS DOM CSS or Styling",
                headlines = listOf(

                    Headline(
                        headline = "JS DOM CSS or Styling",
                        explaination = "JavaScript can change CSS styles dynamically."
                    ),

                    Headline(
                        headline = "Styling Elements with DOM",
                        explaination = "Use the style property to modify CSS."
                    ),

                    Headline(
                        headline = "Example",
                        explaination = "Changing element styles.",
                        codeExample = """
                    const box = document.getElementById("box");
                    box.style.color = "red";
                    box.style.backgroundColor = "yellow";
                    """.trimIndent()
                    ),

                    Headline(
                        headline = "Hiding and Showing an Element",
                        explaination = "CSS display property is commonly used.",
                        codeExample = """
                    element.style.display = "none";
                    element.style.display = "block";
                    """.trimIndent(),
                        afterCodeEplainations = "Toggles visibility."
                    ),

                    Headline(
                        headline = "What about Properties with Hyphen?",
                        explaination = "Hyphenated CSS properties use camelCase.",
                        codeExample = """
                    element.style.fontSize = "20px";
                    """.trimIndent(),
                        afterCodeEplainations = "font-size becomes fontSize."
                    )

                )
            ),

            Subtopic(
                sutopicId = 67,
                subTopicName = "JS DOM Effects",
                questions = listOf(
                    QuizQuestion("How can you simulate a 'Fade Out' effect using style properties?", listOf("Change height to 0", "Change opacity to 0", "Change display to flex", "Change color to white"), 1),
                    QuizQuestion("Which CSS property allows DOM effects like fading to happen smoothly over time?", listOf("animation", "transition", "speed", "duration"), 1),
                    QuizQuestion("To create a sliding effect, which property is typically manipulated?", listOf("width", "height", "border", "padding"), 1),
                    QuizQuestion("What value should 'opacity' be to make an element fully visible?", listOf("0", "0.5", "1", "100"), 2),
                    QuizQuestion("If you set 'transition = \"opacity 1s\"', how long will the fade effect take?", listOf("1 millisecond", "1 minute", "1 second", "Immediately"), 2)
                ),
                headlines = listOf(

                    Headline(
                        headline = "JS DOM Effects",
                        explaination = "DOM effects add animation and interaction."
                    ),

                    Headline(
                        headline = "Fading Effects",
                        explaination = "Fading can be simulated using opacity.",
                        tip = "Use CSS transitions for smooth effects.",
                        codeExample = """
                    element.style.opacity = 0;
                    """.trimIndent(),
                        afterCodeEplainations = "Element fades out."
                    ),

                    Headline(
                        headline = "Fade Out",
                        explaination = "Gradually hides an element.",
                        codeExample = """
                    element.style.transition = "opacity 1s";
                    element.style.opacity = 0;
                    """.trimIndent(),
                        afterCodeEplainations = "Opacity decreases."
                    ),

                    Headline(
                        headline = "Fade In",
                        explaination = "Gradually shows an element.",
                        codeExample = """
                    element.style.opacity = 1;
                    """.trimIndent(),
                        afterCodeEplainations = "Element becomes visible."
                    ),

                    Headline(
                        headline = "Sliding Effect",
                        explaination = "Sliding can be achieved with height.",
                        codeExample = """
                    element.style.height = "0px";
                    """.trimIndent(),
                        afterCodeEplainations = "Element collapses."
                    ),

                    Headline(
                        explaination = "Transitions control animation speed.",
                        codeExample = """
                    element.style.transition = "height 0.5s";
                    """.trimIndent(),
                        afterCodeEplainations = "Smooth sliding."
                    )

                )
            ),

            Subtopic(
                sutopicId = 68,
                subTopicName = "JS DOM Events",
                questions = listOf(
                    QuizQuestion("Which method is preferred for attaching multiple event listeners to one element?", listOf("onclick =", "addEventListener()", "attachEvent()", "listen()"), 1),
                    QuizQuestion("Which event fires when a user clicks a button?", listOf("hover", "change", "click", "submit"), 2),
                    QuizQuestion("When does the 'load' event fire on the window object?", listOf("When the HTML starts loading", "When the page has finished loading", "When a user leaves the page", "When a button is clicked"), 1),
                    QuizQuestion("Which event is best for detecting when a user types in a form field?", listOf("click", "change or input", "load", "resize"), 1),
                    QuizQuestion("What is the first argument of the 'addEventListener' method?", listOf("The function to run", "The event name (e.g., 'click')", "The element ID", "A boolean value"), 1)
                ),
                headlines = listOf(

                    Headline(
                        headline = "JS DOM Events",
                        explaination = "Events occur when users interact with a page."
                    ),

                    Headline(
                        headline = "The addEventListener() Method",
                        explaination = "Adds an event handler without overwriting others."
                    ),

                    Headline(
                        headline = "JClick Event",
                        explaination = "Triggered when an element is clicked.",
                        codeExample = """
                    button.addEventListener("click", function() {
                      alert("Clicked!");
                    });
                    """.trimIndent()
                    ),

                    Headline(
                        headline = "Load Event",
                        explaination = "Fires when the page finishes loading.",
                        codeExample = """
                    window.addEventListener("load", function() {
                      console.log("Page loaded");
                    });
                    """.trimIndent(),
                        afterCodeEplainations = "Runs after full load."
                    ),

                    Headline(
                        headline = "Change Event",
                        explaination = "Triggered when input value changes.",
                        tip = "Commonly used in forms.",
                        codeExample = """
                    input.addEventListener("change", function() {
                      console.log(input.value);
                    });
                    """.trimIndent(),
                        afterCodeEplainations = "Detects value changes."
                    )

                )
            ),



            )
    )
    ,


    NoteModule(
        topic = "JS and BOM",
        topicId = 7,
        subtopics = listOf(

            Subtopic(
                sutopicId = 71,
                subTopicName = "JS BOM Window",
                questions = listOf(
                    QuizQuestion("What does BOM stand for?", listOf("Browser Object Model", "Binary Object Management", "Browser Online Mode", "Basic Object Model"), 0),
                    QuizQuestion("Which object is the top-level object in the Browser Object Model?", listOf("document", "navigator", "window", "screen"), 2),
                    QuizQuestion("Which properties are used to get the width and height of the browser window viewport?", listOf("window.screenWidth/screenHeight", "window.innerWidth/innerHeight", "window.outerWidth/outerHeight", "window.width/height"), 1),
                    QuizQuestion("True or False: Global JavaScript variables automatically become properties of the window object.", listOf("True", "False"), 0),
                    QuizQuestion("Which BOM object would you use to find the current URL?", listOf("window.navigator", "window.location", "window.history", "window.document"), 1)
                ),
                headlines = listOf(

                    Headline(
                        headline = "What is the BOM",
                        explaination = "The Browser Object Model (BOM) allows JavaScript to interact with the browser outside the document content."
                    ),

                    Headline(
                        headline = "The Window Object",
                        explaination = "The window object represents the browser window and is the top-level object in the BOM.",
                        tip = "All global JavaScript objects are part of the window.",
                        codeExample = """
                    console.log(window.innerWidth);
                    """.trimIndent(),
                        afterCodeEplainations = "Accesses browser window properties."
                    ),

                    Headline(
                        headline = "Window Width and Height",
                        explaination = "JavaScript can detect browser window dimensions.",
                        codeExample = """
                    let width = window.innerWidth;
                    let height = window.innerHeight;
                    console.log(width, height);
                    """.trimIndent()
                    ),

                    Headline(
                        headline = "Window Object Properties",
                        explaination = "The window object provides properties like location, history, screen, and navigator."
                    )

                )
            ),

            Subtopic(
                sutopicId = 72,
                questions = listOf(
                    QuizQuestion("What is the difference between 'screen.width' and 'screen.availWidth'?", listOf("No difference", "availWidth excludes interface features like the Windows Taskbar", "width is only for mobile", "availWidth is only for Linux"), 1),
                    QuizQuestion("Which property returns the color resolution of the visitor's screen?", listOf("colorDepth", "pixelDepth", "resolution", "bitDepth"), 1),
                    QuizQuestion("How can you detect if a user is in 'portrait' or 'landscape' mode?", listOf("screen.rotation", "screen.orientation.type", "screen.view", "screen.mode"), 1),
                    QuizQuestion("What does 'screen.height' represent?", listOf("The height of the browser window", "The total height of the user's screen", "The height of the website content", "The height of the taskbar"), 1),
                    QuizQuestion("Which property returns the number of bits used to display one color?", listOf("bitRate", "colorDepth", "pixelRatio", "displayBits"), 1)
                ),
                subTopicName = "JS BOM Screen",
                headlines = listOf(

                    Headline(
                        headline = "JS BOM Screen",
                        explaination = "The screen object contains information about the user's screen."
                    ),

                    Headline(
                        headline = "The width Property",
                        explaination = "Returns the total screen width.",
                        tip = "Useful for responsive layouts.",
                        codeExample = """
                    console.log(screen.width);
                    """.trimIndent()
                    ),

                    Headline(
                        headline = "The availWidth Property",
                        explaination = "Returns the available screen width excluding system UI.",
                        codeExample = """
                    console.log(screen.availWidth);
                    """.trimIndent()
                    ),

                    Headline(
                        headline = "The height Property",
                        explaination = "Returns the total screen height.",
                        codeExample = """
                    console.log(screen.height);
                    """.trimIndent(),
                        afterCodeEplainations = "Includes taskbars."
                    ),

                    Headline(
                        headline = "The availHeight Property",
                        explaination = "Returns available screen height.",
                        codeExample = """
                    console.log(screen.availHeight);
                    """.trimIndent(),
                        afterCodeEplainations = "Excludes OS elements."
                    ),

                    Headline(
                        headline = "The orientation Property",
                        explaination = "Indicates screen orientation.",
                        codeExample = """
                    console.log(screen.orientation.type);
                    """.trimIndent(),
                        afterCodeEplainations = "Shows portrait or landscape."
                    ),

                    Headline(
                        headline = "The pixelDepth Property",
                        explaination = "Returns screen color resolution.",
                        codeExample = """
                    console.log(screen.pixelDepth);
                    """.trimIndent()
                    ),

                    Headline(
                        headline = "The colorDepth Property",
                        explaination = "Returns number of bits used to display colors.",
                        codeExample = """
                    console.log(screen.colorDepth);
                    """.trimIndent(),
                        afterCodeEplainations = "Higher means better color quality."
                    )

                )
            ),

            Subtopic(
                sutopicId = 73,
                questions = listOf(
                    QuizQuestion("Which property returns the full URL of the current page?", listOf("location.url", "location.href", "location.path", "location.link"), 1),
                    QuizQuestion("What does 'location.protocol' return?", listOf("The domain name", "The web protocol (e.g., http: or https:)", "The port number", "The file extension"), 1),
                    QuizQuestion("If the URL is 'https://www.example.com/shop', what does 'location.hostname' return?", listOf("https:", "www.example.com", "/shop", "example"), 1),
                    QuizQuestion("Which property returns the path and filename of the current page?", listOf("location.pathname", "location.origin", "location.host", "location.hash"), 0),
                    QuizQuestion("Can the 'location.href' property be used to redirect a user to a new page?", listOf("Yes, by assigning it a new URL string", "No, it is read-only", "Only if the user clicks a button", "Only in Chrome"), 0)
                ),
                subTopicName = "JS BOM Location",
                headlines = listOf(

                    Headline(
                        headline = "JS BOM Location",
                        explaination = "The location object contains information about the current URL."
                    ),

                    Headline(
                        headline = "The href Property",
                        explaination = "Returns the full URL of the current page.",
                        tip = "Can also redirect users.",
                        codeExample = """
                    console.log(location.href);
                    """.trimIndent(),
                        afterCodeEplainations = "Outputs full address."
                    ),

                    Headline(
                        headline = "The protocol Property",
                        explaination = "Returns the protocol used (http or https).",
                        codeExample = """
                    console.log(location.protocol);
                    """.trimIndent()
                    ),

                    Headline(
                        headline = "The hostname Property",
                        explaination = "Returns the domain name.",
                        codeExample = """
                    console.log(location.hostname);
                    """.trimIndent(),
                        afterCodeEplainations = "Does not include protocol."
                    ),

                    Headline(
                        headline = "The pathname Property",
                        explaination = "Returns the page path.",
                        codeExample = """
                    console.log(location.pathname);
                    """.trimIndent(),
                        afterCodeEplainations = "Useful for routing."
                    )

                )
            ),

            Subtopic(
                sutopicId = 74,
                subTopicName = "JS BOM History",
                questions = listOf(
                    QuizQuestion("Which object is used to navigate to previously visited pages?", listOf("navigator", "location", "history", "window"), 2),
                    QuizQuestion("What does 'history.back()' do?", listOf("Refreshes the page", "Loads the previous URL in the history list", "Deletes history", "Goes to the homepage"), 1),
                    QuizQuestion("Which method is equivalent to clicking the 'Forward' button in the browser?", listOf("history.next()", "history.forward()", "history.go(1)", "Both B and C"), 3),
                    QuizQuestion("What does the 'history.length' property represent?", listOf("The number of characters in the URL", "The number of URLs in the history list for the current session", "The size of the cache", "The number of days history is saved"), 1),
                    QuizQuestion("How can you go back two pages using the history object?", listOf("history.back(2)", "history.go(-2)", "history.previous.previous", "history.pop(2)"), 1)
                ),
                headlines = listOf(

                    Headline(
                        headline = "JS BOM History",
                        explaination = "The history object allows navigation through browser history."
                    ),

                    Headline(
                        headline = "The length Property",
                        explaination = "Returns number of visited URLs in session."
                    ),

                    Headline(
                        headline = "The back() Method",
                        explaination = "Navigates to the previous page.",
                    ),

                    Headline(
                        headline = "The forward() Method",
                        explaination = "Navigates to the next page.",
                    )

                )
            ),

            Subtopic(
                sutopicId = 75,
                questions = listOf(
                    QuizQuestion("Which property of the navigator object is used to detect if the browser is online?", listOf("navigator.internet", "navigator.onLine", "navigator.status", "navigator.connected"), 1),
                    QuizQuestion("What information does 'navigator.userAgent' provide?", listOf("The user's name", "The browser's ID string sent to servers", "The user's IP address", "The history of the user"), 1),
                    QuizQuestion("Which property returns the language of the browser?", listOf("navigator.lang", "navigator.language", "navigator.locale", "navigator.browserLang"), 1),
                    QuizQuestion("What does 'navigator.platform' return?", listOf("The browser engine", "The operating system/platform", "The CPU speed", "The screen resolution"), 1),
                    QuizQuestion("Is the 'navigator' object considered 100% reliable for identifying a user's browser?", listOf("Yes, always", "No, because user agent strings can be spoofed", "Only in strict mode", "Only for mobile devices"), 1)
                ),
                subTopicName = "JS BOM Navigator ",
                headlines = listOf(

                    Headline(
                        headline = "JS BOM Navigator",
                        explaination = "The navigator object contains browser information."
                    ),

                    Headline(
                        headline = "The Platform Property",
                        explaination = "Returns operating system information.",
                        tip = "Not always reliable.",
                        codeExample = """
                    console.log(navigator.platform);
                    """.trimIndent(),
                        afterCodeEplainations = "Displays OS type."
                    ),

                    Headline(
                        headline = "The Language Property",
                        explaination = "Returns browser language.",
                        codeExample = """
                    console.log(navigator.language);
                    """.trimIndent()
                    ),

                    Headline(
                        headline = "The appName Property",
                        explaination = "Returns browser name.",
                        codeExample = """
                    console.log(navigator.appName);
                    """.trimIndent(),
                        afterCodeEplainations = "Mostly legacy."
                    ),

                    Headline(
                        headline = "The appCodeName Property",
                        explaination = "Returns browser code name.",
                        codeExample = """
                    console.log(navigator.appCodeName);
                    """.trimIndent(),
                        afterCodeEplainations = "Usually Mozilla."
                    ),

                    Headline(
                        headline = "The appVersion Property",
                        explaination = "Returns browser version info.",
                        codeExample = """
                    console.log(navigator.appVersion);
                    """.trimIndent(),
                        afterCodeEplainations = "Contains user agent info."
                    ),

                    Headline(
                        headline = "The userAgent Property",
                        explaination = "Returns full browser user-agent string.",
                        codeExample = """
                    console.log(navigator.userAgent);
                    """.trimIndent(),
                        afterCodeEplainations = "Used for browser detection."
                    ),

                    Headline(
                        headline = "The onLine Property",
                        explaination = "Detects internet connection status.",
                        codeExample = """
                    console.log(navigator.onLine);
                    """.trimIndent(),
                        afterCodeEplainations = "Returns true or false."
                    )

                )
            ),

            Subtopic(
                sutopicId = 76,
                questions = listOf(
                    QuizQuestion("Which pop-up box returns a boolean value (true/false)?", listOf("alert()", "confirm()", "prompt()", "window.box()"), 1),
                    QuizQuestion("What does 'prompt()' return if the user clicks 'Cancel'?", listOf("An empty string", "undefined", "null", "false"), 2),
                    QuizQuestion("Which pop-up box is used specifically to display a message with only an 'OK' button?", listOf("confirm()", "prompt()", "alert()", "input()"), 2),
                    QuizQuestion("What happens to code execution when a pop-up box is displayed?", listOf("It continues in the background", "It stops until the user interacts with the box", "It speeds up", "It crashes the browser"), 1),
                    QuizQuestion("Can you provide a default value for the text field in a 'prompt()' box?", listOf("Yes, as the second argument", "No", "Only using CSS", "Only in Linux versions of browsers"), 0)
                ),
                subTopicName = "JS BOM Pop-up Boxes ",
                headlines = listOf(

                    Headline(
                        headline = "JS BOM Pop-up Boxes",
                        explaination = "JavaScript provides built-in dialog boxes."
                    ),

                    Headline(
                        headline = "Alert Pop-up Boxes",
                        explaination = "Displays a message to the user.",
                        tip = "Stops code execution until closed.",
                        codeExample = """
                    alert("Hello!");
                    """.trimIndent(),
                        afterCodeEplainations = "Shows alert message."
                    ),

                    Headline(
                        headline = "Confirm Pop-up Boxes",
                        explaination = "Used for user confirmation.",
                        codeExample = """
                    const result = confirm("Are you sure?");
                    """.trimIndent(),
                        afterCodeEplainations = "Returns true or false."
                    ),

                    Headline(
                        headline = "Prompt Pop-up Boxes",
                        explaination = "Collects user input.",
                        tip = "Returns null if cancelled.",
                        codeExample = """
                    const name = prompt("Enter name:");
                    """.trimIndent(),
                        afterCodeEplainations = "Stores user input."
                    )

                )
            ),

            Subtopic(
                sutopicId = 77,
                questions = listOf(
                    QuizQuestion("Which property is used to create, read, and delete cookies?", listOf("window.cookie", "document.cookie", "navigator.cookie", "location.cookie"), 1),
                    QuizQuestion("How do you delete a cookie in JavaScript?", listOf("document.deleteCookie('name')", "Set the expiration date to a past date", "Set the value to null", "Clear the browser cache"), 1),
                    QuizQuestion("What character is used to separate multiple cookies in the 'document.cookie' string?", listOf("Comma (,)", "Semicolon (;)", "Colon (:)", "Pipe (|)"), 1),
                    QuizQuestion("What does the 'path=/' attribute do in a cookie?", listOf("It hides the cookie", "It makes the cookie accessible on all pages of the site", "It encrypts the cookie", "It saves the cookie to the local hard drive"), 1),
                    QuizQuestion("How do you update the value of an existing cookie?", listOf("You must delete it first", "Assign a new value to the same cookie name", "Use document.updateCookie()", "Cookies cannot be changed"), 1)
                ),
                subTopicName = "JS BOM Cookies",
                headlines = listOf(

                    Headline(
                        headline = "JS BOM Cookies",
                        explaination = "Cookies store data in the browser."
                    ),

                    Headline(
                        headline = "Creating a Cookie",
                        explaination = "Cookies are created using document.cookie.",
                        tip = "Cookies store small data.",
                        codeExample = """
                    document.cookie = "username=John";
                    """.trimIndent(),
                        afterCodeEplainations = "Creates a cookie."
                    ),

                    Headline(
                        explaination = "Cookies can have expiration dates.",
                        codeExample = """
                    document.cookie = "user=John; expires=Fri, 31 Dec 2026";
                    """.trimIndent()
                    ),

                    Headline(
                        explaination = "Cookies can include paths.",
                        codeExample = """
                    document.cookie = "theme=dark; path=/";
                    """.trimIndent(),
                        afterCodeEplainations = "Accessible site-wide."
                    ),

                    Headline(
                        explaination = "Multiple cookies are separated by semicolons.",
                        codeExample = """
                    console.log(document.cookie);
                    """.trimIndent(),
                        afterCodeEplainations = "Returns all cookies."
                    ),

                    Headline(
                        headline = "Getting a Cookie Value",
                        explaination = "Cookies are retrieved as a string.",
                        codeExample = """
                    console.log(document.cookie);
                    """.trimIndent(),
                        afterCodeEplainations = "Needs parsing."
                    ),

                    Headline(
                        headline = "Changing a Cookie Value",
                        explaination = "Reassign cookie with same name.",
                        codeExample = """
                    document.cookie = "username=Mike";
                    """.trimIndent(),
                        afterCodeEplainations = "Overrides value."
                    ),

                    Headline(
                        headline = "Deleting a Cookie",
                        explaination = "Set expiration date in the past.",
                        codeExample = """
                    document.cookie = "username=; expires=Thu, 01 Jan 1970";
                    """.trimIndent(),
                        afterCodeEplainations = "Cookie removed."
                    )

                )
            )

        )
    )
    ,

    NoteModule(
        topic = "JS AJAX",
        topicId=8,
        subtopics = listOf(

            Subtopic(
                sutopicId = 81,
                subTopicName = "JS AJAX Introduction",
                questions = listOf(
                    QuizQuestion("What does AJAX stand for?", listOf("Asynchronous JavaScript And XML", "Advanced JSON And XSL", "Automated JavaScript And XHTML", "Asynchronous Java And XML"), 0),
                    QuizQuestion("What is the main benefit of using AJAX?", listOf("It makes the website look better", "It allows updating parts of a web page without reloading the whole page", "It encrypts the entire website", "It replaces the need for CSS"), 1),
                    QuizQuestion("Which format is most commonly used for data exchange in modern AJAX (replacing XML)?", listOf("HTML", "JSON", "Plain Text", "CSV"), 1),
                    QuizQuestion("Where can you see the background AJAX requests being made in your browser?", listOf("Elements tab", "Sources tab", "Network tab", "Application tab"), 2),
                    QuizQuestion("True or False: AJAX requires a browser plugin like Flash to work.", listOf("True", "False"), 1)
                ),
                headlines = listOf(
                    Headline(
                        headline = "What is AJAX?",
                        explaination = "AJAX stands for Asynchronous JavaScript And XML. It allows web pages to communicate with a server in the background without reloading the entire page. AJAX improves speed, performance, and user experience by updating only required parts of the page."
                    ),
                    Headline(
                        headline = "Major Features of AJAX",
                        explaination = "AJAX supports asynchronous communication, faster response, background data loading, reduced server load, and improved user experience. It commonly uses JSON instead of XML today."
                    ),
                    Headline(
                        headline = "Simple Example",
                        explaination = "This example uses XMLHttpRequest to fetch data from a server and log the response in the browser console.",
                        tip = "Open the browser DevTools and check the Network tab to see the AJAX request.",
                        codeExample =
                            """
                const xhr = new XMLHttpRequest();
                xhr.open("GET", "https://jsonplaceholder.typicode.com/posts/1", true);
                xhr.onload = function () {
                  console.log(xhr.responseText);
                };
                xhr.send();
                """.trimIndent()
                    )
                )
            ),

            Subtopic(
                sutopicId = 82,
                questions = listOf(
                    QuizQuestion("Which JavaScript object is used to perform traditional AJAX requests?", listOf("FetchObject", "XMLHttpRequest", "ServerRequest", "HttpObject"), 1),
                    QuizQuestion("Which method is used to initialize a newly created request?", listOf("send()", "start()", "open()", "init()"), 2),
                    QuizQuestion("What does the 'status' property of an XMLHttpRequest object contain?", listOf("The ready state", "The HTTP status code (like 200 or 404)", "The response text", "The server URL"), 1),
                    QuizQuestion("Which method is used to cancel a request that is already in progress?", listOf("stop()", "abort()", "cancel()", "close()"), 1),
                    QuizQuestion("How do you create a new instance of the XMLHttpRequest object?", listOf("let xhr = XMLHttpRequest();", "let xhr = new XMLHttpRequest();", "let xhr = create xhr;", "let xhr = window.request();"), 1)
                ),
                subTopicName = "JS AJAX XMLHttpRequest",
                headlines = listOf(
                    Headline(
                        headline = "The XMLHttpRequest Object",
                        explaination = "XMLHttpRequest is a JavaScript object used to send HTTP requests to a server and receive responses. It is the core technology behind traditional AJAX.",
                        codeExample =
                            """
                const xhr = new XMLHttpRequest();
                console.log(xhr);
                """.trimIndent()
                    ),
                    Headline(
                        headline = "Creating XMLHttpRequest",
                        explaination = "An XMLHttpRequest object is created using the new keyword. This object is then used to configure and send requests.",
                        codeExample =
                            """
                let request = new XMLHttpRequest();
                console.log("Request created:", request);
                """.trimIndent()
                    ),
                    Headline(
                        headline = "The XMLHttpRequest Properties",
                        explaination = "Important properties include readyState (request status), status (HTTP status code), responseText (server response), and responseURL.",
                        codeExample =
                            """
                const xhr = new XMLHttpRequest();
                xhr.open("GET", "https://jsonplaceholder.typicode.com/users/1", true);
                xhr.onload = function () {
                  console.log(xhr.status);
                  console.log(xhr.responseText);
                };
                xhr.send();
                """.trimIndent()
                    ),
                    Headline(
                        headline = "The XMLHttpRequest Methods",
                        explaination = "Common methods include open() to initialize the request, send() to send it, setRequestHeader() to set headers, and abort() to cancel a request.",
                        codeExample =
                            """
                const xhr = new XMLHttpRequest();
                xhr.open("GET", "https://jsonplaceholder.typicode.com/todos/1", true);
                xhr.send();
                """.trimIndent()
                    )
                )
            ),


            Subtopic(
                sutopicId = 83,
                questions = listOf(
                    QuizQuestion("Which HTTP method is typically used to retrieve data from a server?", listOf("POST", "GET", "PUT", "DELETE"), 1),
                    QuizQuestion("What is the purpose of the 'send()' method?", listOf("To initialize the URL", "To define the callback", "To actually transmit the request to the server", "To parse JSON data"), 2),
                    QuizQuestion("In a POST request, how is the data usually sent?", listOf("As query strings in the URL", "Inside the send() method as a body", "In the browser cookies", "Via the document title"), 1),
                    QuizQuestion("Why is POST considered more secure than GET for sending sensitive data?", listOf("It is faster", "Data is not visible in the URL", "It automatically encrypts data", "It works only on Linux servers"), 1),
                    QuizQuestion("Which method is used to set the 'Content-Type' header before sending a POST request?", listOf("setHeader()", "setContentType()", "setRequestHeader()", "addHeader()"), 2)
                ),
                subTopicName = "JS AJAX Send Request",
                headlines = listOf(
                    Headline(
                        headline = "Sending Request to a Server",
                        explaination = "AJAX sends requests using the open() and send() methods. Requests run in the background without reloading the page.",
                        codeExample =
                            """
                const xhr = new XMLHttpRequest();
                xhr.open("GET", "https://jsonplaceholder.typicode.com/posts", true);
                xhr.onload = () => console.log("Request sent");
                xhr.send();
                """.trimIndent(),
                        afterCodeEplainations = "The request is executed asynchronously and does not block the page."
                    ),
                    Headline(
                        headline = "Sending a Get Request",
                        explaination = "GET requests are used to retrieve data from a server. Data is sent via the URL.",
                        codeExample =
                            """
                const xhr = new XMLHttpRequest();
                xhr.open("GET", "https://jsonplaceholder.typicode.com/comments/1", true);
                xhr.onload = () => console.log(xhr.responseText);
                xhr.send();
                """.trimIndent(),
                        afterCodeEplainations = "GET requests are ideal for fetching data."
                    ),
                    Headline(
                        headline = "GET Request with Parameters",
                        explaination = "Parameters can be passed in a GET request using query strings.",
                        codeExample =
                            """
                const xhr = new XMLHttpRequest();
                xhr.open("GET", "https://jsonplaceholder.typicode.com/posts?userId=1", true);
                xhr.onload = () => console.log(xhr.responseText);
                xhr.send();
                """.trimIndent()
                    ),
                    Headline(
                        headline = "Sending a Post Request",
                        explaination = "POST requests are used to send data securely to a server.",
                        tip = "POST data is not visible in the URL, making it more secure than GET.",
                        codeExample =
                            """
                const xhr = new XMLHttpRequest();
                xhr.open("POST", "https://jsonplaceholder.typicode.com/posts", true);
                xhr.setRequestHeader("Content-Type", "application/json");
                xhr.onload = () => console.log(xhr.responseText);
                xhr.send(JSON.stringify({
                  title: "AJAX Post",
                  body: "Learning AJAX",
                  userId: 1
                }));
                """.trimIndent()
                    )
                )
            ),

            Subtopic(
                sutopicId = 84,
                questions = listOf(
                    QuizQuestion("Which 'readyState' value indicates that the request is finished and the response is ready?", listOf("1", "2", "3", "4"), 3),
                    QuizQuestion("What does the HTTP status code 200 signify?", listOf("The page was not found", "A server error occurred", "The request was successful", "Unauthorized access"), 2),
                    QuizQuestion("Which property contains the server's response data as a string?", listOf("responseXML", "statusText", "responseText", "readyResponse"), 2),
                    QuizQuestion("Which event handler is called every time the 'readyState' property changes?", listOf("onload", "onreadystatechange", "oncomplete", "onerror"), 1),
                    QuizQuestion("If you receive JSON data as 'responseText', which JS method should you use to convert it into an object?", listOf("JSON.stringify()", "JSON.parse()", "Object.convert()", "xhr.toObject()"), 1)
                ),
                subTopicName = "JS AJAX Receive Response",
                headlines = listOf(
                    Headline(
                        headline = "Receiving or Handling Response from Server",
                        explaination = "Server responses are handled using callbacks such as onload or onreadystatechange.",
                        tip = "Always verify status code before using response data.",
                        codeExample =
                            """
                const xhr = new XMLHttpRequest();
                xhr.open("GET", "https://jsonplaceholder.typicode.com/albums/1", true);
                xhr.onload = () => console.log(xhr.responseText);
                xhr.send();
                """.trimIndent()
                    ),
                    Headline(
                        headline = "The readyState and status Properties",
                        explaination = "readyState shows request progress (0–4), while status shows HTTP response codes such as 200 or 404.",
                        codeExample =
                            """
                const xhr = new XMLHttpRequest();
                xhr.onreadystatechange = function () {
                  console.log("ReadyState:", xhr.readyState, "Status:", xhr.status);
                };
                xhr.open("GET", "https://jsonplaceholder.typicode.com/posts/1", true);
                xhr.send();
                """.trimIndent()
                    ),
                    Headline(
                        headline = "readyState Values",
                        explaination = "0: not initialized, 1: connection established, 2: request received, 3: processing, 4: completed."
                    ),
                    Headline(
                        headline = "HTTP Status Codes",
                        explaination = "200 means success, 404 means resource not found, and 500 indicates server error."
                    ),
                    Headline(
                        headline = "The responseText Property",
                        explaination = "responseText contains the response returned from the server as plain text.",
                        codeExample =
                            """
                const xhr = new XMLHttpRequest();
                xhr.open("GET", "https://jsonplaceholder.typicode.com/users/2", true);
                xhr.onload = () => console.log(xhr.responseText);
                xhr.send();
                """.trimIndent()
                    ),
                    Headline(
                        headline = "Full Example",
                        explaination = "This example demonstrates a complete AJAX flow from sending request to handling response.",
                        codeExample =
                            """
                const xhr = new XMLHttpRequest();
                xhr.open("GET", "https://jsonplaceholder.typicode.com/posts/1", true);
                xhr.onload = function () {
                  if (xhr.status === 200) {
                    const data = JSON.parse(xhr.responseText);
                    console.log(data.title);
                    console.log(data.body);
                  }
                };
                xhr.send();
                """.trimIndent()
                    )
                )
            ),





            )



    ),
//
//
NoteModule(
    topicId = 10,
    topic = "Functional Array Methods",
    subtopics = listOf(
        // SUBTOPIC 1: .map()
        Subtopic(
            sutopicId = 101,
            questions = listOf(
                QuizQuestion("What does the .map() method return?", listOf("A single value", "A new array of the same length", "A boolean", "Nothing (undefined)"), 1),
                QuizQuestion("Does .map() change (mutate) the original array?", listOf("Yes", "No", "Only if the array contains numbers", "Only in strict mode"), 1),
                QuizQuestion("When should you use .map() instead of .forEach()?", listOf("When you need to stop a loop early", "When you want to create a new array based on the original data", "When you want to log data to the console", "When you are using Linux commands"), 1),
                QuizQuestion("In 'numbers.map(num => num * 2)', what is 'num'?", listOf("The index of the element", "The original array", "The current element being processed", "The total sum"), 2),
                QuizQuestion("If you map over an array of 5 items, how many items will the new array have?", listOf("0", "1", "5", "It depends on the condition"), 2)
            ),
            subTopicName = "The .map() Method",
            headlines = listOf(
                Headline(
                    majorHeadline = "Transforming Data with .map()",
                    majorHeadileExplanation = "The .map() method creates a new array populated with the results of calling a provided function on every element in the calling array.",
                    headline = "Key Characteristics",
                    explaination = "Unlike forEach, map returns a new array of the same length and does not mutate the original array.",
                    tip = "Use .map() when you want to change every item in a list (e.g., converting prices to strings).",
                    codeExample = """
                        const numbers = [1, 2, 3, 4];
                        const doubled = numbers.map(num => num * 2);
                        console.log(doubled);
                    """.trimIndent(),
                    codeOutput = "[2, 4, 6, 8]",
                    afterCodeEplainations = "The arrow function takes each 'num' and multiplies it by 2, returning the new value into the 'doubled' array."
                )
            )
        ),
        // SUBTOPIC 2: .filter()
        Subtopic(
            sutopicId = 102,
            questions = listOf(
                QuizQuestion("What is the primary purpose of the .filter() method?", listOf("To multiply all numbers", "To select items that meet a specific condition", "To sort the array", "To join two arrays"), 1),
                QuizQuestion("What must the callback function in .filter() return to keep an element?", listOf("The element itself", "A string", "A boolean (true)", "An index number"), 2),
                QuizQuestion("What does .filter() return if no elements satisfy the condition?", listOf("null", "undefined", "An empty array []", "false"), 2),
                QuizQuestion("Is the array returned by .filter() a deep copy or a shallow copy?", listOf("A deep copy", "A shallow copy", "It is the original array", "It is a string"), 1),
                QuizQuestion("If 'ages.filter(age => age >= 18)' is called on [10, 20, 30], what is the result?", listOf("[10]", "[20, 30]", "[10, 20, 30]", "[]"), 1)
            ),
            subTopicName = "The .filter() Method",
            headlines = listOf(
                Headline(
                    majorHeadline = "Selecting Data with .filter()",
                    majorHeadileExplanation = "The .filter() method creates a shallow copy of a portion of a given array, filtered down to just the elements from the given array that pass the test.",
                    headline = "Boolean Logic",
                    explaination = "The callback function must return true to keep the element or false to discard it.",
                    tip = "If no elements pass the test, an empty array [] is returned.",
                    codeExample = """
                        const ages = [12, 18, 25, 8, 30];
                        const adults = ages.filter(age => age >= 18);
                        console.log(adults);
                    """.trimIndent(),
                    codeOutput = "[18, 25, 30]",
                    afterCodeEplainations = "Only the numbers that satisfied the condition (greater than or equal to 18) were pushed into the new array."
                )
            )
        ),
        // SUBTOPIC 3: .reduce()
        Subtopic(
            sutopicId = 103,
            questions = listOf(
                QuizQuestion("What is the main goal of the .reduce() method?", listOf("To filter out unwanted data", "To transform each element", "To aggregate an array into a single value", "To sort the array"), 2),
                QuizQuestion("In the reducer function '(acc, val) => ...', what does 'acc' represent?", listOf("The current index", "The original array", "The accumulator (running total)", "The final answer"), 2),
                QuizQuestion("What is the purpose of the second argument in 'array.reduce(callback, 0)'?", listOf("It is the max value allowed", "It is the initial value of the accumulator", "It is the loop limit", "It is an error code"), 1),
                QuizQuestion("What happens if you use .reduce() on an empty array without an initial value?", listOf("It returns 0", "It returns undefined", "It throws a TypeError", "It returns an empty array"), 2),
                QuizQuestion("If you use .reduce() to sum [10, 20, 30] starting at 0, what is the final result?", listOf("20", "30", "60", "0"), 2)
            ),
            subTopicName = "The .reduce() Method",
            headlines = listOf(
                Headline(
                    majorHeadline = "Aggregating Data with .reduce()",
                    majorHeadileExplanation = "The .reduce() method executes a 'reducer' callback function on each element of the array, resulting in a single output value.",
                    headline = "The Accumulator",
                    explaination = "The first argument is the 'accumulator' (the running total), and the second is the 'currentValue'.",
                    tip = "Always provide an initial value (like 0) as the second argument to avoid errors with empty arrays.",
                    codeExample = """
                        const cart = [10, 20, 30];
                        const total = cart.reduce((acc, price) => acc + price, 0);
                        console.log(total);
                    """.trimIndent(),
                    codeOutput = "60",
                    afterCodeEplainations = "The 'acc' starts at 0. It adds 10, then 20, then 30, finally returning the single sum of 60."
                )
            )
        ),
        Subtopic(
            sutopicId = 104,
            questions = listOf(
                QuizQuestion("What does .find() return if a match is found?", listOf("The first element that satisfies the condition", "An array of all matches", "The index of the match", "A boolean true"), 0),
                QuizQuestion("What does .find() return if NO element satisfies the condition?", listOf("null", "false", "undefined", "0"), 2),
                QuizQuestion("If you need the position (index) of an element rather than the value, which method should you use?", listOf(".find()", ".findIndex()", ".indexOf()", "Both B and C are correct"), 3),
                QuizQuestion("How many elements does .find() return at most?", listOf("0", "1", "All that match", "The entire array"), 1),
                QuizQuestion("True or False: .find() stops searching as soon as it finds the first match.", listOf("True", "False"), 0)
            ),
            subTopicName = "Searching: .find()",
            headlines = listOf(
                Headline(
                    majorHeadline = "Locating a Specific Element",
                    majorHeadileExplanation = ".find() returns the value of the FIRST element that satisfies the condition. .findIndex() returns the index.",
                    codeExample = "const users = [{id: 1, name: 'Dev'}, {id: 2, name: 'Jay'}];\nconst user = users.find(u => u.id === 2);\nconsole.log(user.name);",
                    codeOutput = "'Jay'",
                    afterCodeEplainations = "If no element is found, it returns undefined."
                )
            )
        ),
        // 5. .some() & .every()
        Subtopic(
            sutopicId = 105,
            questions = listOf(
                QuizQuestion("Which method returns true if AT LEAST ONE element passes the test?", listOf(".every()", ".some()", ".filter()", ".map()"), 1),
                QuizQuestion("Which method returns true only if ALL elements pass the test?", listOf(".some()", ".every()", ".find()", ".map()"), 1),
                QuizQuestion("What is the return type of both .some() and .every()?", listOf("Array", "Object", "Boolean", "Number"), 2),
                QuizQuestion("What does '[true, false].every(t => t === true)' return?", listOf("true", "false", "undefined", "null"), 1),
                QuizQuestion("What does '[1, 2, 3].some(num => num > 5)' return?", listOf("true", "false", "[1, 2, 3]", "5"), 1)
            ),
            subTopicName = "Boolean Checks: .some() / .every()",
            headlines = listOf(
                Headline(
                    majorHeadline = "Testing the Whole Array",
                    majorHeadileExplanation = ".some() checks if AT LEAST ONE item passes. .every() checks if ALL items pass.",
                    codeExample = "const tasks = [true, false, true];\nconst allDone = tasks.every(t => t === true);\nconst anyDone = tasks.some(t => t === true);\nconsole.log('All:', allDone, 'Any:', anyDone);",
                    codeOutput = "All: false Any: true"
                )
            )
        ),
        // 6. .sort()
        Subtopic(
            sutopicId = 106,
            questions = listOf(
                QuizQuestion("By default, how does .sort() order elements?", listOf("By numeric value", "As strings in alphabetical order", "By element size", "In the order they were created"), 1),
                QuizQuestion("Does .sort() create a new array or mutate the original?", listOf("Creates a new array", "Mutates the original array in place", "It depends on the browser", "Only in Linux"), 1),
                QuizQuestion("To sort numbers correctly (ascending), which compare function should you use?", listOf("(a, b) => a + b", "(a, b) => a - b", "(a, b) => a == b", "No function needed"), 1),
                QuizQuestion("If a compare function returns a negative number, where is 'a' placed relative to 'b'?", listOf("Before 'b'", "After 'b'", "They are swapped", "They are deleted"), 0),
                QuizQuestion("What is the result of [40, 100, 1].sort() without a compare function?", listOf("[1, 40, 100]", "[1, 100, 40]", "[100, 40, 1]", "[40, 1, 100]"), 1)
            ),
            subTopicName = "The .sort() Method",
            headlines = listOf(
                Headline(
                    majorHeadline = "Ordering Elements",
                    majorHeadileExplanation = "Sorts elements of an array in place and returns the sorted array.",
                    tip = "By default, sort() treats everything as strings. Use (a, b) => a - b for numbers!",
                    codeExample = "const scores = [40, 100, 1];\nscores.sort((a, b) => a - b);\nconsole.log(scores);",
                    codeOutput = "[1, 40, 100]",
                    afterCodeEplainations = "Returning a negative value puts 'a' first; positive puts 'b' first."
                )
            )
        )



    )

)
)















