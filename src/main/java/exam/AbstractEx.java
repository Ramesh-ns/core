package exam;

interface A{
	 void a();
}
abstract class B implements A{
	/*public void a(){
		System.out.println("A");
	}*/
	void c(){
		System.out.println("C");
	}
	 abstract void b();
	
}
 public class AbstractEx extends B{
	public void a(){
		System.out.println("A1");
	}
	void b(){
		System.out.println("B");
	}

	public static final void main(String[] args) {
		//System.out.println(new AbstractEx);

		 AbstractEx ab = new AbstractEx();
		 ab.a();
		 ab.b();
		 B b1=new AbstractEx();
		 b1.a();
		// B b=new B();
		ab.c();
	}

}
