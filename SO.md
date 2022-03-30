# Similarity for Objects
## equals
* The equals method (by default) checks whether the object given as a parameter has the same reference as the object it is being compared it.
* In other words, the default behaviour checks whether the two objects are same. If the reference is same, the method returns true -- otherwise false.

* For strings, *equals* works as expected. It declares two strings *identical in content* to be equal even if they are two seperate objects. The String class has replaced the default *equals* with its own implementation

* If we want to compare our own classes using the *equals* method, then it must be defined inside the class.
* Parameter: Object-type reference
* Check for either:
  [-] same reference
  [-] same object type (instanceof)
  [-] same object variables

* The ArrayList also uses the *equals* method in its internal implementation. If we don't define the *equals* method in our object, the *contains* method of the *ArrayList* doesn't work properly.
* **This reliance on default methods such as *equals* is actually the reason why Java demands that variables added to ArrayList and HashMap are of reference type. Each reference type variable comes with default methods, such as equals, which means that you don't need to change the internal implementation of the ArrayList class when adding variables of different types. Primitive variables do not have such default methods.**

## Approximate Comparison with HashMap (hashCode)
* The *hashCode* method can also be used for *approximate comparison of objects.*
* This method creates from the object a "hash code" -- a number, that tells a bit about the object's content.
* If two objects have the same hash value, they **may be equal.** -- Otherwise, they are **certainly unequal.**

* Hash codes are used in HashMaps.
* HashMap's internal behavior is based on the fact that key-value pairs are stored in an array of lists based on the key's hash value.
* The value associated with the key will be returned iff the exact same value is found in the list. This way, the search only needs to consider a fraction of keys stored in the hash map.
* So far, we've only used *String* & *Integer-type* objects as HashMap keys, which have conveniently had ready-made **hashCode** methods implemented.
* The default implementation creates a **hashCode** value based on the object's reference, which means that books having the same content that are nonetheless different objects get different results from the hashCode method.
* For the HashMap to work in the way we want it to, i.e., to return the borrower when given an object with the correct content (not necessarily the same object as the original key), the class that the key belongs to must overwrite the hashCode method in addition to the equals method.
* The method must be overwritten so that it gives the same numerical result for all objects with the same content. Also, some objects with different contents may get the same result from the hashCode method. However, with the HashMap's performance in mind, it is essential that objects with different contents get the same hash value as rarely as possible.

* We;ve previously used *String* objects as HashMap keys, so we can deduce that the String class has a well-functioning hashCode implementation of its own. We'll ***delegate***, i.e., ***transfer the computational responsibility to the String object***.
```
public int hashCode() {
    return this.name.hashCode();
}
```
* The above solution is quite good. However, if *name is ****null****, we see a NullPointerException error*.
```
Let's fix this by defining a condition: if the value of the *name* variable is null, we'll return the year of publication as the hash value.
Improve it further so that the year of publication is also taken into account in the hash value calculation


public int hashCode() {
    if (this.name == null) {
        return this.published;
    }
    
    return this.published + this.name.hashCode();
}
```
* This time, if all of the first parameter is same; second parameter will be same.
* For a class to be used as a HashMap's key, we need to define for it:
```
the equals method -- so that all equal or approximately equal objects cause the comparison to return true and all false for all the rest.

the hashCode method -- so that as few objects as possible end up with the same hash value
```
* NetBeans also helps us for creation of both equals and hashCode. (Source -> Insert Code -> equals() and hashCode()

