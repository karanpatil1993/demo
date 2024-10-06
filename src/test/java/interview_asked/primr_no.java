package interview_asked;

public class primr_no {

	public static void main(String[] args) {
	int n=4;
	int count=0;
	for(int i=2;i<n-1;i++) {
		if(n%i==0) {
			count++;
		}
	}if(count==0) {
		System.out.println("it is a prime no");}
	else {System.out.println("not prime ss ");};
	

	}

}
