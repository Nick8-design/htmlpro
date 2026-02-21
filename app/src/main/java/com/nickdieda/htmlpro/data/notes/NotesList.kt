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
                sutopicId = 1,
                subTopicName = "HTML Intro",
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML5",
                        majorHeadileExplanation = "HTML5 is the modern version of HTML used to build web pages today. It introduced better tags like <header>, <nav>, <section>, <article>, <footer>, and supports audio, video, and better forms. HTML5 makes pages easier to structure, easier to read, and more friendly for search engines (Google).",
                        headline = "Importance of HTML",
                        explaination = "HTML is the foundation of every website. It creates the structure of a web page, like the skeleton of a human body. Without HTML, you can’t place text, images, buttons, videos, links, or forms on the page. CSS adds beauty (style) and JavaScript adds actions (logic), but HTML comes first.",
                        tip = "Tip: If you can write clean HTML, learning CSS and JavaScript becomes 10x easier."
                    ),

                    Headline(
                        headline = "Why Use This App?",
                        explaination = "This app makes learning HTML simple and fun. You get clear notes, quick tips, and runnable code examples inside the app. You can use the offline compiler to test your HTML even without internet. There are quizzes to check your understanding, sample mini-projects to practice, and you can save your work to your phone storage. After learning and passing quizzes, you can even earn a certificate.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>My First HTML Page</title>
</head>
<body>
  <h1>Hello, HTML! 👋</h1>
  <p>This is my first web page using this app.</p>

  <button onclick="sayHi()">Click Me</button>

  <script>
    function sayHi() {
      alert("Nice! You just ran HTML + JavaScript!");
    }
  </script>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "This example contains the full HTML structure: <!DOCTYPE html>, <html>, <head>, and <body>. The <h1> and <p> show text. The button runs a small script that shows an alert when clicked. You can paste this into your app compiler and run it immediately."
                    ),

                    Headline(
                        headline = "How a Web Page Works",
                        explaination = "When you open a website, the browser reads your HTML from top to bottom. It builds the page like assembling a puzzle: headings, paragraphs, images, buttons, and more. HTML tells the browser WHAT things are. Then CSS tells the browser HOW they should look (colors, spacing). JavaScript tells the browser WHAT should happen when the user interacts (clicks, typing, etc).",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>HTML + CSS + JS</title>
  <style>
    body { font-family: Arial; }
    .box { padding: 12px; border: 2px dashed #333; }
  </style>
</head>
<body>
  <h2>Building Blocks</h2>
  <div class="box" id="box">HTML gives structure ✅</div>

  <button onclick="changeText()">Try Action</button>

  <script>
    function changeText() {
      document.getElementById("box").textContent = "JavaScript changed this text ✅";
    }
  </script>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "In this page: HTML creates the heading, box, and button. CSS adds style (dashed border and padding). JavaScript changes text when you click the button. This shows how the three work together."
                    )
                ),

                questions = listOf(
                    QuizQuestion(
                        "What is HTML mainly used for?",
                        listOf("Styling web pages", "Creating web page structure", "Running database queries", "Making phone calls"),
                        1
                    ),
                    QuizQuestion(
                        "Which tag usually contains the visible content of a web page?",
                        listOf("<head>", "<title>", "<body>", "<meta>"),
                        2
                    ),
                    QuizQuestion(
                        "What does HTML stand for?",
                        listOf("HyperText Markup Language", "HighText Machine Language", "Hyper Transfer Mark Language", "Home Tool Markup Language"),
                        0
                    ),
                    QuizQuestion(
                        "Which line tells the browser that the document is HTML5?",
                        listOf("<html>", "<!DOCTYPE html>", "<head>", "<meta charset='UTF-8'>"),
                        1
                    ),
                    QuizQuestion(
                        "HTML is like the ______ of a website.",
                        listOf("Paint", "Brain", "Skeleton", "Internet"),
                        2
                    ),
                    QuizQuestion(
                        "Which of the following is a correct HTML tag for a main heading?",
                        listOf("<heading>", "<h1>", "<head1>", "<h>"),
                        1
                    ),
                    QuizQuestion(
                        "Which technology is mostly used to add actions like button click behavior?",
                        listOf("HTML", "CSS", "JavaScript", "SQL"),
                        2
                    ),
                    QuizQuestion(
                        "Why is HTML5 important?",
                        listOf("It removes the need for HTML", "It adds modern tags and better support for media", "It makes browsers slower", "It replaces CSS"),
                        1
                    )
                )
            ),
            Subtopic(
                sutopicId = 2,
                subTopicName = "HTML Compiler",
                headlines = listOf(

                    Headline(
                        majorHeadline = "Where to code HTML files",
                        majorHeadileExplanation = "You can write HTML in many places: (1) A simple text editor like Notepad, VS Code, Sublime Text. (2) Online editors like CodePen or JSFiddle. (3) Inside this app using the built-in HTML compiler. The best part of using this app is you can code and run your page instantly, even offline.",
                        headline = "Saving HTML file",
                        explaination = "An HTML file is saved with the extension .html (example: index.html). The extension is important because it tells the browser to open it as a web page. In this app, you can write HTML, run it, then save it directly to your storage so you can open it later and continue from where you stopped.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Saved Page</title>
</head>
<body>
  <h1>My Saved HTML File ✅</h1>
  <p>If you can see this, your file is working!</p>

  <ul>
    <li>HTML structure</li>
    <li>Text</li>
    <li>Lists</li>
  </ul>
</body>
</html>
""".trimIndent(),
                        tip = "Tip: Always save your main page as index.html. Many websites use index.html as the default start page.",
                        afterCodeEplainations = "To save in this app: tap the menu at the top → choose “Save As” → type a name like mypage.html → save. Later, use “Open Saved” to load it again."
                    ),

                    Headline(
                        headline = "Live Preview (Run Your Code)",
                        explaination = "A compiler/preview lets you see the results of your HTML instantly. When you press Run, the app renders your HTML like a real browser. This helps you learn faster because you can test changes quickly and understand what each tag does.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Live Preview</title>
  <style>
    body { font-family: Arial; padding: 16px; }
    .card { padding: 12px; border: 1px solid #ccc; border-radius: 10px; }
  </style>
</head>
<body>
  <div class="card">
    <h2>Live Preview 🚀</h2>
    <p>Change this text and run again to see instant updates!</p>
  </div>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Try editing the text, add another <p>, or change the <h2> title, then run again. Learning becomes faster when you test small changes."
                    ),

                    Headline(
                        headline = "Common Errors Beginners Make",
                        explaination = "When HTML does not work, it’s often small mistakes. Common issues are: forgetting closing tags, typing wrong tag names, missing quotes in attributes, or placing tags in the wrong place. The good thing is: HTML is forgiving, so even with mistakes, something may still show. But clean code makes your pages stable and professional.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Fix Mistakes</title>
</head>
<body>
  <h1>Check Your Tags</h1>
  <p>Make sure you close tags properly.</p>

  <a href="https://example.com">This is a link</a>
</body>
</html>
""".trimIndent(),
                        tip = "Tip: If something looks “weird”, check your closing tags first (</p>, </div>, </body>).",
                        afterCodeEplainations = "If your design breaks, check: did you close the tag? did you type the tag name correctly? did you put quotes around attributes like href=\"...\"?"
                    )
                ),

                questions = listOf(
                    QuizQuestion(
                        "What extension should an HTML file have?",
                        listOf(".txt", ".html", ".png", ".mp3"),
                        1
                    ),
                    QuizQuestion(
                        "Which file name is commonly used as the main web page?",
                        listOf("home.html", "start.html", "index.html", "mainpage.html"),
                        2
                    ),
                    QuizQuestion(
                        "Why is the .html extension important?",
                        listOf("It makes the file smaller", "It tells the browser it is a web page", "It adds internet automatically", "It encrypts the file"),
                        1
                    ),
                    QuizQuestion(
                        "What does “Run” do in an HTML compiler?",
                        listOf("Deletes code", "Turns HTML into a preview/web page", "Converts to PDF", "Uploads to Play Store"),
                        1
                    ),
                    QuizQuestion(
                        "Which is a common beginner mistake in HTML?",
                        listOf("Using too many images", "Forgetting to close tags", "Using the internet", "Changing phone brightness"),
                        1
                    ),
                    QuizQuestion(
                        "Where can you write HTML code?",
                        listOf("Only in VS Code", "Only online", "Any editor or this app compiler", "Only in Microsoft Word"),
                        2
                    ),
                    QuizQuestion(
                        "If your page is not showing correctly, what should you check first?",
                        listOf("Wi-Fi password", "Closing tags and spelling", "Phone battery", "Bluetooth settings"),
                        1
                    )
                )
            ),

            Subtopic(
                sutopicId = 3,
                subTopicName = "Elements",
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML Elements",
                        majorHeadileExplanation = "An HTML element is a complete building block on a web page. Most elements have an opening tag (start tag), content in the middle, and a closing tag (end tag). Example: <p>Text</p>. Elements are what create headings, paragraphs, buttons, images, links, and more.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>HTML Elements</title>
</head>
<body>
  <h1>This is a Heading Element</h1>
  <p>This is a paragraph element. It shows normal text on the page.</p>
  <button>Button Element</button>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "In this example: <h1>...</h1>, <p>...</p>, and <button>...</button> are elements. Each one has an opening tag like <p> and a closing tag like </p>. The text between them is called the element content.",
                        tip = "Tip: Always close your tags properly. Unclosed tags can make the page layout behave in a strange way."
                    ),

                    Headline(
                        headline = "Nested Elements",
                        explaination = "Nested elements means putting one element inside another element. This is very common in real websites. For example: a <b> element can be inside a <p>, or a <li> must be inside <ul> or <ol>. Nesting helps you organize your page like boxes inside boxes.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Nested Elements</title>
</head>
<body>

  <div>
    <h2>Welcome</h2>
    <p>
      This is a <b>bold</b> word inside a paragraph.
      Here is a <a href="https://example.com" target="_blank">link</a> too.
    </p>

    <ul>
      <li>List item 1</li>
      <li>List item 2</li>
    </ul>
  </div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Here, <b> is inside <p>, and <a> is also inside <p>. Also, <li> is inside <ul>. Common elements you will use a lot: <div> (section/box), <p> (paragraph), <h1>-<h6> (headings), <a> (link), <img> (image), <button> (button), <ul>/<ol> (lists), <li> (list item)."
                    ),

                    Headline(
                        headline = "Single or empty elements",
                        explaination = "Some HTML elements do not have closing tags because they don’t wrap text. These are called empty elements (or self-closing elements). They mainly insert something into the page like an image, a line break, or a horizontal line.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Empty Elements</title>
</head>
<body>
  <h2>Empty Elements Example</h2>

  <p>This line breaks here<br>and continues on the next line.</p>

  <hr>

  <p>Below is an image element:</p>
  <img src="https://via.placeholder.com/200" alt="Sample Image">

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Notice: <br>, <hr>, and <img> don’t need a closing tag like </img>. More common empty elements: <meta> (info about the page), <link> (connect CSS file), <input> (form input), <source> (for audio/video sources)."
                    ),

                    Headline(
                        headline = "Block vs Inline Elements",
                        explaination = "HTML elements behave in two common ways: Block elements start on a new line and take full width (like big boxes). Inline elements stay in the same line and only take the space they need (like small labels). This helps you control layout even before learning CSS deeply.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Block vs Inline</title>
</head>
<body>

  <h2>Block Elements</h2>
  <div style="border:1px solid black; padding:8px;">I am a DIV (block)</div>
  <p style="border:1px solid black; padding:8px;">I am a P (block)</p>

  <h2>Inline Elements</h2>
  <p>
    This is <span style="border:1px solid black; padding:2px;">SPAN</span>
    and this is <b style="border:1px solid black; padding:2px;">BOLD</b>
    inside the same line.
  </p>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Block examples: <div>, <p>, <h1>, <section>, <article>. Inline examples: <span>, <b>, <i>, <a>, <small>. Blocks create new lines, inline stays in the same line."
                    )
                ),

                questions = listOf(
                    QuizQuestion(
                        "What is an HTML element?",
                        listOf(
                            "A website database",
                            "A building block made of tags and content",
                            "A programming language",
                            "A browser setting"
                        ),
                        1
                    ),
                    QuizQuestion(
                        "Which part is the opening tag in <p>Hello</p> ?",
                        listOf("<p>", "</p>", "Hello", "<html>"),
                        0
                    ),
                    QuizQuestion(
                        "What does it mean to nest elements?",
                        listOf(
                            "To remove all tags",
                            "To put one element inside another",
                            "To rename elements",
                            "To convert HTML to CSS"
                        ),
                        1
                    ),
                    QuizQuestion(
                        "Which one is an empty element?",
                        listOf("<p>", "<div>", "<img>", "<h1>"),
                        2
                    ),
                    QuizQuestion(
                        "Which tag creates a line break?",
                        listOf("<hr>", "<br>", "<break>", "<lb>"),
                        1
                    ),
                    QuizQuestion(
                        "Which is a block element?",
                        listOf("<span>", "<a>", "<div>", "<b>"),
                        2
                    ),
                    QuizQuestion(
                        "Which is an inline element?",
                        listOf("<p>", "<h1>", "<div>", "<span>"),
                        3
                    ),
                    QuizQuestion(
                        "Why is closing tags important?",
                        listOf(
                            "To make internet faster",
                            "To avoid layout problems and broken structure",
                            "To add images",
                            "To create JavaScript"
                        ),
                        1
                    )
                )
            ),
            Subtopic(
                sutopicId = 4,
                subTopicName = "HTML Attributes",
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML Attributes",
                        majorHeadileExplanation = "HTML attributes are extra information added to an element to control its behavior or give it more meaning. Attributes are written inside the opening tag. Most attributes follow this pattern: name=\"value\". Example: <a href=\"...\">. Attributes can set links, add IDs, define classes, add tooltips, change styles, and much more.",
                        headline = "Information About Attributes",
                        explaination = "Attributes tell the browser more details about an element. They usually have: (1) Attribute name (like href, src, id), (2) Equal sign (=), (3) Value in quotes (\" \"). Some attributes are global (work on many elements) like id, class, style, title. Some are specific to certain tags like href for <a> and src for <img>.",
                        codeExample = """
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Attributes Demo</title>
</head>
<body>

  <!-- href attribute: where the link goes -->
  <a href="https://example.com" title="Go to example.com" target="_blank">
    Visit Example
  </a>

  <hr>

  <!-- id attribute: unique name for one element -->
  <p id="msg">Hello!</p>

  <!-- style attribute: quick styling -->
  <p style="color: green; font-weight: bold;">This text is green</p>

  <!-- class attribute: group styling for many elements -->
  <div class="card" style="border:1px solid #333; padding:10px;">
    I am a div with class="card"
  </div>

</body>
</html>
""".trimIndent(),
                        tip = "Tip: Always use quotes around attribute values. It prevents many bugs, especially when the value has spaces.",
                        afterCodeEplainations = "In the code: href sets the link destination, title shows text when you hover, target=\"_blank\" opens a new tab. id gives a unique name for one element. style adds quick CSS. class is used to group elements for styling."
                    ),

                    Headline(
                        headline = "href attribute",
                        explaination = "The href attribute is used mainly in the <a> tag (links). It tells the browser the address (URL) to open when the user clicks the link. Without href, the link won’t go anywhere.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>
  <a href="https://google.com">Open Google</a>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Here, href=\"https://google.com\" is the destination. When clicked, the browser navigates to Google."
                    ),

                    Headline(
                        explaination = "You can also use href to jump to a section inside the same page using an id. This is called an anchor link, used in menus and table of contents.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

  <a href="#about">Go to About Section</a>

  <p style="height:400px;">Scroll down...</p>

  <h2 id="about">About</h2>
  <p>This is the about section.</p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "link",
                        explaination = "The <link> element connects external resources like CSS files to your HTML page. It is usually placed inside the <head>. Most common use: linking a stylesheet so your page looks nice.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <!-- This connects an external CSS file -->
  <link rel="stylesheet" href="style.css">
  <title>Link Tag</title>
</head>
<body>
  <h1>CSS will style me (if style.css exists)</h1>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "<link> is an empty element. It does not have a closing tag. rel tells what type of file it is (stylesheet), and href points to the CSS file path."
                    ),

                    Headline(
                        headline = "style attribute",
                        explaination = "The style attribute adds CSS directly to one element. It is good for quick testing, but for real projects, it’s better to use CSS files or <style> in the head.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>
  <h2 style="color: blue; background: #eee; padding: 10px;">
    Styled using style=""
  </h2>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "style=\"...\" contains CSS rules like color, background, padding. It affects only that element."
                    ),

                    Headline(
                        explaination = "Sometimes style is used for small UI highlights like warning messages or success messages.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>
  <p style="color: red; font-weight: bold;">Error: Please fill all fields.</p>
  <p style="color: green; font-weight: bold;">Success: Saved correctly!</p>
</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "title",
                        explaination = "The title attribute shows a small tooltip when you hover over an element. It is useful for extra hints to users, especially on buttons, icons, and links.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>
  <button title="Click to submit your form">Submit</button>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Hover your mouse on the button and you will see the tooltip message."
                    ),

                    Headline(
                        headline = "id attribute",
                        explaination = "The id attribute gives a unique name to ONE element. IDs must be unique in the page (don’t repeat the same id). IDs are used for JavaScript targeting and also for jumping to sections with href=\"#id\".",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>
  <p id="welcome">Hello!</p>

  <script>
    // Using id to find an element and change it
    document.getElementById("welcome").textContent = "Hello from JavaScript!";
  </script>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "getElementById(\"welcome\") finds the element with id=\"welcome\" and updates its text."
                    ),

                    Headline(
                        explaination = "IDs are perfect for unique elements like a main button, a header, or a special message area.",
                        codeExample = ""
                    ),

                    Headline(
                        headline = "class",
                        explaination = "The class attribute groups many elements together. Unlike id, class can be reused on multiple elements. Classes are mostly used for styling with CSS and selecting groups in JavaScript.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <style>
    .note { border: 1px solid #333; padding: 8px; margin: 6px 0; }
  </style>
</head>
<body>
  <div class="note">Note 1</div>
  <div class="note">Note 2</div>
  <div class="note">Note 3</div>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "All three divs share class=\"note\" so the same CSS styles apply to all of them."
                    ),

                    Headline(
                        headline = "lang",
                        explaination = "The lang attribute tells the browser the language of the page content. It helps search engines and accessibility tools (screen readers). It is usually placed on the <html> tag.",
                        codeExample = """
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Language Example</title>
</head>
<body>
  <p>This page is in English.</p>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "lang=\"en\" means English. Examples: lang=\"sw\" for Swahili, lang=\"fr\" for French."
                    )
                ),

                questions = listOf(
                    QuizQuestion(
                        "What is an HTML attribute?",
                        listOf(
                            "A type of tag",
                            "Extra information added to an element",
                            "A browser plugin",
                            "A JavaScript function"
                        ),
                        1
                    ),
                    QuizQuestion(
                        "Where do attributes appear?",
                        listOf(
                            "Inside the opening tag",
                            "Inside the closing tag",
                            "Only in the <body>",
                            "Inside comments only"
                        ),
                        0
                    ),
                    QuizQuestion(
                        "Which attribute is used to specify a link destination?",
                        listOf("src", "href", "id", "class"),
                        1
                    ),
                    QuizQuestion(
                        "Which attribute should be unique in a page?",
                        listOf("class", "style", "id", "title"),
                        2
                    ),
                    QuizQuestion(
                        "Which attribute is commonly used to group elements for CSS styling?",
                        listOf("id", "href", "class", "lang"),
                        2
                    ),
                    QuizQuestion(
                        "What does the title attribute do?",
                        listOf(
                            "Changes page background",
                            "Shows a tooltip when hovering",
                            "Adds an image",
                            "Creates a new tab"
                        ),
                        1
                    ),
                    QuizQuestion(
                        "Which tag mostly uses the src attribute?",
                        listOf("<a>", "<img>", "<p>", "<h1>"),
                        1
                    ),
                    QuizQuestion(
                        "Why is the lang attribute useful?",
                        listOf(
                            "To make the page load faster",
                            "To help SEO and screen readers understand the language",
                            "To add animations",
                            "To store passwords"
                        ),
                        1
                    )
                )
            ),

            Subtopic(
                sutopicId = 5,
                subTopicName = "HTML Comments & Notes", // renamed (better)
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML Comments",
                        majorHeadileExplanation = "HTML comments are hidden notes in your code. The browser ignores them, so users cannot see them on the webpage. Comments are written using: <!-- comment here -->. They help you explain your code, organize sections, and remember what each part does.",
                        headline = "Importance of Comments",
                        explaination = "Comments make your code easier to understand—especially when you come back after days or when other people read your code. You can use comments to label sections like Header, Menu, Content, Footer. Comments are also useful for temporarily disabling code without deleting it.",
                        tip = "Tip: Write comments that explain WHY something exists, not obvious things like 'this is a paragraph'."
                    ),

                    Headline(
                        headline = "Comment in HTML",
                        explaination = "To write a comment in HTML, you place the text between <!-- and -->. Anything inside is ignored by the browser. Comments can be short reminders, section titles, or warnings like 'Don’t edit this part'.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>HTML Comments</title>
</head>
<body>

  <!-- This is a comment: Users will NOT see it -->
  <h1>Comments Demo</h1>

  <p>This paragraph is visible.</p>

  <!-- You can also comment a whole section -->
  <!-- 
    <p>This is hidden because it is commented out.</p>
  -->

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The comment starts with <!-- and ends with -->. The browser skips it completely. In the multi-line comment section, that <p> tag is not displayed because it is inside a comment."
                    ),

                    Headline(
                        headline = "Using Comments to Debug (Disable Code)",
                        explaination = "Sometimes your page is not behaving well and you want to test step-by-step. Comments help you disable a part of HTML without deleting it. This makes debugging safe and fast.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Debug With Comments</title>
  <style>
    .card { border: 1px solid #333; padding: 12px; border-radius: 10px; }
  </style>
</head>
<body>

  <h2>Debugging Example</h2>

  <div class="card">
    <p>This card is visible ✅</p>

    <!-- Disable this image if it causes problems -->
    <!-- <img src="broken-link.png" alt="Broken image"> -->

    <p>Even if the image is disabled, the page still works ✅</p>
  </div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The image tag is commented out, so it will not load. This is a clean way to test your page and find where the problem is without deleting code."
                    ),

                    Headline(
                        headline = "Clean Code: Comment Sections Like a Pro",
                        explaination = "Big web pages are easier to manage when you label sections. Comments act like road signs in your HTML file so you never get lost. This makes your code look professional and organized.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Organized Page</title>
</head>
<body>

  <!-- ===== HEADER ===== -->
  <header>
    <h1>My Website</h1>
  </header>

  <!-- ===== NAVIGATION ===== -->
  <nav>
    <a href="#">Home</a> |
    <a href="#">About</a> |
    <a href="#">Contact</a>
  </nav>

  <!-- ===== MAIN CONTENT ===== -->
  <main>
    <h2>Welcome</h2>
    <p>This page is clean because sections are clearly labeled.</p>
  </main>

  <!-- ===== FOOTER ===== -->
  <footer>
    <p>© 2026 My Website</p>
  </footer>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The comments here help you quickly see where the header, navigation, main content, and footer start and end. This is how many real developers organize HTML files."
                    ),
                ),
                    questions = listOf(
                        QuizQuestion(
                            "What is the correct syntax for an HTML comment?",
                            listOf("/* comment */", "// comment", "<!-- comment -->", "<comment>...</comment>"),
                            2
                        ),
                        QuizQuestion(
                            "Are HTML comments visible on the webpage?",
                            listOf("Yes, always", "Only on phones", "No, they are hidden", "Only in dark mode"),
                            2
                        ),
                        QuizQuestion(
                            "Why do developers use comments?",
                            listOf("To make the site load faster", "To explain and organize code", "To change colors", "To add images"),
                            1
                        ),
                        QuizQuestion(
                            "What happens to code inside an HTML comment?",
                            listOf("It runs in background", "It becomes CSS", "It is ignored by the browser", "It opens a new tab"),
                            2
                        ),
                        QuizQuestion(
                            "Which is a good use of comments while debugging?",
                            listOf("Rename the file", "Disable a section without deleting it", "Add more images", "Remove the <html> tag"),
                            1
                        ),
                        QuizQuestion(
                            "Which comment style is best for large sections?",
                            listOf("Single short notes only", "Section labels like HEADER/NAV/FOOTER", "No comments at all", "Only emojis"),
                            1
                        ),
                        QuizQuestion(
                            "Where do comments help the most?",
                            listOf("When code is long or shared with others", "When browsing YouTube", "When deleting folders", "When turning on Wi-Fi"),
                            0
                        )
                    )

            ),
            Subtopic(
                sutopicId = 6,
                subTopicName = "Styling HTML (CSS Basics)", // renamed (better)
                headlines = listOf(

                    Headline(
                        majorHeadline = "Styling in HTML",
                        majorHeadileExplanation = "Styling means making your webpage look good: changing colors, background, spacing, fonts, and alignment. HTML creates the structure, but styling is mostly done using CSS. CSS can be written in three main ways: Inline CSS (inside a tag), Internal CSS (inside <style>), and External CSS (separate .css file).",
                        tip = "Tip: Use Internal CSS for learning and small projects. Later, use External CSS for real websites.",
                        afterCodeEplainations = "You can save your styled HTML in this app by clicking the menu at the top → Save As / Save. You can also open saved files later using Open Saved."
                    ),

                    Headline(
                        headline = "Internal Style Sheet (Internal Styling)",
                        explaination = "Internal styling is when you write CSS inside the <style> tag in the <head>. This styling affects the whole page. It is clean and better than repeating inline styles everywhere.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Internal CSS</title>
  <style>
    body { font-family: Arial; padding: 16px; }
    .card { border: 2px solid #333; border-radius: 12px; padding: 12px; }
    .btn { padding: 10px 14px; border: none; cursor: pointer; }
  </style>
</head>
<body>
  <div class="card">
    <h2>Internal CSS ✅</h2>
    <p>This style is written inside &lt;style&gt; in the head.</p>
    <button class="btn">Nice Button</button>
  </div>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The <style> tag contains CSS rules. We used .card and .btn classes so multiple elements can share the same design without repeating style code."
                    ),

                    Headline(
                        headline = "External Style Sheet (Best Practice)",
                        explaination = "External styling means your CSS is in a separate file like style.css, and your HTML links it using <link>. This is the best method for real apps/websites because your CSS is reusable and the HTML stays clean.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>External CSS</title>

  <!-- This connects your CSS file -->
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <h2>External CSS (Best Practice)</h2>
  <p>If style.css exists, it will style this page.</p>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "In real projects, you separate HTML and CSS. Even though this app may run in one file, you should still understand how external CSS works."
                    ),

                    Headline(
                        headline = "Inline Styling",
                        explaination = "Inline styling is when you add CSS directly inside an element using the style attribute. It is good for quick testing, but not good for big projects because it becomes messy and hard to maintain.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Inline CSS</title>
</head>
<body>
  <h2 style="color: blue; background: #eee; padding: 10px;">
    Inline Styling Example
  </h2>

  <p style="border: 1px solid #333; padding: 10px; border-radius: 10px;">
    This paragraph is styled inline.
  </p>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The style=\"...\" attribute contains CSS rules applied only to that element."
                    ),

                    Headline(
                        headline = "Text Color (color)",
                        explaination = "To change the text color, you use the CSS property: color. You can use color names like red/blue, or hex codes like #ff0000.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>
  <h2 style="color: purple;">Purple Heading</h2>
  <p style="color: green;">Green paragraph text</p>
  <p style="color: #ff4500;">Orange text using hex</p>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The property 'color' changes the text color only."
                    ),

                    Headline(
                        headline = "Background Color (background / background-color)",
                        explaination = "To change the background, you use background-color or background. This can style the whole page or a specific element.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body style="background-color: #f4f4f4;">

  <div style="background: white; padding: 12px; border-radius: 12px;">
    <h2>Background Example</h2>
    <p>This card is white, but the page background is light gray.</p>
  </div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "We styled the whole page background, then styled the div like a card."
                    ),

                    Headline(
                        headline = "Text Size (font-size)",
                        explaination = "To change text size, use font-size. Common units are px (pixels). Bigger number = bigger text.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>
  <p style="font-size: 14px;">Small text (14px)</p>
  <p style="font-size: 20px;">Medium text (20px)</p>
  <p style="font-size: 30px;">Big text (30px)</p>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "font-size controls how large the text appears."
                    ),

                    Headline(
                        headline = "Font Style (font-family)",
                        explaination = "To change the font, use font-family. The browser will use the first font if available, otherwise it tries the next one.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>
  <p style="font-family: Arial, sans-serif;">Arial text</p>
  <p style="font-family: 'Courier New', monospace;">Courier (code-like font)</p>
  <p style="font-family: Georgia, serif;">Georgia text</p>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "font-family changes how the text looks (the font style)."
                    ),

                    Headline(
                        headline = "Aligning Text (text-align)",
                        explaination = "To align text left, center, or right, use text-align. This is very common for titles and buttons.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>
  <h2 style="text-align: center;">Centered Title</h2>
  <p style="text-align: right;">Right aligned paragraph</p>
  <p style="text-align: left;">Left aligned paragraph (default)</p>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "text-align controls where the text sits: left, center, or right."
                    ),

                    Headline(
                        headline = "Spacing (padding & margin)",
                        explaination = "Padding adds space inside an element, margin adds space outside an element. These two are the secret to clean UI design.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body style="font-family: Arial;">

  <div style="border: 2px solid #333; padding: 12px; margin: 12px; border-radius: 10px;">
    <h3>Spacing Example</h3>
    <p>Padding = inside space. Margin = outside space.</p>
  </div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The box has padding (inside) so text does not touch the border, and margin (outside) so the box is not stuck to the page edges."
                    )
                ),

                questions = listOf(
                    QuizQuestion(
                        "What is the main purpose of CSS?",
                        listOf("Create page structure", "Style and design the page", "Store data", "Run SQL queries"),
                        1
                    ),
                    QuizQuestion(
                        "Which method is best for real projects?",
                        listOf("Inline CSS", "External CSS", "Only HTML", "Comments"),
                        1
                    ),
                    QuizQuestion(
                        "Where is internal CSS written?",
                        listOf("Inside <script>", "Inside <style> in the <head>", "Inside <body> only", "Inside <title>"),
                        1
                    ),
                    QuizQuestion(
                        "Which CSS property changes text color?",
                        listOf("background", "font-size", "color", "align"),
                        2
                    ),
                    QuizQuestion(
                        "Which CSS property changes background color?",
                        listOf("bg", "background-color", "color", "text-align"),
                        1
                    ),
                    QuizQuestion(
                        "Which property changes text size?",
                        listOf("font-size", "font-family", "padding", "border"),
                        0
                    ),
                    QuizQuestion(
                        "What does padding do?",
                        listOf("Adds space inside an element", "Adds space outside an element", "Changes the font", "Deletes spacing"),
                        0
                    ),
                    QuizQuestion(
                        "Which property aligns text to the center?",
                        listOf("align-center", "text-align: center", "center: text", "font-align: middle"),
                        1
                    )
                )
            ),

            Subtopic(
                sutopicId = 7,
                subTopicName = "HTML Colors (Color Systems)", // renamed better
                headlines = listOf(

                    Headline(
                        majorHeadline = "Colors in HTML",
                        majorHeadileExplanation = "Colors in HTML are applied using CSS (either inline style, internal style, or external CSS). A color can be written in different formats: (1) Color Names like red, blue, green, (2) HEX codes like #ff0000, (3) RGB like rgb(255, 0, 0), (4) RGBA like rgba(255, 0, 0, 0.5) where the last value controls transparency, and (5) HSL like hsl(0, 100%, 50%). The browser understands all these formats and displays the same color depending on the values you use.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Colors in HTML</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <h2 style="color: red;">1) Color Name: red</h2>

  <h2 style="color: #1e90ff;">2) HEX: #1e90ff (DodgerBlue)</h2>

  <h2 style="color: rgb(34, 139, 34);">3) RGB: rgb(34, 139, 34) (ForestGreen)</h2>

  <h2 style="color: rgba(255, 0, 0, 0.5);">4) RGBA: rgba(255, 0, 0, 0.5) (Transparent Red)</h2>

  <h2 style="color: hsl(280, 100%, 50%);">5) HSL: hsl(280, 100%, 50%) (Purple-ish)</h2>

</body>
</html>
""".trimIndent(),
                        tip = "Tip: HEX and RGB are the most common in real projects. Use RGBA when you need transparency (like overlays)."
                    ),

                    Headline(
                        headline = "Text Color vs Background Color",
                        explaination = "In HTML/CSS, text color is controlled using the 'color' property, and background color is controlled using 'background-color' (or 'background'). You can style the whole page or specific elements like divs, buttons, and paragraphs.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Text & Background</title>
</head>
<body style="background-color: #f3f4f6; font-family: Arial; padding: 16px;">

  <div style="background-color: white; padding: 14px; border-radius: 12px;">
    <h2 style="color: #111827;">Card Title</h2>
    <p style="color: #374151;">This text uses 'color'. The box uses 'background-color'.</p>

    <button style="background-color: #2563eb; color: white; border: none; padding: 10px 14px; border-radius: 10px;">
      Blue Button
    </button>
  </div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The text uses color: ... and the box/button uses background-color: .... If you forget to set text color on a dark background, the text may be hard to read."
                    ),

                    Headline(
                        headline = "Opacity & Transparency (RGBA)",
                        explaination = "Transparency makes colors see-through. RGBA is like RGB but adds an extra value called alpha (opacity). Alpha goes from 0 to 1. 0 means fully transparent (invisible). 1 means fully solid.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>RGBA Overlay</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <div style="position: relative; background: url('https://via.placeholder.com/800x200') center/cover; height: 200px; border-radius: 14px; overflow: hidden;">
    <!-- Transparent overlay -->
    <div style="position: absolute; inset: 0; background: rgba(0, 0, 0, 0.55);"></div>

    <div style="position: relative; color: white; padding: 16px;">
      <h2>RGBA Overlay ✅</h2>
      <p>This text is readable because the overlay is semi-transparent.</p>
    </div>
  </div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The overlay uses rgba(0,0,0,0.55). It darkens the image but still shows it. This is a common real-world design trick."
                    ),

                    Headline(
                        headline = "Examples",
                        explaination = "Common colors are used for meaning: green = success, red = danger/error, yellow/orange = warning, blue = links/info, gray = neutral. Below is a simple palette demo using Names, HEX, and RGB.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Color Examples</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <h2>Common UI Colors</h2>

  <p style="background: #16a34a; color: white; padding: 10px; border-radius: 10px;">
    Success (HEX): #16a34a
  </p>

  <p style="background: rgb(220, 38, 38); color: white; padding: 10px; border-radius: 10px;">
    Error (RGB): rgb(220, 38, 38)
  </p>

  <p style="background: orange; color: black; padding: 10px; border-radius: 10px;">
    Warning (Name): orange
  </p>

  <p style="background: #2563eb; color: white; padding: 10px; border-radius: 10px;">
    Info/Links (HEX): #2563eb
  </p>

  <p style="background: #6b7280; color: white; padding: 10px; border-radius: 10px;">
    Neutral (Gray): #6b7280
  </p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Color Tips (Readable & Professional)",
                        explaination = "Good color use is not only about beauty—it's also about readability. Always ensure text can be read on the background. Dark background needs light text, and light background needs dark text. Also, avoid using too many strong colors at once because it becomes noisy.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Readable Colors</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <div style="background: #111827; color: #f9fafb; padding: 14px; border-radius: 12px;">
    <h2>Dark Background ✅</h2>
    <p>Use light text on dark backgrounds.</p>
  </div>

  <div style="background: #f9fafb; color: #111827; padding: 14px; border-radius: 12px; margin-top: 12px; border: 1px solid #e5e7eb;">
    <h2>Light Background ✅</h2>
    <p>Use dark text on light backgrounds.</p>
  </div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "This example shows the best practice: dark + light text, and light + dark text. That’s how real apps remain readable."
                    )
                ),

                questions = listOf(
                    QuizQuestion(
                        "Which CSS property changes text color?",
                        listOf("background-color", "color", "font-size", "align"),
                        1
                    ),
                    QuizQuestion(
                        "Which CSS property changes background color?",
                        listOf("bg", "background-color", "text-color", "font"),
                        1
                    ),
                    QuizQuestion(
                        "What does HEX color look like?",
                        listOf("rgb(0,0,0)", "#ff0000", "hsl(0,0,0)", "color:red;"),
                        1
                    ),
                    QuizQuestion(
                        "In RGBA, what does the A mean?",
                        listOf("Angle", "Alpha (transparency)", "Auto", "Array"),
                        1
                    ),
                    QuizQuestion(
                        "Which alpha value is fully transparent?",
                        listOf("0", "0.5", "1", "255"),
                        0
                    ),
                    QuizQuestion(
                        "Which format is most common in modern web design?",
                        listOf("Only names", "HEX and RGB", "Only HSL", "Only CMYK"),
                        1
                    ),
                    QuizQuestion(
                        "Which is a correct RGB format?",
                        listOf("rgb(255, 0, 0)", "rgb(#ff0000)", "rgb(red)", "rgb(1.0, 0.0, 0.0)"),
                        0
                    ),
                    QuizQuestion(
                        "For readability, what should you do on a dark background?",
                        listOf("Use dark text", "Use light text", "Remove text", "Use only red"),
                        1
                    )
                )
            ),
            Subtopic(
                sutopicId = 8,
                subTopicName = "Responsive HTML (Mobile Friendly)", // renamed better
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML Responsive",
                        majorHeadileExplanation = "Responsive design means your page looks good on phones, tablets, and computers. The FIRST step is adding the viewport meta tag in the <head>. Without it, mobile browsers may zoom out and make text tiny. With it, the page uses the device width correctly.",
                        codeExample = """
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">

  <!-- ✅ This makes the page fit the phone screen -->
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <title>Responsive Page</title>
  <style>
    body { font-family: Arial; padding: 16px; }
    .box { padding: 14px; border: 2px solid #333; border-radius: 12px; }
  </style>
</head>
<body>
  <div class="box">
    <h2>Responsive ✅</h2>
    <p>This page fits well on mobile because of the viewport meta tag.</p>
  </div>
</body>
</html>
""".trimIndent(),
                        tip = "Tip: Always include the viewport tag in every modern HTML page. It is like a 'mobile unlock key'.",
                        afterCodeEplainations = "The viewport tag tells the browser: use the device width as the page width and start at normal zoom (initial-scale=1.0)."
                    ),

                    Headline(
                        headline = "With viewport",
                        explaination = "With the viewport tag, the layout and text scale correctly on phones. If you use width: 100% and flexible boxes, your page adapts naturally.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>With Viewport</title>
  <style>
    body { font-family: Arial; padding: 16px; }
    img { width: 100%; max-width: 420px; border-radius: 12px; }
    .card { border: 1px solid #ccc; padding: 12px; border-radius: 12px; }
  </style>
</head>
<body>

  <div class="card">
    <h2>With Viewport ✅</h2>
    <p>The image below adjusts to the screen size.</p>
    <img src="https://via.placeholder.com/800x300" alt="Responsive image">
  </div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The viewport tag + image width:100% makes the image shrink on small screens instead of overflowing."
                    ),

                    Headline(
                        headline = "Without viewport",
                        explaination = "Without the viewport tag, mobile browsers act like the page is made for desktop. They zoom out to fit everything, making text very small and buttons hard to click.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Without Viewport</title>
  <style>
    body { font-family: Arial; padding: 16px; }
    .wide-box { width: 900px; border: 2px solid #333; padding: 12px; }
  </style>
</head>
<body>

  <div class="wide-box">
    <h2>Without Viewport ❌</h2>
    <p>On a phone, the browser may zoom out because it thinks this is a desktop page.</p>
  </div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "This page can feel 'tiny' on mobile because the phone tries to fit a wide desktop layout into a small screen."
                    ),

                    Headline(
                        headline = "Simple Responsive Layout Trick (Flex Wrap)",
                        explaination = "One easy way to make layouts responsive is using flexbox with flex-wrap. This allows items to move to the next line on small screens instead of overflowing.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Flex Wrap</title>
  <style>
    body { font-family: Arial; padding: 16px; }
    .row { display: flex; flex-wrap: wrap; gap: 10px; }
    .item { flex: 1 1 160px; border: 1px solid #333; padding: 12px; border-radius: 12px; }
  </style>
</head>
<body>

  <h2>Responsive Cards ✅</h2>
  <div class="row">
    <div class="item">Card 1</div>
    <div class="item">Card 2</div>
    <div class="item">Card 3</div>
    <div class="item">Card 4</div>
  </div>

</body>
</html>
""".trimIndent()
                    )
                ),

                questions = listOf(
                    QuizQuestion(
                        "What is the purpose of the viewport meta tag?",
                        listOf("To add JavaScript", "To make pages fit mobile screens", "To add images", "To change HTML version"),
                        1
                    ),
                    QuizQuestion(
                        "Where do you place the viewport meta tag?",
                        listOf("Inside <body>", "Inside <head>", "Inside <footer>", "Inside <title>"),
                        1
                    ),
                    QuizQuestion(
                        "What happens if you do NOT add the viewport tag on mobile?",
                        listOf("The page becomes faster", "The browser may zoom out and text looks tiny", "The page becomes colorful", "Nothing changes"),
                        1
                    ),
                    QuizQuestion(
                        "Which is the correct viewport tag?",
                        listOf(
                            "<meta viewport='true'>",
                            "<meta name='viewport' content='width=device-width, initial-scale=1.0'>",
                            "<viewport width='device'>",
                            "<meta name='mobile' content='on'>"
                        ),
                        1
                    ),
                    QuizQuestion(
                        "Which CSS makes an image responsive?",
                        listOf("img { height: 100%; }", "img { width: 100%; }", "img { font-size: 20px; }", "img { align: center; }"),
                        1
                    ),
                    QuizQuestion(
                        "What does flex-wrap do?",
                        listOf("Stops flexbox", "Allows items to move to the next line", "Makes text bold", "Deletes margin"),
                        1
                    ),
                    QuizQuestion(
                        "Which device needs responsiveness the most?",
                        listOf("Desktop only", "Phones and tablets", "Printers only", "Projectors only"),
                        1
                    ),
                    QuizQuestion(
                        "Which is a good responsive idea?",
                        listOf("Use fixed width 1200px always", "Use flexible widths like 100% and wrap", "Remove viewport", "Only use huge images"),
                        1
                    )
                )
            ),

            Subtopic(
                sutopicId = 9,
                subTopicName = "Centering in HTML (Text, Divs & Images)", // renamed better
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML Centered",
                        majorHeadileExplanation = "Centering means placing content in the middle. In modern HTML, centering is mostly done using CSS. You can center text using text-align, center a div using margin: auto, and center items perfectly using flexbox (the best method).",
                        headline = "Text Center",
                        explaination = "To center text inside an element (like a heading or paragraph), use: text-align: center. This centers only the text, not the whole box.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Center Text</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <h2 style="text-align: center;">Centered Heading ✅</h2>
  <p style="text-align: center;">This paragraph is centered using text-align.</p>

</body>
</html>
""".trimIndent(),
                        tip = "Tip: text-align centers text INSIDE the element. To center the element itself, you use margin: auto or flexbox."
                    ),

                    Headline(
                        headline = "Center a Div (Box) Horizontally",
                        explaination = "To center a div (a box) horizontally, give it a width and use margin-left and margin-right as auto. The browser calculates equal space on both sides.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Center Div</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <div style="width: 280px; margin: 0 auto; border: 2px solid #333; padding: 12px; border-radius: 12px;">
    <h3 style="margin-top: 0;">Centered Div ✅</h3>
    <p>This box is centered using <b>margin: 0 auto</b>.</p>
  </div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "We set width: 280px so the div does not take full width. Then margin: 0 auto centers it left and right automatically."
                    ),

                    Headline(
                        headline = "Center an Image",
                        explaination = "Images are inline by default, so the easiest way is to make the image a block and then use margin: auto. Another way is to put the image inside a container and use text-align: center.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Center Image</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <h2 style="text-align:center;">Centered Image ✅</h2>

  <img
    src="https://via.placeholder.com/220"
    alt="Centered"
    style="display: block; margin: 0 auto; border-radius: 12px;"
  >

  <p style="text-align:center;">Image is centered using <b>display:block</b> + <b>margin:auto</b>.</p>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "display: block makes the image behave like a block element. Then margin: 0 auto centers it horizontally."
                    ),

                    Headline(
                        headline = "Perfect Center (Best Modern Method: Flexbox)",
                        explaination = "If you want to center something both horizontally AND vertically (center of the screen), flexbox is the best method. This is used a lot for login pages, loading screens, and empty states.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Perfect Center</title>
</head>
<body style="margin:0; font-family: Arial;">

  <div style="
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    background: #f3f4f6;
  ">
    <div style="background: white; padding: 18px; border-radius: 14px; border: 1px solid #ddd; text-align: center;">
      <h2 style="margin: 0;">Perfect Center ✅</h2>
      <p style="margin: 8px 0 0;">This card is centered in the screen.</p>
    </div>
  </div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "display:flex creates a flex container. justify-content:center centers horizontally, align-items:center centers vertically, and height:100vh makes it use the whole screen height."
                    )
                ),

                questions = listOf(
                    QuizQuestion(
                        "Which property centers text inside an element?",
                        listOf("margin: auto", "text-align: center", "align-items: center", "display: block"),
                        1
                    ),
                    QuizQuestion(
                        "Which is used to center a div horizontally (with a fixed width)?",
                        listOf("text-align: center", "margin: 0 auto", "height: 100vh", "position: center"),
                        1
                    ),
                    QuizQuestion(
                        "To center an image using margin auto, what display should it have?",
                        listOf("inline", "block", "flex", "grid"),
                        1
                    ),
                    QuizQuestion(
                        "Which method is best for perfect (horizontal + vertical) centering?",
                        listOf("text-align", "float", "flexbox", "table"),
                        2
                    ),
                    QuizQuestion(
                        "What does justify-content: center do in flexbox?",
                        listOf("Centers vertically", "Centers horizontally", "Adds padding", "Changes font"),
                        1
                    ),
                    QuizQuestion(
                        "What does align-items: center do in flexbox?",
                        listOf("Centers vertically", "Centers horizontally", "Hides items", "Adds border"),
                        0
                    ),
                    QuizQuestion(
                        "Which unit makes an element the height of the screen?",
                        listOf("px", "em", "vh", "vw"),
                        2
                    )
                )
            ),
            Subtopic(
                sutopicId = 10,
                subTopicName = "Header & Footer (Website Layout)", // renamed better
                headlines = listOf(

                    Headline(
                        majorHeadline = "Header and Footer",
                        majorHeadileExplanation = "A header is the top section of a webpage (usually logo, name, navigation). A footer is the bottom section (copyright, contacts, links). They help structure a website professionally and make the page easier to navigate.",
                        tip = "Tip: Use semantic tags like <header>, <nav>, <main>, and <footer>. They help SEO and make your HTML easier to understand."
                    ),

                    Headline(
                        headline = "Header",
                        explaination = "The <header> tag is used for the top part of a page or section. It commonly contains a title, logo, or intro text.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Header Example</title>
  <style>
    header { padding: 14px; background: #111827; color: white; border-radius: 12px; }
  </style>
</head>
<body style="font-family: Arial; padding: 16px;">
  <header>
    <h1 style="margin:0;">My Website</h1>
    <p style="margin:6px 0 0;">Welcome to my page!</p>
  </header>
</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Header and Nav",
                        explaination = "Navigation (menu) is usually inside a <nav> tag. It contains links to pages or sections like Home, About, Contact.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Header + Nav</title>
  <style>
    header { background: #2563eb; color: white; padding: 14px; border-radius: 12px; }
    nav a { color: white; text-decoration: none; margin-right: 12px; font-weight: bold; }
    nav a:hover { text-decoration: underline; }
  </style>
</head>
<body style="font-family: Arial; padding: 16px;">

  <header>
    <h1 style="margin:0;">Nick's Site</h1>
    <nav style="margin-top: 10px;">
      <a href="#">Home</a>
      <a href="#">Tutorials</a>
      <a href="#">Contact</a>
    </nav>
  </header>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Header, Main Body (Content)",
                        explaination = "The main content of your webpage should be inside <main>. This helps the browser and search engines know what the main page content is.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Header + Main</title>
  <style>
    header { background: #111827; color: white; padding: 14px; border-radius: 12px; }
    main { margin-top: 12px; padding: 14px; border: 1px solid #ddd; border-radius: 12px; }
  </style>
</head>
<body style="font-family: Arial; padding: 16px;">

  <header>
    <h1 style="margin:0;">Learning HTML</h1>
    <p style="margin:6px 0 0;">Simple layout example</p>
  </header>

  <main>
    <h2>Main Content</h2>
    <p>This is where your page content goes: articles, text, images, forms, etc.</p>
  </main>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Footer",
                        explaination = "The <footer> tag is the bottom part of a page. It can contain copyright, contacts, social links, and extra navigation links.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Footer Example</title>
  <style>
    footer { margin-top: 14px; padding: 14px; background: #f3f4f6; border-radius: 12px; }
  </style>
</head>
<body style="font-family: Arial; padding: 16px;">

  <h2>Page Content</h2>
  <p>Scroll down to see footer.</p>

  <footer>
    <p style="margin:0;">© 2026 Nick Dieda. All rights reserved.</p>
  </footer>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Full Mini Website (Header + Nav + Main + Footer)",
                        explaination = "This is a full simple website structure. You can reuse this template for many projects.",
                        codeExample = """
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Mini Website</title>
  <style>
    body { font-family: Arial; margin: 0; background: #f3f4f6; }
    header { background: #111827; color: white; padding: 16px; }
    nav a { color: white; text-decoration: none; margin-right: 12px; font-weight: bold; }
    nav a:hover { text-decoration: underline; }
    main { padding: 16px; }
    .card { background: white; padding: 14px; border-radius: 14px; border: 1px solid #ddd; max-width: 700px; }
    footer { padding: 14px; text-align: center; background: white; border-top: 1px solid #e5e7eb; margin-top: 18px; }
  </style>
</head>
<body>

  <header>
    <h1 style="margin:0;">Nick Dieda</h1>
    <nav style="margin-top: 10px;">
      <a href="#">Home</a>
      <a href="#">Projects</a>
      <a href="#">Contact</a>
    </nav>
  </header>

  <main>
    <div class="card">
      <h2>Welcome 👋</h2>
      <p>This is a clean layout using header, nav, main, and footer.</p>
      <button style="background:#2563eb; color:white; border:none; padding:10px 14px; border-radius:10px; cursor:pointer;">
        Get Started
      </button>
    </div>
  </main>

  <footer>
    <p style="margin:0;">© 2026 Nick Dieda • Built with HTML</p>
  </footer>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "This page has all important layout parts. The header contains the site name and menu. The main contains the page content. The footer contains copyright. This is a strong base for real projects."
                    )
                ),

                questions = listOf(
                    QuizQuestion("What is the purpose of a header?", listOf("Stores images", "Top section for title/logo/nav", "Executes JS", "Changes phone settings"), 1),
                    QuizQuestion("Which tag is best for navigation links?", listOf("<nav>", "<footer>", "<meta>", "<section-nav>"), 0),
                    QuizQuestion("Which tag is best for main page content?", listOf("<header>", "<main>", "<title>", "<link>"), 1),
                    QuizQuestion("What is the purpose of a footer?", listOf("Top menu", "Bottom section for extra info", "Makes page responsive", "Adds sound"), 1),
                    QuizQuestion("Which is a semantic layout structure?", listOf("<div><div><div>", "<header><main><footer>", "<b><i><u>", "<br><hr><img>"), 1),
                    QuizQuestion("Why are semantic tags useful?", listOf("They make HTML harder", "They help SEO and readability", "They remove CSS", "They block JavaScript"), 1),
                    QuizQuestion("Where is <nav> usually placed?", listOf("Inside <head>", "Inside <header> or near top", "Inside <footer> only", "Inside <title>"), 1)
                )
            ),
            Subtopic(
                sutopicId = 11,
                subTopicName = "HTML Headings (h1 to h6)", // renamed better
                headlines = listOf(

                    Headline(
                        majorHeadline = "Headings in HTML",
                        majorHeadileExplanation = "Headings are titles used to organize content. HTML has 6 heading levels: <h1> is the biggest and most important, and <h6> is the smallest. Headings help users read easily and help Google understand your page structure.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>All Headings</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <h1>Nick Dieda - h1</h1>
  <h2>Nick Dieda - h2</h2>
  <h3>Nick Dieda - h3</h3>
  <h4>Nick Dieda - h4</h4>
  <h5>Nick Dieda - h5</h5>
  <h6>Nick Dieda - h6</h6>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "All headings display the same text but with different sizes. Use <h1> for the main page title, then use <h2> for sections, and <h3> for sub-sections.",
                        tip = "Tip: Use only ONE <h1> per page for a clean structure (main title)."
                    ),

                    Headline(
                        headline = "Why Headings Matter (SEO + Readability)",
                        explaination = "Headings are not just about size. They give meaning and structure. Screen readers use headings to help users navigate. Search engines also use headings to understand what your page is about.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Structured Headings</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <h1>Learning HTML</h1>
  <p>This is the main title.</p>

  <h2>Introduction</h2>
  <p>Intro text goes here.</p>

  <h2>Lessons</h2>
  <h3>Lesson 1: Elements</h3>
  <h3>Lesson 2: Attributes</h3>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Notice the order: h1 → h2 → h3. This makes your page well-organized like a book: Title → Chapters → Topics."
                    ),

                    Headline(
                        headline = "Don’t Skip Heading Levels",
                        explaination = "Try not to jump from <h1> directly to <h4>. It confuses structure tools. Instead, go in order like h1, then h2, then h3.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Heading Order</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <h1>Main Title</h1>
  <h2>Section Title</h2>
  <h3>Small Topic</h3>

  <p>This is the best heading flow.</p>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "This structure helps both humans and search engines. If you need smaller text, use CSS instead of jumping levels."
                    ),

                    Headline(
                        headline = "Styling Heading (Inline Styling)",
                        explaination = "You can style headings using inline CSS with the style attribute. But for bigger websites, internal/external CSS is better. Here we use inline style for learning.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Styled Headings</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <h1 style="color: #2563eb; text-align: center;">Nick Dieda</h1>
  <h2 style="background: #111827; color: white; padding: 10px; border-radius: 12px;">
    Styled Section Title
  </h2>
  <h3 style="border-left: 6px solid #16a34a; padding-left: 10px;">
    Green Line Heading
  </h3>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Heading + Paragraph (Common Real Layout)",
                        explaination = "Most pages use headings with paragraphs. Headings introduce the idea, and paragraphs explain it.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Heading + Paragraph</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <h2>About Nick Dieda</h2>
  <p>Nick is learning HTML and building amazing apps. This section is introduced by a heading.</p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Headings Inside a Card",
                        explaination = "A modern look is to place headings inside a card (a box). This is common in apps and dashboards.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Heading Card</title>
</head>
<body style="font-family: Arial; padding: 16px; background: #f3f4f6;">

  <div style="background:white; padding: 14px; border-radius: 14px; border: 1px solid #ddd; max-width: 420px;">
    <h2 style="margin: 0;">Card Title</h2>
    <p style="margin: 8px 0 0; color:#374151;">This card uses a heading + paragraph style.</p>
  </div>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Mini Practice Challenge",
                        explaination = "Try building a page with: 1 h1 title, 2 h2 sections, and 2 h3 subsections. This is the perfect practice to master headings.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Heading Practice</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <h1>Nick Dieda - Portfolio</h1>

  <h2>Projects</h2>
  <h3>HTML Learning App</h3>
  <h3>JavaScript Compiler App</h3>

  <h2>Contact</h2>
  <h3>Email</h3>
  <h3>Social Links</h3>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "This shows a perfect heading structure: main title (h1), sections (h2), and sub-sections (h3)."
                    ),

                    Headline(
                        headline = "Other Heading Tips",
                        explaination = "Use headings for meaning, not just size. If you want smaller text, use CSS (font-size) instead of using lower headings incorrectly.",
                        codeExample = "",
                        afterCodeEplainations = "Example: Don’t use <h6> just because you want small text. Use <p> and style it with CSS."
                    )
                ),

                questions = listOf(
                    QuizQuestion("How many heading levels exist in HTML?", listOf("3", "6", "8", "10"), 1),
                    QuizQuestion("Which heading is the biggest?", listOf("<h6>", "<h4>", "<h1>", "<h2>"), 2),
                    QuizQuestion("Which heading is the smallest?", listOf("<h1>", "<h2>", "<h5>", "<h6>"), 3),
                    QuizQuestion("What is a good practice for <h1>?", listOf("Use many h1 tags", "Use one h1 per page", "Never use h1", "Put h1 inside <head>"), 1),
                    QuizQuestion("Why are headings important?", listOf("For SEO and structure", "To make internet faster", "To store images", "To run JavaScript"), 0),
                    QuizQuestion("What is the correct heading flow?", listOf("h4 → h1 → h2", "h1 → h2 → h3", "h3 → h6 → h1", "h2 → h1 → h5"), 1),
                    QuizQuestion("If you need smaller text, what should you do?", listOf("Use <h6> always", "Use CSS font-size", "Delete headings", "Use <meta>"), 1)
                )
            ),
            Subtopic(
                sutopicId = 12,
                subTopicName = "HTML Paragraphs (Text & Formatting)", // renamed better
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML Paragraphs",
                        majorHeadileExplanation = "A paragraph in HTML is written using the <p> tag. It is used for normal text like explanations, stories, descriptions, and notes. Browsers automatically add space before and after each paragraph.",
                        tip = "Tip: Use <p> for text blocks. Don’t use lots of <br> to fake paragraphs—use real paragraphs instead.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Paragraph Basics</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <h2>Paragraph Example</h2>

  <p>This is a paragraph. Browsers add space around it automatically.</p>

  <p>This is another paragraph. Notice it starts on a new line and has spacing too.</p>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The <p> tag has an opening tag <p> and a closing tag </p>. Everything inside becomes paragraph text."
                    ),

                    Headline(
                        explaination = "Paragraphs are used for reading content. You can also add important text using tags inside a paragraph like <b> (bold), <i> (italic), <u> (underline), and <mark> (highlight).",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Paragraph Text Styles</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <h2>Paragraph With Inline Tags</h2>

  <p>
    This is <b>bold</b>, this is <i>italic</i>, this is <u>underlined</u>,
    and this is <mark>highlighted</mark>.
  </p>

  <!-- <small> makes text smaller -->
  <p>Normal text and <small>small text</small> in the same paragraph.</p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Styling Paragraph (Inline Style)",
                        explaination = "You can style a paragraph using the style attribute (inline CSS). Inline style is good for learning, but for bigger sites you should use internal/external CSS.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Styled Paragraph</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <p style="font-size: 18px; line-height: 1.6; padding: 12px; border: 1px solid #ddd; border-radius: 12px;">
    This paragraph is styled using inline CSS:
    bigger font, better spacing, padding, and a border.
  </p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Aligning Paragraph Text",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Text Alignment</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <h2>All Text Alignments</h2>

  <p style="text-align: left; border: 1px solid #ddd; padding: 10px; border-radius: 10px;">
    Left aligned (default) ✅
  </p>

  <p style="text-align: center; border: 1px solid #ddd; padding: 10px; border-radius: 10px;">
    Center aligned ✅
  </p>

  <p style="text-align: right; border: 1px solid #ddd; padding: 10px; border-radius: 10px;">
    Right aligned ✅
  </p>

  <p style="text-align: justify; border: 1px solid #ddd; padding: 10px; border-radius: 10px;">
    Justified text ✅ This spreads words so the left and right edges look straight,
    like a newspaper paragraph.
  </p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Paragraph Colors (Text Color Examples)",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Text Colors</title>
</head>
<body style="font-family: Arial; padding: 16px;">

  <h2>Text Color Examples</h2>

  <p style="color: red;">This paragraph uses a color name: red</p>
  <p style="color: #2563eb;">This paragraph uses HEX: #2563eb</p>
  <p style="color: rgb(22, 163, 74);">This paragraph uses RGB: rgb(22, 163, 74)</p>

  <p style="color: #111827; background: #f3f4f6; padding: 10px; border-radius: 10px;">
    You can also add a background color for contrast.
  </p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Other Common Paragraph Styles",
                        explaination = "These are popular paragraph styles used in real websites: background, border-left, spacing, shadow, and max-width (to make text easier to read).",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Common Paragraph Styling</title>
</head>
<body style="font-family: Arial; padding: 16px; background: #f3f4f6;">

  <h2>Beautiful Paragraph Styles</h2>

  <p style="
    max-width: 640px;
    background: white;
    padding: 14px;
    border-radius: 14px;
    border: 1px solid #ddd;
    line-height: 1.7;
  ">
    This is a clean reading style. The <b>max-width</b> prevents lines from becoming too long,
    which makes reading easier.
  </p>

  <p style="
    max-width: 640px;
    background: white;
    padding: 14px;
    border-radius: 14px;
    border-left: 6px solid #16a34a;
    line-height: 1.7;
  ">
    This paragraph uses a <b>left border</b> (like a tip or quote box). Very common in tutorials.
  </p>

  <p style="
    max-width: 640px;
    background: #111827;
    color: white;
    padding: 14px;
    border-radius: 14px;
    line-height: 1.7;
  ">
    Dark mode paragraph style ✅ (useful for code explanations and highlight sections).
  </p>

</body>
</html>
""".trimIndent()
                    )
                ),

                questions = listOf(
                    QuizQuestion(
                        "Which tag is used for a paragraph in HTML?",
                        listOf("<para>", "<p>", "<text>", "<paragraph>"),
                        1
                    ),
                    QuizQuestion(
                        "What happens when you create two <p> tags?",
                        listOf("They join on the same line", "Browser adds spacing and new lines", "It causes an error", "Only one shows"),
                        1
                    ),
                    QuizQuestion(
                        "Which property centers paragraph text?",
                        listOf("margin: auto", "text-align: center", "align-items: center", "display: block"),
                        1
                    ),
                    QuizQuestion(
                        "Which alignment spreads words to make straight edges (newspaper style)?",
                        listOf("left", "center", "right", "justify"),
                        3
                    ),
                    QuizQuestion(
                        "Which is a correct way to set paragraph text color?",
                        listOf("text-color: red", "color: red", "font-color: red", "paint: red"),
                        1
                    ),
                    QuizQuestion(
                        "Which tag makes text bold inside a paragraph?",
                        listOf("<strong>", "<b>", "<bold>", "<br>"),
                        1
                    ),
                    QuizQuestion(
                        "Why is max-width useful for long paragraphs?",
                        listOf("Makes text brighter", "Prevents long lines, improves reading", "Adds more colors", "Removes spacing"),
                        1
                    )
                )
            ),


            Subtopic(
                sutopicId = 13,
                subTopicName = "HTML Links (Navigation & Anchors)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML Links",
                        majorHeadileExplanation = "HTML links allow users to move from one page to another, open websites, jump to sections on the same page, or even open emails and files. Links are created using the <a> (anchor) tag.",
                        headline = "Uses of Links in HTML",
                        explaination = """
• Navigate between pages  
• Open external websites  
• Jump to sections inside a page  
• Download files  
• Send emails (mailto)  
• Build menus and navigation bars
""".trimIndent(),
                        tip = "Always make links clear and readable. Avoid using 'click here'."
                    ),

                    Headline(
                        headline = "Link Structure",
                        explaination = """
Basic structure:

• <a> → anchor tag  
• href → destination URL  
• Link text → what users click
""".trimIndent(),
                        codeExample = """
<a href="https://example.com">Visit Example</a>
"""
                    ),

                    Headline(
                        headline = "Internal Linking (Same Project)",
                        explaination = "Used to move between HTML files in the same folder.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Internal Link</h2>

<a href="about.html">Go to About Page</a>

</body>
</html>
"""
                    ),

                    Headline(
                        headline = "External Linking",
                        explaination = "Used to open websites outside your project.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>External Link</h2>

<a href="https://nickdieda.web.app">Visit Nick Dieda Website</a>

</body>
</html>
"""
                    ),

                    Headline(
                        headline = "In-Page Linking (Jump Links)",
                        explaination = "Used to jump to sections inside the same page.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<a href="#section2">Go to Section 2</a>

<p>Scroll down...</p>
<p style="height:400px"></p>

<h2 id="section2">Section 2</h2>
<p>You jumped here!</p>

</body>
</html>
"""
                    ),

                    Headline(
                        headline = "Open Link in New Tab",
                        explaination = "Use target=\"_blank\" to open links in a new browser tab.",
                        codeExample = """
<a href="https://nickdieda.web.app" target="_blank">
Open Nick Dieda in new tab
</a>
"""
                    ),

                    Headline(
                        headline = "Link Styling",
                        explaination = "Links can be styled using CSS (color, underline, hover).",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<a href="#" style="color: green; text-decoration: none;">Styled Link</a>

</body>
</html>
"""
                    )
                ),

                questions = listOf(
                    QuizQuestion("Which tag creates a link?", listOf("<link>", "<a>", "<href>", "<url>"), 1),
                    QuizQuestion("Which attribute holds the destination?", listOf("src", "path", "href", "target"), 2),
                    QuizQuestion("Which opens a link in a new tab?", listOf("new", "_open", "_blank", "_tab"), 2),
                    QuizQuestion("What does #id link to?", listOf("Another website", "An image", "A section on the same page", "CSS"), 2),
                    QuizQuestion("Which tag name means anchor?", listOf("a", "p", "h1", "div"), 0)
                )
            ),
            Subtopic(
                sutopicId = 14,
                subTopicName = "HTML Line Breaks",
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML Line Break",
                        majorHeadileExplanation = "The <br> tag forces text onto a new line. It has NO closing tag.",
                        tip = "Use <p> for paragraphs. Use <br> only for small breaks like addresses."
                    ),

                    Headline(
                        headline = "Without Line Break",
                        codeExample = """
<p>Hello Nick welcome to HTML class today</p>
""",
                        afterCodeEplainations = "All text stays on one line."
                    ),

                    Headline(
                        headline = "With Line Break",
                        codeExample = """
<p>
Hello Nick<br>
Welcome to HTML<br>
Enjoy learning!
</p>
""",
                        afterCodeEplainations = "Each <br> moves text to a new line."
                    )
                ),

                questions = listOf(
                    QuizQuestion("Which tag creates a line break?", listOf("<lb>", "<break>", "<br>", "<p>"), 2),
                    QuizQuestion("Does <br> have a closing tag?", listOf("Yes", "No"), 1),
                    QuizQuestion("Best tag for paragraphs?", listOf("<br>", "<p>", "<h1>", "<div>"), 1),
                    QuizQuestion("Which is correct?", listOf("<br></br>", "<br/>", "<br>", "Both B and C"), 3),
                    QuizQuestion("Use <br> mainly for:", listOf("Titles", "Addresses & short breaks", "Layouts", "Menus"), 1)
                )
            ),
                    Subtopic(
                    sutopicId = 15,
            subTopicName = "HTML Horizontal Rule",
            headlines = listOf(

                Headline(
                    majorHeadline = "Horizontal Rule",
                    majorHeadileExplanation = "The <hr> tag draws a horizontal line used to separate content.",
                    codeExample = """
<h2>Title</h2>
<hr>
<p>Content below line</p>
""",
                    tip = "Use <hr> to visually divide sections."
                ),

                Headline(
                    headline = "Width & Height",
                    codeExample = """
<hr style="width:60%; height:4px; background:black;">
"""
                ),

                Headline(
                    headline = "Colored Lines",
                    codeExample = """
<hr style="height:4px; background:red;">
<hr style="height:4px; background:#2563eb;">
<hr style="height:4px; background:rgb(22,163,74);">
"""
                ),

                Headline(
                    headline = "Rounded Lines",
                    codeExample = """
<hr style="height:6px; background:purple; border-radius:20px;">
"""
                ),

                Headline(
                    headline = "Styled Section Divider",
                    codeExample = """
<hr style="border:none;height:2px;background:linear-gradient(to right, blue, green);">
"""
                )
            ),

            questions = listOf(
                QuizQuestion("Which tag creates a horizontal line?", listOf("<line>", "<hr>", "<br>", "<div>"), 1),
                QuizQuestion("Does <hr> have a closing tag?", listOf("Yes", "No"), 1),
                QuizQuestion("Which property changes thickness?", listOf("width", "height", "color", "align"), 1),
                QuizQuestion("Which adds rounded edges?", listOf("radius", "curve", "border-radius", "round"), 2),
                QuizQuestion("Main purpose of <hr>?", listOf("Text", "Images", "Section separation", "Links"), 2)
            )
        ),
                            Subtopic(
                            sutopicId = 16,
            subTopicName = "HTML Text Formatting",
            headlines = listOf(

                Headline(
                    majorHeadline = "HTML Text Formatting",
                    majorHeadileExplanation = "HTML provides special tags to format text like bold, italic, underline, highlight, small text and more.",
                    tip = "Use semantic tags like <strong> instead of <b> when possible."
                ),

                Headline(
                    headline = "Text Formatting Elements",
                    explaination = """
• <b> Bold  
• <strong> Important  
• <i> Italic  
• <u> Underline  
• <mark> Highlight  
• <small> Small text  
• <del> Deleted  
• <sub> Subscript  
• <sup> Superscript
""".trimIndent(),
                    codeExample = """
<!DOCTYPE html>
<html>
<body>

<p><b>Bold</b></p>
<p><strong>Important</strong></p>
<p><i>Italic</i></p>
<p><u>Underline</u></p>
<p><mark>Highlighted</mark></p>
<p><small>Small text</small></p>
<p><del>Deleted</del></p>
<p>H<sub>2</sub>O</p>
<p>x<sup>2</sup></p>

</body>
</html>
""",
                    afterCodeEplainations = "Each tag changes how text appears or behaves."
                ),

                Headline(
                    headline = "Combined Example",
                    codeExample = """
<p>
<strong>Nick</strong> is <i>learning</i> <mark>HTML</mark> and
x<sup>2</sup> + H<sub>2</sub>O looks cool 😄
</p>
"""
                )
            ),

            questions = listOf(
                QuizQuestion("Which tag highlights text?", listOf("<b>", "<mark>", "<i>", "<u>"), 1),
                QuizQuestion("Which shows power like x²?", listOf("<sub>", "<sup>", "<small>", "<del>"), 1),
                QuizQuestion("Which shows deleted text?", listOf("<cut>", "<remove>", "<del>", "<erase>"), 2),
                QuizQuestion("Which tag means important text?", listOf("<b>", "<strong>", "<i>", "<u>"), 1),
                QuizQuestion("Which makes text smaller?", listOf("<tiny>", "<sub>", "<small>", "<mini>"), 2)
            )
        ),

            Subtopic(
                sutopicId = 19,
                subTopicName = "Block vs Inline Elements (Layout Basics)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML Block-Level Elements",
                        explaination = """
Block elements start on a NEW line and take the FULL width available.
That’s why they are used for layout and structure.

Common block elements (tag → use):
• <div> → container / grouping
• <p> → paragraph text
• <h1>…<h6> → headings
• <section> → page section
• <article> → independent content
• <header> → top area of a section/page
• <footer> → bottom area
• <nav> → navigation links
• <ul>, <ol> → lists
• <li> → list item
""".trimIndent(),
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <title>Block Elements</title>
</head>
<body>

<h2>Block Elements Demo</h2>

<div style="background:#e0f2fe; padding:10px; margin-bottom:10px;">
  I am a DIV (block). I take full width.
</div>

<p style="background:#dcfce7; padding:10px;">
  I am a paragraph (block). I also take full width.
</p>

<section style="background:#fef9c3; padding:10px;">
  I am a SECTION (block). I group related content.
</section>

</body>
</html>
""".trimIndent(),
                        tip = "If you want structure and layout, use block elements like div/section/article."
                    ),

                    Headline(
                        headline = "Block Elements Example (Mini Layout)",
                        explaination = "This example shows a simple page layout using block elements.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<header style="background:#111827;color:white;padding:15px;">
  <h2>Nick Dieda Website</h2>
</header>

<nav style="background:#e5e7eb;padding:10px;">
  <a href="#">Home</a> | <a href="#">About</a> | <a href="#">Contact</a>
</nav>

<main style="padding:15px;">
  <h3>Welcome 👋</h3>
  <p>This is the main content area.</p>
</main>

<footer style="background:#111827;color:white;padding:10px;">
  &copy; 2026 Nick Dieda
</footer>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Notice: Each section appears on its own line because they are block elements."
                    ),

                    Headline(
                        headline = "Inline Elements",
                        explaination = """
Inline elements DO NOT start on a new line.
They only take the space they need, and they sit inside text.

Common inline elements (tag → use):
• <span> → style a small part of text
• <a> → link
• <b> / <strong> → bold / important
• <i> / <em> → italic / emphasized
• <img> → image (inline by default)
• <mark> → highlight
""".trimIndent(),
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<p>
  Hello <span style="color:blue; font-weight:bold;">Nick</span>,
  visit <a href="https://nickdieda.web.app" target="_blank">my website</a>.
</p>

<p>
  This is <strong>important</strong> and this is <em>emphasis</em>.
</p>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Inline elements stay in the same line with the text."
                    ),

                    Headline(
                        headline = "Block vs Inline (Quick Comparison)",
                        explaination = "This shows block and inline clearly in one page.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h3>Block Example</h3>
<div style="background:lightblue;padding:10px;">Block DIV 1</div>
<div style="background:lightgreen;padding:10px;">Block DIV 2</div>

<h3>Inline Example</h3>
<span style="background:pink;">Inline span 1</span>
<span style="background:orange;">Inline span 2</span>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Block goes down (new line). Inline stays across (same line)."
                    )
                ),

                questions = listOf(
                    QuizQuestion("What is a block element?", listOf("Stays in same line", "Starts on a new line and takes full width", "Only used for images", "Only for links"), 1),
                    QuizQuestion("Which is a block element?", listOf("<span>", "<a>", "<div>", "<strong>"), 2),
                    QuizQuestion("Which is an inline element?", listOf("<p>", "<div>", "<section>", "<span>"), 3),
                    QuizQuestion("What does <span> do mostly?", listOf("Creates paragraphs", "Creates a layout section", "Styles part of text", "Creates a table"), 2),
                    QuizQuestion("Which element is used for navigation?", listOf("<nav>", "<span>", "<mark>", "<title>"), 0),
                    QuizQuestion("Inline elements take:", listOf("Full width", "Only the space they need", "Half the page", "A full line always"), 1)
                )
            ),
            Subtopic(
                sutopicId = 17,
                subTopicName = "HTML Sections & Semantic Layout",
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML Sections",
                        majorHeadileExplanation = """
Sections help you organize your webpage into parts like header, navigation, main content, and footer.
It makes your HTML easier to read and helps search engines understand your page.
""".trimIndent(),
                        tip = "Use semantic elements (<header>, <main>, <footer>) for clean and professional websites."
                    ),

                    Headline(
                        headline = "Elements Used for Sections",
                        explaination = """
Common section elements:
• <header> → top part (logo/title)
• <nav> → menu links
• <main> → main content
• <section> → grouped content
• <article> → independent content (post/news)
• <aside> → side content (ads/notes)
• <footer> → bottom part
""".trimIndent(),
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<header style="background:#0f172a;color:white;padding:15px;">
  <h2>My HTML App</h2>
</header>

<nav style="background:#e2e8f0;padding:10px;">
  <a href="#">Home</a> | <a href="#">Lessons</a> | <a href="#">Quiz</a>
</nav>

<main style="padding:15px;">
  <section style="background:#f1f5f9;padding:10px;margin-bottom:10px;">
    <h3>Section: HTML Basics</h3>
    <p>This section groups related content.</p>
  </section>

  <article style="background:#dcfce7;padding:10px;">
    <h3>Article: Lesson 1</h3>
    <p>This looks like a blog post or a lesson card.</p>
  </article>
</main>

<footer style="background:#0f172a;color:white;padding:10px;">
  &copy; 2026 HTML Learning App
</footer>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "This is a full page layout using semantic section elements."
                    ),

                    Headline(
                        headline = "HTML5 Semantic Elements",
                        explaination = """
Semantic elements describe their meaning clearly.
Examples:
• <header>, <nav>, <main>, <section>, <article>, <aside>, <footer>
""".trimIndent(),
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<section>
  <h2>Why Semantic HTML?</h2>
  <p>Because it makes your code readable and professional.</p>
</section>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Element <div> (Generic Container)",
                        explaination = "<div> is used when you want a container but no special meaning. Very common in layout.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<div style="background:lightgray;padding:15px;">
  <h3>This is a div</h3>
  <p>It is just a container for grouping.</p>
</div>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Element <span> (Inline Container)",
                        explaination = "<span> styles small parts of text inside a line.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<p>Hello <span style="color:blue;font-weight:bold;">Nick</span> 👋</p>

</body>
</html>
""".trimIndent()
                    )
                ),

                questions = listOf(
                    QuizQuestion("Which element is best for navigation links?", listOf("<nav>", "<header>", "<section>", "<span>"), 0),
                    QuizQuestion("What is <main> used for?", listOf("The menu", "The main content area", "The footer", "Images only"), 1),
                    QuizQuestion("Which is NOT a semantic element?", listOf("<div>", "<header>", "<footer>", "<article>"), 0),
                    QuizQuestion("<article> is best for:", listOf("A single independent post/content", "A menu bar", "A page title", "A button"), 0),
                    QuizQuestion("<aside> is used for:", listOf("Main content", "Side content", "Only headers", "Tables"), 1),
                    QuizQuestion("<span> is:", listOf("Block element", "Inline element", "Table element", "Form element"), 1)
                )
            ),
            Subtopic(
                sutopicId = 18,
                subTopicName = "Images in HTML (img Tag & Styling)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "Images in HTML",
                        majorHeadileExplanation = "Images are added using the <img> tag. It uses attributes like src, alt, width, and height.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Image Example</h2>
<img src="https://via.placeholder.com/250" alt="Sample image">

</body>
</html>
""".trimIndent(),
                        tip = "Always use alt text. It helps accessibility and shows if image fails to load."
                    ),

                    Headline(
                        headline = "src (Image Source)",
                        explaination = "src tells the browser where the image is located (local file or web link).",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<img src="https://via.placeholder.com/200" alt="Image from web">

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "alt (Alternative Text)",
                        explaination = "alt is the text shown when the image cannot load. Also used by screen readers.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<img src="wrong-link.png" alt="This text appears if image fails">

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Width and Height",
                        explaination = "You can control image size using width and height (pixels or %).",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<img src="https://via.placeholder.com/400"
     alt="Big image"
     width="200" height="200">

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The image is resized to 200x200 pixels."
                    ),

                    Headline(
                        headline = "Styling Images (Border, Round, Shadow)",
                        explaination = "Common styles: border, border-radius, box-shadow, and margin.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<img src="https://via.placeholder.com/220"
     alt="Styled image"
     style="border:3px solid black; border-radius:20px; box-shadow:0 6px 15px rgba(0,0,0,0.3);">

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Floating Image (Text Wrap)",
                        explaination = "Float makes text wrap around the image.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<img src="https://via.placeholder.com/150"
     alt="Float image"
     style="float:left; margin-right:10px;">

<p>
This text wraps around the image. Floating is used for magazine-style layouts.
</p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Circle / Shape Image",
                        explaination = "To make a circle, use border-radius: 50%.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<img src="https://via.placeholder.com/200"
     alt="Circle image"
     style="width:200px; height:200px; border-radius:50%;">

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Image as a Link",
                        explaination = "Wrap an image inside <a> to make it clickable.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<a href="https://nickdieda.web.app" target="_blank">
  <img src="https://via.placeholder.com/180" alt="Clickable image">
</a>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Web Image (Online Image URL)",
                        explaination = "Web images are loaded from the internet using an image URL.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<img src="https://images.unsplash.com/photos/2LowviVHZ-E?auto=format&fit=crop&w=400&q=60"
     alt="Web image"
     style="width:250px;border-radius:12px;">

</body>
</html>
""".trimIndent()
                    )
                ),

                questions = listOf(
                    QuizQuestion("Which tag is used for images?", listOf("<img>", "<picture>", "<image>", "<src>"), 0),
                    QuizQuestion("Which attribute is the image location?", listOf("alt", "href", "src", "path"), 2),
                    QuizQuestion("What is alt used for?", listOf("Coloring image", "Backup text & accessibility", "Changing size", "Adding border"), 1),
                    QuizQuestion("How to make a circle image?", listOf("radius:circle", "border-radius:50%", "shape:round", "float:center"), 1),
                    QuizQuestion("To make image clickable, put it inside:", listOf("<div>", "<a>", "<p>", "<h1>"), 1),
                    QuizQuestion("Float left does what?", listOf("Moves image down", "Wraps text around image", "Deletes image", "Centers image"), 1)
                )
            ),
            Subtopic(
                sutopicId = 20,
                subTopicName = "HTML Tables (Rows, Columns & Styling)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML Tables",
                        majorHeadileExplanation = "Tables are used to display data in rows and columns using tags like <table>, <tr>, <th>, and <td>.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<table border="1">
  <tr>
    <th>Name</th>
    <th>Course</th>
  </tr>
  <tr>
    <td>Nick</td>
    <td>HTML</td>
  </tr>
</table>

</body>
</html>
""".trimIndent(),
                        tip = "Use tables for data (like marks, lists, records) — not for website layout."
                    ),

                    Headline(
                        headline = "Table Elements (Tags)",
                        explaination = """
Common tags:
• <table> → creates table
• <tr> → table row
• <th> → header cell (bold by default)
• <td> → normal cell
• <caption> → title of table
• <thead> → header group
• <tbody> → body group
• <tfoot> → footer group
• <colgroup> and <col> → style columns
""".trimIndent(),
                        codeExample = """
<table border="1">
  <caption>Student Table</caption>
  <tr><th>Name</th><th>Marks</th></tr>
  <tr><td>Nick</td><td>90</td></tr>
</table>
""".trimIndent(),
                        afterCodeEplainations = "These tags build the structure of a table."
                    ),

                    Headline(
                        headline = "Table Attributes / Styling (Beginner Friendly)",
                        explaination = """
Modern HTML uses CSS for styling instead of old attributes.
Useful styles:
• border
• width
• text-align
• padding
• background-color
""".trimIndent(),
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  table { width: 60%; border-collapse: collapse; }
  th, td { border: 1px solid black; padding: 10px; text-align: center; }
  th { background: #e0f2fe; }
</style>
</head>
<body>

<table>
  <tr><th>Name</th><th>Course</th></tr>
  <tr><td>Nick</td><td>HTML</td></tr>
  <tr><td>Mary</td><td>CSS</td></tr>
</table>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "border-collapse removes double borders and makes it clean."
                    ),

                    Headline(
                        headline = "Example Table (Clean + Nice)",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  table { width: 70%; border-collapse: collapse; }
  th, td { border: 1px solid #333; padding: 10px; }
  tr:nth-child(even) { background: #f1f5f9; }
  th { background: #111827; color: white; }
</style>
</head>
<body>

<table>
  <caption style="font-weight:bold; margin-bottom:10px;">Course Progress</caption>
  <tr>
    <th>Student</th>
    <th>Topic</th>
    <th>Status</th>
  </tr>
  <tr><td>Nick</td><td>Tables</td><td>Done ✅</td></tr>
  <tr><td>Anna</td><td>Images</td><td>Learning 📚</td></tr>
</table>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "This uses zebra rows + a caption for a nice look."
                    ),

                    Headline(
                        headline = "Table with colgroup + width + border",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<table style="width:80%; border-collapse:collapse;" border="1">
  <colgroup>
    <col style="background:#dcfce7;">
    <col style="background:#fee2e2;">
  </colgroup>

  <tr><th>Name</th><th>Score</th></tr>
  <tr><td>Nick</td><td>95</td></tr>
  <tr><td>John</td><td>80</td></tr>
</table>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "colgroup styles columns (not rows)."
                    ),

                    Headline(
                        headline = "Cell Padding, Row Groups, Caption",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  table { width:70%; border-collapse:collapse; }
  th, td { border:1px solid black; padding:12px; }
  thead { background:#0ea5e9; color:white; }
  tfoot { background:#111827; color:white; }
</style>
</head>
<body>

<table>
  <caption style="font-weight:bold;">Student Marks</caption>

  <thead>
    <tr><th>Name</th><th>Marks</th></tr>
  </thead>

  <tbody>
    <tr><td>Nick</td><td>90</td></tr>
    <tr><td>Mary</td><td>88</td></tr>
  </tbody>

  <tfoot>
    <tr><td>Total Students</td><td>2</td></tr>
  </tfoot>
</table>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "thead/tbody/tfoot make the table organized."
                    ),

                    Headline(
                        headline = "Collapsing Table Borders",
                        explaination = "Use border-collapse: collapse; to avoid double borders.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  table { border-collapse: collapse; }
  td, th { border:1px solid black; padding:10px; }
</style>
</head>
<body>

<table>
  <tr><th>Item</th><th>Price</th></tr>
  <tr><td>Book</td><td>200</td></tr>
</table>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Borders become one clean line."
                    ),

                    Headline(
                        headline = "Rowspan (Cell Downwards)",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<table border="1">
  <tr>
    <th>Name</th>
    <th rowspan="2">Score</th>
  </tr>
  <tr>
    <td>Nick</td>
  </tr>
  <tr>
    <td>Mary</td>
    <td>88</td>
  </tr>
</table>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "rowspan makes a cell cover multiple rows."
                    ),

                    Headline(
                        headline = "Colspan (Cell Sideways)",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<table border="1">
  <tr>
    <th colspan="2">Student Info</th>
  </tr>
  <tr>
    <td>Name</td><td>Nick</td>
  </tr>
</table>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "colspan makes a cell cover multiple columns."
                    ),

                    Headline(
                        headline = "Amazing Final Example (Rowspan + Colspan + Collapse)",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  table { width:80%; border-collapse:collapse; }
  td, th { border:1px solid #111; padding:10px; text-align:center; }
  th { background:#111827; color:white; }
</style>
</head>
<body>

<table>
  <caption style="font-weight:bold; margin-bottom:8px;">Weekly Study Plan</caption>

  <tr>
    <th>Day</th>
    <th>Topic</th>
    <th>Time</th>
  </tr>

  <tr>
    <td rowspan="2">Monday</td>
    <td>HTML Tables</td>
    <td>1 hour</td>
  </tr>
  <tr>
    <td>Quiz Practice</td>
    <td>30 mins</td>
  </tr>

  <tr>
    <td>Tuesday</td>
    <td colspan="2">HTML Images + Styling (2 hours)</td>
  </tr>

</table>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "This example combines: border-collapse + rowspan + colspan + caption."
                    )
                ),

                questions = listOf(
                    QuizQuestion("Which tag creates a table?", listOf("<tab>", "<table>", "<tr>", "<td>"), 1),
                    QuizQuestion("Which tag is a table row?", listOf("<tr>", "<td>", "<th>", "<row>"), 0),
                    QuizQuestion("Which tag is a header cell?", listOf("<td>", "<th>", "<h1>", "<head>"), 1),
                    QuizQuestion("What does rowspan do?", listOf("Spans columns", "Spans rows", "Adds color", "Adds border"), 1),
                    QuizQuestion("What does colspan do?", listOf("Spans rows", "Spans columns", "Deletes row", "Centers text"), 1),
                    QuizQuestion("Which makes borders clean (no double lines)?", listOf("border-style", "border-collapse: collapse", "float:left", "padding"), 1),
                    QuizQuestion("Which tag adds a table title?", listOf("<title>", "<caption>", "<thead>", "<summary>"), 1)
                )
            ),

            Subtopic(
                sutopicId = 201,
                subTopicName = "HTML Lists (Ordered, Unordered & Styling)",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML Lists",
                        majorHeadileExplanation = """
HTML lists help you group related items neatly.
You use lists when you want things like:
• Menus (Home, About, Contact)
• Steps (How to register, How to pay)
• Features (Fast, Secure, Simple)
• Shopping lists, tasks, and topics

There are 3 main types of lists:
• Unordered list <ul> → bullets (•)
• Ordered list <ol> → numbers (1,2,3)
• Description list <dl> → term + meaning (covered in next subtopic)
""".trimIndent(),
                        tip = "Use <ul> for items with no order, and <ol> for steps that must follow a sequence."
                    ),

                    Headline(
                        headline = "HTML List Elements",
                        explaination = """
List tags you must know:
• <ul> → unordered list (bullets)
• <ol> → ordered list (numbers)
• <li> → list item (used inside ul/ol)

Common attributes:
• <ol type='1|A|a|I|i'> → change numbering style
• <ol start='5'> → start counting from 5
• <ol reversed> → counts backwards
""".trimIndent(),
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Unordered List (ul)</h2>
<ul>
  <li>HTML</li>
  <li>CSS</li>
  <li>JavaScript</li>
</ul>

<h2>Ordered List (ol)</h2>
<ol>
  <li>Open browser</li>
  <li>Write HTML</li>
  <li>Run page</li>
</ol>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Unordered List Example (Features Card)",
                        explaination = "A nice list for features (very common in websites).",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<div style="width:320px; padding:15px; border:2px solid #111; border-radius:12px;">
  <h3>App Features ✅</h3>
  <ul>
    <li>Offline lessons</li>
    <li>Quizzes after every topic</li>
    <li>Simple examples</li>
    <li>Progress tracking</li>
  </ul>
</div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "This is a clean way to show features or benefits using a <ul> list."
                    ),

                    Headline(
                        headline = "Ordered List Example (Step-by-Step Guide)",
                        explaination = "Ordered lists are perfect for steps.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>How to Create a Web Page</h2>
<ol>
  <li>Create a file: index.html</li>
  <li>Write HTML code</li>
  <li>Save the file</li>
  <li>Open it in a browser</li>
</ol>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Because steps have order, <ol> is the best choice."
                    ),

                    Headline(
                        headline = "Nested HTML Lists",
                        explaination = """
Nested list means: a list inside another list.
This is used in:
• Menus with sub-menus
• Topics with subtopics
• Categories with subcategories
""".trimIndent(),
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Topics (Nested List)</h2>
<ul>
  <li>HTML
    <ul>
      <li>Headings</li>
      <li>Links</li>
      <li>Lists</li>
    </ul>
  </li>

  <li>CSS
    <ul>
      <li>Colors</li>
      <li>Flexbox</li>
    </ul>
  </li>
</ul>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Amazing Nested Example (Website Menu)",
                        explaination = "This looks like a real menu layout.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  ul { list-style: none; padding: 0; margin: 0; }
  li { padding: 10px; background: #e5e7eb; margin: 5px 0; border-radius: 8px; }
  li ul li { background: #c7d2fe; margin-left: 20px; }
</style>
</head>
<body>

<h2>Menu</h2>
<ul>
  <li>Home</li>
  <li>Lessons
    <ul>
      <li>HTML Basics</li>
      <li>CSS Basics</li>
      <li>JavaScript Basics</li>
    </ul>
  </li>
  <li>Quiz</li>
</ul>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "We removed default bullets using CSS and styled it like a menu."
                    ),

                    Headline(
                        headline = "List Style Type",
                        explaination = """
List style type changes the bullet or numbering style.

Examples:
• ul: disc, circle, square, none
• ol: decimal, lower-alpha, upper-alpha, lower-roman, upper-roman

You can change it using CSS:
list-style-type: square;
""".trimIndent(),
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h3>Different Bullet Styles</h3>

<ul style="list-style-type:disc;">
  <li>disc</li>
</ul>

<ul style="list-style-type:circle;">
  <li>circle</li>
</ul>

<ul style="list-style-type:square;">
  <li>square</li>
</ul>

<ul style="list-style-type:none;">
  <li>none (no bullet)</li>
</ul>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Ordered List Types (Numbers, Letters, Romans)",
                        explaination = "You can change numbering style using the type attribute or CSS.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h3>Ordered list: Letters</h3>
<ol type="A">
  <li>Install</li>
  <li>Open</li>
  <li>Run</li>
</ol>

<h3>Ordered list: Roman</h3>
<ol type="I">
  <li>Intro</li>
  <li>Lesson</li>
  <li>Quiz</li>
</ol>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "type='A' gives A,B,C and type='I' gives Roman numerals."
                    ),

                    Headline(
                        headline = "Start / Reversed Example",
                        explaination = "start begins counting from a number, reversed counts backwards.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h3>Start from 5</h3>
<ol start="5">
  <li>Step</li>
  <li>Step</li>
  <li>Step</li>
</ol>

<h3>Reversed</h3>
<ol reversed>
  <li>Third</li>
  <li>Second</li>
  <li>First</li>
</ol>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Changing and Coloring Bullets",
                        explaination = """
Normal bullets can't be colored directly using list-style.
But we can create our own bullets using CSS ::marker or pseudo elements.

Two easy ways:
1) ::marker (modern & simple)
2) Using before content (custom bullet icons)
""".trimIndent(),
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  .colored-marker li::marker {
    color: red;
    font-size: 20px;
  }
</style>
</head>
<body>

<h3>Colored Bullets using ::marker</h3>
<ul class="colored-marker">
  <li>HTML</li>
  <li>CSS</li>
  <li>JavaScript</li>
</ul>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Custom Bullets (Icons / Emojis)",
                        explaination = "This makes your lists look modern and fun.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  .custom li {
    list-style: none;
    margin: 8px 0;
  }
  .custom li::before {
    content: "✅ ";
    font-weight: bold;
  }
</style>
</head>
<body>

<h3>Custom Bullet List</h3>
<ul class="custom">
  <li>Easy lessons</li>
  <li>Quick quizzes</li>
  <li>Practice projects</li>
</ul>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "We removed default bullets and created our own icon bullets."
                    ),

                    Headline(
                        headline = "Other Useful List Tip (Horizontal List / Navbar)",
                        explaination = "Lists can also create navigation menus.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  .nav {
    list-style: none;
    display: flex;
    gap: 12px;
    padding: 0;
  }
  .nav li {
    background: #111827;
    color: white;
    padding: 10px 14px;
    border-radius: 10px;
  }
</style>
</head>
<body>

<ul class="nav">
  <li>Home</li>
  <li>Lessons</li>
  <li>Quiz</li>
  <li>Profile</li>
</ul>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "This is a very common real-world use of <ul> lists."
                    )
                ),

                questions = listOf(
                    QuizQuestion("Which tag creates an unordered list?", listOf("<ol>", "<ul>", "<li>", "<dl>"), 1),
                    QuizQuestion("Which tag creates an ordered list?", listOf("<ol>", "<ul>", "<li>", "<dt>"), 0),
                    QuizQuestion("Which tag is used for list items?", listOf("<item>", "<li>", "<list>", "<tag>"), 1),
                    QuizQuestion("Which list is best for steps?", listOf("Unordered list", "Ordered list", "Description list", "Table"), 1),
                    QuizQuestion("What does nested list mean?", listOf("A list with images", "A list inside another list", "A list without bullets", "A list with links only"), 1),
                    QuizQuestion("Which CSS property changes bullet style?", listOf("bullet-color", "list-style-type", "text-decoration", "font-style"), 1),
                    QuizQuestion("Which attribute can start an ordered list from a number?", listOf("begin", "start", "count", "from"), 1)
                )
            ),
            Subtopic(
                sutopicId = 203,
                subTopicName = "HTML Description Lists (Terms & Meanings)",
                headlines = listOf(
                    Headline(
                        majorHeadline = "HTML Description Lists",
                        majorHeadileExplanation = """
A description list is used when you want:
• A term + meaning (like dictionary)
• FAQs (question + answer)
• Product features (name + explanation)

Tags used:
• <dl> → description list container
• <dt> → term (title/name)
• <dd> → description (meaning/details)
""".trimIndent(),
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Simple Description List</h2>

<dl>
  <dt>HTML</dt>
  <dd>Language used to structure web pages.</dd>

  <dt>CSS</dt>
  <dd>Used for styling (colors, layout, fonts).</dd>

  <dt>JavaScript</dt>
  <dd>Makes web pages interactive.</dd>
</dl>

</body>
</html>
""".trimIndent(),
                        tip = "Use <dl> when items need explanation, not just a normal list.",
                        afterCodeEplainations = "Each <dt> is the term, and the <dd> explains it."
                    ),

                    Headline(
                        headline = "Good Example (FAQ Style)",
                        explaination = "This is perfect for FAQ sections in websites.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>FAQ</h2>

<dl>
  <dt>Do I need internet to learn?</dt>
  <dd>No. You can study offline lessons anytime.</dd>

  <dt>Are quizzes included?</dt>
  <dd>Yes. Every topic has a quiz to test you.</dd>

  <dt>Is this beginner friendly?</dt>
  <dd>Yes. Simple language and easy examples.</dd>
</dl>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "This format is clean: question in <dt>, answer in <dd>."
                    ),

                    Headline(
                        headline = "Styling HTML Description Lists",
                        explaination = "We use CSS to make it look like modern cards.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  dl { width: 420px; font-family: Arial; }
  dt {
    font-weight: bold;
    background: #111827;
    color: white;
    padding: 10px;
    border-radius: 10px;
    margin-top: 12px;
  }
  dd {
    margin: 0;
    padding: 10px;
    background: #f1f5f9;
    border-left: 4px solid #0ea5e9;
    border-radius: 10px;
  }
</style>
</head>
<body>

<h2>Styled Description List</h2>

<dl>
  <dt>Course</dt>
  <dd>HTML for beginners with practice examples.</dd>

  <dt>Duration</dt>
  <dd>Learn daily for 30 minutes and improve fast.</dd>

  <dt>Goal</dt>
  <dd>Build real websites confidently.</dd>
</dl>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "We styled <dt> like a title bar and <dd> like a content box."
                    ),

                    Headline(
                        headline = "Real-World Example (Product Specs)",
                        explaination = "This is how online shops show product info.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Phone Specs</h2>

<dl>
  <dt>Battery</dt>
  <dd>5000mAh (lasts all day)</dd>

  <dt>Storage</dt>
  <dd>128GB internal memory</dd>

  <dt>Camera</dt>
  <dd>50MP + 8MP dual camera</dd>
</dl>

</body>
</html>
""".trimIndent()
                    )
                ),

                questions = listOf(
                    QuizQuestion("Which tag is the container for description lists?", listOf("<ul>", "<dl>", "<ol>", "<dd>"), 1),
                    QuizQuestion("Which tag represents the term/title?", listOf("<dt>", "<dd>", "<li>", "<dl>"), 0),
                    QuizQuestion("Which tag represents the description?", listOf("<dt>", "<dd>", "<li>", "<div>"), 1),
                    QuizQuestion("Description lists are best for:", listOf("Steps only", "Items without meaning", "Terms and their explanations", "Tables"), 2),
                    QuizQuestion("Which is a correct structure?", listOf("<dl><li>..</li></dl>", "<dl><dt>..</dt><dd>..</dd></dl>", "<ul><dt>..</dt></ul>", "<ol><dd>..</dd></ol>"), 1),
                    QuizQuestion("A FAQ section can be built using:", listOf("<table>", "<dl>", "<img>", "<form>"), 1)
                )
            ),
            Subtopic(
                sutopicId = 204,
                subTopicName = "HTML JavaScript (Connecting JS to HTML)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML JavaScript",
                        majorHeadileExplanation = """
HTML JavaScript means using JavaScript inside HTML to make web pages interactive.

JavaScript can be added in 3 main ways:
• Inside HTML using <script>
• Using inline JavaScript
• Using external .js files

JavaScript allows you to:
• Change text
• Style elements dynamically
• Hide and show content
• Respond to button clicks
• Build real applications
""".trimIndent(),
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2 id="msg">Hello</h2>

<button onclick="changeText()">Click Me</button>

<script>
function changeText(){
  document.getElementById("msg").innerHTML = "JavaScript is working!";
}
</script>

</body>
</html>
""".trimIndent(),
                        tip = "Always place your <script> near the bottom of the body for best performance.",
                        afterCodeEplainations = "JavaScript selects the element by ID and changes its content."
                    ),

                    Headline(
                        headline = "JavaScript Inside HTML",
                        explaination = "JavaScript is written inside the <script> tag. The browser reads and executes it.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<script>
alert("Welcome to HTML + JavaScript!");
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The alert runs immediately when the page loads."
                    ),

                    Headline(
                        headline = "Using ID and Class in JavaScript",
                        explaination = """
IDs select ONE element.
Classes select MANY elements.

ID → getElementById()
Class → getElementsByClassName()
""".trimIndent(),
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h3 id="title">Hello</h3>
<p class="box">Box 1</p>
<p class="box">Box 2</p>

<button onclick="change()">Run</button>

<script>
function change(){
  document.getElementById("title").style.color = "red";

  let items = document.getElementsByClassName("box");
  items[0].style.background = "yellow";
  items[1].style.background = "lightblue";
}
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "ID affects one element, class affects multiple."
                    ),

                    Headline(
                        headline = "Inline JavaScript",
                        explaination = "Inline JavaScript is written directly inside HTML attributes.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<button onclick="alert('Inline JS clicked!')">
Click Me
</button>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Inline JS is simple but not recommended for large apps."
                    ),

                    Headline(
                        headline = "HTML With JavaScript Structure",
                        explaination = "This shows a full page structure using JavaScript.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<title>JS Page</title>
</head>

<body>

<h1 id="name">Nick</h1>

<button onclick="update()">Change Name</button>

<script>
function update(){
  document.getElementById("name").innerHTML = "Nick Dieda";
}
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "JavaScript updates HTML when the button is clicked."
                    ),

                    Headline(
                        headline = "Dynamic Styling",
                        explaination = "JavaScript can change CSS styles while the page is running.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<p id="text">Dynamic Style</p>

<button onclick="styleText()">Style</button>

<script>
function styleText(){
  let t = document.getElementById("text");
  t.style.color = "blue";
  t.style.fontSize = "24px";
  t.style.fontWeight = "bold";
}
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Styles are applied dynamically using JavaScript."
                    ),

                    Headline(
                        headline = "Hiding and Showing Elements",
                        explaination = "You can hide or show elements using display property.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<p id="box">Hide Me</p>

<button onclick="hide()">Hide</button>
<button onclick="show()">Show</button>

<script>
function hide(){
  document.getElementById("box").style.display = "none";
}

function show(){
  document.getElementById("box").style.display = "block";
}
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "display:none hides, display:block shows."
                    ),

                    Headline(
                        headline = "innerHTML",
                        explaination = "innerHTML replaces or inserts HTML content dynamically.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<div id="area"></div>

<button onclick="load()">Load Content</button>

<script>
function load(){
  document.getElementById("area").innerHTML =
    "<h2>Loaded!</h2><p>This came from JavaScript.</p>";
}
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "innerHTML injects HTML into the page."
                    )
                ),

                questions = listOf(
                    QuizQuestion("Which tag is used to add JavaScript?", listOf("<js>", "<script>", "<code>", "<java>"), 1),
                    QuizQuestion("Which method selects by ID?", listOf("getClass()", "query()", "getElementById()", "selectId()"), 2),
                    QuizQuestion("Which property hides elements?", listOf("visibility", "display:none", "opacity", "remove"), 1),
                    QuizQuestion("What does innerHTML do?", listOf("Deletes page", "Adds CSS", "Changes HTML content", "Reloads page"), 2),
                    QuizQuestion("Inline JavaScript is written:", listOf("In CSS", "Inside attributes", "In external files", "In head only"), 1),
                    QuizQuestion("Which is better for large apps?", listOf("Inline JS", "External JS", "No JS", "Only alerts"), 1),
                    QuizQuestion("JavaScript mainly makes pages:", listOf("Static", "Colorful", "Interactive", "Bigger"), 2)
                )
            )

            ),
    ),



    NoteModule(
   topic = "Forms in HTML5",
   topicId=1,
   subtopics = listOf(
       Subtopic(
           sutopicId = 111,
           subTopicName = "HTML Forms (Collecting User Data)",
           headlines = listOf(
               Headline(
                   majorHeadline = "Forms in HTML",
                   explaination = """
A form is used to collect information from the user, like name, email, password, feedback, or login details.

The main tag used is:
• <form> ... </form>

Inside a form, you place inputs like:
• <input>, <textarea>, <select>, <button>

When the user clicks “Submit”, the form data is sent to a server (or handled by JavaScript).
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Simple Contact Form</h2>

<form>
  <label>Name:</label><br>
  <input type="text" placeholder="Your name"><br><br>

  <label>Email:</label><br>
  <input type="email" placeholder="example@gmail.com"><br><br>

  <button type="submit">Send</button>
</form>

</body>
</html>
""".trimIndent(),
                   tip = "Always use labels and placeholders to make forms easy to understand."
               ),

               Headline(
                   headline = "Form Attributes (Most Used Ones)",
                   explaination = """
Form attributes control HOW the form behaves and WHERE the data goes.

Common <form> attributes:
• action   → URL where data is sent
• method   → GET or POST
• target   → where to open result (_self, _blank)
• autocomplete → on/off (browser suggestions)
• novalidate → disables HTML validation
• enctype  → how files/data are encoded (needed for file uploads)
• name     → form name (useful in JS)
• id       → unique ID (useful in CSS/JS)
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Form With Attributes</h2>

<form 
  action="https://example.com/submit"
  method="GET"
  target="_blank"
  autocomplete="on"
  name="myForm"
  id="myFormId"
>
  <label>Username:</label><br>
  <input type="text" name="user" required><br><br>

  <label>Password:</label><br>
  <input type="password" name="pass" required><br><br>

  <button type="submit">Submit</button>
</form>

<p><b>Note:</b> action URL is a demo. You can still run and test the form UI.</p>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "The attributes change the form behavior. Example: target='_blank' opens results in a new tab."
               ),

               Headline(
                   headline = "Attribute: method",
                   explaination = """
The method tells the browser HOW to send the form data.

Two common methods:
• GET  → sends data in the URL (visible)
• POST → sends data inside the request body (hidden from URL)

Use GET for search forms.
Use POST for login, signup, and sensitive data.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>GET Method Example (Search)</h2>
<form method="GET">
  <input type="search" name="q" placeholder="Search something...">
  <button type="submit">Search</button>
</form>

<p>When you submit, check your browser URL — you will see ?q=yourText</p>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "GET shows form values in the URL, so it is not good for passwords."
               ),

               Headline(
                   headline = "POST vs GET (Quick Difference)",
                   explaination = """
GET:
• Data visible in URL
• Good for searching
• Can be bookmarked
• Limited length

POST:
• Data not shown in URL
• Good for login/signup
• Can send large data (and files)
• More secure for sensitive info (still needs HTTPS)
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Compare GET and POST</h2>

<h3>GET Form</h3>
<form method="GET">
  <input name="name" placeholder="Type name (GET)">
  <button type="submit">Submit GET</button>
</form>

<hr>

<h3>POST Form</h3>
<form method="POST">
  <input name="name" placeholder="Type name (POST)">
  <button type="submit">Submit POST</button>
</form>

<p>GET shows values in the URL. POST does not show values in the URL.</p>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "On real websites, POST is used for sending private data."
               ),

               Headline(
                   headline = "Submit Button",
                   explaination = """
A submit button sends the form.

You can create it using:
• <button type="submit">Submit</button>
or
• <input type="submit" value="Submit">

When clicked, the browser validates required inputs automatically (HTML5 validation).
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Submit Example</h2>

<form onsubmit="showMsg(event)">
  <input id="nm" required placeholder="Your name">
  <button type="submit">Submit</button>
</form>

<p id="msg"></p>

<script>
function showMsg(e){
  e.preventDefault(); // stops real sending
  document.getElementById("msg").innerHTML = "Submitted: " + document.getElementById("nm").value;
}
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "We used JavaScript to prevent page refresh and display the submitted value."
               ),

               Headline(
                   headline = "Form Elements (Inside a Form)",
                   explaination = """
Elements commonly found inside forms:

• <input>     → single-line input
• <textarea>  → multi-line text
• <select>    → dropdown menu
• <option>    → choices inside select
• <button>    → button actions
• <fieldset>  → groups inputs
• <legend>    → title for fieldset
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Form Elements Example</h2>

<form onsubmit="demo(event)">
  <fieldset>
    <legend>Profile</legend>

    <label>Name:</label><br>
    <input id="name" type="text" required><br><br>

    <label>About you:</label><br>
    <textarea id="about" rows="3" placeholder="Say something..."></textarea><br><br>

    <label>Country:</label><br>
    <select id="country">
      <option>Kenya</option>
      <option>Uganda</option>
      <option>Tanzania</option>
    </select><br><br>

    <button type="submit">Save</button>
  </fieldset>
</form>

<p id="out"></p>

<script>
function demo(e){
  e.preventDefault();
  out.innerHTML =
    "Saved: " + name.value + " from " + country.value;
}
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "fieldset groups inputs nicely and JavaScript shows output without refreshing."
               ),

               Headline(
                   headline = "The <input> Element",
                   explaination = """
<input> is the most used form element.

Important input attributes:
• type        → text, email, password, number, etc.
• name        → key sent to server
• value       → default value
• placeholder → hint text
• required    → must be filled
• minlength / maxlength → limits
• disabled / readonly  → control editing
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Input Attributes Demo</h2>

<form onsubmit="check(event)">
  <input id="u" type="text" placeholder="Username" required minlength="3">
  <button type="submit">Check</button>
</form>

<p id="result"></p>

<script>
function check(e){
  e.preventDefault();
  result.innerHTML = "Welcome, " + u.value + " ✅";
}
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "required and minlength ensure better data before sending."
               ),

               Headline(
                   headline = "Extra: Form Validation (HTML5)",
                   explaination = """
HTML5 can validate forms automatically.

Useful validation attributes:
• required
• minlength / maxlength
• pattern (regex)
• type=email (checks email format)

This saves time and reduces bad data.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>HTML5 Validation</h2>

<form>
  <input type="email" required placeholder="Enter a valid email">
  <input type="password" required minlength="6" placeholder="Min 6 characters">
  <button type="submit">Validate</button>
</form>

<p>Try submitting empty or wrong values and see the browser validation message.</p>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "The browser blocks submission until values are valid."
               )
           ),

           questions = listOf(
               QuizQuestion("Which tag creates a form?", listOf("<input>", "<form>", "<table>", "<section>"), 1),
               QuizQuestion("Which attribute sets where form data is sent?", listOf("action", "href", "src", "target"), 0),
               QuizQuestion("GET sends data:", listOf("Inside the body", "In the URL", "In CSS", "In HTML title"), 1),
               QuizQuestion("Best method for passwords:", listOf("GET", "POST", "PUT", "FETCH"), 1),
               QuizQuestion("Which element creates multi-line input?", listOf("<input>", "<textarea>", "<select>", "<option>"), 1),
               QuizQuestion("What does required do?", listOf("Makes input optional", "Blocks submit if empty", "Adds color", "Adds image"), 1),
               QuizQuestion("Which attribute turns off HTML validation?", listOf("novalidate", "noform", "disable", "stop"), 0)
           )
       ),
       Subtopic(
           sutopicId = 112,
           subTopicName = "Labels in Forms (Better Input Meaning)",
           headlines = listOf(
               Headline(
                   majorHeadline = "Form Labels",
                   majorHeadileExplanation = """
A label tells the user what an input is for (example: Name, Email, Password).

The label tag is:
• <label>Text</label>

Most important attribute:
• for = matches input id

Example:
<label for="email">Email</label>
<input id="email">

This improves:
• clarity
• accessibility (screen readers)
• clicking the label focuses the input
""".trimIndent(),
                   tip = "Always connect label 'for' with input 'id' for best user experience.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<form>
  <label for="email">Email:</label><br>
  <input id="email" type="email" placeholder="example@gmail.com"><br><br>

  <label for="pass">Password:</label><br>
  <input id="pass" type="password"><br><br>

  <button type="submit">Login</button>
</form>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Input Inside Label",
                   explaination = """
You can also place the input inside the label.
This removes the need for 'for' and 'id'.

Example:
<label> Name <input ...> </label>
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<form>
  <label>
    Name:
    <input type="text" placeholder="Your name">
  </label>
  <br><br>

  <label>
    Email:
    <input type="email" placeholder="example@gmail.com">
  </label>

  <br><br>
  <button type="submit">Submit</button>
</form>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "This style is simple and neat for quick forms."
               ),

               Headline(
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Label Click Demo</h2>

<form>
  <label for="phone">Phone Number:</label>
  <input id="phone" type="tel" placeholder="0700 000 000">
</form>

<p>Click the label text — the cursor jumps into the input.</p>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = ""
               ),

               Headline(
                   headline = "Styling HTML Form (Common CSS Ideas)",
                   explaination = """
Common styles for forms:
• width
• padding
• margin
• border
• border-radius
• font-size
• background
• focus effects (outline/border color)
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  input {
    width: 250px;
    padding: 10px;
    margin: 6px 0;
    border: 1px solid #999;
    border-radius: 8px;
    font-size: 16px;
  }
  input:focus {
    border: 2px solid blue;
    outline: none;
  }
  button {
    padding: 10px 14px;
    border: none;
    border-radius: 8px;
    cursor: pointer;
  }
</style>
</head>
<body>

<form>
  <label for="n">Name</label><br>
  <input id="n" type="text" placeholder="Nick"><br>

  <label for="e">Email</label><br>
  <input id="e" type="email" placeholder="nick@gmail.com"><br>

  <button type="submit">Submit</button>
</form>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Style With ID",
                   explaination = "Using an ID lets you style one specific input only.",
                   codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  #special {
    background: lightyellow;
    border: 2px dashed orange;
  }
</style>
</head>
<body>

<form>
  <input id="special" placeholder="I am special">
  <input placeholder="Normal input">
</form>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Inline Styling Form",
                   explaination = "Inline CSS is written directly in the element using style='...'.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<form>
  <input style="padding:10px; border-radius:10px; border:1px solid gray;" placeholder="Inline styled">
  <button style="padding:10px; border:none; border-radius:10px;">Send</button>
</form>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Internal Styling Form",
                   explaination = "Internal CSS is written inside <style> in the <head> section.",
                   codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  form { background: #f5f5f5; padding: 15px; width: 280px; border-radius: 10px; }
  input { width: 100%; padding: 10px; margin-top: 8px; border-radius: 8px; border: 1px solid #aaa; }
  button { margin-top: 10px; width: 100%; padding: 10px; border: none; border-radius: 8px; }
</style>
</head>
<body>

<form>
  <label>Name</label>
  <input type="text" placeholder="Nick">

  <label>Email</label>
  <input type="email" placeholder="nick@gmail.com">

  <button type="submit">Send</button>
</form>

</body>
</html>
""".trimIndent()
               )
           ),

           questions = listOf(
               QuizQuestion("Why do we use <label>?", listOf("To add images", "To explain input meaning", "To add audio", "To create tables"), 1),
               QuizQuestion("Which attribute connects label to input?", listOf("href", "for", "src", "action"), 1),
               QuizQuestion("Label 'for' should match input:", listOf("name", "type", "id", "value"), 2),
               QuizQuestion("What happens when you click a connected label?", listOf("It deletes input", "It focuses the input", "It hides form", "It submits form"), 1),
               QuizQuestion("Inline styling is written:", listOf("In head", "In external CSS", "Inside the element", "In JS file"), 2),
               QuizQuestion("Internal CSS is placed inside:", listOf("<style>", "<label>", "<meta>", "<form>"), 0)
           )
       ),
       Subtopic(
           sutopicId = 113,
           subTopicName = "HTML Input Types (All Common Inputs)",
           headlines = listOf(
               Headline(
                   majorHeadline = "Input Types in HTML",
                   majorHeadileExplanation = """
The <input> tag can behave in many ways depending on its type.

Syntax:
<input type="text">

Different types help:
• collect correct data
• validate automatically
• improve user experience (better keyboard on phones)
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Input Type Demo</h2>
<form>
  <input type="text" placeholder="Text"><br><br>
  <input type="email" placeholder="Email"><br><br>
  <input type="password" placeholder="Password"><br><br>
  <button type="submit">Submit</button>
</form>

</body>
</html>
""".trimIndent(),
                   tip = "Use the correct input type so the browser helps the user (example: email validation)."
               ),

               Headline(
                   headline = "Text",
                   explaination = "type='text' is used for normal single-line text like name or username.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<input id="t" type="text" placeholder="Enter name">
<button onclick="show()">Show</button>

<p id="out"></p>

<script>
function show(){
  out.innerHTML = "Hello, " + t.value;
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Checkbox",
                   explaination = "Checkbox lets the user choose multiple options.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<label><input type="checkbox" id="c1"> HTML</label><br>
<label><input type="checkbox" id="c2"> CSS</label><br>
<label><input type="checkbox" id="c3"> JS</label><br><br>

<button onclick="pick()">Check</button>
<p id="ans"></p>

<script>
function pick(){
  let chosen = [];
  if(c1.checked) chosen.push("HTML");
  if(c2.checked) chosen.push("CSS");
  if(c3.checked) chosen.push("JS");
  ans.innerHTML = "You selected: " + (chosen.length ? chosen.join(", ") : "Nothing");
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Color Picker",
                   explaination = "type='color' lets the user pick a color. It returns a hex value like #ff0000.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<input type="color" id="clr">
<button onclick="apply()">Apply</button>

<p id="box" style="padding:15px;">Color Box</p>

<script>
function apply(){
  box.style.background = clr.value;
  box.innerHTML = "Color: " + clr.value;
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Radio Button",
                   explaination = "Radio buttons allow only ONE choice in a group.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<p>Choose level:</p>
<label><input type="radio" name="lvl" value="Beginner"> Beginner</label><br>
<label><input type="radio" name="lvl" value="Intermediate"> Intermediate</label><br>
<label><input type="radio" name="lvl" value="Advanced"> Advanced</label><br><br>

<button onclick="choose()">Submit</button>
<p id="res"></p>

<script>
function choose(){
  let selected = document.querySelector("input[name='lvl']:checked");
  res.innerHTML = selected ? "You chose: " + selected.value : "Please choose one!";
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Grouping Radio Buttons",
                   explaination = "Radio buttons group using the same name attribute. Only one can be selected.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<label><input type="radio" name="pay" value="Mpesa"> Mpesa</label>
<label><input type="radio" name="pay" value="Card"> Card</label>
<label><input type="radio" name="pay" value="Cash"> Cash</label>

<p>They are grouped because name='pay' is the same.</p>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Date and Time Inputs",
                   explaination = """
HTML has date-related inputs:
• date
• datetime-local
• time
• month
• week
These give users easy pickers (especially on phones).
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<label>Date: <input type="date" id="d"></label><br><br>
<label>Time: <input type="time" id="t"></label><br><br>
<label>Datetime Local: <input type="datetime-local" id="dt"></label><br><br>
<label>Month: <input type="month" id="m"></label><br><br>
<label>Week: <input type="week" id="w"></label><br><br>

<button onclick="show()">Show</button>
<p id="out"></p>

<script>
function show(){
  out.innerHTML =
    "Date: " + d.value + "<br>" +
    "Time: " + t.value + "<br>" +
    "Datetime: " + dt.value + "<br>" +
    "Month: " + m.value + "<br>" +
    "Week: " + w.value;
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Password + Show/Hide Password",
                   explaination = "Password input hides characters. You can toggle it using JavaScript.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<input id="pass" type="password" placeholder="Enter password">
<button onclick="toggle()">Show/Hide</button>

<script>
function toggle(){
  pass.type = (pass.type === "password") ? "text" : "password";
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Email",
                   explaination = "Email input checks basic email format automatically.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<form>
  <input type="email" required placeholder="name@gmail.com">
  <button type="submit">Submit</button>
</form>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "File Upload",
                   explaination = "type='file' allows selecting files. JavaScript can read the file name.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<input type="file" id="file">
<button onclick="show()">Show File Name</button>

<p id="msg"></p>

<script>
function show(){
  msg.innerHTML = file.files.length ? "Selected: " + file.files[0].name : "No file selected";
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Number and Range (Slider)",
                   explaination = "Number accepts numeric values. Range creates a slider.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<input type="number" id="num" value="5" min="1" max="10">
<input type="range" id="rng" min="0" max="100" value="50">

<button onclick="show()">Show</button>
<p id="out"></p>

<script>
function show(){
  out.innerHTML = "Number: " + num.value + " | Range: " + rng.value;
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Search, Tel, URL",
                   explaination = """
Special inputs:
• search → for search boxes
• tel → phone numbers
• url → website links (basic validation)
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<input type="search" placeholder="Search..."><br><br>
<input type="tel" placeholder="0700 000 000"><br><br>
<input type="url" placeholder="https://example.com"><br><br>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Hidden Input",
                   explaination = "Hidden inputs store data that is sent but not shown to the user (example: userId).",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<form onsubmit="demo(event)">
  <input type="hidden" id="uid" value="USER_001">
  <input id="nm" placeholder="Your name">
  <button type="submit">Send</button>
</form>

<p id="out"></p>

<script>
function demo(e){
  e.preventDefault();
  out.innerHTML = "Name: " + nm.value + " | Hidden userId: " + uid.value;
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Submit and Reset (Cancel/Clear)",
                   explaination = """
Submit sends the form.
Reset clears inputs to their original values.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<form>
  <input type="text" placeholder="Type something"><br><br>
  <input type="email" placeholder="Email"><br><br>

  <input type="submit" value="Submit">
  <input type="reset" value="Clear">
</form>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Modifying Inputs With JavaScript",
                   explaination = """
JavaScript can:
• enable/disable inputs
• change placeholders
• change input value
• focus input automatically
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<input id="x" placeholder="Type here">
<button onclick="fill()">Auto Fill</button>
<button onclick="disableIt()">Disable</button>
<button onclick="enableIt()">Enable</button>
<button onclick="focusIt()">Focus</button>

<script>
function fill(){ x.value = "Auto filled ✅"; }
function disableIt(){ x.disabled = true; }
function enableIt(){ x.disabled = false; }
function focusIt(){ x.focus(); }
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "These buttons show real ways apps control inputs during login/signup."
               )
           ),

           questions = listOf(
               QuizQuestion("Which input type hides characters?", listOf("text", "email", "password", "search"), 2),
               QuizQuestion("Which input allows picking a color?", listOf("range", "color", "url", "month"), 1),
               QuizQuestion("Radio buttons allow:", listOf("Many choices", "One choice only", "No choices", "Files"), 1),
               QuizQuestion("Checkboxes allow:", listOf("One choice only", "Multiple choices", "Only numbers", "Only dates"), 1),
               QuizQuestion("Which input type validates email format?", listOf("text", "email", "tel", "search"), 1),
               QuizQuestion("Which input creates a slider?", listOf("range", "number", "week", "file"), 0),
               QuizQuestion("Hidden input is:", listOf("Visible to user", "Not sent", "Sent but not shown", "Only for CSS"), 2),
               QuizQuestion("Which button clears form fields?", listOf("submit", "reset", "button", "label"), 1)
           )
       ),
       Subtopic(
           sutopicId = 114,
           subTopicName = "HTML Textarea (Multi-Line Input)",
           headlines = listOf(
               Headline(
                   majorHeadline = "HTML Textarea",
                   majorHeadileExplanation = """
<textarea> is used to collect multi-line text from a user.
It is perfect for:
• comments
• feedback
• messages
• descriptions

Tag used:
• <textarea> ... </textarea>

Unlike <input>, textarea can grow and hold many lines.
""".trimIndent(),
                   tip = "Use textarea when you expect more than one line of text (like feedback or messages).",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Simple Textarea Example</h2>

<label for="msg">Your Message:</label><br>
<textarea id="msg" rows="4" cols="35" placeholder="Type your message..."></textarea><br><br>

<button onclick="alert(document.getElementById('msg').value)">Send</button>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Textarea Attributes (Most Useful Ones)",
                   explaination = """
Common textarea attributes (and why we use them):

• rows        → controls height (number of lines)
• cols        → controls width (approx. number of characters)
• name        → key name when sending to server
• id          → used for label, JS, and styling
• placeholder → hint text shown before typing
• required    → must be filled before submit
• minlength   → minimum characters allowed
• maxlength   → maximum characters allowed
• readonly    → user can’t edit, only view
• disabled    → cannot be used or submitted
• wrap        → controls text wrapping when submitting
   - soft (default): wraps visually only
   - hard: adds line breaks in submitted text
• spellcheck  → true/false (helps with spelling)
• autofocus   → focuses automatically when page loads
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Textarea Attributes Demo</h2>

<form onsubmit="show(event)">
  <!-- rows & cols control size -->
  <!-- maxlength limits characters -->
  <!-- minlength ensures enough text -->
  <!-- required blocks empty submission -->
  <label for="fb">Feedback:</label><br>
  <textarea
    id="fb"
    name="feedback"
    rows="5"
    cols="40"
    placeholder="Write your feedback here..."
    required
    minlength="10"
    maxlength="120"
    spellcheck="true"
    wrap="soft"
  ></textarea>

  <br><br>
  <button type="submit">Submit</button>
</form>

<p id="out"></p>

<script>
function show(e){
  e.preventDefault();
  const val = document.getElementById("fb").value;
  document.getElementById("out").innerHTML =
    "✅ Submitted (" + val.length + " chars):<br>" + val;
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Styling Textarea (Inline Styling)",
                   explaination = "Inline styling is written directly in the textarea using style='...'. It’s quick for small tests.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Inline Styled Textarea</h2>

<textarea
  style="
    width: 320px;
    height: 120px;
    padding: 12px;
    border: 2px solid #555;
    border-radius: 10px;
    font-size: 16px;
    font-family: Arial;
    resize: vertical;
    outline: none;
  "
  placeholder="Inline styled textarea..."
></textarea>

<p>Tip: resize: vertical allows resizing up/down only.</p>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   explaination = "Internal styling is written inside <style> in the <head>. This is cleaner and reusable.",
                   codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  .box {
    width: 340px;
    padding: 12px;
    font-size: 16px;
    border-radius: 12px;
    border: 1px solid #999;
    resize: vertical;
    outline: none;
  }
  .box:focus {
    border: 2px solid blue;
  }
  .card {
    width: 380px;
    padding: 16px;
    border-radius: 14px;
    background: #f5f5f5;
  }
</style>
</head>
<body>

<h2>Internal Styled Textarea</h2>

<div class="card">
  <label for="note"><b>Note:</b></label><br>
  <textarea id="note" class="box" rows="5" placeholder="Write notes here..."></textarea>
</div>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Getting Values of Textarea",
                   explaination = """
To get the value typed inside textarea, use JavaScript:

document.getElementById("id").value

This is useful when:
• you want to show a preview
• you want to count characters
• you want to submit using JS
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Get Textarea Value</h2>

<textarea id="text" rows="5" cols="40" placeholder="Type something..."></textarea>
<br><br>

<button onclick="readValue()">Show Value</button>

<p id="out"></p>

<script>
function readValue(){
  const value = document.getElementById("text").value;
  document.getElementById("out").innerHTML =
    "You typed:<br><b>" + value + "</b>";
}
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "We used .value to read what the user typed and displayed it inside a paragraph."
               ),

               Headline(
                   headline = "Modifying TextArea With JavaScript",
                   explaination = """
JavaScript can modify textarea in many ways, like:
• clear text
• add text automatically
• uppercase text
• disable/enable textarea
• limit or show character count
• focus cursor inside textarea
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  textarea { width: 360px; padding: 10px; border-radius: 10px; }
  button { margin: 4px; padding: 8px 10px; border-radius: 10px; }
</style>
</head>
<body>

<h2>Textarea Control Panel</h2>

<textarea id="box" rows="5" placeholder="Type here..."></textarea>
<p id="count">Characters: 0</p>

<button onclick="clearText()">Clear</button>
<button onclick="addSample()">Add Sample</button>
<button onclick="toUpper()">UPPERCASE</button>
<button onclick="toggleDisable()">Disable/Enable</button>
<button onclick="focusBox()">Focus</button>

<script>
const box = document.getElementById("box");
const count = document.getElementById("count");

box.addEventListener("input", () => {
  count.innerHTML = "Characters: " + box.value.length;
});

function clearText(){
  box.value = "";
  count.innerHTML = "Characters: 0";
}

function addSample(){
  box.value += "\\nHello! This is a sample message ✅";
  count.innerHTML = "Characters: " + box.value.length;
}

function toUpper(){
  box.value = box.value.toUpperCase();
}

function toggleDisable(){
  box.disabled = !box.disabled;
}

function focusBox(){
  box.focus();
}
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "This example shows real-world textarea control: counting, clearing, auto text, disabling, and focusing."
               )
           ),

           questions = listOf(
               QuizQuestion("Which tag is used for multi-line input?", listOf("<input>", "<textarea>", "<p>", "<form>"), 1),
               QuizQuestion("Which attribute controls textarea height?", listOf("cols", "rows", "height", "size"), 1),
               QuizQuestion("Which attribute shows hint text before typing?", listOf("placeholder", "value", "name", "id"), 0),
               QuizQuestion("How do you get textarea text in JS?", listOf(".innerHTML", ".text", ".value", ".getText()"), 2),
               QuizQuestion("What does maxlength do?", listOf("Makes it bold", "Limits characters", "Adds colors", "Disables textarea"), 1),
               QuizQuestion("What does readonly mean?", listOf("User can type", "User can only view, not edit", "Textarea is hidden", "Textarea sends twice"), 1),
               QuizQuestion("Which attribute forces user to fill textarea?", listOf("required", "for", "wrap", "cols"), 0),
               QuizQuestion("Which one disables user interaction completely?", listOf("readonly", "disabled", "wrap", "rows"), 1)
           )
       ),

       Subtopic(
           sutopicId = 115,
           subTopicName = "HTML Dropdown Lists (Select & Option)",
           headlines = listOf(
               Headline(
                   majorHeadline = "Dropdown List in HTML",
                   explaination = """
A dropdown list lets a user pick ONE option (or many if you allow multiple).
It is created using:

• <select>  → the dropdown container
• <option>  → each item inside the dropdown

Usually used in forms like choosing:
• country
• gender
• category
• payment method
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Simple Dropdown Example</h2>

<label for="city">Choose your city:</label><br>
<select id="city">
  <option>Nairobi</option>
  <option>Mombasa</option>
  <option>Kisumu</option>
  <option>Nakuru</option>
</select>

<p id="out"></p>
<button onclick="show()">Show Choice</button>

<script>
function show(){
  const city = document.getElementById("city").value;
  document.getElementById("out").innerHTML = "You selected: <b>" + city + "</b>";
}
</script>

</body>
</html>
""".trimIndent(),
                   tip = "Always use <label> with dropdowns for better accessibility and easier clicking."
               ),

               Headline(
                   headline = "Attributes Used in Dropdown Forms",
                   explaination = """
Important attributes you will use with dropdowns:

For <select>:
• id → used by label + JavaScript
• name → key name when sending to server
• required → forces user to pick something
• multiple → allows selecting more than one option
• size → shows many options at once (like a list box)
• disabled → makes dropdown unusable
• autofocus → focuses dropdown automatically on page load

For <option>:
• value → the value sent to server / read by JS
• selected → makes it the default choice
• disabled → user cannot pick that option

Also useful:
• <optgroup label="..."> → groups options with a title
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Dropdown Form With Common Attributes</h2>

<form onsubmit="submitForm(event)">
  <label for="course">Choose a course:</label><br>

  <select id="course" name="course" required>
    <option value="" selected disabled>-- Pick one --</option>

    <optgroup label="Programming">
      <option value="html">HTML</option>
      <option value="css">CSS</option>
      <option value="js">JavaScript</option>
    </optgroup>

    <optgroup label="Tools">
      <option value="git">Git</option>
      <option value="linux">Linux</option>
      <option value="android">Android</option>
    </optgroup>

    <option value="coming" disabled>Coming Soon (Disabled)</option>
  </select>

  <br><br>
  <button type="submit">Submit</button>
</form>

<p id="out"></p>

<script>
function submitForm(e){
  e.preventDefault();
  const value = document.getElementById("course").value;
  document.getElementById("out").innerHTML =
    "✅ Submitted value: <b>" + value + "</b>";
}
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "We used required + a disabled placeholder option so the user must pick a real item."
               ),

               Headline(
                   headline = "Dropdown Attributes (Select + Option)",
                   explaination = """
Dropdown attributes explained clearly:

<select> attributes:
• required  → blocks form submit if no valid option chosen
• multiple  → allows many selections (Ctrl/Command click on PC)
• size      → number of options visible without opening
• disabled  → locks the dropdown
• name      → used when sending form data
• id        → used for label + JS

<option> attributes:
• value     → what gets submitted / read by JS
• selected  → default option
• disabled  → option cannot be chosen
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Attribute Demo (selected, value, disabled)</h2>

<select id="device">
  <option value="phone" selected>Phone</option>
  <option value="laptop">Laptop</option>
  <option value="tablet">Tablet</option>
  <option value="tv" disabled>Smart TV (Disabled)</option>
</select>

<button onclick="read()">Read Value</button>
<p id="out"></p>

<script>
function read(){
  const val = document.getElementById("device").value;
  document.getElementById("out").innerHTML = "Selected value: <b>" + val + "</b>";
}
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "Even though the text says 'Phone', JS reads the value='phone'."
               ),

               Headline(
                   headline = "Multiple Options (Selecting More Than One)",
                   explaination = """
Normally, a dropdown selects ONE item.
To allow MANY selections:

• add multiple
• optionally add size so users can see the list without opening

On a computer, you can hold:
• Ctrl (Windows/Linux) or
• Command (Mac)
to select many.

In JavaScript, you read selectedOptions.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Multiple Select Dropdown</h2>

<label for="skills">Select your skills (multiple):</label><br>

<select id="skills" multiple size="5">
  <option value="html">HTML</option>
  <option value="css">CSS</option>
  <option value="js">JavaScript</option>
  <option value="git">Git</option>
  <option value="linux">Linux</option>
</select>

<br><br>
<button onclick="showSkills()">Show Selected</button>
<p id="out"></p>

<script>
function showSkills(){
  const select = document.getElementById("skills");
  const chosen = Array.from(select.selectedOptions).map(o => o.value);

  document.getElementById("out").innerHTML =
    chosen.length === 0
      ? "No selection yet."
      : "You selected: <b>" + chosen.join(", ") + "</b>";
}
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "selectedOptions gives only the options the user picked."
               ),

               Headline(
                   headline = "Understanding <select>, <option>, and <optgroup>",
                   explaination = """
These tags work together:

• <select>   → the dropdown container
• <option>   → each choice the user can pick
• <optgroup> → groups options under a label

Why optgroup is useful:
• makes long lists easy to scan
• looks professional
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Dropdown Grouping with optgroup</h2>

<select id="lang">
  <optgroup label="Frontend">
    <option value="html">HTML</option>
    <option value="css">CSS</option>
    <option value="js">JavaScript</option>
  </optgroup>

  <optgroup label="Backend">
    <option value="node">Node.js</option>
    <option value="python">Python</option>
    <option value="php">PHP</option>
  </optgroup>
</select>

<button onclick="pick()">Pick</button>
<p id="out"></p>

<script>
function pick(){
  document.getElementById("out").innerHTML =
    "You chose: <b>" + document.getElementById("lang").value + "</b>";
}
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "The user sees nice groups, but JS still reads the selected option value."
               ),

               Headline(
                   headline = "Good Example (Styled Dropdown UI)",
                   explaination = """
This is a clean modern dropdown example with:
• label
• required
• placeholder option
• internal styling
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  body { font-family: Arial; }
  .card {
    width: 380px;
    padding: 16px;
    border-radius: 14px;
    background: #f5f5f5;
  }
  select {
    width: 100%;
    padding: 10px;
    border-radius: 10px;
    border: 1px solid #888;
    outline: none;
  }
  select:focus { border: 2px solid blue; }
  button {
    margin-top: 12px;
    padding: 10px;
    border-radius: 10px;
    cursor: pointer;
  }
</style>
</head>
<body>

<h2>Styled Dropdown Example</h2>

<div class="card">
  <form onsubmit="go(event)">
    <label for="pay"><b>Payment Method</b></label><br><br>

    <select id="pay" required>
      <option value="" selected disabled>-- Choose payment --</option>
      <option value="mpesa">M-Pesa</option>
      <option value="card">Card</option>
      <option value="cash">Cash</option>
    </select>

    <button type="submit">Continue</button>
  </form>

  <p id="out"></p>
</div>

<script>
function go(e){
  e.preventDefault();
  const v = document.getElementById("pay").value;
  document.getElementById("out").innerHTML = "✅ Selected: <b>" + v + "</b>";
}
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "This feels like a real app UI: clean spacing, focus border, and required selection."
               ),

               Headline(
                   headline = "Good Example With JavaScript (Live Preview + Price)",
                   explaination = """
This example shows a real-world use:
• user selects a plan
• JS shows price instantly
• form submit shows a final message

This makes dropdowns feel powerful and interactive.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  body { font-family: Arial; }
  .card { width: 420px; padding: 16px; border-radius: 14px; background: #f5f5f5; }
  select, button { width: 100%; padding: 10px; border-radius: 10px; margin-top: 10px; }
  .price { font-size: 18px; margin-top: 10px; }
</style>
</head>
<body>

<h2>Dropdown + JS Pricing</h2>

<div class="card">
  <label for="plan"><b>Choose Internet Plan</b></label>
  <select id="plan">
    <option value="basic" selected>Basic (1 Day)</option>
    <option value="weekly">Weekly (7 Days)</option>
    <option value="monthly">Monthly (30 Days)</option>
  </select>

  <p class="price" id="price"></p>

  <button onclick="buy()">Buy Plan</button>
  <p id="out"></p>
</div>

<script>
const plan = document.getElementById("plan");
const price = document.getElementById("price");

function updatePrice(){
  const v = plan.value;
  const map = {
    basic:  "Ksh 20",
    weekly: "Ksh 100",
    monthly:"Ksh 300"
  };
  price.innerHTML = "Price: <b>" + map[v] + "</b>";
}

plan.addEventListener("change", updatePrice);
updatePrice();

function buy(){
  document.getElementById("out").innerHTML =
    "✅ You bought: <b>" + plan.options[plan.selectedIndex].text + "</b>";
}
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "We used change event + a map object to update price instantly."
               ),

               Headline(
                   headline = "Extra: Make a Dropdown Searchable (Simple Trick)",
                   explaination = """
HTML <select> is not searchable by default.
But you can create a 'search + filter' experience using:
• an input box
• a list (or datalist)

This example filters items live and feels like a searchable dropdown.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Searchable Dropdown (Filter List)</h2>

<input id="search" placeholder="Search language..." />
<br><br>

<select id="langs" size="6">
  <option>HTML</option>
  <option>CSS</option>
  <option>JavaScript</option>
  <option>Python</option>
  <option>PHP</option>
  <option>Java</option>
</select>

<p id="out"></p>
<button onclick="pick()">Pick</button>

<script>
const search = document.getElementById("search");
const select = document.getElementById("langs");

search.addEventListener("input", () => {
  const q = search.value.toLowerCase();
  Array.from(select.options).forEach(opt => {
    opt.hidden = !opt.text.toLowerCase().includes(q);
  });
});

function pick(){
  document.getElementById("out").innerHTML =
    "You picked: <b>" + select.value + "</b>";
}
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "We used option.hidden to hide items that don’t match the search text."
               )
           ),

           questions = listOf(
               QuizQuestion("Which tag creates a dropdown list?", listOf("<drop>", "<select>", "<option>", "<list>"), 1),
               QuizQuestion("Which tag defines each item inside a dropdown?", listOf("<item>", "<option>", "<pick>", "<li>"), 1),
               QuizQuestion("Which attribute forces the user to pick an option before submitting?", listOf("required", "selected", "value", "name"), 0),
               QuizQuestion("Which attribute allows selecting more than one option?", listOf("many", "multi", "multiple", "size"), 2),
               QuizQuestion("What does the 'value' attribute in <option> represent?", listOf("The displayed text", "The submitted/JS value", "The font size", "The color"), 1),
               QuizQuestion("Which tag groups dropdown options under a label?", listOf("<group>", "<fieldset>", "<optgroup>", "<section>"), 2),
               QuizQuestion("Which attribute makes an option chosen by default?", listOf("default", "checked", "selected", "picked"), 2),
               QuizQuestion("How do you get the selected value in JS?", listOf("select.value", "select.text()", "select.innerHTML", "select.get()"), 0)
           )
       ),
       Subtopic(
           sutopicId = 116,
           subTopicName = "HTML Form Input Attributes (Make Forms Smart!)",
           headlines = listOf(
               Headline(
                   majorHeadline = "Form Elements Attributes",
                   majorHeadileExplanation = """
Form attributes are like “rules” and “helpers” you add to inputs to control how users type.

Common attributes (easy list):

✅ Text help
• placeholder → shows a hint text inside input
• autocomplete → browser suggests saved values
• autocapitalize → controls automatic capitalization (mostly mobile)

✅ Validation (stops wrong data)
• required → must be filled before submit
• minlength / maxlength → minimum/maximum characters
• min / max → minimum/maximum value (number/date/range)
• pattern → must match a specific format (like phone/email rules)

✅ Behavior / access
• readonly → user cannot change, but can copy
• disabled → user cannot use + not submitted
• autofocus → focuses the input automatically
• multiple → select many files / many emails (depending on input type)
• spellcheck → checks spelling (on/off)

✅ Textarea special
• wrap → controls line wrapping when submitted (soft/hard)
""".trimIndent(),
                   tip = "Use attributes first (HTML validation). Use JavaScript only when you need custom rules.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Most Common Attributes (Quick Demo)</h2>

<form onsubmit="send(event)">
  <label>Name:</label><br>
  <input id="name" type="text" placeholder="e.g. Nick" required minlength="2" maxlength="12"><br><br>

  <label>Age:</label><br>
  <input id="age" type="number" min="10" max="80" placeholder="10 - 80" required><br><br>

  <label>Code (3 letters + 3 numbers):</label><br>
  <input id="code" type="text" pattern="[A-Za-z]{3}[0-9]{3}" placeholder="ABC123" required><br><br>

  <button type="submit">Submit</button>
</form>

<p id="out"></p>

<script>
function send(e){
  e.preventDefault();
  document.getElementById("out").innerHTML = "✅ Form submitted successfully!";
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "autocapitalize",
                   explaination = """
autocapitalize controls how the keyboard capitalizes text (mostly on phones).

Values:
• off / none → no auto-capital
• words → every word starts with capital (good for names)
• sentences → first letter of sentence becomes capital
• characters → everything becomes UPPERCASE

Note: On desktop browsers, it may not change much. On mobile, it matters a lot.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>autocapitalize Demo</h2>

<input type="text" placeholder="autocapitalize='none'" autocapitalize="none"><br><br>
<input type="text" placeholder="autocapitalize='words'" autocapitalize="words"><br><br>
<input type="text" placeholder="autocapitalize='sentences'" autocapitalize="sentences"><br><br>
<input type="text" placeholder="autocapitalize='characters'" autocapitalize="characters"><br><br>

<button onclick="info()">What is autocapitalize?</button>
<p id="out"></p>

<script>
function info(){
  document.getElementById("out").innerText =
    "Autocapitalize is mostly useful on mobile keyboards.";
}
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "Try this on a phone: you’ll see the keyboard suggests capital letters differently."
               ),

               Headline(
                   headline = "Good Example Using autocapitalize + Validation",
                   explaination = "Here we combine: placeholder + required + minlength + autocapitalize to make name entry clean.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Smart Name Form</h2>

<form onsubmit="go(event)">
  <label>Full Name:</label><br>
  <input id="fullName"
         type="text"
         placeholder="e.g. Nick Eagle"
         required
         minlength="3"
         autocapitalize="words"><br><br>

  <button type="submit">Save Name</button>
</form>

<p id="out"></p>

<script>
function go(e){
  e.preventDefault();
  const name = document.getElementById("fullName").value;
  document.getElementById("out").innerHTML = "✅ Saved: <b>" + name + "</b>";
}
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "autocapitalize='words' is perfect for names because each word starts with a capital."
               ),

               Headline(
                   headline = "autocomplete",
                   explaination = """
autocomplete tells the browser if it should suggest saved data.

Common values:
• on / off
• name, username, email
• current-password, new-password
• tel, address-line1, country, postal-code

You can set it on:
• the whole form
• each input separately
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>autocomplete Demo</h2>

<form autocomplete="on" onsubmit="login(event)">
  <label>Email:</label><br>
  <input id="email" type="email" autocomplete="email" placeholder="you@gmail.com" required><br><br>

  <label>Password:</label><br>
  <input id="pass" type="password" autocomplete="current-password" required><br><br>

  <button type="submit">Login</button>
</form>

<p id="out"></p>

<script>
function login(e){
  e.preventDefault();
  document.getElementById("out").innerText = "✅ Login form submitted (demo).";
}
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "If your browser has saved your email/password, it may suggest them automatically."
               ),

               Headline(
                   headline = "autofocus",
                   explaination = """
autofocus makes an input get focus automatically when the page loads.

Good for:
• search boxes
• login username/email input

Tip: Only use autofocus on ONE element per page.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>autofocus Demo</h2>

<label>Search:</label><br>
<input type="search" autofocus placeholder="Start typing..."><br><br>

<button onclick="msg()">Check</button>
<p id="out"></p>

<script>
function msg(){
  document.getElementById("out").innerText = "✅ The search box auto-focused on page load.";
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "disabled",
                   explaination = """
disabled makes an input unusable:
• user cannot click or type
• the value is NOT sent when submitting

Use cases:
• “Coming soon” fields
• lock fields until user chooses something
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>disabled Demo</h2>

<form onsubmit="go(event)">
  <label>Username:</label><br>
  <input type="text" value="nick123" readonly><br><br>

  <label>Promo Code (Disabled):</label><br>
  <input type="text" value="COMING-SOON" disabled><br><br>

  <button type="submit">Submit</button>
</form>

<p id="out"></p>

<script>
function go(e){
  e.preventDefault();
  document.getElementById("out").innerText =
    "✅ Submitted! (Disabled field was not submitted.)";
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "max",
                   explaination = """
max sets the highest value allowed (for number, date, range).

Example:
• age max=80 → cannot type 90
• date max=2026-12-31 → cannot pick later

Browser will block submission if value is above max.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>max Demo</h2>

<form onsubmit="check(event)">
  <label>Age (max 30):</label><br>
  <input id="age" type="number" max="30" required><br><br>

  <button type="submit">Submit</button>
</form>

<script>
function check(e){
  e.preventDefault();
  const v = document.getElementById("age").value;
  alert("✅ Your age is: " + v);
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "maxlength",
                   explaination = """
maxlength sets the maximum number of characters.

Example:
• maxlength="5" → user can’t type more than 5 characters

Great for:
• PIN codes
• short usernames
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>maxlength Demo</h2>

<label>PIN (4 digits):</label><br>
<input id="pin" type="text" maxlength="4" placeholder="1234"><br><br>

<button onclick="show()">Show PIN</button>
<p id="out"></p>

<script>
function show(){
  document.getElementById("out").innerText =
    "PIN typed: " + document.getElementById("pin").value;
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "min",
                   explaination = """
min sets the lowest value allowed.

Example:
• min=18 (age) → user must be at least 18
• date min=2026-01-01 → cannot pick older dates
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>min Demo</h2>

<form onsubmit="go(event)">
  <label>Age (min 18):</label><br>
  <input type="number" min="18" required><br><br>
  <button type="submit">Submit</button>
</form>

<p id="out"></p>

<script>
function go(e){
  e.preventDefault();
  document.getElementById("out").innerText = "✅ Allowed! You meet the minimum age.";
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "minlength",
                   explaination = """
minlength sets the minimum number of characters.

Example:
• minlength="8" for password → must be 8+ characters
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>minlength Demo</h2>

<form onsubmit="go(event)">
  <label>Password (min 8 chars):</label><br>
  <input type="password" minlength="8" required placeholder="********"><br><br>
  <button type="submit">Create</button>
</form>

<p id="out"></p>

<script>
function go(e){
  e.preventDefault();
  document.getElementById("out").innerText = "✅ Password accepted (demo).";
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "pattern",
                   explaination = """
pattern uses Regular Expression (regex) rules to validate input.

Example pattern rules:
• [0-9]{4} → exactly 4 digits
• [A-Za-z]{3} → exactly 3 letters
• ^07[0-9]{8}$ → Kenyan phone like 07XXXXXXXX

If it does not match, the browser blocks submission.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>pattern Demo (Phone Validation)</h2>

<form onsubmit="go(event)">
  <label>Phone (07XXXXXXXX):</label><br>
  <input type="tel"
         pattern="^07[0-9]{8}$"
         placeholder="0712345678"
         required><br><br>

  <button type="submit">Submit</button>
</form>

<p id="out"></p>

<script>
function go(e){
  e.preventDefault();
  document.getElementById("out").innerText = "✅ Phone format is valid!";
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "wrap (Textarea)",
                   explaination = """
wrap is only for <textarea>.
It controls how text is wrapped when the form is submitted.

Values:
• soft → wraps on screen only (submitted text stays as one long line)
• hard → wraps and adds line breaks in submitted text (needs cols)

Most of the time: soft is okay.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>wrap Demo (Textarea)</h2>

<form onsubmit="go(event)">
  <label>Message (wrap=soft):</label><br>
  <textarea id="msg" wrap="soft" cols="30" rows="4"
    placeholder="Type long text here..."></textarea><br><br>

  <button type="submit">Send</button>
</form>

<p id="out"></p>

<script>
function go(e){
  e.preventDefault();
  const v = document.getElementById("msg").value;
  document.getElementById("out").innerText = "Submitted text:\n" + v;
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "spellcheck",
                   explaination = """
spellcheck tells the browser whether to underline spelling mistakes.

Values:
• spellcheck="true"
• spellcheck="false"

Useful for:
• comments
• messages
• blog posts
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>spellcheck Demo</h2>

<textarea spellcheck="true" rows="4" cols="35">
Type somthing wrong here...
</textarea>

<p>Try misspelling words. The browser may underline them.</p>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "required",
                   explaination = """
required means the input MUST be filled before form submits.
Browser shows a message automatically.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>required Demo</h2>

<form onsubmit="go(event)">
  <label>Email:</label><br>
  <input type="email" required placeholder="you@gmail.com"><br><br>
  <button type="submit">Submit</button>
</form>

<p id="out"></p>

<script>
function go(e){
  e.preventDefault();
  document.getElementById("out").innerText = "✅ Email provided!";
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "readonly",
                   explaination = """
readonly means:
• user cannot edit
• BUT the value IS submitted

Difference:
• readonly → submitted ✅
• disabled → not submitted ❌
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>readonly vs disabled</h2>

<form onsubmit="go(event)">
  <label>readonly (submitted):</label><br>
  <input name="readonlyField" value="I will submit" readonly><br><br>

  <label>disabled (not submitted):</label><br>
  <input name="disabledField" value="I will NOT submit" disabled><br><br>

  <button type="submit">Submit</button>
</form>

<p id="out"></p>

<script>
function go(e){
  e.preventDefault();
  document.getElementById("out").innerText =
    "✅ readonly submits, disabled does not.";
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "placeholder",
                   explaination = """
placeholder shows hint text inside an input.
It disappears when user starts typing.

Tip:
Use placeholder for hints, but still use <label> for the real name.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>placeholder Demo</h2>

<label>Username:</label><br>
<input type="text" placeholder="e.g. nick_eagle"><br><br>

<button onclick="done()">Done</button>
<p id="out"></p>

<script>
function done(){
  document.getElementById("out").innerText = "✅ Placeholder is just a hint.";
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "multiple",
                   explaination = """
multiple allows choosing more than one value.

Common uses:
• <input type="file" multiple> → pick many files
• <input type="email" multiple> → type many emails separated by comma
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>multiple Demo (File Picker)</h2>

<input id="files" type="file" multiple><br><br>

<button onclick="show()">Show File Count</button>
<p id="out"></p>

<script>
function show(){
  const count = document.getElementById("files").files.length;
  document.getElementById("out").innerText = "Files selected: " + count;
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "All attributes used",
                   explaination = "This is a mini “real app” form using many attributes + internal styling + JavaScript output.",
                   codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  body { font-family: Arial; }
  .card { width: 460px; padding: 16px; border-radius: 14px; background: #f5f5f5; }
  input, textarea, button { width: 100%; padding: 10px; border-radius: 10px; margin-top: 8px; }
  input:focus, textarea:focus { outline: 2px solid blue; }
  button { cursor: pointer; }
  .row { margin-top: 10px; }
</style>
</head>
<body>

<h2>All-in-One Attributes Form</h2>

<div class="card">
  <form id="f">
    <div class="row">
      <label>Full Name</label>
      <input id="name"
             type="text"
             placeholder="e.g. Nick Eagle"
             required
             minlength="3"
             maxlength="20"
             autocapitalize="words"
             autocomplete="name"
             autofocus>
    </div>

    <div class="row">
      <label>Email</label>
      <input id="email"
             type="email"
             placeholder="you@gmail.com"
             required
             autocomplete="email">
    </div>

    <div class="row">
      <label>Phone (07XXXXXXXX)</label>
      <input id="phone"
             type="tel"
             placeholder="0712345678"
             required
             pattern="^07[0-9]{8}$"
             autocomplete="tel">
    </div>

    <div class="row">
      <label>Age (18 - 60)</label>
      <input id="age" type="number" min="18" max="60" required>
    </div>

    <div class="row">
      <label>Bio (spellcheck on)</label>
      <textarea id="bio"
                rows="3"
                wrap="soft"
                spellcheck="true"
                placeholder="Say something about yourself..."></textarea>
    </div>

    <div class="row">
      <label>Promo Code (readonly)</label>
      <input id="promo" value="WELCOME20" readonly>
    </div>

    <div class="row">
      <label>Upload Files (multiple)</label>
      <input id="files" type="file" multiple>
    </div>

    <div class="row">
      <label>Disabled Field (won't submit)</label>
      <input value="Locked" disabled>
    </div>

    <button type="submit">Submit Form</button>
  </form>

  <p id="out"></p>
</div>

<script>
document.getElementById("f").addEventListener("submit", (e) => {
  e.preventDefault();

  const name = document.getElementById("name").value;
  const email = document.getElementById("email").value;
  const phone = document.getElementById("phone").value;
  const age = document.getElementById("age").value;
  const fileCount = document.getElementById("files").files.length;

  document.getElementById("out").innerHTML =
    "✅ Submitted!<br>" +
    "<b>Name:</b> " + name + "<br>" +
    "<b>Email:</b> " + email + "<br>" +
    "<b>Phone:</b> " + phone + "<br>" +
    "<b>Age:</b> " + age + "<br>" +
    "<b>Files:</b> " + fileCount;
});
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "This shows: required, minlength, maxlength, min/max, pattern, autocomplete, autocapitalize, autofocus, wrap, spellcheck, readonly, disabled, multiple + JS output."
               )
           ),

           questions = listOf(
               QuizQuestion("Which attribute makes an input mandatory?", listOf("readonly", "required", "disabled", "placeholder"), 1),
               QuizQuestion("What is the difference between readonly and disabled?", listOf("No difference", "readonly submits, disabled doesn’t", "disabled submits, readonly doesn’t", "readonly hides the input"), 1),
               QuizQuestion("Which attribute limits characters to a maximum length?", listOf("maxlength", "minlength", "max", "pattern"), 0),
               QuizQuestion("Which attribute controls allowed format using regex?", listOf("pattern", "placeholder", "autocomplete", "wrap"), 0),
               QuizQuestion("Which attribute focuses an input automatically?", listOf("autofocus", "required", "multiple", "spellcheck"), 0),
               QuizQuestion("Which attribute allows selecting many files?", listOf("multiple", "maxlength", "wrap", "min"), 0),
               QuizQuestion("Which attribute helps the browser suggest saved data?", listOf("autocomplete", "pattern", "readonly", "max"), 0),
               QuizQuestion("wrap attribute is mainly used for which element?", listOf("input", "button", "textarea", "form"), 2)
           )
       ),
       Subtopic(
           sutopicId = 117,
           subTopicName = "HTML Buttons (Click, Submit, Reset & More)",
           headlines = listOf(
               Headline(
                   majorHeadline = "Buttons in HTML",
                   majorHeadileExplanation = """
Buttons are clickable elements that trigger actions.
In HTML you can create buttons in TWO common ways:

1) <button>Click</button>   ✅ Best for most cases (can contain text, icons, HTML)
2) <input type="button|submit|reset">  ✅ Simple button input

Most important idea:
✅ A button can be used to run JavaScript
✅ A button can submit a form
✅ A button can reset a form
""".trimIndent(),
                   tip = "Inside a <form>, always set button type (type='button' / 'submit' / 'reset') to avoid accidental submits.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Buttons Demo (More than one)</h2>

<button type="button" onclick="hello()">Normal Button</button>
<input type="button" value="Input Button" onclick="hello()">

<form onsubmit="submitForm(event)" style="margin-top:15px;">
  <input type="text" placeholder="Type something..." required>
  <button type="submit">Submit Form</button>
  <button type="reset">Reset Form</button>
</form>

<p id="out"></p>

<script>
function hello(){
  document.getElementById("out").innerText = "👋 You clicked a button!";
}
function submitForm(e){
  e.preventDefault();
  document.getElementById("out").innerText = "✅ Form submitted (demo).";
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Uses of Buttons in HTML",
                   explaination = """
Buttons are used for many things:
• Save / Submit data (forms)
• Open/close menus (navigation)
• Trigger actions (like calculate, search, like)
• Control UI (show/hide password, dark mode)
• Start processes (upload, download, start quiz)

Below is a simple “save name” mini app using a button + JavaScript.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Save Name Example</h2>

<input id="name" type="text" placeholder="Enter your name">
<button type="button" onclick="save()">Save</button>

<p id="out"></p>

<script>
function save(){
  const name = document.getElementById("name").value;
  if(name.trim() === ""){
    document.getElementById("out").innerText = "⚠️ Please type your name first.";
  } else {
    document.getElementById("out").innerHTML = "✅ Saved: <b>" + name + "</b>";
  }
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Calling a JS Function",
                   explaination = """
A button can call a JavaScript function when clicked.
You can do it using:
• onclick="functionName()"
or modern way:
• addEventListener("click", ...)

Example: checkbox + button → show result.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Checkbox + Button (Call JS Function)</h2>

<label>
  <input id="agree" type="checkbox">
  I agree to the terms
</label>
<br><br>

<button type="button" onclick="checkAgree()">Continue</button>
<p id="out"></p>

<script>
function checkAgree(){
  const ok = document.getElementById("agree").checked;
  document.getElementById("out").innerText =
    ok ? "✅ Access granted!" : "❌ Please tick the checkbox first.";
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Button Attributes (Important List)",
                   explaination = """
Common button attributes (easy list):

✅ type (VERY IMPORTANT)
• type="button" → normal button (does not submit)
• type="submit" → submits a form
• type="reset" → clears form inputs

✅ disabled
• disables the button (cannot click)

✅ name + value (mostly for forms)
• sent to the server when submitting

✅ id / class
• used for styling and JavaScript selection

✅ title
• tooltip text when you hover

✅ onclick
• quick way to run JavaScript

✅ form (advanced)
• allows a button to submit a form even if button is outside the form

✅ formaction / formmethod / formtarget (advanced)
• can override the form’s action/method/target for ONE button
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Button Attributes Example (Color Picker)</h2>

<label>Pick a color:</label><br>
<input id="clr" type="color" value="#00aaff"><br><br>

<button id="btn1" type="button" title="Shows selected color"
        onclick="showColor()">
  Show Color
</button>

<button id="btn2" type="button" disabled title="Disabled button">
  Disabled
</button>

<p id="out"></p>

<script>
function showColor(){
  const c = document.getElementById("clr").value;
  document.getElementById("out").innerHTML = "🎨 Selected color: <b>" + c + "</b>";
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Form Buttons: submit vs reset vs button",
                   explaination = """
When buttons are inside a <form>, they get special powers:

1) Submit button (type="submit")
• sends form data to the action URL (or triggers submit event)

2) Reset button (type="reset")
• restores inputs to their original values

3) Normal button (type="button")
• does nothing by default (you decide with JavaScript)

This example shows action + submit + reset + button together.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Form Buttons in Action</h2>

<form id="myForm" action="/submit" method="GET" onsubmit="send(event)">
  <label>Username:</label><br>
  <input id="user" name="user" type="text" placeholder="nick123" required><br><br>

  <button type="button" onclick="fill()">Auto Fill</button>
  <button type="reset">Reset</button>
  <button type="submit">Submit</button>
</form>

<p id="out"></p>

<script>
function fill(){
  document.getElementById("user").value = "nick_eagle";
  document.getElementById("out").innerText = "✍️ Auto filled the username!";
}

function send(e){
  e.preventDefault(); // stop real navigation
  const u = document.getElementById("user").value;
  document.getElementById("out").innerHTML = "✅ Submitted username: <b>" + u + "</b>";
}
</script>

</body>
</html>
""".trimIndent(),
                   afterCodeEplainations = "We used e.preventDefault() so the page doesn’t refresh. In real websites, submit would go to the server."
               ),

               Headline(
                   headline = "Styling Buttons (Inline Styling)",
                   explaination = "Inline styles are written inside the element using style=\"...\". Great for quick tests, not best for big projects.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Inline Styled Buttons</h2>

<button type="button" style="padding:10px 16px; border:none; border-radius:10px; background:#222; color:white;">
  Dark Button
</button>

<button type="button" style="padding:10px 16px; border:2px solid #00aaff; border-radius:10px; background:white; color:#00aaff;">
  Outline Button
</button>

<button type="button" style="padding:10px 16px; border:none; border-radius:10px; background:orange; font-weight:bold;">
  Warning Button
</button>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Styling Buttons (Internal CSS Styling)",
                   explaination = """
Internal styling uses a <style> tag in the <head>.
This is cleaner than inline styling and easy to reuse.
We can also add hover effects to make buttons feel “alive”.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  body { font-family: Arial; }
  .btn {
    padding: 10px 16px;
    border-radius: 12px;
    border: none;
    cursor: pointer;
    margin-right: 8px;
  }
  .primary { background: #00aaff; color: white; }
  .danger { background: #ff3b3b; color: white; }
  .ghost  { background: transparent; border: 2px solid #222; }

  .btn:hover { transform: scale(1.03); }
  .btn:active { transform: scale(0.98); }
</style>
</head>
<body>

<h2>Internal Styled Buttons</h2>

<button class="btn primary" type="button" onclick="msg('Primary')">Primary</button>
<button class="btn danger" type="button" onclick="msg('Danger')">Danger</button>
<button class="btn ghost" type="button" onclick="msg('Ghost')">Ghost</button>

<p id="out"></p>

<script>
function msg(type){
  document.getElementById("out").innerText = "✅ You clicked: " + type;
}
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Disable Button (and Enable Later)",
                   explaination = """
disabled makes the button not clickable.
A cool real-world trick: disable “Submit” until user types something valid.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Disable & Enable Button</h2>

<input id="txt" type="text" placeholder="Type at least 3 characters">
<button id="goBtn" type="button" disabled onclick="go()">Continue</button>

<p id="out"></p>

<script>
const txt = document.getElementById("txt");
const btn = document.getElementById("goBtn");

txt.addEventListener("input", () => {
  btn.disabled = txt.value.trim().length < 3;
});

function go(){
  document.getElementById("out").innerText = "🚀 Button enabled and clicked!";
}
</script>

</body>
</html>
""".trimIndent()
               ),

               // Bonus extra headings (you asked “add many headings”)
               Headline(
                   headline = "Modern Way: addEventListener() for Buttons",
                   explaination = """
Instead of onclick in HTML, you can attach events in JavaScript.
This keeps HTML clean (structure) and JS clean (logic).
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>addEventListener Button</h2>

<button id="btn" type="button">Click Me</button>
<p id="out"></p>

<script>
document.getElementById("btn").addEventListener("click", () => {
  document.getElementById("out").innerText = "✅ Click handled using addEventListener!";
});
</script>

</body>
</html>
""".trimIndent()
               ),

               Headline(
                   headline = "Button Outside Form (using form attribute)",
                   explaination = """
Sometimes your submit button is NOT inside the <form>.
You can still link it using the form="formId" attribute.
""".trimIndent(),
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Button Outside a Form</h2>

<form id="loginForm" onsubmit="go(event)">
  <input id="email" type="email" required placeholder="Email"><br><br>
</form>

<!-- This button is outside the form but still submits it -->
<button type="submit" form="loginForm">Submit Login</button>

<p id="out"></p>

<script>
function go(e){
  e.preventDefault();
  document.getElementById("out").innerText = "✅ Submitted using outside button!";
}
</script>

</body>
</html>
""".trimIndent()
               )
           ),

           questions = listOf(
               QuizQuestion(
                   "Which button type submits a form?",
                   listOf("button", "submit", "reset", "disabled"),
                   1
               ),
               QuizQuestion(
                   "Which type clears form inputs back to default values?",
                   listOf("submit", "button", "reset", "onclick"),
                   2
               ),
               QuizQuestion(
                   "Why should you set type='button' inside a form for normal buttons?",
                   listOf("To make it blue", "To stop accidental form submit", "To reset inputs", "To enable autocomplete"),
                   1
               ),
               QuizQuestion(
                   "Which attribute makes a button not clickable?",
                   listOf("readonly", "disabled", "required", "placeholder"),
                   1
               ),
               QuizQuestion(
                   "Which method is the modern way to handle clicks in JavaScript?",
                   listOf("onclick=''", "addEventListener()", "button.clickText()", "form.run()"),
                   1
               ),
               QuizQuestion(
                   "Which tag is best for buttons that may include icons or HTML inside?",
                   listOf("<input>", "<button>", "<btn>", "<click>"),
                   1
               ),
               QuizQuestion(
                   "What happens if a <button> has no type inside a form (in many browsers)?",
                   listOf("It becomes disabled", "It becomes a submit button by default", "It becomes reset", "It becomes hidden"),
                   1
               ),
               QuizQuestion(
                   "Which attribute can connect a submit button to a form even if the button is outside?",
                   listOf("action", "form", "method", "value"),
                   1
               )
           )
       ),
       Subtopic(
           sutopicId = 114,
           subTopicName = "HTML Form Examples (Real Projects)",
           headlines = listOf(

               Headline(
                   majorHeadline = "HTML Form Examples",
                   tip = "Forms collect user data. Always combine HTML + CSS + JS for best experience.",
                   codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Simple Contact Form</h2>

<form>
  <input type="text" placeholder="Your Name"><br><br>
  <input type="email" placeholder="Email"><br><br>
  <button>Send</button>
</form>

</body>
</html>
"""
               ),

               // ================= STYLING =================
               Headline(
                   headline = "Form Example – Styling Focus",
                   explaination = "This example focuses on making the form look nice using internal CSS.",
                   codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
form{
  width:300px;
  padding:20px;
  background:#f2f2f2;
  border-radius:12px;
}
input,button{
  width:100%;
  padding:10px;
  margin-top:10px;
}
button{
  background:#00aaff;
  border:none;
  color:white;
}
</style>
</head>
<body>

<form>
<h3>Styled Login</h3>
<input placeholder="Username">
<input type="password" placeholder="Password">
<button>Login</button>
</form>

</body>
</html>
"""
               ),

               // ================= ATTRIBUTES =================
               Headline(
                   headline = "Form Example – Attributes Focus",
                   explaination = "Shows required, placeholder, minlength, maxlength.",
                   codeExample = """
<form>
<input placeholder="Name" required minlength="3"><br><br>
<input type="email" placeholder="Email" required><br><br>
<button>Submit</button>
</form>
"""
               ),

               // ================= DATA =================
               Headline(
                   headline = "Form Example – Collecting Data",
                   explaination = "Reads values using JavaScript.",
                   codeExample = """
<input id="name">
<button onclick="get()">Get Name</button>
<p id="out"></p>

<script>
function get(){
document.getElementById("out").innerText =
document.getElementById("name").value;
}
</script>
"""
               ),

               // ================= INPUT TYPES =================
               Headline(
                   headline = "Form Example – Input Types",
                   explaination = "Uses many input types.",
                   codeExample = """
<form>
<input type="text" placeholder="Name"><br>
<input type="email" placeholder="Email"><br>
<input type="date"><br>
<input type="color"><br>
<input type="range"><br>
<button>Send</button>
</form>
"""
               ),

               // ================= ACTION =================
               Headline(
                   headline = "Form Example – Action Attribute",
                   explaination = "Action decides where form data goes.",
                   codeExample = """
<form action="/submit">
<input placeholder="Username">
<button type="submit">Submit</button>
</form>
"""
               ),

               // ================= METHOD =================
               Headline(
                   headline = "Form Example – GET vs POST",
                   explaination = "GET shows data in URL. POST hides it.",
                   codeExample = """
<form method="GET">
<input name="user">
<button>GET</button>
</form>

<form method="POST">
<input name="user">
<button>POST</button>
</form>
"""
               ),

               // ================= RESPONSIVE =================
               Headline(
                   headline = "Form Example – Responsive",
                   explaination = "Uses percentage width.",
                   codeExample = """
<style>
input{width:100%;}
form{max-width:400px;}
</style>

<form>
<input placeholder="Mobile friendly">
<button>Send</button>
</form>
"""
               ),

               // ================= BUTTONS =================
               Headline(
                   headline = "Form Example – Buttons",
                   explaination = "Submit + Reset + Normal button.",
                   codeExample = """
<form>
<input placeholder="Name"><br><br>
<button type="submit">Submit</button>
<button type="reset">Reset</button>
<button type="button" onclick="alert('Clicked')">Normal</button>
</form>
"""
               ),

               // ================= AMAZING =================
               Headline(
                   headline = "Amazing Mini Registration Form",
                   explaination = "Styled + JS feedback.",
                   codeExample = """
<form onsubmit="go(event)">
<input id="n" placeholder="Name"><br><br>
<input id="e" type="email" placeholder="Email"><br><br>
<button>Register</button>
</form>

<p id="msg"></p>

<script>
function go(e){
e.preventDefault();
msg.innerHTML="Welcome "+n.value+" 🎉";
}
</script>
"""
               ),

               // ================= GET VALUES =================
               Headline(
                   headline = "Getting Values",
                   explaination = "Shows how to read form inputs.",
                   codeExample = """
<input id="x">
<button onclick="show()">Show</button>
<p id="o"></p>

<script>
function show(){
o.innerText=x.value;
}
</script>
"""
               ),

               // ================= VALIDATION =================
               Headline(
                   headline = "Form Validation",
                   explaination = "HTML validation with required + pattern.",
                   codeExample = """
<form>
<input required pattern="[A-Za-z]{3,}" placeholder="Only letters">
<button>Submit</button>
</form>
"""
               ),

               // ================= JS =================
               Headline(
                   headline = "Form with JavaScript",
                   explaination = "Prevent refresh + display values.",
                   codeExample = """
<form onsubmit="send(event)">
<input id="a">
<button>Send</button>
</form>
<p id="r"></p>

<script>
function send(e){
e.preventDefault();
r.innerText=a.value;
}
</script>
"""
               ),

               // ================= MODIFY =================
               Headline(
                   headline = "Modify Form Using JavaScript",
                   explaination = "Auto-fill + clear.",
                   codeExample = """
<input id="t">
<button onclick="fill()">Fill</button>
<button onclick="clear()">Clear</button>

<script>
function fill(){t.value="Nick";}
function clear(){t.value="";}
</script>
"""
               )
           ),

           questions = listOf(
               QuizQuestion("Which tag creates a form?", listOf("<input>","<form>","<div>","<field>"),1),
               QuizQuestion("Which attribute prevents empty submit?", listOf("readonly","required","pattern","wrap"),1),
               QuizQuestion("Which method hides data from URL?", listOf("GET","POST","SEND","PUT"),1),
               QuizQuestion("Which JS stops form refresh?", listOf("stop()","preventDefault()","exit()","break()"),1),
               QuizQuestion("Which button clears form?", listOf("submit","reset","button","disable"),1),
               QuizQuestion("Which input type is for email?", listOf("mail","email","text","user"),1),
               QuizQuestion("Where is validation done first?", listOf("Server","HTML","Database","Browser cache"),1)
           )
       ),


       )
),


    NoteModule(
        topic = "Deep Learning",
        topicId=4,
        subtopics = listOf(
            Subtopic(
                sutopicId = 45,
                subTopicName = "Lowered Text (Subscripts)",
                headlines = listOf(
                    Headline(
                        majorHeadline = "The <sub> Tag",
                        explaination = "In HTML, subscript text appears half a character below the normal line and is sometimes rendered in a smaller font. We use the <sub> tag to achieve this. It is perfect for scientific formulas or indicating variable bases in computing.",
                        codeExample = "<p>The chemical formula for water is H<sub>2</sub>O.</p>\n<p>In binary logic, we might write 101<sub>2</sub>.</p>",
                        tip = "Think of 'Sub' as 'Submarine'—it goes underwater (below the line)!"
                    ),
                    Headline(
                        headline = "Subscripts in Linux Documentation",
                        explaination = "When documenting system performance or hardware specs, you might use subscripts to denote specific versions or chemical components in battery tech (like Li-ion).",
                        codeExample = "<p>Testing the stability of Lithium<sub>(Li)</sub> batteries in server UPS systems.</p>",
                        afterCodeEplainations = "The browser takes the text inside <sub> and shifts it downward without breaking the paragraph's line height."
                    )
                ),
                questions = listOf(
                    QuizQuestion("Which tag is used to create subscript text?", listOf("<sup>", "<sub>", "<down>", "<below>"), 1),
                    QuizQuestion("Where does subscript text usually appear?", listOf("Above the line", "Same level as text", "Half a character below the line", "In a bold font"), 2),
                    QuizQuestion("Which is a correct use of <sub>?", listOf("H<sub>2</sub>O", "2<sup>nd</sup> Place", "<b>Bold</b>", "None"), 0),
                    QuizQuestion("Does the <sub> tag make text larger or smaller?", listOf("Larger", "Smaller", "It stays the same size", "It disappears"), 1),
                    QuizQuestion("True or False: <sub> is used for mathematical powers like 10 squared.", listOf("True", "False"), 1)
                )
            ) ,
            Subtopic(
                sutopicId = 46,
                subTopicName = "Raised Text (Superscripts)",
                headlines = listOf(
                    Headline(
                        majorHeadline = "The <sup> Tag",
                        explaination = "Superscript text appears half a character above the normal line. It is created using the <sup> tag. This is essential for mathematical exponents, ordinal numbers (like 1st, 2nd), or footnote references in technical manuals.",
                        codeExample = "<p>The area of the server room is 500m<sup>2</sup>.</p>\n<p>Einstein's famous equation: E=mc<sup>2</sup>.</p>",
                        tip = "Think of 'Super' as 'Superman'—he flies up high (above the line)!"
                    ),
                    Headline(
                        headline = "Using Superscripts for Ordinals",
                        explaination = "In Linux terminal tutorials, you might want to rank steps or use dates. Using superscripts makes these look professional and readable.",
                        codeExample = "<p>This is the 1<sup>st</sup> step in installing Arch Linux.</p>\n<p>Join the 24<sup>th</sup> annual Linux Convention.</p>",
                        afterCodeEplainations = "The <sup> tag raises the baseline of the text, making it look like a mathematical power or a formal date suffix."
                    )
                ),
                questions = listOf(
                    QuizQuestion("What does the 'p' in <sup> stand for?", listOf("Position", "Paragraph", "Power", "Superscript"), 3),
                    QuizQuestion("Which tag would you use for '10 to the power of 2'?", listOf("<sub>", "<exp>", "<sup>", "<high>"), 2),
                    QuizQuestion("Superscript text is rendered ___ the normal line.", listOf("Below", "Inside", "Above", "Behind"), 2),
                    QuizQuestion("Which of the following is correct?", listOf("5<sup>th</sup>", "5<sub>th</sub>", "<up>5</up>", "None"), 0),
                    QuizQuestion("Can you nest a <sub> inside a <sup>?", listOf("Yes, but it's rarely used", "No, it's illegal HTML", "It will crash the browser", "Only on Linux"), 0),
                    QuizQuestion("Which tag makes text look like a footnote reference?", listOf("<footer>", "<sup>", "<small>", "<cite>"), 1)
                )
            ) ,
            Subtopic(
                sutopicId = 47,
                subTopicName = "The <pre> Element",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Preserving Layout with <pre>",
                        explaination = "Normally, HTML collapses multiple spaces and newlines into a single space. The <pre> (Preformatted) tag tells the browser to display the text exactly as it is written in the HTML file, including all spaces and line breaks. It uses a fixed-width (monospace) font by default.",
                        codeExample = "<pre>\n  Line 1: Root directory\n  Line 2:   /bin\n  Line 3:   /etc\n</pre>",
                        tip = "Use <pre> when the spacing of your text is part of the information, like ASCII art or folder structures."
                    ),
                    Headline(
                        headline = "Displaying Code Snippets",
                        explaination = "In Linux tutorials, <pre> is often wrapped around a <code> tag to display multi-line terminal commands or script blocks without losing the indentation.",
                        codeExample = "<pre>\n<code>\nsudo apt update\nsudo apt upgrade -y\n</code>\n</pre>",
                        afterCodeEplainations = "The <pre> tag maintains the vertical structure, while <code> tells the browser the content is computer code."
                    )
                ),
                questions = listOf(
                    QuizQuestion("What does the <pre> tag preserve?", listOf("Only colors", "Spaces and line breaks", "Images", "Links"), 1),
                    QuizQuestion("What is the default font style for <pre>?", listOf("Cursive", "Bold", "Monospace (fixed-width)", "Italic"), 2),
                    QuizQuestion("Which tag is often used inside <pre> for code?", listOf("<code>", "<span>", "<bold>", "<cmd>"), 0),
                    QuizQuestion("How does a browser handle multiple spaces inside a normal <p> tag?", listOf("It keeps them", "It turns them into a single space", "It deletes them", "It adds a line break"), 1),
                    QuizQuestion("True or False: <pre> is great for displaying ASCII art.", listOf("True", "False"), 0)
                )
            ) ,
            Subtopic(
                sutopicId = 48,
                subTopicName = "Self-Contained Figures",
                headlines = listOf(
                    Headline(
                        majorHeadline = "The <figure> and <figcaption> Tags",
                        explaination = "The <figure> tag is used to mark up self-contained content, like photos, diagrams, or code listings. The <figcaption> tag provides a caption or description for that content.",
                        codeExample = "<figure>\n  <img src='ubuntu_desktop.png' alt='Ubuntu Desktop'>\n  <figcaption>Fig.1 - The default Ubuntu GNOME interface.</figcaption>\n</figure>",
                        tip = "The <figcaption> should always be the first or last child inside the <figure> element."
                    ),
                    Headline(
                        headline = "Figures for Code Blocks",
                        explaination = "You don't just have to use figures for images! You can use them to group a block of code with a clear title or description.",
                        codeExample = "<figure>\n  <pre><code>grep 'error' /var/log/syslog</code></pre>\n  <figcaption>Listing 4.2: Command to find errors in Linux logs.</figcaption>\n</figure>",
                        afterCodeEplainations = "This treats the code block as a formal 'figure' in your documentation, making it semantically clear to search engines."
                    ),
                    Headline(
                        headline = "Benefits of Semantic Figures",
                        explaination = "Using <figure> instead of just a <div> helps accessibility tools (like screen readers) understand that the image and its caption are related.",
                        codeExample = "<figure>\n  <img src='terminal_icon.png' alt='Terminal'>\n  <figcaption>The gateway to the Linux kernel.</figcaption>\n</figure>",
                        afterCodeEplainations = "This structure creates a clear relationship between the visual asset and the descriptive text."
                    )
                ),
                questions = listOf(
                    QuizQuestion("Which tag provides a caption for a figure?", listOf("<title>", "<caption>", "<figcaption>", "<desc>"), 2),
                    QuizQuestion("Where can <figcaption> be placed inside <figure>?", listOf("Only at the top", "Only at the bottom", "Top or bottom", "Anywhere in the page"), 2),
                    QuizQuestion("Can a <figure> contain a <table> or <code> block?", listOf("No, only images", "Yes, any self-contained content", "Only if it has a link", "Only in Linux"), 1),
                    QuizQuestion("Is the <figure> tag a block-level or inline element?", listOf("Block-level", "Inline", "Hidden", "Inline-block"), 0),
                    QuizQuestion("Does <figure> automatically center your image?", listOf("Yes", "No, you need CSS for that", "Only on mobile", "Sometimes"), 1)
                )
            ),
            Subtopic(
                sutopicId = 41,
                subTopicName = "Interactive Editing",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Introduction to Editability",
                        explaination = "HTML allows you to make almost any element editable by the user without needing a form or a textarea. This is great for building 'In-place' editors or note-taking apps.",
                        codeExample = "<div contenteditable='true'>\n  Click here to edit this server note!\n</div>",
                        tip = "Use this for rich-text editing where users need to format text directly on the page."
                    ),
                    Headline(
                        headline = "The contenteditable Attribute",
                        explaination = "By adding 'contenteditable' to an element, you turn the browser into a text editor. Setting it to 'true' enables editing, while 'false' (the default) disables it.",
                        codeExample = "\n<p contenteditable='true'>I am a terminal log. Edit me!</p>\n\n<p contenteditable='false'>I am read-only.</p>",
                        afterCodeEplainations = "This attribute is the foundation for web-based document editors like Google Docs."
                    ),
                    Headline(
                        headline = "Customizing the Caret Color",
                        explaination = "The 'caret' is the blinking vertical line that shows where you are typing. In CSS, you can use the 'caret-color' property to change its appearance to match your theme (like a classic green Linux terminal).",
                        codeExample = "<style>\n  .terminal-style {\n    caret-color: #00ff00;\n    background: black;\n    color: white;\n    padding: 10px;\n  }\n</style>\n<div contenteditable='true' class='terminal-style'>\n  Type here... the cursor is green!\n</div>",
                        afterCodeEplainations = "Caret-color allows for deep customization of the user's typing experience."
                    ),
                    Headline(
                        headline = "Removing the Focus Outline",
                        explaination = "Browsers usually show a blue border (outline) when an editable element is clicked. You can remove or change this using the CSS 'outline' property.",
                        codeExample = "<style>\n  .no-outline:focus {\n    outline: none;\n    border-bottom: 2px solid green;\n  }\n</style>\n<div contenteditable='true' class='no-outline'>\n  Clean editing experience with no blue box.\n</div>",
                        afterCodeEplainations = "Removing the outline is common in UI design, but always ensure you provide a different visual cue for accessibility."
                    ),
                    Headline(
                        headline = "Real-world Linux App Use Case",
                        explaination = "Imagine building a web-based Bash script editor. You would combine these attributes to make the interface feel like a real terminal.",
                        codeExample = "<div contenteditable='true' spellcheck='false' style='font-family: monospace;'>\n  #!/bin/bash\n  echo \"Hello User\"\n</div>",
                        afterCodeEplainations = "Setting spellcheck='false' is important for code editors so the browser doesn't underline commands in red."
                    )
                ),
                questions = listOf(
                    QuizQuestion("Which attribute makes an element editable?", listOf("editable='yes'", "contenteditable='true'", "mode='write'", "can-edit"), 1),
                    QuizQuestion("What is the 'caret'?", listOf("A type of tag", "The blinking text cursor", "A background color", "A Linux command"), 1),
                    QuizQuestion("How do you change the cursor color in CSS?", listOf("cursor-color", "pointer-color", "caret-color", "line-color"), 2),
                    QuizQuestion("What happens when 'contenteditable' is set to 'false'?", listOf("The text disappears", "The text becomes bold", "The text cannot be edited", "The text turns red"), 2),
                    QuizQuestion("Why might you set spellcheck='false' on an editable element?", listOf("To save battery", "To stop red underlines on code", "To make it load faster", "To hide the text"), 1),
                    QuizQuestion("Which CSS pseudo-class is used to style the element being edited?", listOf(":hover", ":active", ":focus", ":visited"), 2)
                )
            ),
            Subtopic(
                sutopicId = 42,
                subTopicName = "HTML Meta",
                headlines = listOf(
                    Headline(
                        majorHeadline = "The <meta> Tag",
                        majorHeadileExplanation = "The <meta> tag provides 'metadata' about your HTML document. It is placed inside the <head> section. Metadata isn't displayed on the page but is used by browsers, search engines (SEO), and OS kernels to understand how to handle your site.",
                        codeExample = "<head>\n  <meta charset='UTF-8'>\n  <meta name='description' content='Linux Tutorial Site'>\n</head>",
                        tip = "Always include <meta charset='UTF-8'> to ensure your code handles special characters correctly!"
                    ),
                    Headline(
                        headline = "The http-equiv Attribute",
                        explaination = "This attribute simulates an HTTP response header. It is often used to refresh the page automatically or set security policies.",
                        codeExample = "<meta http-equiv='refresh' content='30'>\n"
                    ),
                    Headline(
                        headline = "The 'name' Attribute",
                        explaination = "The 'name' attribute defines the *type* of metadata you are providing, such as the author, description, or keywords.",
                        codeExample = "<meta name='author' content='SysAdmin-Linus'>"
                    ),
                    Headline(
                        headline = "The 'content' Attribute",
                        explaination = "The 'content' attribute provides the actual value for the 'name' or 'http-equiv' attribute.",
                        codeExample = "<meta name='keywords' content='Linux, Ubuntu, Bash, Terminal'>"
                    ),
                    Headline(
                        headline = "Responsive Design: The Viewport",
                        explaination = "To make your site look good on mobile phones, you must use the Viewport meta tag. It tells the browser how to scale the page to fit the screen size.",
                        codeExample = "<meta name = 'viewport' content = 'width=device-width, initial-scale=1.0'>"
                    ),
                    Headline(
                        explaination = "Try this: Create a page with a large 1000px wide <div>. View it on a mobile emulator. Now remove the viewport meta tag below. You'll notice the page looks tiny or requires horizontal scrolling!",
                        codeExample = "<meta name='viewport' content='width=device-width, initial-scale=1.0'>\n<div style='width: 100%; background: green;'>Full Width Header</div>"
                    ),
                    Headline(
                        headline = "SEO (Search Engine Optimization)",
                        explaination = "Search engines use meta descriptions to show a summary of your site in search results. Without this, your Linux blog might just show random text from the header.",
                        codeExample = "<meta name='description' content='Master the Linux Command Line with our interactive HTML guides.'>"
                    )
                ),
                questions = listOf(
                    QuizQuestion("Where is the <meta> tag placed?", listOf("Inside <body>", "Inside <head>", "After </html>", "Inside <title>"), 1),
                    QuizQuestion("Which attribute is used for the character set?", listOf("name", "http-equiv", "charset", "content"), 2),
                    QuizQuestion("What does the 'viewport' meta tag help with?", listOf("Page speed", "Responsive design (mobile)", "Background colors", "Setting the font"), 1),
                    QuizQuestion("Is the <meta> tag visible to the website visitor?", listOf("Yes", "No, only to the browser/search engines", "Only on Linux", "Only when clicked"), 1),
                    QuizQuestion("Which meta tag can refresh the page automatically?", listOf("name='refresh'", "http-equiv='refresh'", "charset='refresh'", "type='refresh'"), 1)
                )
            ),
            Subtopic(
                sutopicId = 43,
                subTopicName = "Quoting Content",
                headlines = listOf(
                    Headline(
                        majorHeadline = "The <blockquote> Element",
                        majorHeadileExplanation = "Use <blockquote> for long sections of text quoted from another source. Browsers usually indent this text to set it apart. We've added background colors here to show how you can style them for a terminal-themed quote.",
                        codeExample = "<blockquote style='background-color: #f0f0f0; border-left: 5px solid #2ecc71; padding: 10px;'>\n  'Linux is only free if your time has no value.' - Jamie Zawinski\n</blockquote>",
                        tip = "Use blockquote for multi-line quotes; use the <q> tag for short, inline quotes."
                    ),
                    Headline(
                        headline = "Citing Your Sources",
                        explaination = "The 'cite' attribute (inside the tag) is for a URL to the source. The <cite> element (text) is used to show the name of the work/author to the user.",
                        codeExample = "<blockquote cite='https://www.kernel.org'>\n  <p>The Linux kernel is a free and open-source, monolithic, Unix-like operating system kernel.</p>\n</blockquote>\n<p>Source: <cite>Wikipedia</cite></p>"
                    ),
                    Headline(
                        headline = "Styling Quotes like a Terminal",
                        explaination = "You can make quotes look like a system message by using a monospace font and a dark background.",
                        codeExample = "<blockquote style='background: #333; color: #0f0; font-family: monospace; padding: 15px;'>\n  FATAL ERROR: System failure imminent.\n</blockquote>",
                        afterCodeEplainations = "This uses standard CSS styles applied directly to the blockquote tag."
                    )
                ),
                questions = listOf(
                    QuizQuestion("Which tag is used for long quotations?", listOf("<quote>", "<q>", "<blockquote>", "<cite>"), 2),
                    QuizQuestion("What is the default visual style of a blockquote?", listOf("It is bolded", "It is italicized", "It is usually indented", "It is centered"), 2),
                    QuizQuestion("The <cite> tag is used to define:", listOf("The price", "The title of a work/author", "The font size", "A link"), 1),
                    QuizQuestion("Where do you put the URL of the source in a blockquote?", listOf("In the 'href' attribute", "In the 'cite' attribute", "In the 'src' attribute", "In a comment"), 1),
                    QuizQuestion("Is <blockquote> a block-level or inline element?", listOf("Block-level", "Inline", "Hidden", "None of the above"), 0)
                )
            ),
            Subtopic(
                sutopicId = 44,
                subTopicName = "The Non-Breaking Space",
                headlines = listOf(
                    Headline(
                        majorHeadline = "The &nbsp; Entity",
                        majorHeadileExplanation = "In HTML, multiple spaces are collapsed into one. If you want to force extra spaces or prevent two words from being separated by a line break, you use the entity '&nbsp;' (Non-Breaking Space).",
                        tip = "Don't use &nbsp; to create layout padding; use CSS margins instead. Only use it for text spacing!",
                        codeExample = "<p>Standard: 10 GB</p>\n<p>Forced Space: 10&nbsp;&nbsp;&nbsp;&nbsp;GB</p>"
                    ),
                    Headline(
                        headline = "Preventing Line Breaks",
                        explaination = "Sometimes you don't want the browser to split a value and its unit (like 100 MB) onto two different lines. &nbsp; glues them together.",
                        codeExample = "<p>Your server has 64&nbsp;GB of RAM.</p>",
                        afterCodeEplainations = "Even if the screen is small, '64' and 'GB' will always stay on the same line."
                    ),
                    Headline(
                        headline = "ASCII Visuals with nbsp",
                        explaination = "In technical writing, you might use it to manually align text in a way that regular spaces won't allow in standard HTML tags.",
                        codeExample = "<p>User:&nbsp;&nbsp;&nbsp;root</p>\n<p>Pass:&nbsp;&nbsp;&nbsp;****</p>",
                        afterCodeEplainations = "The browser renders exactly three spaces because of the entities."
                    )
                ),
                questions = listOf(
                    QuizQuestion("What does &nbsp; stand for?", listOf("New Block Space", "Non-Breaking Space", "Next Binary Space", "Normal Base Space"), 1),
                    QuizQuestion("How many spaces does one &nbsp; create?", listOf("One", "Two", "Five", "Ten"), 0),
                    QuizQuestion("What happens to five regular spaces in HTML code?", listOf("They stay as five", "They turn into one space", "They cause an error", "They disappear"), 1),
                    QuizQuestion("Why use &nbsp; between a number and a unit (like 5kg)?", listOf("To make it bold", "To prevent a line break between them", "To change the font", "To save memory"), 1),
                    QuizQuestion("Which character starts the nbsp entity?", listOf("$", "@", "&", "#"), 2)
                )
            ),

            Subtopic(
                sutopicId = 49,
                subTopicName = "Character Entities",
                headlines = listOf(
                    Headline(
                        majorHeadline = "The Secret Code of Symbols",
                        explaination = "In HTML, some characters are 'reserved.' For example, if you use '<', the browser thinks you are starting a tag. To display these characters correctly, we use 'Entities'. \n\n* They always start with an ampersand (&).\n* They always end with a semicolon (;).\n* They are case-sensitive.",
                        codeExample = "<p>To show a tag in HTML, use &lt;p&gt; instead of <p>.</p>",
                        tip = "Use entities to avoid 'confusing' the browser's HTML parser."
                    ),
                    Headline(
                        explaination = "Here are 10 common entities used in technical documentation:\n\n* &lt; : Less than (<)\n* &gt; : Greater than (>)\n* &amp; : Ampersand (&)\n* &quot; : Double quote (\")\n* &apos; : Single quote (')\n* &copy; : Copyright symbol (©)\n* &reg; : Registered trademark (®)\n* &euro; : Euro currency (€)\n* &trade; : Trademark (™)\n* &times; : Multiplication (×)",
                        codeExample = "<footer>\n  <p>Linux OS &reg; &amp; Bash Scripting &copy; 2026</p>\n  <p>Price: &euro;10 &times; 2 licenses</p>\n</footer>",
                        afterCodeEplainations = "This ensures symbols render perfectly across all Linux distributions and browsers."
                    ),
                    Headline(
                        headline = "The Advantage of Entities",
                        explaination = "Entities ensure your code remains 'valid' even if you are writing about HTML itself. Without &lt;, you couldn't easily write a tutorial about tags!",
                        codeExample = "<code>if (CPU_usage &gt; 90) { alert('Warning!'); }</code>",
                        afterCodeEplainations = "Notice how &gt; prevents the browser from thinking you are starting a tag named '90'."
                    )
                ),
                questions = listOf(
                    QuizQuestion("How do all HTML entities start?", listOf("#", "$", "&", "%"), 2),
                    QuizQuestion("What is the entity for the 'Less Than' symbol (<)?", listOf("&less;", "&lt;", "&lower;", "<"), 1),
                    QuizQuestion("Which entity should you use for the Copyright symbol?", listOf("&copy;", "&copyright;", "&c;", "&copy"), 0),
                    QuizQuestion("Why do we use &amp; instead of just &?", listOf("It makes it bold", "To prevent errors in HTML validation", "To save memory", "It's required by Linux"), 1),
                    QuizQuestion("True or False: Entities must end with a semicolon (;).", listOf("True", "False"), 0)
                )
            ),
            Subtopic(
                sutopicId = 410,
                subTopicName = "Working with Audio",
                headlines = listOf(
                    Headline(
                        majorHeadline = "The <audio> Tag",
                        explaination = "The <audio> element is used to play sound files on a webpage. It supports formats like MP3, WAV, and OGG.",
                        codeExample = "<audio src='system_startup.mp3' controls></audio>",
                        tip = "Always include the 'controls' attribute, or the audio player will be invisible!"
                    ),
                    Headline(
                        headline = "The Audio Element Structure",
                        explaination = "The best way to use audio is to wrap the <source> tag inside the <audio> tag. This allows the browser to choose the best file format for the system.",
                        codeExample = "<audio controls>\n  <source src='alert.ogg' type='audio/ogg'>\n  <source src='alert.mp3' type='audio/mpeg'>\n  Your browser does not support the audio element.\n</audio>",
                        afterCodeEplainations = "The text at the bottom only shows if the user's browser is very old."
                    ),
                    Headline(
                        headline = "Essential Audio Attributes",
                        explaination = "Control how your sound behaves:\n\n* **controls**: Adds play/pause and volume buttons.\n* **autoplay**: Starts playing as soon as the page loads.\n* **loop**: Plays the sound over and over again.\n* **muted**: Starts the audio with no sound.",
                        codeExample = "<audio src='ambient_data_center.mp3' controls loop muted></audio>",
                        afterCodeEplainations = "Loop and Muted are often used together for background atmosphere."
                    ),
                    Headline(
                        headline = "The <source> Tag for Compatibility",
                        explaination = "Different browsers (like Firefox on Linux vs Safari on Mac) prefer different audio formats. <source> lets you provide all of them.",
                        codeExample = "<source src='sound.wav' type='audio/wav'>"
                    ),
                    Headline(
                        headline = "Advanced Audio: Preload",
                        explaination = "The 'preload' attribute tells the browser how much data to download. Options are 'none' (don't download until clicked), 'metadata' (only get the length/info), or 'auto' (download the whole file).",
                        codeExample = "<audio src='podcast.mp3' preload='metadata' controls></audio>"
                    )
                ),
                questions = listOf(
                    QuizQuestion("Which attribute makes the audio player visible?", listOf("show", "visible", "controls", "play"), 2),
                    QuizQuestion("What does the 'loop' attribute do?", listOf("Stops the audio", "Plays it once", "Plays it repeatedly", "Changes the volume"), 2),
                    QuizQuestion("Which tag is used inside <audio> to define file paths?", listOf("<link>", "<src>", "<source>", "<file>"), 2),
                    QuizQuestion("Why would you use 'muted' with 'autoplay'?", listOf("To save data", "Most browsers block autoplay with sound", "To hide the player", "To speed up the audio"), 1),
                    QuizQuestion("Which of these is a common audio format for web?", listOf("PNG", "MP3", "EXE", "TXT"), 1)
                )
            ),
            Subtopic(
                sutopicId = 411,
                subTopicName = "Working with Video",
                headlines = listOf(
                    Headline(
                        majorHeadline = "The <video> Tag",
                        explaination = "The <video> tag allows you to embed movie clips directly in your site. Just like audio, it needs a source and usually controls.",
                        codeExample = "<video src='linux_tutorial.mp4' width='320' height='240' controls></video>",
                        tip = "Always define 'width' and 'height' to prevent the page from jumping while the video loads."
                    ),
                    Headline(
                        headline = "Video Attributes Explained",
                        explaination = "* **poster**: Shows an image while the video is downloading.\n* **controls**: Standard playback buttons.\n* **autoplay**: Starts automatically (usually requires 'muted').\n* **loop**: Restarts the video when it ends.",
                        codeExample = "<video src='server_rack.mp4' poster='thumbnail.jpg' controls width='400'></video>",
                        afterCodeEplainations = "The poster attribute acts like a 'cover' for your video."
                    ),
                    Headline(
                        headline = "Advanced: Loading Metadata",
                        explaination = "Using preload='metadata' is efficient because it only fetches the video duration and dimensions without downloading the whole movie yet.",
                        codeExample = "<video src='demo.mp4' preload='metadata' controls></video>"
                    ),
                    Headline(
                        headline = "Handling Different Internet Speeds",
                        explaination = "To help users with slow connections (like remote SSH users), you can list multiple sources. The browser will pick the first one it can play.",
                        codeExample = "<video controls>\n  <source src='tutorial_1080p.mp4' type='video/mp4'>\n  <source src='tutorial_480p.mp4' type='video/mp4'>\n</video>",
                        afterCodeEplainations = "In professional apps, we provide lower resolution versions to ensure everyone can watch without buffering."
                    )
                ),
                questions = listOf(
                    QuizQuestion("Which attribute displays an image before the video plays?", listOf("image", "thumbnail", "poster", "preview"), 2),
                    QuizQuestion("What is the benefit of the 'preload' attribute?", listOf("Changes video color", "Saves battery", "Controls how much data is downloaded early", "Makes video louder"), 2),
                    QuizQuestion("Most browsers only allow 'autoplay' if the video is:", listOf("Short", "High quality", "Muted", "Paused"), 2),
                    QuizQuestion("Which tag provides different file formats for video?", listOf("<source>", "<file>", "<type>", "<video_src>"), 0),
                    QuizQuestion("Which attribute prevents the video from stopping at the end?", listOf("restart", "loop", "repeat", "infinite"), 1)
                )
            ) ,
            Subtopic(
                sutopicId = 412,
                subTopicName = "Windows within Windows (Iframes)",
                headlines = listOf(
                    Headline(
                        majorHeadline = "The <iframe> Tag",
                        explaination = "An <iframe> is used to display a web page within a web page. Think of it like a terminal window running a sub-shell; it is a nested browsing context.",
                        codeExample = "<iframe src='https://www.wikipedia.org' title='Wiki Window'></iframe>",
                        tip = "Always include a 'title' attribute for accessibility so screen readers know what the frame contains."
                    ),
                    Headline(
                        headline = "Architecture of the Iframe",
                        explaination = "An iframe acts as a 'hole' in your page that looks into another file. It has its own history and document object, separate from the main page.",
                        codeExample = "<iframe src='local_server_stats.html' width='100%' height='300'></iframe>",
                        afterCodeEplainations = "The browser creates a separate process for the iframe to keep it isolated from the main site."
                    ),
                    Headline(
                        headline = "Iframe Attributes",
                        explaination = "Key attributes to control the frame:\n\n* **src**: The URL of the page to embed.\n* **loading**: Use 'lazy' to wait until the user scrolls to it.\n* **sandbox**: Adds extra security restrictions to the frame (like a jail or container).",
                        codeExample = "<iframe src='dashboard.html' loading='lazy' sandbox></iframe>"
                    ),
                    Headline(
                        headline = "Sizing: Height and Width",
                        explaination = "You can set the size in pixels or percentages. By default, iframes are quite small, so you usually want to define these.",
                        codeExample = "<iframe src='map.html' width='600' height='400'></iframe>",
                        afterCodeEplainations = "Using width='100%' is great for responsive Linux dashboards."
                    ),
                    Headline(
                        headline = "Targeting by Name",
                        explaination = "If you give an iframe a 'name', you can open links inside it from elsewhere on the page! This is how old-school documentation sidebars worked.",
                        codeExample = "<a href='https://linux.org' target='view_frame'>Click to load Linux.org</a>\n<iframe name='view_frame' height='300' width='500'></iframe>"
                    ),
                    Headline(
                        headline = "Iframe Styling & Borders",
                        explaination = "Iframes have a default border that looks like an old 90s window. Most modern devs remove this using CSS 'border: none;'.",
                        codeExample = "<iframe src='notes.txt' style='border: none; box-shadow: 2px 2px 10px gray;'></iframe>"
                    ),
                    Headline(
                        headline = "Embedding External Tools",
                        explaination = "Iframes are perfect for embedding Google Maps, YouTube videos, or live code editors.",
                        codeExample = "\n<iframe width='425' height='350' src='https://www.openstreetmap.org/export/embed.html?bbox=-0.1,51.5,-0.08,51.51'></iframe>"
                    )
                ),
                questions = listOf(
                    QuizQuestion("What does <iframe> stand for?", listOf("Internal Frame", "Inline Frame", "Indexed Frame", "Integrated Frame"), 1),
                    QuizQuestion("Which attribute specifies the URL of the page to embed?", listOf("href", "link", "src", "url"), 2),
                    QuizQuestion("How do you remove the default border of an iframe?", listOf("border='0'", "style='border:none;'", "frame='hide'", "No way to remove it"), 1),
                    QuizQuestion("What does the 'sandbox' attribute do?", listOf("Changes the color", "Adds security restrictions", "Makes it play games", "Saves it to the cloud"), 1),
                    QuizQuestion("Which attribute is used to make a link open inside a specific iframe?", listOf("id", "class", "name", "type"), 2)
                )
            ),
            Subtopic(
                sutopicId = 413,
                subTopicName = "YouTube & Advanced Iframes",
                headlines = listOf(
                    Headline(
                        majorHeadline = "YouTube in Iframes",
                        explaination = "YouTube uses iframes as the primary way to embed videos. Instead of a standard file path, you use their 'embed' URL format.",
                        codeExample = "<iframe width='560' height='315' src='https://www.youtube.com/embed/dQw4w9WgXcQ'></iframe>",
                        tip = "Notice the URL uses '/embed/' instead of '/watch?v='. A standard watch link won't work in an iframe!"
                    ),
                    Headline(
                        headline = "The allowfullscreen Attribute",
                        explaination = "Without this attribute, the 'Full Screen' button on the YouTube player will be disabled. It's a boolean attribute.",
                        codeExample = "<iframe src='...' allowfullscreen></iframe>"
                    ),
                    Headline(
                        headline = "YouTube Parameters (HD & Controls)",
                        explaination = "You can add parameters to the end of the URL to change behavior:\n\n* **controls=0**: Hides the play/pause bar.\n* **rel=0**: Stops showing suggested videos from other channels.\n* **vq=hd1080**: Suggests High Definition playback.",
                        codeExample = "<iframe src='https://www.youtube.com/embed/dQw4w9WgXcQ?controls=0&rel=0'></iframe>"
                    ),
                    Headline(
                        headline = "Setting a Starting Point",
                        explaination = "Want to show a specific part of a Linux tutorial? Use the 'start' parameter (in seconds).",
                        codeExample = "<iframe src='https://www.youtube.com/embed/dQw4w9WgXcQ?start=60'></iframe>",
                        afterCodeEplainations = "This video will start playing at the 1-minute mark."
                    ),
                    Headline(
                        headline = "Adding Captions Automatically",
                        explaination = "You can force the video to show closed captions immediately using 'cc_load_policy=1'.",
                        codeExample = "<iframe src='https://www.youtube.com/embed/dQw4w9WgXcQ?cc_load_policy=1'></iframe>"
                    )
                ),
                questions = listOf(
                    QuizQuestion("Which URL segment is required for YouTube iframes?", listOf("/watch", "/embed/", "/video/", "/link/"), 1),
                    QuizQuestion("What does 'allowfullscreen' enable?", listOf("Higher volume", "The ability to expand video to full screen", "Automatic play", "Subtitles"), 1),
                    QuizQuestion("How do you start a video at 30 seconds?", listOf("?time=30", "?start=30", "?begin=30", "?at=30"), 1),
                    QuizQuestion("Which parameter hides the YouTube play/pause buttons?", listOf("buttons=0", "controls=0", "ui=none", "hide=1"), 1),
                    QuizQuestion("What does 'rel=0' do?", listOf("Speeds up the video", "Prevents suggested videos from other channels", "Mutes the audio", "Enables HD"), 1)
                )
            ),
            Subtopic(
                sutopicId = 414,
                subTopicName = "Navigating File Paths",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Understanding File Paths",
                        explaination = "A file path describes where a file is located in the folder structure. In HTML, we use these to link images, scripts, and other pages. Just like the Linux terminal, these can be Absolute or Relative.",
                        codeExample = "<img src='images/tux.png' alt='Linux Penguin'>",
                        tip = "Always use forward slashes (/) in web paths, even if you are developing on Windows!"
                    ),
                    Headline(
                        headline = "Absolute File Paths",
                        explaination = "An absolute path is the full URL to a file on the internet. It always includes the protocol (http:// or https://).",
                        codeExample = "<img src='https://www.linux.org/images/logo.png'>",
                        afterCodeEplainations = "It works regardless of where your current HTML file is saved because it points to a specific global address."
                    ),
                    Headline(
                        headline = "Relative File Paths",
                        explaination = "A relative path points to a file relative to the current page. \n\n* **file.jpg**: Same folder.\n* **images/file.jpg**: In the 'images' sub-folder.\n* **../file.jpg**: One folder 'up' (parent directory).",
                        codeExample = "<link rel='stylesheet' href='../css/styles.css'>",
                        afterCodeEplainations = "Relative paths are best for local development because they won't break if you move the whole project folder."
                    ),
                    Headline(
                        headline = "The Root-Relative Path",
                        explaination = "Starting a path with a slash (/) refers to the root directory of the website. This is similar to the '/' (root) directory in Linux.",
                        codeExample = "<a href='/contact.html'>Home</a>"
                    )
                ),
                questions = listOf(
                    QuizQuestion("What does a path starting with 'https://' represent?", listOf("Relative path", "Absolute path", "Root path", "Folder path"), 1),
                    QuizQuestion("Which symbol is used to move up one folder in a relative path?", listOf("./", "/", "../", ".../"), 2),
                    QuizQuestion("If an image is in the same folder as the HTML file, what is the path?", listOf("/image.jpg", "image.jpg", "../image.jpg", "folder/image.jpg"), 1),
                    QuizQuestion("Why are relative paths better for website projects?", listOf("They are faster", "They work even if you move the project to a new server", "They are more secure", "They look better"), 1),
                    QuizQuestion("In 'images/logo.png', where is the 'logo.png' file?", listOf("In the parent folder", "In the same folder", "In a sub-folder named 'images'", "On another website"), 2)
                )
            ),



            )
),
    NoteModule(
        topic = "Common HTML Practices",
        topicId=5,
        subtopics = listOf(
            Subtopic(
                sutopicId = 51,
                subTopicName = "Semantic Layouts",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Beyond the <div> Tag",
                        explaination = "In the past, developers used <div> for everything. Today, we use 'Semantic' tags like <header>, <nav>, <main>, and <footer>. These tell Search Engines and Screen Readers exactly what part of the page they are looking at.",
                        codeExample = """
<!DOCTYPE html>
<html lang="en">
<style>
  body { font-family: sans-serif; margin: 0; display: flex; flex-direction: column; min-height: 100vh; }
  header { background: #333; color: white; padding: 1rem; text-align: center; }
  nav { background: #444; color: white; padding: 0.5rem; }
  main { flex: 1; padding: 20px; }
  footer { background: #222; color: #888; text-align: center; padding: 10px; }
</style>
<body>
    <header><h1>Linux Academy</h1></header>
    <nav>Home | Tutorials | Commands</nav>
    <main>
        <article>
            <h2>Understanding Sudo</h2>
            <p>Sudo allows users to run programs with security privileges...</p>
        </article>
    </main>
    <footer>&copy; 2026 Linux Academy</footer>
</body>
</html>
            """.trimIndent(),
                        tip = "Use <main> only once per page to represent the unique content of that page."
                    )
                ),
                questions = listOf(
                    QuizQuestion("Which tag is best for the website navigation links?", listOf("<section>", "<footer>", "<nav>", "<aside>"), 2),
                    QuizQuestion("What is the benefit of Semantic HTML?", listOf("Faster CPU usage", "Better Accessibility and SEO", "It adds automatic colors", "It prevents hacking"), 1),
                    QuizQuestion("How many <main> tags should a page have?", listOf("One", "Two", "Unlimited", "Zero"), 0),
                    QuizQuestion("Which tag usually contains the copyright notice?", listOf("<header>", "<article>", "<footer>", "<main>"), 2)
                )
            ),
            Subtopic(
                sutopicId = 52,
                subTopicName = "Responsive Web Standards",
                headlines = listOf(
                    Headline(
                        majorHeadline = "The Viewport & Fluidity",
                        explaination = "Most web traffic comes from mobile. Professional practice involves setting the 'Viewport' and using 'Responsive' CSS to ensure the site works on everything from a 4-inch phone to a 27-inch monitor.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        .container { width: 90%; margin: auto; background: #eee; padding: 20px; }
        @media (max-width: 600px) {
            .container { width: 100%; background: #ccc; }
            h1 { font-size: 1.2rem; }
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Responsive Server Monitor</h1>
        <p>This box changes size based on your screen!</p>
    </div>
</body>
</html>
            """.trimIndent(),
                        tip = "Try resizing your browser window to see the 'Media Query' change the background color!"
                    )
                ),
                questions = listOf(
                    QuizQuestion("Which meta tag is required for responsive sites?", listOf("charset", "viewport", "author", "refresh"), 1),
                    QuizQuestion("What does 'width=device-width' do?", listOf("Sets the site to 1000px", "Matches the site width to the screen width", "Zooms in 200%", "Downloads more RAM"), 1),
                    QuizQuestion("In CSS, what is '@media' used for?", listOf("Playing videos", "Adding social media icons", "Applying styles based on screen size", "Linking images"), 2)
                )
            ),
            Subtopic(
                sutopicId = 53,
                subTopicName = "Optimized Script Loading",
                headlines = listOf(
                    Headline(
                        majorHeadline = "The 'End of Body' Rule",
                        explaination = "Browsers stop loading the page when they see a <script> tag. To prevent a blank screen while the JS loads, professionals place scripts at the very end of the <body> or use the 'defer' keyword.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>
    <h1 id="header">Loading System...</h1>
    
    <p>The page structure is loaded before the heavy script starts.</p>

    <script>
        // The script can safely find 'header' because it was created above
        document.getElementById('header').innerText = "System Ready!";
        console.log("Script executed after HTML parsing.");
    </script>
</body>
</html>
            """.trimIndent(),
                        afterCodeEplainations = "If the script were in the <head>, it would try to change 'header' before it even existed, causing an error."
                    )
                ),
                questions = listOf(
                    QuizQuestion("Why put scripts at the end of the body?", listOf("To hide the code", "To allow the HTML to load first", "To make the text bold", "It is required by Linux"), 1),
                    QuizQuestion("What happens if a script in the <head> looks for a <body> element?", listOf("It works fine", "It will likely return 'null' or an error", "The browser crashes", "The computer restarts"), 1),
                    QuizQuestion("What modern attribute allows scripts in the <head> to run safely after loading?", listOf("wait", "slow", "defer", "stop"), 2)
                )
            ),
            Subtopic(
                sutopicId = 54,
                subTopicName = "Documentation & Indentation",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Writing Human-Readable Code",
                        explaination = "Computers don't care about spaces, but humans do! Clean code uses consistent indentation (2 or 4 spaces) and comments to explain *why* something was done, not just *what* was done.",
                        codeExample = """
<nav>
  <ul>
    <li><a href="index.html">Home</a></li>
    <li><a href="docs.html">Documentation</a></li>
  </ul>
</nav>

<script>
  /* Fetch server data every 5 seconds.
     Using a short interval for real-time monitoring.
  */
  setInterval(() => {
    // console.log("Fetching..."); 
  }, 5000);
</script>
            """.trimIndent(),
                        tip = "Treat your code like a README file; make it easy for the next developer to read."
                    )
                ),
                questions = listOf(
                    QuizQuestion("Why do we use indentation?", listOf("To make the file smaller", "To make code readable for humans", "To satisfy the compiler", "To hide errors"), 1),
                    QuizQuestion("How do you write a comment in HTML?", listOf("// Comment", "/* Comment */", "", "# Comment"), 2),
                    QuizQuestion("What is the purpose of a 'TODO' comment?", listOf("To run a function", "To mark code that needs to be finished later", "To delete the file", "To show the date"), 1)
                )
            )

            )
    ),

)















