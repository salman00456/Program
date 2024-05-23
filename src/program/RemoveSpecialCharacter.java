package program;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {

		String str ="salman@!#n";
		String str1 ="AsSDsalsk878@##$";
		
		System.out.println(str.replaceAll("[^a-z]", ""));
		System.out.println(str1.replaceAll("[^a-z0-9]",""));

	}

}
