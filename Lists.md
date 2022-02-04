# Lists
## Learning Objectives
* You are familiar with the **list structure and know how to use a list in a program.**
* You are familiar with an **concept of an index**, you can **add values to a list**, and you know how to **retrieve information from a list's indices.**
* You know how to **iterate over a list with multiple different loop types**.
* You know how to **check if a value exists in a list**, and also know **how to remove values from a list.**
* You are aware of the **list being a reference-type variable**, and become familiar with **using lists as method parameters.**

## Lists
* *ArrayList* is a pre-made tool in Java that helps dealing with lists.
* It offers various methods, including ones for adding values to the list, removing values from it, and also for the retrieval of a value from a specific place in the list.

## Using and Creating Lists
* *import ArrayList*
* create a new list using the command *ArrayList<Type> list = new ArrayList<>();*<br>
; where *Type* is the type of the value to be stored in the list
* **All the variables stored in a given list are of the same type**

## Defining the Type of Values that a list can contain
* When defining the type of values that a list can include, the first letter of element type has to be capitalized.
* The reason for this has to do with how the ArrayList is implemented.
* **Variables in Java can be divided into two categories: value type (primitive) and reference type (reference type) variables.
[-] Value-type variables such as int or double hold their actual values.
[-] Reference-type variables such as ArrayList contain a reference to the location that contains the value(s) relating to that variable.

* Value-type variables can hold a very limited amount of information, whereas references can store a near limitless amount of it.**
* Once a list has been created, ArrayList assumes that all the variables contained in it are reference types.
* Java automatically converts an int variable into Integer when one is added to a list, and the same occurs when a variable is retrieved from a list.
```
ArrayList<Integer> integer = new ArrayList<>();
int integer = 1;
integer.add(integer);

This means that even though a list is defined to contain Integer-type variables,
variables of type int can also be added to it.
```

## Integer vs int
* **Integer is a class, whereas int is a primitive type**
* Variables of type *int* store the actual binary value for the integer you want to represent.
```
Therefore, int.parseInt("1") doesn't make sense because *int* is not a class and therefore doesn't have any methods
```
* *Integer* is a class, no different from any other in the Java language. Variables of type *Integer* store references to *Integer* objects, just as with any other reference (object) type.
```
Integer.parseInt("1") is a call to the static method *parseInt* from class *Integer*.
Note that this method actually returns an *int* and not an *Integer*.
```

* **To be more specific, *Integer* is a class with a single field of type *int*. The class is used where you need an *int* to be treated like any other object, such as in generic types or situations where you need nullability.**
* Note that **every primitive type in Java has an equivalent *wrapper* class**:
```
[-] Primitive Type	-- Wrapper Class
_________________________________________
[-] byte 		-- Byte
[-] short		-- Short
[-] int			-- Integer
[-] long		-- Long
[-] boolean		-- Boolean
[-] char		-- Character
[-] float		-- Float
[-] double		-- Double
```
* Wrapper classes inherit from Object class, and primitive don't.
* Since Java 5, we have ***autoboxing***, the conversion between primitive and wrapper class is done automatically.
* However, Beware, as this can introduce subtle bugs and performance problems, being explicit about conversions never hurts.


## Adding to a List and Retrieving a Value from specific Place
* list method **add** -- takes the value to be added as a parameter.
* list method **get** -- retrieves the value as a parameter.
* List positions are counted starting from **zero**.


*Credits:* https://stackoverflow.com/a/8660812 (CC-BY-SA 3.0)
           https://java-programming.mooc.fi/part-3/2-lists (Apache 2.0)
