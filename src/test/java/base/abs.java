package base;

abstract class animal{
	animal(){
		System.out.println("all animals data is displayed here");
	}
	public abstract void sound();
}
class dog{
	dog()
	{
		super();
	}
	public void sound() {
		System.out.println("dog is barking");
	}
}
class cat{
	cat(){
		super();
	}
	public void sound() {
		System.out.println("cat is mewoing");
	
}}

class abs{	
	public static void main(String []args) {
	dog d=new dog();
	cat c=new cat();
	d.sound();
	c.sound();
	} 
}