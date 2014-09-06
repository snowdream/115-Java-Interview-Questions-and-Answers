#JSP

####107. JSP页面是什么 ?
一个JSP页面是一个文本文档，包含了两种类型的文本：静态数据和JSP元素。静态数据可以以任何一种基于文本的格式表达，比如HTML或者XML。JSP是一种混合了静态内容与动态生成内容的技术。查看[JSP例子](http://examples.javacodegeeks.com/enterprise-java/jsp/sample-jsp-java-server-page/)

####108. JSP请求是如何被处理的？
一个JSP请求的到来,浏览器首先以一个jsp扩展的文件名来请求一个页面。然后，Web Server读取到该请求，使用JSP编译器将JSP页面转换为一个servlet类。注意JSP文件只在该页面的第一次请求或者JSP文件已经改变时才编译。生成的servlet类被调用，去处理浏览器的请求。一旦请求处理完，servlet会向客户端返回一个相应。查看[如何获取JSP请求中的参数](http://examples.javacodegeeks.com/enterprise-java/jsp/get-request-parameter-in-jsp-page/)

####109. JSP的优势所在？

使用JSP技术有以下优势：
* JSP网页被动态的编译，因此开发者很容易更新当前代码。
* JSP网页可预编译。
* JSP网页能容易的组合成静态模版，包括HTML XML片段，且代码可形成动态内容。
* 开发者能提供自定义的JSP标签库，且使用类XML语法访问。
* 开发者可以在组件级别做逻辑上的改变，但是不能使用程序逻辑编辑个别的网页。

####110. 什么是指令？在JSP中， 包括哪些不同类型的指令？

指令是JSP引擎所处理的命令，当网页被编译成小程序时，指令用于去设置页面级别的命令，从外部文件插入数据，指定自定义的标签库。指令被包括在<%@ 和%>内。指令的类型分为：
* 包含指令：用于包含文件，和当用页面合并文件内容。
* 页面指令：用于定义JSP页面的具体属性，比如错误页面和缓冲池。
* 标签库：用于声明页面中使用到的自定义标签库。


####111. 什么是JSP的actions？
JSP的actions是使用XML语法结构来控制Servlet引擎的行为。JSP的actions是在当JSP页面请求的时候才执行。它们会动态插入一个文件中，再利用JavaBeans的组件，转发给用户到另一个页面，或者生成带Java插件的HTML页面。以下是一些可以操作的actions：
* jsp:include- 当JSP页面被请求的时候，包含了一个文件。
* jsp:useBean- 寻找或者实例化一个JavaBean。
* jsp:setProperty- 设置JavaBean的属性。
* jsp:getProperty- 得到JavaBean的属性。
* jsp:forward- 转发请求到新的页面。
* jsp:plugin- 生成特定浏览器的代码。

####112. 什么是Scriptlet？
在Java Server Page(JSP)技术中，scriptlet是嵌入在JSP页面的其中一块Java代码。scriptlet是标签内的任何东西。在这些标签之间，用户可以添加任何有效的scriptlet。

####113. 什么是声明？
声明类似于Java中的变量声明。声明是为表达式或者scriptlets后续的使用而声明的变量。添加一个声明，你必须在你的声明中使用序列。

####114. 什么是表达式？
JSP表达式是把一个脚本语言表达式的值插入进来，转换成字符串，进入数据流之后再通过web服务器返回给客户端。表达式的定义是在<% = 和 %>标签之间。

####115. 什么是隐式对象？他们是什么？
JSP隐式对象是指JSP容器在每页中提供给开发人员的Java对象。开发人员可以直接调用他们，而不需要任何显示声明。JSP隐式对象也被称为预定义变量。以下对象都是在JSP页面中隐式存在的：
* application
* page
* request
* response
* session
* exception
* out
* config
* pageContext
 
坚持看到这里了？哇!这是一篇很长的文章，详细地描述了在Java面试中各种类型的问题。