package important;

class A{
	 void m1(){
		System.out.println("A method");
	}
}
class B extends A{
	void m1(){
		System.out.println("B method");
		//super.m1();
	}
}
public class SuperEx {

	public static void main(String[] args) {

		A a=new B();
		//a.super.m1();//Its not possible to call directly super class method in this situation
		a.m1();
	}

}
