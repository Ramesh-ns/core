package exam;

import java.util.ArrayList;
import java.util.List;

public class EmptyInsert {
	int x;
	int y;
	EmptyInsert(int x,int y){
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {

		List<EmptyInsert> list=new ArrayList<EmptyInsert>();
		
		System.out.println(list.add(new EmptyInsert(1,5)));// returns true
		System.out.println(list);
	}

}
