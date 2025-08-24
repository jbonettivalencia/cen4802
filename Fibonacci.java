/**
 * Demonstrates recursion by calculate terms of the Fibonacci sequence
 */
public class Fibonacci {

    /**
     * Returns the nth term of the Fibonacci sequence using recursion
     * For n = 0 or n = 1, this method returns n
     *
     * @param n the index of the term to compute
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Entry point: computes and prints the 10th term of the Fibonacci sequence
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
