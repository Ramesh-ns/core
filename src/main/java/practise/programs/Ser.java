package practise.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ser implements Serializable {
	public int empNo;
	


	public String empName;
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Ser [empNo=" + empNo + ", empName=" + empName + "]";
	}


	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileOutputStream fo=new FileOutputStream("f1.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fo);
		Ser e=new Ser();
		e.setEmpNo(1);
		e.setEmpName("abc");
		oos.writeObject(e);
		FileInputStream fis=new FileInputStream("f1.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		 e=(Ser)ois.readObject();
		 System.out.println(e);
		 //System.out.println(ois.readObject());
	}

}
