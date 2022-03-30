# Object Polymorphism
* Reference-type variables have other types besides their own one.
* In addition to each variable's original type, **each variable can also be represented by the types of interfaces it implements and classes it inherits.**
* The String class inherits the Object class, and as such, String objects are always of type Object.
* But inverse is not true. So, object-type variables are not automatically of type String.

# Inheritance Hierachy
* The **inheritance hierachy lists all the classes that the given class has inherited.**
* Inherited classes are listed in the order of inheritance, with class being inspected always at the bottom.
* In the Inheritance hierachy of the String class, we see that the *String* class inherits the *Object* class.
* *In Java, each class can inherit one class at most.* On the other hand, the inherited class may have inherited another class. As such, a class may indirectly inherit more than a single class.

* *The inheritance hierachy can also be thought of as a ***list of the different types that the class implements.**
* **Object can be of many different types -- Polymorphism**
* If we only need methods defined in the Object class, such as *toString*, *equals* and *hashCode* in a method, we can simply use *Object* as the type of the method parameter.
```
public class Printer {

  public void printManyTimes(Object object, int times) {
    int i = 0;
    while (i < times) {
      System.out.println(object);
    }
    ++i;
  }
}
```

# API of String class
* API is a particular set of rules (code) and specifications that software programs can follow to communicate with each other.

* When you look at the API Description of the String class:
```
API implemented Interfaces:
Serializable, CharSequence, Comparable<String>
```
* The String class implements the Serializable, CharSequence, and Comparable<String> interfaces. An interface is also a type, which means:
```
Serializable serializableString = "string";
CharSequence charsequenceString = "string";
Comparable<String> comparableString = "string";
```
will work!
* Since we're able to define the type of a method's parameter, we can declare methods that receive an object that *implements a specific interface.* When method's parameter is an interface, any object that implements that interface can be passed to it as an argument.
