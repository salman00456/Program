package program;

import java.util.HashMap;

public class CheckForAnagram {
	
		public static void main(String[] args) {

	String str ="silent";
	String str1="listen";
	
	char[] ch1 =str.toCharArray();
	char[] ch2=str1.toCharArray();
	
	HashMap<Character,Integer> map = new HashMap<>();
	HashMap<Character,Integer> map1 = new HashMap<>();
	
	for(char c:ch1) {
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		}else {
			map.put(c, 1);
		}
	}
	
	System.out.println(map);
	
	for(char c:ch2) {
		if(map1.containsKey(c)) {
			map1.put(c,map1.get(c)+1);
		}else {
			map1.put(c,1);
		}
	}
	
	System.out.println(map1);
	
	if(map.equals(map1)) {
		System.out.println("given string is anagram");
	}else {
		System.out.println("Given string is not anagram");
	}
		
		
	}

}
