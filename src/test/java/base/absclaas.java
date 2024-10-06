package base;

abstract class parent{
	public abstract void color();
}
class child extends parent{
	public void color() {
		System.out.println("apply red color");
	}
	
	
}
public class absclaas {

	public static void main(String[] args) {
	child c=new child();
	c.color();

	}

}
