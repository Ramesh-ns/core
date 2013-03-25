package all;

class Exc{
	Exc1 over(){
		System.out.println("Just checking");
		return e1(); //new Exc1();
	}
	public Exc1 e1() {
		System.out.println("bfkj");
		return null;
	}
	String s(){
		System.out.println("jvc");
		return "abc";
		
	}
	
}
class Exc1 extends Exc{
	Exc1(){
		System.out.println("constructor");
	}
	Exc1 over(){
		System.out.println("Checking another");
		return null;
	}
	
}
public class Experi {

	
	public static void main(String[] args) {

		Exc e=new Exc();
		e.over();
		e.s();
		
	}

}
