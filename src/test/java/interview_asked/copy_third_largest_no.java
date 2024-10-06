package interview_asked;

public class copy_third_largest_no {

	public static void main(String[] args) {
		int arr[]= {3,5,7,2,6,8,5,3};
		int len=arr.length;
		int temp=0;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[0]);
	}

}
