package base;

public class charsfind {

	public static void main(String[] args) {
		String name="KaranManik77657&^!@#$%^&*()";
		char[]ch=name.toCharArray();
		int lower=0,upper=0,nums=0,schars=0;
		for(char a:ch) {
			if(Character.isUpperCase(a)) {
				upper++;
			}
			else if(Character.isLowerCase(a)) {
				lower++;
			}
			else if(Character.isDigit(a)) {
				nums++;
			}
			else {
				schars++;
			}
		}
		System.out.println("lower"+lower);
		System.out.println("upper"+upper);
		System.out.println("numbers"+nums);
		System.out.println("special chars"+schars);
	}

}
