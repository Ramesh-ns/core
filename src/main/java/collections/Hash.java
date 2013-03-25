package collections;

import java.util.HashMap;
import java.util.Hashtable;

public class Hash {

	public static void main(String[] args) {

		//Hashtable h=new Hashtable();//retrieve the data in random order
		HashMap h=new HashMap();
		h.put(3,"Abc");
		h.put(12,"Bbc");
		h.put("a","Ebc");
		h.put(50,"Cbc");
		h.put("3","Dbc");
		h.put("A",null);
		h.put("A", 123);
		h.put(3, "cbd");
		System.out.println(h);
		System.out.println(h.size());
		
	}

}
