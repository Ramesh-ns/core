package exam;

public class IfExample {

	public static void main(String[] args) {

		int i=3;
		int j=5;
		if(j<(i=4)& i>(j=j-=3)){
			System.out.println(i +" "+ j);
		}
		System.out.println(i +" "+ j);
		IfExample ie=new IfExample();
		ie.m();
	}
	void m(){
		int i=10;
		System.out.println(i);
	}
	

}
