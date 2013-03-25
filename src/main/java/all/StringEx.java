package all;

import java.util.HashMap;

public class StringEx 
{
	public static void main(String[] args) {
		String s="subbu";
		String s3="absub";
		
		String s1=s.substring(0,3);//substring(0,3) means starts with 0th position and ends with 2nd position
		System.out.println(s1);
		String s2=s3.substring(2, 5);
		System.out.println(s2);
		String s4=s+5;
		String s5=s+s.length();
		System.out.println(s4+" "+s5);
		System.out.println(s4.equals(s5));
		System.out.println(s4==s5);
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s1+"   "+s2);
		System.out.println(s2.equals(s1));
		System.out.println((s1+s2).equals(s2+s1));
		
	}

}
