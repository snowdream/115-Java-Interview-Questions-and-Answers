#Servlets

####91. 什么是Servlet?
[servlet](http://examples.javacodegeeks.com/enterprise-java/servlet/sample-java-servlet/)是用来处理客户端请求并生成动态web内容的Java程序语言类。Servlets大多是用来处理或者存储HTML表单提交的数据，提供动态内容和管理那些不在HTTP无状态协议中的状态信息。

####92. 解释一个Servlet的架构.
核心抽象概念肯定是所有servlet必须实现 javax.servlet.Servlet 接口。 每个 servlet 必须直接或者间接实现这个接口， 也可以继承于 javax.servlet.GenericServlet 或者javax.servlet.http.HTTPServlet。最后想提的是,每个 servlet 能够使用多线程服务多个请求。

####93. 一个 Applet 和 一个 Servlet 区别是什么 ?
一个 Applet 是一个跑在客户机器的 网页浏览器 里面的 客户端java程序。相反，一个 servlet 是跑在网页服务器的服务的容器。一个 applet 能使用用户界面class， 而一个 servlet 不能够有一个用户界面。相反，一个servlet 等待客户端的 HTTP 请求并为每一个请求生成一个响应。

####94. GenericServlet 和 HttpServlet 的区别是什么 ?
GenericServlet 是一个实现了Servlet 和 ServletConfig  接口的通用的协议无关的 servlet . 那些继承于GenericServlet 类的 servlet 将重写 service 方法 。最后想提的是，为了给Web用户开发一个使用HTTP协议服务的HTTP servlet， 你的 servlet 必须改为继承于 HttpServlet 。[查看Servlet的示例](http://examples.javacodegeeks.com/tag/servlet/)  。

####95.解释一个Servlet的生命周期.
对每一个客户端的请求，这个Servlet引擎加载servlet和调用它的init方法，以便在servlet初始化。然后， Servlet对象处理所有从客户端来的后续请求，通过为每个请求单独调用服务的方法。最后，该servlet调用服务器的destroy方法。

####96 .doGet()和doPost()之间的区别是什么？
doGet ： GET方法附加请求的URL的名称 - 值对。因此，存在客户端的请求字符数量的限制。此外，该请求的参数值为可见，因此，如果有敏感信息不能采用这种方式。     
doPost： POST方法克服了GET请求的限制，将发送请求的值置于body里。此外，发送值的数量没有限制。最后，通过POST请求传递的敏感信息是不可见的

####97. web应用是什么 ?
web应用是web服务的延伸. 主要有两种类型：面向视觉的和面向服务的. 面向视觉型的应用通过编辑语言来动态展示交互页面. 面向应用的则提供了后端的service.总的来说，就是一堆置于 server's URL明明空间下的servlets.

####98. 什么是服务端包含 (SSI) ?
服务端包含是服务端的一种简单脚本语言,主要应用在Web方面，置于servlet标签中. 最常用的地方就是在网页中引入一个或多个文件. 当浏览器加载页面时，使用servlet产生的超文本替换其标签.

####99. 什么是 Servlet 链?
Servlet 链是指将上一个servlet的结果传到下一个.第二个的结构又可以传到第三个. 最后的servlet负责将响应回复给客户端.

####100. 如何知道请求 servlet的客户端信息 ?
ServletRequest类可以获取客户端的IP地址或主机名. getRemoteAddr()获取IP getRemoteHost()获取主机名. 示例如下 [here](http://examples.javacodegeeks.com/enterprise-java/servlet/get-client-s-address-and-hostname-in-servlet/).

####101. Http response的结构是什么 ?
HTTP response 包括了三个部分:
* Status Code: 描述了这次回应的状况. 它可以用来检查这次请求是否成功完成. 一旦请求失败了, 这个status code可以用来寻找原因. 如果你的 servlet 没有返回一个status code, 默认就会返回成功的status code, HttpServletResponse.SC_OK.
* HTTP Headers: 它包含了response的更多信息.举个例子，headers可以反应response的访问date/time, 或者是用于将实体安全地传送到用户的编码形式。可以阅读 [how to retrieve headers in Servlet here.](http://examples.javacodegeeks.com/enterprise-java/servlet/get-all-request-headers-in-servlet/)
* Body: 它是response的具体内容. 可能包括HTML内容,比如图片。Body包括了紧接Header发送的HTTP事务消息数据字节。

####102. 什么是cookie？session和cookie之间的区别是什么？
Cookie是Web服务器发送到浏览器的一小块信息，浏览器为每个Web服务器在本地文件中存储cookie。 在以后的请求里, 浏览器对特定的Web服务器，将request和所有特定的Web服务器的cookie一起发送。Session和Cookie之间的区别如下：
* Session无论在客户端浏览器的设置都可以工作。客户端可以选择禁用cookies。然而，Session仍然可以工作，因为客户端没有能力在服务器端禁用Session。
* Session和cookie也t有不同的信息存储量。 HTTP会话能够存储任何Java对象，而一个cookie只能保存String对象。

####103.浏览器和servlet通过什么协议通信  ?
HTTP协议.

####104. 什么是HTTP通道 ?
通道是指使用 HTTP或 HTTPS 封装其它的网络协议. HTTP包装了其他的网络通信协议. 其它协议通过HTTP来发送请求的过程就使用了通道.

####105.  sendRedirect和 forward 方法的区别?
 sendRedirect创建一个新的请求,  forward只是将请求转发.之前请求中包含的对象在redirect后将不可用, 因为产生了一个新的请求. 但是 forwarding不受此限制.通常来说,sendRedirect 比 forward 方法慢一些.
 
####106. 什么是URL编码和解码 ?
URL编码就是替换其中的空格和特殊字符, 变成相应的Hex码.解码就是反向操作。