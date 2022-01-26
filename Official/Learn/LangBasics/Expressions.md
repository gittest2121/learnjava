# Expressions, Statements, and Blocks
Operators may be used in building expressions, which compute values;<br>
Expressions are core component of statements

## Expressions
An *expression* is a construct made up of *variables, operators, and method invocations*, which are constructed according to the syntax of language, that evaluates to a single value.<br>
For example, (in asterisk)
```
int *cadence = 0;*
*anArray[0] = 100;*
System.out.println(*"Element 1 at index 0: " + anArray[0]*);

int *result = 1 + 2;* // result is now 3
if (*value1 == value2*)
    System.out.println("*value1 == value2"); // this is a String!
```
The Java Programming language allows you to construct *compound expressions* from various smaller expressions as long as the data type required by one part of the expression matches the data type of the other
```
1 * 2 * 3
```
The result of multiplication is independent of order; (this is not true for all expressions)
```
(x+y) / 100 // unambigious, recommended
```
When writing compound expressions, be explicit and indicate with parentheses which operators should be evaluated first

## Statements
* A *statement* forms a complete unit of execution.
* Generally terminates with a semicolon(;)
* Three kinds of statements
```
Expression Statements
 [-] Assignment Statements
 [-] Increment/Decrement Statements
 [-] Method Invocation Statements ( Example: System.out.println("Hello World!") )
 [-] Object Creation Statement ( Example: Bicycle myBike = new Bicycle(); )
Declaration Statements
Control flow Statements
```
* Statements inside source files are executed from top to bottom

## Blocks
A *block* is a group of zero or more statements between balanced braces and can be used anywhere a single statement is allowed<br>
```
class foo {
    
    if (bar) {
        statement1;
    }
    
    else {
        statement2;
    }
}
```
