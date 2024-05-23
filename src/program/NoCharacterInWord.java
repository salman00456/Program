package program;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class NoCharacterInWord {
	
	public static void main(String[] args) {
		
		String str ="My name is Salman";
		
		String[] str1 =str.split(" ");
		
		LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
		
		for(String word:str1) {
			map.put(word, word.length());
		}
		
		System.out.println(map);
	}

}
