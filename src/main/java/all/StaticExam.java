package all;

class S1{
	int s1=10;
	static void m1(){
		int s2=20;
		S1 s=new S1();
		System.out.println(s.s1+" "+s2);
		//s.m2();
	}
	void m2(){
		int s3=30;
		//S1 s=new S1();
		System.out.println(s1+" "+s3);
		m1();
	}
}
public class StaticExam {

	public static void main(String[] args) {
		S1 s=new S1();
		//s.m1();
		s.m2();
	}

}
