package practice;

public class count_type_of_chars {

	public static void main(String[] args) {
		String a="KJGUYBIUNIN7657667KBKJSANJkjnskjnjn&^R%^$";
		int nums=0,uppercase=0,lowercase=0,schars=0;
		char [] aa=a.toCharArray();
		for(char b:aa) {
			if(Character.isUpperCase(b)) {
				uppercase++;
			}
			else if(Character.isLowerCase(b)) {
				lowercase++;	
			}
			else if(Character.isDigit(b)) {
				nums++;
			}
			else {
				schars++;
			}
		}
System.out.println(nums);
System.out.println(uppercase);
System.out.println(lowercase);
System.out.println(schars);


	}

}
