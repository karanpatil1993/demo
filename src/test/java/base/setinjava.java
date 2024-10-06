package base;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setinjava {

	public static void main(String []args){
		Set<String> set=new HashSet<>();
		set.add("karan");
		set.add("manik");
		set.add("Patil");
		
		Iterator <String> iterator=set.iterator();
		while (iterator.hasNext()) {
			String ele=iterator.next();
			System.out.println(ele);
		}
		
		
	}
}
