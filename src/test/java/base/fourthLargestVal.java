package base;

import java.util.TreeSet;

public class fourthLargestVal {

	public static void main(String[] args) {
		 int[] a = {12, 23, 45, 12, 435, 65, 13, 455, 12, 455, 23, 45,47};
		 //convert array to treeset
		 TreeSet<Integer> totree=new TreeSet<>();
		 for(int num:a) {
			 totree.add(num);
		 }
		 //find fourthlargest num
		 Integer fourthlargest=null;
		 if(totree.size()>4) {
		 Integer[] toarray=totree.toArray(new Integer[0]);
		 fourthlargest=toarray[toarray.length-4];
		 //print fourth largest value
		 if(fourthlargest!=null) {
			 System.out.println("fourthlargest no is "+fourthlargest);
			 
		 }else {System.out.println("not enough nos");}
		 }
		 }
				 
	}

