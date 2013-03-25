package all;

public class BlocksExper {
	BlocksExper(){
		System.out.println("Test5");
	}
	BlocksExper(int x){
				System.out.println("Test4");
			}
		    static {
		    	System.out.println("Test1");
		    }
		    static {
		    	System.out.println("Test2");
		    }
		    {
		    	System.out.println("Test3");
		    }
		    public static void main(String args[]) {
		    	BlocksExper w=new BlocksExper(5);
		    	BlocksExper w1=new BlocksExper();

}
}