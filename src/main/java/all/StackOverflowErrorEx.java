package all;

public class StackOverflowErrorEx {


		void recur(){
		recur();
		throw new StackOverflowError();
	}
	public static void main(String[] args) {
		StackOverflowErrorEx se=new StackOverflowErrorEx();
		try{
		se.recur();
	}catch(StackOverflowError soe){
		//System.err.println("No recur method");
		//soe.printStackTrace();//Gives the Type of Exception
	 soe.getMessage();
	}

}
}