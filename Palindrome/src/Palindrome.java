// Check whether a givin string is a palindrome

import java.util.Stack;


public class Palindrome {

	private String inputString;
	private Stack<Character> charStack = new Stack<Character>();
	
	public Palindrome(String str) {
		inputString = str;
		fillStack();
	}
	
	private void fillStack() {
		  for(int i = 0; i < inputString.length(); i++) {
		   charStack.push(inputString.charAt(i));
		  }
		}
	
	private String buildReverse(){
		StringBuilder result = new StringBuilder();
		while(!charStack.empty()) {
		 result.append(charStack.pop());
		}
		return result.toString();
		}
	/**
	 * 
	 * @return 
	 */
	public boolean isPalindrome() {
	     return inputString.equalsIgnoreCase(buildReverse());
	   }
	
	
	public static void main(String[] args) {

		Palindrome p1 = new Palindrome("kayak");
		System.out.println("Kayak Is Palindrome = " + p1.isPalindrome());
		
		

	}

}
