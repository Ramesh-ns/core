package all;

//Without extending Thread class if we use start() method then we get compile time error.We can create our own start() method also.
//If we extend the Thread class but if we not implement the run() then if we call start() then we won't get compile or runtime errors but we are not get any output
//*Note: If method body throw Exception or checked exceptions like throw new Exception() then method heading should be throws related Exception otherwise we get compile time error.
//But if we throw unchecked exception then no need to use throws key as in method heading
class Samp extends Thread{
	
	  String get(){
		int x=8;
		System.out.println(x);
		return null;
	}
}
public class SomeExper{
	
	 static String get() throws Exception{
		int y=0;
		System.out.println(y);
		throw (new Exception());
	}
	public static void main(String[] args){

		Samp s=new Samp();
		s.start();
		try{
			get();
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println("Test");
		}
	}

}
