package program;

public class ReverseAltWordInString {
	
	
	public static void main(String[] args) {
		
		
		String str ="My name is salman";
		String result2 =revAltWord(str);
		System.out.println(result2);
	}
	
	
	public static String reverse(String str) {
		
		String result="";
		
		for(int i=str.length()-1;i>=0;i--) {
			result=result+str.charAt(i);
		}
		

		return result;

	}
	
	public static String revAltWord(String str) {
		
		
		String[] newStr =str.split(" ");
		String result1="";
		
		for(int i=0;i<newStr.length;i++) {
			
			if(i%2==1) {
				newStr[i]=reverse(newStr[i]);
			}
			
			result1=result1+" "+newStr[i];
		}
		return result1;
	}

}
