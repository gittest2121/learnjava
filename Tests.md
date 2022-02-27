# Stack Trace
* When an error occurs in a program, the program typically prints something called a stack trace -- the list of method calls that resulted in the error.

# Checklist for Troubleshooting (Get started)
1. Indent your code properly and find out if there are any missing parentheses.
2. Verify that the variables used are correctly named.
3. Test the program flow with different inputs and find out the sort of input that causes the program to not work as desired.
4. Add print commands to the program in which you print out the values of variables used at various stages of the program's execution.
5. Verify that all variables you are using are initialized. If they aren't, a NullPointerException error will occur.
6. If your program causes an exception, you should definitely pay attention to the stack trace associated with the exception.
7. Learn how to use the debugger.

# Unit Testing
* Unit Testing referes to the testing of induvidual components in the source code, such as classes and their provided methods.
* The writing of tests reveals whether each class and method observes or deviates from the guideline of each method and class having a single, clear responsibility.

# Test-Driven Development
* Test-driven development is a software development that's based on constructing a piece of software in small iterations. In test-driven software development, the first thing a programmer alwaus does is write an automatically-executable test, which tests a single piece of the computer program.
* Steps:
1. Create a test that tests some feature that will be added to the program.
2. Run the test. It should not pass. -- If the test passes, move to Step 1.
3. Develop the program so that it has the functionality required to pass the test.
4. Run the tests. -- If the tests don't pass, move to step 3 and further develop the functionality.
5. Refactor -- [If the program is ready, stop] -- otherwise, go to step 1.

[ Refactoring means cleaning the code while maintaining the functionality of the program. Cleaning includes tasks such as improving the readability and dividing the program into smaller methods and classes. ]

## Advantages
* Forces the programmer to think of the functionality before writing the code.
* Results in maintainable structure, since the program is built in small parts, refactoring steadily.
* The end product contains tests, which makes further development easier:
-- When the code is changed, it's easy to check if the existing functionality still exists.
* Fewer bugs in production.

## Software Testing
* Unit testing is only a part of software testing. On top of unit testing, a developer also performs integration tests that examine the interoperability of components, such as classes, and interface tests that test the application's interface through elements provided by the interface, such as buttons.
