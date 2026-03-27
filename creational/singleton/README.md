Singleton Pattern
=================

Purpose
-------
Ensure a class has only one instance and provide a global point of access to it. The singleton pattern is
often used for shared resources (configuration, logger, cache, connection pool) where a single instance
is desirable.

This folder demonstrates several common singleton implementations in Java:

- `EagerSingleton` — instance created at class loading time (simple, thread-safe)
- `LazySingleton` — lazy initialization, not thread-safe
- `SynchronizedLazySingleton` — synchronized accessor (thread-safe, but with cost)
- `DCLSingleton` — double-checked locking with `volatile` (efficient, thread-safe)
- `BillPughSingleton` — initialization-on-demand holder idiom (recommended)
- `EnumSingleton` — enum-based singleton (robust against serialization and reflection)
- `SingletonDemo` — small runner that prints instances and does quick checks

How to compile & run
---------------------
Open a terminal in this directory and run:

```
cd "Desktop/ITI/Design Pattern Study/creational/singleton/java"
javac *.java
java SingletonDemo
```

Notes
-----
- `LazySingleton` is intentionally non-thread-safe to demonstrate the problem; prefer the holder idiom,
  enum singleton, or DCL with `volatile` when you need thread-safety and lazy initialization.
- These examples use the default package for simplicity; you can add a package declaration if you integrate
  this into a larger project.
