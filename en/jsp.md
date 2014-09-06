#JSP

####107. What is a JSP Page ? 
A Java Server Page (JSP) is a text document that contains two types of text: static data and JSP elements. Static data can be expressed in any text-based format, such as HTML or XML. JSP is a technology that mixes static content with dynamically-generated content. See [JSP example here](http://examples.javacodegeeks.com/enterprise-java/jsp/sample-jsp-java-server-page/).

####108. How are the JSP requests handled ? 
On the arrival of a JSP request, the browser first requests a page with a .jsp extension. Then, the Web server reads the request and using the JSP compiler, the Web server converts the JSP page into a servlet class. Notice that the JSP file is compiled only on the first request of the page, or if the JSP file has changed.The generated servlet class is invoked, in order to handle the browser’s request. Once the execution of the request is over, the servlet sends a response back to the client. See [how to get Request parameters in a JSP](http://examples.javacodegeeks.com/enterprise-java/jsp/get-request-parameter-in-jsp-page/).

####109. What are the advantages of JSP ?
The advantages of using the JSP technology are shown below:

* JSP pages are dynamically compiled into servlets and thus, the developers can easily make updates to presentation code.
* JSP pages can be pre-compiled.
* JSP pages can be easily combined to static templates, including HTML or XML fragments, with code that generates dynamic content.
* Developers can offer customized JSP tag libraries that page authors access using an XML-like syntax.
* Developers can make logic changes at the component level, without editing the individual pages that use the application’s logic.

####110. What are Directives ? 
What are the different types of Directives available in JSP ? Directives are instructions that are processed by the JSP engine, when the page is compiled to a servlet. Directives are used to set page-level instructions, insert data from external files, and specify custom tag libraries. Directives are defined between < %@ and % >.The different types of directives are shown below:

* Include directive: it is used to include a file and merges the content of the file with the current page.
* Page directive: it is used to define specific attributes in the JSP page, like error page and buffer.
* Taglib: it is used to declare a custom tag library which is used in the page.

####111. What are JSP actions ? 
JSP actions use constructs in XML syntax to control the behavior of the servlet engine. JSP actions are executed when a JSP page is requested. They can be dynamically inserted into a file, re-use JavaBeans components, forward the user to another page, or generate HTML for the Java plugin.Some of the available actions are listed below:

* jsp:include – includes a file, when the JSP page is requested.
* jsp:useBean – finds or instantiates a JavaBean.
* jsp:setProperty – sets the property of a JavaBean.
* jsp:getProperty – gets the property of a JavaBean.
* jsp:forward – forwards the requester to a new page.
* jsp:plugin – generates browser-specific code.

####112. What are Scriptlets ? 
In Java Server Pages (JSP) technology, a scriptlet is a piece of Java-code embedded in a JSP page. The scriptlet is everything inside the tags. Between these tags, a user can add any valid scriplet.

####113. What are Decalarations ? 
Declarations are similar to variable declarations in Java. Declarations are used to declare variables for subsequent use in expressions or scriptlets. To add a declaration, you must use the sequences to enclose your declarations.

####114. What are Expressions ? 
A JSP expression is used to insert the value of a scripting language expression, converted into a string, into the data stream returned to the client, by the web server. Expressions are defined between <% = and %> tags.

####115. What is meant by implicit objects and what are they ? 
JSP implicit objects are those Java objects that the JSP Container makes available to developers in each page. A developer can call them directly, without being explicitly declared. JSP Implicit Objects are also called pre-defined variables.The following objects are considered implicit in a JSP page:

* application
* page
* request
* response
* session
* exception
* out
* config
* pageContext

Still with us? Wow, that was a huge article about different types of questions that can be used in a Java interview. If you enjoyed this, then [subscribe to our newsletter](http://eepurl.com/xRlkj) to enjoy weekly updates and complimentary whitepapers! Also, check out [JCG Academy](http://academy.javacodegeeks.com/) for more advanced training!

So, what other Java interview questions are there? Let us know in the comments and we will include them in the article! Happy coding!