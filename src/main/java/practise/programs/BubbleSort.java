package practise.programs;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[]={2,5,3,1,4};
		System.out.println("Before Sort :");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		/*Arrays.sort(a);
		System.out.println("After Sort :");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}*/
		
		System.out.println("After Sort :");
		for(int i=0;i<a.length;i++){
			for(int j=1;j<a.length-i;j++){
				if(a[j-1]>a[j]){
					int t=a[j-1];
					 a[j-1]=a[j];
					 a[j]=t;
					
				}
				
			}
			System.out.println(a[i]);
			
		}
	}

}
