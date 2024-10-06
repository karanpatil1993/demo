package interview_asked;

public class copy_count_chars {

	public static void main(String[] args) {
		String name="KaranManikpatil@7758.";
		char [] ch=name.toCharArray();
		int lower=0,upper=0,nums=0,schar=0;
		for(char chh:ch) {
			if(Character.isUpperCase(chh)) {
				upper++;
			}
		}System.out.println("upper chars are "+upper);
	}

}
