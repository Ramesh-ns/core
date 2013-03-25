package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

 

public class DupHash {

	public static void main(String[] args) {

		HashMap<String,Integer> map1=new HashMap<String, Integer>();
		map1.put("a",1);
		map1.put("b",2);
		map1.put("c",3);
		
		HashMap<String,Integer> map2=new HashMap<String, Integer>();
		map2.put("d",5);
		map2.put("b",6);
		map2.put("e",7);
		HashMap<String,String> map3=new HashMap<String, String>();
		
		//First Map itearation
		Set<String> s1=map1.keySet();
		for(String m1:s1){
			//System.out.println(m1+" "+map1.get(m1));
			map3.put(m1,map1.get(m1)+"");
		}
		
		//Second map iteration
		
		Set<String> s2=map2.keySet();
		
		for(String m2:s2){
			if(map3.containsKey(m2)){
				Integer i=map2.get(m2);
				String i1=map3.get(m2);
				String i3=i+","+i1;
				map3.put(m2,i3);
				//System.out.println(m2+"="+i3);
			}else{
				map3.put(m2,map2.get(m2)+"");
				//System.out.println(m2+"="+map3.get(m2));
			}
		}
		Set s3=map3.entrySet();
		Iterator itr=s3.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		/*Set<String> s3=map3.keySet();
		for(String m3:s3){
			System.out.println(m3+"="+map3.get(m3));
		}*/
		
	}

}
