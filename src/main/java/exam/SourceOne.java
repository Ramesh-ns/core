package exam;

import java.util.ArrayList;
import java.util.Iterator;
  abstract class Source{
	//Third Question
   //class Source{
	 // private Source()
	/*{
		System.out.println("Source One");
	}
	void s1(){
		System.out.println("s1 method");
	}*/
	  
	  //4th Question
	  void source1(){
		  System.out.println("source1 meyhod");
	  }
	  abstract double getValue1();
	  abstract double getValue2();
}
  class Source2 extends Source{

	@Override
	double getValue1() {
		return 27.5;
	}

	@Override
	double getValue2() {
		return 4.5;
	}
	String getValue3(){
		
		System.out.println("abcx");
		// return "abc";
		return "new SourceOne()";
	}
	  
  }
public class SourceOne {
	/*{
		System.out.println("default");
	}*/
	public static void main(String[] args) {
		
		//First Question
		/*String s=new String("abcdef");
		int i=1;
		char c=3;//If we take char c='3' then we get StringIndexOutOfBoundsException
		System.out.println(s.substring(i, c));//O/p : ab
*/
		//Second Question
		/*try{
			return;
		}finally{
			System.out.println("Finally");
		}*/
		//Third Qquestion
		/*Source source=new Source();
		source.s1();//o/p:Source one & s1 method
*/		
		
		//4th question
	/*	Source2 sou=new Source2();
		sou.getValue1();//It doesn't print anything
		sou.getValue2();
		 System.out.println(sou.getValue1());//It prints 27.5
		System.out.println(sou.getValue2()); // It prints 4.5
		System.out.println(sou.getValue1()+sou.getValue2());//If methods return type is String then o/p : 27.5  4.5  27.54.5
		System.out.println(sou.getValue3());

		sou.getValue3();*/
	}

}
