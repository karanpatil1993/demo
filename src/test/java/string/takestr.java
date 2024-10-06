package string;

import java.util.Scanner;

public class takestr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your first name");
		String a=sc.nextLine();
		System.out.println("enter your lastname");
		String b=sc.nextLine();
		
	
		System.out.println(" first name is"+a);
		
		System.out.println(" last name is"+b);
		System.out.println(a.length());
		System.out.println(b.length());
		String full=a+b;
		for(int i=0;i<=full.length();i++) {
			System.out.println(full.charAt(i));
		}
		
	
	}

}
