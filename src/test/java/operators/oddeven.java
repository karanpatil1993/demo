package operators;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("give me the no");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
				
			}
			
		}
		
		
//		System.out.println((n%2==0)?"even":"odd");
		
		
//		if(n%2==0) {
//			System.out.println("no is even");
//		}
//		else {
//			System.out.println("odd");
//		}
		}

}
