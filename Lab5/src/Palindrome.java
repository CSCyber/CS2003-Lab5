import java.util.Scanner;

public class Palindrome {
private static String test = "";

	public static boolean isaPalindrome(String exp) {
		int length = exp.length();
		
		if(length == 0 ) 
				return true;
		
		if(length  == 1) {
			test += exp.charAt(length-1);
			return true;
			
		}
		
		if(length >= 2) {
			test += exp.charAt(length-1);
			isaPalindrome(exp.substring(0, length-1));	
			
			if(exp.equals(test))
				return true;
		}
		
		
		
		
		
		return false;
	}
	
	
	
	
	public static void main(String args[]) {
		String exp = "";
		Scanner in = new Scanner(System.in);
		
		while(!exp.equals("quit")) {
		System.out.println("Enter a string to see if it is a Palindrome or quit to quit: ");
		exp = in.next();
		
		System.out.println(isaPalindrome(exp));
		}
		in.close();
	}
}
