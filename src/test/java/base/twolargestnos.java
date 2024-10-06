package base;

public class twolargestnos {

	public static void main(String[] args) {
		int []a= {12,23,45,12,435,65,13,455,12,455,23,45};

		int flarge=0;
		int slarge=0;
		for(int i=0;i<a.length;i++) {
			if(flarge<a[i]) {
				slarge=flarge;
				flarge=	a[i];
			}else if(slarge<a[i]){
				slarge=a[i];
			}}System.out.println("first largest num= "+flarge+"second largest num= "+slarge);
			
	}

}
/*
 package base;

import java.util.TreeSet;

public class fourthLargestVal {

	public static void main(String[] args) {
		 int[] a = {12, 23, 45, 12, 435, 65, 13, 455, 12, 455, 23, 45};
		 
		 //covert array to treeset to remove duplicate values and sort it 
		 
		 TreeSet<Integer>sortd=new TreeSet<>();
		 for(int num:a) {
			 sortd.add(num);
		 }
		 Integer fourthlargest=null;
		 //find the fourth largest number
		 if(sortd.size()>4) {
			 Integer[] sortarray=sortd.toArray(new Integer[0]);
			fourthlargest=sortarray[sortarray.length-4]; 
		 }
		 //print the result
		 if(fourthlargest != null) {
			 System.out.println("fourth largets noi is "+fourthlargest);
			  }else {System.out.println("not enough nos are present");}
		 

	}

}
*/