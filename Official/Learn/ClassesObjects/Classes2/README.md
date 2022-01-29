# More on Classes
* This section covers more aspects of classes that depend on using object references and the *dot* operator:
```
* Returning values from methods.
* The *this* keyword
* Class vs. Instance members
* Access Control
```

## Returning a Value from a Method
* A method returns to the code that invoked it when it
```
* Completes all the statements in the method,
* Reaches a *return* statement, or
* Throws an exception
(whichever occurs first)
```
* You declare a method's return type in its method declaration. Within the body of the method, you use the *return* statement to return the value.
* Any method declared *void* doesn't return a value. It doesn't need to contain a *return* statement. In such a case, a *return* statement can be used to *branch out of a control flow block and exit the method* and is simply used like this:
```
return;
```
* If you try to return a value from a method that is declared *void*, you will get a *compiler error*.
* ***Any method that is not declared void must contain a return statement with a corresponding return value, provided the data type of return value must match the method's declared return type***
```
return returnValue;
```
* In example Rectangle, the *getArea method returns a primitive type*. A method can also return a reference type.
```
public Bicycle seeWhosFastest(Bicycle myBike, Bicycle yourBike, Environment env) {
    Bicycle fastest;
    // code to calculate which bike is
    // faster, given each bike's gear
    // and cadence and given the environment
    // (terrain and wind)
    return fastest;
}
```

## Returning a Class or Interface
* When a method uses a class name as its return type, such as *whosFatest* does, ***the class of the type of the returned object must be either a subclass of, or the exact class of, the return type***.
```
For example,
Suppose that you have a class hierachy in which *ImaginaryNumber* is a
subclass of *java.lang.Number*, which is in turn a subclass of *Object*.

Now suppose that you have a method declared to return a Number:

public Number returnANumber() {
    ...
}

The *returnANumber* method can return an *ImaginaryNumber* (subclass) or a *Number* (class) but not an *Object* (superclass).

You can override a method and define it to return a subclass of the original method.
This technique, called *covariant return type*, means that the return type is allowed to vary in the same direction as the subclass.
```
```
Note:
You can also use *interface names as return types*.
In such cases, *the object returned must implement the specified interface*
```


## Using the *this* keyword
* Within an instance method or a constructor, *this* is a reference to the *current object - the object whose method or constructor is being called.*
* You can refer to any member of the current object from within an instance method or a constructo by using *this* keyword.

### Using *this* with a Field
* The most common reason for using the *this* keyword is because a field is shadowed by a method or constructor parameter.
```
Say, you can write example Point class as,

public class Point {
    public int x = 0;
    public int y = 0;

    // constructor
    public Point(int x, int y) { // unlike int a, int b
        this.x = x; // instead of x = a
        this.y = y; // instead of y = b
    }
}

Each argument to the constructor shadows one of the object's fields - inside the constructor, x is a local copy of the constructor's first argument.
To refer to the *Point field x*, the constructor must use *this.x*.
```

### Using *this* with a Constructor
* From within a constructor, you can also use the *this* keyword *to call another in the same class.*. Doing so is called an *explicit constructor invocation*.
```
Say, you can write example Rectangle class as,

public class Rectangle {
    private int x, y;
    private int width, height;

    public Rectangle() {
        this(0, 0, 1, 1);
    }

    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // other code
}
```
* This class contains a set of constructors.
* Each constructor initializes some or all of the rectangle's member variables.
* The constructors provide a default value for any member variable (field) whose initial value is not provided by an argument. For example,
```
The no-argument constructor creates a 1x1 Rectangle at coordinates (0, 0) by calling four argument constructor passing values.
The two-argument constructor calls the four argument constructor, passing in the width and height but always using the (0, 0) coordinates.
```
* As before, the compiler determines which constructor to call, based on *the number and the type of arguments.*
* *If present, the invocation of another constructor must be the first line in the constructor.*

## Controlling Access to Members of a Class
*[ See AccessModifiers.md ]*

## Understanding Class Members
* In this section, we discuss the use of the *static* keyword to create fields and methods that belong to the class, rather than to an instance of the class.

### Class Variables
* When a number of objects are created from the same class blueprint, they have their own distinct copies of *instance variables*.
```
In the case of the *Bicycle* class, the instance variables are *cadence, gear, and speed.*
Each *Bicycle* object has its own values for these variables, stored in *different memory locations.*
```
* Sometimes, you want to have variables that are common to all objects. This is accomplished with the *static* modifier.
* *Fields that have the static modifier in their declaration are called static fields or class variables.*
* Every instance of the class shares a class variable, which is one fixed location in memory.
* Any object can change the value of a class variable, but class variables can also be manipulated without creating an instance of the class.
```
For example, suppose you want to create a number of *Bicycle* objects and assign each a serial number, beginning with 1 for the first object.
This ID number is unique to each object and is therefore an instance variable.
At the same time, you need a field to keep track of how many *Bicycle* objects have been created so that you know what ID to assign to the next one.
Such a field is not related to any induvidual object, but to the class as a whole.
```
```
public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;

    // add an instance variable for the object ID
    private int id;

    // add a class variable for the
    // number of Bicycle objects instantiated
    private static int numberOfBicycles = 0;

    // other code

}
```
* Class variables are referenced by the class name itself, as in
```
Bicycle.numberOfBicycles
```
* This makes it clear that they are class variables. You can also refer to static fields with an object reference like *myBike.numberOfBicycles* but this is discouraged because it does not make it clear that they are class variables.
* You can use the *Bicycle constructor to set the id instance variable and increment the numberOfBicycles class* variable:

```
public class Bicycle {

    private int cadence;
    private int gear;
    private int speed;
    private int id;
    private static int numberOfBicycles = 0;

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        // increment number of Bicycles
        // and assign ID number
        
        id = ++numberOfBicycles;

    }

    // new method to return the ID instance variable
    public int getID() {
        return id;
    }

    // other code
}
```

## Class Methods
* The Java programming language supports static methods as well as static variables.
* Static methods, which have the *static* modifier in their declarations, should be invoked with the class name, without the need for creating an instance of the class.
```
className.methodName(args)
```
* You can also refer to static methods with an object reference like
```
instanceName.methodName(args)

but this is discoraged because it does not make it clear that they are class methods
```
* ***A common use for static methods is to access static fields.***
* For example, we could add a static method to the *Bicycle* class to access the *numberOfBicycles* static field:
```
public static int getNumberOfBicycles() {
    return numberOfBicycles;
}
```

* Not all combinations of *instance and class variables and methods are allowed.*

```
* Instance methods can access instance variables and instance methods directly.
* Instance methods can access class variables and class methods directly.
* Class methods can access class variables and class methods directly.
* *Class methods cannot access instance variables or instance methods directly - they must use an object reference.
Also, class methods cannot use the "this" keyword as there is no instance for "this" to refer to.*
```

## Constants
* The static *modifier*, in combination with the *final* modifier, is also used to define constants.*
* ***The final modifier indicates that the value of this field cannot change.***
```
static final double PI = 3.141592653589793;
```
* Constants defined in this way cannot be reassigned, and it is a compile-time error if your program tries to do so.
* By convention, the names of constant values are spelled in **UPPERCASE LETTERS**.
* If the name is composed of more than one word, the words are seperated by an underscore(_).
```
Note:
If a primitive type or a string is defined as a constant and the value is known at compile time, the compiler replaces the constant name everywhere in the code with its value.
This value is called a *compile-time constant.*
```

## Initializing Fields
* It is not necessary to declare fields at the beginning of the class definition, although this is the most common practice. It is only necessary that *they be declared and initialized before they are used.*

* Generally, you often provide an initial value for a field in its declaration.
```
public class BedAndBreakfast {

    // initialize to 10
    public static int capacity = 10;

    // initialize to false
    private boolean full = false;
}

This works well when the initialization value is available and the initialization can be put on one line.
However, this form of initialization has limitations because of its simplicity.
* If initialization requires some logic (say, error handling or a "for" loop to fill a complex array), simple assignment is inadequate.
```
* To provide the same capability for class variables (static fields), the Java programming language includes *static initialization blocks.*

---------------------------------------------------------------------------
## Static Initialization Blocks
* A *static initialization block* is a normal block of code enclosed in braces, { }, and preceded by the *static* keyword.
```
static {
    // whatever code is needed for initialization goes here
}
```
* A class can have *any number of static initialization blocks, and they can appear anywhere in the class body.
* The runtime system guarantees that *static initialization blocks* are called in the order they appear in the source code.
* There is an alternative to static blocks - you can write a private static method:
```
class Whatever {
    public static varType myVar = initializeClassVariable();

    public static varType initializeClassVariable() {

        // initialization code goes here
        // this is for class
    }
}
```
* The advantage of *private static methods* is that they *can be reused later if you need to reinitialize the class variable*

```
-------------------------------------------------------------------------
[ Some Explanation in StaticInitalize.md ]
-------------------------------------------------------------------------
```

## Initializing Instance Members (Ain't that setting values for object's fields?)
* Normally you would put code to initialize an instance variable in a constructor. There are two alternatives to using a constructor to initialize instance variables: *initializer blocks & final methods*
* Initializer blocks for instance variables look just like static initializer blockers, but without static keywords
```
{
    // whatever code is needed for initialization goes here
}
```
* The Java compiler copies initializer blocks into every constructor. Therefore, this approach can be used to share a block of code between multiple constructors.
* A *final method cannot be overridden in a subclass.*
```
class Whatever {
    private varType myVar = intializeInstanceVariable();

    protected final varType initializeInstanceVariable() {
         // initialization code goes here
         // this is for instance
    }
}
```
* This is especially useful if subclasses might want to reuse the initialization method.
* The method is final because *calling non-final methods during instance initialization can cause problems.*

*Credits:* https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html
