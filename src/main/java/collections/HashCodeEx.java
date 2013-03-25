package collections;

import java.util.HashMap;
import java.util.Map;

class HashEx{
	String day;
	
	public HashEx(String d) {
		day=d;
	}
	@Override
	public String toString() {
		return  day ;
	}
	public int hashCode(){
		return 1;
		 
	}
	public boolean equals(Object o){
		/*HashEx he=(HashEx)o;
		boolean b=day==he.day;
		return b;*/
		return ((HashEx)o).day==this.day;
		//return true;//It doesn't give correct result
	}
	
}
public class HashCodeEx {
	public static void main(String[] args) {

//If we add references as a key in map if we not override the hasCode() & equals() methods then we get inconsistent results so in that situation we've to override hashCode() & equlas() methods
		//But if we add primitive or String as a key that time we get consistent result without overriding hashCode() & equals() methods.
		 Map<HashEx,String> map=new HashMap<HashEx,String>();
		HashEx he=new HashEx("Monday");
		HashEx he1=new HashEx("Monday");
		HashEx he2=new HashEx("Tuesday");
		map.put(he,"doLaundry");
		map.put(he1,"payBills");
		map.put(he2,"cleanAttic");
		System.out.println(map);
		System.out.println(map.size());
		
		/*Map<String,String> map=new HashMap<String, String>();
		map.put("a", "abc");
		map.put("b", "bbc");
		map.put("a", "cbc");
		System.out.println(map +" "+ map.size());*/
	}

}
