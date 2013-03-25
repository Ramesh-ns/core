package all;

class Abcd {
	void arith(){
	try{
		int a=10;
		int b=0;
	     int c=a/b;
		System.out.println(c);
	}catch(Exception e){
		//e.printStackTrace();//Gives the Exception details like java.lang.ArithmeticException: / by zero
		System.err.println("divided by zero is not possible");
	}
	}
}
public class ExceptionHandler {


	void array() {
		int a[] ={1,5,3};
		System.out.println(a[2]);
		
			throw (new ArithmeticException());
	}
		
	public void recur(){
	
		try{
			recur();
		}catch(StackOverflowError se){
			//se.printStackTrace();
			System.err.println("Memory is full ");
		}
	}
	
	public static void main(String[] args) {

		Abcd a=new Abcd();
		a.arith();
		ExceptionHandler eh=new ExceptionHandler();
		//eh.recur();
		try {
			eh.array();
			
		} catch (ArithmeticException e) {

			System.err.println("array");
			//e.printStackTrace();
		}
		
		
	}
}



