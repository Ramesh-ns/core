package imp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIterateWithDuplicates {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);

		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("d", 4);
		map2.put("b", 5);
		map2.put("c", 6);
		
		Map<String, String> map3 = new HashMap<String, String>();
		Set<String> set3 = map1.keySet();
		for(String s: set3) {
			map3.put(s, map1.get(s)+"");
		}
		// by end of this loop map3 should contain map1
		
		//now merge or insert map2 into map3
		Set<String> set22 = map2.keySet();
		for(String s: set22) {
			if(map3.containsKey(s)) {
				//merge
				Integer i2 = map2.get(s);
				String i3 = map3.get(s);
				String str = i2 + "," + i3;
				map3.put(s, str);
			} else {
				map3.put(s, map2.get(s)+"");
			}
		}

		Set<String> set33 = map3.keySet();
		for(String s: set33) {
			System.out.println(s+"="+map3.get(s));
		}
//		Set<String> set1 = map1.keySet();
//		for (String s1 : set1) {
//			Set<String> set2 = map1.keySet();
//			for (String s2 : set2) {
//				if (s1.equals(s2)) {
//					System.out.println(s1 + "=" + map1.get(s1) + ","
//							+ map2.get(s2));
//				} else {
//					System.out.println(s1 + "=" + map1.get(s1));
//					System.out.println(s2 + "=" + map2.get(s2));
//				}
//			}
//		}
		/*
		 * Iterator it=s.iterator(); while(it.hasNext()){
		 * System.out.println(it.next()+" "+map1.get()); }
		 */
	}

}
