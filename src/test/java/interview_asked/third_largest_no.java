package interview_asked;

import java.util.Arrays;

public class third_largest_no {

	public static void main(String[] args) {
		 int arr[] = {10, 20, 25, 63, 96, 57};
	    int len=arr.length;
	    int temp=0;
	    for(int i=0;i<len;i++) {
	    	for(int j=i+1;j<len;j++) {
	    		if(arr[i]<arr[j]) {
	    			 temp=arr[i];
	    			 arr[i]=arr[j];
	    			 arr[j]=temp;
	    		}
	    	}System.out.println(arr[2]);
	    }
	    	System.out.println(arr[1]+" ");
	    	}

}
