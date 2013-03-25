package all;

class Bob{
	String name;
	int age;
	Bob(String name,int age){
		this.name=name;
		this.age=age;
	}
	//without override toString() we get the object but if override then its prints meaning full data
	@Override
	public String toString() {
		return "Bob [name=" + name + ", age=" + age + "]";
	}
	
}
public class OverrideToString {

	public static void main(String[] args) {

		Bob b=new Bob("Bobby",1);
		System.out.println(b);
	}

}
