package interview_asked;

import java.util.Scanner;

public class copy_arry {

	public static void main(String[] args) {
		int [] a=new int[5];
		int [] b=new int[5];
		System.out.println("Enter the ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			b[i]=a[i];
		}
		for(int i=0;i<5;i++) {
			System.out.print(a[i]);
			
		}for(int i=0;i<5;i++) {
		
			System.out.print(b[i]);
		}

	}

}
