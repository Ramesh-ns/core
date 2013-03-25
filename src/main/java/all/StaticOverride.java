package all;
class StaticEx{
	   void a(){
		System.out.println("This is a()");
	}
	public static void b(){
		System.out.println("This is b()");
	}
	public static void c(){
		System.out.println("This is static C");
	}
}
class Sta extends StaticEx{
	public static void c(){
		System.out.println("Sta c()");
	}
	public void a(){
		System.out.println("second a");
	}
}
public class StaticOverride extends StaticEx{
	   protected void a(){
		System.out.println("This is second a()");
	}
	public static void b(){
		System.out.println("This is second b()");
	}
	public static void main(String[] args) {

		StaticEx se=new StaticOverride();
		se.a();
		se.b();
		StaticEx se1=new StaticEx();
		se1.a();
		se1.b();
	  Sta s=new Sta();
		s.c();
		s.a();
		s.b();
		c();
		
		StaticOverride so=new StaticOverride();
		so.a();
		so.b();
		c();

	}

}
