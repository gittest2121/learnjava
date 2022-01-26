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

*Credits:* https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
