package imp;

public class ExceptionHandEx {
 
	public static void main(String[] args) {

		try{
			int x=1;
			int y=4;
			int c=x/y;
			System.out.println(x);
		}catch(Exception e){
			System.out.println("Please enter correct value");
		}
		finally{
			System.out.println("Test for finally");
			//System.exit(0);
		}
		System.out.println("Testing");
		
	}

}
