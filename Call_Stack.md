# Execution of Method Calls and the Call Stack
* How does the computer remember where to return after the execution of a method?<br>
* The environment that executes Java source code keeps track of the method being executed in the call stack.
* **The call stack** contains frames, each of which includes information about a specific method's internal variables and their values.
* When a method is called, a new frame containing its variables is created in the call stack.
* When the execution of a method ends, the frame relating to a method is removed from the call stack, which leads to execution resuming at the previous method of the stack.
* When a method is called, the execution of the calling method is left waiting for the execution of the called method to end.
* **The call stack refers to the stack formed by the method calls - the method currently being executed is always on the top of the stack, and what that method has finished executing the execution moves on to the mthod that is next on the stack.**

*Credits:* https://java-programming.mooc.fi/part-2/4-methods
