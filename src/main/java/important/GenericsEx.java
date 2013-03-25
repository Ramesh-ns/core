package important;

import java.util.ArrayList;

 abstract class GenericsEx {

	public static void main(String[] args) {
		//Without using Generics
		/*ArrayList al=new ArrayList();
		al.add("abc");
		al.add("bbc");
		al.add(24);
		//String s=(String) al.get(0);
		//int i=(Integer) al.get(1);//If we use like this then we get java.lang.ClassCastException
		int i=(Integer) al.get(3);//if we write like int i=(int)al.get(3); then we gwt compile time error like can't cast to object to a int
		System.out.println(i);
		System.out.println(al.get(1));*/
		//Using Generics
		ArrayList<String> al=new ArrayList<String>();
		al.add("BBC");
		String s=al.get(0);
		System.out.println(s);
		
	}

}
