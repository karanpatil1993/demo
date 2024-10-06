package prac1;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the no");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		switch(n)
		{
		case 0:System.out.println("it is monday");
		break;
		case 1:System.out.println("it is tuesday");
		break;
		case 2:System.out.println("it is wednesday");
		break;
		default:System.out.println("invalid input");
		}
	}

}
