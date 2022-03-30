# The actual type of an object dictates which method to be executed
* The method to be executed is chosen based on the actual type of the object, which means the class whose constructor is called when the object is creaed.
* If the method has no definition in that class, the version of the method is chosen from the class that is closest to the actual type in the inheritance hierachy.

# Polymorphism
* Regardless of the type of the variable, the method that is executed is always chosen based on the actual type of the object.
* Objects are polymorphic, which means that they can be used via many different variable types. The executed method always relates to the actual type of the object. This phenomenon is called polymorphism.
* Ad-hoc polymorphism provided for the plus operator.

* Polymorphism allows you to subsitute subclass instances where a super-class reference is used.
* Inheritance allows you to inherit code from a parent class and possibly redefine that behavior in subclasses so that your code can take advantage of it at runtime through polymorphism.

#
* objectType1 variable = new ObjectType2(parameters);
* The execution of methods is always chosen based on objectType2 (actual type of the object).

* Polymorphism -- ability of object to take on different forms.

* The definition for the method is first searched in the class definition of the actual type of the object. If it is not found, we next examine the superclass. If the definition cannot be found there either, we move on to the superclass of this superclass, and so on.

## Unrelated to Java -- Manhattan Distance
* Distance between two points if you can only travel in the direction of cooridnate axes.
* Used in many navigation algorithms.
* Math.abs(x) + Math.abs(y) + Math.abs(z)

## Is Inheritance worth using?
* When inheriting, the subclass receives the functionality of the superclass.
* If the subclass doesn;'t need or use some of the inherited functionality, then inheritance is not justifiable.
* It's good idea to keep the inheritance hierachy shallow, since maintaining and further developing the hierachu becomes more difficult as it grows larger. Generally speaking, if your inheritance hierachy is more than 2 or 3 levels deep, the structure of the program could probably be improved.
* **If an object owns or is composed of other objects, Inheritance shouldn't be used.**
* **When using inheritance, you should take care to ensure that the Single Responsibility Principle holds true. <There should only be one reason for each class to change. If you notice that inheriting adds more responsibilities to a class, you should form multiple classes of the class>.**
