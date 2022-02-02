# Execution of Method Calls and the Call Stack
* How does the computer remember where to return after the execution of a method?<br>
* The environment that executes Java source code keeps track of the method being executed in the call stack.
* **The call stack** contains frames, each of which includes information about a specific method's internal variables and their values.
* When a method is called, a new frame containing its variables is created in the call stack.
* When the execution of a method ends, the frame relating to a method is removed from the call stack, which leads to execution resuming at the previous method of the stack.

*Credits:* https://java-programming.mooc.fi/part-2/4-methods
