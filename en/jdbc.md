#JDBC

####72. What is JDBC ? 
JDBC is an abstraction layer that allows users to choose between databases. [JDBC enables developers to write database applications in Java](http://www.javacodegeeks.com/2014/03/java-8-friday-java-8-will-revolutionize-database-access.html), without having to concern themselves with the underlying details of a particular database.

####73. Explain the role of Driver in JDBC. 
The JDBC Driver provides vendor-specific implementations of the abstract classes provided by the JDBC API. Each driver must provide implementations for the following classes of the java.sql package:[Connection](http://docs.oracle.com/javase/7/docs/api/java/sql/Connection.html), [Statement](http://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html), [PreparedStatement](http://docs.oracle.com/javase/7/docs/api/java/sql/PreparedStatement.html), [CallableStatement](http://docs.oracle.com/javase/7/docs/api/java/sql/CallableStatement.html), [ResultSet](http://docs.oracle.com/javase/7/docs/api/java/sql/ResultSet.html) and [Driver](http://docs.oracle.com/javase/7/docs/api/java/sql/Driver.html).

####74. What is the purpose Class.forName method ?
This method is used to method is used to load the driver that will establish a connection to the database.

####75. What is the advantage of PreparedStatement over Statement ? 
PreparedStatements are precompiled and thus, [their performance is much better](http://examples.javacodegeeks.com/core-java/sql/batch-statement-execution-example/). Also, PreparedStatement objects can be reused with different input values to their queries.

####76. What is the use of CallableStatement ? 
Name the method, which is used to prepare a CallableStatement. A [CallableStatement](http://docs.oracle.com/javase/7/docs/api/java/sql/CallableStatement.html) is used to execute stored procedures. Stored procedures are stored and offered by a database. Stored procedures may take input values from the user and may return a result. The usage of stored procedures is highly encouraged, because it offers security and modularity.The method that prepares a [CallableStatement](http://docs.oracle.com/javase/7/docs/api/java/sql/CallableStatement.html) is the following:

```
CallableStament.prepareCall();
```

####77. What does Connection pooling mean ? 
The interaction with a database can be costly, regarding the opening and closing of database connections. Especially, when the number of database clients increases, this cost is very high and a large number of resources is consumed.A pool of database connections is obtained at start up by the application server and is maintained in a pool. A request for a connection is served by [a connection residing in the pool](http://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-connection-pool-configuration-with-c3p0-example/). In the end of the connection, the request is returned to the pool and can be used to satisfy future requests.