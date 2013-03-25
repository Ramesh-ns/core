package collections;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Emp {
//Object
	int empNo;
	String empName;
	Emp(int eNo,String eName){
		empNo=eNo;
		empName=eName;
	}
	
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empName=" + empName + "]";
	}

	@Override
	public int hashCode() {
		return empNo;
	}
	 
	 @Override
	public boolean equals(Object obj) {
		Emp empObj=(Emp)obj;
		boolean b = empNo==empObj.empNo;
		/*System.out.println("Objects equal? "+b);*/
		return b;
	} 
	public static void main(String[] args) {
		Hashtable<Emp, Integer> ht=new Hashtable<Emp, Integer>();
		
		Emp e1=new Emp(1,"Sub");
		//System.out.println(e1);
		ht.put(e1, 1);
		//System.out.println(ht);
		e1=new Emp(1,"Sub");
		//System.out.println(e1);
		ht.put(e1,1);
		Emp e2=new Emp(5,"some");
		System.out.println(ht);
		ht.put(e2, 1);
		Emp e3=new Emp(6,"some");
		ht.put(e3, 45);
		
		System.out.println(ht.size());
		System.out.println(ht);
//		Emp e3=new Emp(2,"Bcd");
//		ht.put(e2, 2);
//		ht.put(e3, 3);
//		Set<Emp> hs=ht.keySet();
//		for(Emp i:hs){
//			System.out.println(ht.get(i));
//			
//		}
		
	}

}
