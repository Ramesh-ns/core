package all;

class Base{
	  Base(){// If we take private then it'll give compile time error
		System.out.println("Base");
	}
}
class Sub extends Base{
	int x;
	int y;
	Sub(int x,int y){
		this.x=x;
		this.y=y;
		System.out.println(x+" "+y);
	}
	
	
}
public class ConTest {

	
	public static void main(String[] args) {
		Sub s=new Sub(1,4);
		Object obj = new Object();
		
	}

}
