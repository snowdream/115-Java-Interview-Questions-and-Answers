#[Swing](http://examples.javacodegeeks.com/desktop-java/swing/)

####57. Choice和List之间的区别是什么？
Choice是一种紧凑的方式展示，必须要拉下，是为了让用户能够看到所有的可选选项列表。Choice只能选中一个选项。List是以几个List选项是可见的方式展示的。List支持选中一个或多个List选项。

####58. 什么是布局管理器？
布局管理器是用来组织容器内的组件。

####59. Scrollbar和JScrollPane 的区别是什么？
[Scrollbar](http://docs.oracle.com/javase/7/docs/api/java/awt/Scrollbar.html)是一个[组件](http://docs.oracle.com/javase/7/docs/api/java/awt/Component.html)， 但不是一个[容器](http://docs.oracle.com/javase/7/docs/api/java/awt/Container.html)，而[ScrollPane](http://docs.oracle.com/javase/7/docs/api/javax/swing/JScrollPane.html)是一个[容器](http://docs.oracle.com/javase/7/docs/api/java/awt/Container.html)。 [ScrollPane](http://docs.oracle.com/javase/7/docs/api/javax/swing/JScrollPane.html)处理它自身的事件并执行它自己的滑动。

####60. 哪些Swing方法是线程安全？
只有3个方法是线程安全的：repaint, revalidate, 和invalidate。

####61. 说出3个支持绘图的子类。
[Canvas](http://docs.oracle.com/javase/7/docs/api/java/awt/Canvas.html),[Frame](http://docs.oracle.com/javase/7/docs/api/java/awt/Frame.html),[Panel](http://docs.oracle.com/javase/7/docs/api/java/awt/Panel.html), 和Applet类都支持绘图。

####62. 什么是裁剪？
裁剪是指在有限的区域和图形类进行绘图操作。

####63. MenuItem和CheckboxMenuItem的区别是什么？
[CheckboxMenuItem](http://docs.oracle.com/javase/7/docs/api/java/awt/CheckboxMenuItem.html)类继承了[MenuItem](http://docs.oracle.com/javase/7/docs/api/java/awt/MenuItem.html)类，并支持选中或者取消菜单选项。

####64. BorderLayout的元素是怎样组织的？
[BorderLayout](http://docs.oracle.com/javase/7/docs/api/java/awt/BorderLayout.html)的元素都是在有序地分布在边缘部分(东，南，西，北)和容器的中心。

####65. GridBagLayout的元素是怎样组织的？
[GridBagLayout](http://docs.oracle.com/javase/7/docs/api/java/awt/GridBagLayout.html)的元素根据网格组织的。元素具有不同的尺寸，并且可以占据一行或列的网格。因此，行和列可以有不同的尺寸。

####66. Window和Frame有什么区别？
[Frame](http://docs.oracle.com/javase/7/docs/api/java/awt/Frame.html)类是继承[Window](http://docs.oracle.com/javase/7/docs/api/java/awt/Window.html)类，并定义了一些主要的带菜单栏的应用程序窗口。

####67. 裁剪和重画之间的关系？
当窗口被AWT绘图线程重画，它设置了裁剪区域到窗口中请求重画的区域。

####68. 事件监听器接口和事件适配器类之间是什么关系？
事件监听器接口定义了一个特定事件的事件处理程序所必须实现的一些方法。事件适配器提供了一个事件侦听器接口的默认实现。

####69. 一个GUI组件怎么处理自己的事件？
GUI组件可以通过实现相应的事件监听器接口和添加它自己作为本身的事件侦听器来处理自己的事件。

####70. Java布局管理器提供超过传统的窗口系统的什么样的优势？
Java使用布局管理器以一致的方式来布局组件，跨所有窗口平台。由于布局管理器不绑定绝对化的尺寸和位置，所以它们能够容纳不同窗口系统的平台具体差异。

####71. Java为所有Swing组件使用的设计模式是什么？
Java为所有Swing组件使用的设计模式是是 模型视图控制器（MVC）模式。