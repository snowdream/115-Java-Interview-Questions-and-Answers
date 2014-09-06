#异常处理 

####43. Java中的两种异常是什么?它们之间的区别?
Java有两种类型的异常:checked与unchecked(检查与未检查) 异常. 如果unchecked异常可能会在方法或构造函数的执行时被抛出从而蔓延到方法或构造函数的外部, 它们也不需要要在方法或构造函数中声明throws子句. 然而, checked异常必须通过方法或构造函数的throws子句声明. 关于java异常处理的建议请参考这里[Java exception handling](http://www.javacodegeeks.com/2013/07/java-exception-handling-tutorial-with-examples-and-best-practices.html).

####44. Java中异常与错误的区别?
[Exception](http://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html)和[Error](http://docs.oracle.com/javase/7/docs/api/java/lang/Error.html)都是[Throwable](http://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html)类的子类. [Exception](http://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html)用于用户程序需要捕获的异常条件. [Error](http://docs.oracle.com/javase/7/docs/api/java/lang/Error.html)定义了用户程序不可预见的异常

####45. throw与throws的区别 ?
关键字throw用于在程序中显式地抛出一个异常. 相反, throws子句用于指出在该方法中没有处理的异常. 每个方法必须显式指明哪些异常没有处理, 以便该方法的调用者可以预防可能发生的异常. 最后, 多个异常用逗号分隔.

####45. 异常处理中finally语句块的重要性?
不管程序是否发生了异常, finally语句块都会被执行. 甚至当没有catch声明但抛出了一个异常时, finally语句块也会被执行. 最后要说一点: finally语句块通常用于释放资源, 如I/O缓冲区, 数据库连接等等.

####46. 异常被处理后异常对象会发生什么?
异常对象会在下次gc执行时被回收.

####47. 怎样区分finally语句块与finalize()方法?
不管是否抛出异常finally语句块都会被执行, 它通常用于释放程序持有的资源. finalize是Object类中的一个protected方法, 当一个对象被gc回收前它会被jvm调用.