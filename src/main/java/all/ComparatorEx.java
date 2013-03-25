package all;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Emp{
	String empName;
	int empNo;
	Emp(String name,int no){
		empName=name;
		empNo=no;
	}
//	public String getEmpName(){
//		return empName;
//	}
	public int getEmpNo(){
		return empNo;
	}
	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", empNo=" + empNo + "]";
	}
}
public class ComparatorEx implements Comparator<Emp> {
	public int compare(Emp e1,Emp e2){
		/*if(e1.getEmpNo()>e2.getEmpNo()){
			return -1;
		}if(e1.getEmpNo()<e2.getEmpNo()){
			return 1;
		}else{
			return 0;
		}*/
		return e1.empName.compareTo(e2.empName);
		//return e1.empNo.compareTo(e2.empNo);//If we take Integer then it can possible directly but if we use primitives we can't do directly
	}

	public static void main(String[] args) {

		
		List<Emp> list=new ArrayList<Emp>();
		list.add(new Emp("Bbc",1));
		list.add(new Emp("Abc",2));
		list.add(new Emp("Cbc",3));
		System.out.println(list);
		Collections.sort(list,new ComparatorEx());
		System.out.println(list);
	}

}
