package imp;

import java.util.LinkedList;
import java.util.List;


	/*public class ScjpExam<X extends Number> {
	    
	    private X x;
	    
	    public ScjpExam(X x) {
	        this.x = x;
	    }
	    
	    private double getDouble() {
	        return x.doubleValue();
	    }
	    
	    public static void main(String args[]) {
	    	ScjpExam<Integer> a = new ScjpExam<Integer>(new Integer(1));
	        System.out.print(a.getDouble());
	    }
	}
*///O/p: 1.0


/*
class Empty {   
}

class Extended extends Empty {  
}

public class ScjpExam {    
        public static void doStuff1(List<Empty> list) {
                // some code
        }
        public static void doStuff2(List list) {        
                // some code
        }
        public static void doStuff3(List<? extends Empty> list) {
                // some code            
        }
        
        public static void main(String args[]) {
                List<Empty> list1 = new LinkedList<Empty>();
                List<Extended> list2 = new LinkedList<Extended>();
                
                // more code here
                
                doStuff1(list1);
                 doStuff2(list2);
                 doStuff2(list1);
                 doStuff3(list1);
                 doStuff3(list2);
                // doStuff1(list2);

        }
}
*/

public class ScjpExam<X extends Object> {
    
    private X x;
    
    public ScjpExam(X x) {
        this.x = x;
    }
    
    public double getDouble() {
        //return  x.doubleValue();//compile time error we've to cast
    	return ((Integer) x).doubleValue();// if we write like this then we get 1.0 result
    }
    
    public static void main(String args[]) {
    	ScjpExam<Integer> a = new ScjpExam<Integer>(new Integer(1));
        System.out.print(a.getDouble());
    }
}