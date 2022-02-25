# Variables
## Primitive Variables
Stores values<br>
(Variable's information is stored as a value of the variable)

## Reference Variables
Stores reference to the value<br>
(Holds a reference to the information related to that variable)<br>
Practically always Objects (in Java)<br>
<br>
Usually, when a constructor of a class is called, a reference to an object is returned and stored as the value of the variables<br>
_[See example Variables.java]
https://java-programming.mooc.fi/part-5/3-primitive-and-reference-variables
_

### Private Variables can be accessed from all the methods contained by that class.

### Comparing Equality of Objects
* compare values -- "=="
* compare references (or own design) -- "equals()"
* If we want to be able to compare two objects of our own design with the equals method, that method must be defined in the class.
* The equals method returns a boolean type value - the return value indicates whether the objects are equal.
* The equals method is implemented in such a way that it can be used to compare the current object with any other object.
* The method receives an *Object*-type boject as its single parameter - all objects are Object-type, in addition to their own type.
* So, how do we do it?
```
1. The equals method first compares if the addresses are equal; if so; the objects are equal.

2. After this, we examine if the types of the Object are same (using instanceOf keyword); if not; the objects are not equal.

3. Next, the Object-type object passed as the parameter is converted to the type of the object that is being examined by using a "type cast", so that the values of the object variables can be compared.

[ ObjectTypetobeCasted variable = (ObjectTypetobeCasted) comparedobject; ]
```

