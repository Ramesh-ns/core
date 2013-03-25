package all;
class Ac{
	int a=10;
	int b=2;
	
	int abcCall(){
		//System.out.println("abc");
		int c =a+b;
		System.out.println("Sum ="+c);
		return a+b;
	}
}
public class Basic {	
	public static void main(String[] args) {
System.out.println("Hello Java world");
Ac a=new Ac();
a.abcCall();
	}

}
