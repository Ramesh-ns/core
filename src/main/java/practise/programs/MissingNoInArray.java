package practise.programs;

public class MissingNoInArray {

	public static void main(String[] args) {

		int a[]={1,2,3,5};
		int asum=0,sum=0;
		for(int i=0;i<=5;i++){
			sum=sum+i;
		}
		for(int i=0;i<a.length;i++){
			asum=asum+a[i];
			
			
		}
		int miss=sum-asum;
		System.out.println(miss);
}
}