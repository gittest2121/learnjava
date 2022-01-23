import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

class FileIO {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("test.txt"));
		System.out.println(in.next());

		PrintWriter out = new PrintWriter("test2.txt");
		// If file doesn't exist, it will be created
		System.out.println(out);
	}
}

// When you launch a program from a command shell
// you can use redirection syntax of your shell
// and attack any file to System.in and System.out:
// java MyProg > myfile.txt < output.txt
