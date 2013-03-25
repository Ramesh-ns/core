package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class MyHashtablRead {

	public static void main(String[] args) {

		Hashtable<String, String> ht=new Hashtable<String, String>();
		ht.put("first","First inserted");
		ht.put("second","Second inserted");
		ht.put("4","Fourth inserted");
		ht.put("third","Third inserted");
		
		System.out.println(ht);
		Set<String> keys=ht.keySet();
		for(String key:keys){
			System.out.println("Value of key " + key + " is: " + ht.get(key));
		}
		/*Iterator<String> it=(Iterator) ht.keySet();//we get java.lang.ClassCastException
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
	}

}
