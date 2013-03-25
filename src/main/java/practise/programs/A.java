package practise.programs;

/*abstract class B extends A{
	abstract static void b(){
		abstract and static we can't use at a time for a method
	}
}*/
  public  class A {

	
	 final  static void a() {//final and static we can use
		System.out.println("class A method");
	}
	public static void main(String[] args) {

		A a=new A();
		a.a();
	}

}
