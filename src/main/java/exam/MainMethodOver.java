package exam;

public class MainMethodOver {
public static void main(String[] args){
	System.out.println(20);
	
	Abc23 ac=new Abc23();
	//ac.main(args);//we get an exception like exam.MainMethodOver.main(MainMethodOver.java:8)
} }
class Abc23 extends MainMethodOver{
	public static void main(int[] args) {
System.out.println(10);
/*MainMethodOver m=new MainMethodOver();
m.main(null);*/
	}
	
}

