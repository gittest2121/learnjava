# Objects
Objects have _state_ and _behaviour_<br>
Methods -- behaviour<br>
Fields  -- state<br>
Methods + Fields = A software object<br>

An objects stores its state in fields (variables in some programming languages) and exposes its behavior through methods (functions in some programming languages).<br>
Methods operate on an object's internal state and serve as the primary mechanism for object-to-object communication.<br>
Hiding internal state and requiring all interaction to be performed through an object's methods is known as *data encapsulation* - a fundamental principle of OOP.<br>

## Benefits
1. _Modularity_: The source code for object can be written and maintained independently of the source code for other objects. Once created, an object can be easily passed around inside the system<br>
2. _Information-hiding (Data encapsulation)_: Hiding internal implementation and requiring all interaction to be performed through object's methods<br>
3. _Code re-use_: If an object already exists (perhaps written by another software developer), you can use that object in your program. This allows specialists to implement/test/debug complex, task-specific objects, which you can then trust to run in your own code<br>
4. _Pluggability and ease of debugging_: If a particular object turns out to be problematic, you can simply remove it from your application and plug in a different object as its replacement.
