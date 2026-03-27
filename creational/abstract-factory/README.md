Abstract Factory Pattern
========================

Purpose
-------
Provide an interface for creating families of related or dependent objects without specifying their
concrete classes. The Abstract Factory is useful when a system should be independent of how its
products are created and when products from the same family must be used together.

This folder contains a small Java example demonstrating the Abstract Factory:

- `AbstractFactory.java` — factory interface
- `AbstractProductA.java`, `AbstractProductB.java` — product family interfaces
- `ConcreteProductA1/2`, `ConcreteProductB1/2` — concrete products in two families
- `ConcreteFactory1.java`, `ConcreteFactory2.java` — concrete factories producing compatible products
- `AbstractFactoryDemo.java` — runs the example

How to compile & run
----------------------
```
cd "Desktop/ITI/Design Pattern Study/creational/abstract-factory/java"
javac *.java
java AbstractFactoryDemo
```

Notes
-----
- Examples use the default package for simplicity. Add package declarations if you integrate into a project.
- The demo shows how the client uses a factory to obtain products and how products from the same factory
  are compatible.
