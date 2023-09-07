public class Fib {
  	static int fib(int n) {
		// Takes an integer, n, and returns the nth value in the fibonacci sequence, returns -1 if input is invalid
		// Out of range error handling
		if (0 > n || n > 40) {
			System.out.println("Fibonacci valid range is [0, 40]");
			return -1;
		}
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
}