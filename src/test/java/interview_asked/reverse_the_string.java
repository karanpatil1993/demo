package interview_asked;

public class reverse_the_string {

	public static void main(String[] args) {
		String name="karanmanikpatil";
		String rev="";
		int len=name.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);

	}

}