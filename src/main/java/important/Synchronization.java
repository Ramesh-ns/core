package important;

// if in static method we take synchronized block then we've to mention class name in that block
//But in non-static method we take synchronized block then we've to mention this or class name.

class Sync{
	static int x=10;
	 synchronized void s1(){
		System.out.println(" s1");
	}
	  void s2(){
		synchronized (this) {
			System.out.println(x);
			System.out.println("s2");
		}
	}
}
public class Synchronization {//extends Sync{
	
	 static void s2(){
		synchronized (Synchronization.class) {
	
			System.out.println("s3");
		}
	}
	
	public static void main(String[] args) {
		//Synchronization s=new Synchronization();
		s2();
		
	}

}
