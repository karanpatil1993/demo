package interview_asked;

import java.util.Scanner;

public class sumofarrays {

	public static void main(String[] args) {
		int []a=new int[5];
		int sum=0;
		System.out.println("enter values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			sum=a[i]+sum;
		}
		System.out.println(sum);
	}

}
