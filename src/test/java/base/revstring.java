package base;

public class revstring {

	public static void main(String[] args) {
		
		String name="KaranPatil";
		String rev="";
		
		int len=name.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			
		}
		System.out.println(rev);
	}

}
