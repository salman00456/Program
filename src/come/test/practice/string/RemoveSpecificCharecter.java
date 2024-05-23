package come.test.practice.string;

public class RemoveSpecificCharecter {
	
	
	public static void main(String[] args) {
		
		String str = "Javalanguagee";
		
		char removeChar ='a';
		
		 System.out.println(str.replaceAll(String.valueOf(removeChar), ""));
	}

}
