package interview_asked;

import java.util.HashMap;
import java.util.Map;

public class ccopy_duplicate_chars {

	public static void main(String[] args) {
		String name="katrbbbabbhhagst";
		char []ch=name.toCharArray();
		Map<Character,Integer> duplicates=new HashMap<>();
		for(char keys:ch) {
			if(duplicates.containsKey(keys)) {
				duplicates.put(keys, duplicates.get(keys)+1);
			}else {
				duplicates.put(keys, 1);
			}
		}duplicates.entrySet().removeIf(i ->i.getValue()==1);
		System.out.println(duplicates);
	}

}
