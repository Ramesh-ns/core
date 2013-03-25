package exam;

public class ExceptionHand {

	 void  exceptionCatch() throws Exception {
		//throw (new Exception());//throw statement should be use as a last statement
		System.out.println("E");
		throw ( new Exception());
	}
	public static void main(String[] args) throws Exception{

		try{
			ExceptionHand eh=new ExceptionHand();
			eh.exceptionCatch();
			//throw e ;
			System.out.println("A");
			//System.exit(0);
		}catch(Exception e){
			System.out.println("B");
			//System.exit(0);
		}
		//System.out.println("E");//this stmt we can write without using finally block but we don't write the stmts b/w try and catch & catch and finally
		finally{
			System.out.println("C");
		}
		System.out.println("D");
	}

}
