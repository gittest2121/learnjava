# Interfaces
* We can use interfaces to define behavior that's required from a class -- its methods.
* They're defined in the same way as Regular Java classes are, but **public interface ...** is used instead of **public class ...** at the beginning of the class.
* Interfaces define behavior through method names and their return values. However, they don't always include the actual implementations of the methods.
* A visible attribute is not marked explicitly as they're always public.
* For example,
```
public interface Readable {
  String read();
}
```
* The *Readable* interface declares a read() method, which returns a *String-type object*.
* The classes that implement the interface decide how the methods defined in the interface are implements.
* Keyword: **implements**
```
public class TextMessage implements Readable {
  private String sender;
  private String content;

  public TextMessage(String sender, String content) {
    this.sender = sender;
    this.content = content;
  }

  public String getSender() {
    return this.sender;
  }

  public String read() {
    return this.content;
  }
}
```
* Implementations of methods defined in the interface must always have public as their visibility attribute.
* **An Interface is a Contract of Behavior**
* When a class implements an interface, it signs an agreement. The agreement dictates that the class will implement the methods defined by the interface. If those methods are not implemented in the class, the program will not function.
* The interface defines only the names, parameters, and return values of the required methods.The interface, however, doesn't say on the internal implementation of its methods.
* Objects can be instantiated from interface-implementing classes just like with normal classes.
```
import java.util.ArrayList;

public class Ebook implements Readable {
  private String name;
  private ArrayList<String> pages;
  private int pageNo;

  public Ebook(String name, ArrayList<String> pages) {
    this.name = name;
    this.pages = pages;
    this.pageNo = 0;
  }

  <getter for Name>
  
  public int pages() {
    return this.pages.size();
  }

  public String read() {
    String page = this.pages.get(this.pageNo);
    nextPage();
    return page;
  }

  public void nextPage() {
    ++this.pageNo;
    if (this.pageNo % this.pages.size() == 0) {
      this.pageNo = 0;
    }
  }
}
```
```
TextMessage msg = new TextMessage("What?", "What -- content?");
System.out.println(msg.read()); // outputs -- It's going great!

ArrayList<TextMessage> textMessage = new ArrayList<>();
textMessage.add(new TextMessage("hello", "hi"));


ArrayList<String> pages = new ArrayList<>();

pages.add("Split your method into short, readable entities.");
pages.add("Separate the user-interface logic from the application logic.");
pages.add("Always program a small part initially that solves a part of the problem.");
pages.add("Practice makes the master. Try different out things for yourself and work on your own projects.");

Ebook book = new Ebook("Tips for programming.", pages);

int page = 0;
while (page < book.pages()) {
    System.out.println(book.read());
    page = page + 1;
}

// outputs -- Split your.....
//            ...............
//            ...............
//            ......projects.
```
* **An interface can be used as type.**

# Type Conversion (Casting)
* Type conversion succeeds iff the variable is of the type that it's being converted to.
* Type conversion is **not considered good practice**, and one of the few situation where it's use is **appropriate is in the implementation of the equals method.**


# Reducing the dependencies between classes
* Using interfaces in programming enables **reducing dependencies between classes.**
* For example, the Packer doesn't depend on the classes that implement the Packable interface. Instead, it just depends on the interface. This makes possible to add new classes that implement an interface without changing the Packer class. What is more, adding new Packable classes doesn't affect the classes that use Packer class.
