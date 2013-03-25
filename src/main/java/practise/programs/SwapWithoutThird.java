package practise.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapWithoutThird {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Before Swaping x :");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());
		System.out.println("Before Swaping y:");
		int y=Integer.parseInt(br.readLine());
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swaping x :" +x);
		System.out.println("After Swaping y :" +y);

	}

}
