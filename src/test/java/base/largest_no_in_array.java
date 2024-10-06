package base;

import java.util.Iterator;

public class largest_no_in_array {

	public static void main(String[] args) {
		int []a= {12,23,45,12,435,65,13,455,12,455,23,45};
		int max=a[0];
		int min=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
			else if(min>a[i]){
				min=a[i];
			}
		}
		System.out.println("largest no "+max);
		System.out.println("min no "+min);
	}

}
