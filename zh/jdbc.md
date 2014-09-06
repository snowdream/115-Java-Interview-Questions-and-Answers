#JDBC

####72. 什么是 JDBC ？
JDBC是一个抽象层，允许用户在不同数据库间进行选择。[JDBC使开发人员能够在Java中编写数据库应用程序](http://www.javacodegeeks.com/2014/03/java-8-friday-java-8-will-revolutionize-database-access.html)，而不必让自己关心一个特定的数据库的底层细节。

####73. 解释JDBC中驱动的作用。
JDBC驱动提供了 对 JDBC API 所提供的抽象类 的 数据库供应商的特定实现。每个驱动必须提供java.sql包的以下的类实现：[Connection](http://docs.oracle.com/javase/7/docs/api/java/sql/Connection.html),[Statement](http://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html),[PreparedStatement](http://docs.oracle.com/javase/7/docs/api/java/sql/PreparedStatement.html),[CallableStatement](http://docs.oracle.com/javase/7/docs/api/java/sql/CallableStatement.html),[ResultSet](http://docs.oracle.com/javase/7/docs/api/java/sql/ResultSet.html) 和 [Driver](http://docs.oracle.com/javase/7/docs/api/java/sql/Driver.html)。

####74.Class.forName 方法的目的是什么?
此方法用于加载驱动程序，以建立与数据库的连接。

####75.与Statement相比PreparedStatement的优点?
PreparedStatement是预编译的，因此它有更好的性能。另外，PreparedStatement可以被不同输入值的查询重用。

####76. CallableStatement的用途 ? 指出用于创建CallableStatement的方法.
[CallableStatement](http://docs.oracle.com/javase/7/docs/api/java/sql/CallableStatement.html)用于执行存储过程。存储过程由数据库保存并提供。存储过程可以根据用户的输入返回结果。强烈建议使用存储过程，因为它提供了安全性和模块化。准备CallableStatement的方法如下：
CallableStament.prepareCall();

####77. 连接池是什么 ?
打开和关闭数据库连接时与数据库的交互需要付出很高的代价. 特别是当数据库客户端增长时，这个代价是相当高的，并且消耗了很多资源。数据库连接池中的连接在应用服务器启动时被创建并在池中进行管理。一个连接请求由池中的数据库连接提供。当连接结束后，请求会被放回池中以供以后重用。