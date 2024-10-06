package base;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class remove_duplicate_from_array {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6,7,8,9,0,87,2,4,6};
		
		Set<Integer> set1=new HashSet<>();
		for(int arr2:arr1) {
			set1.add(arr2);}
		int []unique=new int[set1.size()];
		int index=0;
		for (int num:set1) {
			unique[index++]=num;
			
		}
			System.out.println(Arrays.toString(unique));	
		}
		
}
