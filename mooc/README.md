# MOOC Hotspots
* Each object instantiated from a class has its own instance variables

### Rounding Errors
* Floating-point numbers, such as *double* are actually stored in binary form. That is, in zeros and ones using only a limited number of numbers.
* As the number of floating point numbers is infinte - All floating point numbers simply cannot be represented by finite number of zeros and ones.
* Thus, the computer must place a limit on the accuracy of stored numbers, resulting in *rounding errors.*
* For Example,
30.7 may be printed as 30.700000000000003
* More Explanation on : https://stackoverflow.com/a/588014
* From Oracle: *https://docs.oracle.com/cd/E19957-01/806-3568/ncg_goldberg.html*

# STRINGS ARE OBJECTS
..
# !!! DON'T USE SCANNER FOR READING FILES. YOU HAVE ANOTHER CLASS FOR THAT !!!!
# Files and the Filesystem
* Files are collections of data that live in computers.
* Can contain text, images, music, other things, or any combination of these.
* The file format determines the content of the file as well as the program required to read the file.
* Computers have several different programs for browsing files. These programs are specific to the OS. All programs used for browsing files make use of the filesystem in one way or another.

## The Concrete File Storage Format
* Files exist on the Storage Drive of a computer, which is, in reality, a large set of ones and zeros -- bits.
* Information is made up of these bits -- like, one variable of type *int* takes up *32 bits*.
* Modern terabyte-sized storage drives hold about *8 trillion bits* -- on this scale, a *single integer is very small.*
* Files can exist practcally anywhere on a hard drive, even seperated into multiple pieces.
* The computer's *filesystem* has the responsibility of keeping track of the locations of files on the hard drive as well as providing the ability to create new files and modify them.
* The *filesystem's main responsibility is abstracting the true structure of the storage drive*; a user or a program using a file doesn't need to care about how, or where, the file is actually stored.
***[ Encapsulation of true structure of storage drive ]***

## Reading From a File
* The path to the file can be acquired using Java's *Paths.get* command, which is given the *file's name in string format as a parameter: Paths.get("filename.extension")*
* The path to the file we want to read is given as a *parameter to the constructor of the Scanner class*
* Reading a file may result in an error, and it's for this reason that the process *require seperate blocks - one for the ****try**** and another to ****catch**** potiential errors.* - Shortly, *[ Error Handling ].*
* When the *Scanner* object that reads the file that has been created, the file can be read using a while-loop. The reading proceeds until all the lines of the file have been read, i.e., until the scanner finds no more lines to read.
* A file is *read from the project root by default (when parameter path of file to the constructor of the Scanner class is called)*.

## Reading Data of a Specific Format From a File
* Data is often stored in files using a specific format.
* One such format that's already familiar to us is CSV (Comma-Seperated Values) format -- data seperated by commas.
* In such cases,
```
Scanner scanner = new Scanner(System.in);

while (true) {
    System.out.print("Enter name and age seperated by a comma: ");
    String line = scanner.nextLine();

    if (line.equals("")) {
        break;
    }

    String[] parts = line.split(",");
    String name = parts[0];
    int age = Integer.valueOf(parts[1]);

    System.out.println("Name: " + name):
    System.out.println("Age: " + age);
}
```
* You could use this program to read the data from a file as:
```
try (Scanner scanner = new Scanner(Paths.get("records.txt"))) {

    while (scanner.hasNextLine()) {
         String line....
         ...............
         .......... + age);
    }
}
```

## Reading Objects From a File
* Creating objects from data that is read from a file is straightforward. And you don't always write everything in main method.
* Well, a better title would have been "Creating objects from data read from file"
```
// create an array of objects
ArrayList<Person> people = new ArrayList<>();

try (Scanner scanner = new Scanner(Paths.get("records.txt"))) {

    while (scanner.hasNextLine()) {
         String line = scanner.nextLine();

         String[] parts = line.split(",");
         String name = parts[0];
         int age = Integer.valueOf(parts[1]);

         people.add(new Person(name, age));
    }
}

System.out.println("Total amount of people read: " + people.size());
```
* Reading objects from a file is a clear responsibility in and of itself, and should for that reason be isolated into a method.
