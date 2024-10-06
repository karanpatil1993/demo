package interview_asked;

public class copy_prime_no {

	public static void main(String[] args) {
		int no=6;
		int count=0;
		for(int i=2;i<no-1;i++) {
			if(no%i==0) {
				count++;
			}
		}
if(count==0) {
	System.out.println("it is a prime no");
}else {
	System.out.println("not a prime no");
};
	}
	

}
