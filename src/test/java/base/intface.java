package base;

import java.util.Scanner;

interface color{
	void bodycolor();
	void interior();
}

	interface bike{
		int a=34;
		void applybrake(int decrement);
		void speedup(int increment);
	}
	class honda implements bike,color{
		void blowhorn() {
			System.out.println("horn applied");}
		public void applybrake(int decrement) {
			System.out.println("brakes applied");
		}
		public void speedup(int increment) {
			System.out.println("speed increased");
			
		}
		@Override
		public void bodycolor() {
			System.out.println("choose body color");
			
				
					
		}
		@Override
		public void interior() {
			System.out.println("choose interior color");
			
				}
		}
	public class intface extends honda {
	public static void main(String[] args) {
		honda H=new honda();
		H.applybrake(2);
		//you can create properties in interface
		System.out.println(H.a);
		//you cannot modify the properties in interface
		//H.a=43;
		H.bodycolor();
		H.interior();
		Scanner sc =new Scanner(System.in);
		String color=sc.nextLine();
		System.out.println("bodycolor is "+color);
		String interior=sc.nextLine();
		System.out.println("interior is "+interior);

	}

}
