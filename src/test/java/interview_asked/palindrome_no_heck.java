package interview_asked;

public class palindrome_no_heck {

	public static void main(String[] args) {
		int a=676;
		int c=a;
		int rev=0;
		while(a>0) {
			int y=a%10;
			rev=rev*10+y;
			a=a/10;
		}System.out.println(rev);
		System.out.println(a);
		if(c==rev) {
			System.out.println("no is palindrome");
		}
		else {System.out.println("it is not palindrome");}
	}

}
