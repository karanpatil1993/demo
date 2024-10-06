package practice;

import java.util.Arrays;

public class largestnoinarray {

	public static void main(String[] args) {
		int arr[]= {1,43,6,23,75,32,5};
		int temp=0;
		int len=arr.length;
//		int largest=arr[0];
//		for(int arr1:arr) {
//			if(arr1>largest) {
//				largest=arr1;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
System.out.println(Arrays.toString(arr));
	}

}
