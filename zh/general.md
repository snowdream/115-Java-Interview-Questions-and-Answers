#有关Java的一般问题

####1. 什么是JVM? 为什么称Java为跨平台的编程语言?
Java虚拟机(Java Virtual Machine)是可以执行Java字节码的[虚拟机](http://www.javacodegeeks.com/2013/12/part-1-of-3-synopsis-of-articles-videos-on-performance-tuning-jvm-gc-in-java-mechanical-sympathy-et-al.html)，每个Java源文件将被编译成[字节码](http://www.javacodegeeks.com/2013/12/mastering-java-bytecode.html)文件，然后在JVM中执行。Java之所以被设计成可以在任意的平台运行，而不需要重写或者在不同的平台下重新编译，这些都要归功于Java虚拟机(JVM),因为JVM非常了解特定的指令的长度以及底层硬件平台的特殊性。

####2. JDK和JRE之间的差异是什么？
Java运行环境(Java Runtime Enviroment) 是运行Java程序的基本的Java虚拟机，包括执行applet的浏览器插件。JDK (Java Development Kit) 是为了开发，编译和执行Java应用程序，针对Java的全功能的软件开发包，包含了JRE，编译器和工具(比如说  [JavaDoc](http://docs.oracle.com/javase/7/docs/technotes/tools/windows/javadoc.html) 和[Java Debugger](http://docs.oracle.com/javase/7/docs/technotes/tools/windows/jdb.html))。

####3. “static” 关键字是什么意思？在Java里可以 override private 或 static 的方法吗？ keyword mean ? Can you override private or static method in Java ?
static 关键字表示，访问这个成员变量或方法时，不必获取它属于的类的实例。
[Java 里的 static 方法](http://www.javacodegeeks.com/2012/05/java-static-methods-can-be-code-smell.html)不能被 override，因为 override 的机制是运行时(runtime)的动态绑定，而 static 方法是在编译时静态绑定的。static 方法并不与任何类的具体实例有关，因此无法应用继承的概念。

####4. 在静态方法里可以访问非静态变量吗?
Java 中的 static 变量归相应的类所有，它的值对于类的所有实例都是相同的。static 变量是在 JVM 加载类的时候初始化的。如果代码试图访问非静态的变量，而且不是通过类的实例去访问，编译器会报错，因为这些非静态变量还没有被创建呢，并且它们没有与实例相关联。

####5. Java 支持哪些数据类型？什么是 Autoboxing 和 Unboxing？
Java语言支持的8个基本数据类型如下：
* byte
* short
* int
* long
* float
* double
* boolean
* char

Autoboxing 是指在基本数据类型和对应的包装(wrapper)类之间[Java 编译器所做的自动转换](http://www.javacodegeeks.com/2013/07/java-generics-tutorial-example-class-interface-methods-wildcards-and-much-more.html)。例如，编译器将 int 转换为 [Integer](http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html?is-external=true)，将 double 转换为 [Double])(http://docs.oracle.com/javase/7/docs/api/java/lang/Double.html)，等等。逆向的转换称为 unboxing。

####6. 在Java中什么是方法的 Override(覆盖) 和 Overload(重载)?
Java中方法的 overload 发生的条件是，同一个类里，有两个或以上的方法名称完全相同，但参数列表不同。另一方面，方法的 override 是指，子类重定义了父类里的同一个方法。Override 的方法必须方法名、参数列表和返回类型都完全相同。Override 的方法不会限制原方法的访问权限。

####7.Java中构造函数、构造函数重载的概念和拷贝构造函数 
当类的对象被创建的时候，调用它的构造函数。每个类都有一个构造函数。如果程序员没有为类编写构造函数，Java编译器自动为类创建一个缺省的构造函数。 
构造函数重载和Java中函数重载类似，可以为同一个类创建不同的构造函数，每个构造函数必须拥有唯一的参数列表。 
Java与C++不同，它不支持拷贝构造函数，但是区别仅仅是，如果你没有编写类的拷贝构造函数，Java不会自动创建它。 

####8.Java支持多继承吗？ 
Java不支持多继承，每个类只允许继承一个类，但是可以实现多个接口。 

####9.接口和抽象类有什么不同？
Java同时提供和支持抽象类和接口，它们的实现有一些共同的特点，也有如下不同：
* 接口中所有的方法默认都是抽象的，而抽象类可以同时包含抽象和非抽象的方法。
* 一个类可以实现多个接口，但它只能继承一个抽象类。
* 一个类要实现某个接口，必须实现这个接口声明的所有方法。而一个类不需要实现抽象父类中声明的所有方法，不过，这时候这个类也必须声明为抽象类。
* 抽象类可以实现接口，而且不需要实现接口中的方法。
* 接口中声明的变量默认是final的，而抽象类可以包含非final的变量。
* 接口中的成员默认是public的，而抽象类的成员可以是private，protected，或public的。
* 接口是绝对抽象的，不可实例化，抽象类也不可以实例化，但可以在main方法中触发实例化（注：通过匿名类实现）。

也可以查阅 [Abstract class and Interface differences for JDK 8 ](http://www.oschina.net/translate/abstract-class-versus-interface-in-the-jdk-8-era.html)  。  

####10.传引用和传值  
当对象通过传值调用时，传递的是这个对象的一个拷贝。因此，即使函数修改这个对象，也不会影响原对象的值。  
当对象通过传引用调用时，对象本身没有被传递，而传递的是对象的一个引用。因此，外部函数对这个对象的修改，也会反映到任何出现这个对象的地方。    