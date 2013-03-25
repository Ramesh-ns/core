package practise.programs;

import java.util.Scanner;

public class SecondLargestInArray {


	public static void main(String[] args) {

		int secondLargest=0;
		int largest=0;
		int thirdLargest=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values : ");
		int []arr=new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		/*	if(largest<arr[i]){
				secondLargest=largest;
				largest=arr[i];
			}else
			if(secondLargest<arr[i] && largest!=arr[i]){
				secondLargest=arr[i];
			}
		}
		System.out.println("Second Largest No is : "+secondLargest);
}*/
			if (largest < arr[i]) {
			    thirdLargest = secondLargest;
			    secondLargest = largest;
			    largest = arr[i];
			} else if (secondLargest < arr[i]) {
			    thirdLargest = secondLargest;
			    secondLargest = arr[i];
			} else if (thirdLargest < arr[i]) {
			    thirdLargest = arr[i];
			}
}
		System.out.println("Third Largest No is : "+thirdLargest);
		System.out.println("Second Largest No is :"+secondLargest);
	}
}