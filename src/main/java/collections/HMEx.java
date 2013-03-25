package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HMEx {

	public static void main(String[] args) {

		Map m=new HashMap();
		//Map m=new TreeMap();//We get ClassCastException bcoz JVM doesn't know to compare different types
		//Hashtable m=new Hashtable();// if we give null key or null value then it'll throw null pointer exception
		m.put(1, "Mall");
		m.put("A","Ram");
		m.put(50,"Mal");
		m.put("D","Sam");
		m.put(3, "Rame");
		m.put(null, 5);
		m.put(null,null);
		System.out.println(m);
		
	}

}
