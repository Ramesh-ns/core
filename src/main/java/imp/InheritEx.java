package imp;

interface I1{
	void i1();
}

abstract class I2 {
	/* public void i1(){
		System.out.println("i1 child");
	}*/
	void m1(){
		System.out.println("m1");
	}
}
class I3 extends I2 implements I1{
	void i3(){
		System.out.println("i3 child");
	}
	public void i1(){
		System.out.println("i1 child");
}
}
public class InheritEx {

	public static void main(String[] args) {

		I2 i=new I3();
		//i.i1();
		//i.i3();
		i.m1();
		
	}

}
