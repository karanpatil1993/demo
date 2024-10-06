package interview_asked;

import java.util.HashMap;
import java.util.Map;

public class copy_duplicate_chars {

	public static void main(String[] args) {
		String name="kkaarrraahhhjjjgg";
		char []charr=name.toCharArray();
		Map<Character,Integer> duplicates=new HashMap<>();
		for(char keys:charr) {
			if(duplicates.containsKey(keys)) {
				duplicates.put(keys, duplicates.get(keys)+1);
			}else {
				duplicates.put(keys, 1);
			}
		}duplicates.entrySet().removeIf(i ->i.getValue()==1);
		System.out.println(duplicates);	
	}

}
