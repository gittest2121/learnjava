# Classes
## Declaring Classes
```
public class MyClass extends MySuperClass implements YourInterface {
    // field, constructor, and
    // method declarations
}
```
* This is a *class declaration.*<br>
* The *class body (the area between the braces)* contains all the code that provides life cycle of the objects created from the class:<br>
*constructors for initializing new objects,*<br>
*declarations for the fields that provide the state of the class and its objects, and methods to implement the behavior of the class and its objects.*<br>
* *MyClass* is a subclass of *MySuperClass* and that it implements the *YourInterface* interface.
* Modifiers like *public* or *private* are written at the very beginning. The modifiers *determine what other classes can access MyClass*.
```
In general, class declarations can include these components, in order:
1. Modifiers such as *public*, *private*, and a number of others that you will encounter later. (However, note that the *private* modifier can only be applied to Nested Class [ will be discussed later ])
2. The class name [ with the initial letter capitalized by convention ].
3. The name of the parent class (superclass), if any, preceded by the keyword *extends*. -- A class can only *extend* one parent. (A class can have only one superclass)
4. A comma-seperated list of interfaces implemented by the class, if any, preceded by the keyword *implements*. -- A class can *implement* more than one interface.
5. The class body, surrounded by braces, {}.
```

## Declaring Member Variables (Fields)
* There are several kinds of variables:
```
* Member variables in a class -- fields
* Variables in a method or block of code -- local variables
* Variables in method declarations -- parameters
```
* Field Declarations are composed of three components:
```
1. Zero or more modifiers, such as *public* or *private*
2. The field's type
3. The field's name
```
* From Bicycle Example,
```
The fields of Bicycle are named cadence, gear, and speed and are all of data type integer (int). The public keyword identifies these fields as *public members, accessible by any object that can access the class*
```

## Access Modifiers
* Lets you control what other classes have access to a member field.
* Access Modifiers:
```
* public modifier - the field is accessible from all classes.
* private modifier - the field is accessible only within its own class.
* protected modifier - [ described later ]
* no modifier - [ described later ]
```
* In the spirit of encapsulation, it is common to make fields private. This means they can only be *directly* accessed from the Bicycle class. We still need access to these values, however. This can be done *indirectly* by adding public methods that obtain field values for us:
```
public class Bicycle2 {
    
    // 3 fields
    private int cadence;
    private int gear;
    private int speed;

    // 1 constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // 7 methods
    public int getCadence() {
        return cadence;
    }

    public void setCadence(int newValue) {
        gear = newValue;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public int getSpeed() {
        return speed;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }
}
```

## Types
* All variables must have a type.
* They can be:
```
Primitive types -- int, float, boolean, etc.
Reference types -- Strings, Arrays, or Objects.
```

## Variable Names, Methods and Class Names -- Recommended Convention
* Already covered in Language Basics Variables -- Naming Convention, except for few.
```
* The first letter of a class name should be captalized, and
* The first (or only) word in a method name should be a verb.
```

## Defining Methods
* The only required elements of a method declaration are the method's return type, name, a pair of parentheses (), and a body between braces {}.
* Method Declarations have six components:
```
1. Modifiers - such as public, private, protected
2. The return type - the data type of the value returned by the method, or void if the method doesn't return a value
3. The method name - the rules for field names apply to method names as well, but convention is a little different.
4. The parameter list in parenthesis - a comma-delimited list of input parameters, preceded by their data types, enclosed by parentheses (). If there are none, use empty parentheses.
5. An exception list [...discussed later]
6. The method body, enclosed between braces - the method's code, including the declaration of local variables
```
* Two of the components of a method declaration comprise the *method signature* - ***the method's name*** and ***the parameter types***.
```
Method Signature (Example):

calculateAnswer(double, int, double, double)
```

## Naming a Method
* Method names should be a verb in lowercase for single-word names.
* In multi-word names, method names begins with a verb in lowercase, followed by adjectives, noun, etc.
* In multi-word names, the first letter of each of the second and following words should be capitalized.
* Typically, a method has a unique name within its class. However, a method might have the same name as other methods due to *method overloading*.

## Overloading Methods
* The Java programming language supports *overloading* methods.
* Java distinguish between *methods* with *different method signatures*.
```
This means that methods within a class can have the same name if they have different parameter lists (some qualifications will discussed later)
```
* Better understanding:
```
* In the Java programming language, you can use the same name for all the methods but pass a different argument list to each method.
* Overloaded methods are differentiated by the number and the type of the arguments passed into the method
* You cannot declare more than one method with *the same name and the same number and type of arguments*
* The compiler cannot tell them apart, since, compiler does not consider return type when differentiating methods, so you cannot decla two methods with the same signature even if they have a different return type.
```
* ***Overloaded methods should be used sparingly and not recommended, as they can make code much less readable.***

*Credits:* https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
