# Static Initialization Blocks
* A static initialization block is a normal block of code enclosed in braces, { }, and preceded by the static keyword.
* The *non-static* block:
```
{
    // Do Something...
}
```
* Gets called **every time** an *instance of the class is constructed.*
* While the *static block* only gets called **once** when the *class itself is initialized*, no matter how many objects of that type you create.
* *[See Test.java]*

*Credits:* https://stackoverflow.com/questions/2420389/static-initialization-blocks
