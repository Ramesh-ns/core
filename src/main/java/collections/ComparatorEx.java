package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Empl {
	Integer no;
	String name;
	
	public Empl(int no, String name) {

		this.no=no;

		this.name=name;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Emp [no=" + no + ", name=" + name + "]";
	}

}
class EmpNoComparator implements Comparator<Empl>
{

	@Override
	public int compare(Empl o1, Empl o2) {
		// TODO Auto-generated method stub
		if(o2.getNo()<o1.getNo())
			return -1;
		if(o2.getNo()>o1.getNo())
			return 1;
		else 
			return 0;
	}
	
}
public class ComparatorEx {

	public static void main(String[] args) {

		
		
		List<Empl> l=new ArrayList<Empl>();
		
		l.add(new Empl(2,"mar"));
		l.add(new Empl(1, "subbu"));
		
		/*for(Emp e:l){
			//Collections.sort(l,e);
			System.out.println(l);
		}
		//l.compare();
*/
		
		Collections.sort(l,new EmpNoComparator());
		System.out.println(l);
/*l.add("G");
l.add("B");
l.add("C");
Collections.sort(l);
System.out.println(l);*/
	}

}
