package exam;

public class PreAndPost {

	
	public static void main(String[] args) {

		int i=6;
		int j=1;
		//System.out.println(j++);
		if(++i<5){
			System.out.println(i);
		}else if(j++<=2){
			System.out.println(j);
		}
	}

}
