# The if-then Statement
* Tells your program to execution a section of code *only* if a particular test evaluates to *true*
* For example,
```
void applyBrakes() {
    // the "if" clause: bicycle must be moving
    if (isMoving) {
        // the "then" clause: decrease current speed
            --currentSpeed;
    }
}
```
* Braces are optional, provided if "then" clause contains only one statement. It is not recommended since there can be a mistake when adding another statement.

# The if-then-else Statement
* Secondary path of execution when an *if* clause evaluates to *false*
* For example,
```
void applyBrakes() {
    if (isMoving) {
        --currentSpeed;
    } else {
        System.err.println("The bicycle has already stopped!");
    }
}
```

# The switch Statement
* Number of possible execution paths
* Works with the *byte, short, char, and int primitive data types*
* Also works with *enumerated data types, the String class, and a few classes that wrap certain primitive types*
* The body of a *switch* statement is known as a *switch block*
* The statement in the *switch block* can be labeled with *one or more case or default labels*
* Deciding whether to use *if-then-else* statements or a *switch* statement is based on readability and the expression that the statement is testing.
```
An *if-then-else* statement can test expressions based on *ranges of values of conditions*, whereas a *switch* statement tests expressions based *only on a single integer, enumerated value, or String object.*
```
* The *default* section handles all values that are not explictly handled by one of the *case* sections

## Why is branching statement "break" used here?
* Each *break* statement terminates the enclosing *switch* statement.
* The *break* statements are necessary because without them, statements in *switch* blocks *fall through: All statements after the matching case label are executed in sequence, regardless of the expression of subsequent case labels*, until a *break* statement is encountered.
* Using a *break* statement is recommended so that modifying the code is *easier and less error prone*.

## Using Strings in switch Statements (Java SE 7 and later)
* A *String* object in the *switch* statement's expression can be used in *Java SE 7 and later*.
* *[ See example StringSwitchDemo ]*
* The *String* in the *switch* expression is compared with the expressions associated with each *case* label as if the *String.equals* method were being used.
* ***Ensure that the expression in any switch statement is not null to prevent a NullPointerException from being thrown***

# The for statement
* Often mentioned as "for loop".
* *Provides a compact way to iterate over a range of values*
```
for (initialization; termination; increment) {
    statement(s);
}
```
* Some points to remember:
```
* The *initialization* expression initializes the loop; it's executes once, as loop begins.
* When the *termination* expression evaluates to false, the loop terminates
* The *increment* expression is invoked after each iteration through the loop; it is perfectly acceptable for this expression to increment or decrement a value.
```
* The three expressions of the *for* loop are optional; an *infinite loop* can be created as follows:
```
// infinite loop
for ( ; ; ) {
    // your code goes here
}
```

## The enhanced for statement
* The *enhanced for* statement is another form of for statement designed for iteration, can be used to make your loops more compact and easy to read
* ***This is the recommended form of for statement instead of general form whenever possible***
* Generally used for iteration through *Collections* and *Arrays*.
```
// This is a example EnhancedForDemo
class EnhancedForDemo {
    public static void main(String[] args) {
        int[] numbers =
            {1,2,3,4,5,6,7,8,9,10};
        for (int item: numbers) { // similar to int item = 0; item <= numbers; item++
            System.out.println("Count is: " + item);
        }
    }
}
```

# The while and do-while Statements
* The *while* statement continually executes a block of statements while a particular condition is *true*.
```
while (expression) {
    statement(s)
}
```
* The *while* statement evaluates expression, which must return a *boolean* value.
* The *while* statement continues testing the expression and executing its block until the expression evaluates to *false*.
* You can also implement an infinite loop using the *while* statement:
```
while (true) {
    // your code goes here
}
```

* The do-while statement:
```
do {
    statement(s);
} while (expression);
```
* The difference between do-while and while is that:
```
The do-while evaluates its expression at the bottom of the loop instead of the top. Therefore, the statements within the do block are always executed at least once.
```


# Branching Statements
## The break Statement
* The *break* statement has two forms: labeled and unlabeled

* Unlabeled form -- seen in *switch* Statement, can also be used to terminate a *for*, *while*, or *do-while* loop.
* *[See BreakDemo program]*
```
The unlabeled *break* statement terminates the innermost *switch*, *for*, *while* or *do-while* statement, but a labeled *break* terminates an outer statement
```
* *[See BreakWithLabelDemo program]*
```
The *break* statement terminates the labeled statement; it does not transfer the flow of control to the label. Control flow is transferred to the statement immediately following the labeled (terminated) statement
```

## The continue Statement
* The *continue* statement skips the current iteration of a *for*, *while*, or *do-while* loop
* Two forms - labeled and unlabeled
```
The *unlabeled* form skips to the end of the innermost loop's body and evaluates the *boolean* expression that controls the loop.
While a *labeled* continue statement skips the current iteration of an outer loop marked with the given label.
```

## The return Statement
* The *return* statement exits from the current method, and control flow returns to where the method was invoked.
* Two forms - one that returns a value, and one that doesn't
```
To return a value, simply put a value (or an expression that calculates the value) after the return keyword;
    return ++count;

"THE DATA TYPE OF THE RETURNE VALUE MUST MATCH THE TYPE OF THE METHOD'S DECLARED RETURN VALUE."

When a method is declared "void", use the form of "return" that doesn't return a value;
    return;
```

*Credits:* https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html

*Credits for Summary:* https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flowsummary.html
