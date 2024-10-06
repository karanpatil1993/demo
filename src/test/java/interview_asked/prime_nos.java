package interview_asked;

public class prime_nos {

	public static void main(String[] args) {
		int a=2;
		int b=100;
		for(int i=a;i<=b;i++) {
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					break;
				}
				if(i==j) {
					System.out.println(j);
				}
			}
		}
				
	}

}
