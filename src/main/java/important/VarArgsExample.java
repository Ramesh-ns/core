package important;

//* Difference b/w Array and var-args: The main difference is way of calling the method.We call these two in different ways
public class VarArgsExample {

	/*public static void test(int x,String...args){
		System.out.println("\n"+ x);
		for(String arg:args){
			System.out.println(arg);
		}
	}*/ 
	
	public static void test1(String...args1){
		for(String s:args1){
			System.out.println(s);
		}
	}
	public static void test2(String[] args2){
		for(String s1:args2){
			System.out.println(s1);
		}
	}
	public static void main(String[] args) {

		/*test(1,"India");
		test(24,"Hyd","Ban");
		test(34,"chennai","Mumbai","Delhi");
		test(1);*/
		test1();
		test1("2");
		
		//test2();// If we give no args to call the methods then we get compile time error
		test2(new String[]{"A","B"});//we've to call like this way
	}

}
