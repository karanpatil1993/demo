package practice;

public class rev_no {

	public static void main(String[] args) {
		int a=1234;
		int reversed=0;
		while(a>0) {
			int digit=a%10;
			reversed=reversed*10+digit;
			a=a/10;
		}System.out.println(reversed);
	}

}
