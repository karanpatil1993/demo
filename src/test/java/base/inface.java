package base;

import java.util.Scanner;

interface client{
	void input();
	void output();
}


class dev implements client{
	String name;
	int sal;
	public void input() {
		Scanner c=new Scanner(System.in);
		System.out.println("enter ur name");
		name =c.nextLine();
		
		System.out.println("enter ur sal");
		sal =c.nextInt();
	}
	public void output() {
		System.out.println(name+" "+sal);
	}

}
public class inface {

	public static void main(String[] args) {
		client c=new dev();
		
		c.input();
		c.output();

	}

}
