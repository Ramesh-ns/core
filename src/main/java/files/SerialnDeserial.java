package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialnDeserial implements Serializable{

	int id;
	String name;
	SerialnDeserial(int a,String b){
		id=a;
		name=b;
	}
	@Override
	public String toString() {
		return "SerialnDeserial [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		SerialnDeserial sd=new SerialnDeserial(1, "abc");
		sd=new SerialnDeserial(2, "bbc");
		
		//Serialization process
		FileOutputStream fos=new FileOutputStream("data.ser");//We've to declare IOException
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(sd);
		//System.out.println(sd);
		oos.close();
		//Deserialazation proces
		FileInputStream fis=new FileInputStream("data.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		sd=(SerialnDeserial) ois.readObject();//we've to declare ClassNotFoundException
		System.out.println(sd);
		ois.close();
	}

}
