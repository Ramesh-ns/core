package exam;
class Base{
	public void start(){
		System.out.println("Base class");
	}
}
public class GxsEx extends Base{
public void start(){
	System.out.println("Derived class");
}
	
	public static void main(String[] args) {

		  ((Base)new GxsEx()).start();//O/P is: Derived class
		//((GxsEx)new Base()).start();//It throws ClassCastException
	 
	}

}
