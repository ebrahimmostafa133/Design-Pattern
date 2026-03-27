Builder Pattern
===============

Purpose
-------
The Builder pattern separates the construction of a complex object from its representation so the same
construction process can create different representations. It is especially useful when an object:

- Requires several steps to construct
- Has many optional parameters
- Needs to be immutable or assembled in a controlled sequence

This folder contains two small Java examples illustrating two common Builder styles:

1) Classic Builder + Director
   - `House.java` (product)
   - `HouseBuilder.java` (builder interface)
   - `ConcreteHouseBuilder.java` and `LuxuryHouseBuilder.java` (different concrete builders)
   - `Director.java` (directs build steps)
   - `BuilderDemo.java` (runs the example)

2) Fluent (static nested) Builder
   - `HouseFluent.java` (immutable product with `Builder` inner class)
   - `FluentDemo.java` (runs the fluent example)

How to compile & run
----------------------
Open a terminal in this directory and run:

```
cd "Desktop/ITI/Design Pattern Study/creational/builder/java"
javac *.java
java BuilderDemo
java FluentDemo
```

Why both styles?
- Classic + Director: useful when construction steps are complex or shared across multiple builders.
- Fluent Builder: concise API for creating immutable objects with many optional parameters.

Notes
-----
- The examples use the default package for simplicity so they compile with `javac` without package setup.
- Feel free to move them into a package and adjust paths if you integrate into a larger project.
