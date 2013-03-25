package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDuplicatesKeys extends HashMap<String,List<Integer>>{

	public void put(String key,Integer value){
		List<Integer> current=get(key);
		if(current==null){
			current=new ArrayList<Integer>();
			super.put(key,current);
		}
		current.add(value);
	}
	public static void main(String[] args) {

		MapDuplicatesKeys m=new MapDuplicatesKeys();
		 m.put("a", 1);
	        m.put("a", 2);
	        m.put("b", 3);
	        for(Map.Entry e : m.entrySet()) {
	            System.out.println(e.getKey() + " -> " + e.getValue());
	        }
		
	}

}
