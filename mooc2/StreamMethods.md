# Stream Methods
* Two Categories
  [-] Intermediate Operations intended for processing elements &
  [-] Terminal Operations that end the processing of elements.

* Intermediate operations return a value that can be further processed.
* <img src="https://java-programming.mooc.fi/static/017e053fafe4c80050c350af52fbef31/c1a89/part10.1-stream.webp" alt="Example"/>
Both of the *filter* and *map* methods shown are intermediate operations.
The *collect* method is a terminal operation.

* A terminal operation returns a value to be processed, which is formed from, for instance, stream elements.
```
(1) The starting point is a list with values.
(2) When the stream() method is called on a list, a stream of list values is created. The values are then dealt with individually.
(3) The stream values can be filtered by the filter method, which removes values that fail to meet the condition from the stream.
(4) The stream's map method can be used to map values in a stream from one form to another.
(5) The collect method collects the values in a stream into a collection provided to it, such as a list.
```
* Underneath is a program of the example depicted in the image. In this example stream, a new ArrayList list is created to which values are added. This is done in the last line
```
.collect(Collectors.toCollection(ArrayList::new))
```
