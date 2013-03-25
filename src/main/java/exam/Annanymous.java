package exam;

 interface MyInter{
	public String toString();
}
public class Annanymous implements MyInter {

	public String toString(){
		return "My toString method()";
	}
	public static void main(String[] args) {

System.out.println(new MyInter(){
	
});
Annanymous a=new Annanymous();
//a.toString();
System.out.println(a);
	}

}
