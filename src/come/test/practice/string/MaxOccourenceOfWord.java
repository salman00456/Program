package come.test.practice.string;

import java.util.HashMap;
import java.util.Map;

public class MaxOccourenceOfWord {
	
	public static void main(String[] args) {
		
		String str = "Java is Java and best language is Java";
		
		String [] arr = str.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		
		for(String sr:arr) {
			if(hm.containsKey(sr)) {
				hm.put(sr, hm.get(sr)+1);
			}
			else {
				hm.put(sr, 1);
			}
		}
		
		System.out.println(hm);
		
		int maxCount=0;
		String maxWord="";
		
		for(Map.Entry<String, Integer> me:hm.entrySet()) {
			if(maxCount<me.getValue()) {
				maxCount=me.getValue();
				maxWord=me.getKey();
			}
			
			
		}
		System.out.println("Maximum occourence of word is "+maxWord+"-----"+maxCount);
	}

}
