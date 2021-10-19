package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		//implementation here...

		for (int i = 2; i < 1_000_000; ++i) {
			boolean isPrime = true;
			int sqrt = (int)Math.ceil(Math.sqrt(i));
			for (int divisor = 2; divisor <= sqrt; ++divisor) {
				if (i % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}
}
