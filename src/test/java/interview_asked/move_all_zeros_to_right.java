package interview_asked;

import java.util.Arrays;

public class move_all_zeros_to_right {

	public static void main(String[] args) {
		int [] nums= {1,2,3,4,5,6,0,0,0,8,0,0,0};
		int len=nums.length;
		int position=0;
		for(int i=0;i<len;i++) {
			if(nums[i]!=0) {
				nums[position]=nums[i];
				position++;
			}
		}for(int i=position;i<len;i++) {
			nums[i]=0;
		}System.out.println(Arrays.toString(nums));

	}

}
