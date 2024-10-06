package practice;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		int[]arr= {2,4,6,8,10,11,3,5,7};
		int len=arr.length;
		for(int i=0;i<0;i++) {
			for(int j=i+1;j<=0;j++) {
				if(arr [i]>arr[j]) {
					int digit=arr[i];
					arr[i]=arr[j];
					arr[j]=digit;
				}
			}
			
		}System.out.println(Arrays.toString(arr));
		
	}}
