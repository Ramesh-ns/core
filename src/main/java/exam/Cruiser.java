package exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


 
/*public class Cruiser implements Runnable {
   public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new Cruiser());
        a.start();
        
        System.out.print("Begin ");
        a.join();
        System.out.print("End ");
    }
    
    public void run() {
        System.out.print("Run ");
    }
    }*/ 
	/*
	public class Cruiser { 
	    private static void doStuff(String str) {
	        int var = 4;
	        if (var == str.length()) {
	            System.out.print(str.charAt(--var) + " ");//It throws Exception but if we take pre increment then we get result d,e,h
	        }
	        else {
	            System.out.print(str.charAt(0) + " ");
	        }
	    }
	    public static void main(String args[]) {
	        doStuff("abcd");
	        doStuff("efg");
	        doStuff("hi");
	    }
	}*/
/*public class Cruiser {
public static void main(String args[]) {
    try {
        String arr[] = new String[10];
      //arr = null;//It gives NullPointerException
        arr[0] = "one";
        arr[9]="i";
        System.out.print(arr[2]);
    } catch(NullPointerException nex) { 
        System.out.print("null pointer exception"); 
    } catch(Exception ex) {
        System.out.print("exception");
    }
}
}*/

/*public class Cruiser<X extends Object> {
    
    private X x;
    
    public Cruiser(X x) {
        this.x = x;
    }
    
    private double getDouble() {
        return ((Double) x).doubleValue();
    }
    
    public static void main(String[] args) {
    	Cruiser<Integer> a = new Cruiser<Integer>(new Integer(1));
        System.out.print(a.getDouble());//java.lang.Integer cannot be cast to java.lang.Double
    }
}*/


  /*public class Cruiser {
    
    private String str;
    
    public Cruiser(String str) {
        this.str = str;
    }
    
    @Override
    public String toString() {
        return this.str;
    }
        
    public static void main(String args[]) {
    	//Cruiser h1 = new Cruiser("2");        
        String s1 = new String("2");        
        String h1 = new String("1");  
        //Object arr[] = new Object[2];
        String arr[]=new String[2];
        arr[0] = h1;
        arr[1] = s1;
        //arr[1]=h1;
        Arrays.sort(arr);
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }
}
*/
/*public class Cruiser {
    private int a = 0;
    
    public void foo() {
        Runnable r = new LittleCruiser();
        new Thread(r).start();
        new Thread(r).start();
    }
    
    public static void main(String arg[]) {
        Cruiser c = new Cruiser();
        c.foo();
    }
    
    public class LittleCruiser implements Runnable {
        public void run() {
            int current = 0;
            for (int i = 0; i < 4; i++) {
                current = a;
                System.out.print(current + ", ");//o/p: 0, 0, 2, 2, 4, 4, 6, 6, 
                a = current + 2;
            }
        }
    }
}*/

/*public class Cruiser {
    public static void main(String args[]) {
        Queue<String> q = new PriorityQueue<String>();
        q.add("a");
        q.add("4");
        q.add("b");
        q.add("3");
        q.add("8");
       // q.add("1");
        //System.out.println(q);
        System.out.print(q.poll() + " "); //Retrieve the least value and remove the value and return null if queue is empty
        System.out.print(q.peek() + " ");//Retrieve the least value but doesn't remove and return null if queue is empty
        System.out.print(q.peek()+" ");  
        System.out.println(q);
         System.out.print(q.peek());
    }
}
*/

/*class Vehicle {
    public void printSound() {
        System.out.print("vehicle");
    }
}

class Car extends Vehicle {
    public void printSound() {
        System.out.print("car");
    }
}

class Bike extends Vehicle {
    public void printSound() {
        System.out.print("bike");
    }
}

public class Cruiser {
    public static void main(String[] args) {
        Vehicle v = new Car();
        Car c = (Car) v;
        
        v.printSound();
        c.printSound();
        
        //Vehicle v1=new Vehicle();//We get ClassCastException
        Vehicle v1=new Bike();//Here we don't get problem
        Bike b=(Bike)v1;
        b.printSound();
    }   
}*/

/*public class Cruiser {
     static int x[]=new int[5];
   // static int y=0;
    static {
    	x[0] = 1;
    	//int x=0;
    	//System.out.println(y);
    	System.out.println(x[0]);
        //System.out.println("test");
    }
    
    public static void main(String args[]) {        
    } 
}  
*/
/* public class Cruiser {
	int[] x;//gives NullPointerException
	//int[] x=new int[5];
	 void x(){
	x[0]=1;
	System.out.println(x);
	}
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("BbB1");
        list.add("bBb2");
        list.add("bbB3");
        list.add("BBb4");
        Collections.sort(list);
        for (String str : list) {
            System.out.print(str + ":");
    	Cruiser c=new Cruiser();
    	c.x();
    	
         }
    }
}*/ 

/*public class Cruiser {
    public static void main(String args[]) {
       LinkedList<String> list = new LinkedList<String>();
        list.add("BbB1");
        list.add("Ba");
        list.add("BA");
        list.add("bBb2");
        list.add("bbB3");
        list.add("abc");
        list.add("BBb4");
        Collections.sort(list);
        for (String str : list) {
            System.out.print(str + ":");
    
    	
        }
    }
}*/

/*public class Cruiser {
    public static void main(String args[]) {
        List list = new LinkedList<String>();
        list.add("one");
        list.add("two");
        list.add(4);
        list.add("three");
        Collections.reverse(list);
       // Iterator iter = list.iterator();
        
        for (Object o : iter) {
            System.out.print(o + " ");
        }//if we use this then we get compile time error because of for each iterate over collection or array variable
        
        for (Object o : list) {
            System.out.print(o + " ");
        }
    }
}*/

/*class Hotel1 {
    public int bookings;
    public void book() {
        bookings++;
    }
}

public class Cruiser extends Hotel1 {
    public void book() {
        bookings--;
    }
    
    public void book(int size) {
        book();
        super.book();
        bookings += size;
    }
    
    public static void main(String args[]) {
    	Cruiser hotel = new Cruiser();
        hotel.book(2);
        System.out.print(hotel.bookings);
    }
}*/

/*public class Cruiser {
    
    public static void book(short a) {
        System.out.print("short ");
    }
    
    public static void book(Short a) {
        System.out.print("SHORT ");
    }
    
    public static void book(Long a) {
        System.out.print("LONG ");
    }
    
    public static void main(String[] args) {
        short shortRoom = 1;
        int intRoom = 2;
        
        book(shortRoom);
        //book(intRoom);//compilation fails//short can minglup with int
    }
}*/