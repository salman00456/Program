package program;

public class FindTheVowel {
	
	public static void vowel(String str) {
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch);
			}
		}
	}
	
	public static void main(String[] args) {

		System.out.println("Find the vowel in given String");
		
		String str ="Accenture";
		vowel(str);
		
	}

}
