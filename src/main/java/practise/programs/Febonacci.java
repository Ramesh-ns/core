package practise.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Febonacci {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Range");
		int n = Integer.parseInt(br.readLine());
		int a=0;
		int b=1;
		System.out.println(a+"\n"+b);
		while(n>=b){
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
