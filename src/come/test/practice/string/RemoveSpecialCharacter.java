package come.test.practice.string;

public class RemoveSpecialCharacter {
	
	public static void main(String[] args) {
		
		String str = "Salman$#%$Yoi";
		
		String afterRemove = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(afterRemove);
	}

}
