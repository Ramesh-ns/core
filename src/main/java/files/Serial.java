package files;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//import files.Dog.Collar;

//In FileOutputStream methods throws IOException and FileInputStream throws IOException & ClassNotFoundException

 class Dog implements Serializable{
	private String dogSize;
	//private Collar theCollar;
	//public Dog(int dogSize, Collar theCollar) {
	public Dog(String dogSize){
	super();
		this.dogSize = dogSize;
		//this.theCollar = theCollar;
	}
	/*public Collar getCollar(){
		return theCollar;
	}*/
	
	public String toString(){
		return dogSize;
	}
	class Collar implements Serializable{
		private int collarSize;
		public Collar(int collarSize){
			this.collarSize=collarSize;
		}
		public int getCollarSize(){
			return collarSize;
		}
	}
	
}

public class Serial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//Collar c=new Collar(3);
		Dog d=new Dog("5");
		//System.out.println("before:collar size is" + d.getCollar().getCollarSize());
		FileOutputStream fos=new FileOutputStream("testSer.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.close();
		FileInputStream fis=new FileInputStream("testSer.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		d=(Dog)ois.readObject();
		System.out.println(d);
		oos.close();
		
		
		
	}

}





/*
class Emp implements Serializable{
	String empName;
	int empNo;
	int empSal;
	
	Emp(String empName,int empNo,int empSal){
		this.empName=empName;
		this.empNo=empNo;
		this.empSal=empSal;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public String toString(){
		return empName+" "+empNo+" "+empSal;
	}
	
}

public class Serial {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Emp e=new Emp("abc",24,2900);
		e=new Emp("bbc",25,34000);
		Emp e=new Emp();
		e.setEmpName("abc");
		e.setEmpNo(24);
		e.setEmpSal(29000);
		
		e.setEmpNo(25);
		e.setEmpName("bbc");
		e.setEmpSal(19000);
		
		FileOutputStream fos=new FileOutputStream("file.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		
		FileInputStream fis=new FileInputStream("file.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		  e=(Emp)ois.readObject();
		System.out.println(e);
		ois.close();
		
	}
}*/