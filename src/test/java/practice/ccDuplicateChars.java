package practice;

public class ccDuplicateChars {

	public static void main(String[] args) {
		String name="Karan";
		int count= name.length()-name.replace("a", "").length();
		System.out.println(count);
	}

}
