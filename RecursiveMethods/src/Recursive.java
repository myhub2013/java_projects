/**
 * 
 * @author Brian Nava RecursiveMethods.java
 * 
 */
public class Recursive implements RecursiveMethodsInterface {

	/**sum all numbers from 0 to max
	 * 
	 * @param max max value to sum
	 */
	public int sumTo(int max) {
		if (max == 0) { // base case
			return 0;
		} else if (max > 0) { // recursive case
			return max + sumTo(max - 1);
		} else {
			return max + sumTo(max + 1);
		}
	}

	/**prints a mirrored pattern of numbers to max value
	 * 
	 * @param max max value to print
	 */
	public void printNumbers(int max) {
		if (max <= 0) {
			System.out.print("");
		} else {
			printNumbers(max / 2);
			System.out.print("[" + max + "]");
			printNumbers(max / 2);
		}
	}

	/**returns true if strings are anagrams, false if not
	 * 
	 * @param s1 first string to compare
	 * @param s2 second string to compare
	 */
	public boolean phraseAnagramCheck(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false; // strings of different lengths not anagrams
		} else if (s1.length() == 1) {
			return s1.equalsIgnoreCase(s2);
		}
		// convert to lower case for comparison
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		char c = s1.charAt(0);

		if (s2.indexOf(c) == -1) {
			return false; // character not found
		} else {
			s2 = s2.substring(0, s2.indexOf(c))
					+ s2.substring(s2.indexOf(c) + 1);
			phraseAnagramCheck(s1.substring(1), s2);
		}
		return true;
	}

	/**return integer value of string representing binary numbers
	 * 
	 * @param text represent binary digits
	 */
	public int toDecimal(String text) {
		if (text == "null" || text.equals("")) {
			return 0;
		} else if (text == "1") {
			return 1;
		}

		else if (text.charAt(0) == '1') {
			return (int) Math.pow(2, text.length() - 1)
					+ toDecimal(text.substring(1));
		} else
			return toDecimal(text.substring(1));
	}
	

}
