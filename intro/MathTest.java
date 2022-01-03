import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MathTest {
    public static void main(String[] args) {
        var x = 4;
        System.out.println("Square Root of 4 is " + sqrt(x));
        System.out.println("5th Power of 4 is " + pow(x, 5));
        System.out.println("Remainder of 5 divided by 4 is " + 5%x);
        // Dividend % Divisor = Remainder
        // If Divisor is negative, then floorMod function of Math is better to use than %
    }   
}