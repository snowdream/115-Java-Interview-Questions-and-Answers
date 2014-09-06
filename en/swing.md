#[Swing](http://examples.javacodegeeks.com/desktop-java/swing/)

####57. What is the difference between a Choice and a List ? 
A Choice is displayed in a compact form that must be pulled down, in order for a user to be able to see the list of all available choices. Only one item may be selected from a Choice. A List may be displayed in such a way that several List items are visible. A List supports the selection of one or more List items.

####58. What is a layout manager ?
A layout manager is the used to organize the components in a container.

####59. What is the difference between a Scrollbar and a JScrollPane ?
A [Scrollbar](http://docs.oracle.com/javase/7/docs/api/java/awt/Scrollbar.html) is a Component, but not a [Container](http://docs.oracle.com/javase/7/docs/api/java/awt/Container.html). A [ScrollPane](http://docs.oracle.com/javase/7/docs/api/javax/swing/JScrollPane.html) is a Container. A [ScrollPane](http://docs.oracle.com/javase/7/docs/api/javax/swing/JScrollPane.html)  handles its own events and performs its own scrolling.

####60. Which Swing methods are thread-safe ?
There are only three thread-safe methods: repaint, revalidate, and invalidate.

####61. Name three Component subclasses that support painting.
The [Canvas](http://docs.oracle.com/javase/7/docs/api/java/awt/Canvas.html), [Frame](http://docs.oracle.com/javase/7/docs/api/java/awt/Frame.html), [Panel](http://docs.oracle.com/javase/7/docs/api/java/awt/Panel.html), and Applet classes support painting.

####62. What is clipping ?
Clipping is defined as the process of confining paint operations to a limited area or shape.

####63. What is the difference between a MenuItem and a CheckboxMenuItem ?
The [CheckboxMenuItem](http://docs.oracle.com/javase/7/docs/api/java/awt/CheckboxMenuItem.html) class extends the [MenuItem](http://docs.oracle.com/javase/7/docs/api/java/awt/MenuItem.html) class and supports a menu item that may be either checked or unchecked.

####64. How are the elements of a BorderLayout organized ? 
The elements of a [BorderLayout](http://docs.oracle.com/javase/7/docs/api/java/awt/BorderLayout.html) are organized at the borders (North, South, East, and West) and the center of a container.

####65. How are the elements of a GridBagLayout organized ? 
The elements of a [GridBagLayout](http://docs.oracle.com/javase/7/docs/api/java/awt/GridBagLayout.html) are organized according to a grid. The elements are of different sizes and may occupy more than one row or column of the grid. Thus, the rows and columns may have different sizes.

####66. What is the difference between a Window and a Frame ? 
The [Frame](http://docs.oracle.com/javase/7/docs/api/java/awt/Frame.html) class extends the [Window](http://docs.oracle.com/javase/7/docs/api/java/awt/Window.html) class and defines a main application window that can have a menu bar.

####67. What is the relationship between clipping and repainting ? 
When a window is repainted by the AWT painting thread, it sets the clipping regions to the area of the window that requires repainting.

####68. What is the relationship between an event-listener interface and an event-adapter class ? 
An event-listener interface defines the methods that must be implemented by an event handler for a particular event. An event adapter provides a default implementation of an event-listener interface.

####69. How can a GUI component handle its own events ? 
A GUI component can handle its own events, by implementing the corresponding event-listener interface and adding itself as its own event listener.

####70. What advantage do Java’s layout managers provide over traditional windowing systems ? 
Java uses layout managers to lay out components in a consistent manner, across all windowing platforms. Since layout managers aren’t tied to absolute sizing and positioning, they are able to accomodate platform-specific differences among windowing systems.

####71. What is the design pattern that Java uses for all Swing components ? 
The design pattern used by Java for all Swing components is the Model View Controller (MVC) pattern.