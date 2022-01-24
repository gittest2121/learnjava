# Closer Look at Hello World Application
The Hello World Application consists of three primary components:
        Source code comments
        the HelloWorldApp class definition
        the main method

## Source Code Comments
### /* text */

### /** documentation */
The javadoc tool uses doc comments when preparing automatically generated documentation

### // text

## the main method
Signature of main method: *public static void main(String[] args)*

The modifiers _public_ and _static_ can be written in either order, but convention is to use _public static_<br>
You can name the argument anything you want, but most programmers choose *args* or *argv*<br>
The main method accepts a single argument: _an array of elements of type String_<br>
The array is the mechanism through which the runtime system passes information to your application. <br>
For example,<br>
   java *MyApp arg1 arg2*<br>
Each string in the array is called a _command-line argument_.<br>
Command-line arguments let users affect the operation of the application without recompiling it.<br>
Example: --descending<br>
The "Hello World!" application ignores its command-line arguments, but you should be aware of the fact that such arguments do exist.<br><br>
Finally, the line _System.out.println("Hello World!")_;<br>
   uses the _System_ class from the core library to print the "Hello World!" message to standard output. Portions of this library is also known as API.
<br>
*Credits:* https://docs.oracle.com/javase/tutorial/getStarted/application/index.html
