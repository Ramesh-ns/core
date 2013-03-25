package all;

public class StaticBlock {
	void m1(){
		System.out.println("Iam from m1");
		 m2();
	}
	static{
		System.out.println("iam from static");
	}
	static{
		System.out.println("iam from second static");
	}
	static void m2(){
		System.out.println("iam from m2");
		//m1();//compile time error
	}

	public static void main(String[] args) {
StaticBlock st=new StaticBlock();
st.m1();
m2();
		
	}

}
