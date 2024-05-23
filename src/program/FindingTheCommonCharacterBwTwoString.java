package program;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindingTheCommonCharacterBwTwoString {
	
	public static void main(String[] args) {
		
		String str1 ="thin stick";
		String str2 ="thick brick";
		
		//Step 1. remove the white space and convert it into toCharArray for both string
		
		char[] newStr1 = str1.replaceAll("\\s+", "").toCharArray();
		char[] newStr2 = str2.replaceAll("\\s+", "").toCharArray();
		
		//Step 2.Now create TreeSet
		
		Set<Character> set1= new TreeSet<>();
		Set<Character> set2 = new TreeSet<>();
		
		//Step 3. Iterating by using for each loop
		
		for(char ch1:newStr1) {
			set1.add(ch1);
		}
		
		for(char ch2:newStr2) {
			set2.add(ch2);
		}
		
		set1.retainAll(set2	);
		
		System.out.println("common character between Two string is "+ set1);
		
		}

}
