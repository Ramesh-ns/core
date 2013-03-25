package imp;

import java.util.Scanner;

class User extends RuntimeException{
	User(String s){
		super(s);
	}
}
public class UserDefinedException {

	 
	public static void main(String[] args) {

		System.out.println("Enter the Age :");
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		if(age<0){
			throw new User("Please enter +ve value for age ");
		}else{
			System.out.println("Your entered age is :"+age);
		}
	}

}
