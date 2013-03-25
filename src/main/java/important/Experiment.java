package important;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//* A class can't be declared as a private (or) protected . Only these access specifiers are used to declare methods only
//* default is a keyword but not associated with access specifiers its associated with switch statement
 abstract class Exp{
	 static int x;
	protected Exp(){
		//static int y=0;
	 }
	  void e()throws Exception,IOException{
	 //static int x=0;
		FileInputStream fis=new FileInputStream("data.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ois.readObject();
		
	}
}
public class Experiment {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) {

		
	}

}
