package all;

//When ever sub class extend from base class that time if we override the methods then return type also should be same other wise we get compile time error
//But if sub class not extend from base class then no need to same

class Over1{
	void o1() throws Exception{
		System.out.println("o1");
	}
	String o2(){
		System.out.println("o2");
		return null;
	}
	static Integer o3()throws ArithmeticException{
		System.out.println("o3");
		return 0;
	}
}

class Over2 extends Over1{
	void o1()throws ArithmeticException{
		System.out.println("Sub o1");
	}
	String o2(){ 
		System.out.println("Sub o2");
		return null;
	}
	static Integer o3() throws ArithmeticException{
		System.out.println("Sub o3");
		return 0;
	}
}
public class OverrideClass {

	public static void main(String[] args) {

		Over1 ov1=new Over1();
		//ov1.o1();//we've to handle or where we are calling there we've to throws the exception its in Only Checked Exception not applicable for Unchecked Exceptions
		Over1 ov2=new Over2();
		//ov2.o1();//Here also handle the exception because base class o1() method throws the Exception
		ov2.o3();
		
	}

}
