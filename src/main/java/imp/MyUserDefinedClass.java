package imp;

import java.util.Scanner;

class UserExc extends Exception{
	
	int age;
	UserExc(int age){
		this.age=age;
	}
	public String toString(){
		return "Age should not be -ve,Your entered age is :"+age;
	}
}
public class MyUserDefinedClass{

	public static void main(String[] args) throws Exception {

		System.out.println("Enter the Age :");
		Scanner sc=new Scanner(System.in);
		int x=Integer.parseInt(sc.next());
		if(x<0){
			throw new UserExc(x);
		}else{
			System.out.println("Your age is :" + x);
		}
	}

}


