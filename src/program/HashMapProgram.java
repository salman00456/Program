package program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapProgram {

	public static void main(String[] args) {
		

		
		System.out.println("modify the string to get the output a3b2c2d4");
		// Step 1. First create the HashMap
		

		
	String str = "aaabbccc";
		
		char[] ch =str.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c:ch) {
			
			if(map.containsKey(c)) {
				
			int count =	map.get(c);
			count++;
			
			map.replace(c, count);
				
				
			}else {
				map.put(c, 1);
			}
		}
		
		for(char entry:map.keySet()) {
			System.out.print(entry+""+map.get(entry));
		}
		
		
		
		}
		

	}


