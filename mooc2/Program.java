import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        // We initialize a scanner and the list into which input is read
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        
        // reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            inputs.add(row);
        }
        
        // counting the number of values divisible by three
        long numbersDivisibleByThree = inputs.stream()
    		.mapToInt(string -> Integer.valueOf(string))
		.filter(no -> no % 3 == 0)
		.count();
            
        // working out the average
        double average = inputs.stream()
	    	.mapToInt(s -> Integer.valueOf(s))
		.average()
    		.getAsDouble();
            
        // print out hte statistics
        System.out.println("Divisible by three: " + numbersDivisibleByThree);
        System.out.println("Average numbers: " + average);
    }
}
