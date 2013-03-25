package exam;

class Apple{
	/*Apple(){
	System.out.println("Apple");
	}*/
	/*Apple(int c){
		System.out.println("Cdff");
	}*/
}
class Orange extends Apple{
	 Orange(){
		//super(6);
		System.out.println("Orange");
	}
}
public class Construct extends Orange {
	Construct(){
		System.out.println("Con");
	}
	void x(){
		System.out.println("Test");
	}

	public static void main(String[] args) {
		Construct con=new Construct(); 
		con.x();

	}

}
