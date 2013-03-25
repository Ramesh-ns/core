package imp;

interface Base
{
    
}
class A7 implements Base
{
     public A7()
     {
         
     }
}
class B7 extends A7
{
    public B7()   
    {
        
    }
}
public class InstanceOfEx {

	    public static void main(String[] args) {
	            
	         A7 classA=new A7();
	         B7 classB=new B7();
	         
	   /*      if(classA instanceof A7)
	         {
	             System.out.println("Correct");
	         }
	         else 
	             System.out.println("Wrong ");
	         if(classA instanceof Base)
	         {
	             System.out.println("Correct");
	         }
	         else 
	             System.out.println("Wrong ");
	         
	         if(classB instanceof A7)
	         {
	             System.out.println("Correct");
	         }
	         else 
	             System.out.println("Wrong ");
	         
	         if(classB instanceof Base)
	         {
	             System.out.println("Correct");
	         }
	         else 
	             System.out.println("Wrong ");*/
	         
	         if(classA instanceof B7)
	         {
	             System.out.println("Correct");
	         }
	         else 
	             System.out.println("Wrong ");
	         
	         
	    }

	}
	

