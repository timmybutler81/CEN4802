public class Main {

    /**
     * Returns the nth Fibonacci term using recursion.
     *
     * Sequence:
     * F(0) = 0
     * F(1) = 1
     * F(n) = F(n - 1) + F(n - 2)
     *
     * @param n the position in the Fibonacci sequence
     * @return the Fibonacci value at position n
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative.");
        }

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int term = 10;
        int result = fibonacci(term);

        System.out.println(
                "The " + term + "th term of the Fibonacci sequence is " + result + "."
        );
    }
}