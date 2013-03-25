package collections;

import java.util.Scanner;

class UserMessge extends Exception{
	int age;
	UserMessge(int age){
		this.age=age;
	}
	public String toString(){
		return "Ur entered wrong age "+age;
	}
	
}
public class UserDefinedException {

	public static void main(String[] args) throws Exception {

		System.out.println("Enter the Age :");
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		//int age=-10;
		if(age<0){
			throw new UserMessge(age);
		}else{
			System.out.println("Age is :"+age);
		}
			
	}

}
