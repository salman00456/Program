package program;

import java.util.HashMap;
import java.util.Map;

public class FindingDuplicateCharacterAndCountInString {
	
		
	public static void main(String[] args) {
		
	String str="SalmanAutomation";
	
	char[] ch = str.toLowerCase().toCharArray();
	
	HashMap<Character,Integer> map = new HashMap<>();
	
	for(char c:ch) {
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		}else {
			map.put(c, 1);
		}
	}
	
	System.out.println(map);
	
	for(char entry:map.keySet()) {
		if(map.get(entry)>1) {
			System.out.println("duplicate value is "+entry+"----"+map.get(entry));
		}
	}

	}

}
