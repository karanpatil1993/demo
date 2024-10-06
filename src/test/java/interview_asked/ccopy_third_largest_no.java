package interview_asked;

public class ccopy_third_largest_no {

	public static void main(String[] args) {
	int []arr= {2,4,5,6,73,32,};
	int unit=0;
	int len=arr.length;
	
	for (int i=0;i<len;i++) {
		for(int j=i+1;j<len;j++ ) {
			if(arr[i]<arr[j]) {
				unit=arr[i];
				arr[i]=arr[j];
				arr[j]=unit;
			}
		}
	}
System.out.println(arr[0]);
	}

}
