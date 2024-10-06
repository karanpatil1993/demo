package practice;

public class duplicate_char_count {

	public static void main(String[] args) {
		String name="karan";
		int count =name.length()-name.replace("a", "").length();
		System.out.println(count);

	}

}
