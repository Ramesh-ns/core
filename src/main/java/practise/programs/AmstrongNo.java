package practise.programs;

import java.util.Scanner;

public class AmstrongNo {

	//Amstrong number means if a no whose sum of cubes of its digit is equal to its number. For example 153 is an Armstrong number of 3 digit because 1^3+5^3+3^3 or 1+125+27=153 
	public static void main(String[] args) {

		System.out.println("Enter the No :");
		int n=new Scanner(System.in).nextInt();
		int result=0; int x=n;
		while(n>0){
			int reminder=n%10;
			result=result+reminder*reminder*reminder;
			n=n/10;
		}if(x==result){
			System.out.println("Given No is Amstrong :"+result);
		}else{
			System.out.println("Given No is not an Amstrong :"+result);
		}
	}

}
