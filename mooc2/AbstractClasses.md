# Abstract Classes
* An abstract class combines interfaces and inheritance. You cannot create instances of them -- you can only create instances of subclasses of an abstract class.
* They can include normal methods which have a method body, but it's also possible to define abstract methods that only contain the method definition.
* Generally, abstract classes are used in situations where the concept that the class represents is not a clear independent concept -- in such a cas, you shouldn't be able to create instances of it.
* Keyword : **abstract**
* Class Definitions : **public abstract class Name** (example)
* Method Definitions : **public abstract returnType methodName** (example)

```
import java.util.Scanner;

public abstract class Operation {

  private String name;

  public Operation(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public abstract void execute(Scanner scanner);
}
```

* The abstract class *Operation* works as a basis for implementing different actions.
```
public class PlusOperation extends Operation {

  public PlusOperation() {
    super("PlusOperation");
  }

  @Override
  public void execute(Scanner scanner) {
    System.out.print("First number: ");
    int first = Integer.valueOf(scanner.nextLine());

    System.out.print("Second number: ");
    int second = Integer.valueOf(scanner.nextLine());

    System.out.println("The sum of the numbers iss " + (first + second));
  }
}
```

* Since all the classes that inherit from *Operation* have also the type *Operation*, we can create a user interface by using *Operation* type variables.
```
public class UI {

  private Scanner scanner;
  private ArrayList<Operation> operations;

  public UI(Scanner scanner) {
    this.scanner = scanner;
    this.operations = new ArrayList<>();
  }

  public void addOperation(Operation operation) {
    this.operations.add(operation);
  }

  public void start() {
    while (true) {
      printOperations();
      System.out.println("Choice: ");

      String choice = this.scanner.nextLine();
      if (choice.equals("0")) {
        break;
      }

      execteOperation(choice);
      System.out.println();
    }
  }

  public void printOperations() {
    System.out.println("\t0: Stop");
    int i = 0;
    while (i < this.operations.size()) {
      String operationName = this.operations.get(i).getName();
      System.out.println("\t" + (i + 1) + ": " + operationName);
      ++i;
    }
  }

  public void executeOperation(String choice) {
    int operation = Integer.valueOf(choice);

    Operation chosen = this.operations.get(operation - 1);
    chosen.execute(scanner);
  }
}
```

* The greatest difference between interfaces and abstract classes is that abstract classes can contain object variables and constructors in addition to methods.
* Since you can also define functionality in abstract classes, you can use them to define default behavior.
