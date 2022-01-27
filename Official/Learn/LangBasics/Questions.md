1. The term "instance variable" is another name for ***non-static field***.
2. The term "class variable" is another name for ***static field***.
3. A local variable stores temporary state; it is declared inside a ***method***.
4. A variable declared within the closing and opening parenthesis of a method is called a ***parameter***.
5. 8 data types - ***byte, short, int, long, float, double, boolean, char***.
6. Character strings are represented by the class ***java.lang.String***.
7. An ***array*** is a container object that holds a fixed number of values of a single type.
8. The ***logical complement operator "!"*** is used to invert the value of boolean.
9. Exercise - Consider the following code snippet - What output do you think the code will produce if no is 3? Explain why the output is what it is; in other words; what is the control flow for the code snippet?
```
if (no >= 0) {
    if (no == 0) {
        System.out.println("first string");
    } else {
        System.out.println("second string");
    }
}

System.out.println("third string");
```
Solution:<br>
```
3 is greater than or equal to 0, so execution progresses to the second if statement. The second if statement's test fails because 3 is not equal to 0. Thus, the else clause executes (since it's attached to the second if statement). Thus, *second string* is displayed. The final *println* is completely outside of any if statement, so it always gets executed, and thus *third string* is always displayed.
```
