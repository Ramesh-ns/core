package exam;

interface Interface{
	int b=5;
	int a=8;
	void a();
	
}
public class Inter implements Interface{
	int a=5;
	public void a(){
		int b=10;
		int c=10;
		System.out.println(b +" "+ c);
	}

	public static void main(String[] args) {

		Interface i=new Inter();
		System.out.println(i.b);
		System.out.println(i.a);
		i.a();
	}

}
