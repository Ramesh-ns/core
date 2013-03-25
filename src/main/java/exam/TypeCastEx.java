package exam;

 class Hotel {
    
  public static void book(short a) {
        System.out.print("short ");
    }
    
    public static void book(Short a) {
        System.out.print("SHORT ");
    }
    
    public static void book(Long a) {
        System.out.print("LONG ");
    }
    
    public static void book(Integer a) {
        System.out.print("Integer ");
    }
}
	
public class TypeCastEx  extends Hotel {

	TypeCastEx(int x){
		System.out.println("abc");
	}
	public static void main(String[] args) {
		short shortRoom = 1;
        Integer intRoom = 2;
        
        book(shortRoom);
       book(intRoom);//compile time error because there is no book(int) method

		
	}

}
