package practise.programs;

public class Comparison {

	public static void main(String[] args) {

		/*String s="Ram";
		String s1="Ram";
		if(s==s1){
			System.out.println("== true");//In this scenario both returns true even both references are different also because whenever we create object like using new operator then it returns false
		} if(s.equals(s1)){
			System.out.println("euals method true");
		}*/
		//String s=new String("Ram");
		//String s1=new String("Ram");
		//s=new String("abc");
		String s="ram";
		String s1="ram";//In this situation ram will be stored in string pool memory but not heap memory
		if(s==s1){
			System.out.println("== true");//In this it returns false bcoz it == checks references
		} if(s.equals (s1)){
			System.out.println("euals method true");
		}
	}

}
