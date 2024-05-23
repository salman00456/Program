package program;

public class CheckForPalindrome {
	
	public static void isPlaindrome(String str) {

		String temp=str;
		String rev="";
		
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		//System.out.println(rev);
		
		if(temp.equals(rev)) {
			System.out.println("Given String is palindrome");
			
		}else {
			System.out.println("Given String is not plaindrome");
		}
		
	}

	public static void main(String[] args) {

		String str ="abcdcba";
		
		isPlaindrome(str);
	
		
		
	}

}
