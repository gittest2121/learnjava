Classes, References and Objects
https://stackoverflow.com/a/9224971

If you like housing metaphors:

1. a class is like the blueprint for a house. Using this blueprint, you can build as many houses as you like.
2. each house you build (or instantiate, in OO lingo) is an object, also known as an instance.
3. each house also has an address, of course. If you want to tell someone where the house is, you give them a card with the address written on it. That card is the object's reference.
4. If you want to visit the house, you look at the address written on the card. This is called dereferencing.

You can copy that reference as much as you like, but there's just one house -- you're just copying the card that has the address on it, not the house itself.

In Java, you can not access objects directly, you can only use references. Java does not copy or assign objects to each other. But you can copy and assign references to variables so they refer to the same object. Java methods are always pass-by-value, but the value could be an object's reference.
