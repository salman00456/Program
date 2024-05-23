package come.test.practice.string;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String str ="level";
		
		String result="";
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--) {
			
			result=result+str.charAt(i);
		}
		
		//System.out.println(result);
		
		if(str.equals(result)) {
			System.out.println("Given String is palindrome");
		}else {
			System.out.println("Given string is not palindrome");
		}
	}

}
