package imp;

//if in 2 interfaces have same method but different return type these 2 interfaces 
//are implemented by one class then get an ambiguity this is called Diamond Problem.
//if want recover from these we've to change method names
interface A1 {
	String abc();
}

interface B1 {
	// int abc();
	String abc();
}

public class DiamondProblemEx implements A1, B1 {

	@Override
	public String abc() {

		System.out.println("Diamond");
		return null;
	}

	
	/* public int abc(){
	  return null;
	  }*/
	 
	public static void main(String[] args) {

		DiamondProblemEx de = new DiamondProblemEx();
		de.abc();
		A1 a = new DiamondProblemEx();
		a.abc();
		B1 b = new DiamondProblemEx();
		b.abc();

	}

}
