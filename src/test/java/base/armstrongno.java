package base;

import java.util.Scanner;

public class armstrongno {
	public static void main(String[]args) {
		//Scanner sc=new Scanner(System.in);
			//int no=	sc.nextInt();
		int no=322;	
		int r;
			int c=no;
		while(no>0) {
			r=no%10;
			no=(r*r*r)+no;
			no=no/10;
		}
		if(c==no) {
			System.out.println("arm npo");
					}
		else {System.out.println("not");}
	}

}
