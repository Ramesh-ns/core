package exam;

import java.util.LinkedList;

public class Subex {

	public static void main(String[] args) {

		LinkedList<String> list=new LinkedList<String>();
		list.add("abc");
		list.add("bbc");
		list.add("cbc");
		list.add("dbc");
		list.add("ebc");
		//list.add("fbc");
		int x=list.size()/2;
		if(list.size()%2==0){
		System.out.println(list.get(x));
		System.out.println(list.get(x-1));
	}else{
		System.out.println(list.get(x));
	}

}
}
