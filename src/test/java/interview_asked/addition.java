package interview_asked;

import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum=sum+r;
			n=n/10;
			
		}
System.out.println(sum);
	}

}
