package practise.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Emp{
	//int empId;
	Integer empId;
	String empName;
	
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String toString(){
		return "Emp No= "+empId+", Emp Name= "+empName;
	}
	
}
public class ComparatorEx implements Comparator<Emp>{
	public int compare(Emp e1,Emp e2){
		//For String Type values Sorting
		//return e1.getEmpName().compareTo(e2.getEmpName());//Using getter method
	// return e1.empName.compareTo(e2.empName);//Without Using getter method 
	
		return e1.getEmpId().compareTo(e2.getEmpId()); //we can't invoke compareTo() on primitives directly but if we take wrapper classes means for int-->Integer then we can compare directly
		//For Integer Type values Sorting
		/*if(e1.getEmpId()>e2.getEmpId()){
			return 1;
		}
		if(e1.getEmpId()<e2.getEmpId()){
			return -1;
		}else{
			
			return 0;
		}*/
		
	}



	



	public static void main(String[] args) {
		List<Emp> l=new ArrayList<Emp>();
		l.add(new Emp(2,"Bbc"));
		l.add(new Emp(3,"Abc"));
		l.add(new Emp(1,"Cbc"));
		l.add(new Emp(4,"Dbc"));
		System.out.println("Emp values are: " + l);
		/*for(Emp e:l){
			System.out.println(e);
		}*/
		//Collections.sort(l,new ComparatorEx());
		Collections.sort(l,new ComparatorEx());
		System.out.println("After Sort: " +l);

	}
	}
	

