package important;

public class HashCodeEx {

/*	public int test(){
		return 4;
		
	}*/
	
	public int hashCode(){
		
		return 12;
	}
 
	public static void main(String[] args) {
		HashCodeEx h=new HashCodeEx();
		HashCodeEx h1=new HashCodeEx();
		System.out.println(h.hashCode());
		System.out.println(h1.hashCode());
		System.out.println(h.equals(h1));
		System.out.println(h==h1);
		//System.out.println(h.test()+" "+h1.test());
		
	}

}
