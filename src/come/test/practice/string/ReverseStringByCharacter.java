package come.test.practice.string;

public class ReverseStringByCharacter {
	
	public static void main(String[] args) {
		
		String str = "Salman";
		String result ="";
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--) {
			result = result+str.charAt(i);
		}
		
		System.out.println(result);
		
	}

}
