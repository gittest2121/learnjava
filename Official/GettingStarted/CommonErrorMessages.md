# Common Error Messages
### 'javac' is not recognized as an internal or external command, operable program or batch file (on Microsoft Windows Systems)

If you receive this error, Windows cannot find the compiler (javac).
Check PATH or Installation.

### javac: Command not found (on UNIX/Linux Systems)

If you receive this error, UNIX/Linux cannot find the compiler (javac).
Check PATH or Installation.


#$ Syntax Erros
If you mistype part of a program, the compiler may issue a synatx error. The message usually displays the type of the error, the line number where the error was detected, the code on the file, and the position of the error within the code.

#$ Semantic Errors
If your program is syntactically correct, the compiler checks for other basic correctness. For example, the compiler warns you each time you use a variable that has not been initialized.

# Runtime Errors
## On Microsoft Windows Systems
### Exception in thread "main" java.lang.NoClassDefFoundError: HelloWorldApp
If you receive this error, java cannot find your bytecode file, HelloWorldApp.class

### Could not find or load main class HellowWorldApp.class
Remove .class while running *java* command<br>
Remember, the argument is the _name of the class_ you want to use, not the file name.

### Exception in thread "main" java.lang.NoSuchMethodError: main
The Java VM requires that the class you execute with it have a *main* method at which to begin excecution of your application.

## On UNIX/Linux Systems
### Exception in thread "main" java.lang.NoClassDefFoundError: HelloWorldApp
If you receive this error, java cannot find your bytecode file, HelloWorldApp.class

### Exception in thread "main" java.lang.NoClassDefFoundError: HelloWorldApp/class
Remove .class while running *java* command<br>
Remember, the argument is the _name of the class_ you want to use, not the file name.

### Exception in thread "main" java.lang.NoSuchMethodError: main
The Java VM requires that the class you execute with it have a *main* method at which to begin excecution of your application.

# Applet or Java Web Start Application is Blocked
If you are running an application through a browser and get security warnings that say the application is blocked, check the following items:

    Verify that the attributes in the JAR file manifest are set correctly for the environment in which the application is running. The Permissions attribute is required. In a NetBeans project, you can open the manifest file from the Files tab of the NetBeans IDE by expanding the project folder and double-clicking manifest.mf.

    Verify that the application is signed by a valid certificate and that the certificate is located in the Signer CA keystore.

    If you are running a local applet, set up a web server to use for testing. You can also add your application to the exception site list, which is managed in the Security tab of the Java Control Panel.

*Credits:* https://docs.oracle.com/javase/tutorial/getStarted/problems/index.html
