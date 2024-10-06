package interview_asked;

import java.util.Scanner;

public class simple_prime_no {

	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),count=0;
		
		for(int i=10;i<=20;i++) {
			if(n%i==0) {
				count++;
			}
			if(count==2) {
				System.out.println("it is prime no"+i);
			}
			else {System.out.println("not a prime no");}
		}
		}
		

}
