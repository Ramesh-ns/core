package innerclass;

  class Test {
	void m1(){
		System.out.println("m1");
	}
	static class inner{
		 void m2(){
			System.out.println("m2");
			}
		/*public static void main(String args[]){
			System.out.println("static inner");
		}*/
		 
	}
}
  public class StaticInner{
	public static void main(String[] args) {

		/*StaticInner o=new StaticInner();
		o.m1();*/
		
		//m2();
		
		/*inner i=new inner();
		i.m2();*/
	
		Test t=new Test();
		t.m1();
		
		Test.inner i1=new Test.inner();
		i1.m2();
		//Test.inner i2=new Test().new inner();//its for non static normal inner class
	}

	}
