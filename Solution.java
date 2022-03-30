import java.util.Arrays;

public class Solution {
    public static boolean check(Object[] a, Object x) {
        return Arrays.stream(a).anyMatch(x::equals);
    }

    public static void main(String[] args) {
	    Object[] arr = {10, 20, 30, 40, 50};
	    System.out.println(check(arr, 40));
	    System.out.println(check(arr, 32));
    }
}
