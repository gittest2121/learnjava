# Inheritance
OOP allows classes to inherit commonly used state behavior from other classes.<br>
Each class is allowed to have one direct _superclass_, and each superclass has potiential for an unlimited number of _subclasses_<br>

The syntax for creating a subclass: _At the beginning of your class declaration, use the extends keyword, followed by the name of the class to inherit from:_

        class Mountainbike extends Bicycle {
                // new fields and method defining
                // a mountain bike would go here
        }

This gives MountainBike all the same fields and methods as Bicycle, yet it allows its code to focus exclusively on the features to make it unique.<br>
However, you must take care to properly document the state and behavior that each superclass defines, since that code will not appear in the source file of each subclass<br>

_Credits_: https://docs.oracle.com/javase/tutorial/java/concepts/inheritance.html
