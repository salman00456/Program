package come.test.practice.string;

public class test {
	
	public static void main(String[] args) {
		

		System.out.println("Find the vowel in given String");
		
		String str ="Accenture";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch);
			}
		}
	}

}
