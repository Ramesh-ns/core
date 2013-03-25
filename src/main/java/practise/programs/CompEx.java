package practise.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompEx implements Comparable<CompEx> {
	int no;
	String name;

	public CompEx(int x, String y) {
		no = x;
		name = y;
	}

	/*public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}*/
	public int compareTo(CompEx c){
		return name.compareTo(c.name);
	}

	@Override
	public String toString() {
		//return "CompEx [no=" + no + ", name=" + name + "]";
	 return "no="+no+", name="+name;
	}

	public static void main(String[] args) {

		List<CompEx> l = new ArrayList<CompEx>();
		l.add(new CompEx(3, "Cba"));
		l.add(new CompEx(2, "Aba"));
		l.add(new CompEx(1, "Bba"));
		System.out.println("Before Sort :" +l);
		Collections.sort(l);
		System.out.println("After Sort :" +l);
		
		/*ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(43);
		al.add(12);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);*/

	}

}
