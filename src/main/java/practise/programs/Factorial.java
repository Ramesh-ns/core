package practise.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Factorial {
	
	public static int fact(int x){
		if(x<=1){
			return 1;
		}
		return x*fact(x-1);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println("Enter the No for Factorial :");
		/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());*/
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.next());
		/* int result=1;
		while(n>0){
			 result=result*n;
			 n=n-1;
		}
		System.out.println("The Factorial of a given No is: "+result);
*/	
		
	int result=fact(n);
	System.out.println("The Factorial of a No is :"+ result);
		}

}
