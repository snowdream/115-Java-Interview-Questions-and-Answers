#Garbage Collectors

####35. What is the purpose of garbage collection in Java, and when is it used ? 
The purpose of garbage collection is to identify and discard those objects that are no longer needed by the application, in order for the resources to be reclaimed and reused.

####36. What does System.gc() and Runtime.gc() methods do ?
These methods can be used as a hint to the JVM, in order to start a garbage collection. However, this it is up to the Java Virtual Machine (JVM) to start the garbage collection immediately or later in time.

####37. When is the finalize() called ? What is the purpose of finalization ? 
The finalize method is called by the garbage collector, just before releasing the object’s memory. It is normally advised to release resources held by the object inside the finalize method.

####38. If an object reference is set to null, will the Garbage Collector immediately free the memory held by that object ? 
No, the object will be available for garbage collection in the next cycle of the garbage collector.

####39. What is structure of Java Heap ? What is Perm Gen space in Heap ?
The JVM has a heap that is the runtime data area from which memory for all class instances and arrays is allocated. It is created at the JVM start-up. Heap memory for objects is reclaimed by an automatic memory management system which is known as a garbage collector. Heap memory consists of live and dead objects. Live objects are accessible by the application and will not be a subject of garbage collection. Dead objects are those which will never be accessible by the application, but have not been collected by the garbage collector yet. Such objects occupy the heap memory space until they are eventually collected by the garbage collector.

####40. What is the difference between Serial and Throughput Garbage collector ? 
The throughput garbage collector uses a parallel version of the young generation collector and is meant to be used with applications that have medium to large data sets. On the other hand, the serial collector is usually adequate for most small applications (those requiring heaps of up to approximately 100MB on modern processors).

####41. When does an Object becomes eligible for Garbage collection in Java ? 
A Java object is subject to garbage collection when it becomes unreachable to the program in which it is currently used.

####42. Does Garbage collection occur in permanent generation space in JVM ? 
Garbage Collection does occur in PermGen space and if PermGen space is full or cross a threshold, it can trigger a full garbage collection. If you look carefully at the output of the garbage collector, you will find that PermGen space is also garbage collected. This is the reason why correct sizing of PermGen space is important to avoid frequent full garbage collections. Also check our article [Java 8: PermGen to Metaspace](http://www.javacodegeeks.com/2013/02/java-8-from-permgen-to-metaspace.html).