package interview_asked;

public class Find_the_leaders {

	public static void findleader(int[]arr) {
		
		int len=arr.length;
		int maxfromright=arr[len-1];
		 System.out.print("Leaders: " + maxfromright + " ");
		for(int i=len-2;i>=0;i--) {
			if(arr[i]>maxfromright) {
				maxfromright=arr[i];
				System.out.println(maxfromright+" ");
			}
		}

	}
	public static void main(String []args) {
		int[] arr = {16, 17, 4, 3, 5, 2};
		findleader(arr);
	}

}
