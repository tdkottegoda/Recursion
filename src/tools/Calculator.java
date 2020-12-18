/** package class namespace **/
package tools;

/**
 * Calculator.java - useful methods for math calculations
 *
 * @author Tharindu Kottegoda
 * @since Sep 15, 2020
 */
public class Calculator {

    /**
     * calculates the factorial of a number (n)
     * Recursive methods need at least one base case (to stop the recursion), 
     * but can have more than one. They also need to have at minimum one 
     * recursive case (but also can have multiple recursive cases). Recursive 
     * cases means the method calls itself!
     * 
     * 
     * @param n the number to calculate the factorial of
     * @return the factorial of the parameter
     */
    public static long factorial(long n) {
        if (n <= 1) return 1; // base case
        return n * factorial(n - 1); // recursive case    
        }

           
     /**
     * Calculates the power of a base to it's exponent
     * 
     * @param base the base of the power
     * @param exponent the exponent of the power
     * @return the base^exponent
     */
    public static double power(int base, int exponent) {
        // base case(s)
        if (exponent == 0) return 1;
        if (exponent == 1) return base;
        // recursive case(s)
        if (exponent < 0) {                     // for negative exponents
            if (base != 0) {
                return 1 / power(base,exponent * -1);
            }
            else {                              // cannot divide by zero!
                return Double.MIN_VALUE;        // special case
            }
        }
        return base * power(base, exponent-1);
    }
}