/** package class namespace */
package testing;

/**
 * required imports
 */
import tools.Calculator;

/**
 * RecursionTest.java - tests recursive methods
 *
 * @author Tharindu Kottegoda
 * @since Sep 15, 2020
 */
public class RecursionTest {

    public RecursionTest() {
        System.out.println("\nRecursion test started...\n");
        /*When testing, think of 3 scenarios
            1. Typical case (user does what they are told
            2. Edge cases (users who pushes the program eg.age is a negative number)
            3. Beyond the edge (tries to break program eg.leaves prompt empty)
         */

        System.out.println("Recursive factorial.............................");
        final int MIN_FACTORIAL = 0;
        final int MAX_FACTORIAL = 20;
        for (int i = MIN_FACTORIAL; i <= MAX_FACTORIAL; i++) {
            long answer = Calculator.factorial(i);
            System.out.println(i + "\t factorial = \t" + answer);
        }

        System.out.println("Recursive powers................................");
        final int MIN_POWER = -1;
        final int MAX_POWER = 10;
        for (int base = MIN_POWER; base <= MAX_POWER; base++) {
            for (int exponent = MIN_POWER; exponent <= MAX_POWER; exponent++) {
                double answer = Calculator.power(base, exponent);
                System.out.println(base + "\t to the exponent \t"
                        + exponent + "\t = \t" + answer);
            }
        }

        System.out.println("\nRecursion test complete!\n");
    }
}
