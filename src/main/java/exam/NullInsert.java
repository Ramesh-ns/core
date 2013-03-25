package exam;

public class NullInsert   {
	public void getMethod(Object o){
		System.out.println("Object method");
		}
	public void getMethod(String s){
		System.out.println("String method");
	}
	public void getMethod(StringBuffer sf){
		System.out.println("StringBuffer method");
	}
	public void getMethod(Integer i){
		System.out.println("Integer method");
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		NullInsert ni=new NullInsert();
		ni.getMethod("null");// returns String
		ni.getMethod(0);//returns integer
		//ni.getMethod(null);// compiletime error
		ni.getMethod(new NullInsert());//Returns Object method
	}

}
