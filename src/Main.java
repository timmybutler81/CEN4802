public class Main {

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