# OOP Concepts
## What is an Object?
An object is a software bundle of related state and behaviour<br>
_Explains:_ how state and behavior are represented within an object, introduces the concept of data encapsulation, and explains the benefits of designing your software in this manner

## What is a Class?
A class is a blueprint or prototype from which objects are created.
_Explains:_ defines a class that models the state and behavior of a real-world object. It intentionally focuses on basics, showing how even a simple class can cleanly model state and behavior.

## What is Inheritance?
Inheritance provides a powerful and natural mechanism for organizing and structuring your software. This section explains how to derive one class from another using simple-syntax provided by Java programming language.

## What is an Interface?
An interface is a contract between a class and the outside world.<br>
When a class implements an interface, it promises to provide the behavior published by that interface.<br>
This section defines a simple interface and explains the necessary changes for any class that implements it.

### If you're a beginner to programming, Read this later!
***Interfaces solves concrete problems. Say, you have a, b, c, d of 4 different types, as:
	a.Process();
	b.Process();
	c.Process();
	d.Process();

Instead of doing this, you can implement IProcessable, then do
	List<IProcessable> list;

	foreach(IProcessable p in list)
	    p.Process();
***

## What is a Package?
A package is a namespace for organizing classes and interfaces in a logical manner. Placing your code into packages makes large software projects easier to manage<br>
This section explains why this is useful, and introduces you to the API provided by the Java platform.

_Credits:_ https://docs.oracle.com/javase/tutorial/java/concepts/index.html
