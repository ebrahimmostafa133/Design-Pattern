Factory Method Pattern
======================

Purpose
-------
The Factory Method pattern defines an interface for creating an object, but lets subclasses decide
which class to instantiate. It lets a class defer instantiation to subclasses.

This folder contains a small Java example demonstrating the Factory Method:

- `Product.java` — product interface
- `ConcreteProductA.java`, `ConcreteProductB.java` — concrete products
- `Creator.java` — abstract creator with `factoryMethod()`
- `ConcreteCreatorA.java`, `ConcreteCreatorB.java` — concrete creators that override the factory method
- `FactoryDemo.java` — runs the example

How to compile & run
----------------------
```
cd "Desktop/ITI/Design Pattern Study/creational/factory/java"
javac *.java
java FactoryDemo
```

Notes
-----
- Examples use the default package for simplicity. Add a package declaration if you integrate into a project.
- The factory method decouples client code from concrete product classes.
