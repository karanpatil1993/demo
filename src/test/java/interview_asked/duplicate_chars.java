package interview_asked;

import java.util.HashMap;
import java.util.Map;

public class duplicate_chars {

	public static void main(String[] args) {

		Map<Character,Integer> duplicate=new HashMap<>();
		String name="karanpatofioojqajbbbbahfffattyyqqil";
		char [] charr=name.toCharArray();
		for(char keys:charr) {
			if(duplicate.containsKey(keys)) {
				duplicate.put(keys, duplicate.get(keys)+1);
			}else {
				duplicate.put(keys, 1);
			}
		}   
		duplicate.entrySet().removeIf(i -> i.getValue()==1);
		
System.out.println(duplicate);
	}

}
