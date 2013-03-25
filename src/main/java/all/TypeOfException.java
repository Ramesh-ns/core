package all;

public class TypeOfException {
 
	public static void main(String[] args) {

		try{
    		int x=0,y=1;
    		int c=y/x;
    		System.out.println(c);
    	}catch (Exception e) {
    		//e.getMessage();
    		 e.printStackTrace();//Gives Type of exception print like java.lang.ArithmeticException: / by zero
    		
    	}
	}

}
