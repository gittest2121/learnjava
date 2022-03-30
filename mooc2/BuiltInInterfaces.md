# Built-in Interfaces
* **List**, **Map**, **Set**, **Collection** -- Commonly used interfaces

## The List Interface
* The List Interface defines the basic functionality related to lists.
* ArrayList class implements the List interface.
* One list that is familiar to computer scientists is a **linked list**.
* From the perspective of the user, both implementations of the *List* interface work the same way. **The interface abstracts their inner functionality.**

### ArrayList or LinkedList?
* ArrayList saves object to an array where fetching an object with a specific index is very fast.
* On the other hand, LinkedList constructs a list where each element contains a reference to the next element in the list. When one searches for an object by index in a linked list, one has to go through the list from the beginning until the index.

```
List<String> strings1 = new ArrayList<>();
strings1.add("string objects inside an arraylist object");

List<String> strings2 = new LinkedList<>();
strings2.add("string objects inside an linkedlist object");
```

* The strength of a linked list is that adding to it is always fast. On the other hand, ArrayList, is backed by an array, which needs to resized each time it gets full -- Resizing the array requires creating a new array and copying the values from the old array to the new one.
* **Searching objects by index is much faster in an arraylist compared to a linked list.**
* For the problems, you encounter during this course, you should almost always choose ArrayList.

```
|===============================================|
|	ArrayList	|	LinkedList	|
|===============================================|
| Saves objects to an	| Constructs a list	|
| array where fetching	| where each element	|
| an object with a	| contains a reference	|
| specific index is	| to the next element	|
| very fast		| in the list		|
|-----------------------------------------------|
| Searching is fast	| Searching is slower	|
| (backed by an array)	| since one has to go	|
|			| through the list from |
|			| the beginning until	|
|			| the index		|
|-----------------------------------------------|
```

* **Interface Programming** is beneficial: implement your programs so that you'll use the data structures through the interfaces.

## The Map Interface
* The *Map* interface defines the *basic behavior associated with hash tables.*.
* *HashMap* class *implements* the *Map* interface.

```
Map<String, String> maps = new HashMap<>();
maps.put("ganbatte", "good luck");
maps.put("hai", "yes");

// The keys to the hash table are obtained
// using the *keySet* method.
for (String key : maps.keySet()) {
  System.out.println(key + ": " + maps.get(key));
}
```
* The **keySet** method *returns a set of elements* that **implement the Set interface.**
* The hash values can obtained from hash table using the **values** method.
* The **values** method **returns a set of elements that implement the Collection interface.**

# The Set Interface
* The **Set** interface describes **functionality related to sets.**
* **In Java, sets always contain either 0 or 1 amounts of any given object.**
* *HashSet* implements the *set interface*.
```
Set<String> set = new HashSet<>();
set.add("one");
set.add("one");
set.add("two");

for (String element : set) {
  System.out.println(element);
}
```
* Note that **HashSet in no way assumes the order of a set of elements. If objects created from custom classes are added to the HashSet object, they must have both the "equals" and "hashcode" methods defined.**

# The Collection Interface
* The *Collection* interface describes functionality related to collections.
* Among other things, *lists and sets* are categorized as *collections* in Java -- both the List and Set interfaces implement the Collection interface.
* The Collection interface provides, for instance, *methods for checking the existence of an item (the method contains) and determining the size of a collection (the method size).*
* The Collection Interface also determines how the collection is iterated over.
* Any class that implements the Collection interface, either directly or indirectly, inherits the functionality required for a *for-each* loop.

```
For example, Let's create a hash table and iterate over its keys and values.
Map<String, String> translations = new HashMap<>();
translations.put("ganbatte", "good luck");
translations.put("hai", "yes");

Set<String> keys = translations.keySet();
Collection<String> keyCollection = keys;

Collection<String> values = translations.values();

System.out.println("Keys:");
for (String key : keyCollection) {
  System.out.println(key);
}

System.out.println();

System.out.println("Values:");
for (String value : values) {
  System.out.println(value);
}
```

