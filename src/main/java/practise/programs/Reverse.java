package practise.programs;

public class Reverse {

	public static void main(String[] args) {
		//Array Reverse
		/*int x[]={1,4,5,3};
		System.out.println("Before :");
		for(int j=0;j<=x.length-1;j++){
			
			System.out.println(x[j]);
		}
		System.out.println("After :");
		for(int i=x.length-1;i>=0;i--){
			
			System.out.println( +x[i]);
		}*/
		
		//String Reverse
		String s="ABCDE";
		System.out.println("Before :" + s);
		System.out.println("After :");
		for(int i=s.length()-1;i>=0;i--){
			System.out.println(s.charAt(i));
		}
	}

}
