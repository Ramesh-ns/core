package all;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

	public static void main(String[] args) {

		List<Integer> data = new ArrayList<Integer>(100);
		
		List<Integer> evenData = new ArrayList<Integer>(50);
		
		List<Integer> oddData = new ArrayList<Integer>(50);
		
		for(int i=1;i<=100;i++){
			data.add(new Integer(i));
		}
		
		for(Integer i : data){
			if(0 == i%2){
				evenData.add(i);
			}
			else {
				oddData.add(i);
			}
		}
		
		System.out.println("EVEN\tODD");
		
		for(int i=0;i<50;i++){
			
			System.out.println(evenData.get(i) + "\t" + oddData.get(i));
		}
		
		
	}
}
