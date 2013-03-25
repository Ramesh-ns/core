package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExtraMethods {

	 
	public static void main(String[] args) {

		/*List l=new ArrayList();
		l.add("3");
		l.add(2);
		l.add(65);
		System.out.println(l); */
		//If we add the different types means String & int like in TreeSet then v'll get ClassCastException because the compiler has no way of knowing which type is appropriate for this TreeSet 
		//But its possible in other Set like HashSet
		//Set s=new TreeSet();
		/*Set s=new HashSet();
		s.add(4);
		s.add("34");
		s.add(4);
		System.out.println(s);*/
		/*Iterator it=s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		//Different methods in Collection
		
		TreeSet<String> t=new TreeSet<String>();
		TreeSet<String> t1=new TreeSet<String>();
		t.add("b");
		t.add("a");
		t.add("e");
		t.add("h");
		t.add("i");
		System.out.println(t);
		t1=(TreeSet<String>) t.subSet("e",true, "i",true);
		System.out.println(t+" "+t1);
		System.out.println(t.pollFirst());//pollFirst get that value and remove from the TreeSet
		System.out.println(t.pollFirst());
		t.add("g");
		System.out.println(t.size()+" "+t1.size());
		System.out.println(t+" "+t1);
		//t.remove(1);
		//System.out.println(t);
		
	}

}
