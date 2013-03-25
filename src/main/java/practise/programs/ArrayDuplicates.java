package practise.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicates {

	public static void main(String[] args) {
		//Duplicates in two Arrays
		//int a[]={1,3,7,5,4};
		//int b[]={1,3,4,9,6};
		
		//Using for loop
		
		/*for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					System.out.println(a[i]);
				}
			}
		}*/
		
		//Using for each loop
		/*for(int i:a){
			for(int j:b){
				if(i==j){
					System.out.println(i);
				}
			}
		}*/
		
		//Ascending order in two arrays
		/*int a[]={1,3,7,5,4};
		int b[]={2,3,4,9,6};
		int c[]=new int[a.length + b.length ];
		for(int i=0,j=0;i<a.length && j<b.length;i++,j++){
		
			
		}*/
		int [] input={1,3,7,3,6,2,1};
		//String[] input={"abc","bbc","abc"};
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input.length;j++){
				if(input[i]==input[j]&& i!=j){ // for String array
				//if(input[i].equals(input[j])&& i!=j){//for integer array
					System.out.println(input[i]);
				}
			}
		}
		ArrayDuplicates a=new ArrayDuplicates();
		//System.out.println(a.duplicate(input));
	}
	public boolean duplicate(int[] input){
		
		List inputList = Arrays.asList(input);
		//System.out.println(inputList);
        Set inputSet = new HashSet(inputList);
        if(inputSet.size()< inputList.size()){
        	
            return true;
        }
        /*inputList.clear();
        inputList.addAll(inputSet);
        System.out.println(inputSet);*/
        return false;
    
}
	

}
