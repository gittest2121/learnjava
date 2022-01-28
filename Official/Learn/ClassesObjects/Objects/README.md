# Objects
## Creating Objects
* A object is a software bundle of related state and behavior.
* Creating Objects has three parts:
```
1. *Declaration:* All variable declarations associate a variable name with an object type.

2. *Instnatiation:* The *new* keyword is a Java operator that creates the object.

3. *Initialization:* The *new* operator is followed by a call to a constructor, which initializes the new object.
```

## Declaring a Variable to Refer to an Object
```
type name;
```
* This notifies the compiler that you will *name* to refer to data whose type is *type*. With a primitive variable, this *declaration* also *reserves the proper amount of memory for the variable.*
```
Point originOne;
```
* If you declare like this, its value will be *undetermined until an object is actually created and assigned to it. Simply declaring a reference variable doesn't create an object. For that you need to use the new operator.
* You must assign an object to originOne before you use it in your code. Otherwise, you will get a compiler error.
* A variable in this state currently references no object. [ The variable name, originOne, reference pointing to nothing ]*

## Instantiating a Class ( Creating a Object)
* The *new* operator instantiates a class by *allocating memory for a new object and returning a reference to that memory.*
* The *new* operator also invokes the object constructor.
* The *new* operator requires a *single, postfix argument: a call to a constructor* - The name of the constructor prvodies the name of the class to instantiate.
* The *new* object returns a reference to the object it created. This reference is usually assigned to a variable of appropriate type, say,
```
Point originOne = new Point(23, 94);
```
* The reference returned by then *new* operated does not have to be assigned to a variable. It can be used directly in the expression.
```
int height = new Rectangle().height;
```

## Initializing an Object
* *You can recognize a constructor because its declaration uses the same name as the class and it has no return type*
```
Point class contains a single constructor.

|--------------|
| x | 23       |     |-------------------------------|
|--------------|---->| originOne (reference pointing |
| y | 94       |     |             to nothing)       |
|--------------|     |-------------------------------|
 A Point Object

Rectangle class contains four constructors.
The Java compiler differentiates the constructors based on the number and type of arguments.
When the Java compiler encounters the following code, it knows to call the constructor in the *Rectangle* class that requires a *Point* argument followed by two integer arguments:

Rectangle rectOne = new Rectangle(originOne, 100, 200);

This calls one of Rectangle's constructors that initializes *origin* to *originOne*, width to 100 and height to 2--. Now there are two references to the same Point object - an object can have multiple references to it

|-------------------------------|    |-----------|
| originOne (reference pointing |--->| x | 23    |
|             to nothing)       |    |-----------| A Point object
|-------------------------------|    | y | 94    |
                                     |-----------|
                                           ^
                                           |
                                           |
                                           |
                                     |  origin (reference pointing |
                                     |           to nothing        |
                                     |-------------|---------------|
                                     | width | 100 | height | 200  |
                                     |-------------|---------------|
                                     |      A Rectangle object     |
                                     |-----------------------------|


* The Rectangle constructor used in the following statement doesn't take any arguments, so it's called *no-argument constructor*
* All classes have at least one constructor.
* Java compiler, by default, automatically provides a no-argument constructor, called the default constructor (if the class doesn't explictly declare any constructor)
* The default constructor calls the *class parent's* no-argument constructor, or the Object constructor if class has no other parent.
* If the parent has no constructor (Object does have one), the compiler will reject the program
```

## Referencing an Object's Fields
* Object fields are accessed by their name. (name must be unambiguous)
* Code that is outside the object's class must use an *object reference* or *expression*, *followed by a dot(.) operator, followed by a field name*
```
objectReference.fieldName
```
* Attempting to use the field names of object directly from the code in the class doesn't make sense - since those fields exist only within an object - and results in a compiler error.
* When you access an instance field through an object reference, you reference that particular object's field.
* Objects of the same type have their own copy of the same instance fields. They are different.
* To access a field, you can use a named reference to an object, or any expression that returns an object reference.
```
new operator returns a reference to an object.

int height = new Rectangle().height


* This statement creates a new Rectangle object and immediately gets its height.
* In essence, the statement calculates the default height of a Rectangle.
* Note that after this statement has been executed, the program no longer has reference to the created Rectangle, because the program never stored the reference anywhere.
* The object is unreferenced, and its resources are free to be recycled by the JVM.
```

## Calling an Object's Methods
* You can also use an object reference to invoke an object method
```
objectReference.methodName(argumentList);

or:

objectReference.methodName()
```
* As with instance fields, *objectReference* must be a reference to an object.
* You can use a variable name, but you can also use any expression that returns an object reference, say,
* The *new* operator returns an object reference, so you can use the value returned from *new to invoke a new object's methods:*
```
new Rectangle(100, 50).getArea();

Explanation:
The expression "new Rectangle(100, 50)" returns an object reference that referes to a Rectangle object.
You can use dot notation to invoke the "new Rectangle's getArea()" method to compute the area of the new rectangle.
For methods that return a value, you can use the "method invocation" in expressions.
You can assign the return value to a variable, use it to make decisions.
The code assigns the value returned by getArea() to the variable AreaofRectangle.
```
* Remember, *invoking a method on a particular object is the same as sending a message to that object*
* In the above case, *the object that getArea() is invoked on* is *the rectangle returned by the constructor*.

## The Garbage Collector
* Some OOP languages require that *you keep track of all the objects you create and explicitly destroy them when they are no longer needed.*.
* Managing Memory explicitly is tedious and error-prone.
```
The Java platform allows you to create as many objects as you want (limited, of course, by what system can handle), and you don't have to worry about destroying them.
The JRE deletes objects when it determines that they are no longer being used. This process is called *garbage collection*
```

* An object is eligible for *garbage collection* when there are *no more references* to that object.
* *References that are held in a variable are usually dropped when the variable goes out of scope.*
* Or, *You can explicitly drop an object reference by seting the variable to the special value "null"*
* Remember that a program can have multiple references to the same object;
```
All references to an object must be dropped before the object is eligible for garbage collection
```

* Describing in Java way,
```
The JRE has a garbage collector that periodically frees the memory used by objects that are no longer referenced. The garabage collector does its job automatically when it determines that the time is right
```
*Credits:* https://docs.oracle.com/javase/tutorial/java/javaOO/objects.html
