package imp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class RemoveDuplicatesList {

	public static void removeDuplicate(List<String> list){
		
		Set<String> set=new HashSet<String>(list);
		list.clear();
		list.addAll(set);
		System.out.println(list);
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			Object obj= it.next();
			System.out.println(obj);
		}
		
		
	}
	
	public static void main(String[] args) {

		List<String> list =new ArrayList<String>();
		list.add("a");
		list.add("c");
		list.add("b");
		list.add("a");
		list.add("c");
		
		System.out.println(list);
		//removeDuplicate(list);
		
		Set<String> set=new TreeSet<String>(list);
		//System.out.println(set);
		list.clear();
		list.addAll(set);
		System.out.println(list);
		
		
	}

}
