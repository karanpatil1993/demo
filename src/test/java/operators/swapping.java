package operators;

import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a  no");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		System.out.println("val of a="+a);
		System.out.println("val of b="+b);
	
//swappingwith third variable
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println("val of a="+a);
//		System.out.println("val of b="+b);
//swapping without third variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("val of a="+a);
		System.out.println("val of b="+b);
	}

}
