package interview_asked;

public class cc_leaders {
	
	public static void findleader(int [] arr) {
		int len=arr.length;
		int largefromright=arr[len-1];
		System.out.print("Leaders: " + largefromright + " ");
		for(int i=len-2;i>=0;i--) {
			
			if(arr[i]>largefromright) {
				largefromright=arr[i];
				System.out.println(largefromright+" ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]={16, 17, 4, 3, 5, 2};
		findleader(arr);

	}

}
