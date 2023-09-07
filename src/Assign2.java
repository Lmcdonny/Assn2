// Instructions say to name this file Assn2, gradle instructions say to name it Assn2Main
import java.math.BigDecimal;
import java.math.BigInteger;
import Fib.fib;
import Fac.fac;
import E.e;


class Assign1 {
	private static boolean parseCmd(String cmdString, String nString) {
		try {
			int n = Integer.parseInt(nString);
		} catch(Exception e) {
			System.out.println("Argument must be an integer: " + nString);
			return false;
		}

		int INT_ERROR = -1;
		BigInteger BIG_INTEGER_ERROR = new BigInteger("-1");
		BigDecimal BIG_DECIMAL_ERROR = new BigDecimal("-1");

		int n = Integer.parseInt(nString);
		switch (cmdString) {
			case "-fib": 
				int fibAnswer = fib(n);
				if (fibAnswer == INT_ERROR) {
					break;
				}
				System.out.println("Fibonacci of " + nString + " is " + fibAnswer);
				break;
			case "-fac": 
				BigInteger facAnswer = fac(n);
				if (facAnswer.equals(BIG_INTEGER_ERROR)) {
					break;
				}
				System.out.println("Factorial of " + nString + " is " + facAnswer.toString());
				break;
			case "-e": 
				BigDecimal eAnswer = e(n);
				if (eAnswer.equals(BIG_DECIMAL_ERROR)) {
					break;
				}
				System.out.println("Value of e using " + nString + " iterations is " + eAnswer.toString());
				break;
			default:
				System.out.println("Unknown command line argument: " + cmdString);

		}
		return true;
	}


	public static void main(String[] args) {		
		for (int i = 0; i < args.length; i+=2) {
			if (i + 1 == args.length) {
				System.out.println("Command requires an argument: " + args[i]);
				break;
			}
			if (!parseCmd(args[i], args[i+1])) {
				break;
			}
		}
	}
}
