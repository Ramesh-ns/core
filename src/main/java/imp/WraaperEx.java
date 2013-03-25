package imp;

import java.util.ArrayList;
import java.util.List;

public class WraaperEx {

	public static void main(String[] args) {

		//int x=20;
		String x="10";
		//int x1=Integer.parseInt(x);
		Integer y=new Integer(30);
		//int c=x1+y;
		String c=x+y;
		//System.out.println(x+y);
		System.out.println(c);
		//Autoboxing:converting primitive value into a object of the corresponding wrapper class  
		//here we r adding int value to Integer then the compliler automatically generates appropriate object of wrapper class n adds to it.
		List<Integer> li=new ArrayList<Integer>();
		for(int i=0;i<=50;i++){
			li.add(i);
		}
		Integer a=new Integer(5);
		int b=new Integer(a);
	}

}
