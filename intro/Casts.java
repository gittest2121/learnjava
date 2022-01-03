public class Casts {
    public static void main(String[] args) {
        /** 
         * Conversions in which loss of information is possible are done by means of casts.
         * The synatx for casting is to give target type in parentheses, followed by variable name. 
         * In case of casting floating point data types, the mantissa will be dropped instead of rounding off.
         * For Rounding off to nearest integer instead of dropping, use Math.round method. */ 
        double x = 9.997;
        System.out.println("When casting is done: " + (int) x);
        System.out.println("When Math.round method is used: " + Math.round(x));
    }
}