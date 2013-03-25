package imp;


abstract class A{
	  abstract void callme();
	void callmetoo(){
		System.out.println("call me too");
	}
}

class B extends A{
	final void callme(){
		System.out.println("call me");
	}
}
class C extends B{
	void ca(){
		System.out.println("ca");
	}
}

 class Abstract{
public static void main(String args[]){
	B b = new B();
	b.callme();
	b.callmetoo();
	C c=new C();
	c.ca();
}
}





 