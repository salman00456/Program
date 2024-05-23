package program;

public class ExtractingWordInString {
	
	public static void main(String[] args) {
		
		String str ="JavaIsTheConceptJavaOfDay";
		
		String target ="Java";
		
		//Finding the first occourence of java
		
		int index = str.indexOf(target);
		
		if(index!=-1) {
			
		String result =	str.substring(index, index+target.length());
		
		System.out.println(result);
		}
	}

}
