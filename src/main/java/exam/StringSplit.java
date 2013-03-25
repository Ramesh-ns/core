package exam;

public class StringSplit {

	public static void main(String[] args) {

		String s="s1a2s3";
		String[] s1=s.split("\\d");
		System.out.println(s1);
		System.out.println(s);
		for(String s2:s1){
		System.out.println(s2);
		}
	}

}
