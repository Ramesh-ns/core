package exam;

class Prot{
	protected int a=10;
	protected int b=20;
	
}
public class ProtectAccess extends Prot {
	int b=25;
	int a=20;
	
 void ab(){
	 System.out.println(a);
	 System.out.println(b +" "+super.b);
 }
	public static void main(String[] args) {
		
		ProtectAccess pa=new ProtectAccess();
		pa.ab();
	}

}
