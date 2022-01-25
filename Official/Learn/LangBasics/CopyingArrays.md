# Copying Arrays
The *System* class has an *arraycopy* method that you can use to efficiently copy data from one array into another:
```
public static void arraycopy(Object src, int src_index, Object dest, int dest_index, int length)
```
The two *Object* arguments specify the array to *copy from* and the array to *copy to*<br>
The three *int* arguments specify the *starting position in the source array, the starting position in the destination array, and the number of array elements to copy*.

[See example ArrayCopy.java]<br>
It uses the *System.arraycopy* method to copy a subsequence of array components into a second array.
