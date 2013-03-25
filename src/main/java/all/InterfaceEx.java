package all;

 interface Inter{
	final int x=10;
	 void m1();
}
public class InterfaceEx implements Inter{
int y;
void m2(){
	//int x;//only we can use final keyword for local variables other than final nothing can be use
	System.out.println(y+" "+x);
}
public void m1(){
	System.out.println("ma() implemetation");
	
}
	public static void main(String[] args) {

		InterfaceEx ie=new InterfaceEx();
		ie.m2();
		Integer i=new Integer(20);
		int b=i.intValue();
		System.out.println(i+" "+b);
		//int x;
		// System.out.println(ie.z);
		
	}

}
