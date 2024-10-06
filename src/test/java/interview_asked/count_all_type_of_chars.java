package interview_asked;

public class count_all_type_of_chars {

	public static void main(String[] args) {
		String name="KARANmanikPatil@1993.com";
		char[] name1=name.toCharArray();
		int lower=0,upper=0,nums=0,schar=0;
		for (char name2:name1) {
			if(Character.isUpperCase(name2)) {
				upper++;
			}
			else if(Character.isLowerCase(name2)){
				lower++;
			}
			else if(Character.isDigit(name2)) {
				nums++;
			}
			else {
				schar++;
			}
		}
		System.out.println("loweer= "+lower);
		System.out.println("upper= "+upper);
		System.out.println("numeric= "+nums);
		System.out.println("specialchars="+schar);
	}

}
