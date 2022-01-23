import java.util.Date;

class FormatOutput {
       public static void main(String[] args) {
                double x = 10000.0/3.0;
		System.out.println(x);

		// Until Java 5, formatting numbers was a bit of
		// hassle. From Java 5;
		// printf method was brought back from C library
		System.out.printf("%8.2f", x);
		
		// Exactly similar to C :)

		int meow = 5;
		System.out.printf("\nCat says meow = %d\n", meow);

		/**
		 * %d, %f, and so on
		 * are format specifiers
		 *
		 * Each of the format specifiers that start with a % character
		 * is replaced with the corresponding argument
		 *
		 * The conversion character that ends a format specifier
		 * indicates the type of the value to be formatted
		 *
		 * d - Decimal Integer
		 * x - Hexadecimal Integer
		 * o - Octal Integer
		 * f - Fixed-point floating-point
		 * e - Exponential floating-point
		 * g - General floating point (the shorter of e and f)
		 * a - Hexadecimal floating point
		 * s - string
		 * c - character
		 * b - boolean
		 * h - Hash code
		 * tx (or) Tx - Date and time -- Obsolete, use the java.time classes instead
		 * % - percent symbol
		 * n - The platform-dependent line seperator
		 */
		
		/**
		 * In addition, you can also specify "flags" that control
		 * the appearnce of the formatted output
		 * Ex: %,.2f
		 */

		/**
		 * Flags:
		 * + -- prints sign for positive and negative numbers
		 * space -- adds a space before positive nunbers
		 * 0 -- Adds leading zeros
		 * - -- Left-justifies field
		 * ( -- encloses negative numbers in parentheses
		 * , -- adds group seperators
		 * # -- (for f format) -- always include the decimal point
		 * # -- (for x or o format) -- Add 0x or 0 prefix (hexadecimal or octal)
		 * $ -- Specifies the index of the argument to be formatted;
		 *	Ex: %1$d %1$x
		 *		prints first argument in decimal and hexadecimal
		 * < -- formats the same value as the previous specification
		 *	Ex: %d %<x
		 *		prints the same number in decimal and hexadecimal
		 */

		System.out.printf("%,.2f\n", 10000000000000.0/3.0);
		// group seperators are in International System
		//
		// You can use multiple flags
		// "%,(.2f" for group seperators and enclose negative numbers in parentheses
		//
		// You can use static String.format method to create a formatted string
		// without printing it
		String name = "cat";
		String msg = String.format("Hello, %s. Next year is %d", name, 2022);
		System.out.println(msg);

		String paw = new String("Lose");
		System.out.println(paw);

		/**
		 * %tx -- where x are date and time conversion flags
		 * c - Complete date and time
		 * F - ISO 8601 date [ YYYY-MM-DD ]
		 * D - U.S. formatted date (MM/DD/YYYY)
		 * T - 24-hour time (hh:mm:ss)
		 * r - 12-hour time (hh:mm:ss am/pm)
		 * R - 24-hour time without seconds (hh:mm)
		 * Y - Four-digit year (with leading zeros) [ YYYY ]
		 * y - Last two digits of the year (with leading zeroes) [ YY ]
		 * C - First two digits of the year (with leading zeroes) [ YY ]
		 * B - Full month name [February]
		 * b (or) h - Abbreviated month name [Feb]
		 * m - Two-digit month (with leading zeroes) [MM]
		 * d - Two-digit day (with leading zeroes) [DD]
		 * e - Two digit day (without leading zeroes) [DD] and D != 0
		 * A - Full weekday name [Monday]
		 * a - Abbreviated weekday name [Mon]
		 * j - Three-digit day of year (with leading zeros) [DDD] and D <= 366
		 * H - Two-digit hour (with leading zeroes) [hh] 24-hr format
		 * k - Two-digit hour (without leading zeroes) [hh] 24-hr format H != 0
		 * I - Two-digit hour (with leading zeroes) [hh] 12-hr format
		 * l - Two-digit hour (without leading zeroes) [hh] 12-hr format
		 * M - Two-digt minutes (with leading zeroes) [mm]
		 * S - Two-digit seconds (with leading zeroes) [ss]
		 * L - Three-digit milliseconds (with leading zeroes) [(ms)(ms)(ms)]
		 * N - Nine-digit nanoseconds (with leading zeroes) [nnnnnnnnn]
		 * p - Morning or afternoon marker [am/pm]
		 * z - RFC 822 numeric offset with GMT [Ex: -0800]
		 * Z - Time zone [Ex: PST]
		 * s - Seconds since 1970-01-01 00:00:00 GMT
		 * Q - Milliseconds since 1970-01-01 00:00:00 GMT
		 */

		System.out.printf("\n%tc", new Date());
		
		Date bow = new Date();
		System.out.printf("\n%tY Year", bow);
       }
}

/**
 * < flag indicates that the same argument as in the preceding format specification
 * should be used again
 * For example:
 * System.out.printf("%s %tB %<te, %<tY", "Due date:", new Date());
 *
 * Caution:
 * Argument index values start with 1, not with 0:
 * %1$... formats the first argument. This avoids confusion with the 0 flag
 */
