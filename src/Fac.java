import java.math.BigInteger;

public class Fac {
  	private static BigInteger fac(int n) {
		// Takes an integer, n, and returns n! as a BigInteger, returns -1 if input is invalid
		// Out of range error handling
		if (0 > n || n > Integer.MAX_VALUE) {
			System.out.println("Factorial valid range is [0, 2147483647]");
			return new BigInteger("-1");
		}

		BigInteger x = BigInteger.ONE;

		for (int i = n; i > 1; i--) {
			x = x.multiply(BigInteger.valueOf(i));
		}			
		return x;
	}	
}