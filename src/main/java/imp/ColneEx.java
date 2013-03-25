package imp;

public class ColneEx implements Cloneable{

	// Using clone() method we can create the copy of the Object.When we are
	// using this method it throws CloneNotSupportedException.Its a checked
	// exception so we've to handle or throws this exception and when we using
	// this we've to implement our class with Cloneable interface otherwise its
	// throws CloneNotSupportedException.
	public static void main(String[] args) throws CloneNotSupportedException {

		ColneEx ce = new ColneEx();
		ce.clone();

	}

}
