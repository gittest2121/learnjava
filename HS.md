# HashMap
* The hash map is used whenever data is stored as key-value pairs, where values can be added, retrieved, and deleted using keys.
* If the hash map doesn't contain the key used for the search, its "**get**" method returns a "**null**" reference.
* Two type parameters are required when creating a hash map -
  [-] the type of the key
  [-] the type of the value added
```
HashMap<typeOfTheKey, typeOfTheValueAdded> variable = new HashMap<>();
```
* Adding to the hash map is done through the ```put(*key*, *value*)``` method that has two parameters - one for the key, the other for the value.
* Retrieving from a hash map happens with the help of the ```get(*key*)``` method that is passed the key as a parameter and returns a value.
* The hash map has a **maximum of one value per key.**. If a new key-value pair is added to the hash map, but the key has already been associated with some other value stored in the hash map, the **old value will vanish from the hash map.**

# When Should Hash Maps Be Used?
* The hash map is implemented internally in such a way that searching a key is very fast.
* The hash map generates a "hash value" from the key (a piece of code, which is used to store the value of a specific location)
* The hash map provides quick access to a specific key or keys, while the list is used -- to maintain order.

```
String.toLowerCase() -- creates a new string with all letters in the string String converted to lowercase.

String.trim() -- trim() method creates a new string where empty characters such as spaces at the beginning and end have been removed
```

# Going Through A Hash Map's Keys
* keySet() -- all Hash Map's keys set
* The order can vary, because the implementation of hashmaps does not gurantee the order of the objects in it.

# What about of values in Hash Map?
* values() methods -- set of values can be retrieved

* When we try for-each loops for these two methods **keySet()** and **values()**, the speed advantage that comes with the hash map is lost.

# Only Reference Variables in Hash Maps? (Auto-boxing)
* A hash map expects that only reference-variables are added to it.
 (Similar to ArrayList)
* Java converts primitive variables to their corresponding reference-types when using any Java built-in data structures (such as HashMap or ArrayList). This automatic conversion to a reference-type variable is termed as auto-boxing in Java, i.e. putting something in a box automatically. The automatic conversion is also possible in the other direction.
```
|	Primitive	|	Reference-type equivalent	|
|===============================================================|
|	int		|		Integer			|
|---------------------------------------------------------------|
|	double		|		Double			|
|---------------------------------------------------------------|
|	char		|		Character		|
|---------------------------------------------------------------|
```
* Auto-boxing has some risks in type conversions. If we attempt to convert a *null* reference - a sighting not in HashMap, for instance - to an integer, we witness a *java.lang.reflect.InvocationTargetException* error.
* When performing automatic conversion, we should ensure that the value to be converted is *not null*.
```
Fix using
getOrDefault(getValue, defaultValue);

The getOrDefault method of the HashMap searches for the key passed to it as a parameter from the HashMap. If the key is not found, it returns the value of the second parameter passed to it.

This method is equivalent to the function
if (variable.containsKey(getValue)) {
    return variable.get(getValue);
}

return defaultValue;
```
