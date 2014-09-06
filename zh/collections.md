
##Java Collections

####18. Java Collections框架的基本接口 ?
[Java Collections](http://docs.oracle.com/javase/7/docs/technotes/guides/collections/overview.html) 框架 提供了一系列支持对象集合操作的设计良好的接口和类. Java Collections框架中最基础的接口是:
* [Collection](http://docs.oracle.com/javase/7/docs/api/java/util/Collection.html), 表示一组对象(元素).
* [Set](http://docs.oracle.com/javase/7/docs/api/java/util/Set.html), 包含非重复元素的集合.
* [List](http://docs.oracle.com/javase/7/docs/api/java/util/List.html), 包含非重复元素的有序集合.
* [Map](http://docs.oracle.com/javase/7/docs/api/java/util/Map.html), 包含非重复键的键值对的对象.

####19. 为什么Collection没有继承Cloneable和Serializable接口 ?
[Collection](http://docs.oracle.com/javase/7/docs/api/java/util/Collection.html)接口描述的是由元素组成的对象组. Collection的每一个具体实现可以选择自己的方式来管理元素. 一些集合允许存在重复键, 另一些则不允许.     
当处理实际实现时复制和序列化的语义和效果才会起作用. 因此, 集合类的具体实现应该决定它们将怎样被复制和序列化.

####20. 什么是Iterator(叠代器) ?
[Iterator](http://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html)接口提供了许多能够叠代集合的方法.每个java集合([Collection](http://docs.oracle.com/javase/7/docs/api/java/util/Collection.html))都含有一个返回Iterator实例的iterator方法. 叠代器在叠代过程中能够移除底层集合中的元素.

####21. Iterator 和ListIterator之间的不同 ?
它们之间的不同如下:
* [Iterator](http://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html)能够遍历Set和List集合, 而ListIterator只能用来遍历List.
* [Iterator](http://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html)只能正向遍历集合, 而ListIterator可以双向遍历List.
* [ListIterator](http://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html)实现了[Iterator](http://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html)接口并提供了额外的功能, 例如添加元素, 替换元素, 取得上一个或上一个元素索引, 等等.

####22. fail-fast与fail-safe的区别?
Iterator的fail_safe特性是对底层集合的拷贝进行操作, 因此对集合的任何改变都不会有影响. java.util包下的所有集合类是fail-fast的, 但java.util.concurrent包下的集合类是fail-safe的. fail-fast叠代器会抛出[ConcurrentModificationException](http://docs.oracle.com/javase/7/docs/api/java/util/ConcurrentModificationException.html), 而fail-safe叠代器不会抛出这种异常.

####23. Java中的 HashMap 是怎么工作的?
[Java 中的 HashMap 是用来存储键值对](http://www.javacodegeeks.com/2014/03/how-hashmap-works-in-java.html)的。 [HashMap](http://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html)  需要一个 hash 函数，它使用 hashCode 和 equals 方法，来进行 collection 中元素的保存和查找。调用 put 方法时，[HashMap](http://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html) 会计算键(key)的 hash 值，然后将键值对存到 collection 的适当索引下。如果键已经存在，那么相应的值会更新。[HashMap](http://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html)  的重要特征主要有它的容量，装载因子(load factor)和容量扩充(threshold resizing)。

####24. hashCode() 和 equals() 方法重要性何在 ?
Java中的 [HashMap](http://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html)  使用 [hashCode](http://docs.oracle.com/javase/7/docs/api/java/lang/Object#hashCode%28%29) 和 [equals](http://docs.oracle.com/javase/7/docs/api/java/lang/Object#equals%28java.lang.Object%29)方法来确定键值对的索引。根据键去查询对应的值时，同样会用到这两个方法。如果这两个方法没有正确实现，两个不同的键可能会产生相同的 hash 值，因此会被 collection 认为是相同的。并且，这两个方法在检测重复时也会用到。因此，这两个方法都要正确实现，对 [HashMap](http://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html)  的正确性和效率都至关重要。

####25.HashMap与HashTable之间有哪些不同？
HashMap、HashTable这两个类都实现了Map接口，因此有些非常相似的特征，但他们在以下特性中又有所不同：
* HashMap的key与value都允许null值的存在，而HashTable则既不允许key为null，也不允许value为null。
* HashTable是线程同步的，而HashMap则不是。因此，在单线程环境下HashMap是首选，而HashTable更适合在多线程环境下使用。
* HashMap提供了它键的set集合，因此Java程序可以通过set进行迭代。因此，HashMap是快速失败的。另一方面，HashTable提供了它键的枚举。
* HashTable类被当做遗留类（译者注：[Java遗留类说明](http://stackoverflow.com/questions/21086307/what-are-the-legacy-classes-in-java)）

####26.Array与ArrayList间有什么不同？与ArrayList相比你什么时候会用Array？
Array与ArrayList类在以下特性中有所区别：
* Arrays可以包含基础数据类型或者对象，而ArrayList只能包含对象。
* Arrays有固定长度，而ArrayList长度则是动态的。
* ArrayList类提供了更多的方法和特性，比如addAll,removeAll,iterator,等等
* 对于一个基础数据类型的list，集合框架使用了自动装箱去减少编码的工作。但针对固定长度的的基础数据类型，这种方法会使得它们变得更慢。

####27.ArrayList与LinkedList间有什么不同？
ArrayList、LinkedList这两个类都实现了List接口，但他们以下特性中又有所不同：
* ArrayList是基于索引的数据结构，底层由Array支持实现。它提供了以时间复杂度为O(1)的性能随机访问它的元素，另一方面，LinkedList以元素列表的方式来存储它的数据，每一个元素与它前一个和后一个元素都是相连的。对元素查询操作的时间复杂度为O(n).
* 对元素的插入、添加、移除操作，与ArrayList相比，LinkedList更快，因为，当一个元素被添加到集合内部的任意位置时，LinkedList不需要重新调整数组大小或者更新索引。
* LinkedList比ArrayList消耗更多的内存，因为LinkedList中每一个节点都存储了两个引用，一个是它前一个元素，一个是它后一个元素
也可以查看我们的文章[ArrayList vs. LinkedList](http://www.javacodegeeks.com/2013/12/arraylist-vs-linkedlist.html)

####28. Comparable 和 Comparator 接口分别是什么 ? 列出它们的区别。
Java 提供的 [Comparable](http://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html) 接口，其中只包含一个方法，就是 [compareTo](http://docs.oracle.com/javase/7/docs/api/java/lang/Comparable#compareTo%28T%29)。这个方法会比较两个对象，从而得出它们的顺序关系。具体来说，它会返回一个负整数，零，或一个正整数，分别表示传入的对象小于，等于或大于已有的对象。
Java 提供的 [Comparator](http://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html) 接口，包含两个方法，[compare](http://docs.oracle.com/javase/7/docs/api/java/util/Comparator#compare%28T,%20T%29) 和 [equals](http://docs.oracle.com/javase/7/docs/api/java/util/Comparator#equals%28java.lang.Object%29) 。compare 方法比较两个参数，得出它们的顺序关系。它会返回一个负整数，零，或一个正整数，分别表示第一个参数小于，等于或大于已有的对象。equals 方法有1个参数，它用来确定参数对象是否等于这个 camparator。这个方法仅在要比较的对象也是一个 comparator，同时它的序关系与这个 comparator 相同时，才会返回 true。

####29.Java Priority Queue是什么?
PriorityQueue是一个基于优先级堆的无界队列，它的元素都以他们的自然顺序有序排列。在它创建的时候，我们可以可以提供一个比较器(Comparator)来负责PriorityQueue中元素的排序。PriorityQueue不允许null元素，不允许不提供自然排序的对象，也不允许没有任何关联Comparator的对象。最后，PriorityQueue不是线程安全的，在执行入队和出队操作它需要O(log(n))的时间复杂度。

####30. 关于Big-O符号你了解些什么？你能针对不同数据结构举些例子吗？
Big-O符号简单描述了，在一种数据结构中随着元素的不断增加，在最坏的情况下，一个算法的扩展或者执行能有多好。Big-O符号还可以用来描述其他的行为，比如内存消耗。由于collection集合下的类实际上都是数据结构，我们通常用Big-O符号来选择基于时间、内存、性能前提下的最好实现去使用。Big-O符号能就大量数据的性能给出一个很好的指示。

####31. 如何权衡有序数组和无序数组 ?
有序数组最关键的优势在于搜索的时间复杂度为 O(log n)，而无序数组的时间复杂度是 O (n)。有序数组的劣势就在于插入操作的时间复杂度为 O(n)，因为较高值的元素需要挪动位置腾出空间给新元素。与之不同的是，无序数组的插入操作的时间复杂度为 O(1)。

####32. 有哪些关于 Java 集合框架的最佳实践？
* 基于应用的需求来选择使用正确类型的集合，这对性能来说是非常重要的。例如，如果元素的大小是固定的，并且知道优先级，我们将会使用一个 [Array](http://docs.oracle.com/javase/7/docs/api/java/lang/reflect/Array.html)，而不是 [ArrayList](http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html)。
* 一些集合类允许我们指定他们的初始容量。因此，如果我们知道存储数据的大概数值，就可以避免重散列或者大小的调整。
* 总是使用泛型来保证类型安全，可靠性和健壮性。同时，使用泛型还可以避免运行时的 [ClassCastException](http://docs.oracle.com/javase/7/docs/api/java/lang/ClassCastException.html)。
* 在 Map 中使用 Java Development Kit (JDK) 提供的不可变类作为一个 key，这样可以避免 [hashCode](http://docs.oracle.com/javase/7/docs/api/java/lang/Object#hashCode%28%29) 的实现和我们自定义类的 equals 方法。
* 应该依照接口而不是实现来编程。
* 返回零长度的集合或者数组，而不是返回一个 null ，这样可以防止底层集合是空的。

####33. Enumeration 和 Iterator 接口有什么不同 ?
[Enumeration](http://docs.oracle.com/javase/7/docs/api/java/util/Enumeration.html) 跟 Iterator 相比较快两倍，而且占用更少的内存。但是，[Iterator](http://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html) 相对于 Enumeration 更安全，因为其他线程不能修改当前迭代器遍历的集合对象。同时，Iterators 允许调用者从底层集合中移除元素，这些 Enumerations 都没法完成。

####34. HashSet 和TreeSet 有什么不同?
[HashSet](http://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html) 是用一个 hash 表来实现的，因此，它的元素是无序的。添加，删除和 HashSet 包括的方法的持续时间复杂度是 O(1)。    
另一个方面，TreeSet 是用一个树形结构实现的，因此，它是有序的。添加，删除和 TreeSet 包含的方法的持续时间复杂度是  O(logn)。  