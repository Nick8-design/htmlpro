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
  <h1>Hello, HTML! </h1>
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
  <h1>My Saved HTML File</h1>
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
    <h2>Live Preview </h2>
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

  <a href="https://facebook.com">This is a link</a>
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
      Here is a <a href="https://play.google.com/store/apps/details?id=com.nickdieda.ludo" target="_blank">link</a> too.
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
  <img src="f5.png" alt="Sample Image">

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
    <p>This card is visible </p>

    <!-- Disable this image if it causes problems -->
    <!-- <img src="broken-link.png" alt="Broken image"> -->

    <p>Even if the image is disabled, the page still works </p>
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
    <h2>Internal CSS </h2>
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
<img src="user.png" alt="Sample image">

</body>
</html>
""".trimIndent(),
                        tip = "Always use alt text. It helps accessibility and shows if image fails to load."
                    ),

                    Headline(
                        headline = "src (Image Source)",
                        explaination = "src tells the browser where the image is located (local file or web link).\nIn this it case image  is directly located in the same folder with the html file ",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<img src="f1.png" alt="Image from stored locally">

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

<img src="f.png" alt="This text appears if image fails.<br/> rename the f.png to f2.png">

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

<img src="f3.png"
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

<img src="red.png"
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

<img src="ludo.png"
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

<img src="f4.png"
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

<a href="https://nickdieda.web.app" target="_blank" >
  <img src="me.png" alt="Clickable you need internet image" style="width:200px; height:200px; border-radius:50%;">
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

<img src="https://unsplash.com/photos/an-aerial-view-of-a-forest-with-a-sunset-in-the-background-usset0gFU2U"
     alt="Web image"
     style="width:180px;border-radius:12px;">

</body>https://unsplash.com/photos/an-aerial-view-of-a-forest-with-a-sunset-in-the-background-usset0gFU2U
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
  <tr><td>Nick</td><td>Tables</td><td>Done </td></tr>
  <tr><td>Anna</td><td>Images</td><td>Learning </td></tr>
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
  result.innerHTML = "Welcome, " + u.value + " ";
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
    "Submitted (" + val.length + " chars):<br>" + val;
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
    "Submitted value: <b>" + value + "</b>";
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

Text help
• placeholder → shows a hint text inside input
• autocomplete → browser suggests saved values
• autocapitalize → controls automatic capitalization (mostly mobile)

 Validation (stops wrong data)
• required → must be filled before submit
• minlength / maxlength → minimum/maximum characters
• min / max → minimum/maximum value (number/date/range)
• pattern → must match a specific format (like phone/email rules)

 Behavior / access
• readonly → user cannot change, but can copy
• disabled → user cannot use + not submitted
• autofocus → focuses the input automatically
• multiple → select many files / many emails (depending on input type)
• spellcheck → checks spelling (on/off)

 Textarea special
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
  document.getElementById("out").innerHTML = "Form submitted successfully!";
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
  document.getElementById("out").innerHTML = "Saved: <b>" + name + "</b>";
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
    "Submitted! (Disabled field was not submitted.)";
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
  alert(" Your age is: " + v);
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
  document.getElementById("out").innerText = " Password accepted (demo).";
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
  document.getElementById("out").innerText = "Phone format is valid!";
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
  document.getElementById("out").innerText = " Email provided!";
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
• readonly → submitted 
• disabled → not submitted 
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
    " readonly submits, disabled does not.";
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
  document.getElementById("out").innerText = " Placeholder is just a hint.";
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

1) <button>Click</button>   Best for most cases (can contain text, icons, HTML)
2) <input type="button|submit|reset">  Simple button input

Most important idea:
A button can be used to run JavaScript
A button can submit a form
A button can reset a form
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
  document.getElementById("out").innerText = " You clicked a button!";
}
function submitForm(e){
  e.preventDefault();
  document.getElementById("out").innerText = "Form submitted (demo).";
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
    document.getElementById("out").innerText = "Please type your name first.";
  } else {
    document.getElementById("out").innerHTML = " Saved: <b>" + name + "</b>";
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
    ok ? "Access granted!" : " Please tick the checkbox first.";
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

 type (VERY IMPORTANT)
• type="button" → normal button (does not submit)
• type="submit" → submits a form
• type="reset" → clears form inputs

 disabled
• disables the button (cannot click)

 name + value (mostly for forms)
• sent to the server when submitting

 id / class
• used for styling and JavaScript selection

 title
• tooltip text when you hover

 onclick
• quick way to run JavaScript

form (advanced)
• allows a button to submit a form even if button is outside the form

formaction / formmethod / formtarget (advanced)
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
  document.getElementById("out").innerHTML = " Submitted username: <b>" + u + "</b>";
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
  document.getElementById("out").innerText = " Button enabled and clicked!";
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
  document.getElementById("out").innerText = " Submitted using outside button!";
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
msg.innerHTML="Welcome "+n.value+" ";
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
                subTopicName = "Subscript Text (<sub>)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "Subscript Text",
                        explaination = "Subscript means small text that sits a little lower than normal text. "
                                + "In HTML, we use the <sub> tag. It is mostly used in chemistry formulas**, "
                                + "math, and footnote-style writing.\n\n"
                                + "Tag used: <sub> ... </sub>",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Subscript Example</h2>

<p>Water is written as H<sub>2</sub>O</p>
<p>Carbon dioxide is CO<sub>2</sub></p>

</body>
</html>
""".trimIndent(),
                        tip = "Use <sub> for chemistry formulas like H₂O and CO₂. Do NOT use it just to make text small—use CSS for styling."
                    ),

                    Headline(
                        headline = "Subscript in Real Life (Science + Math)",
                        explaination = "Subscript is common in science formulas and sometimes in **math** to show indexes. "
                                + "For example: X<sub>1</sub>, X<sub>2</sub> can mean the first and second values.\n\n"
                                + "This example also shows a tiny JS interaction: click a button and it builds a formula using subscript.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Build a Chemical Formula</h2>

<p id="result">Click to show glucose formula</p>
<button onclick="showFormula()">Show Formula</button>

<script>
function showFormula(){
  document.getElementById("result").innerHTML =
    "Glucose is C<sub>6</sub>H<sub>12</sub>O<sub>6</sub>";
}
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "We used innerHTML so the <sub> tags can be displayed as real subscript. If we used textContent, it would show the tags as plain text."
                    ),

                    Headline(
                        headline = "Subscript + Styling (Clean Look)",
                        explaination = "You can style subscript using CSS if you want it to look clearer. "
                                + "This is useful when you want the subscript to be slightly bigger or different color.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  sub{
    color: green;
    font-size: 0.9em;
  }
</style>
</head>
<body>

<h2>Styled Subscript</h2>
<p>Nitrogen gas is N<sub>2</sub></p>
<p>Index values: A<sub>1</sub>, A<sub>2</sub>, A<sub>3</sub></p>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "By default, browsers make <sub> smaller. Here we changed the color and font size slightly."
                    )
                ),

                questions = listOf(
                    QuizQuestion("Which HTML tag is used for subscript text?", listOf("<small>", "<sub>", "<sup>", "<down>"), 1),
                    QuizQuestion("Which example correctly writes water using subscript?", listOf("H2O", "H<sub>2</sub>O", "H<sup>2</sup>O", "H_(2)O"), 1),
                    QuizQuestion("Subscript text usually appears…", listOf("Above normal text", "Below normal text", "On the left side", "Inside a comment"), 1),
                    QuizQuestion("Where is <sub> commonly used?", listOf("Chemistry formulas", "Making text bold", "Creating links", "Adding images"), 0),
                    QuizQuestion("Which JS property allows <sub> tags to render as HTML?", listOf("textContent", "innerHTML", "value", "style"), 1),
                    QuizQuestion("What is a bad use of <sub>?", listOf("H<sub>2</sub>O", "CO<sub>2</sub>", "To shrink any random text", "X<sub>1</sub> in math"), 2)
                )
            ),
            Subtopic(
                sutopicId = 46,
                subTopicName = "Superscript Text (<sup>)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "Superscript Text",
                        explaination = "Superscript means small text that sits a little higher than normal text. "
                                + "In HTML, we use the <sup> tag. It is mostly used for **powers (exponents), "
                                + "math expressions, and footnote numbers.\n\n"
                                + "Tag used: <sup> ... </sup>",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Superscript Example</h2>

<p>2<sup>3</sup> = 8</p>
<p>10<sup>2</sup> = 100</p>
<p>This is a note<sup>1</sup></p>

</body>
</html>
""".trimIndent(),
                        tip = "Use <sup> for powers like x² or for footnotes like note¹. Avoid using it just for decoration."
                    ),

                    Headline(
                        headline = "Superscript for Exponents (Math)",
                        explaination = "In mathematics, superscript is used to show **powers**. "
                                + "Example: x<sup>2</sup> means x squared.\n\n"
                                + "This example includes a small JS calculator for squares and cubes.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Square & Cube Calculator</h2>

<input type="number" id="num" placeholder="Enter a number">
<button onclick="calc()">Calculate</button>

<p id="out"></p>

<script>
function calc(){
  const n = Number(document.getElementById("num").value);
  const square = n * n;
  const cube = n * n * n;

  document.getElementById("out").innerHTML =
    n + "<sup>2</sup> = " + square + "<br>" +
    n + "<sup>3</sup> = " + cube;
}
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "We used <sup>2</sup> and <sup>3</sup> to display powers clearly like real math."
                    ),

                    Headline(
                        headline = "Superscript for Footnotes (Like Books)",
                        explaination = "Superscript is also used for **footnote numbers** like in books and articles. "
                                + "A footnote is extra information shown at the bottom.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Footnote Example</h2>

<p>
HTML is the language of the web<sup>1</sup>.
</p>

<hr>

<p>
<sup>1</sup> HTML means HyperText Markup Language.
</p>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The <sup> tag makes the number look like a real footnote marker."
                    ),

                    Headline(
                        headline = "Superscript + Styling (Make it Pop)",
                        explaination = "You can style superscript using CSS to make it clearer or match your design.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  sup{
    color: purple;
    font-weight: bold;
  }
</style>
</head>
<body>

<h2>Styled Superscript</h2>

<p>Area: m<sup>2</sup></p>
<p>Volume: m<sup>3</sup></p>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Here we changed the color and made the superscript bold."
                    )
                ),

                questions = listOf(
                    QuizQuestion("Which HTML tag is used for superscript text?", listOf("<small>", "<sub>", "<sup>", "<up>"), 2),
                    QuizQuestion("Which example correctly writes 2 squared using superscript?", listOf("2^2", "2<sub>2</sub>", "2<sup>2</sup>", "2**2"), 2),
                    QuizQuestion("Superscript text usually appears…", listOf("Below normal text", "Above normal text", "Inside a button", "At the bottom of the page"), 1),
                    QuizQuestion("Where is <sup> commonly used?", listOf("Exponents and footnotes", "Images and videos", "Tables only", "Forms only"), 0),
                    QuizQuestion("What is a common real-life use of superscript?", listOf("H<sub>2</sub>O", "x<sup>2</sup>", "<p> tags", "<div> tags"), 1),
                    QuizQuestion("Which JS property allows <sup> tags to render as HTML?", listOf("textContent", "innerHTML", "value", "checked"), 1)
                )
            ),

            Subtopic(
                sutopicId = 47,
                subTopicName = "Preformatted Text (<pre>)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "Pre Element",
                        explaination = "The **<pre>** tag means **preformatted text**. It keeps:\n"
                                + "• spaces\n"
                                + "• tabs\n"
                                + "• line breaks\n\n"
                                + "So whatever you type inside <pre> appears **exactly the same** in the browser. "
                                + "It’s perfect for **code snippets**, **ASCII art**, and **logs**.\n\n"
                                + "Tag used: <pre> ... </pre>",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Pre Element (Keeps spacing)</h2>

<pre>
Name:     Nick
Course:   HTML
Status:   Learning 

This line stays on a new line.
And    extra    spaces    remain!
</pre>

</body>
</html>
""".trimIndent(),
                        tip = "Use <pre> when you want to display text exactly as typed (like code, terminal output, or ASCII art)."
                    ),

                    Headline(
                        headline = "Pre for Code Display (Nice Look + Copy)",
                        explaination = "A common use of <pre> is showing code in a readable way. "
                                + "Usually we combine **<pre> + <code>** and add a little CSS to look like a real code editor.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  pre {
    background: #111;
    color: #00ff88;
    padding: 12px;
    border-radius: 10px;
    overflow: auto;
    font-family: Consolas, monospace;
  }
</style>
</head>
<body>

<h2>Code Block using &lt;pre&gt; + &lt;code&gt;</h2>

<pre><code>
function greet(name){
  return "Hello " + name + "today is Feb 23 2025";
}

console.log(greet("Nick"));
</code></pre>

<p>Tip: This is how many tutorial websites show code.</p>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The <pre> keeps spacing and line breaks. The <code> tag tells the browser this content is code (semantic meaning)."
                    ),

                    Headline(
                        headline = "Amazing Example: Mini Terminal Output (Interactive)",
                        explaination = "This example makes <pre> feel like a **terminal**. "
                                + "Type a command and it prints output inside <pre>. (Works in any browser)",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  body { font-family: Arial, sans-serif; }
  #terminal {
    background: #0b0b0b;
    color: #00ff55;
    padding: 12px;
    border-radius: 10px;
    height: 200px;
    overflow-y: auto;
    font-family: Consolas, monospace;
  }
  input {
    width: 260px;
    padding: 8px;
  }
  button {
    padding: 8px 12px;
    cursor: pointer;
  }
</style>
</head>
<body>

<h2>Mini Terminal (Using &lt;pre&gt;)</h2>

<pre id="terminal">$ welcome
Type: help</pre>

<input id="cmd" placeholder="Type command e.g. help">
<button onclick="run()">Run</button>

<script>
function writeLine(text){
  const t = document.getElementById("terminal");
  t.textContent += "\\n" + text;
  t.scrollTop = t.scrollHeight;
}

function run(){
  const input = document.getElementById("cmd");
  const command = input.value.trim().toLowerCase();
  if(!command) return;

  writeLine("$ " + command);

  if(command === "help"){
    writeLine("Commands: help, date, clear, about");
  } else if(command === "date"){
    writeLine("Today: " + new Date().toString());
  } else if(command === "about"){
    writeLine("This terminal is built with <pre> ✅");
  } else if(command === "clear"){
    document.getElementById("terminal").textContent = "$ cleared";
  } else {
    writeLine("Unknown command ❌");
  }

  input.value = "";
}
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "We used textContent to keep it safe and show plain terminal text. <pre> keeps new lines exactly like a terminal."
                    )
                ),

                questions = listOf(
                    QuizQuestion("What does the <pre> tag do?", listOf("Makes text bold", "Keeps spaces and line breaks", "Adds an image", "Creates a link"), 1),
                    QuizQuestion("Which is a common use of <pre>?", listOf("Tables", "Code snippets", "Buttons", "Audio"), 1),
                    QuizQuestion("Inside <pre>, multiple spaces are…", listOf("Removed", "Converted to one space", "Kept exactly", "Turned into tabs"), 2),
                    QuizQuestion("Which combination is best for showing code?", listOf("<pre><code>", "<pre><img>", "<pre><a>", "<pre><b>"), 0),
                    QuizQuestion("Which tag gives semantic meaning that content is code?", listOf("<code>", "<pre>", "<p>", "<span>"), 0),
                    QuizQuestion("Why do tutorials style <pre> blocks?", listOf("To hide content", "To make code easier to read", "To break HTML", "To remove spaces"), 1)
                )
            ),

            Subtopic(
                sutopicId = 48,
                subTopicName = "Figures & Captions (<figure> + <figcaption>)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML Figures",
                        explaination = "The **<figure>** tag is used to wrap content like:\n"
                                + "• images\n"
                                + "• diagrams\n"
                                + "• code samples\n"
                                + "• charts\n\n"
                                + "Then **<figcaption>** gives a caption (small explanation) for that figure.\n\n"
                                + "✅ Tags used: <figure>, <figcaption>",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  figure{
    width: 320px;
    padding: 10px;
    border: 2px solid #ddd;
    border-radius: 12px;
    font-family: Arial, sans-serif;
  }
  figcaption{
    margin-top: 8px;
    font-size: 14px;
    color: #333;
  }
  .photo{
    width: 100%;
    height: 180px;
    border-radius: 10px;
    background: linear-gradient(135deg, #00c6ff, #0072ff);
    display: flex;
    align-items: center;
    justify-content: center;
    color: white;
    font-weight: bold;
  }
</style>
</head>
<body>

<h2>Figure Example</h2>

<figure>
  <div class="photo">Image Placeholder</div>
  <figcaption>Figure 1: A sample “image” with a caption.</figcaption>
</figure>

</body>
</html>
""".trimIndent(),
                        tip = "Use <figure> when the media can stand alone (like an image + caption). It improves page meaning and SEO."
                    ),

                    Headline(
                        headline = "Figure with a Real Image + Caption",
                        explaination = "Here is a real image example. If the image fails to load, the caption still explains what it was.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  figure{
    width: 340px;
    border: 1px solid #ccc;
    border-radius: 12px;
    padding: 10px;
    font-family: Arial, sans-serif;
  }
  img{
    width: 100%;
    border-radius: 10px;
    display: block;
  }
  figcaption{
    margin-top: 8px;
    color: #555;
    font-size: 14px;
  }
</style>
</head>
<body>

<h2>Figure + Image</h2>

<figure>
  <img src="https://picsum.photos/600/400" alt="Random landscape">
  <figcaption>Figure 2: Random image loaded from the internet + caption.</figcaption>
</figure>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The <alt> text is for accessibility. The <figcaption> explains the figure in normal reading."
                    ),

                    Headline(
                        headline = "Where Else Can Figure Be Used? (Code as a Figure)",
                        explaination = "Figure is not only for images. You can also use it for **code samples** with a caption.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  figure{ max-width: 520px; font-family: Arial, sans-serif; }
  pre{
    background: #111;
    color: #00ff99;
    padding: 12px;
    border-radius: 12px;
    overflow: auto;
  }
  figcaption{ margin-top: 6px; color: #666; }
</style>
</head>
<body>

<h2>Figure used for Code Sample</h2>

<figure>
  <pre><code>
let score = 90;
if(score >= 50){
  console.log("Pass ✅");
}else{
  console.log("Fail ❌");
}
  </code></pre>
  <figcaption>Figure 3: A JavaScript code example with a caption.</figcaption>
</figure>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "This is great for tutorials: learners see a code block and a caption explaining what it does."
                    ),

                    Headline(
                        headline = "Amazing Example: Click-to-Change Caption (Interactive)",
                        explaination = "This example uses JS to change the caption when you click the figure.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  figure{
    width: 340px;
    border: 2px solid #eee;
    border-radius: 12px;
    padding: 10px;
    cursor: pointer;
    font-family: Arial, sans-serif;
    user-select: none;
  }
  .box{
    height: 180px;
    border-radius: 10px;
    background: linear-gradient(135deg, orange, purple);
  }
  figcaption{ margin-top: 8px; color: #333; }
</style>
</head>
<body>

<h2>Interactive Figure</h2>

<figure id="fig">
  <div class="box"></div>
  <figcaption id="cap">Click the figure to change this caption 👇</figcaption>
</figure>

<script>
let state = 0;
document.getElementById("fig").addEventListener("click", () => {
  const cap = document.getElementById("cap");
  state++;
  if(state % 3 === 1){
    cap.textContent = "Nice! Captions can describe images clearly ";
  }else if(state % 3 === 2){
    cap.textContent = "Figures can also hold code blocks or diagrams ";
  }else{
    cap.textContent = "Click again to cycle captions ";
  }
});
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "A figure can be interactive too. Here we attached a click event to the <figure> element."
                    )
                ),

                questions = listOf(
                    QuizQuestion("Which tag is used to wrap media + caption?", listOf("<img>", "<figure>", "<section>", "<caption>"), 1),
                    QuizQuestion("Which tag is used to write the caption of a figure?", listOf("<caption>", "<figcaption>", "<legend>", "<label>"), 1),
                    QuizQuestion("Figure is only for images. True or False?", listOf("True", "False"), 1),
                    QuizQuestion("Why is <figure> useful?", listOf("It makes images download faster", "It groups media with a description", "It removes the need for CSS", "It replaces <div> everywhere"), 1),
                    QuizQuestion("Which is a good use of <figcaption>?", listOf("A caption explaining a chart", "A button click event", "A video codec", "A form method"), 0),
                    QuizQuestion("What should an <img> inside a figure also have?", listOf("method", "alt text", "href", "target"), 1)
                )
            ),

            Subtopic(
                sutopicId = 41,
                subTopicName = "Editable Content (contenteditable)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "Editable",
                        explaination = "Normally, text on a webpage cannot be edited by the user. "
                                + "But HTML gives us **contenteditable** which makes an element editable like a mini text editor.\n\n"
                                + "✅ Attribute used: contenteditable=\"true\"\n"
                                + "You can use it on: <div>, <p>, <h1>, <span>, and more.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Editable Text</h2>

<p contenteditable="true">
  Click here and start typing... 
</p>

</body>
</html>
""".trimIndent(),
                        tip = "Great for notes apps, comment boxes, and simple editors. But for real forms, still use <input> and <textarea>."
                    ),

                    Headline(
                        headline = "Attribute contenteditable (With vs Without)",
                        explaination = "This example shows the difference between a normal paragraph and an editable one.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  .box{
    border: 2px solid #ddd;
    padding: 10px;
    border-radius: 10px;
    margin-bottom: 10px;
    font-family: Arial, sans-serif;
  }
</style>
</head>
<body>

<h2>With and Without contenteditable</h2>

<div class="box">
  <b>Normal:</b>
  <p>This text cannot be edited.</p>
</div>

<div class="box">
  <b>Editable:</b>
  <p contenteditable="true">Edit me! Try typing here </p>
</div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Only the second paragraph is editable because it has contenteditable=\"true\"."
                    ),

                    Headline(
                        headline = "Caret Color (Cursor Color)",
                        explaination = "The blinking text cursor is called the **caret**. "
                                + "You can change its color using CSS property: **caret-color**.\n\n"
                                + "This makes your editable area look more professional.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  .editor{
    border: 2px solid #ccc;
    padding: 12px;
    border-radius: 12px;
    min-height: 80px;
    font-family: Arial, sans-serif;
    caret-color: red;   /* caret color */
  }

  .editor:focus{
    border-color: #0077ff;
  }
</style>
</head>
<body>

<h2>Caret Color Example</h2>

<div class="editor" contenteditable="true">
  Click here... the cursor will be RED 🔴
</div>

<hr>

<div class="editor" style="caret-color: green;" contenteditable="true">
  This one has a GREEN cursor 🟢
</div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "caret-color changes only the blinking cursor color, not the text color."
                    ),

                    Headline(
                        headline = "Remove Outline (Cleaner Focus Look)",
                        explaination = "When an element is focused, browsers often show an outline. "
                                + "You can remove it with CSS. But be careful: outlines help keyboard users.\n\n"
                                + "Best practice: remove the outline, then add a nice border or shadow on focus.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  .editor{
    border: 2px solid #bbb;
    padding: 12px;
    border-radius: 12px;
    min-height: 80px;
    outline: none; /* remove default outline */
    font-family: Arial, sans-serif;
  }

  .editor:focus{
    border-color: #00aa88;
    box-shadow: 0 0 0 4px rgba(0,170,136,0.2);
  }
</style>
</head>
<body>

<h2>Remove Outline + Nice Focus Style</h2>

<div class="editor" contenteditable="true">
  Click here. No ugly outline — but still a clear focus effect 
</div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "We removed the outline, but added a focus border + shadow so users still know where they are typing."
                    ),

                    Headline(
                        headline = "Amazing Example: Mini Notes App (Save + Clear)",
                        explaination = "This is an interactive mini notes app using contenteditable. "
                                + "It can **save** your text in the browser (localStorage) and restore it when you reload.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
<style>
  body{ font-family: Arial, sans-serif; }
  .editor{
    border: 2px solid #ddd;
    padding: 12px;
    border-radius: 12px;
    min-height: 120px;
    outline: none;
    caret-color: #0077ff;
  }
  button{
    padding: 10px 12px;
    margin-right: 8px;
    cursor: pointer;
  }
  .hint{ color: #666; font-size: 13px; }
</style>
</head>
<body>

<h2>Mini Notes App (contenteditable)</h2>

<div id="note" class="editor" contenteditable="true"></div>
<p class="hint">Tip: Write something, click Save, refresh the page — it will still be there </p>

<button onclick="saveNote()">Save</button>
<button onclick="clearNote()">Clear</button>

<p id="msg"></p>

<script>
const note = document.getElementById("note");
const msg = document.getElementById("msg");

// Load saved note
note.innerHTML = localStorage.getItem("myNote") || "Start typing your notes here... ";

function saveNote(){
  localStorage.setItem("myNote", note.innerHTML);
  msg.textContent = "Saved ";
}

function clearNote(){
  note.innerHTML = "";
  localStorage.removeItem("myNote");
  msg.textContent = "Cleared ";
}
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "localStorage saves data in the browser. This makes your editable text stay even after refreshing."
                    ),

                    Headline(
                        headline = "Extra Tip: Make It Read-Only Again",
                        explaination = "You can turn editing ON and OFF using JavaScript by changing contentEditable.",
                        codeExample = """
<!DOCTYPE html>
<html>
<body>

<h2>Toggle Editable Mode</h2>

<div id="box" contenteditable="true" style="border:2px solid #ccc; padding:10px; border-radius:10px;">
  You can edit me now...
</div>

<button onclick="toggleEdit()">Toggle Edit</button>

<script>
let editable = true;

function toggleEdit(){
  editable = !editable;
  const box = document.getElementById("box");
  box.contentEditable = editable;
  box.style.background = editable ? "#ffffff" : "#f2f2f2";
  box.innerText = editable ? "Editing ON " : "Editing OFF ";
}
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "contentEditable can be changed at runtime. Great for “Edit / Save” style features."
                    )
                ),

                questions = listOf(
                    QuizQuestion("What does contenteditable do?", listOf("Makes text bold", "Makes an element editable", "Adds a caption", "Creates a link"), 1),
                    QuizQuestion("Which is correct to make a <div> editable?", listOf("editable=true", "contenteditable=true", "contenteditable=\"true\"", "edit=\"on\""), 2),
                    QuizQuestion("What is the caret?", listOf("A button style", "The blinking text cursor", "A form method", "A tag"), 1),
                    QuizQuestion("Which CSS property changes cursor color in typing areas?", listOf("cursor-color", "caret-color", "text-caret", "pointer-color"), 1),
                    QuizQuestion("If you remove outline, what is best practice?", listOf("Do nothing", "Add a nice focus border/shadow", "Remove all borders too", "Disable the element"), 1),
                    QuizQuestion("Which feature can save notes even after refresh?", listOf("alert()", "localStorage", "console.log()", "href"), 1),
                    QuizQuestion("contenteditable is best replacement for <input> always. True/False?", listOf("True", "False"), 1)
                )
            ),

            Subtopic(
                sutopicId = 42,
                subTopicName = "HTML Meta Tag (Page Info & Settings)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML Meta",
                        majorHeadileExplanation = "The **<meta>** tag gives the browser (and search engines) **information about the page**.\n\n"
                                + " **Tag used:** <meta>\n"
                                + " **Where it is placed:** inside the **<head>** section (not inside <body>)\n\n"
                                + "### Why we use meta\n"
                                + "• Set character encoding (UTF-8)\n"
                                + "• Make pages responsive (viewport)\n"
                                + "• Add SEO info (description)\n"
                                + "• Control some browser behaviors (http-equiv)\n\n"
                                + " Meta tags usually don’t show on the page, but they affect how the page works.",
                        tip = "Always include: charset + viewport. They prevent many weird display issues on phones.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Meta Basics</title>
</head>
<body>
  <h1>Meta Tag Example </h1>
  <p>This page uses charset + viewport meta tags.</p>
</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Attribute http-equiv",
                        explaination = "**http-equiv** tells the browser to treat a meta tag like a mini HTTP header.\n\n"
                                + "Common beginner-friendly examples:\n"
                                + "• **refresh** → auto reload / redirect after seconds\n"
                                + "• **content-security-policy (CSP)** → security rules (advanced)\n\n"
                                + "  Format:\n"
                                + "<meta http-equiv=\"...\" content=\"...\">",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <!-- Refresh page every 5 seconds -->
  <meta http-equiv="refresh" content="5">
  <title>http-equiv Refresh</title>
</head>
<body>
  <h2>Auto Refresh Demo </h2>
  <p>This page refreshes every <b>5 seconds</b>.</p>
  <p>Try changing 5 to 2 or 10.</p>
</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Attribute name",
                        explaination = "The **name** attribute tells what type of information the meta tag is about.\n\n"
                                + "Common **name** values:\n"
                                + "• description\n"
                                + "• author\n"
                                + "• keywords (not very important today, but still seen)\n"
                                + "• theme-color (changes browser top color on mobile)\n\n"
                                + "  Format:\n"
                                + "<meta name=\"description\" content=\"...\">",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="description" content="A simple HTML learning page about meta tags.">
  <meta name="author" content="Nick">
  <meta name="theme-color" content="#00aa88">
  <title>Meta name Example</title>
</head>
<body>
  <h2>Meta name Demo </h2>
  <p>Open page source to see the meta tags in the head.</p>
</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Attribute content",
                        explaination = "**content** holds the actual value/details for the meta tag.\n\n"
                                + "Examples:\n"
                                + "• For description → content is the description text\n"
                                + "• For refresh → content is seconds (or seconds;url=...)\n"
                                + "• For viewport → content is responsive rules\n\n"
                                + "  Think of it like: **content = the data**",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">

  <!-- Here 'content' is the real info -->
  <meta name="description" content="Learn HTML meta tags with simple examples.">
  <meta http-equiv="refresh" content="10">
  <title>Meta content Example</title>
</head>
<body>
  <h2>Meta content Demo </h2>
  <p>This page refreshes after 10 seconds because of the meta content value.</p>
</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Making a Web Page Adaptable to Screen Sizes (Viewport)",
                        explaination = "This is the MOST important meta tag for phones.\n\n"
                                + "  Without viewport: the phone may pretend your page is very wide, making text tiny.\n"
                                + "  With viewport: the page fits the real device width.\n\n"
                                + "Use this in almost every website:\n"
                                + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Viewport Demo</title>

  <style>
    body { font-family: Arial, sans-serif; margin: 0; padding: 16px; }
    .card { border: 2px solid #ddd; border-radius: 12px; padding: 14px; }
    .row { display: flex; gap: 12px; }
    .box { flex: 1; padding: 16px; border-radius: 10px; background: #f3f3f3; }

    /* This changes layout on small screens */
    @media (max-width: 600px) {
      .row { flex-direction: column; }
    }
  </style>
</head>
<body>

<h2>Responsive Layout ✅</h2>
<div class="card">
  <p>Resize the browser window (or open on phone).</p>
  <div class="row">
    <div class="box">Box 1</div>
    <div class="box">Box 2</div>
  </div>
</div>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        explaination = " Test it yourself:\n"
                                + "1) Run the code below\n"
                                + "2) Then **remove the viewport meta line**\n"
                                + "3) Open on phone (or use DevTools device mode) and see the difference.\n\n"
                                + "With viewport: text fits nicely.\n"
                                + "Without viewport: layout may look zoomed out / tiny.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">

  <!--  COMMENT THIS LINE OUT to see the difference -->
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <title>Viewport Test</title>
  <style>
    body { font-family: Arial, sans-serif; padding: 16px; }
    .banner {
      padding: 14px;
      border-radius: 12px;
      background: linear-gradient(135deg, #00c6ff, #0072ff);
      color: white;
      font-weight: bold;
    }
    .big {
      margin-top: 12px;
      font-size: 22px;
    }
  </style>
</head>
<body>

<div class="banner">Viewport ON  (try removing it!)</div>
<p class="big">This text should be readable on mobile.</p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "SEO / Search Engine Optimization (Meta Description)",
                        explaination = "Meta tags help search engines understand your page.\n\n"
                                + "The most useful for beginners:\n"
                                + "• **title** (not meta, but super important)\n"
                                + "• **meta description** (often shown in search results)\n\n"
                                + "Tip: keep description clear and not too long.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Learn HTML Meta Tags</title>

  <meta name="description" content="Learn HTML meta tags with easy examples: charset, viewport, SEO description, and more.">
  <meta name="author" content="Nick">
</head>
<body>
  <h2>SEO Meta Example </h2>
  <p>The description is for search engines, not for showing on the page.</p>
</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Extra: Social Sharing Preview (Open Graph)",
                        explaination = "When you share a link on WhatsApp, Facebook, Twitter/X, etc. a preview can appear.\n\n"
                                + "Open Graph meta tags help control that preview (title, image, description).",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Open Graph Demo</title>

  <!-- Open Graph (social sharing) -->
  <meta property="og:title" content="My HTML Learning App">
  <meta property="og:description" content="Simple lessons + runnable examples inside the app.">
  <meta property="og:type" content="website">
</head>
<body>
  <h2>Open Graph Meta ✅</h2>
  <p>These tags are used when sharing links on social platforms.</p>
</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Some platforms use these tags to build the link preview card."
                    )
                ),

                questions = listOf(
                    QuizQuestion("Where is the <meta> tag placed?", listOf("Inside <body>", "Inside <head>", "Inside <footer>", "Inside <section>"), 1),
                    QuizQuestion("Which meta tag makes a page responsive on phones?", listOf("charset", "viewport", "author", "refresh"), 1),
                    QuizQuestion("What does the content attribute hold?", listOf("The tag name", "The main value/information", "A CSS style", "A JavaScript function"), 1),
                    QuizQuestion("http-equiv is used to…", listOf("Add a button", "Act like an HTTP header instruction", "Create a link", "Style text"), 1),
                    QuizQuestion("Which meta name is commonly used for SEO snippet text?", listOf("description", "refresh", "viewport", "charset"), 0),
                    QuizQuestion("What is a common charset value?", listOf("UTF-8", "HTML-5", "CSS-3", "HTTP-2"), 0)
                )
            ),

            Subtopic(
                sutopicId = 43,
                subTopicName = "HTML Blockquote (Quotations)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML Blockquote",
                        majorHeadileExplanation = "The **<blockquote>** tag is for quoting a **long section of text** from another source.\n\n"
                                + "Tag used: <blockquote> ... </blockquote>\n"
                                + "It usually displays as an indented block.\n\n"
                                + "For short quotes inside a sentence, use **<q>** instead.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Blockquote Demo</title>
  <style>
    blockquote{
      border-left: 5px solid #0077ff;
      padding: 10px 14px;
      margin: 12px 0;
      background: #f3f7ff;
      border-radius: 10px;
      font-family: Arial, sans-serif;
    }
  </style>
</head>
<body>

<h2>Blockquote Example</h2>

<blockquote>
  Learning HTML is like building a house: start with structure, then style, then add logic.
</blockquote>

<p>That quote is inside a <b>blockquote</b>.</p>

</body>
</html>
""".trimIndent(),
                        tip = "Use blockquote only for real quotes. Don’t use it just to indent text."
                    ),

                    Headline(
                        headline = "Attribute cite and <cite> element",
                        explaination = "• **cite attribute**: stores the source URL (not shown on the page by default)\n"
                                + "• **<cite> element**: shows the name of a work/source (book, website, article)\n\n"
                                + "  You can show the source nicely using <cite> below the quote.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Cite Demo</title>
  <style>
    blockquote{
      border-left: 5px solid #00aa88;
      padding: 10px 14px;
      background: #f2fffb;
      border-radius: 10px;
      font-family: Arial, sans-serif;
    }
    .source{ margin-top: 6px; color: #444; font-family: Arial, sans-serif; }
  </style>
</head>
<body>

<h2>Blockquote + cite + &lt;cite&gt;</h2>

<blockquote cite="https://example.com/article">
  “Good code is written for humans first, computers second.”
</blockquote>

<div class="source">— Source: <cite>Example Article</cite></div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "The cite attribute holds the source link, while <cite> is visible to the user."
                    ),

                    Headline(
                        headline = "Extra: Inline Quote (<q>) vs Blockquote",
                        explaination = "Use **<q>** for short quotes inside a sentence. The browser often adds quotation marks automatically.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>q vs blockquote</title>
</head>
<body>

<p>Teacher said: <q>Practice daily</q> and you will improve.</p>

<blockquote>
  This is a longer quote that deserves its own block.
</blockquote>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "<q> is inline (inside text). <blockquote> is a block (new section)."
                    )
                ),

                questions = listOf(
                    QuizQuestion("Which tag is used for a long quote block?", listOf("<q>", "<blockquote>", "<quote>", "<p>"), 1),
                    QuizQuestion("Which tag is used for short inline quotes?", listOf("<q>", "<blockquote>", "<cite>", "<em>"), 0),
                    QuizQuestion("What is the cite attribute used for?", listOf("Text color", "Storing the quote source URL", "Adding a title", "Making text bold"), 1),
                    QuizQuestion("What does the <cite> tag usually represent?", listOf("A button", "A work/source name", "A form field", "An image"), 1),
                    QuizQuestion("Blockquote is best used for…", listOf("Indenting random text", "Quoting content from a source", "Making headings", "Creating links"), 1)
                )
            ),

            Subtopic(
                sutopicId = 44,
                subTopicName = "Non-Breaking Space (&nbsp;)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML nbsp",
                        majorHeadileExplanation = "**&nbsp;** means **Non-Breaking Space**.\n\n"
                                + "In HTML, extra spaces are normally **collapsed** into one space.\n"
                                + "&nbsp; helps when you want:\n"
                                + "• extra visible spacing (small)\n"
                                + "• to stop a line break between words\n\n"
                                + " It is written as: &nbsp;",
                        tip = "Don’t use &nbsp; for big layout spacing. Use CSS (margin/padding) instead.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>nbsp Demo</title>
</head>
<body>

<h2>Space Collapsing vs &amp;nbsp;</h2>

<p>Normal spaces: A     B     C (looks like A B C)</p>

<p>With &amp;nbsp;: A&nbsp;&nbsp;&nbsp;&nbsp;B&nbsp;&nbsp;&nbsp;&nbsp;C (spaces stay visible)</p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Prevent Line Breaks (Very Useful!)",
                        explaination = "&nbsp; is often used to keep two words together on the same line.\n\n"
                                + "Example: names, titles, phone numbers, or “KSh 1,000”.\n"
                                + "Without &nbsp;, the browser may break the line in the middle on small screens.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>No Break Demo</title>
  <style>
    .box{
      width: 180px; /* small box to force wrapping */
      border: 2px solid #ddd;
      padding: 10px;
      border-radius: 10px;
      font-family: Arial, sans-serif;
    }
  </style>
</head>
<body>

<h2>Line Break Test</h2>

<div class="box">
  <p>Normal: John Doe</p>
  <p>With &amp;nbsp;: John&nbsp;Doe</p>

  <p>Normal price: KSh 1,000</p>
  <p>No break price: KSh&nbsp;1,000</p>
</div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "In the small box, the normal text might wrap, but the &nbsp; version tries to stay together."
                    ),

                    Headline(
                        headline = "Better Alternative for Spacing (Use CSS)",
                        explaination = "If your goal is spacing for layout, **CSS is the correct tool**.\n\n"
                                + "Use margin, padding, gap, or flexbox instead of many &nbsp; characters.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>CSS Spacing</title>
  <style>
    .row{
      display: flex;
      gap: 14px; /* clean spacing */
      font-family: Arial, sans-serif;
      align-items: center;
    }
    .tag{
      padding: 6px 10px;
      border-radius: 999px;
      background: #f2f2f2;
      border: 1px solid #ddd;
    }
  </style>
</head>
<body>

<h2>CSS spacing (recommended ✅)</h2>

<div class="row">
  <span class="tag">HTML</span>
  <span class="tag">CSS</span>
  <span class="tag">JavaScript</span>
</div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "This is cleaner, responsive, and easier to maintain than using many &nbsp; spaces."
                    )
                ),

                questions = listOf(
                    QuizQuestion("What does &nbsp; stand for?", listOf("New bold spacing", "Non-Breaking Space", "Next button space", "No border spacing"), 1),
                    QuizQuestion("What happens to many normal spaces in HTML?", listOf("They stay visible", "They collapse into one space", "They turn into tabs", "They become new lines"), 1),
                    QuizQuestion("&nbsp; is useful when you want to…", listOf("Force a line break", "Prevent a line break", "Create an image", "Run JavaScript"), 1),
                    QuizQuestion("Best tool for big spacing/layout is…", listOf("&nbsp;", "CSS (margin/padding/gap)", "<br>", "<hr>"), 1),
                    QuizQuestion("Which is safer for keeping a name together on small screens?", listOf("John Doe", "John&nbsp;Doe", "John<br>Doe", "John<hr>Doe"), 1)
                )
            ),




            Subtopic(
                sutopicId = 49,
                subTopicName = "HTML Character Entities (Special Symbols)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML Character Entity",
                        explaination =
                            "HTML character entities are **special codes** that let you display characters that:\n" +
                                    "• have special meaning in HTML (like < and >)\n" +
                                    "• are hard to type (©, €, ✓)\n" +
                                    "• are invisible but useful (non-breaking space)\n\n" +
                                    "### Why entities exist\n" +
                                    "• The browser might think **<tag>** is HTML, not text\n" +
                                    "• Some symbols are not on the keyboard\n\n" +
                                    "### 3 ways to write a special character\n" +
                                    "• **Named**: &lt;  (starts with & ends with ;)\n" +
                                    "• **Decimal**: &#60;\n" +
                                    "• **Hex**: &#x3C;\n\n" +
                                    "### Important rules (bullets)\n" +
                                    "• Entities always start with **&** and end with **;**\n" +
                                    "• Named entities are easier to read (like &amp;copy;)\n" +
                                    "• Numbers work even if you don’t remember the name",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Entities Basics</title>
</head>
<body>
  <h2>Entities Basics ✅</h2>

  <p>We must write &amp;lt; to show: &lt;</p>
  <p>We must write &amp;gt; to show: &gt;</p>
  <p>We must write &amp;amp; to show: &amp;</p>

  <p>Decimal form of &lt; is: &#60;</p>
  <p>Hex form of &lt; is: &#x3C;</p>
</body>
</html>
""".trimIndent(),
                        tip = "If you want to literally show HTML tags as text (like <h1>), always use &lt; and &gt;."
                    ),

                    Headline(
                        explaination = "Commonly used entities (10):\n" +
                                "• <  → &lt;  (less than)\n" +
                                "• >  → &gt;  (greater than)\n" +
                                "• &  → &amp; (ampersand)\n" +
                                "• \" → &quot; (double quote)\n" +
                                "• '  → &apos; (apostrophe) *(works in HTML5)*\n" +
                                "• non-breaking space → &nbsp;\n" +
                                "• ©  → &copy;\n" +
                                "• ®  → &reg;\n" +
                                "• €  → &euro;\n" +
                                "• ✓  → &check; (check mark)\n\n" +
                                "Below is a runnable demo that shows them nicely.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>10 Common Entities</title>
  <style>
    body{font-family:Arial, sans-serif; padding:16px}
    table{border-collapse:collapse; width:100%; max-width:800px}
    th,td{border:1px solid #ddd; padding:10px; text-align:left}
    th{background:#f3f3f3}
    code{background:#f7f7ff; padding:2px 6px; border-radius:6px}
  </style>
</head>
<body>

<h2>10 Common HTML Entities </h2>

<table>
  <tr>
    <th>Symbol</th>
    <th>Entity</th>
    <th>What it means</th>
  </tr>

  <tr><td>&lt;</td><td><code>&amp;lt;</code></td><td>Less-than sign</td></tr>
  <tr><td>&gt;</td><td><code>&amp;gt;</code></td><td>Greater-than sign</td></tr>
  <tr><td>&amp;</td><td><code>&amp;amp;</code></td><td>Ampersand</td></tr>
  <tr><td>&quot;</td><td><code>&amp;quot;</code></td><td>Double quote</td></tr>
  <tr><td>&apos;</td><td><code>&amp;apos;</code></td><td>Apostrophe</td></tr>
  <tr><td>(space)</td><td><code>&amp;nbsp;</code></td><td>Non-breaking space</td></tr>
  <tr><td>&copy;</td><td><code>&amp;copy;</code></td><td>Copyright</td></tr>
  <tr><td>&reg;</td><td><code>&amp;reg;</code></td><td>Registered trademark</td></tr>
  <tr><td>&euro;</td><td><code>&amp;euro;</code></td><td>Euro currency</td></tr>
  <tr><td>&check;</td><td><code>&amp;check;</code></td><td>Check mark</td></tr>
</table>

<p>Notice: multiple spaces normally collapse, but A&nbsp;&nbsp;&nbsp;B stays spaced.</p>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations =
                            "Entities help you safely display special characters. The most important three are: &lt; &gt; &amp; because they prevent HTML from breaking."
                    ),

                    Headline(
                        headline = "Amazing Example: Safe “Mini Code Viewer” (Entities + Styling)",
                        explaination =
                            "This example shows a cool real-world use: displaying code on a webpage.\n\n" +
                                    "If you try to paste HTML code directly, the browser will treat it as real HTML.\n" +
                                    "So we use entities to show it as text (like in tutorials).",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Mini Code Viewer</title>
  <style>
    body{font-family:Arial, sans-serif; padding:16px}
    .card{
      max-width:850px;
      border:2px solid #e6e6e6;
      border-radius:14px;
      padding:14px;
      background:#fff;
    }
    pre{
      background:#0b1020;
      color:#e7e7ff;
      padding:14px;
      border-radius:12px;
      overflow:auto;
      line-height:1.4;
    }
    .tag{color:#7ee787}
    .attr{color:#79c0ff}
    .str{color:#ffa657}
    .btn{
      margin-top:10px;
      padding:10px 12px;
      border-radius:12px;
      border:0;
      background:#0072ff;
      color:white;
      font-weight:bold;
      cursor:pointer;
    }
  </style>
</head>
<body>

<h2>Mini Code Viewer </h2>

<div class="card">
  <p>This block shows HTML code safely using entities:</p>

  <pre id="codeBox">
&lt;<span class="tag">form</span> <span class="attr">action</span>=<span class="str">"/submit"</span>&gt;
  &lt;<span class="tag">label</span>&gt;Name:&lt;/<span class="tag">label</span>&gt;
  &lt;<span class="tag">input</span> <span class="attr">type</span>=<span class="str">"text"</span> <span class="attr">required</span>&gt;
  &lt;<span class="tag">button</span> <span class="attr">type</span>=<span class="str">"submit"</span>&gt;Send&lt;/<span class="tag">button</span>&gt;
&lt;/<span class="tag">form</span>&gt;
  </pre>

  <button class="btn" onclick="copyCode()">Copy Code</button>
  <p id="msg"></p>
</div>

<script>
function copyCode(){
  // Convert entities back to real text for copying
  const el = document.getElementById("codeBox");
  const temp = document.createElement("textarea");
  temp.value = el.innerText;
  document.body.appendChild(temp);
  temp.select();
  document.execCommand("copy");
  document.body.removeChild(temp);

  document.getElementById("msg").innerText = "Copied ✅ Now paste it anywhere!";
}
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations =
                            "This is exactly how many tutorial sites show code: they convert < and > into entities so it doesn’t break the page."
                    )
                ),

                questions = listOf(
                    QuizQuestion("Why do we use HTML entities?", listOf("To make HTML slower", "To display special characters safely", "To delete tags", "To run CSS"), 1),
                    QuizQuestion("Which entity displays an ampersand (&)?", listOf("&amp;lt;", "&amp;amp;", "&amp;gt;", "&amp;copy;"), 1),
                    QuizQuestion("What is the entity for the less-than sign (<)?", listOf("&amp;lt;", "&amp;gt;", "&amp;nbsp;", "&amp;quot;"), 0),
                    QuizQuestion("Which is the correct format of a named entity?", listOf("lt;", "&lt", "&lt;", "#lt;"), 2),
                    QuizQuestion("What does &nbsp; do?", listOf("Creates a new line", "Adds a non-breaking space", "Makes text bold", "Plays audio"), 1),
                    QuizQuestion("If you want to display <h1> as text, you should write:", listOf("<h1>", "&amp;h1;", "&amp;lt;h1&amp;gt;", "&amp;tag;h1"), 2)
                )
            ),

            Subtopic(
                sutopicId = 410,
                subTopicName = "HTML Audio (Sound on Web Pages)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "Audio",
                        explaination =
                            "The **<audio>** element is used to play sound in a web page.\n\n" +
                                    " Tag used: <audio> ... </audio>\n" +
                                    "Inside it you usually place **<source>** so the browser can choose the best audio format.\n\n" +
                                    "### Basic idea\n" +
                                    "• <audio> is the player\n" +
                                    "• <source> is the file(s)\n" +
                                    "• controls shows the play/pause UI",
                        tip = "Autoplay is often blocked by browsers unless the audio is muted or the user has interacted with the page.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Audio Basic</title>
</head>
<body>

<h2>Audio Basic </h2>

<audio controls>
  <source src="sound.mp3" type="audio/mpeg">
  <source src="sound.ogg" type="audio/ogg">
  Your browser does not support the audio element.
</audio>

<p>Tip: Replace <b>sound.mp3</b> with a real file path.</p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Architecture of the Audio Element",
                        explaination =
                            "Think of it like this:\n" +
                                    "• <audio> wraps everything (the player)\n" +
                                    "• attributes control behavior (controls, autoplay, loop...)\n" +
                                    "• <source> provides one or more audio files\n" +
                                    "• fallback text is shown if audio is not supported\n\n" +
                                    "Browsers try the first <source>. If it can’t play it, it tries the next.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Audio Architecture</title>
  <style>
    body{font-family:Arial, sans-serif; padding:16px}
    .card{max-width:700px; border:2px solid #e6e6e6; border-radius:14px; padding:14px}
    code{background:#f2f2ff; padding:2px 6px; border-radius:6px}
  </style>
</head>
<body>

<h2>Audio Architecture </h2>

<div class="card">
  <p><b>Player:</b> <code>&lt;audio&gt;</code></p>
  <p><b>Files:</b> <code>&lt;source&gt;</code></p>

  <audio controls preload="metadata">
    <source src="sound.mp3" type="audio/mpeg">
    <source src="sound.ogg" type="audio/ogg">
    Your browser does not support audio.
  </audio>

  <p style="margin-top:10px;">Open DevTools Console to see events:</p>
  <button onclick="document.getElementById('a').play()">Play (JS)</button>
</div>

<audio id="a" controls style="display:none">
  <source src="sound.mp3" type="audio/mpeg">
</audio>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "This shows the structure and that you can also control audio from JavaScript."
                    ),

                    Headline(
                        headline = "Audio Attributes (explained in bullets)",
                        explaination =
                            "Common <audio> attributes:\n" +
                                    "• **controls** → shows play/pause UI\n" +
                                    "• **autoplay** → starts automatically (often blocked)\n" +
                                    "• **loop** → repeats when finished\n" +
                                    "• **muted** → starts muted\n" +
                                    "• **preload** → tells browser how to load audio\n" +
                                    "   - none / metadata / auto\n\n" +
                                    "Also useful:\n" +
                                    "• **src** → you can put the file directly, but <source> is better for multiple formats.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Audio Attributes</title>
  <style>
    body{font-family:Arial, sans-serif; padding:16px}
    .row{display:flex; gap:14px; flex-wrap:wrap}
    .box{border:2px solid #ddd; border-radius:14px; padding:12px; width:320px}
    button{padding:10px 12px; border-radius:12px; border:0; background:#0072ff; color:#fff; cursor:pointer}
  </style>
</head>
<body>

<h2>Audio Attributes </h2>

<div class="row">
  <div class="box">
    <h3>1) controls</h3>
    <audio controls>
      <source src="sound.mp3" type="audio/mpeg">
    </audio>
  </div>

  <div class="box">
    <h3>2) loop + muted</h3>
    <audio controls loop muted>
      <source src="sound.mp3" type="audio/mpeg">
    </audio>
    <p style="font-size:13px;">Muted helps autoplay rules sometimes.</p>
  </div>
</div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Replace sound.mp3 with a real file. The second player loops forever."
                    ),

                    Headline(
                        headline = "Audio autoplay",
                        explaination =
                            "autoplay tries to start audio automatically.\n\n" +
                                    "  Most browsers block autoplay with sound to protect users.\n" +
                                    "  Autoplay is more likely to work if:\n" +
                                    "• audio is muted, or\n" +
                                    "• the user clicks something first (user interaction).",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Autoplay Demo</title>
</head>
<body>

<h2>Autoplay Demo (Usually Blocked) </h2>

<audio id="myAudio" controls autoplay>
  <source src="sound.mp3" type="audio/mpeg">
</audio>

<p>If it does not autoplay, click the button below:</p>
<button onclick="document.getElementById('myAudio').play()">Start Audio</button>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Audio loop",
                        explaination = "**loop** makes the audio start again automatically when it finishes.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Loop Demo</title>
</head>
<body>

<h2>Loop Demo </h2>

<audio controls loop>
  <source src="sound.mp3" type="audio/mpeg">
</audio>

<p>When the audio ends, it starts again.</p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Audio muted",
                        explaination = "**muted** starts the audio with sound off. The user can unmute using controls.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Muted Demo</title>
</head>
<body>

<h2>Muted Demo 🔇</h2>

<audio controls muted>
  <source src="sound.mp3" type="audio/mpeg">
</audio>

<p>Muted at start, user can unmute.</p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Audio controls",
                        explaination = "**controls** shows the default audio UI: play/pause, timeline, volume.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Controls Demo</title>
</head>
<body>

<h2>Controls Demo </h2>

<audio controls>
  <source src="sound.mp3" type="audio/mpeg">
</audio>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "<source>",
                        explaination =
                            "<source> lets you provide multiple formats.\n\n" +
                                    "Why?\n" +
                                    "• Some browsers support different formats.\n" +
                                    "• Browser tries the first it can play.\n\n" +
                                    "Use type= so the browser can quickly decide.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Source Demo</title>
</head>
<body>

<h2>Multiple Sources </h2>

<audio controls>
  <source src="sound.ogg" type="audio/ogg">
  <source src="sound.mp3" type="audio/mpeg">
  Sorry, your browser can't play this audio.
</audio>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Advance Audio (Play/Pause + Volume + Progress with JS)",
                        explaination =
                            "This example shows an amazing custom mini-player.\n\n" +
                                    "It uses JavaScript to:\n" +
                                    "• Play / Pause\n" +
                                    "• Change volume\n" +
                                    "• Show progress %",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Advanced Audio</title>
  <style>
    body{font-family:Arial, sans-serif; padding:16px}
    .player{max-width:520px; border:2px solid #e6e6e6; border-radius:16px; padding:14px}
    button{padding:10px 12px; border-radius:12px; border:0; background:#0072ff; color:#fff; cursor:pointer}
    input[type="range"]{width:100%}
    .row{display:flex; gap:10px; align-items:center}
    .small{color:#555; font-size:13px}
    .bar{height:10px; border-radius:999px; background:#eee; overflow:hidden}
    .fill{height:10px; width:0%; background:#00aa88}
  </style>
</head>
<body>

<h2>Advanced Audio Player </h2>

<div class="player">
  <audio id="aud" preload="metadata">
    <source src="sound.mp3" type="audio/mpeg">
  </audio>

  <div class="row">
    <button id="btn">Play</button>
    <span id="time" class="small">0:00</span>
  </div>

  <p class="small">Volume</p>
  <input id="vol" type="range" min="0" max="1" step="0.05" value="1">

  <p class="small">Progress</p>
  <div class="bar"><div id="fill" class="fill"></div></div>
  <p id="pct" class="small">0%</p>
</div>

<script>
const a = document.getElementById("aud");
const btn = document.getElementById("btn");
const vol = document.getElementById("vol");
const fill = document.getElementById("fill");
const pct = document.getElementById("pct");
const time = document.getElementById("time");

btn.addEventListener("click", async () => {
  if (a.paused) {
    try {
      await a.play();
      btn.textContent = "Pause";
    } catch (e) {
      alert("Autoplay blocked. Click play again after interacting.");
    }
  } else {
    a.pause();
    btn.textContent = "Play";
  }
});

vol.addEventListener("input", () => a.volume = vol.value);

a.addEventListener("timeupdate", () => {
  if (!a.duration) return;
  const p = (a.currentTime / a.duration) * 100;
  fill.style.width = p.toFixed(0) + "%";
  pct.textContent = p.toFixed(0) + "%";

  const mins = Math.floor(a.currentTime / 60);
  const secs = Math.floor(a.currentTime % 60).toString().padStart(2, "0");
  time.textContent = mins + ":" + secs;
});
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Replace sound.mp3 with a real file. The progress bar fills as the audio plays."
                    )
                ),

                questions = listOf(
                    QuizQuestion("Which tag is used to play audio in HTML?", listOf("<sound>", "<audio>", "<music>", "<mp3>"), 1),
                    QuizQuestion("Which attribute shows play controls?", listOf("show", "controls", "ui", "panel"), 1),
                    QuizQuestion("Why do we use <source> inside <audio>?", listOf("To add CSS", "To provide multiple audio formats", "To create buttons", "To set the background"), 1),
                    QuizQuestion("What does loop do?", listOf("Stops audio", "Repeats audio when it ends", "Makes audio faster", "Downloads audio"), 1),
                    QuizQuestion("Why is autoplay often blocked?", listOf("Because HTML is old", "Because browsers protect users from unexpected sound", "Because audio is not supported", "Because controls is missing"), 1),
                    QuizQuestion("What does muted do?", listOf("Makes audio louder", "Starts audio with sound off", "Deletes audio", "Adds captions"), 1)
                )
            ),

            Subtopic(
                sutopicId = 411,
                subTopicName = "HTML Video (Video on Web Pages)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "Video",
                        explaination =
                            "The **<video>** element is used to display videos in a web page.\n\n" +
                                    " Tag used: <video> ... </video>\n" +
                                    "Just like audio, we usually use <source> for multiple formats.\n\n" +
                                    "Most used attribute: **controls** (so users can play/pause).",
                        tip = "For autoplay to work on most browsers, use autoplay + muted (same rule as audio).",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Video Basic</title>
</head>
<body>

<h2>Video Basic </h2>

<video controls width="420">
  <source src="video.mp4" type="video/mp4">
  <source src="video.webm" type="video/webm">
  Your browser does not support the video tag.
</video>

<p>Replace video.mp4 with a real video file.</p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Architecture of the Video Element",
                        explaination =
                            "Structure:\n" +
                                    "• <video> is the player\n" +
                                    "• attributes control behavior (controls, autoplay, loop...)\n" +
                                    "• <source> provides video files\n" +
                                    "• fallback text shows if not supported",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Video Architecture</title>
  <style>
    body{font-family:Arial, sans-serif; padding:16px}
    .card{max-width:720px; border:2px solid #e6e6e6; border-radius:14px; padding:14px}
  </style>
</head>
<body>

<h2>Video Architecture </h2>

<div class="card">
  <video id="v" controls width="520" preload="metadata" poster="poster.jpg">
    <source src="video.webm" type="video/webm">
    <source src="video.mp4" type="video/mp4">
    Video not supported.
  </video>

  <p>Poster shows before play (replace poster.jpg).</p>
  <button onclick="document.getElementById('v').play()">Play with JS</button>
  <button onclick="document.getElementById('v').pause()">Pause with JS</button>
</div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "poster is the thumbnail image. preload=metadata loads only basic info first."
                    ),

                    Headline(
                        headline = "Video Attributes (explained in bullets)",
                        explaination =
                            "Common video attributes:\n" +
                                    "• **controls** → show UI\n" +
                                    "• **autoplay** → start automatically (often needs muted)\n" +
                                    "• **loop** → repeat forever\n" +
                                    "• **muted** → start with no sound\n" +
                                    "• **preload** → none / metadata / auto\n" +
                                    "• **poster** → image before video starts\n" +
                                    "• **width / height** → size\n\n" +
                                    "Bonus:\n" +
                                    "• **playsinline** → prevents full-screen auto on some phones",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Video Attributes</title>
  <style>
    body{font-family:Arial, sans-serif; padding:16px}
    .grid{display:flex; gap:14px; flex-wrap:wrap}
    .box{border:2px solid #ddd; border-radius:14px; padding:12px}
  </style>
</head>
<body>

<h2>Video Attributes ✅</h2>

<div class="grid">
  <div class="box">
    <h3>controls + poster</h3>
    <video controls width="360" poster="poster.jpg" preload="metadata">
      <source src="video.mp4" type="video/mp4">
    </video>
  </div>

  <div class="box">
    <h3>loop + muted</h3>
    <video controls width="360" loop muted preload="auto">
      <source src="video.mp4" type="video/mp4">
    </video>
  </div>
</div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Replace video.mp4 and poster.jpg with real files."
                    ),

                    Headline(
                        headline = "Video autoplay",
                        explaination =
                            "autoplay attempts to play the video automatically.\n\n" +
                                    " Most browsers block autoplay with sound.\n" +
                                    " Use autoplay + muted to increase the chance it works.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Autoplay Video</title>
</head>
<body>

<h2>Autoplay Video (muted) ✅</h2>

<video autoplay muted loop controls width="420">
  <source src="video.mp4" type="video/mp4">
</video>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Video loop",
                        explaination = "**loop** makes the video start again when it ends.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Loop Video</title>
</head>
<body>

<h2>Loop Video </h2>

<video controls loop width="420">
  <source src="video.mp4" type="video/mp4">
</video>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Video muted",
                        explaination = "**muted** starts the video with sound off (user can unmute).",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Muted Video</title>
</head>
<body>

<h2>Muted Video 🔇</h2>

<video controls muted width="420">
  <source src="video.mp4" type="video/mp4">
</video>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Video controls",
                        explaination = "**controls** shows video UI: play/pause, timeline, volume, fullscreen.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Controls Video</title>
</head>
<body>

<h2>Controls </h2>

<video controls width="420">
  <source src="video.mp4" type="video/mp4">
</video>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "<source>",
                        explaination =
                            "Use <source> to provide multiple formats and qualities.\n\n" +
                                    "Browser tries the first one it can play.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Multiple Sources</title>
</head>
<body>

<h2>Multiple Video Sources </h2>

<video controls width="420">
  <source src="video.webm" type="video/webm">
  <source src="video.mp4" type="video/mp4">
  Your browser can't play this video.
</video>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Advance Video (Custom Buttons + Progress with JS)",
                        explaination =
                            "This is a mini custom controller:\n" +
                                    "• Play / Pause\n" +
                                    "• Jump forward 10 seconds\n" +
                                    "• Show progress %\n\n" +
                                    "Great for teaching how video and JS connect.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Advanced Video</title>
  <style>
    body{font-family:Arial, sans-serif; padding:16px}
    .card{max-width:700px; border:2px solid #e6e6e6; border-radius:16px; padding:14px}
    button{padding:10px 12px; border-radius:12px; border:0; background:#0072ff; color:#fff; cursor:pointer; margin-right:8px}
    .bar{height:10px; border-radius:999px; background:#eee; overflow:hidden; margin-top:10px}
    .fill{height:10px; width:0%; background:#00aa88}
    .small{color:#555; font-size:13px}
  </style>
</head>
<body>

<h2>Advanced Video </h2>

<div class="card">
  <video id="vid" width="640" preload="metadata">
    <source src="video.mp4" type="video/mp4">
  </video>

  <div style="margin-top:10px;">
    <button id="playBtn">Play</button>
    <button onclick="skip10()">+10s</button>
    <span id="status" class="small">0%</span>
  </div>

  <div class="bar"><div id="fill" class="fill"></div></div>
</div>

<script>
const v = document.getElementById("vid");
const playBtn = document.getElementById("playBtn");
const fill = document.getElementById("fill");
const status = document.getElementById("status");

playBtn.addEventListener("click", async () => {
  if (v.paused) {
    try {
      await v.play();
      playBtn.textContent = "Pause";
    } catch (e) {
      alert("Playback blocked until user interacts. Try again.");
    }
  } else {
    v.pause();
    playBtn.textContent = "Play";
  }
});

function skip10(){
  v.currentTime = Math.min(v.currentTime + 10, v.duration || v.currentTime + 10);
}

v.addEventListener("timeupdate", () => {
  if (!v.duration) return;
  const p = (v.currentTime / v.duration) * 100;
  fill.style.width = p.toFixed(0) + "%";
  status.textContent = p.toFixed(0) + "%";
});
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "Replace video.mp4 with a real video. The progress bar fills as it plays."
                    ),

                    Headline(
                        headline = "Video loading metadata (preload)",
                        explaination =
                            "preload controls how the browser loads the video before play:\n" +
                                    "• **none** → don’t load until user presses play\n" +
                                    "• **metadata** → load only duration, size, basic info (recommended)\n" +
                                    "• **auto** → browser may load more data (uses more internet)\n\n" +
                                    "If you want to save data, use preload=\"metadata\" or \"none\".",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Preload Demo</title>
</head>
<body>

<h2>Preload Metadata ✅</h2>

<video controls width="420" preload="metadata">
  <source src="video.mp4" type="video/mp4">
</video>

<p>preload=metadata loads only basic info first (good for saving data).</p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Video loading decrease (Multiple Qualities for Slow Internet)",
                        explaination =
                            "To help users on slow internet, you can provide:\n" +
                                    "• **Low quality** video (smaller file) and\n" +
                                    "• **High quality** video (bigger file)\n\n" +
                                    "Then let the user choose.\n\n" +
                                    "This example shows a quality switcher using JS.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Quality Switch</title>
  <style>
    body{font-family:Arial, sans-serif; padding:16px}
    button{padding:10px 12px; border-radius:12px; border:0; background:#222; color:#fff; cursor:pointer; margin-right:8px}
    .hint{color:#555; font-size:13px}
  </style>
</head>
<body>

<h2>Video Quality Switch </h2>

<video id="video" controls width="520" preload="metadata">
  <source src="video-480p.mp4" type="video/mp4">
</video>

<p class="hint">
  Replace the file names with your real videos (example: video-480p.mp4 and video-1080p.mp4).
</p>

<button onclick="setQuality('video-480p.mp4')">480p (fast)</button>
<button onclick="setQuality('video-1080p.mp4')">1080p (clear)</button>

<script>
function setQuality(src){
  const v = document.getElementById("video");
  const wasPlaying = !v.paused;
  const time = v.currentTime;

  v.pause();
  v.src = src;      // switch file
  v.load();

  v.onloadedmetadata = async () => {
    v.currentTime = time;  // continue where user was
    if (wasPlaying) {
      try { await v.play(); } catch(e) {}
    }
  };
}
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations =
                            "This technique is simple and effective: users choose 480p for speed, or 1080p for quality. The code even tries to continue from the same time."
                    )
                ),

                questions = listOf(
                    QuizQuestion("Which tag is used to play video in HTML?", listOf("<movie>", "<media>", "<video>", "<clip>"), 2),
                    QuizQuestion("Which attribute shows the video controls?", listOf("controls", "visible", "showUI", "panel"), 0),
                    QuizQuestion("Which attribute sets an image before playing?", listOf("poster", "cover", "thumb", "icon"), 0),
                    QuizQuestion("Which preload value is best for saving data?", listOf("auto", "metadata", "full", "loadAll"), 1),
                    QuizQuestion("Why does autoplay often need muted?", listOf("Because muted makes video smaller", "Because browsers block autoplay with sound", "Because controls is missing", "Because of CSS"), 1),
                    QuizQuestion("What is the main reason to provide 480p and 1080p versions?", listOf("To change colors", "To support slow internet and fast internet users", "To remove controls", "To add subtitles"), 1)
                )
            ),


            Subtopic(
                sutopicId = 412,
                subTopicName = "Iframes (Embedding Content)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "Iframe",
                        explaination =
                            "An **iframe** (inline frame) is used to **display another page inside your page**.\n\n" +
                                    "Tag used: <iframe> ... </iframe>\n\n" +
                                    "### What it’s used for\n" +
                                    "• Embedding YouTube videos\n" +
                                    "• Embedding Google Maps\n" +
                                    "• Showing another HTML file inside a box\n\n" +
                                    " Important: Some websites block being embedded for security (you will see blank or an error).",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Iframe Simple</title>
</head>
<body>

<h2>Iframe Simple </h2>

<iframe src="https://example.com" width="420" height="220" title="Example Site"></iframe>

<p>If a site blocks embedding, try embedding your own page instead.</p>

</body>
</html>
""".trimIndent(),
                        tip = "For learning, embed **your own HTML page** (like page2.html) so it always works."
                    ),

                    Headline(
                        headline = "Architecture of the Iframe Element",
                        explaination =
                            "Think of an iframe like a **mini browser window** inside your page.\n\n" +
                                    "Structure:\n" +
                                    "• <iframe> is the container\n" +
                                    "• **src** = what to load inside it\n" +
                                    "• **width/height** = size\n" +
                                    "• **title** = accessibility (important!)\n\n" +
                                    "This example loads content using srcdoc (HTML written directly inside the iframe).",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Iframe Architecture</title>
  <style>
    body{font-family:Arial,sans-serif;padding:16px}
    iframe{border-radius:14px}
  </style>
</head>
<body>

<h2>Iframe = Mini Web Page </h2>

<iframe
  width="520"
  height="260"
  title="Mini page inside iframe"
  srcdoc="
    <html>
      <body style='font-family:Arial;padding:12px'>
        <h3>Hi from inside the iframe </h3>
        <p>This content is inside <b>srcdoc</b>.</p>
        <button onclick=&quot;document.body.style.background='lightyellow'&quot;>
          Change background
        </button>
      </body>
    </html>
  ">
</iframe>

<p>srcdoc lets you embed HTML directly without another file.</p>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations =
                            "The iframe loads a full mini HTML page using srcdoc. Clicking the button changes the iframe page background only."
                    ),

                    Headline(
                        headline = "Iframe vs Video Tag (Don’t Confuse Them)",
                        explaination =
                            "People often confuse **<iframe>** and **<video>**:\n\n" +
                                    "• **<video>** plays video files you own (mp4/webm).\n" +
                                    "• **<iframe>** embeds another website/app player (like YouTube).\n\n" +
                                    "This example shows them side-by-side.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Iframe vs Video</title>
  <style>
    body{font-family:Arial,sans-serif;padding:16px}
    .grid{display:flex;gap:14px;flex-wrap:wrap}
    .box{border:2px solid #ddd;border-radius:14px;padding:12px;width:420px}
    iframe, video{width:100%;height:240px;border-radius:12px}
  </style>
</head>
<body>

<h2>Iframe vs Video ✅</h2>

<div class="grid">
  <div class="box">
    <h3>Iframe (embeds another page)</h3>
    <iframe title="Example embed" src="https://example.com"></iframe>
  </div>

  <div class="box">
    <h3>Video (plays your file)</h3>
    <video controls>
      <source src="video.mp4" type="video/mp4">
      Your browser does not support the video tag.
    </video>
    <p style="font-size:13px;color:#555">Replace video.mp4 with a real file.</p>
  </div>
</div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations =
                            "Iframe shows another website/player. Video plays your own media file."
                    ),

                    Headline(
                        headline = "Iframe Attributes (Explained in Bullets)",
                        explaination =
                            "Common iframe attributes:\n" +
                                    "• **src** → URL or file path to load inside\n" +
                                    "• **srcdoc** → HTML string to show inside (no external file)\n" +
                                    "• **width / height** → size of iframe\n" +
                                    "• **title** → accessibility label (recommended)\n" +
                                    "• **name** → allows links/buttons to target this iframe\n" +
                                    "• **loading** → lazy / eager (lazy loads later)\n" +
                                    "• **allow** → permission rules (camera, autoplay, fullscreen)\n" +
                                    "• **sandbox** → security restrictions (very important)\n" +
                                    "   - e.g. sandbox blocks scripts unless you allow them\n\n" +
                                    "Below is a demo using loading and sandbox.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Iframe Attributes</title>
  <style>
    body{font-family:Arial,sans-serif;padding:16px}
    iframe{border:2px solid #ddd;border-radius:14px}
  </style>
</head>
<body>

<h2>Iframe Attributes ✅</h2>

<iframe
  title="Sandbox demo"
  width="520"
  height="220"
  loading="lazy"
  sandbox
  srcdoc="
    <html>
      <body style='font-family:Arial;padding:12px'>
        <h3>Sandboxed iframe 🔒</h3>
        <p>Scripts are blocked because sandbox is ON.</p>
        <button onclick=&quot;alert('Hi!')&quot;>Try Script</button>
      </body>
    </html>
  ">
</iframe>

<p style="color:#555;font-size:13px">
  With <b>sandbox</b>, the alert button won’t work because scripts are blocked.
</p>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations =
                            "sandbox improves security. It blocks scripts and some actions unless you allow them."
                    ),

                    Headline(
                        headline = "Iframe height and width Attributes",
                        explaination =
                            "• **width** controls how wide the iframe is\n" +
                                    "• **height** controls how tall it is\n\n" +
                                    "You can set them in:\n" +
                                    "• HTML attributes (width/height)\n" +
                                    "• CSS styles (recommended for responsive design)\n\n" +
                                    "This example includes a slider that changes size live.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Iframe Size Control</title>
  <style>
    body{font-family:Arial,sans-serif;padding:16px}
    iframe{border:2px solid #ddd;border-radius:14px;display:block}
    .row{max-width:600px}
  </style>
</head>
<body>

<h2>Resize Iframe Live </h2>

<div class="row">
  <label>Width: <span id="wVal">520</span>px</label><br>
  <input id="w" type="range" min="250" max="800" value="520" />
  <br><br>
  <label>Height: <span id="hVal">260</span>px</label><br>
  <input id="h" type="range" min="150" max="500" value="260" />
</div>

<br>

<iframe id="frame" title="Resizable iframe" width="520" height="260"
  srcdoc="<html><body style='font-family:Arial;padding:12px'><h3>Resizable iframe ✅</h3><p>Drag the sliders to resize me.</p></body></html>">
</iframe>

<script>
const frame = document.getElementById("frame");
const w = document.getElementById("w");
const h = document.getElementById("h");
const wVal = document.getElementById("wVal");
const hVal = document.getElementById("hVal");

function update(){
  frame.width = w.value;
  frame.height = h.value;
  wVal.textContent = w.value;
  hVal.textContent = h.value;
}

w.addEventListener("input", update);
h.addEventListener("input", update);
</script>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations =
                            "This is a fun way to understand width and height. The iframe resizes instantly."
                    ),

                    Headline(
                        headline = "Iframe src",
                        explaination =
                            "**src** is the URL (or file path) that the iframe loads.\n\n" +
                                    "Examples:\n" +
                                    "• src=\"page2.html\" (your local file)\n" +
                                    "• src=\"https://example.com\" (website)\n\n" +
                                    "If the website blocks embedding, use your own file.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Iframe src</title>
</head>
<body>

<h2>Iframe src ✅</h2>

<iframe title="Local page example" src="page2.html" width="520" height="240"></iframe>

<p>Create a file named <b>page2.html</b> in the same folder to test.</p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Iframe name",
                        explaination =
                            "**name** gives the iframe an identity.\n\n" +
                                    "Then links or forms can open inside that iframe using **target=\"iframeName\"**.\n\n" +
                                    "This is an amazing demo: buttons load different mini-pages inside the same iframe.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Iframe name + target</title>
  <style>
    body{font-family:Arial,sans-serif;padding:16px}
    button{padding:10px 12px;border-radius:12px;border:0;background:#0072ff;color:#fff;cursor:pointer;margin-right:8px}
    iframe{border:2px solid #ddd;border-radius:14px;width:100%;max-width:700px;height:280px;margin-top:12px}
  </style>
</head>
<body>

<h2>Iframe name + target </h2>

<p>Click buttons to load content into the iframe:</p>

<a href="https://example.com" target="box"><button>Load example.com</button></a>

<a href="data:text/html,
<html><body style='font-family:Arial;padding:14px;background:lavender'>
<h3>Page A ✅</h3><p>This came from a data URL.</p></body></html>"
target="box"><button>Load Page A</button></a>

<a href="data:text/html,
<html><body style='font-family:Arial;padding:14px;background:honeydew'>
<h3>Page B </h3><p>Same iframe, different content.</p></body></html>"
target="box"><button>Load Page B</button></a>

<iframe name="box" title="Target iframe"></iframe>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations =
                            "The iframe name is 'box'. Every link with target='box' opens inside it."
                    ),

                    Headline(
                        headline = "Iframe styling (Remove Border + Rounded Corners)",
                        explaination =
                            "By default, iframes may show borders depending on browser.\n\n" +
                                    "To remove border:\n" +
                                    "• CSS: iframe { border: none; }\n\n" +
                                    "You can also add:\n" +
                                    "• border-radius for rounded corners\n" +
                                    "• box-shadow for a modern look",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Iframe Styling</title>
  <style>
    body{font-family:Arial,sans-serif;padding:16px}
    iframe{
      width:100%;
      max-width:700px;
      height:280px;
      border:none;              /* remove border */
      border-radius:16px;       /* round corners */
      box-shadow:0 10px 25px rgba(0,0,0,0.12);
    }
  </style>
</head>
<body>

<h2>Styled Iframe </h2>

<iframe title="Styled iframe"
  srcdoc="<html><body style='font-family:Arial;padding:14px'><h3>Clean look </h3><p>No border, rounded corners, soft shadow.</p></body></html>">
</iframe>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Embedding External Content (Maps + More)",
                        explaination =
                            "Iframes are used to embed external services such as:\n" +
                                    "• Google Maps\n" +
                                    "• YouTube videos\n" +
                                    "• Calendars\n" +
                                    "• Forms (like Google Forms)\n\n" +
                                    "This example embeds a real Google Map using a public embed URL.\n" +
                                    "If it fails, it means the network or embed is blocked where you are testing.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Embed a Map</title>
  <style>
    body{font-family:Arial,sans-serif;padding:16px}
    iframe{border:0;border-radius:16px;width:100%;max-width:800px;height:420px}
  </style>
</head>
<body>

<h2>Embedded Map ️</h2>

<iframe
  title="Google Map Embed"
  loading="lazy"
  referrerpolicy="no-referrer-when-downgrade"
  src="https://www.google.com/maps?q=Nairobi%20CBD&output=embed">
</iframe>

<p style="color:#555;font-size:13px">
  Tip: You can replace the location text in the URL (e.g. Mombasa, Kisumu).
</p>

</body>
</html>
""".trimIndent()
                    )
                ),

                questions = listOf(
                    QuizQuestion("What is an iframe used for?", listOf("Making text bold", "Embedding another page inside your page", "Creating tables", "Playing audio only"), 1),
                    QuizQuestion("Which attribute loads a URL inside an iframe?", listOf("href", "src", "target", "link"), 1),
                    QuizQuestion("Why do some websites fail to show inside an iframe?", listOf("Because HTML is old", "Because they block embedding for security", "Because CSS is missing", "Because iframes need Java"), 1),
                    QuizQuestion("What does the 'name' attribute help with?", listOf("It changes color", "It lets links target that iframe", "It makes it fullscreen", "It removes borders"), 1),
                    QuizQuestion("Which attribute improves security by restricting iframe actions?", listOf("sandbox", "secure", "lock", "deny"), 0),
                    QuizQuestion("Which CSS removes an iframe border?", listOf("border: 2px;", "border: none;", "frame: off;", "outline: iframe;"), 1),
                    QuizQuestion("What does srcdoc do?", listOf("Adds captions", "Loads HTML directly inside the iframe", "Downloads a video", "Sets width and height"), 1)
                )
            ),

            Subtopic(
                sutopicId = 413,
                subTopicName = "YouTube in Iframes (Embedding Videos)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "YouTube videos in iframe",
                        explaination =
                            "To embed a YouTube video, you use an **iframe** with a special URL format:\n\n" +
                                    "Format:\n" +
                                    "https://www.youtube.com/embed/VIDEO_ID\n\n" +
                                    "This is different from the normal watch link.\n" +
                                    "watch?v=VIDEO_ID  \n" +
                                    "embed/VIDEO_ID    ",
                        tip = "Use the YouTube 'Share' → 'Embed' option to get the correct iframe code quickly.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>YouTube Embed</title>
  <style>
    body{font-family:Arial,sans-serif;padding:16px}
    iframe{border:0;border-radius:16px;width:100%;max-width:800px;height:450px}
  </style>
</head>
<body>

<h2>YouTube Embed </h2>

<iframe
  title="YouTube video"
  src="https://www.youtube.com/embed/dQw4w9WgXcQ"
  allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
  allowfullscreen>
</iframe>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Full Screen",
                        explaination =
                            "To allow fullscreen in YouTube embeds, add:\n" +
                                    "• **allowfullscreen**\n\n" +
                                    "Without it, the fullscreen button may not work.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Fullscreen Example</title>
</head>
<body>

<h2>Fullscreen </h2>

<iframe width="700" height="400"
  title="Fullscreen demo"
  src="https://www.youtube.com/embed/dQw4w9WgXcQ"
  allowfullscreen>
</iframe>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "allowfullscreen enables the fullscreen button in the player."
                    ),

                    Headline(
                        headline = "Architecture of YouTube Embed",
                        explaination =
                            "Parts of a YouTube iframe embed:\n" +
                                    "• **src** = embed URL (+ options)\n" +
                                    "• **allow** = permissions (autoplay, fullscreen, etc)\n" +
                                    "• **allowfullscreen** = fullscreen support\n" +
                                    "• **width/height** or CSS = size\n\n" +
                                    "This example shows a clean, modern embed with good attributes.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>YouTube Architecture</title>
  <style>
    body{font-family:Arial,sans-serif;padding:16px}
    .wrap{max-width:860px;border:2px solid #e6e6e6;border-radius:18px;padding:12px}
    iframe{border:0;border-radius:14px;width:100%;height:480px}
    .small{font-size:13px;color:#555}
  </style>
</head>
<body>

<h2>YouTube Embed Architecture </h2>

<div class="wrap">
  <iframe
    title="YouTube video"
    src="https://www.youtube.com/embed/dQw4w9WgXcQ"
    loading="lazy"
    referrerpolicy="strict-origin-when-cross-origin"
    allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
    allowfullscreen>
  </iframe>
  <p class="small">loading=lazy delays loading until needed (faster page load).</p>
</div>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations = "This is a clean embed setup: lazy loading, good permissions, and responsive sizing."
                    ),

                    Headline(
                        headline = "HD Enabling (Quality Note)",
                        explaination =
                            "You don’t force HD purely with HTML.\n\n" +
                                    "✅ What you *can* do:\n" +
                                    "• Use a larger player size (e.g., 720p layout)\n" +
                                    "• Let YouTube choose the best quality automatically based on internet speed\n\n" +
                                    "Quality is mostly controlled by:\n" +
                                    "• user settings\n" +
                                    "• internet speed\n" +
                                    "• YouTube’s adaptive streaming",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Bigger Player</title>
  <style>
    body{font-family:Arial,sans-serif;padding:16px}
    iframe{border:0;border-radius:16px;width:100%;max-width:1000px;height:560px}
  </style>
</head>
<body>

<h2>Bigger Player (Better Viewing) ✅</h2>

<iframe
  title="Large embed"
  src="https://www.youtube.com/embed/dQw4w9WgXcQ"
  allowfullscreen>
</iframe>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Removing Video Controls",
                        explaination =
                            "You can hide controls using a URL parameter:\n" +
                                    "• **controls=0** (hide)\n" +
                                    "• **controls=1** (show)\n\n" +
                                    "Note: YouTube may still show some controls depending on policy/updates.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>No Controls</title>
  <style>
    body{font-family:Arial,sans-serif;padding:16px}
    iframe{border:0;border-radius:16px;width:100%;max-width:900px;height:480px}
  </style>
</head>
<body>

<h2>Controls Off (controls=0) ✅</h2>

<iframe
  title="No controls"
  src="https://www.youtube.com/embed/dQw4w9WgXcQ?controls=0"
  allowfullscreen>
</iframe>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Removing Suggested Videos",
                        explaination =
                            "People used to use **rel=0** to reduce related videos.\n\n" +
                                    "Today, YouTube mostly shows related videos from the same channel, but behavior can change.\n\n" +
                                    "Still, this parameter is commonly used in tutorials.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Related Videos</title>
  <style>
    body{font-family:Arial,sans-serif;padding:16px}
    iframe{border:0;border-radius:16px;width:100%;max-width:900px;height:480px}
  </style>
</head>
<body>

<h2>Reduce Suggested Videos (rel=0) </h2>

<iframe
  title="rel=0 demo"
  src="https://www.youtube.com/embed/dQw4w9WgXcQ?rel=0"
  allowfullscreen>
</iframe>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Adding Captions",
                        explaination =
                            "You can request captions using URL parameters.\n\n" +
                                    "Common parameters:\n" +
                                    "• **cc_load_policy=1** → try to show captions\n\n" +
                                    "Captions appear only if available for that video.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Captions</title>
  <style>
    body{font-family:Arial,sans-serif;padding:16px}
    iframe{border:0;border-radius:16px;width:100%;max-width:900px;height:480px}
  </style>
</head>
<body>

<h2>Captions On (cc_load_policy=1) ✅</h2>

<iframe
  title="Captions demo"
  src="https://www.youtube.com/embed/dQw4w9WgXcQ?cc_load_policy=1"
  allowfullscreen>
</iframe>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Setting Starting Point",
                        explaination =
                            "To start the video at a specific time, use:\n" +
                                    "• **start=SECONDS**\n\n" +
                                    "Example: start=45 starts at 45 seconds.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Start Time</title>
  <style>
    body{font-family:Arial,sans-serif;padding:16px}
    iframe{border:0;border-radius:16px;width:100%;max-width:900px;height:480px}
  </style>
</head>
<body>

<h2>Start at 45s </h2>

<iframe
  title="Start at 45 seconds"
  src="https://www.youtube.com/embed/dQw4w9WgXcQ?start=45"
  allowfullscreen>
</iframe>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Iframe Styling (No Border + Responsive Trick)",
                        explaination =
                            "To make the YouTube iframe responsive (fit phones), use a wrapper with aspect ratio.\n\n" +
                                    "This is a clean modern approach.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Responsive YouTube</title>
  <style>
    body{font-family:Arial,sans-serif;padding:16px}
    .wrap{
      max-width:900px;
      border-radius:18px;
      overflow:hidden; /* hides corners nicely */
      box-shadow:0 10px 25px rgba(0,0,0,0.12);
    }
    .ratio{
      position:relative;
      width:100%;
      padding-top:56.25%; /* 16:9 */
    }
    .ratio iframe{
      position:absolute;
      inset:0;
      width:100%;
      height:100%;
      border:0;
    }
  </style>
</head>
<body>

<h2>Responsive YouTube </h2>

<div class="wrap">
  <div class="ratio">
    <iframe
      title="Responsive video"
      src="https://www.youtube.com/embed/dQw4w9WgXcQ"
      allowfullscreen>
    </iframe>
  </div>
</div>

</body>
</html>
""".trimIndent()
                    )
                ),

                questions = listOf(
                    QuizQuestion("Which URL format is correct for embedding YouTube?", listOf("youtube.com/watch?v=ID", "youtube.com/embed/ID", "youtube.com/play/ID", "youtube.com/iframe/ID"), 1),
                    QuizQuestion("Which attribute allows fullscreen?", listOf("fullscreen=1", "allowfullscreen", "full=on", "screenfull"), 1),
                    QuizQuestion("What does controls=0 try to do?", listOf("Mute video", "Hide player controls", "Speed up video", "Add captions"), 1),
                    QuizQuestion("What does start=60 do?", listOf("Starts at 60 seconds", "Stops at 60 seconds", "Plays 60 videos", "Sets volume to 60"), 0),
                    QuizQuestion("What does cc_load_policy=1 try to do?", listOf("Remove ads", "Show captions", "Loop video", "Change quality"), 1),
                    QuizQuestion("Why is the responsive wrapper used?", listOf("To block the video", "To keep 16:9 ratio on all screens", "To remove sound", "To increase download speed"), 1)
                )
            ),

            Subtopic(
                sutopicId = 48,
                subTopicName = "HTML File Paths (Finding Files Correctly)",
                headlines = listOf(

                    Headline(
                        majorHeadline = "HTML File Paths",
                        explaination =
                            "A **file path** tells HTML where to find a file (image, CSS, JS, video...).\n\n" +
                                    "Two main types:\n" +
                                    "• **Absolute paths** → full address\n" +
                                    "• **Relative paths** → based on your project folder location\n\n" +
                                    "If paths are wrong, images won’t show and CSS won’t load.",
                        tip = "For beginners, start with relative paths because they work in projects and when you move folders together.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>File Paths</title>

  <!-- Relative path to CSS -->
  <link rel="stylesheet" href="styles/main.css">
</head>
<body>

<h2>File Paths </h2>

<!-- Relative path to image -->
<img src="images/logo.png" alt="Logo" width="180">

<script src="js/app.js"></script>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Absolute File Paths",
                        explaination =
                            "Absolute paths give the full location.\n\n" +
                                    "Examples:\n" +
                                    "• Absolute URL: https://mysite.com/images/logo.png\n" +
                                    "• Absolute local path (not recommended on websites): C:\\Users\\...\n\n" +
                                    "  Best use: when linking to files on another website/CDN.",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Absolute Paths</title>
</head>
<body>

<h2>Absolute Path </h2>

<img src="https://via.placeholder.com/300x120.png?text=Absolute+URL+Image" alt="Absolute image">

<p>This image is loaded from a full web URL.</p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Relative File Paths",
                        explaination =
                            "Relative paths depend on where your HTML file is.\n\n" +
                                    "Common symbols:\n" +
                                    "• **file.png** → same folder\n" +
                                    "• **images/pic.png** → inside images folder\n" +
                                    "• **../pic.png** → go up one folder\n\n" +
                                    "This example shows common patterns (read comments).",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Relative Paths</title>
</head>
<body>

<h2>Relative Paths </h2>

<!-- 1) Same folder -->
<img src="logo.png" alt="Same folder image">

<!-- 2) Inside a folder -->
<img src="images/photo.png" alt="Inside images folder">

<!-- 3) Go up one folder -->
<img src="../shared/banner.png" alt="Up one folder">

<p>These work only if your folder structure matches.</p>

</body>
</html>
""".trimIndent()
                    ),

                    Headline(
                        headline = "Amazing Tip: Build a Folder Map (So You Never Get Lost)",
                        explaination =
                            "Many beginners fail because they don’t picture the folder structure.\n\n" +
                                    "Here is a clean example structure:\n" +
                                    "• project/\n" +
                                    "  • index.html\n" +
                                    "  • pages/about.html\n" +
                                    "  • images/logo.png\n" +
                                    "  • css/style.css\n\n" +
                                    "From pages/about.html to logo.png, the path is:\n" +
                                    "• **../images/logo.png**",
                        codeExample = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Path Example</title>
</head>
<body>

<h2>Folder Map Idea </h2>

<p>Imagine this file is: <b>pages/about.html</b></p>
<p>To reach <b>images/logo.png</b> we use:</p>

<pre style="background:#f4f4f4;padding:12px;border-radius:12px;">
&lt;img src="../images/logo.png" alt="Logo"&gt;
</pre>

</body>
</html>
""".trimIndent(),
                        afterCodeEplainations =
                            "Once learners understand ../ (go up), file paths become easy."
                    )
                ),

                questions = listOf(
                    QuizQuestion("What is a file path used for?", listOf("To style buttons", "To locate files like images/CSS/JS", "To create tables", "To run Python"), 1),
                    QuizQuestion("Which is an absolute URL path?", listOf("images/logo.png", "../images/logo.png", "https://site.com/logo.png", "logo.png"), 2),
                    QuizQuestion("What does ../ mean in a relative path?", listOf("Go to next folder", "Go up one folder", "Reload page", "Make file bigger"), 1),
                    QuizQuestion("If index.html and photo.png are in the same folder, the path is:", listOf("/photo.png", "images/photo.png", "photo.png", "../photo.png"), 2),
                    QuizQuestion("Which is best for files inside your own project?", listOf("Relative paths", "Only absolute paths", "No paths needed", "Random paths"), 0),
                    QuizQuestion("If your HTML is in pages/about.html and image is in images/logo.png, correct path is:", listOf("images/logo.png", "../images/logo.png", "../../images/logo.png", "pages/images/logo.png"), 1)
                )
            ),



            )
),
    NoteModule(
        topic = "Common HTML Practices",
        topicId=5,
        subtopics = listOf(


            Subtopic(
                sutopicId = 501,
                subTopicName = "Header, Nav, Main, Footer",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Semantic Layout (Best Practice)",
                        explaination =
                            "Semantic HTML means using tags that clearly describe their purpose.\n\n" +
                                    "Common semantic layout tags:\n" +
                                    "• <header> page top area (logo, title)\n" +
                                    "• <nav> navigation links\n" +
                                    "• <main> main content (only one per page)\n" +
                                    "• <section> grouped content\n" +
                                    "• <article> independent content (post, card)\n" +
                                    "• <footer> page bottom info\n\n" +
                                    "Why people prefer this:\n" +
                                    "• Better accessibility (screen readers understand structure)\n" +
                                    "• Better SEO (search engines understand content sections)\n" +
                                    "• Cleaner, easier to maintain code\n" +
                                    "• Works well with CSS layout systems",
                        codeExample = """
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Semantic Layout</title>
  <style>
    :root{--bg:#0b1220;--card:#121c31;--text:#e8ecf5;--muted:#a6b1c6;--accent:#4aa3ff}
    *{box-sizing:border-box}
    body{margin:0;font-family:Arial, sans-serif;background:var(--bg);color:var(--text)}
    header{padding:18px 16px;border-bottom:1px solid rgba(255,255,255,.08)}
    header .row{max-width:1050px;margin:0 auto;display:flex;gap:12px;align-items:center;justify-content:space-between}
    .brand{display:flex;align-items:center;gap:10px}
    .logo{width:36px;height:36px;border-radius:12px;background:linear-gradient(135deg,var(--accent),#7c5cff)}
    nav a{color:var(--muted);text-decoration:none;margin-left:12px;font-size:14px}
    nav a:hover{color:var(--text)}
    main{max-width:1050px;margin:0 auto;padding:18px 16px}
    .grid{display:grid;grid-template-columns:1.2fr .8fr;gap:14px}
    .card{background:var(--card);border:1px solid rgba(255,255,255,.08);border-radius:18px;padding:14px}
    .pill{display:inline-block;background:rgba(74,163,255,.14);border:1px solid rgba(74,163,255,.25);
      color:var(--text);padding:6px 10px;border-radius:999px;font-size:12px}
    button{border:0;background:var(--accent);color:#06101d;padding:10px 12px;border-radius:14px;cursor:pointer;font-weight:700}
    button:hover{filter:brightness(1.05)}
    .muted{color:var(--muted);font-size:14px;line-height:1.5}
    footer{padding:16px;border-top:1px solid rgba(255,255,255,.08);color:var(--muted)}
    footer .row{max-width:1050px;margin:0 auto;padding:0 16px;display:flex;justify-content:space-between;gap:12px;flex-wrap:wrap}
    @media (max-width:900px){.grid{grid-template-columns:1fr}}
  </style>
</head>
<body>

<header>
  <div class="row">
    <div class="brand">
      <div class="logo" aria-hidden="true"></div>
      <div>
        <div style="font-weight:800">Learn HTML</div>
        <div class="muted" style="font-size:12px">Semantic layout demo</div>
      </div>
    </div>
    <nav aria-label="Main navigation">
      <a href="#home">Home</a>
      <a href="#lessons">Lessons</a>
      <a href="#tips">Tips</a>
    </nav>
  </div>
</header>

<main>
  <section class="grid" id="home">
    <article class="card">
      <span class="pill">Best practice: Semantic tags</span>
      <h2 style="margin:10px 0 8px">Clean structure = easier projects</h2>
      <p class="muted">
        Semantic tags make the page easier to understand for humans, screen readers, and search engines.
        This page uses header, nav, main, section, article and footer.
      </p>
      <button id="btn">Show a quick tip</button>
      <p id="tipOut" class="muted" style="margin:12px 0 0"></p>
    </article>

    <aside class="card" id="tips">
      <h3 style="margin:0 0 8px">Quick checklist</h3>
      <ul class="muted" style="margin:0;padding-left:18px">
        <li>Only one &lt;main&gt; per page</li>
        <li>Use headings in order (h1, h2, h3...)</li>
        <li>Give nav an aria-label</li>
      </ul>
    </aside>
  </section>
</main>

<footer>
  <div class="row">
    <div>Practice page: Semantic Layout</div>
    <div id="time"></div>
  </div>
</footer>

<script>
  const tips = [
    "Use semantic tags first, then style with CSS.",
    "If you can describe a section with a tag (nav, main, article), do it.",
    "Screen readers love good structure."
  ];

  document.getElementById("btn").addEventListener("click", () => {
    const pick = tips[Math.floor(Math.random() * tips.length)];
    document.getElementById("tipOut").textContent = pick;
  });

  function tick(){
    document.getElementById("time").textContent = "Local time: " + new Date().toLocaleTimeString();
  }
  tick();
  setInterval(tick, 1000);
</script>

</body>
</html>
""".trimIndent(),
                        tip = "When your HTML structure is clear, CSS becomes simpler and your site feels professional."
                    ),

                    Headline(
                        headline = "Why Semantic HTML is preferred",
                        explaination =
                            "Reasons developers prefer semantic HTML:\n" +
                                    "• It improves accessibility (assistive tools understand regions)\n" +
                                    "• It improves SEO (search engines understand your important content)\n" +
                                    "• It reduces confusion in big projects\n" +
                                    "• It helps team members work faster because the structure is obvious",
                        codeExample = """
<!-- Bad (div soup) -->
<div class="top"></div>
<div class="menu"></div>
<div class="content"></div>

<!-- Better (semantic) -->
<header></header>
<nav></nav>
<main></main>
""".trimIndent(),
                        afterCodeEplainations = "You can still style semantic tags just like divs, but the meaning becomes clearer."
                    ),
                ),
                    questions = listOf(
                        QuizQuestion("Which tag should contain the main content of a page?", listOf("<nav>", "<main>", "<header>", "<footer>"), 1),
                        QuizQuestion("Why use semantic tags?", listOf("They make JavaScript faster", "They improve structure and accessibility", "They replace CSS", "They stop errors"), 1),
                        QuizQuestion("How many <main> tags should a page have?", listOf("0", "1", "3", "Unlimited"), 1),
                        QuizQuestion("Which tag is best for navigation links?", listOf("<section>", "<nav>", "<article>", "<aside>"), 1),
                        QuizQuestion("Which tag is best for independent content like a blog post?", listOf("<article>", "<nav>", "<footer>", "<span>"), 0)
                    )

            ),

            Subtopic(
                sutopicId = 502,
                subTopicName = "Responsive Design",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Mobile-First Responsive Design",
                        explaination =
                            "Mobile-first means designing for small screens first, then improving layout for bigger screens.\n\n" +
                                    "Why people prefer this:\n" +
                                    "• Most users are on phones\n" +
                                    "• Easier to scale up than to shrink down\n" +
                                    "• Better performance mindset (simple first)\n\n" +
                                    "This full page changes layout automatically and has a small JS screen indicator.",
                        codeExample = """
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Mobile First</title>
  <style>
    :root{--bg:#0c1020;--card:#111a34;--text:#f2f4ff;--muted:#a4afc6;--accent:#7c5cff}
    *{box-sizing:border-box}
    body{margin:0;font-family:Arial, sans-serif;background:var(--bg);color:var(--text)}
    header{padding:16px}
    .wrap{max-width:1050px;margin:0 auto;padding:0 16px 16px}
    .card{background:var(--card);border:1px solid rgba(255,255,255,.09);border-radius:18px;padding:14px}
    .grid{display:grid;grid-template-columns:1fr;gap:12px} /* mobile-first */
    .muted{color:var(--muted);line-height:1.5}
    .badge{display:inline-block;border:1px solid rgba(124,92,255,.35);background:rgba(124,92,255,.14);
      padding:6px 10px;border-radius:999px;font-size:12px}
    button{border:0;background:var(--accent);color:#0c1020;padding:10px 12px;border-radius:14px;cursor:pointer;font-weight:800}
    .bar{display:flex;gap:10px;align-items:center;justify-content:space-between;flex-wrap:wrap}
    input{width:100%;padding:10px 12px;border-radius:14px;border:1px solid rgba(255,255,255,.15);background:transparent;color:var(--text)}
    @media (min-width:900px){
      .grid{grid-template-columns:1.2fr .8fr} /* upgrade for big screens */
      header{padding:20px 16px}
    }
  </style>
</head>
<body>

<header class="wrap">
  <div class="bar">
    <div>
      <div style="font-weight:900;font-size:20px">Mobile-First Practice</div>
      <div class="muted" style="font-size:13px">Resize your browser to see the layout switch.</div>
    </div>
    <span class="badge" id="sizeInfo">Loading...</span>
  </div>
</header>

<main class="wrap">
  <section class="grid">
    <div class="card">
      <h3 style="margin:0 0 8px">Search demo</h3>
      <p class="muted" style="margin:0 0 10px">A tiny JS feature: type and see live preview.</p>
      <input id="q" placeholder="Type something..." />
      <p class="muted" style="margin:10px 0 0">Preview: <b id="out"></b></p>
    </div>

    <aside class="card">
      <h3 style="margin:0 0 8px">Why mobile-first?</h3>
      <ul class="muted" style="margin:0;padding-left:18px">
        <li>Phones are most common</li>
        <li>Less layout bugs</li>
        <li>Better user experience</li>
      </ul>
      <button id="random" style="margin-top:12px">Show a responsive tip</button>
      <p id="rtip" class="muted" style="margin:10px 0 0"></p>
    </aside>
  </section>
</main>

<script>
  const sizeInfo = document.getElementById("sizeInfo");
  function updateSize(){
    const w = window.innerWidth;
    const mode = w >= 900 ? "Desktop layout" : "Mobile layout";
    sizeInfo.textContent = mode + " (" + w + "px)";
  }
  window.addEventListener("resize", updateSize);
  updateSize();

  document.getElementById("q").addEventListener("input", (e) => {
    document.getElementById("out").textContent = e.target.value;
  });

  const tips = [
    "Start small: one column, then add columns for big screens.",
    "Use max-width to avoid super wide text.",
    "Test on a phone emulator or device before releasing."
  ];
  document.getElementById("random").addEventListener("click", () => {
    document.getElementById("rtip").textContent = tips[Math.floor(Math.random() * tips.length)];
  });
</script>

</body>
</html>
""".trimIndent(),
                        tip = "Build one clean layout for mobile first, then add @media queries for larger screens."
                    ),
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
                        QuizQuestion("What does mobile-first mean?", listOf("Design for desktop only", "Design for phones first, then improve for bigger screens", "Use only images", "Avoid CSS"), 1),
                        QuizQuestion("Which CSS feature changes layout based on screen size?", listOf("class", "media queries", "href", "title"), 1),
                        QuizQuestion("Why do many developers prefer mobile-first?", listOf("Phones are common", "It removes JavaScript", "It blocks ads", "It makes HTML shorter always"), 0),
                        QuizQuestion("What is the purpose of meta viewport?", listOf("Add audio", "Help page scale properly on phones", "Make SEO only", "Change fonts"), 1),
                        QuizQuestion("A common mobile-first layout starts with:", listOf("Three columns", "One column", "Ten columns", "No layout"), 1)
                    )

            ),

            Subtopic(
                sutopicId = 503,
                subTopicName = "HTML + CSS + JS",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Separation of Concerns",
                        explaination =
                            "Separation of concerns means:\n" +
                                    "• HTML = structure\n" +
                                    "• CSS = design\n" +
                                    "• JavaScript = behavior\n\n" +
                                    "Why people prefer this:\n" +
                                    "• Easy to maintain\n" +
                                    "• Teams work faster (designer edits CSS, dev edits JS)\n" +
                                    "• Less messy files\n\n" +
                                    "This single-file demo still separates sections clearly (style in <style>, logic in <script>).",
                        codeExample = """
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Separation of Concerns</title>
  <style>
    :root{--bg:#0f1220;--card:#151a2f;--text:#eef2ff;--muted:#a7b0c8;--accent:#4aa3ff}
    *{box-sizing:border-box}
    body{margin:0;font-family:Arial, sans-serif;background:var(--bg);color:var(--text);padding:18px}
    .wrap{max-width:980px;margin:0 auto}
    .card{background:var(--card);border:1px solid rgba(255,255,255,.09);border-radius:18px;padding:14px}
    .row{display:flex;gap:12px;flex-wrap:wrap}
    .row > *{flex:1;min-width:260px}
    .muted{color:var(--muted);line-height:1.5}
    button{border:0;background:var(--accent);color:#071321;padding:10px 12px;border-radius:14px;cursor:pointer;font-weight:800}
    button:hover{filter:brightness(1.05)}
    .tag{display:inline-block;border:1px solid rgba(74,163,255,.3);background:rgba(74,163,255,.14);
      padding:6px 10px;border-radius:999px;font-size:12px}
    .done{text-decoration:line-through;opacity:.75}
    ul{margin:10px 0 0;padding-left:18px}
    li{margin:8px 0}
  </style>
</head>
<body>
  <main class="wrap">
    <div class="card">
      <span class="tag">HTML = structure • CSS = style • JS = behavior</span>
      <h2 style="margin:10px 0 6px">Mini To-Do (Clean structure)</h2>
      <p class="muted" style="margin:0">
        This page is one file, but it follows separation of concerns by keeping style in CSS and logic in JS.
      </p>
    </div>

    <div class="row" style="margin-top:12px">
      <section class="card">
        <h3 style="margin:0 0 8px">Add a task</h3>
        <input id="task" placeholder="e.g. Learn semantic HTML" style="width:100%;padding:10px 12px;border-radius:14px;border:1px solid rgba(255,255,255,.15);background:transparent;color:var(--text)">
        <button id="add" style="margin-top:10px">Add</button>
        <p class="muted" id="msg" style="margin:10px 0 0"></p>
      </section>

      <section class="card">
        <h3 style="margin:0 0 8px">Tasks</h3>
        <ul id="list" class="muted"></ul>
      </section>
    </div>
  </main>

  <script>
    const input = document.getElementById("task");
    const list = document.getElementById("list");
    const msg = document.getElementById("msg");

    function addTask(text){
      const li = document.createElement("li");
      li.textContent = text;

      li.addEventListener("click", () => {
        li.classList.toggle("done");
      });

      list.appendChild(li);
    }

    document.getElementById("add").addEventListener("click", () => {
      const text = input.value.trim();
      if(!text){
        msg.textContent = "Type a task first.";
        return;
      }
      addTask(text);
      msg.textContent = "Tip: click a task to mark it done.";
      input.value = "";
      input.focus();
    });

    addTask("Click me to mark done");
    addTask("Build clean HTML structure");
  </script>
</body>
</html>
""".trimIndent(),
                        tip = "Even in a single HTML file, you can keep your code clean by organizing CSS and JS sections."
                    ),
                ),
                    questions = listOf(
                        QuizQuestion("What does separation of concerns mean?", listOf("Mix everything in one line", "Keep HTML, CSS, JS responsibilities clear", "Avoid CSS", "Avoid JS"), 1),
                        QuizQuestion("What should CSS handle?", listOf("Structure", "Design/Styling", "Database", "SEO only"), 1),
                        QuizQuestion("What should JavaScript handle?", listOf("Behavior/Interactivity", "Only colors", "Only headings", "Only images"), 0),
                        QuizQuestion("Why is this practice preferred?", listOf("Harder debugging", "Easier maintenance and teamwork", "More errors", "Slower websites"), 1),
                        QuizQuestion("In a team, separation helps because:", listOf("Everyone edits the same line", "Different people can focus on different parts", "It removes HTML", "It blocks users"), 1)

                )
            ),

            Subtopic(
                sutopicId = 504,
                subTopicName = "Accessibility Basics ",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Accessibility (A11y) Basics",
                        explaination =
                            "Accessibility means your website works for everyone, including users with assistive tools.\n\n" +
                                    "Common best practices:\n" +
                                    "• Use <label> for inputs\n" +
                                    "• Use alt text for images\n" +
                                    "• Buttons should be real <button>\n" +
                                    "• Use aria-label when needed\n\n" +
                                    "Why people prefer this:\n" +
                                    "• More users can use your site\n" +
                                    "• Better UX\n" +
                                    "• Often improves SEO too\n\n" +
                                    "This page includes a form with labels and a live status message.",
                        codeExample = """
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Accessibility Basics</title>
  <style>
    :root{--bg:#0c1220;--card:#121c31;--text:#eef2ff;--muted:#a6b1c6;--accent:#4aa3ff}
    *{box-sizing:border-box}
    body{margin:0;font-family:Arial, sans-serif;background:var(--bg);color:var(--text);padding:18px}
    .wrap{max-width:950px;margin:0 auto}
    .card{background:var(--card);border:1px solid rgba(255,255,255,.09);border-radius:18px;padding:14px}
    label{display:block;margin-top:10px;margin-bottom:6px;font-weight:700}
    input{width:100%;padding:10px 12px;border-radius:14px;border:1px solid rgba(255,255,255,.15);background:transparent;color:var(--text)}
    button{border:0;background:var(--accent);color:#071321;padding:10px 12px;border-radius:14px;cursor:pointer;font-weight:900;margin-top:12px}
    .muted{color:var(--muted);line-height:1.5}
    .status{margin-top:12px;border-radius:14px;padding:10px 12px;border:1px solid rgba(255,255,255,.12)}
    img{max-width:100%;border-radius:16px;border:1px solid rgba(255,255,255,.08)}
  </style>
</head>
<body>
  <main class="wrap">
    <section class="card">
      <h2 style="margin:0 0 6px">Accessible Form </h2>
      <p class="muted" style="margin:0">Labels connect text to inputs, helping screen readers and improving usability.</p>

      <form id="f">
        <label for="name">Full Name</label>
        <input id="name" name="name" placeholder="e.g. Nick" autocomplete="name" required>

        <label for="email">Email</label>
        <input id="email" name="email" placeholder="name@example.com" autocomplete="email" required>

        <button type="submit" aria-label="Submit the form">Submit</button>
      </form>

      <div id="status" class="status muted" role="status" aria-live="polite">
        Waiting for submission...
      </div>
    </section>

    <section class="card" style="margin-top:12px">
      <h3 style="margin:0 0 6px">Alt text example</h3>
      <p class="muted" style="margin:0 0 10px">
        Alt text describes images for users who can’t see them.
      </p>
      <img src="f6.png" alt="A placeholder banner that says Accessible Image Demo">
    </section>
  </main>

  <script>
    document.getElementById("f").addEventListener("submit", (e) => {
      e.preventDefault();
      const name = document.getElementById("name").value.trim();
      const email = document.getElementById("email").value.trim();
      document.getElementById("status").textContent =
        "Submitted. Name: " + name + " | Email: " + email + " (This status is announced politely)";
    });
  </script>
</body>
</html>
""".trimIndent(),
                        tip = "Use real labels and buttons. Avoid clickable divs when a <button> can do the job."
                    ),
                ),
                    questions = listOf(
                        QuizQuestion("Why use <label> with inputs?", listOf("To make inputs bigger", "To connect text with inputs for usability and screen readers", "To replace CSS", "To hide the input"), 1),
                        QuizQuestion("What is alt text for?", listOf("To speed up JavaScript", "To describe images for accessibility", "To change background", "To create links"), 1),
                        QuizQuestion("What does aria-label do?", listOf("Adds color", "Provides a readable name for assistive tech", "Blocks clicks", "Loads fonts"), 1),
                        QuizQuestion("Which is better for a clickable action?", listOf("<div onclick>", "<button>", "<span>", "<p>"), 1),
                        QuizQuestion("What does role='status' help with?", listOf("Music", "Announcing updates to assistive tools", "SEO only", "Changing layouts"), 1)

                )
            ),

            Subtopic(
                sutopicId = 505,
                subTopicName = "Performance Basics",
                headlines = listOf(
                    Headline(
                        majorHeadline = "Performance Basics (Fast Pages)",
                        explaination =
                            "Performance best practices make a site feel quick and smooth.\n\n" +
                                    "Common habits:\n" +
                                    "• Use <script defer> so HTML loads first\n" +
                                    "• Use loading='lazy' for images/iframes\n" +
                                    "• Avoid huge CSS/JS for simple pages\n" +
                                    "• Use simple layouts and compress media\n\n" +
                                    "Why people prefer this:\n" +
                                    "• Better user experience\n" +
                                    "• Faster load on slow networks\n" +
                                    "• Often improves SEO\n\n" +
                                    "This page demonstrates defer + lazy image + a tiny JS performance timer.",
                        codeExample = """
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Performance Basics</title>
  <style>
    :root{--bg:#0b1220;--card:#121c31;--text:#eef2ff;--muted:#a6b1c6;--accent:#4aa3ff}
    *{box-sizing:border-box}
    body{margin:0;font-family:Arial, sans-serif;background:var(--bg);color:var(--text);padding:18px}
    .wrap{max-width:980px;margin:0 auto}
    .card{background:var(--card);border:1px solid rgba(255,255,255,.09);border-radius:18px;padding:14px}
    .muted{color:var(--muted);line-height:1.5}
    .row{display:flex;gap:12px;flex-wrap:wrap}
    .row > *{flex:1;min-width:260px}
    img{width:100%;border-radius:16px;border:1px solid rgba(255,255,255,.08);display:block}
    button{border:0;background:var(--accent);color:#071321;padding:10px 12px;border-radius:14px;cursor:pointer;font-weight:900}
    .tag{display:inline-block;border:1px solid rgba(74,163,255,.3);background:rgba(74,163,255,.14);
      padding:6px 10px;border-radius:999px;font-size:12px}
  </style>

  <!-- In real projects, put external scripts with defer -->
  <script defer>
    // This runs after HTML is parsed
    document.addEventListener("DOMContentLoaded", () => {
      const start = performance.now();
      const out = document.getElementById("perf");
      out.textContent = "DOM ready. Measuring...";
      setTimeout(() => {
        const end = performance.now();
        out.textContent = "Page interactive. Approx time since DOM ready: " + (end - start).toFixed(1) + "ms";
      }, 300);
    });
  </script>
</head>
<body>

<main class="wrap">
  <section class="card">
    <span class="tag">defer + lazy loading</span>
    <h2 style="margin:10px 0 6px">Fast Page Habits </h2>
    <p class="muted" style="margin:0">
      This page uses a small script in the head with <b>defer</b>-style behavior (DOMContentLoaded).
      It also lazy loads an image below.
    </p>
    <p id="perf" class="muted" style="margin:10px 0 0"></p>
  </section>

  <section class="row" style="margin-top:12px">
    <div class="card">
      <h3 style="margin:0 0 8px">Lazy image</h3>
      <p class="muted" style="margin:0 0 10px">
        loading="lazy" loads the image later (when close to view), saving data and time.
      </p>
      <img loading="lazy" src="ludo.png" alt="Lazy loaded placeholder image">
    </div>

    <div class="card">
      <h3 style="margin:0 0 8px">Tiny interaction</h3>
      <p class="muted" style="margin:0 0 10px">Small JS features are fine. Avoid huge scripts for simple pages.</p>
      <button id="btn">Generate a quick fact</button>
      <p id="fact" class="muted" style="margin:10px 0 0"></p>
    </div>
  </section>
</main>

<script>
  const facts = [
    "Lazy loading helps on slow networks because media loads later.",
    "Defer prevents scripts from blocking HTML rendering.",
    "Small pages can feel fast even without heavy frameworks."
  ];
  document.getElementById("btn").addEventListener("click", () => {
    document.getElementById("fact").textContent = facts[Math.floor(Math.random() * facts.length)];
  });
</script>

</body>
</html>
""".trimIndent(),
                        tip = "If a page feels slow, first check: huge images, blocking scripts, and unnecessary libraries."
                    ),
                ),
                    questions = listOf(
                        QuizQuestion("Why use script defer?", listOf("To block HTML", "To let HTML load first then run JS", "To remove CSS", "To add audio"), 1),
                        QuizQuestion("What does loading='lazy' do?", listOf("Loads images faster always", "Delays loading until needed", "Stops images", "Makes images smaller"), 1),
                        QuizQuestion("A common cause of slow pages is:", listOf("Too many headings", "Huge images and heavy scripts", "Using <main>", "Using <nav>"), 1),
                        QuizQuestion("What is the benefit of lightweight UI?", listOf("More bugs", "Faster load and smoother feel", "More ads", "Less SEO"), 1),
                        QuizQuestion("Which is a good practice for performance?", listOf("Load everything immediately", "Compress media and avoid huge libraries for small pages", "Use inline styles only always", "Disable caching"), 1)
                    )

            )



            )
    ),

)















