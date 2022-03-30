# Lambda Expressions
* Stream values are handled by methods related to streams.
* Methods that handle values get a function as a parameter that determines what is done with each element. What the function does is specific to the method in question.
* The *lambda expression* is **shorthand provided by Java for anonymous methods that do not have an "owner", i.e., they are not part of a class or an interface.** The function contain both the parameter definition and the function body.
For example,
```
value -> value > 5

// original
*stream*.filter(value -> value > 5).*furtherAction*

// is the same as
*stream*.filter(Integer value) -> {
	if (value > 5) {
		return true;
	}

	return false;
}).*furtherAction
```
* The same can be written explicitly so that a static method is defined in the program, which gets used within the function passed to the stream as parameter.
```
public class Screeners {
	public static boolean greaterThanFive(int value) {
		return value > 5;
	}
}


// original
*stream*.filter(value -> value > 5).*furtherAction*

// is the same as
*stream*.filter(value -> Screeners.greaterThanFive(value)).*furtherAction*

// the function can also be passed directly as a parameter.
// is also the same as
*stream*.filter(Screeners::greaterThanFive).*furtherAction*
// Screeners::greaterThanFive says that "use the static greaterThanFive method that's in the Screeners class"
```
* Functions that handle stream elements cannot change values of variables outside of the function. This has to do with how static methods behave -- during a method call, there is no access to any variables outside of the methods. With functions, the values of variables outside the function can be read, assuming the values of those variables don't change in the program.
