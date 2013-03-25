package imp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListSynchronized {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("b");
		list.add("a");
		list.add("c");
		System.out.println(list);
		//Collections.synchronizedList(list);
		//Without using Collections.synchronizedList() method
		synchronized (list) {
		
			Iterator<String> itr=list.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		}
	}

}
