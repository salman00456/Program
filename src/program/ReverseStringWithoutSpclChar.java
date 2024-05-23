package program;

public class ReverseStringWithoutSpclChar {
	
	
	public static void reverseChar(String str) {
		
		char[] newStr =str.toCharArray();
		
		int i=0;
		int j=newStr.length-1;
		
		while(i<j) {
			
			if(!Character.isAlphabetic(newStr[i])) {
				i++;
			}else if(!Character.isAlphabetic(newStr[j])) {
				j--;
			}
			
			char temp=newStr[i];
			newStr[i]=newStr[j];
			newStr[j]=temp;
			i++;
			j--;
		}
		String result = new String(newStr);
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		
		String str ="sa@#ma$asd";
		reverseChar(str);
		
		
	}

}
