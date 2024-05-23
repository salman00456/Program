package program;

public class ReverseStringByCharacter {
	
	public static void main(String[] args) {
		
		String str ="Java is an Language";
		
		String rev="";
		String rev1="";
		//For reversing the string by Character
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);// outPut: egaugnaL  na si avaJ
		
		//Reversing the String by Word
		
		String[] word =str.split(" ");
		for(int i=word.length-1;i>=0;i--) {
			rev1=rev1+" "+word[i];
		}
		
		System.out.println(rev1+" ");//Language  an is Java 
		
		//Getting first letter of each word--//JiaL
		
		for(int i=0;i<word.length;i++) {
			String s =word[i];
			System.out.println(s.charAt(0));//J i a L
		}
		
		
		
		
	}

}
