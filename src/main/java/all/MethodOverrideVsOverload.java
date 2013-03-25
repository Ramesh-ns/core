package all;

public class MethodOverrideVsOverload {
	public boolean equals( MethodOverrideVsOverload other ) {
	     System.out.println("MethodOverrideVsOverload equals method reached" );
	     return false;//If we put return value as false then it won't go in to the next step. Here execution will be stop
	   }

	 public static void main(String[] args) {
	  Object o1 = new MethodOverrideVsOverload();
	  Object o2 = new MethodOverrideVsOverload();
	  
	  MethodOverrideVsOverload o3 = new MethodOverrideVsOverload();
	  MethodOverrideVsOverload o4 = new MethodOverrideVsOverload();
	  
	  if(o1.equals(o2)){
		  //if(o1==o2){
	   System.out.println("objects o1 and o2 are equal");
	  }
	  
	  if(o3.equals(o4)){
		 // if(o3==o4){
	   System.out.println("objects o3 and o4 are equal");
	  }
	 }
}
