package all;

class StaticDemo{
	  static int a=10;
	static int b=20;
	int c=40;
	static void callMe(){
		System.out.println(a);
		
		/*StaticDemo sd=new StaticDemo();
		sd.callMe2();*/
	}
	void callMe2(){
		System.out.println(a);
		System.out.println(c);
		//callMe();
	}
}
public class StaticByName {

	public static void main(String[] args) {

		StaticDemo sd=new StaticDemo();
		//sd.callMe();
		System.out.println(sd.b);
		StaticDemo.callMe();
		System.out.println(StaticDemo.b);
		System.out.println(sd.c);
		sd.callMe2();/**/
		
	}

}
