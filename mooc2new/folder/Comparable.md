# The Comparable Interface
* Java's ready-made interface
* The Comparable interface defines the *compareTo* method *used to compare objects.*
* If a class implements the *Comparable* interface, *objects created from that class can be sorted using Java's sorting algorithms.*
* The *compareTo* method required by the Comparable interface receives as its parameter the object to which the *this* object is compared.

* If the *this* object comes before the object received as a parameter in terms of sorting order, the method should return a negative number.
* On the other hand, if the *this* object comes after the object received as a parameter, the method should return a positive number.
* Otherwise, 0 is returned.
* *The sorting resulting from the compareTo method is called ****natural ordering.***
* *Usually*, the *compareTo* method required by the interface *returns an integer that informs us the order of comparison.*
* You can override this capability when creating classes using this interface.


* When an class implements the Comparable interface, it is possible to sort the list by using the *sorted* methods. In fact, objects of any class that implement the Comparable interface can be sorted using the *sorted* interface method.
## BE AWARE, HOWEVER, THAT A STREAM DOES NOT SORT THE ORIGINAL LIST - *ONLY THE ITEMS IN THE STREAM ARE SORTED.*
* If a programmer wants to organize the original list, the *sort* method of the *Collections* class should be used. This, of course, assumes that the objects on the list implement the *Comparable* interface.
