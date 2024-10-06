package base;

public class sepration {

	public static void main(String[] args) {
		String sep="jhgsaJHGjh^%$7645";
		char[] ch=sep.toCharArray();
		int lower=0,upper=0,nums=0,schar=0;
		for(char c:ch) {
			if(Character.isLowerCase(c)) {
				lower++;
			}
			else if(Character.isUpperCase(c)){
				upper++;
			}
			
		}System.out.println(lower);
		System.out.println(upper); 

	}

}
