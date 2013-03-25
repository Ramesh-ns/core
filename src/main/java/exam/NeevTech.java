package exam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NeevTech {
	int id;
	String name;
	@Override
	public String toString() {
		return "NeevTech [id=" + id + ", name=" + name + "]";
	}

	public NeevTech(int id,String name){
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {

	List<NeevTech> list=new ArrayList<NeevTech>();
	list.add(new NeevTech(1,"Abc"));
	list.add(new NeevTech(2,"Bbc"));
	updateList(list);
	}
	public static void updateList(List l){
		ArrayList al=new ArrayList();
		al.add(new Date());
		al.addAll(l);
		System.out.println(al.size());
		System.out.println(al);
	}

}
