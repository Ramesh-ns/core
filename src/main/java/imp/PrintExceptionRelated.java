package imp;

public class PrintExceptionRelated {

	
	public static void main(String[] args) {

		int x=1;
		int y=0;
		try{
			int z=x/y;
		}catch(Exception e){
			//System.out.println(e);//Gives the Exception class(java.lang.ArithmeticException) and also the Exception message(/ by zero)
			//e.getMessage();//Nothing print
			//System.out.println(e.getMessage());//prints exception message(/ by zero) only indicating the cause of exception
			e.printStackTrace();//Gives the Exception class(java.lang.ArithmeticException) and also the Exception message(/ by zero) and also line no where the problem arises
		}
	}

}
