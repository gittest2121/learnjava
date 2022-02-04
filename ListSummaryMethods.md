# A Summary of List Methods
* List is an ordered list of collection (group of objects known as elements).
* Elements in list are usually are of same data type.

```
* Java is always **pass-by-value**. Unfortunately, when we deal with objects, we are really dealing with object-handles called references which are passed-by-value as well.

Credits: https://stackoverflow.com/a/40523 (CC-BY-SA 4.0)

* When a parameter is *passed by value*, the caller and callee have *two independent variables* with the same value. If the callee modifies the parameter variable, the effect is not visible to the caller.

* When a parameter is *passed by reference*, the caller and callee *use the same variable* for the parameter. If the callee modifies the parameter variable, the effect is visible to the caller's variable.

Credits: https://stackoverflow.com/a/430958 (CC-BY-SA 4.0)
```

* The method always operates on the list object that is connected to the method call - this connection is established with a dot.
* Each list is its own seperate entity, and the list methods always concern the list that was used to call the method.
* A summary of some list methods is provided below. It's assumed that the created list contains variables of type string.

```
add		-- Adding to a list is done with this method that receives the value to be added as a parameter.


size		-- The number of elements in a list can be discovered with the non-parameterized method *size*; it returns an integer.


get		-- You can retrieve a value from a certain index with the method *get* that is given the index at which the value resides as a parameter.


remove		-- Removing elements from a list is done with the help of *remove*. It receives as a parameter either the value that is to be removed, or the index of the value to be removed.

contains	-- Checking for the existence of a value is done with the method *contains*. It's provided the value being searched for as parameter, and it returns a boolean value.
```

