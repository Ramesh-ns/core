package files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer1 {

	public static void main(String[] args) throws IOException {

		char[] in=new char[15];
		int size=0;
		File file=new File("fileWriter1.txt");
		System.out.println(file.exists());
		FileWriter fw=new FileWriter(file);
		System.out.println(file.exists());
		fw.write("how r u");
		fw.flush();
		fw.close();
		FileReader fr=new FileReader(file);
		size=fr.read(in);
		System.out.println(size +" ");
		for(char c:in){
			System.out.println(c);
			fr.close();
		}
			
		
	}

}
