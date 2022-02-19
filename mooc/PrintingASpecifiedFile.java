import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String filename = scanner.nextLine();
        
        ArrayList<String> lines = new ArrayList<>();
        
        try (Scanner readfile = new Scanner(Paths.get(filename))) {
            
            while (readfile.hasNextLine()) {
                lines.add(readfile.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Total lines: " + lines.size());
    }
}
