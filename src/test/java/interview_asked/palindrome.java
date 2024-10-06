package interview_asked;

import java.util.Arrays;

public class palindrome {
	  	public static void main(String[] args) {
		String name="madam";
		String rev="";
		int len=name.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			
		}
		if(name.equals(rev)) {
			System.out.println("String is palindrome");
		}else {System.out.println("String is not palindrome");}

	}

}
