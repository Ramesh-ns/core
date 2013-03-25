package files;

import java.io.File;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) throws IOException {

		boolean newFile=false;
		File file=new File("fileWriter.txt");
		System.out.println(file.exists());
		newFile=file.createNewFile();
		System.out.println(newFile);
		System.out.println(file.exists());
	}

}
