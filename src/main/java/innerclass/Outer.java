package innerclass;

public class Outer {

	int x=20;
	public void m1(){
		final int y=10;
		System.out.println(x+" "+y);
		class Inner{
			int x=0;
			public void m2(){
				System.out.println(x);
				System.out.println(y);
			}
			Inner i=new Inner();
			//i.m2();
		}
		
	}
	public static void main(String[] args) {

		Outer o=new Outer();
		o.m1();
		//Outer.Inner i1=o.new Inner();
	}

}
