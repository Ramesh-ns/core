package all;

import java.util.ArrayList;
import java.util.List;


public class Generics {

	public static void main(String[] args) {

		ArrayList<String> l=new ArrayList<String>();
		//ArrayList l=new ArrayList();
		l.add("Abc");
		l.add("Bbc");
		//l.add(3);
		/*System.out.println(l);
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		java.util.Iterator it= l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		//String s=l.get(0);
		/*Integer x=l.get(1);
		System.out.println(x);*/
		/*Object s1=l.get(1);
		//System.out.println(s +" , " +s1);
		
		// Using generics need not to cast it
		//String s=l.get(0);
		//System.out.println(s);
		List list=new ArrayList();
		list.add("gen");
		list.add(3);
		System.out.println(list);
		System.out.println(l.get(0));
		String s1=(String) list.get(0);
		System.out.println(s1);
		String s3=(String) list.get(1);//we get java.lang.ClassCastException
		System.out.println(s3);
		int x=(Integer) list.get(1);
		System.out.println(x);*/
	}

}
