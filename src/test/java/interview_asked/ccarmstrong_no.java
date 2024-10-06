package interview_asked;

import java.util.Scanner;

public class ccarmstrong_no {

	public static void main(String[] args) {
		System.out.println("enter a no");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arm=0;
		while(a>0) {
			int digit=a%10;
			 arm=(digit*digit*digit)+arm;
			a=a/10;
		}
		
	}

}
