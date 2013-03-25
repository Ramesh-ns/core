package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx implements Comparable<ComparableEx> {

	String name;
	int age;
	String gender;
	ComparableEx(String n,int a,String g){
		name=n;
		age=a;
		gender=g;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender(){
		return gender;
	}
	public int compareTo(ComparableEx ce){
		return name.compareTo(ce.name);
	}
	@Override
	public String toString() {
		return "ComparableEx [name=" + name + ", age=" + age + ", gender="
				+ gender + "]";
	}
	
	public static void main(String[] args) {

		ArrayList<ComparableEx> list=new ArrayList<ComparableEx>();
		ComparableEx ce=new ComparableEx("Third",3,"m");
		ComparableEx ce1=new ComparableEx("Second",2,"m");
		ComparableEx ce2=new ComparableEx("First",1,"f");
		list.add(ce);
		list.add(ce1);
		list.add(ce2);
		
//		list.add(new ComparableEx("Third",3,"m"));
//		list.add(new ComparableEx("Second",2,"f"));
//		list.add(new ComparableEx("First",1,"m"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
