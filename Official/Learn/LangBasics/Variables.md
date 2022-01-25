# Variables
The Java programming language defines the following kinds of variables:<br>
1. Instance Variables (Non-Static Fields)<br>
2. Class Variables (Static Fields)<br>
3. Local Variables
4. Parameters

## Instance Variables (Non-Static Fields)
Objects store their induvidual states in *"non-static fields"*, that is, fields declared without the *static* keyword.<br>
Non-static fields are also known as *Instance variables* because their values are unique to each instance of a class (to each object)<br>
For example,<br>
*currentSpeed* of one bicycle is independent from the *currentSpeed* of another.

## Class Variables (Static Fields)
A *class variable* in any field declared with the *static* modifier, tells the compiler that there is exactly one copy of this variable in existence, regardless of how many times the class has been instantiated.<br>
For example,<br>
A field defining the number of gears for a particular kind of bicycle could be marked as *static* since conceptually the same number of gears will apply to all instances.<br>
The code *static int numGears = 6*; would create such a static field.<br>
While the code *static final int numGears = 6*; (added a static keyword) indicates that number of gears (variable) will never change.

## Local Variables
Similar to how objects store in fields, ***a method will often store its temporary state in local variables***<br>
The syntax for declaring local variable is similar to declaring a field<br>
For example,<br>
*int count = 0;* <br>
*There is no special keyword designating a variable as local -- It just depends entirely from the location in which the variable is declared -- in braces*<br>
As such, local variables are only visible to the methods in which they are declared; they are not accessible from the rest of the class

## Parameters
Parameters are always classified as *variables* (not fields)<br>
This applies to other parameter-accepting constructs as well (such as constructors and exception handlers)<br>
For example,<br>
*public static void main(String[] args)*<br>
_args_ variable is the parameter to this method

_Credits:_ https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
