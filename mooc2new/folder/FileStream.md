# Files and Streams
* The file is read in stream form using Java's ready-made Files class.
* The *lines* method in the files class allows you to create an input stream from a file, allowing you to process the rows one by one.
* The *lines* method gets a path as its parameter, which is created using the *get* method in the *Paths* class.

```
try {
	files.lines(Paths.get("file.txt")).forEach(row -> rows.add(row));
} catch (Exception e) {
	System.out.println("Error: " + e.getMessage());
}
```
