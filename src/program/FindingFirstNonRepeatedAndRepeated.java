package program;

import java.util.HashMap;

public class FindingFirstNonRepeatedAndRepeated {
	
	public static void main(String[] args) {
		
		String str ="JavaConceptOfJavaDay";
		
		char[] arr=str.toLowerCase().toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch:arr) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		//Now checking the first condition of non repeated one
		
		for(char c:arr) {
			if(map.get(c)==1) {
				System.out.println("First non repeated charter is "+c);
				break;
			}
		}
		
		for(char c:arr) {
			if(map.get(c)>1) {
				System.out.println("first repeated charter is "+c);
				break;
			}
		}
	}

}
