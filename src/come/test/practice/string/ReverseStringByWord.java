package come.test.practice.string;

import java.util.LinkedList;

public class ReverseStringByWord {
	
	public static void main(String[] args) {
		
		String str = "Java is the best language ";
		 
		String result ="";
		
		String [] arr = str.split(" ");
		
		int len = arr.length;
		
		for(int i=len-1;i>=0;i--) {
			
			result=result+" "+arr[i];
		}
		
		System.out.println(result);
		
			
		}
	}


