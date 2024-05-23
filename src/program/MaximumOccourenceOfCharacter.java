package program;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccourenceOfCharacter {

	public static void main(String[] args) {
		
		String str ="salmanAuto";
		
		char[] ch = str.toLowerCase().toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
	for(char c:ch) {
			
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}else {
				map.put(c,1);
			}
		}
		
		System.out.println(map);
		
		int maxCount=0;
		char maxChar=' ';
		
		for(Map.Entry<Character, Integer> e : map.entrySet()) {
			if(e.getValue()>maxCount) {
				maxCount=e.getValue();
				maxChar=e.getKey();
			}
			
		}
		System.out.println("Maximum occourence of character is "+maxChar+" and their count is "+maxCount);

		
	}

}
