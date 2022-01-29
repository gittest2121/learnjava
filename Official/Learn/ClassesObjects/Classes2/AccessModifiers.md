## Controlling Access to Members of a Class
* Access level modifiers determine whether other classes can use a particular field or invoke a particular method.
* There are two levels of access control:
```
* At the top level:
  [-] *public*
  [-] *package-private* (no explicit modifier)

* At the member level:
  [-] *public*
  [-] *private*
  [-] *protected*
  [-] *package-private* (no explicit modifier)

*package-private* - default
```
### Access Modifiers for Top-level classes
* A class may be declared with the modifier *public*, in which case *that class is visible to all classes everywhere*.
* If class has *no modifier*, (the *default, also known as package-private*), it is *visible only within its own package (packages are named groups of related classes).*

### Access Modifiers for Member level
* At the member level, you can also use the *public* modifier or *no modifier (package-private)* just as with top-level classes, and with same meaning.
* For members, there are two *additional access modifiers: private and protected.*
* The *private* modifier specifies that *the member can only be accessed in its own class.*
* The *protected* modifier specifies that *the member can only be accessed within its own package (as with package-private) and, in addition, by subclass of its class in another package.*
```
|==================================================|
|                   Access Levels                  |
|=============+=======+=========+==========+=======|
|  Modifier   | Class | Package | Subclass | World |
|=============+=======+=========+==========+=======|
|    public   |   Y   |    Y    |     Y    |   Y   |
|-------------+-------+---------+----------+-------|
|  protected  |   Y   |    Y    |     Y    |  *N*  |
|-------------+-------+---------+----------+-------|
| no modifier |   Y   |    Y    |    *N*   |  *N*  |
|-------------+-------+---------+----------+-------|
|   private   |   Y   |   *N*   |    *N*   |  *N*  |
|=============+=======+=========+==========+=======|
```
* Class 	- Indicates whether Class itself has access to the member defined by the class level. [ As you can see, a class always has access to its own members. ]
* Package 	- Indicates whether Classes in the same package as the class (regardless of their parentage) have access to the member.
* SubClass 	- Indicates whether Subclasses of the class declared *outside this package* have access to the member.
* World		- Indicates whether all classes have access to the member. 

### Access levels affect you in two ways.
* First, when you use classes that come from another source, such as the classes in the Java platform, *access levels determine which members of those classes your own classes can use.*
* Second, when you write a class, you need to decide *what access level every member variable and every method in your class should have.*
```
Say, you have two different packages, each with two different classes in them, and package 1 is accessed by a subclass from package 2.

|===================================================|
| Package 1                     Package 2           |
||---------|                   |----------|         |
||  Alpha  |       Subclass    | AlphaSub |         |
||---------|<------------------|----------|         |
||  Beta   |                   |  Gamma   |         |
||---------|                   |----------|         |
|===================================================|


|==================================================|
|                   Visibility                     |
|=============+=======+=========+==========+=======|
|  Modifier   | Alpha |   Beta  | Alphasub | Gamma |
|=============+=======+=========+==========+=======|
|    public   |   Y   |    Y    |     Y    |   Y   |
|-------------+-------+---------+----------+-------|
|  protected  |   Y   |    Y    |     Y    |  *N*  |
|-------------+-------+---------+----------+-------|
| no modifier |   Y   |    Y    |    *N*   |  *N*  |
|-------------+-------+---------+----------+-------|
|   private   |   Y   |   *N*   |    *N*   |  *N*  |
|=============+=======+=========+==========+=======|
```

# Tips on Choosing an Access level:
```
If other programmers use your class, you want to ensure that errors from misuse cannot happen. Access levels help you do this.

* Use the most restrictive access level that makes sense for a particular members. Use *private* unless you have a good reason not to.

* Avoid *public* fields except for constants.
(Many of the examples in the tutorial use public fields. This may help to illustrate some points concisely, but is not recommended for production code.)
Public fields tend to link you to a particular implementation and limit your flexibility in changing your code.
```

