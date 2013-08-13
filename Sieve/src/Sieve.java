/**
 * 
 * @author Brian Nava CIT245 Sieve.java 
 * This program computes all the prime
 *         numbers up to n
 * 
 */
public class Sieve {

	private Queue<Integer> numbersQueue;
	private Queue<Integer> primeQueue;
	private int max = 0;

	/** Constructor creates sieve object
	 * 
	 */
	public Sieve() {
		numbersQueue = new LinkedQueue<Integer>();
	}

	/**
	 * Compute prime numbers up to a given n
	 * 
	 * @param max
	 */
	public void computeTo(int max) {
		if (max < 2) {
			throw new IllegalArgumentException("Invalid Data");
		}
		this.max = max;
		// fill numbers queue
		for (int i = 2; i <= max; i++) {
			numbersQueue.enqueue(i);
		}
		// create queue to store primes
		primeQueue = new LinkedQueue<Integer>();

		int p = 0;
		do {
			// move first number into prime queue
			p = numbersQueue.dequeue();
			primeQueue.enqueue(p);

			// create queue for temporary storage
			Queue<Integer> temp = new LinkedQueue<Integer>();

			// store numbers that are not multiples of p
			// in temp queue
			while (!numbersQueue.isEmpty()) {
				int item = numbersQueue.dequeue();
				if (item % p != 0) {
					temp.enqueue(item); 
				}
			}
			// move temp queue values back into numbers queue
			// for further iteration
			while (!temp.isEmpty()) {
				numbersQueue.enqueue(temp.dequeue());
			}
		} while (p < Math.sqrt(max));

		// move remaining numbers into prime queue
		while (!numbersQueue.isEmpty()) {
			primeQueue.enqueue(numbersQueue.dequeue());
		}

	}

	/**
	 * Print prime numbers
	 * 
	 */
	public void reportResults() {
		System.out.println("Primes up to " + max + " are as follows: ");

		Queue<Integer> tempQueue = new LinkedQueue<Integer>();

		for (int i = 0; i <= primeQueue.size() + 1; i++) {
			for (int j = 0; j < 12; j++) {
				if (!primeQueue.isEmpty()) {
					int val = primeQueue.dequeue();
					// temporary storage for values
					tempQueue.enqueue(val);
					System.out.print(val + " ");
				}
			}
			System.out.println();
		}
		// Put values back into primeQueue
		while (!tempQueue.isEmpty()) {
			primeQueue.enqueue(tempQueue.dequeue());
		}
	}

	/**
	 * Return number of primes found
	 * 
	 * @return number of primes
	 */
	public int getCount() {
		if (primeQueue.size() == 0) {
			throw new IllegalStateException("Queue has not been set");
		}
		return primeQueue.size();
	}

	/**
	 * Return value of n from last call to compute method
	 * 
	 * @return max
	 */
	public int getMax() {
		if (max == 0) {
			throw new IllegalStateException("max has no value");
		}
		return max;
	}

}
