package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IterateOverMap {


	public static void main(String[] args) {

		Map<String,Integer> m=new HashMap<String, Integer>();	
		m.put("a", 2);
		m.put("b", 3);
		m.put("c", 4);
		m.put("d", 5);
		
		//System.out.println(m.get(1));//o/p : null
		//For only keys
		/*for(String s:m.keySet()){
			System.out.println(s);
		}*/
		//For only values
		/*for(Integer values:m.values()){
			System.out.println(values);
		}*/
		
		//for keys and values
		/*for(Map.Entry<String,Integer> entry:m.entrySet()){
			System.out.println(entry);
		}*/
		//Set<String> s=m.keySet();//for only keys
		Set s=m.entrySet();//For keys and values*/
		Iterator it=s.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}

}
