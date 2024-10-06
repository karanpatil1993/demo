package interview_asked;

import java.util.Scanner;

public class avgOfArray {

	public static void main(String[] args) {
		int[]a=new int[5];
		int sum=0,b=0;
		System.out.println("enter the nos");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			sum=a[i]+sum;
			b++;
		}System.out.println(sum/b);
	}

}
