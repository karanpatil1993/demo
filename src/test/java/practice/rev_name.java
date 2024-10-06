package practice;

public class rev_name {

	public static void main(String[] args) {
		String name="karan Manik Patil";
		String rev_name="";
	String[]name1=name.split(" ");
		for(String name2:name1){
			String rev="";
			for(int i=name2.length()-1;i>=0;i--) {
				
				rev=rev+name2.charAt(i);
				
			}rev_name=rev_name+rev+" ";
					
			
		}System.out.println(rev_name);
		

	}

}
