package innerclass;

public class Regular {
	void outer(){
	System.out.println("outer");
 class Inner{
	 void inner(){
		 System.out.println("inner");
	 }
	//Inner i=new Inner();
	 //i.inner();
 }
//Inner i=new Inner();
	// i.inner();
 }
	public static void main(String[] args) {

		System.out.println("main()");
		Regular r=new Regular();
		//Inner i=new Inner();-->compile time error
		//Regular.Inner i=r.new Inner();
		//i.inner();
		r.outer();
		//r.inner();
		
	}

}
