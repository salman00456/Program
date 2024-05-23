 package program;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;




public class HashMapItration {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(6, "F");
		
		//System.out.println(map);
		//Iterating the HashMap by using KeySet Iterator
		System.out.println(map.keySet());
		
		System.out.println(map.entrySet());
		
		System.out.println(map.values());
		
		Collection<String> obj = map.values();
		System.out.println(obj);
		
		//Iterating the HashMap by using EnrtySet 
		Iterator<Entry<Integer, String>> iterator  =  map.entrySet().iterator();
		
		while(iterator.hasNext()) {
		
			Entry<Integer, String> entry = iterator.next();
		 System.out.print(	entry.getKey());
			System.out.print( entry.getValue());
		}
	}

}
