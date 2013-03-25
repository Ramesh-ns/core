package all;

 abstract class A {
abstract void a();
}
 abstract class B extends A{
	 void b(){
		 System.out.println("bbc");
	 }
	   //abstract void a();
 }
	  public class C extends B{
		 void a(){
			 System.out.println("chgv");
		 }
		 void c()
		 {
			 System.out.println("in c");
		 }
	
	 public static void main(String[] args) {
		C c=new C();
		c.a();
		B b=new C();
		b.b();
		
	}
 }
	
