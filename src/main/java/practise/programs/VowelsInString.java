package practise.programs;

public class VowelsInString {

	public static void main(String[] args) {

		String s="This is Ramesh";
		char a[]={'a','e','i','o','u'};
		for(int i=0;i<s.length();i++){
			for(int j=0;j<a.length;j++){
				if(s.charAt(i)==a[j]){
					System.out.println(s.charAt(i));
				}
			}
		}
		
	}

}
