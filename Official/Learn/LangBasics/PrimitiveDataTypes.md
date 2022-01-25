# Primitive Data Types
All variables must be declared before they can be used -- statically-typed<br>
Java is statically-typed languge<br>
This involves stating the variable's type and name<br>

7 primitive data types<br>
A primite type is predefined by language and is named by a reserved keyword<br>
* byte		-- 8-bit signed two's complement integer [-128,127]
* short 	-- 16-bit signed two's complement integer [-32768, 32767]
* int 		-- 32-bit signed two's complement integer [-2^31, (2^31)-1]
* long		-- 64-bit signed two's complement integer [-2^63, (2^63)-1]
* float 	-- single-precision 32-bit IEEE 754 floating point
* double 	-- double-precision 64-bit IEEE 754 floating point
* boolean	-- boolean data type -- true and false
* char		-- single 16-bit Unicode character

## Applications of Primtive Data Types
* The *byte* data type can be useful for saving memory in large arrays, where the memory savings actually matters.
* The *byte* data type can also be used in place of *int* where their limits help to clarify your code

* The *short* data can also be useful for saving memory in large arrays, where the memory savings actually matters.


* In Java SE 8 and later, you can use the *int* data type to represent an unsigned integer with minimum value 0 and maximum value [2^32]-1
* Use the *Integer class* to use *int* data type as an *unsigned integer*

* In Java SE 8 and later, you can use the *long* data type to represent an unsinged long integer with minimum value 0 and maximum value [2^64]-1
* Use the *Long class* to use *long* data type as an *unsigned integer*

* Similar to *byte* and *short*, use a *float* (Default: *double*) if you need to save memory in large arrays of floating point numbers.
* This data type *float* should never be used for precise values, such as currency.
* For that, you will need to use the *java.math.BigDecimal* class instead

* For decimal values, the data type *double* is generally the default choice.
* As mentioned previously, this data type *double* should never be used for precise values, such as currency.

* *boolean* data type represents one bit of information, but its size isn't something that's precisely defined.

* *char* data type has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,536 inclusive)

## Simple Data Object - String
In addition to the eight primitive data types, the Java programming language also provides special support for character strings via the *java.lang.String* class<br>
Enclosing your character string within double quotes will automatically create a new `String` object; and<br>
***String objects are immutable, which means that once created, their values cannot be changed***<br>
The `String` class is not technically a primitive data type, even considering the special support given to it by the language

## Default Values
It's not always necessary to assign the value when a *field* is declared.<br>
Fields that are declared but not initialized will be set to a reasonable default by the compiler<br>
Generally speaking, this default will be zero or null depending on the data type<br>
***Relying on such default values is generally considered as bad programming style***
```
Data Type 	-- 	Default value (for fields)
boolean		--	false
byte		-- 	0
short		--	0
int		--	0
long		--	0L
float		--	0.0f
double		--	0.0d
char		--	'\u0000'
String 		--	null
(or any object)
```

* Local variables are slightly different; the compiler never assigns a default value to an uninitialized local variable. If you cannot initialize your local variable where it is declared, make sure to assign it a value before you attempt to use it. Accessing an uninitialized local variable will result in a compile-time error.

# Literals
A literal is the source code representation of a fixed value; literals are represented directly in your code without requiring computation<br>
This will be an advantage, especially for Strings<br>

When you use a *string literal*, the string can be *interned (a method of storing only one copy of each distinct string value, which must be immutable)* but when you use *new String("...")*, you get a *string object*<br>
For example;<br>
***Both String Literals refer to same object***
	String a = "abc";
	String b = "abc";
	System.out.println(a == b); // true

***But when you use new String(...); 2 different objects are created and have different references***
	String c = new String("abc");
	String d = new String("abc");
	System.out.println(c == d); // false

***In general, you should use the string literal notation when possible. It is easier to read and gives the compiler a chance to optimize your code.***

*Credits:* https://stackoverflow.com/a/3297877 (CC-BY-SA 3.0)


## Integer Literals
* An integer literal is of type long if it ends with the letter L or l;
* otherwise it is of type int.
* *It is recommended to use ****uppercase letter L**** because the lower case l is hard to distinguish from the digit 1 on some systems*
* Values of the integral types *byte, short, int, long* can be created from *int* literals [for long, if range of (*long*) < range of (*int*)]
* Values of type *long* that exceed the range of *int* can be created from *long* literals
* Integer literals can be expressed by these number systems:<br>
```Decimal: Base 10; whose digits consists of the numbers 0 through 9; (Default)
Hexadecimal: Base 16; whose digits consists of the numbers 0 through 9 and letters A through F
Binary: Base 2, whose digits consists of the numbers 0 and 1 (in Java SE 7 or later)
Octal (not representation in Official Docs, since its representation is confusing -- not recommended): Base 8; whose digits contain 0 through 7;
```
```
0x     -- hexadecimal<br>
0      -- octal<br>
(None) -- Decimal
```

## Floating-Point Literals
* A floating-point literal is of type *float* if it ends with the letter *F*or *f*; otherwise its type is *double* and it can _optionally_ end with the letter _D_ or _d_
* The floating-point types (*float* and *double*) can also be expressed using *E* or *e* (scientific notation); *F* or *f* (32-bit float literal) and *D* or *d* (64-bit double literal)

## Character and String literals
* Literals of types *char* and *String* may contain UTF-16 (Unicode) characters.
* '\uXXXX' is known as *Unicode escape*, where X = number or letter
* Always use *single quotes for char literals* and *double quotes for String literals*
* Unicode characters may be used elsewhere in a program (even in field names!)
* The Java Programming also supports a few special escape sequences for *char* and *String* literals, *namely,
```
\b -- backspace
\t -- tab
\n -- line feed
\f -- form feed
\r -- carriage return
\" -- double quote
\' -- single quote
\\ -- backslash*
```

* There's also a special *null* literal that can be used as a value for any reference type.
* *null* may be assigned to any variable (except for primitive types)
* There's little you can do with a *null* value beyond testing for its presence. Therefore, *null* is often used in programs as a marker to indicate that some object is unavailable.
* Finally, there is also special kind of literal called a ***class literal***, formed by taking a type name and appending ".class";<br>
For example,<br>
 String.class

* ***Class literal refers to the object (of type Class) that represents the type itself***<br>
***class<String> c = String.class;***<br>

* String.class is an instance (object) of the class "Class"
A string literal(say, "I am a string.") is a notation which represents an instance (object) of the class "String.class"; whereas
a class literal (say, "Hastable.class") is a notation which represents an instance (object) of class "Class"

# Underscore Characters in Numeric Literals (In Java SE 7 and later)
* This feature enables you, for example, to seperate group of digits in numeric literals, which can improve readability of your code.<br>
* For example,
```
long unknownNumber = 1234_5678_9012_3456L;
long socialsecurityNumber = 999_99_9999L;
float pi = 3.14_15F;
byte nybbles = 0b0010_0101;
long hexbytes = 0xFF_EC_DE_5E;
```

* You can place underscore only between digits; you cannot place underscores in the following places:
 * At the beginning or end of a number
 * Adjacent to a decimal point in a floating point literal
 * Prior to an *F* or *L* suffix
 * In positions where a string of digits is expected
 * In the 0x (or) 0b radix prefix
