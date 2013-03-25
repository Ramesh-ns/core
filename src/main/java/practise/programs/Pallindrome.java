package practise.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pallindrome {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the No");
		String input = b.readLine();
		String a=input;
		/*char[] charArray = input.toCharArray();
		
		for(int j= charArray.length-1;j>=0;j--){
			System.out.println(charArray[j]);
		}*/
		for(int i=input.length()-1;i>=0;i--){
			
			System.out.println(input.charAt(i));
		}
		//if(a==x)
		
	}
	/*int result=0; int a=n;
		while(n>0){
			int digit=n%10;
			result= result*10+digit;
			n=n/10;
			if(result==0){
				result=result+0;
			}
		}
	if(a==result){
		System.out.println("The Entered No is Pallindrome" + result);
	}else{

	System.out.println("The Entered No is Not a Pallindrome" + result);

	}}*/
}
