package all;

import java.util.Scanner;

public class AssertEx {
	
	 public static void main( String args[] )
	  {
	  Scanner scanner = new Scanner( System.in );//When we enter with in range then it prints value if we enter without range it throws an exception like java.lang.AssertionError
	 
	  System.out.print( "Enter a number between 0 and 20: " );
	  int value = scanner.nextInt();
	  assert( value >= 0 && value <= 20 );// :"Invalid number: " + value;
	  
	  System.out.printf( "You have entered %d\n",value );
	 } 
	  }