package interview_asked;

public class copy_rev_name {

	public static void main(String[] args) {
		String name="karan manik patiil";
		String [] word=name.split(" ");
		String rev_name="";
		for(String word1:word) {
			String rev="";
			for(int i=word1.length()-1;i>=0;i--) {
				rev=rev+word1.charAt(i);
			}rev_name=rev_name+rev+" ";
		}
		System.out.println(rev_name);	

	}

}
