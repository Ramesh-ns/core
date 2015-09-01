package all;

 abstract class B1 {
	 abstract void abc();
//	void abc(){
//		System.out.println("b class");
//	}
}
 
class C1 extends B1{
	void abc(){
		System.out.println("C method for git test");
	}
}
class D extends B1{
	void abc(){
		System.out.println("D method");
	}
}

public class A1 extends B1 {
	void abc(){
		System.out.println("A1 method");
	}
void abc(B1 b){
	b.abc();
}
	public static void main(String[] args) {
		
//A1 a=new A1();
//a.abc(b);
		//B1 b=new A1();
		//b.abc(b);
		A1 a=new A1();
		//a.abc(new B1());
	}

}
