package operators;

import java.util.Scanner;

public class digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),count=0;
		System.out.println("Enter  a  no");
		for(int i=0;i<=n;i++) {
			if(n>i) {
				n=n/10;
				count++;
			}
		}System.out.println(count);

	}

}
