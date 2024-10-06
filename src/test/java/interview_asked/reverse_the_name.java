package interview_asked;

public class reverse_the_name {

	public static void main(String[] args) {
		String name="vijay dinanathy chouhan";
		String rev_name="";
		String[] words=name.split(" ");
		for(String name1:words) {
			String rev="";
			for(int i=name1.length()-1;i>=0;i--) {
				rev=rev+name1.charAt(i);
				
			}rev_name=rev_name+rev+" ";
		}
				System.out.println(rev_name);
		
		
		
		
		
		
		
		

}
}

/*String name="karan Manik Patil";
//make a split
String [] words=name.split(" ");
String rev_sentence="";
for(String seperated_words:words) {
	String revword="";
	for(int i=seperated_words.length()-1;i>=0;i--) {
		
		revword=revword+seperated_words.charAt(i);
		
	}rev_sentence=rev_sentence+revword+" ";
}
System.out.println(rev_sentence);

*/