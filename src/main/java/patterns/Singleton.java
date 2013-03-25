package patterns;

// 1st way

/*public class Singleton {

	private static Singleton instance=new Singleton();
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		return instance;
	}
	public static void main(String[] args) {
		
	}
}//it'll work in both single & multi threaded environment.simplest & trusted way as we are leaving the instantiation to the JVM

*/
//2nd way

/*
public class Singleton{
	private static Singleton instance;
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		
	}
}*///It'll not be sufficient for multi threaded environment

//3rd way

/*public class Singleton {
 private static Singleton instance;
private static int counter;
 private Singleton() {
counter=0;
 }

 public static synchronized Singleton getInstance() {
 if (instance == null) {
	 System.out.println("abc");
 instance = new Singleton();

 }
 return instance;
 }
 public static synchronized int getNext(){
	 return ++counter;
 }

 public static void main(String[] args) {

	 Singleton s1,s2;

	 s1= getInstance();
	 s2=Singleton.getInstance();
	 
	 
 }//It'll work in single multi threaded environment but it'll be unneccessarily overhead once after instance is created for the first time because every time we call getInstance() method.We need to acquire lock and release the lock which is overhead after instance is available
 }*/

//4h way

/*public class Singleton{
	private static Singleton instance;
	private Singleton(){
		
	}
	public Singleton getInstance(){
		synchronized (this) {
			if(instance==null){
				instance=new Singleton();
			}
		}
		
		return instance;
	}
}*///It'll not suffice in multi threaded environment

//5th way

/*public class Singleton{
	private static Singleton instance;
	private Singleton(){
		
	}
	public  Singleton getInstance(){
		if(instance==null){
			synchronized (this) {
				instance=new Singleton();
			}
		}
		return instance;
	}
}*///it'll work in multithreaded environment.it'll not work in prior versions of jdk 1.5,double checking is very pathetic way of implementing singleton pattern & best practise doesn't suggest to go for this. 

public class Singleton{
	private static final Singleton instance=new Singleton();
	private Singleton() {

		if(instance!=null){
			throw new IllegalStateException("Already instantiated");
		}
		}
		public static Singleton getInstance(){
			return instance;
		}
		public static void main(String[] args) {
			Singleton s=new Singleton();
			//s.getInstance();
		}
	
}