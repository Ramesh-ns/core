package practise.programs;

import java.util.ArrayList;

public class EvenOdd {

	public static void main(String[] args) {

		ArrayList<Integer> data=new ArrayList<Integer>(100);
		ArrayList<Integer> evenData=new ArrayList<Integer>(50);
		ArrayList<Integer> oddData=new ArrayList<Integer>(50);
		for(int i=1;i<=100;i++){
			data.add(i);
		}
		for(Integer i:data){
			if(i%2==0){
				evenData.add(i);
			}else{
				oddData.add(i);
			}
			System.out.println("EVEN \t ODD");
				
			}
		for(int j=1;j<50;j++){
			System.out.println(evenData.get(j)+"\t"+oddData.get(j));
		}
	}

}
