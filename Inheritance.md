# Class inheritance
* An essential idea behind OOP is that **solutions rise from the interactions between objects which are created from classes.**
* An object in OOP is an independent unit that has a state, which can be modified by using the methods that the object provides.


* Every Java class extends the class Object, which means that every class we create has at its disposal all the methods defined in the Object class. If we want to change how these methods are defined in Object function, they must be overriden by defining a new implementation for them in the newly created class.
* The objects we create receive the methods *equals* and *hashCode*, among others, from the Object class.

* **Every class derives from ```Object```, but it's also possible to derive from other classes.**
* For example, when we examine the API (Application Programming Interface, which is a set of definitions and protocols for building and integrating application software.) of Java's *ArrayList*, we notice that *ArrayList* has the superclass *AbstractList*, which in turn has a superclass *AbstractCollection>*, which finally has *Object* as it superclass.
```
java.lang.Object
  [-] java.util.AbstractCollection<E>
    [-] java.util.AbstractList<E>
      [-] java.util.ArrayList<E>
```
* **Each class can directly extend only one class. However, a class indirectly inherits all the properties of the classes it extends.**
* That means, in the previous example, *ArrayList* has at its disposal all the variables and methods of the classes *AbstractList*, *AbstractCollection*, and *Object*.

* Keyword: **extends** -- inherits the properties of the class
* Subclass: The class which receives the properites
* Superclass: The class whose properties are inherited

# The *super* keyword
* The *super* call bears some resemblance to the *this* call in a constructor.
* *this* -- used to call a constructor of this class
* *super* -- used to call a constructor of the superclass
* If a constructor uses the constructor of the superclass by calling *super* in it, the *super* call must be on the **first line of the constructor.**
* This is similar to the case with calling *this (must also be the first line of the constructor).*
