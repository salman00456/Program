package program;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test2 {
	
	public static void main(String[] args) {
	
	String str = "mohammad salman";
	
	String result1="";
	
	String[] newStr = str.split(" ");
	
	for(int i=0;i<newStr.length;i++) {
		
	String sstr =	newStr[i];
	
	String result="";
	
	for(int j=sstr.length()-1;j>=0;j--) {
		
		result=result+sstr.charAt(j);
	}
		result1=result1+result+" ";
	}
	
	System.out.println(result1);
		
		}

}