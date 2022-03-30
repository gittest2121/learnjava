# Application's Launch Parameters
* The application is generally launched from outside the class by using the *launch* method provided by the *Application* class. A seperate class *Main* launches the application in the example below.
```
public static void main(String[] args) {
	Application.launch(JavaFxApplication.class);
}
```
* When the main method of the class above is executed, the UI defined by the class JavaFxApplication is launched.
* The application can also be provided run-time parameters as part of the launch method. In addition to the launched class, the launch method can be provided an unlimited number of strings that can be used as part of the lunch. These strings are available during the application's launch via the *getParameters* method call.
* The *getParameters* methods returns a [Parameters] type object whose method getNamed can access a hash table containing key-value pairs. The key-value pairs are given to the launch method in the form --key = value.
```
@Override
public void start(Stage window) {
	Parameters params = getParameters();
	String organization = params.getNamed().get("organization");
	String course = params.getNamed().get("course");

	window.setTitle(organization + ": " + course);
	window.show();
}

public static void main(String[] args) {
	Application.launch(JavaFxApplication.class, "--organization=Once upon a time", "--course=Title");
}
```
