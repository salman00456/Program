 package program;

public class ReverseStringPreservingSpace {
	
	public static void reverseWithSpace(String inputString) {
		
	char[] stringArray	= inputString.toCharArray();
	
	char[] resultArray= new char[stringArray.length];
	
	for(int i=0;i<stringArray.length;i++) {
		
		if(stringArray[i] == ' ') {
			resultArray[i] = ' ';
		}
	}
	
	int j = resultArray.length-1;
	for(int i=0;i<stringArray.length;i++) {
		if(stringArray[i] != ' ') {
			
			
			if(resultArray[j]== ' ') {
				j--;
			}
			
			resultArray[j]= stringArray[i];
			j--;
		}
		
		
	}
	
	System.out.println(String.valueOf(resultArray));
		
	}
	    public static void main(String[] args) {
	    	
	    	reverseWithSpace("Welcome to India");
	    	
	     }
	}
	

