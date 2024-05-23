package come.test.practice.string;

public class RemoveSpecificWord {
	
	public static void main(String[] args) {
		
		String str = "Java is Java and best language is Java";
		
		String removeWord = "Java";
		
		String afterRemove = str.replaceAll(String.valueOf(removeWord), "");
		System.out.println(afterRemove.trim());
	}

}
