package exam;

class Animal{
	
}
class Momm extends Animal{
		
}
class Dog extends Momm{
	
}
public class GxsEx2 extends Animal {

		public static void main(String[] args) {
			GxsEx2 gx=new GxsEx2();
			Animal anim;//=new Animal();
			Dog dog=new Dog();//but we not create the object then below statement gives compile time error
			anim=dog;
			Dog rover=new Dog();//fedo;
			anim=rover;
			//rover=anim;//compile time error
			//gx=rover;//compile time error
	
		Animal anim1=new Momm();//Animal anim1=(Animal)new Momm(); //also no problem
		Momm mom=new Momm();
		anim=mom;
		Dog d=(Dog)new Momm();//without type casting gives compile time error
		Dog d1=(Dog)new Animal();//also no problem
		//GxsEx2 gx1=(GxsEx2)new Dog();//if we cast like this we get compile time error like can't cast from Dog to GxsEx2
		}

}
