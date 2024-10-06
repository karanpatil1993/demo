package interview_asked;

import java.util.Arrays;

public class move_0_to_left {

	public static void main(String[] args) {
		int [] nums= {1,0,2,0};
		int len=nums.length-1;
		for(int i=len;i>=0;i--) {
			if(nums[i]!=0) {
			nums[len]=nums[i];
			len--;
		}
	}
	
	for(int i=0;i<=len;i++) {
		nums[i]=0;
	}System.out.println(Arrays.toString(nums));
}}
