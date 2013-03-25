package imp;
interface Device{
	public void doIt();
}

abstract class Phone1 extends Electronic{
	
}
abstract class Phone2 extends Electronic{
	public void doIt(int x){
		System.out.println("Phone2 method ");
	}
}
class Phone3 extends Electronic implements Device{
	public void doStuff(){
		System.out.println("Phone3 method ");
	}
}

public class Electronic implements Device {

	public void doIt(){
		System.out.println("Electronic method ");
	}
	public static void main(String[] args) {

		Electronic e=new Electronic();
		e.doIt();
	}

}
