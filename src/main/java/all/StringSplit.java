package all;

import java.util.StringTokenizer;


public class StringSplit {

	
	public static void main(String[] args) {

		
		/*int [] a={2,5,6};
		System.out.println(a); */// with out iterating over array if we print directly then we get object not the values
		String s="abc:bbc.cbc:dbc";
		String[] split=s.split(":");//split divide the String and removes that value and size after split increase by one which we use the value for split appeares in the String
		//if we want to split by . or | then we've to use before \\ other wise we won't get the String if we use // symbol then it can't split 
		
		//System.out.println(split);
		System.out.println(split.length);
		for(String s1:split){
			System.out.println(s1);
		}
		//Using StringTokenizer also we can split the String
		/*StringTokenizer st=new StringTokenizer(s,":");
		while(st.hasMoreElements()){
			System.out.println(st.nextToken());
		}*/
	}

}
