package all;

import java.io.IOException;
interface ISamp { 
	String showOff();
	}

interface ISup { 
	String showOff();
	}

interface ISampSub extends ISamp,ISup { 
	
}

public class Sample {
	 static void onLoad(){
		 System.out.println("On Load of Super");
		 }
	void doShow() throws IOException{}
}

class SampleSub extends Sample {
	 void doShow() throws ArrayIndexOutOfBoundsException{};
	  public static void onLoad(){System.out.println("On Load of sub");}
}
