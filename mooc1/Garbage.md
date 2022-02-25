# null value of a reference variable
Null -- a reference "to nothing"<br>
The null reference can be set as the value of any reference type variable. For example,
```
Person cato = new Person("Cat");
System.out.println(cato);

Person kitty = catto;
kitty.growOlder();
kitty.growOlder();

System.out.println(cato);

cato = new Person("Meow");
System.out.println(meow);

kitty = null;
```
In the last line, the object whose name is Cat is referred to by nobody. In other words, the objects has become "garbage".<br>
In Java Programming Language, the programmer need not worry about the program's memory use. From time to time, the automatic garbage collector of the Java language cleans up the objects that have become garbage. If the garbage collection did not happen, the garbage objects would reserve a memory location until the end of program execution.<br>
```
When we try to print a variabe that references "nothing" i.e. null

...
...
kitty = null;
System.out.println(kitty)
// prints null
```
Printing a null reference prints "null". How about if we were to try and call a method, say growOlder, on an object that refers to nothing:
```
...
...
kitty = null;
kitty.growOlder();

// NullPointerException
```
NullPointerException indicates that "there occured an error indicating that we called a method on a variable that refers to nothing.
