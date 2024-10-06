package interview_asked;

import java.util.HashMap;

public class duplicate_string {

	public static void main(String[] args) {
		String fruit="i love banana love apple";
		String[] word=fruit.split(" ");
		HashMap<String,Integer> wordcount=new HashMap<>();
		
		for(String words:word) {
			wordcount.put(words,wordcount.getOrDefault(words, 0)+1);
		}
		for(String words:wordcount.keySet()) {
			if(wordcount.get(words)>1) {
				System.out.println(words+" occurance "+wordcount.get(words));
		}
		}

	}

}
