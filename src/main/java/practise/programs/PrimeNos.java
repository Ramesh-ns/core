package practise.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNos {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Range");
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			int j;
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.println(" " + i);
			}

		}*/
		// Between range Prime Nos
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Starting position");
		int a = Integer.parseInt(br.readLine());
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Ending Position");
		int b = Integer.parseInt(br.readLine());
		for(int i=a;i<=b;i++){
			int j;
			for(j=a;j<i;j++){
				if(i%j==0){
					break;
				}
			}if(i==j){
				System.out.println(i);
			}
		}
	}

}
