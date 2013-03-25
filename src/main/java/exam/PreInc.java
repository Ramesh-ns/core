package exam;

public class PreInc {

	public static void main(String[] args) {

		int i=0;
		int j=10;
		do{
			++i;
			j--;
			System.out.println(i+" "+j);
			//System.out.println(++i+" "+j--);
			
		}while(i<j);
		System.out.println(i+" "+j);
	}

}
