package all;

class Animal{
	void eat(){
		System.out.println("buck()");
	}
}
class Horse extends Animal{
	void buck(){
		System.out.println("eat()");
	}
	/*void eat(){
		System.out.println("horse buck()");
	}*/
}
public class Test {

	public static void main(String[] args) {

		Animal a=new Horse();
		//a.buck();//it gives compile time error bcoz if we want to call sub class method in this situation that method should be in base class 
		a.eat();
	}

}
