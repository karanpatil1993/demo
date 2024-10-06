package array;

import java.util.Scanner;

public class dynamicarray {

	public static void main(String[] args) {
		int size,i;
		Scanner a=new Scanner(System.in);
		System.out.println("enter your array size");
		size=a.nextInt();
		int b[]=new int[size];
		System.out.println("enter the elements in the array");
		for(i=0;i<size;i++) {
			
			b[i]=a.nextInt();
		}
		System.out.println("print the array elements");
		for(i=0;i<size;i++) {
			System.out.println(b[i]);
		}
	}

}
