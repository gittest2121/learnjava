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

## Providing Constructors for Your Classes
* A class contains *constructors that are invoked to create objects from the class blueprint*.
* Constructor declarations look like *method declarations - except that they use the name of class and have no return type.*
```
For Bicycle class:
public Bicycle(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
}
```
* To create a new *Bicycle* object called *myBike*, a constructor is called by *new* opeartor.
```
Bicycle myBike = new Bicycle(30, 0, 8);
```

* Although *Bicycle* only has one constructor, it could have others, including a no-argument constructor:
```
public Bicycle() {
    gear = 1;
    cadence = 10;
    speed = 0;
}
```
* For invoking the no-argument constructor,
```
Bicycle yourBike = new Bicycle();
```
* Both constructors could have been declared in Bicycle because they have *different argument lists.* [ Similar to methods ]

```
You don't have to provide any constructors for your class, but you must be careful when doing this. The compiler automatically provides a no-argument, default constructor for any class without constructors. This default constructor will call the no-argument constructor of the superclass.

In this situation, the compiler will complain if the superclass doesn't have a no-argument constructor so you must verify that it does

If your class has no explicit superclass, then it has an implicit superclass of Object, which does have a no-argument constructor.
```
* You can use access modifiers in a constructor's declaration to control which classes can call the constructor.
```
Note:
If another class cannot call a *MyClass* constructor, it cannot *directly* create *MyClass* objects.
```

## Passing Information to a Method or a Constructor
* The declaration for a method or a constructor declares the number and the type of the arguments for that method or constructor.
* *[See computePayment.java example]*

```
Parameters vs Arguments

Parameters: List of Variables in a method declaration
Arguments: Actual Values that are passed in when the method is invoked. When you invoke a method, the arguments used must match the declaration's paramters in type and order
```

## Parameter Types
* You can use any data type for a parameter of a method or a constructor
```
Note:
If you want to pass a method into a method, then use a
*lambda expression* or a *method reference*
```

## Arbitary Number of Arguments
* You can use a construct called *varags* to pass an arbitary number of values to a method.
* You use *varags* when you don't know how many of a particular type of argument will be passed to the method. It's a shortcut to create array manually.
* To use *varargs*, you follow the type of the last parameter by an elipsis (three dots, ...), then a space, and the parameter name. The method can then be called with any number of that parameter, including none.
```
public Polygon polygonFrom(Point... corners) {
   int numberofSides = corners.length;
   double squareofSide1, lengthofSide1;
   squareofSide1 = (corners[1].x - corners[0].x)
                    * (corners[1].x - corners[0].x) 
                    + (corners[1].y - corners[0].y) 
                    * (corners[1].y - corners[0].y);
   lengthofSide1 = Math.sqrt(squareofSide1);
   
   // more method body code follows that creates and returns a
   // polygon connecting the Points
}
```
* The method can be called either with an array or with a sequence of arguments. The code in the method body will treat the parameter as an array in either case.
* You will most commonly see *varargs* with the printing methods, such as *printf* method.
```
public PrintStream printf(String format, Object... args)
```

## Parameter names
* Unique in the same method or constructor.
* Cannot be used as name of a local variable within the method or constructor.
* A parameter can have same name as one of the class's fields. In such cases, the parameter is said to *shadow* the field. Shadowing fields can make your code difficult to read and is conventionally used only within constructors and methods that set a particular field.
```
For example,
public class Circle {
   private int x, y, radius;
   public void setOrigin(int x, int y) {
      ...
   }
}
```
* Here, the setOrigin method has two parameters, each of which has same name as two fields: x, y in the circle Class - *Each method parameter shadows the field that shares its name. So, using x, y within the body of the method refers to the parameter, not to the field. To access the field, you must use a qualified name*

## Passing Primitive Data Type Arguments
* Primitive arguments, such as *int* or a *double*, are passed into *methods by value*.
* Meaning, any changes to the values of the parameters exist only within the scope of the method. When the method returns, the parameters are gone and any changes to them are lost.
* *[See PassPrimitiveByValue.java]*

## Passing Reference Data Type Arguments
* Reference data type parameters, such as objects, are also passed into *methods by value*. This means that when the method returns, the *passed-in reference still references the same objects as before. However, the values of the object's fields can be changed from method, if they have the proper access level.*
```
For example, consider a method in an arbitary class that moves *Circle* objects:
public void moveCircle(Circle circle, int deltaX, int deltaY) {
  // code to move origin of circle to x+deltaX, y+deltaY
  circle.setX(circle.getX() + deltaX);
  circle.setY(circle.getY() + deltaY);
  
  // code to assign a new reference to circle
  circle = new Circle(0, 0);
}


Let Method invoked with these arguments:
moveCircle(myCircle, 23, 56)

Inside the method, *circle* initially refers to *myCircle*. The method changes the x and y coordinates of the object that *circle* references. 
The changes will persist when the method returns. Then *circle* is assigned a reference to a new *Circle* object with x = y = 0.
This reassignment has no permanence, however, because the reference was passed in by value and cannot change. Within the method, the object pointed by *Circle* has changed, but, when the method returns, *myCircle* still references the same *Circle* object as before the method was called
```

*Credits:* https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
