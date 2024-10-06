package operators;

import java.util.Scanner;

public class taxation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a  no");
		int income=sc.nextInt(),tax=0;
		if(income<100000) {
			System.out.println("no tax");
		}
		if(income>100000 && income<200000) {
			System.out.println("you are in tax bracket of 18% and your tax amount is="+(income*0.18));
		}
		
		if(income>200000) {
			System.out.println("you are in tax bracket of 28% and your tax amount is="+(income*0.28));
		}
	
	}
	
	

}
