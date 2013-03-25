package all;

import java.util.HashSet;

public class Practise {


	/*void  X()  { 
	    String r = new String("abc");
	    String s = new String("abc");
	    r = r+1; //1
	    r = null; //2
	    s = s + r; //3 eligible for garbage collector
	} //4
*/	  
		   public static void main(String args[]) {
		      /*for(int i = 0; i < 2; i++) {
		         for(int j = 2; j>= 0; j--) {
		            if(i == j) break;
		            System.out.println("i=" + i + " j="+j);//o/p: i=0 j=2,i=0 j=1, i=1 j=2
		           
		         }
		      }*/
			   
			   /*String s1 = "abc";
			   String s2 = "abc";
			   System.out.println("s1 == s2 is:" + s1 == s2);*/
			   
			   /* String s3 = "JournalDev";
			   int start = 1;
			   char end = 5;
			   System.out.println(start + end);
			   System.out.println(s3.substring(start, end));*/ //o/p:6 , ourn
			   
			   /*HashSet shortSet = new HashSet();
			   for (short i = 0; i <100; i++) {
			       shortSet.add(i);
			      shortSet.remove(i - 1);
			   }
			   System.out.println(shortSet.size());*/ // o/p is 100
			   
			  /* try {		// Here wont execute the finally block whether if condition true or false
				    if (false) {
				        while (true) {
				        	System.out.println("true");
				        }
				    } else {
				        System.exit(1);
				    }
				} finally {
				    System.out.println("In Finally");
				}*/
			   
			   /*String str = null;
			   String str1="abc";
			   System.out.println(str);
			   System.out.println(str1.equals("abc") | str.equals(null));*/ // throws NullPointerException but if the condition like || (OR) then it prints the value because first condition if true then it wont go to the next condition
			   
			  /* String s="abc";
			   String s1="abc";
			   System.out.println(s==s1);//True
			   System.out.println(s==s1+"Boolean");//False
			   if(s==s1){  // This condition also gives true but when + operator comes then it returns false
				   System.out.println("test");
			   }else{
				   System.out.println("Not equal");
			   }*/
					 /*int i;
					   float  f = 2.1f;
					   double d = 2.5;
					   System.out.println((int)Math.ceil(f) + "   "+((int)Math.round(d)));//ceil prints highest like 2.1 also 3 and round prints nearest like 2.4 prints 2 and 2.5 prints 3
					   i = ((int)Math.ceil(f)) * ((int)Math.round(d));
					 
					   System.out.println(i);*/
			   
			  /* int[] x=new int[2];
			   Integer intObj=Integer.valueOf(x[x.length-1]);
			      int i = intObj.intValue();

			      if(args.length > 1) 
			         System.out.println(i);
			      if(args.length > 0)
			         System.out.println(i - 1);
			      else {
			         System.out.println(i - 2);
			   }
					*/  
			   /*int i=9;
			   i=i++;
			   System.out.println(++i);
			   i=++i;
			   System.out.println(i);*/
			   
			 /*  String helloWorld ="Hello World";
			   String hell="Hello World";
			   System.out.println( ""+ helloWorld ==hell);
			  System.out.println(helloWorld.equals(hell));*/
			   
			   
			   
		   }
}
			   
			   
		   
		

