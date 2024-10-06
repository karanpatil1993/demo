package practice;

import java.util.Arrays;

public class zero_to_left {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,0,6,0,3,0};
		int len=arr.length-1;
		for(int i=len;i>=0;i--) 
		{
			if(arr[i]!=0) 
			{
				arr[len]=arr[i];
				len--;
			}
		}
		System.out.println(len);
		for(int i=0;i<=len;i++) {
		arr[i]=0;	
		}System.out.println(Arrays.toString(arr));
	}

}
