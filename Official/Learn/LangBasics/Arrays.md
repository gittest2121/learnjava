# Arrays
An array is a container object that holds a fixed number of values of a single type.<br>
The length of an array is esthablished when the array is created. After its creation, length is fixed.<br>
1. Each item in an array is called the element, and each element is accessed by its numerical index
2. Index numbering begins with 0, and increases from left to right
3. [See example Arrays.java]

Its all about ```Declare and allocate```
	
## Declaring a Variable to Refer to an Array
The preciding program declares an array with following line of code:
``` 
// declare an array of integers
int[] anArray;
```

1. An array declaration has two components: the array's type and the array's name.
2. The array's type is written as ```type[]```, where *type* is the data type of the contained elements
3. The size of the array is not part of its type (which is why brackets are empty)
4. An array's name can be anything you want, provided that it follows that rules and conventions as naming convention
5. As with variables of other types, the declaration does not actually create an array;
```
type[] Arrayname;
```
While brackets can be written after array's name, it is discouraged since the brackets identify the array type and should appear with the type designation.

## Creating, Initializing, and Accessing an Array
One way to create an array is with the *new* operator.<br>
The next statement in the Array program allocates an array with enough memory for 10 integer elements and assigns the array to the anArray variable.<br>
```
// create an array of integers
anArray = new int[10];
Arrayname = new type[i]; where i belongs to whole numbers;
```

The next few lines assign values to each element of the array; and finally, each element is accessed by its numerical index.<br>
There is also a shortcut syntax to create and initialize an array:
```
int[] anArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
```
Here the length of the array is determined by the number of values provided between braces and seperated by commas.<br>

You can also declare array of arrays (multidimensional array) by using two or more sets of brackets, such as ```String[][] name```. Each element, therefore, must be accessed by a corresponding number of index values.

*[See MultiDimArray.java Program]*
* Finally, you can use the built-in *length* property (method length) to determine size of any array.

-- Continue to CopyingArrays.md

