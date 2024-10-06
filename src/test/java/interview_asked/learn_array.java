package interview_asked;

import java.util.Scanner;

public class learn_array {

	public static void main(String[] args) {
//		int arr[]= {1,0,2,43,5,6,7,8,3,2,4};
//		System.out.println(arr[3]);
		/*
		 * int a1[]=new int[6]; a1[0]=1; a1[2]=2; a1[3]=3; a1[4]=4; a1[5]=5; for(int
		 * i=0;i<a1.length;i++) { System.out.println(a1[i]); }
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a1[]=new int[size];
		for(int i=0;i<size;i++) {
			a1[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(a1[i]);
		}
		
	}

}
