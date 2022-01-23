/* The Scanner class is not suitable for reading a password
 * from a console since the input is plainly visible to anyone
 * Java 6 introduces a Console class specifically for this purpose
 */

import java.io.Console;

class SafeInput {
       public static void main(String[] args) {
                Console cons = System.console(); // Construct a object for Console class
                String username = cons.readLine("User name: ");
		char[] passwd = cons.readPassword("Password: ");
       }
}
/* For security reasons, the password is returned in an array of 
 * characters rather than a string.
 * After you are done processing the password, you should immediately
 * overwrite the array elements with a filler
 * [ This will be described in Array Processing later ]
 *
 * Input processing with a Console object is not as convenient as with
 * Scanner. You must read the input a line at a time. There are no methods
 * for reading induvidual words or numbers
 */
