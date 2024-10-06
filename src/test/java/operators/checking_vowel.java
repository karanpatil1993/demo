package operators;

import java.util.Scanner;

public class checking_vowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the char");
		char ch;
		ch=sc.next().charAt(0);
		if(ch =='a' || ch== 'e' || ch=='i' || ch=='o' || ch=='u'||
				ch =='A' || ch== 'E' || ch=='I' || ch=='O' || ch=='U'	) {
			System.out.println("it is the vowel");
		}else {
			System.out.println("not a vowel");
		}
		

	}

}
