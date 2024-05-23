package program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test {
	
	
	public static void reverseWithSpace(String inputString) {
		
		char[] inputArray = inputString.toCharArray();
		
		char[] result = new char[inputArray.length];
		
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i]==' ') {
				result[i]=' ';
			}
		}
		
		int j=result.length-1;
		
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i]!=' ') {
				
				if(result[j]==' ') {
					j--;
				}
				
				result[j]=inputArray[i];
				j--;
			}
		}
		
		System.out.println(String.valueOf(result));
	}
	
	public static void main(String[] args) {
		

		reverseWithSpace("welcome to india");
	}
	
	
	}

