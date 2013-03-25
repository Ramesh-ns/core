package exam;

public class ClassInMain {

	 static int x=2;
	public static void main(String[] args) {
		final int y=5;
 System.out.println(y);
 System.out.println(x);
		class Abc{
			int x=3;
			
			void m1(){
				System.out.println(x +" ");
				System.out.println(y);
			}
		
		}
		Abc a=new Abc();
		a.m1();
	}

}
