import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;


public class E {
	static BigDecimal e(int n) {
		/* Takes an integer, n, and returns the value of e, calculated with n steps of the Taylor 
		series, returns e as a BigDecimal value */
		// Out of range error handling
		if (0 > n || n > Integer.MAX_VALUE) {
			System.out.println("Valid e iterations range is [1, 2147483647]");
			return new BigDecimal("-1");
		}
		
		// MathContext object sets decimal places to 16 and sets default rounding 
		MathContext mc = new MathContext(16);	
		
		BigDecimal e = BigDecimal.ONE;
		for (int i = 1; i <= n; i++) {
			BigInteger iFactorial = Fac.fac(i);
			BigDecimal iFactDecimal = new BigDecimal(iFactorial);
			e = e.add(BigDecimal.ONE.divide(iFactDecimal, mc), mc);	// e += (1 / i!)
		}
		return e;
	}
}