package all;

import java.util.ArrayList;
import java.util.List;

public class Even {

	public static void main(String[] args) {

		List<Integer> data=new ArrayList<Integer>(100);
		List<Integer> even=new ArrayList<Integer>(50);
		List<Integer> odd=new ArrayList<Integer>(50);
		for(int i=0;i<=100;i++){
			data.add(i);
		}
		for(Integer j:data){
			if(j%2==0){
				even.add(j);
			}else{
				odd.add(j);
			}
		}
		System.out.println("even \t odd");
		for(int k=0;k<50;k++){
			System.out.println(even.get(k)+"\t"+ odd.get(k));
		}
	}
}	
