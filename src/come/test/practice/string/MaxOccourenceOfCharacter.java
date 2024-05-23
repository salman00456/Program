package come.test.practice.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MaxOccourenceOfCharacter {
	
	public static void main(String[] args) {
		
		String str = "Salmaaannnll";
		
		char [] arr = str.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(char ch:arr) {
			
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		
		System.out.println(hm);
		
		int maxCount=0;
		char maxChar=' ';
		
		for(Map.Entry<Character, Integer> me:hm.entrySet()){
			if(maxCount<me.getValue()) {
				maxCount=me.getValue();
				maxChar= me.getKey();
			}
		}
		
		System.out.println("Maximum number of occourence of word is "+maxChar+"----->"+maxCount);
	}

}
