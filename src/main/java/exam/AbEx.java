package exam;
interface I1{
	 public void i1();
}
abstract class Abc {
	 abstract void m2();
	  void i1(){
		 System.out.println("i11");
	 }
	  void m1(){
		System.out.println("m1()");
	}//public>=protected>=default>=private
}
class Bbc extends Abc implements I1{
	 public void i1(){
		System.out.println("i1()");
	}
	public void m2(){
		System.out.println("m2()");
	}
	    void m1(){
		System.out.println("m11()");
	}
	    void m3(){
	    	System.out.println("m3 child");
	    }
}
public class AbEx {

	public static void main(String[] args) {

		Bbc b=new Bbc();
		b.m1();
		 b.i1();
		b.m2();
		Abc a=new Bbc();
		a.m1();
		a.m2();
		a.i1();
		//a.m3();// gets a compile time error we've to call only which ever methods overridden from Abc abstract class.
		I1 i=new Bbc();
		 i.i1();
		//Abc a1=new Abc();//we can't create the direct object for abstract class.
	}

}
